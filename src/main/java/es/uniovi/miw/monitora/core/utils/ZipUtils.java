package es.uniovi.miw.monitora.core.utils;

import java.io.*;
import java.util.zip.*;

public final class ZipUtils {

	public static void zipFolder(final File folder, final File zipFile)
			throws IOException {
		zipFolder(folder, new FileOutputStream(zipFile));
	}

	public static void zipFolder(final File folder,
			final OutputStream outputStream) throws IOException {
		try (ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream)) {
			processFolder(folder, zipOutputStream,
					folder.getPath().length() + 1);
		}
	}

	private static void processFolder(final File folder,
			final ZipOutputStream zipOutputStream, final int prefixLength)
			throws IOException {
		for (final File file : folder.listFiles()) {
			if (file.isFile()) {
				final ZipEntry zipEntry = new ZipEntry(file.getPath()
						.substring(prefixLength));
				zipOutputStream.putNextEntry(zipEntry);
				try (FileInputStream inputStream = new FileInputStream(file)) {
					copy(inputStream, zipOutputStream);
				}
				zipOutputStream.closeEntry();
			} else if (file.isDirectory()) {
				processFolder(file, zipOutputStream, prefixLength);
			}
		}
	}

	private static void copy(FileInputStream input, ZipOutputStream output)
			throws IOException {
		byte[] buffer = new byte[1024 * 4];
		int read = 0;
		while ((read = input.read(buffer)) != -1) {
			output.write(buffer, 0, read);
		}
	}

	public static void unZipIt(String zipFile, String outputFolder) throws IOException {
		byte[] buffer = new byte[1024];

		// create output directory is not exists
		File folder = new File(outputFolder);
		if (!folder.exists()) {
			folder.mkdir();
		}

		// get the zip file content
		ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFile));
		// get the zipped file list entry
		ZipEntry ze = zis.getNextEntry();

		while (ze != null) {

			String fileName = ze.getName();
			File newFile = new File(outputFolder + File.separator + fileName);

			// create all non exists folders
			// else you will hit FileNotFoundException for compressed folder
			new File(newFile.getParent()).mkdirs();

			FileOutputStream fos = new FileOutputStream(newFile);

			int len;
			while ((len = zis.read(buffer)) > 0) {
				fos.write(buffer, 0, len);
			}

			fos.close();
			ze = zis.getNextEntry();
		}

		zis.closeEntry();
		zis.close();
	}
}
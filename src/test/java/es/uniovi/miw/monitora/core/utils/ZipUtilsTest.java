package es.uniovi.miw.monitora.core.utils;

import static org.junit.Assert.assertTrue;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZipUtilsTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		Path dir = Paths.get("/Users/diesire/tmp/snapshot-950-35-68");
		Path zfile = dir.getParent().resolve("snapshot-950-35-68.zip");
		try {
			FileOutputStream os = new FileOutputStream(zfile.toFile());
			ZipUtils.zipFolder(dir.toFile(), os);
			os.close();
		} catch (IOException e) {
			throw new Exception(e);
		}

		assertTrue(Files.isReadable(zfile));
	}

}

package com.zxl.designpattern.decoratorpattern;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class InputTest {
	@Test
	public void test() throws IOException {
		int c;
		InputStream in = new LowerCaseInputStream(new BufferedInputStream(
				new FileInputStream(InputTest.class.getClassLoader().getResource("test.txt").getPath())));
		while ((c = in.read()) >= 0) {
			System.out.print((char) c);
		}
		in.close();
	}
}

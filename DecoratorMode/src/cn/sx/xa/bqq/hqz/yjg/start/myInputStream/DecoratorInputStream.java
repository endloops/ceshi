package cn.sx.xa.bqq.hqz.yjg.start.myInputStream;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DecoratorInputStream extends FilterInputStream{

	public DecoratorInputStream(InputStream fdObj) {
		super(fdObj);
	}
	@Override
	public int read() throws IOException {
		int c = super.read();
		return (c==-1?c:Character.toLowerCase((char)c));
	}
	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		int c = super.read(b, off, len);
		for (int i = off; i < off+c; i++) {
			b[i] = (byte) Character.toLowerCase((char)b[i]);
		}
		return c;
	}
	public static void main(String[] args) throws IOException {
		File f = new File("aaa.txt");
		System.out.println(f.getAbsolutePath());
		int c;
		InputStream in = new DecoratorInputStream(new FileInputStream("src/aaa.txt"));
		byte[] ss = new byte[in.available()];
		
		while ((c = in.read(ss))!=-1) {
			System.out.println("kaishile"+new String(ss)+"meile");
		}
		in.close();
	}
}

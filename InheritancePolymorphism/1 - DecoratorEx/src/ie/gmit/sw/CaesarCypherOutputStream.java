package ie.gmit.sw;

import java.io.*;

public class CaesarCypherOutputStream extends FilterOutputStream {
	private byte key = 0;
	
	protected CaesarCypherOutputStream(OutputStream out, byte key) {
		super(out);
		this.key = key;
	}

	@Override
	public void write(int b) throws IOException {
		if(b != -1) b += key;
		super.write(b);
	}

	@Override
	public void write(byte[] b) throws IOException {
		this.write(b, 0, b.length);
	}

	@Override
	public void write(byte[] b, int off, int len) throws IOException {
		for(int i = off; i < b.length; i++) {
			write(b[i]);
		}
	}
	


}

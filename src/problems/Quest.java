package problems;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Quest {
	static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String readLine() throws IOException {
			byte[] buf = new byte[64]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Reader s = new Reader();
		String sizeTemp = s.readLine();
		int size = Integer.parseInt(sizeTemp.trim());
		int[] array = new int[size];
		int i = 0;
		String input = s.readLine();
		StringTokenizer st = new StringTokenizer(input);
		while (st.hasMoreTokens()) {
			array[i++] = Integer.parseInt(st.nextToken());
		}
		int cntr = 0, temp = 0;
		List<Integer> subArray = new ArrayList<Integer>();

		for (i = 0; i < array.length; i++)
			for (int j = i; j < array.length; j++) {
				for (int k = i; k <= j; k++)
					temp += array[k];
				subArray.add(temp);
				temp = 0;
			}

		for (Integer value : subArray)
			if (Math.sqrt(value) == Math.floor(Math.sqrt(value)))
				cntr++;
		System.out.println(cntr);
	}

}

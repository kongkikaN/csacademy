package bitCount;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    
    public static void main (String[] args) throws java.lang.Exception {
        InputReader in = new InputReader(System.in);
        int x = in.nextInt();
        System.out.println(bitcount(x));
    }
    
    static int bitcount(int x) {
        String str = Integer.toBinaryString(x);
		int counter = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '1') {
				counter++;
			}
		}
		return counter;
    }
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new UnknownError();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int peek() {
            if (numChars == -1)
                return -1;
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    return -1;
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar];
        }

        public void skip(int x) {
            while (x-- > 0)
                read();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public String nextString() {
            return next();
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));

            return res.toString();
        }

        public String nextLine() {
            StringBuffer buf = new StringBuffer();
            int c = read();
            while (c != '\n' && c != -1) {
                if (c != '\r')
                    buf.appendCodePoint(c);
                c = read();
            }
            return buf.toString();
        }

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public boolean hasNext() {
            int value;
            while (isSpaceChar(value = peek()) && value != -1)
                read();
            return value != -1;
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}


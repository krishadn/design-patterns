package decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = in.read();  // uses the decorated component behavior
        return (c == -1 ? c : Character.toLowerCase((char) c)); // adds new behavior by turning the char into lowercase
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len); // uses the decorated component behavior
        for (int i = offset; i < offset+result; i++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]); // adds new behavior by turning the char into lowercase
        }
        return result;
    }



}

package StructuralPatterns.DecoratorPattern.Example2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException{
        int c = in.read();
        return c==-1?c:Character.toLowerCase((char) c);
    }

    public int read(byte[] bytes, int offset, int length) throws IOException{
        int result = in.read(bytes,offset,length);

        for(int i = offset; i<offset + result; i++){
            bytes[i] = (byte) Character.toLowerCase((char) bytes[i]);
        }

        return result;
    }
}

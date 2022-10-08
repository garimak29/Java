package LLD.DecoratorPattern.CustomIODecorator;

import java.io.*;

public class ConvertToLowerCase extends FilterInputStream {


    public ConvertToLowerCase(InputStream in)  {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = in.read();
        return (c == -1 ? c : Character.toLowerCase(c));
    }

    public int read(byte[] b, int offset, int len ) throws IOException{
        int result = in.read(b,offset,len);
        for(int i =offset; i<offset+result;i++){
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return  result;
    }

}

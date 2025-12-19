import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NonBlockingIOExample {
    static void main(String[] args) {

        //Draining of buffer

        try {
            FileInputStream fin = new FileInputStream("/home/jiban/Coding/file1.txt");
            FileChannel readChannel = fin.getChannel();
            ByteBuffer readbuffer = ByteBuffer.allocate(1024);
            int result = readChannel.read(readbuffer);
            System.out.println("File read sucessfully: " + result);

            FileOutputStream fout = new FileOutputStream("/home/jiban/Coding/file1.txt");
            FileChannel writeChannel = fout.getChannel();
            ByteBuffer writebuffer = ByteBuffer.allocate(1024);
            String message = "Hello Everyone, how are you?";
            writebuffer.put(message.getBytes());

            //Flipping
            writebuffer.flip();
            writeChannel.write(writebuffer);
            System.out.println("File write sucessfully: " + writebuffer);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

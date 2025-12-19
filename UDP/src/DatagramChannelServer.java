import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class DatagramChannelServer  {
    static void main(String[] args) {
        try{
            DatagramChannel server = DatagramChannel.open();
            InetSocketAddress addr = new InetSocketAddress("localhost",8989);
            server.bind(addr);
            System.out.println("Srver Started: "+addr);

            ByteBuffer buffer = ByteBuffer.allocate(1024);

            SocketAddress remoteAdd = server.receive(buffer);

            buffer.flip();
            int limits = buffer.limit();
            byte[] data = new byte[limits];
            buffer.get(data,0,limits);

            String msg = new String(data);
            System.out.println("Client at: "+remoteAdd+" sent: "+msg);
            server.send(buffer,remoteAdd);
            if(server.isOpen()) server.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

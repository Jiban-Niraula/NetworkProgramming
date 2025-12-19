import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
    public static void main(String[] args) throws IOException {
        try{
            //1. Create datagram socket
            DatagramSocket socket = new DatagramSocket(13);
            System.out.println("Server is listening on "+socket.getPort());

            //2. Receive request from client
            byte [] buffer = new byte[256];
            DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
            socket.receive(packet);

            //3. Prepare message for client
            InetAddress address = packet.getAddress();
            int port = packet.getPort();
            String s = "Hello Client, How are you? ";
            buffer = s.getBytes();

            //4. Send message to client

            packet = new DatagramPacket(buffer,buffer.length,address,port);
            socket.send(packet);

            //5. Close Socket
//            socket.close();
        }catch(Exception e){

        }
    }
}

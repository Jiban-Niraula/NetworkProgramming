import java.net.*;

public class Client {
    static void main(String[] args) {
        try {
            //1. Create DaragramSocket object
            DatagramSocket socket = new DatagramSocket();

            byte[] buffer = new byte[1024];
            InetAddress address = InetAddress.getByName("localhost");

            //2. Send request to server
            DatagramPacket packet = new DatagramPacket(buffer,buffer.length,address,13);
            socket.send(packet);

            //3. Read response from server
            socket.receive(packet);

            //4. Display response
            String received = new String(packet.getData());
            System.out.println("Server received: " + received);

            //5. Close socket
            socket.close();
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

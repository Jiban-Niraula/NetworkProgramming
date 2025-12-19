import java.io.IOException;
import java.net.*;

public class DatagramChannelClient {
    public static void main(String[] args) {
        try {
            DatagramSocket client = new DatagramSocket();

            String msg = "Hello Server from Client";
            byte[] buffer = msg.getBytes();

            InetAddress address = InetAddress.getByName("localhost");
            int port = 8989;

            // Send request to server
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, port);
            client.send(packet);

            // Receive response from server
            byte[] receiveBuffer = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            client.receive(receivePacket);

            String receivedMsg = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Received from server: " + receivedMsg);

            client.close();

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

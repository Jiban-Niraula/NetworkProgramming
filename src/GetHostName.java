import java.net.*;

public class GetHostName {
    public static void main(String[] args) {
        try {
            InetAddress obj = InetAddress.getByName("104.21.57.147");
            System.out.println("Host name: " + obj.getHostName());
            System.out.println("Canonical host name: " + obj.getCanonicalHostName());
        } catch (UnknownHostException e) {
            System.out.println("Error: " + e);
        }
    }
}

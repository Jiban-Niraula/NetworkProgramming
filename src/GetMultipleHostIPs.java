import java.net.*;

public class GetMultipleHostIPs {
    public static void main(String[] args) {
        try {
            InetAddress[] inet = InetAddress.getAllByName("www.google.com");
            for(InetAddress address : inet){
                System.out.println(address);
            }
        } catch (UnknownHostException e)
        {
            System.out.println(e);
        }
    }
}


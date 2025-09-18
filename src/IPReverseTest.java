import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPReverseTest {
    public static void main(String[] args)throws UnknownHostException {
        InetAddress gn = InetAddress.getByName("vac.edu.np");

        InetAddress inet = InetAddress.getByName(gn.getHostName());
        System.out.println(inet.getCanonicalHostName());

    }
}

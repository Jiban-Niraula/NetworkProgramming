import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IpComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("First Domain: ");
            String fdomain = sc.nextLine();
            System.out.print("Second Domain: ");
            String sdomain = sc.nextLine();

            InetAddress ip = InetAddress.getByName(fdomain);
            InetAddress ip1 = InetAddress.getByName(sdomain);
            if(ip.equals(ip1)){
                System.out.println("\nResult:"+fdomain+" is same as "+sdomain);
            }else {
                System.out.println("\nResult:"+fdomain+" is not same as "+sdomain);
            }
        } catch (UnknownHostException e) {
            System.out.println("Unknown host exception");
        }
    }
}

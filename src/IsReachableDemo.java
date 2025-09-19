import java.io.IOException;
import java.net.InetAddress;
import java.util.Scanner;

public class IsReachableDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the domain: ");
        String domain = sc.nextLine();

        try {
            InetAddress inetAddress = InetAddress.getByName(domain);
            int timeout = 3000;

            if (inetAddress.isReachable(timeout)){
                System.out.println("The IP address is pinging");
            }else {
                System.out.println("The IP address is not reachable");
            }

        }catch(Exception e){
            System.out.println("Error");
        }



    }
}

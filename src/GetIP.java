import java.net.*;

public class GetIP {
    public static void main(String[] args) {
       try{
           InetAddress obj = InetAddress.getByName("vac.edu.com");
           System.out.println(obj);
       }catch (UnknownHostException e){
           System.out.println(e);
       }
    }
}

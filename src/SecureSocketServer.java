import javax.net.ssl.SSLServerSocketFactory;
import java.net.ServerSocket;
import java.net.Socket;

public class SecureSocketServer {
    static void main(String[] args) {
        try{
            ServerSocket serverSocket = ((SSLServerSocketFactory)SSLServerSocketFactory.getDefault()).createServerSocket(1422);
            Socket s= serverSocket.accept();
            System.out.println(s+ " Client Accepted and Connected....");

            serverSocket.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

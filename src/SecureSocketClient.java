import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.Socket;

public class SecureSocketClient {
    static void main() {
        try {
            Socket socket = ((SSLSocketFactory)SSLSocketFactory.getDefault()).createSocket("127.0.0.1",1422);
            System.out.println("connected"+socket);
        }catch (Exception e){
            System.out.println("error"+e);
        }
    }
}


//For Exam
// SocketFactory Factory = SslSocketfactory.Getdefault();
//SSLSocket socket = Factory.Createsocket("tufohss.edu.np".443);
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EvenOddServer {
    static void main(String[] args) {
        try {
            //Register service on port 4999
            ServerSocket serverSocket = new ServerSocket(4999);

            //wait and accept a connection
            Socket socket = serverSocket.accept();
            System.out.println("Client Connected");

            //Get a communication stream associated with the socket
            //Receiving
            InputStreamReader in  = new InputStreamReader(socket.getInputStream());
            BufferedReader out = new BufferedReader(in);

            //Perform I/O
            String str = out.readLine();
            int num = Integer.parseInt(str);
            String check = (num%2==0)?"Even":"Odd";

            //Sending
            PrintWriter outs =  new PrintWriter(socket.getOutputStream());
            outs.println(check);
            outs.flush();

            //Close streams and connection
            outs.close();
            socket.close();
            serverSocket.close();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

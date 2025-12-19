import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcRemote extends UnicastRemoteObject implements Calc {
    public CalcRemote() throws RemoteException{
        super();
    }
    public int multiply(int a, int b){
        return a*b;
    }

}

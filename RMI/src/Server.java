import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    static void main(String[] args) {
        try{
            CalcRemote obj = new CalcRemote();
            Registry rgsty = LocateRegistry.createRegistry(9000);
            rgsty.rebind("Multiply",obj);
            System.out.println("Server Ready");
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}

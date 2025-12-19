import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    static void main(String[] args) {
        try{
            Registry registry = LocateRegistry.getRegistry(9000);
            Calc obj = (Calc) registry.lookup("Multiply");

            int value = obj.multiply(6,5);
            System.out.println(value);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

import java.util.logging.*;

public class Logging {
    private static Logger logger=Logger.getLogger("request");
    static void main(String[] args) {
        try{
            logger.info("Line No.: "+new Exception().getStackTrace()[0].getLineNumber());
            System.out.println("Hii");
        } catch (RuntimeException ex) {
            logger.log(Level.SEVERE,"error"+ex.getMessage(),ex);
        }
    }
}

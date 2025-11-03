import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLTest {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.niraulajiban.com.np");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                System.out.println(inputLine);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}

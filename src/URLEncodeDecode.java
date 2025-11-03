import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEncodeDecode {
    public static void main(String[] args) {
        String originalString = "name = Ram Bahadur";

        //Encoding
        String encodedString = "";
        try{
            encodedString = URLEncoder.encode(originalString,"UTF-8");
            System.out.println("Encoded string is: " + encodedString);
        }catch (Exception e) {
            e.printStackTrace();
        }

        //Decoding
        String decodedString = "";
        try{
            decodedString = URLDecoder.decode(encodedString,"UTF-8");
            System.out.println("Decoded string is: " + decodedString);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

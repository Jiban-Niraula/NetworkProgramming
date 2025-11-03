import java.net.URL;
import java.net.URISyntaxException;

public class urlDemo {
    public static void main(String[] args) throws Exception {
        try {
            URL url = new URL("http://google.com:80/search?q=java+uri#section1");
//            System.out.println("Scheme: " + url.get
            System.out.println("Authority: " + url.getAuthority());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
//            System.out.println("Fragment: " + url.getFragment());
//            System.out.println("SchemeSpecificPart: " + url.getSchemeSpecificPart());

//            //Normalize the URI
//            URL normalizedURI = url.normalize();
//            System.out.println("Normalized URI: " + normalizedURI);
//
//            //Resolve a realtive URI against the base URI
//            URI relativizedURI = new URI("/search?q=java+examples");
//            URI resolvedURI = uri.resolve(relativizedURI);
//            System.out.println("Resolved URI: " + resolvedURI);
//
//            //Relativize the resolved URI against the base URI
//            System.out.println("Relativized URI: " + relativizedURI);
        }catch(Exception e) {
            e.printStackTrace();
        }

    }
}

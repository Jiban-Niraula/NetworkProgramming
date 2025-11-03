import java.net.URI;
import java.net.URISyntaxException;

public class uriDemo {
    public static void main(String[] args) throws Exception {
        try {
            URI uri = new URI("http://google.com:80/search?q=java+uri#section1");
            System.out.println("Scheme: " + uri.getScheme());
            System.out.println("Authority: " + uri.getAuthority());
            System.out.println("Host: " + uri.getHost());
            System.out.println("Port: " + uri.getPort());
            System.out.println("Path: " + uri.getPath());
            System.out.println("Query: " + uri.getQuery());
            System.out.println("Fragment: " + uri.getFragment());
            System.out.println("SchemeSpecificPart: " + uri.getSchemeSpecificPart());

            //Normalize the URI
            URI normalizedURI = uri.normalize();
            System.out.println("Normalized URI: " + normalizedURI);

            //Resolve a realtive URI against the base URI
            URI relativizedURI = new URI("/search?q=java+examples");
            URI resolvedURI = uri.resolve(relativizedURI);
            System.out.println("Resolved URI: " + resolvedURI);

            //Relativize the resolved URI against the base URI
            System.out.println("Relativized URI: " + relativizedURI);
        }catch(URISyntaxException e) {
            e.printStackTrace();
        }

    }
}

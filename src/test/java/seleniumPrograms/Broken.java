package seleniumPrograms;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Broken {
	
	 public static void main(String[] args) throws Exception {

	        String url = "https://www.homecentre.in/in/en/";

	        HttpClient client = HttpClient.newHttpClient();

	        HttpRequest request = HttpRequest.newBuilder()
	                .uri(URI.create(url))
	                .method("HEAD", HttpRequest.BodyPublishers.noBody())
	                .build();

	        HttpResponse<Void> response =
	                client.send(request, HttpResponse.BodyHandlers.discarding());

	        int statusCode = response.statusCode();

	        if (statusCode >= 200 && statusCode < 400) {
	            System.out.println("Link is valid");
	        } else {
	            System.out.println("Broken link: " + statusCode);
	        }
	    }

}

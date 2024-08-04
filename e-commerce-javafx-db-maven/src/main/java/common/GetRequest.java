package common;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GetRequest {
	public static void main(String[] args) throws IOException, InterruptedException {
		String url="http://localhost:8081/api/user/getAllUser";
		HttpClient client=HttpClient.newHttpClient();
		 HttpRequest request=HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
		 HttpResponse<String> response=client.send(request, HttpResponse.BodyHandlers.ofString());
		 System.out.println(response.body());
	}
 

 
}

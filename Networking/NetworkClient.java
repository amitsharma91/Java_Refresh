import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetworkClient {
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress address = InetAddress.getLocalHost();
		Socket s1 = null;
		String line = null;
		BufferedReader br = null;
		BufferedReader is = null;
		PrintWriter os = null;		
		
		try {
			s1 = new Socket("127.0.0.1", 4445);
			br = new BufferedReader(new InputStreamReader(System.in));
			is = new BufferedReader(new InputStreamReader(s1.getInputStream()));
			os = new PrintWriter(s1.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Client Address: " + address);
		System.out.print("Enter data to echo(QUIT to exit): ");
		String response = null;
		
		
		try {
			line = br.readLine();
			while (line.compareTo("QUIT") != 0) {
				os.println(line);
				os.flush();
				response = is.readLine();
				System.out.println("Server Respone: " + response);
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
				br.close();
				s1.close();
				System.out.println("Connection closed");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
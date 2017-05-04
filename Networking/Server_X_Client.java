import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_X_Client {
	public static void main(String[] args) {
		Socket s = null;
		ServerSocket ss2 = null;
		System.out.println("Server Listening...");
		try {
			ss2 = new ServerSocket(4445);
		} catch (IOException e) {
			e.printStackTrace();
		}
		while (true) {
			try {
				s = ss2.accept();
				System.out.println("Connection established");
				ServerThread st = new ServerThread(s);
				st.start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class ServerThread extends Thread {
	String line = null;
	BufferedReader is = null;
	PrintWriter os = null;
	Socket s = null;

	public ServerThread(Socket s) {
		this.s = s;
	}

	public void run() {
		try {
			is = new BufferedReader(new InputStreamReader(s.getInputStream()));
			os = new PrintWriter(s.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			line = is.readLine();
			while (line.compareTo("QUIT") != 0) {
				os.println(line);
				os.flush();
				System.out.println("Response to client " + line);
				line = is.readLine();
			}
		} catch (IOException e) {

		} catch (NullPointerException e) {

		} finally {
			try {
				System.out.println("Connection closing...");
				if (is != null) {
					is.close();
					System.out.println("Socket is close...<<<");
				}
				if (os != null) {
					os.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
import java.io.*;
import java.net.*;

class NodeServer {

    public static void main(String[] args) throws Exception {

        ServerSocket server = new ServerSocket(5000);
        System.out.println("🌐 Node Listening on port 5000...");

        while (true) {
            Socket socket = server.accept();

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            String message = in.readLine();
            System.out.println("📩 Received: " + message);

            socket.close();
        }
    }
}
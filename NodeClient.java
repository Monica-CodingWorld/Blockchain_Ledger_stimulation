import java.io.*;
import java.net.*;

class NodeClient {

    public static void sendTransaction(String data) {
        try {
            Socket socket = new Socket("localhost", 5000);

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println(data);

            socket.close();

        } catch (Exception e) {
            System.out.println("⚠ P2P Node not active");
        }
    }
}
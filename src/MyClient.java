import java.io.DataOutputStream;
import java.net.Socket;

public class MyClient {

    public static void main(String[] args) {

        try {

            Socket socket =
                    new Socket(
                            "localhost",
                            5000
                    );

            DataOutputStream output =
                    new DataOutputStream(
                            socket.getOutputStream()
                    );

            output.writeUTF(
                    "Hello Server"
            );

            output.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
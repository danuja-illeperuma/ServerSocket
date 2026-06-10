package socketcal;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class client {

    static void main() {


        Socket socket;

        {
            try {
                socket = new Socket("localhost", 5000);
                DataOutputStream output = new DataOutputStream(socket.getOutputStream());
                output.writeDouble(10);
                output.writeDouble(20);

                output.flush();
                DataInputStream input = new DataInputStream(socket.getInputStream());
                double read = input.readDouble();
                System.out.println("Answer: " + read);
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

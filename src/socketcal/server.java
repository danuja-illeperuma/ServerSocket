package socketcal;

import java.awt.image.DataBufferInt;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {


   public static void main(String[] args) {


        {
            try {
                ServerSocket serverSocket = new ServerSocket(5000);
                System.out.println("Server is running on port 5000");
                Socket socket = serverSocket.accept();
                System.out.println("Client connected");
                DataInputStream input = new DataInputStream(socket.getInputStream());
                double read = input.readDouble();
                double read2 = input.readDouble();
                double answer = read + read2;
                System.out.println("Answer: " + answer);
                DataOutputStream output = new DataOutputStream(socket.getOutputStream());
                output.writeDouble(answer);
                output.flush();
                socket.close();
                serverSocket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

package datagram;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class reciver {


    public static void main(String[] args) {

        try {

            DatagramSocket ds =
                    new DatagramSocket(5000);

            byte[] buffer =
                    new byte[1024];

            DatagramPacket packet =
                    new DatagramPacket(
                            buffer,
                            buffer.length
                    );

            System.out.println(
                    "Waiting for message..."
            );

            ds.receive(packet);

            String msg =
                    new String(
                            packet.getData(),
                            0,
                            packet.getLength()
                    );

            System.out.println(
                    "Message Received: " + msg
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

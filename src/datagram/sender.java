package datagram;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class sender {

    public static void main(String[] args) {

        try {

            DatagramSocket ds = new DatagramSocket();

            String msg =
                    "Hello UDP Server";

            byte[] data =
                    msg.getBytes();

            InetAddress ip =
                    InetAddress.getByName(
                            "localhost"
                    );

            DatagramPacket packet =
                    new DatagramPacket(
                            data,
                            data.length,
                            ip,
                            5000
                    );

            ds.send(packet);

            System.out.println(
                    "Message Sent"
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

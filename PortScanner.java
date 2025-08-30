import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class PortScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter target IP address: ");
        String target = scanner.nextLine();

        System.out.println("Scanning ports 1-1024 on " + target + "...");
        for (int port = 1; port <= 1024; port++) {
            try {
                Socket socket = new Socket(target, port);
                System.out.println("Port " + port + " is OPEN");
                socket.close();
            } catch (IOException e) {
                // port is closed, ignore
            }
        }
        System.out.println("Scan complete.");
        scanner.close();
    }
}

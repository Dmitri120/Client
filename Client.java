import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try(Socket socket= new Socket("1.0.4.112",8000);
        BufferedWriter writer =
                new BufferedWriter(
                    new OutputStreamWriter(
                        socket.getOutputStream()));
        BufferedReader reader =
                new BufferedReader(
                    new InputStreamReader(
                        socket.getInputStream()));
        ){

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

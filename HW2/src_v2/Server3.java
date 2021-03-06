/**
 * Created by rongshengxu on 9/20/15.
 */
import java.net.ServerSocket;
import java.net.Socket;

public class Server3 {
    public static void main(String[] args) {
        System.out.println("SeatServer started: ");
        try{
            SeatServer ss = new SeatServer(3);
            ServerSocket listener = new ServerSocket(ss.get_port());

            while (true){
                System.out.println("*****Waiting for a client:*****");
                Socket aClient = listener.accept();
                System.out.println("--Get a client:");
                ss.handleclient(aClient);
                aClient.close();
            }
        }
        catch (Exception e){
            System.out.println("SeatServer aborted:" + e);
        }
    }
}

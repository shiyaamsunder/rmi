import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            // Create an instance of the remote object
            RemoteInterface remoteObj = new RemoteImplementation();

            // Bind the remote object to the RMI registry
            Registry registry = LocateRegistry.createRegistry(2000);
            registry.rebind("RemoteObject", remoteObj);

            System.out.println("Server is running...");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}


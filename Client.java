import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Client {
    public static void main(String[] args) {
        try {
            // Locate the remote object in the RMI registry
            Registry registry = LocateRegistry.getRegistry("localhost", 2000);
            RemoteInterface remoteObj = (RemoteInterface) registry.lookup("RemoteObject");

            // Invoke the remote method
            int result = remoteObj.add(5, 3);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}


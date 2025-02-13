import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Client> clientList = new ArrayList<>();
        clientList.add(new Company("Zvir", 30,10));
        clientList.add(new Company("Zvir", 50,10));
        clientList.add(new Client("Wisnia", 30));
        clientList.add(new Client("Ambala", 30));
        clientList.add(new Company("Jajo", 50, 5));
        clientList.add(new Company("Jajo", 40, 5));
        for(Client client : clientList)
            System.out.println(client);

        Collections.sort(clientList);
        System.out.println("----------------------");

        for(Client client : clientList)
            System.out.println(client);
    }
}
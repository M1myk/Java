import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<WorkTool> workTools = new ArrayList<>();
        workTools.add(new Hammer("Shtill",1924));
        workTools.add(new Hammer("Shill",1925));
        workTools.add(new Hammer("Shill",1926));
        workTools.add(new Hammer("Shill",1927));
        workTools.add(new Hammer("Shill",1928));

        for(WorkTool workTool : workTools)
        {
            workTool.use();
        }
    }
}
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRepository {
    private String fileName;
    List<Persona> repo = new ArrayList<>();
    public FileRepository(String fileName) {
        this.fileName = fileName;
    }
    public void fillRepository(){
        File file = new File(fileName);
        // файл через в настройках конфигурации через redirect input from
        // ..JWorkHome1\GeoTree\src\Adams.txt
        Scanner scanner = new Scanner(System.in);
        while (true){
            String[] line = scanner.nextLine().split(";");
            if(line[0].equals("stop"))break;
            int age = Integer.parseInt(line[2]);
            int year = Integer.parseInt(line[1]);
            repo.add(new Persona(line[0],age,Gender.man,year));
        }
    }
    public List getPersonas(){
        return repo;
    }
}

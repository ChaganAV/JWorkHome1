import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRepository{
    private String fileName;
    List<Person> repo = new ArrayList<>();
    public FileRepository(String fileName) {
        this.fileName = fileName;
    }
    public void fillRepository(){
        File file = new File(fileName);
        // файл в настройках конфигурации через redirect input from
        // ..JWorkHome1\GeoTree\src\Adams.txt
        Scanner scanner = new Scanner(System.in);
        while (true){
            String[] line = scanner.nextLine().split(";");
            if(line[0].equals("stop"))break;
            int age = Integer.parseInt(line[1]);
            int year = Integer.parseInt(line[2]);
            repo.add(new Person(line[0],age,Gender.man,year));
        }
    }
    public List getPersons(){
        return repo;
    }
}

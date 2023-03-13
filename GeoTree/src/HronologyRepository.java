import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HronologyRepository implements IRepository{
    private String filename;
    List<Hronology> repository = new ArrayList<>();

    public HronologyRepository(String filename) {
        this.filename = filename;
    }

    @Override
    public List<Hronology> getRepository() {
        return repository;
    }

    @Override
    public void fillRepository() {
        String dir = System.getProperty("user.dir");
        File file = Path.of(dir,filename).toFile();
        if(file.exists()){
            try (Scanner scanner = new Scanner(file)) {
                while (true){
                    String[] line = scanner.nextLine().split(";");
                    if(line[0].equals("stop"))break;
                    Hronology hronic = new Hronology();
                    hronic.setYear(Integer.parseInt(line[0]));
                    hronic.setPeriod(Integer.parseInt(line[1]));
                    hronic.setRel(line[2]);
                    hronic.setDescription(line[3]);
                    repository.add(hronic);
                    //System.out.println("добавили");
                }
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
                throw new RuntimeException(e);
            }
        }
    }

}

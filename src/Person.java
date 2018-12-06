import java.util.ArrayList;
import java.util.List;

public class Person implements Magazinable{
    private String name;
    int countM = 0;

    public Person(String name){
        this.name=name;
    }

    @Override
    public int getMagazine() {
        return countM;
    }

    @Override
    public String getName() {
        return name;
    }
    public void add(Magazine magazine){
        this.countM++;
    }
}

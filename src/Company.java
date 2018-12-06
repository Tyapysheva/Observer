public class Company implements Magazinable {
    private String name;
    int countM = 0;

    public Company(String name){
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

        this.countM=countM+2;

    }
}

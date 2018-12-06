import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<Person> subscriber = new ArrayList<>();
    private List<Company> companies = new ArrayList<>();
    private Magazine newMagazine;

    public void publishMagasin() {
        this.newMagazine = new Magazine();

    }

    private void magazinePublised() {
        notifyAllSubscribers();
    }

    public void notifyAllSubscribers() {
        for (Person p : subscriber) {
            p.add(newMagazine);
        }
        for (Company c : companies) {
            c.add(newMagazine);
        }
    }

    public void addSubscriber(Person p) {
        this.subscriber.add(p);
    }

    public void addSubscriber(Company c) {
        this.companies.add(c);
    }

    public void removeSubscriber(Person p) {
        int indexPerson = this.subscriber.indexOf(p);
        if (this.subscriber.contains(p)) {
            this.subscriber.remove(indexPerson);
        }
    }

    public void removeSubscriber(Company c) {
        int indexPerson = this.companies.indexOf(c);
        if (this.companies.contains(c)) {
            this.companies.remove(indexPerson);
        }
    }

}

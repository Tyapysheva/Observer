public class Main {
    public static void main(String[] args) {

        Person p1 =new Person("Masha");
        Person p2 =new Person("Sasha");
        Person p3 =new Person("Pasha");

        Company c1 =new Company("Ddd");
        Company c2 =new Company("VVVV");

        Publisher pub = new Publisher();

        pub.addSubscriber(p1);
        pub.addSubscriber(p2);
        pub.addSubscriber(p3);
        pub.addSubscriber(c1);
        pub.addSubscriber(c2);
        pub.removeSubscriber(p1);
        pub.publishMagasin();
        pub.notifyAllSubscribers();
        pub.publishMagasin();
        pub.notifyAllSubscribers();

        printMag(p1);
        printMag(p2);
        printMag(p3);
        printMag(c1);
        printMag(c2);


    }
    public static void printMag(Magazinable magazinable){
        System.out.println(magazinable.getName()+" : ");
        System.out.println(magazinable.getMagazine());
        }

    }


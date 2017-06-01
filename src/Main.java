import java.util.ArrayList;

/**
 * Created by test on 28/05/2017.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, this is a print message");
        int a = 5;
        int b = 7;

        String toBePrint = String.format("%d+%d=%d", a, b, a+b);
        System.out.println(toBePrint);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("select * from cars");
        strings.add("select plate_licence from cars where like '47%'");
        strings.add("create table mechanic(id int contraint pk_id_mechanic primary key, license int not null, contraint fk_lic_cars foreign key(license) references cars");
        Query query = new Query(strings, String::compareTo);

        System.out.println(query);
    }

}

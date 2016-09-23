package kata.pkg1.pkg2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata12 {
    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1995,8,23);
        
        Person NPerson = new Person ("Sara", date);
        System.out.println(NPerson.getName() + " tiene " + NPerson.getAge() + " años");
    }
}

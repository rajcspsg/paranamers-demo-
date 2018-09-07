import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class PersonV03 {

    private  String firstName;
    private  String lastName;

    private  long age;
    private String dateOfBirth;

    public PersonV03(String dateOfBirth, Long age, String lastName, String firstName) {
        this(firstName, lastName, age, dateOfBirth);
    }

    public PersonV03(String firstName, String lastName, Long age, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age!=null ? age.longValue() : 0;
        this.dateOfBirth = dateOfBirth;
    }

    public PersonV03(String firstName, String lastName, Date dateOfBirth) {
        this(firstName, lastName, yearsDifference(dateOfBirth, new Date()),
                new SimpleDateFormat("dd/MM/yyyy").format(dateOfBirth));
    }

    public static long yearsDifference(final Date start, final Date end) {
        long diff = end.getTime() - start.getTime();
        return diff / TimeUnit.SECONDS.toMillis(60*60*24*365);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getAge() {
        return age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
}
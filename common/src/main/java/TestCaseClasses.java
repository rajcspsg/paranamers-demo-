import java.util.Date;

public interface TestCaseClasses {

    public static class Person {
        private String firstName;
        private String lastName;

        private Long age;
        private Date date;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Long getAge() {
            return age;
        }

        public void setAge(Long age) {
            this.age = age;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

    }


    public static class PersonVO {
        private final String firstName;
        private final String lastName;

        private final long age;
        private final String dateOfBirth;

        public PersonVO(String firstName, String lastName, long age, String dateOfBirth) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.dateOfBirth = dateOfBirth;
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
}
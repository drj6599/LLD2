package Builder;

public class User {
    private int id;
    private String name;
    private String emailAddress;
    private int age;

    private User(int id , String name , String emailAddress , int age)
    {
        this.id = id;
        this.name = name;
        this.emailAddress = emailAddress;
        this.age = age;
    }

    public static UserBuilder builder()
    {
        System.out.println("Builder method called");
        return new UserBuilder();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", age=" + age +
                '}';
    }

    public static class UserBuilder
    {
        private int id;
        private String name;
        private String emailAddress;
        private int age;

        public UserBuilder id(int id)
        {
            this.id = id;
            return this;
        }

        public UserBuilder name(String name)
        {
            this.name = name;
            return this;
        }

        public UserBuilder emailAddress(String emailAddress)
        {
            this.emailAddress = emailAddress;
            return this;
        }

        public UserBuilder age(int age)
        {
            this.age = age;
            return this;
        }

        private void validate()
        {
            if(this.age < 18)
            {
                throw new InvalidAgeException();
            }
        }

        public User build()
        {
            System.out.println("build method called , if validated object will be created");
            validate();
            System.out.println("Validation done");
            return new User(this.id,this.name,this.emailAddress,this.age);
        }
    }
}

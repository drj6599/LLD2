package Builder;

public class Main {
    public static void main(String[] args) {
        User user1 = User.builder().id(1).name("Dheeraj").emailAddress("kaaskjbckbc").age(25).build();
        System.out.println(user1);
        User user2 = User.builder().id(2).name("Oshin").emailAddress("alsjfhoncian").age(16).build();
        System.out.println(user2);
    }
}

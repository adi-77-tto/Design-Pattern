public class Buildermain {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                        .setUserId(1)
                        .setUserName("John")
                        .setUserEmail("john@example.com")
                        .build();
        System.out.println(user);
    }
}
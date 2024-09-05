package design_patterns.builder;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder().setUserId("1").setUserName("John Doe").
                setAddress("Washington").setEmailId("johndoe@gmail.com").build();
        System.out.println(user1);
        User user2 = User.UserBuilder.builder().setUserId("2").setUserName("Jake Paul").
                setAddress("California").setEmailId("jakepaul@gmail.com").build();
        System.out.println(user2);
    }
}

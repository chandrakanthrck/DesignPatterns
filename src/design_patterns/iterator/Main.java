package design_patterns.iterator;

public class Main {
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("Ck", "1"));
        userManagement.addUser(new User("John", "2"));
        userManagement.addUser(new User("Doe", "3"));
        userManagement.addUser(new User("Perl", "4"));
        userManagement.addUser(new User("Adam", "5"));

         MyIterator myIterator= userManagement.getIterator();
         while(myIterator.hasNext()){
            User user = (User) myIterator.next();
             System.out.println(user.getName());
         }
    }
}

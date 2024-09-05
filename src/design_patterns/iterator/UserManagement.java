package design_patterns.iterator;
import java.util.ArrayList;

public class UserManagement {
    private ArrayList<User> userList = new ArrayList<>();
    public void addUser(User user){
        userList.add(user);
    }
    public User getUser(int index){
        return userList.get(index);
    }

    //this iterator to iterator the list of users in this class
    public MyIterator getIterator(){
        return new MyIteratorImpl(userList);
    }
}

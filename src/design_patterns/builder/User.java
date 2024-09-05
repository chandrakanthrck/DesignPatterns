package design_patterns.builder;

public class User {
    private final String userId;
    private final String userName;
    private String address;
    private final String emailId;

    private User(UserBuilder builder){
        //initialize
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.emailId = builder.emailId;
        this.address = builder.address;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return this.userName + " : " + this.userId + " : " + this.emailId + " : " + this.address;
    }

    //inner class to create object
    static class UserBuilder{
        private String userId;
        private String userName;
        private String address;
        private String emailId;
        public UserBuilder(){

        }

        public static UserBuilder builder(){
            return new UserBuilder();
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }
    }
}

public class User {
    private final int userid;
    private final String username;
    private final String useremail;

    public User(UserBuilder builder){
        this.userid = builder.userid;
        this.username = builder.username;
        this.useremail = builder.useremail;
    }
        public String getUsername() {
        return username;
    }
    public int getUserId() {
        return userid;
    }
    public String getUseremail() {
        return useremail;
    }

    @Override
    public String toString() {
        return "userid=" + userid + ", username=" + username + ", useremail=" + useremail + "";
    }

    static class UserBuilder {
        private int userid;
        private String username;
        private String useremail;

        public UserBuilder setUserId(int userid){ this.userid = userid; return this; }
        public UserBuilder setUserName(String username){ this.username = username; return this; }
        public UserBuilder setUserEmail(String useremail){ this.useremail = useremail; return this; }
        public User build(){ return new User(this); }
    }
    
}

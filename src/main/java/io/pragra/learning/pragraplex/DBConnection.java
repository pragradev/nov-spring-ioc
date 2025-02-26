package io.pragra.learning.pragraplex;




public class DBConnection {
    private String url;
    private String username;
    private String password;
    // prep method, init method
    public void establishConnection(){
        // esta conn to db
        System.out.println("Database connection has been established");
    }
    // pre destroy method
    public void disconnetDatabase(){
        System.out.println("Database connection has been closed");
    }

    @Override
    public String toString() {
        return "DBConnection{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

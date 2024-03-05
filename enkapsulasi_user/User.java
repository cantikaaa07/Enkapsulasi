package enkapsulasi_user;


public class User {
    private String Username;
    private String Password;
    int ID; 
    private boolean Status; //true : menikah false : bm
    
    // id = 0
    // status = false
    
    public User(String Username, String Password, int ID, boolean Status){
        this.Username = Username;
        this.Password = Password;
        this.ID = ID;
        this.Status = Status;
    }

    public String getUsername() {
        return Username;
    }
    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public boolean getStatus() {
        return Status;
    }
    public void setStatus(boolean Status) {
        this.Status = Status;
    }
}




package enkapsulasi_user;

public class Enkapsulasi_User {

    
    public static void main(String[] args) {
        User Cantika = new User ("Cantika","mpus",0 ,false);
          

Cantika.setUsername("Cantika");
Cantika.setPassword("mpus");
Cantika.setID(0);
Cantika.setStatus(false);


System.out.println("Username: " + Cantika.getUsername());
System.out.println("Password: " + Cantika.getPassword());  
        System.out.println("ID: " + Cantika.getID());
        System.out.println("Status: " + Cantika.getStatus());

    }
}
        
    
    

    
    


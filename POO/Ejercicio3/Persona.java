public class Persona{
    int documentNumber;
    String name;
    String lastname;
    String address;
    String email;

    public Persona( int documentNumber, String name, String lastname, String address, String email){
        this.documentNumber = documentNumber;
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.email = email;
    }

    //gets
    public int getDocument(){
        return this.documentNumber;
    }
    public String getName(){
        return this.name;
    }
    public String getLastname(){
        return this.lastname;
    }
    public String getAddress(){
        return this.address;
    }
    public String getEmail(){
        return this.email;
    }

    //sets

    public void setDocument(int documentNumber){
        this.documentNumber = documentNumber;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public void printInformation(){
        System.out.println(" Documento: " + this.documentNumber);
        System.out.println(" Nombre: " + this.name);
        System.out.println(" Apellidos: " + this.lastname);
        System.out.println(" Direccion: " +this.address);
        System.out.println(" Email: " + this.email);
        // System.out.println("");
    }
    
}
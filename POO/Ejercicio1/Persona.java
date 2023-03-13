public class Persona{

    int documentNumber;
    int phoneNumber;
    String name;
    String lastname;
    String address;
    String email;

    public Persona(int documentNumber, int phoneNumber, String name, String lastname, String address, String email){
        this.documentNumber = documentNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.email = email;
    }

    //metodos get

    public int getDocument(){
        return this.documentNumber;
    }
    public int getPhone(){
        return this.phoneNumber;
    }
    public String getName(){
        return this.name;
    }
    public String getLastName(){
        return this.lastname;
    }
    public String getAddress(){
        return this.address;
    }
    public String getEmail(){
        return this.email;
    }

    //metodos set

    public void setDocument(){
        this.documentNumber = documentNumber;
    }
    public void setPhone(){
        this.phoneNumber = phoneNumber;
    }
    public void setNamet(){
        this.name = name;
    }
    public void setLastname(){
        this.lastname = lastname;
    }
    public void setAddress(){
        this.address = address;
    }
    public void setEmail(){
        this.email = email;
    }
    
    public void printInformation(){
        System.out.println("------------------------------------");
        System.out.println("-- DATOS PERSONA                   -");
        System.out.println("------------------------------------");
        System.out.println("| Documento: " + this.documentNumber);
        System.out.println("| Telefono: " + this.phoneNumber);
        System.out.println("| Nombre: " + this.name);
        System.out.println("| Apellidos: " + this.lastname);
        System.out.println("| Direccion: " + this.address);
        System.out.println("| Email: " + this.email);
        System.out.println("------------------------------------");
    }
}
package address;



import java.util.Scanner;
import java.util.HashMap;
class Person{
    public String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phNum;
    private String email;
    Person(String name,String address,String city,String state,String zip,String phNum,String email){
        this.name=name;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phNum=phNum;
        this.email=email;
    }
    public String getDetails(){
        String details="1.Name : "+name+" 2.Address : "+address+" 3.City : "+city+
                       " 4.State : "+state+" 5.Phone Number : "+phNum+" 6.Email : "+email;
        return details;
    }
    public void editName(String name){
        this.name=name;
    }
    public void editAddress(String address){
        this.address=address;
    }
    public void editCity(String city){
        this.city=city;
    }
    public void editState(String state){
        this.state=state;
    }
    public void editZip(String Zip){
        this.zip=zip;
    }
    public void editPhNum(String phNum){
        this.phNum=phNum;
    }
    public void editEmail(String email){
        this.email=email;
    }
}
class Contacts{
    private HashMap<String,Person> contacts;
    Contacts(){
        contacts=new HashMap<>();
    }
    public void addContact(Person person){
        String name=person.name;
        contacts.put(name,person);
        System.out.println("Contact Successfully Added.");
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		Scanner input=new Scanner(System.in);
		Contacts contacts=new Contacts();
	
	
		        System.out.println("Add Contact");
		        System.out.println("Enter contact details");
                System.out.print("Enter name : ");
		        String name= input.nextLine();
                System.out.print("Enter address : ");
                String address= input.nextLine();
                System.out.print("Enter city : ");
                String city= input.nextLine();
                System.out.print("Enter state : ");
                String state= input.nextLine();
                System.out.print("Enter zip : ");
                String zip= input.nextLine();
                System.out.print("Enter Phone Number : ");
                String phNum= input.nextLine();
                System.out.print("Enter email : ");
                String email= input.nextLine();
                Person person=new Person(name,address,city,state,zip,phNum,email);
contacts.addContact(person);
	}
}

                

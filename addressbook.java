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
    public void editContact(String name,int choiceUpdate,String updateValue){
        if(!contacts.containsKey(name))
        {
            System.out.println("Sorry !! No such contact exists");
            return;
        }
        if(choiceUpdate==1){
            Person p=contacts.get(name);
            p.editName(updateValue);
            contacts.remove(name);
            contacts.put(updateValue,p);
            System.out.println("Name Updated");
        }
        else if(choiceUpdate==2){
            contacts.get(name).editAddress(updateValue);
            System.out.println("Address Updated");
        }
        else if(choiceUpdate==3){
            contacts.get(name).editCity(updateValue);
            System.out.println("City Updated");
        }
        else if(choiceUpdate==4){
            contacts.get(name).editState(updateValue);
            System.out.println("State Updated");
        }
        else if(choiceUpdate==5){
            contacts.get(name).editPhNum(updateValue);
            System.out.println("Phone Number Updated");
        }
        else if(choiceUpdate==6){
            contacts.get(name).editEmail(updateValue);
            System.out.println("Email Updated");
        }
        
    }
    public void deleteContact(String name){
        if(contacts.containsKey(name)){
            contacts.remove(name);
            System.out.println("Contact "+name+" deleted Successfully");
        }
        else
           System.out.println("Sorry !! No such contact exists");
    }
    public void showAllContacts(){
        int i=1;
        for (HashMap.Entry<String, Person> e : contacts.entrySet()) 
        {
            System.out.println(i+" "+e.getKey()); 
            i++;
        }
        if(i==1)
            System.out.println("No contact present.");
    }
    public void showContact(String name)
    {
        if(!contacts.containsKey(name)){
            System.out.println("Sorry !! No contact present with this name.");
            return;
        }
        String details=contacts.get(name).getDetails();
        System.out.println(details);
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		Scanner input=new Scanner(System.in);
		Contacts contacts=new Contacts();
		char flag='Y';
		while(flag=='Y' || flag=='y')
		{
		    System.out.println("Select an operation");
		    System.out.println("1. Add a Contact.");
		    System.out.println("2. Edit an existing Contact.");
		    System.out.println("3. Delete a Contact.");
		    System.out.println("4. Show all Contacts.");
		    System.out.print("Enter your choice : ");
            int choice = input.nextInt();
            input.nextLine();
		    if(choice == 1){
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
		    else if(choice==2){
		        System.out.println("Edit Contact");
		        System.out.print("Enter name of the person : ");
		        String name= input.nextLine();
		        int f=1;
		        System.out.println("1.Name 2.Address 3.City 4.State 4.Zip 5.Phone Number 6.Email");
		        System.out.print("Choose field to Update : ");
                int choiceUpdate=input.nextInt();
                input.nextLine();
		        String updateValue="";
		        if(choiceUpdate==1){
		            System.out.print("Update Name : ");
                    updateValue=input.nextLine();
		        }
		        else if(choiceUpdate==2){
		            System.out.print("Update Address : ");
                    updateValue=input.nextLine();
		        }
		        else if(choiceUpdate==3){
		            System.out.print("Update City : ");
                    updateValue=input.nextLine();
		        }
		        else if(choiceUpdate==4){
		            System.out.print("Update State : ");
                    updateValue=input.nextLine();
		        }
		        else if(choiceUpdate==5){
		            System.out.print("Update Phone Number : ");
                    updateValue=input.nextLine();
		        }
		        else if(choiceUpdate==6){
		            System.out.print("Update Email : ");
                    updateValue=input.nextLine();
		        }
		        else
		        {
		            f=0;
		            System.out.println("Sorry !! Not a Valid Choice");
		        }
		        if(f==1)
		            contacts.editContact(name,choiceUpdate,updateValue);
		    }
		    else if(choice==3){
		        System.out.println("Delete Contact");
		        System.out.print("Enter name of the person to be deleted : ");
		        String name= input.nextLine();
		        contacts.deleteContact(name);
		    }
		    else if(choice==4){
		        System.out.println("Show All Contacts");
                contacts.showAllContacts();
                System.out.print("Get details of any Contact(Y/N) : ");
                char f=input.next().charAt(0);
                input.nextLine();
                if(f=='Y' || f=='y')
                {
                    System.out.print("Enter name of contact to get details : ");
                    String name=input.nextLine();
                    contacts.showContact(name);
                }
		    }
		    else
		        System.out.println("Please enter a valid choice !");
		    System.out.print("Want to perform more operations(Y/N) : ");
		    flag= input.next().charAt(0);
		}
        System.out.println("Bye !!");
        input.close();
	}
}

package src.addressbookcont;

import java.util.*;
import java.util.stream.Collectors;


public class addressbook {
	Scanner sc = new Scanner(System.in);

    Scanner sc = new Scanner(System.in);
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private List<Details> addressBook = new ArrayList<Details>();
    Map<String, ArrayList<Details>> cityMap = new HashMap<>();
    Map<String, ArrayList<Details>> stateMap = new HashMap<>();

    public List<Details> getAddressBook() {
        return this.addressBook;
    }

    public void setAddressBook(List<Details> adrs) {
        this.addressBook = adrs;
    }

    public void addDetails(Details detailsObj) {
        addressBook.add(detailsObj); // ADDING DETAILS

        ArrayList<Details> cityDetails = cityMap.get(detailsObj.getCity());
        if (cityDetails == null) {
            ArrayList<Details> firstInsertion = new ArrayList<>();
            firstInsertion.add(detailsObj);
            cityMap.put(detailsObj.getCity(), firstInsertion);
        } else {
            cityDetails.add(detailsObj);
            cityMap.put(detailsObj.getCity(), cityDetails);
        }

        ArrayList<Details> stateDetails = stateMap.get(detailsObj.getState());
        if (cityDetails == null) {
            ArrayList<Details> firstInsertion = new ArrayList<>();
            firstInsertion.add(detailsObj);
            stateMap.put(detailsObj.getState(), firstInsertion);
        } else {
            stateDetails.add(detailsObj);
            stateMap.put(detailsObj.getState(), stateDetails);
        }
    }

    public List<Details> viewAllDetails() {
        return addressBook;
    }

    // DISPLAYING DETAILS
    public Details viewDetailsGivenName(String firstName) {
        for(Details c:addressBook)
        if (c.getFirstName()== firstName)
        	return c;
        
    public Details viewDetailsGivenName(String firstName, String lastName) {
        for (Details c : addressBook)
            if (c.getFirstName() == firstName && c.getLastName() == lastName)
                return c;

        return null;
    }
    //  TO EDIT EXISTING DETAILS

    // TO EDIT EXISTING DETAILS
    public void edit(Details det) {
    	System.out.println("1. Enter the First Name.");
    	System.out.println("2. Enter the Last Name.");
    	System.out.println("3. Enter the Phone Number.");
    	System.out.println("4. Enter the Email ID.");
    	System.out.println("5. Enter the Address.");
    	System.out.println("6. Enter the City.");
    	System.out.println("7. Enter the State.");
    	System.out.println("8. Enter the Zip Code.");

    	System.out.println("Enter Number of Correspondence Statement.");

    	int choice = sc.nextInt(); sc.nextLine();
    	System.out.println("Enter the Detail");

    	switch (choice) {
	    	case 1:
	    		updateDetailsFirstName(det, sc.nextLine());
	    		break;
	    	case 2:
	    		updateDetailsLastName(det, sc.nextLine());
	    		break;
	    	case 3:
	    		updateDetailsPhoneNumber(det, Long.parseLong(sc.nextLine()));
	    		break;
	    	case 4:
	    		updateDetailsEmail(det, sc.nextLine());
	    		break;
	    	case 5:
	    		updateDetailsAddress(det, sc.nextLine());
	    		break;
	    	case 6:
	    		updateDetailsCity(det, sc.nextLine());
	    		break;
	    	case 7:
	    		updateDetailsState(det, sc.nextLine());
	    		break;
	    	case 8:
	    		updateDetailsZip(det, Long.parseLong(sc.nextLine()));
	    		break;
	    	default:
	    		System.out.println("INVALID INPUT");
	    		break;
    	}


    }
    public void updateDetailsPhoneNumber(Details dObj, long phoneNumber)  {
        System.out.println("1. Enter the First Name.");
        System.out.println("2. Enter the Last Name.");
        System.out.println("3. Enter the Phone Number.");
        System.out.println("4. Enter the Email ID.");
        System.out.println("5. Enter the Address.");
        System.out.println("6. Enter the City.");
        System.out.println("7. Enter the State.");
        System.out.println("8. Enter the Zip Code.");

        System.out.println("Enter Number of Correspondence Statement.");

        int n = 0;
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Detail");

        switch (choice) {
            case 1:
                updateDetailsFirstName(det, sc.nextLine());
                n = 1;
                break;
            case 2:
                updateDetailsLastName(det, sc.nextLine());
                n = 1;
                break;
            case 3:
                updateDetailsPhoneNumber(det, Long.parseLong(sc.nextLine()));
                n = 1;
                break;
            case 4:
                updateDetailsEmail(det, sc.nextLine());
                n = 1;
                break;
            case 5:
                updateDetailsAddress(det, sc.nextLine());
                n = 1;
                break;
            case 6:
                updateDetailsCity(det, sc.nextLine());
                n = 1;
                break;
            case 7:
                updateDetailsState(det, sc.nextLine());
                n = 1;
                break;
            case 8:
                updateDetailsZip(det, Long.parseLong(sc.nextLine()));
                n = 1;
                break;
            default:
                System.out.println("INVALID INPUT");
                break;
        }
        if (n == 1) {
            System.out.println("Detail Edited");
        } else {
            System.out.println("Name Not Found");
        }

    }

    public void updateDetailsPhoneNumber(Details dObj, long phoneNumber) {
        dObj.setPhoneNumber(phoneNumber);
    }
    public void updateDetailsFirstName( Details dobj, String upFirstName)  {

    public void updateDetailsFirstName(Details dobj, String upFirstName) {
        dobj.setFirstName(upFirstName);
    }
    public void updateDetailsLastName(Details dObj, String lastName)  {

    public void updateDetailsLastName(Details dObj, String lastName) {
        dObj.setLastName(lastName);
    }
    public void updateDetailsEmail(Details dObj, String email)  {

    public void updateDetailsEmail(Details dObj, String email) {
        dObj.setEmailId(email);
    }
    public void updateDetailsCity(Details dObj, String city)  {

    public void updateDetailsCity(Details dObj, String city) {
        dObj.setCity(city);
    }
    public void updateDetailsAddress(Details dObj, String address)  {

    public void updateDetailsAddress(Details dObj, String address) {
        dObj.setAddress(address);
    }
    public void updateDetailsState(Details dObj, String state)  {

    public void updateDetailsState(Details dObj, String state) {
        dObj.setState(state);
    }
    public void updateDetailsZip(Details dObj, long zip)  {

    public void updateDetailsZip(Details dObj, long zip) {
        dObj.setZipCode(zip);
    }
	
	
	public void sortCity() {
        List<Details> list=address_book.stream().sorted(Comparator.comparing(Details::getCity)).collect(Collectors.toList());
        addressBook = new ArrayList<>(list);
    }

    public void sortState() {
        List<Details> list=address_book.stream().sorted(Comparator.comparing(Details::getState)).collect(Collectors.toList());
        addressBook = new ArrayList<>(list);
    }

    public void sortPin() {
        List<Details> list=address_book.stream().sorted(Comparator.comparing(Details::getZipCode)).collect(Collectors.toList());
        addressBook = new ArrayList<>(list);
    }

}

class AddressBookDictionary extends AddressBook {
    Map<String, AddressBook> address_book = new HashMap<>();

    public void addAddressBook(String name, AddressBook addressbook) {
        address_book.put(name, addressbook);
    }

    public boolean presentAddressBook(String name) {
        return address_book.containsKey(name);
    }

    public AddressBook returnAddressBook(String name) {
        return address_book.get(name);
    }

}

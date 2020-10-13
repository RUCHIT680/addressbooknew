package addressbookcont;
import java.io.*;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Continued {
	private HashMap<String, ArrayList<info>> deathNote;
	private static ArrayList<info> friends;
	private static HashMap<String, ArrayList<Info>> deathNote;
	private static ArrayList<Info> friends;
	static Scanner stdlin = new Scanner(System.in);

	public AddressBookMain() {
		friends = new ArrayList<info>();
		deathNote = new HashMap<String, ArrayList<info>>();
		friends = new ArrayList<Info>();
		deathNote = new HashMap<String, ArrayList<Info>>();
	}

	public void addNewContact(info entry) {
		friends.add(new info(entry.fName, entry.lName, entry.address, entry.city, entry.state, entry.zip, entry.phone,
	public void addNewContact(Info entry) {
		friends.add(new Info(entry.fName, entry.lName, entry.address, entry.city, entry.state, entry.zip, entry.phone,
				entry.email));
	}

	public void addAddressBook(String bookName) {
		deathNote.put(bookName, new ArrayList<info>());
		deathNote.put(bookName, new ArrayList<Info>());
	}

	public static info add() {
	public static Info add() {

		// method for adding new entries.
		Scanner stdlin = new Scanner(System.in);
 public static info add() {
		String email = stdlin.next();

		// saving as new entry
		info contact = new info(fName, lName, address, city, state, zip, phone, email);
		Info contact = new Info(fName, lName, address, city, state, zip, phone, email);
		return contact;
	}

	public static ArrayList<info> edit(ArrayList<info> list, String name) {
	public static ArrayList<Info> edit(ArrayList<Info> list, String name) {

		// method for edit
		Scanner stdlin = new Scanner(System.in);
		boolean flag = false;

		for (info entry : list) {
		for (Info entry : list) {

			if (entry.fName.equals(name)) {
				flag = true;
 public static info add() {
		return list;
	}

	public static ArrayList<info> delete(ArrayList<info> list, String name) {
	public static ArrayList<Info> delete(ArrayList<Info> list, String namedel) {

		// method for delete
		Scanner stdlin = new Scanner(System.in);

		boolean flag = false;

		try {
			for (info entry : list) 
			for (Info entry : list) 

				if (entry.fName.equals(name)) 
				if (entry.fName.equals(namedel)) 
					flag = true;
				}
		
					System.out.println("Contact deleted for " + entry.fName);
  public static info add() {
		catch (Exception e) {
		
		if (flag == false) {
			System.out.println("No entry found for " + name);
			System.out.println("No entry found for " + namedel);
		}
		return list;
		}
	

	// Sort By State
	private static void SortState() {
		System.out.println("Enter the name of the state");
		String getStatename = stdlin.next();
		Stream<Entry<String, ArrayList<Info>>> result = deathNote.entrySet().stream()
				.filter(map -> getStatename.equals(map.getValue()));
		System.out.println("Following persons belong to provided states:" + result);
	}

	// Sort by City
	private static void SortCity() {

		System.out.println("Enter the name of the city");
		String getCityname = stdlin.next();
		Stream<Entry<String, ArrayList<Info>>> result = deathNote.entrySet().stream()
				.filter(map -> getCityname.equals(map.getValue()));
		System.out.println("Following persons belong to provided city:" + result);
	}

	public static void main(String[] args) {

		Scanner stdlin = new Scanner(System.in);
  public static void main(String[] args) {
			System.out.println("1. Add a new contact.");
			System.out.println("2. Edit an existing contact.");
			System.out.println("3. Delete an existing contact.");
			System.out.println("4.Sort by City");
			System.out.println("5.Sort by State");

			user_input = stdlin.next();

			switch (user_input) {

			case "1": {
				info contact = makeentry.add(); // calling function to make new entry
			case "1":
				Info contact = makeentry.add(); // calling function to make new entry
				makeentry.addNewContact(contact); // Adding entry to record
				System.out.println(contact);
				break;
			}
			case "2": {

			case "2":
				System.out.println("Please enter First name of entry to be edited.");
				String name = stdlin.next();
				ArrayList<info> list = makeentry.edit(friends, name);
				ArrayList<Info> list = makeentry.edit(friends, name);
				break;
			}
			case "3": {

			case "3":
				System.out.println("Please enter First name of entry to be deleted.");
				String name = stdlin.next();
				friends = delete(friends, name);
				String namedel = stdlin.next();
				friends = delete(friends, namedel);
				break;
			}

			case "4":
				SortState();
				break;

			case "5":
				SortCity();
				break;

			default:
				break;

			}
		}

		// Removing duplicates (Only first entry is preserved,rest removed)
		List<info> noDuplicates = friends.stream().distinct().collect(Collectors.toList());
		System.out.println("List with duplicates removed:" + noDuplicates);
			// Removing duplicates (Only first entry is preserved,rest removed)
			List<Info> noDuplicates = friends.stream().distinct().collect(Collectors.toList());
			System.out.println("List with duplicates removed:" + noDuplicates);

		}
  }


	

 


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
	
		.filter(map -> getCityname.equals(map.getValue()));
System.out.println("Following persons belong to provided city:" + result);
}
private static void CountbyState() {
System.out.println("Enter the name of the state");
String getStatename= stdlin.next();
int count=Collections.frequency(deathNote.values(), getStatename);
System.out.println(count);

}
private static void CountbyCity() {
System.out.println("Enter the name of the city");
String getCityname= stdlin.next();
int count=Collections.frequency(deathNote.values(), getCityname);
System.out.println(count);

}
public static void main(String[] args) {

Scanner stdlin = new Scanner(System.in);
 public static void main(String[] args) {
	System.out.println("3. Delete an existing contact.");
	System.out.println("4.Sort by City");
	System.out.println("5.Sort by State");
	System.out.println("6.Count by State");
	System.out.println("7.Sort by City");


	user_input = stdlin.next();

	case "5":
		SortCity();
		break;

	case "6":
		CountbyState();
		break;

	case "7":
		CountbyCity();
		break;

	default:
		break;

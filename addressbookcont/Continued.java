package addressbookcont;
.filter(map -> getCityname.equals(map.getValue()));
System.out.println("Following persons belong to provided city:" + result);
}

// Count by State
private static void CountbyState() {
System.out.println("Enter the name of the state");
String getStatename= stdlin.next();
int count=Collections.frequency(deathNote.values(), getStatename);
String getStatename = stdlin.next();
int count = Collections.frequency(deathNote.values(), getStatename);
System.out.println(count);


}

// Count by city
private static void CountbyCity() {
System.out.println("Enter the name of the city");
String getCityname= stdlin.next();
int count=Collections.frequency(deathNote.values(), getCityname);
String getCityname = stdlin.next();
int count = Collections.frequency(deathNote.values(), getCityname);
System.out.println(count);

}

// Sort by first name
private static void SortByFirstName(ArrayList<Info> friends) {
Stream<Info> firstNameBasis =  friends.stream().sorted();
System.out.println(firstNameBasis);

}

public static void main(String[] args) {

Scanner stdlin = new Scanner(System.in);
@@ -159,7 +171,8 @@ public static void main(String[] args) {
// initiating user functions of entries

String user_input = "1";
while ((user_input.equals("1") || user_input.equals("2") || user_input.equals("3"))) {
while ((user_input.equals("1") || user_input.equals("2") || user_input.equals("3") || user_input.equals("4")
		|| user_input.equals("5") || user_input.equals("6") || user_input.equals("7"))) {

	// Checking in address list is present in hashmap
	System.out.print("Enter the Name of the Address Book: ");
@@ -182,7 +195,6 @@ public static void main(String[] args) {
	System.out.println("5.Sort by State");
	System.out.println("6.Count by State");
	System.out.println("7.Sort by City");


	user_input = stdlin.next();

@@ -213,15 +225,19 @@ public static void main(String[] args) {
	case "5":
		SortCity();
		break;
		

	case "6":
		CountbyState();
		break;
		

	case "7":
		CountbyCity();
		break;

	case "8":
		SortByFirstName(friends);
		break;

	default:
		break;


public class Jump {
	public static void main(String[] args) {

	int count = 0;
	while (count <= 20) {
	System.out.println(count % 2 == 1 ? "1" + " " + "2" + " " + "3" + " " + "4" : "1" + " " + "2" + " " + "3" + " " + "4");
	System.out.println(count % 4 == 1 ? "1" + " " + "2" + " " + "3" + " " + "4" : "1" + " " + "2" + " " + "3" + " " + "4" + " " + "5");
         ++count;
     }
}
}
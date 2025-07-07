public class firstOccurence {
	public static void main(String[] args) {

	String word = "Welcome to Java Programming";
	String r = " ";
	char ch;

	for (int i = 0; i < word.length(); i++) {
	ch = word.charAt(i);
	r = ch + r; 
}
	System.out.println(r);

}


}
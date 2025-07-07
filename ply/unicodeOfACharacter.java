public class unicodeOfACharacter {

	public static int character(char code) {
	int ch = code;
	return ch;
}

	public static char unicode(int code) {
	char ch = (char)code;
	return ch;
}

    public static void main(String[] args) {
	char first = 'A';
	int second = 65;
        System.out.println("The Unicode for the character " + first + " is: '" + character(first) + "'");
	 System.out.println("The character for the unicode " + second + " is: '" + unicode(second) + "'");

}
}

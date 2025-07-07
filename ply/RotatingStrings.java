public class RotatingStrings {
	public static void main(String[] args) {

	String input = "HELLO WO90LD";
        
        String result = " ";
        
	for (char letter : input.toCharArray()) {

	if (letter >= 'A' && letter <= 'Z') {
	int position = letter - 'A';
	position = position + 13;
	if (position > 25) position = position - 26;
       result = result + (char) ('A' + position);
}else {
                result = result + letter;
}
}
	System.out.println("Original: " + input);
        System.out.println("Rotated: " + result);
    }
}
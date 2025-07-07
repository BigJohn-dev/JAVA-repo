public class HeaderMethod {

	public static double hypotenuse(double side1, double side2) {
	double result1 = side1 * side1;
	double result2 = side2 * side2;
	
	double result = result1 + result2;

	return result;
}
	public static int smallest(int x, int y, int z) {
	int smallest = x;

	if (smallest > x){
smallest = x;
}else if (smallest > y) {
	smallest = y;
} else {
	smallest = z;
}
	return smallest;
}

	public static void instructions(){
	String message = """
	Please this are all methods in action...
	burray...
	""";
	System.out.println(message);
}

	public static float intToFloat(int number) {
	float value = (float) number;

	return value;
}

	public static void main(String[] args) {
	instructions();
	System.out.println(hypotenuse(2.5, 2.5));
	System.out.println(smallest(16, 23, 10));
	System.out.println(intToFloat(45));
}
}
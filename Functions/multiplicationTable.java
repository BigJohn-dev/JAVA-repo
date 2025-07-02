public class multiplicationTable {

	public static int multiplicationOf(int a, int b) {

	if(a < 0 || b < 0) {
	return 0;

}	else {

	//for(int i = a; i <= b; i++){
	//System.out.println(i + "|");
//}
	int counter;
	for (counter = a; counter <= b; counter++) {
		for(int count = a; count <= b; count++) {
		System.out.print("\t" + counter * count + "  ");
}
	System.out.println();
}

	return counter;
}


}
}



      
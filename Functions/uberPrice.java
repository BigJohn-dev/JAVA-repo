public class uberPrice {

	public static String ridePrice(int copies) {

	if (copies <= 0) {
	return "There is no price for " + copies + " number of copies";

}	else if (copies >= 1 && copies <= 4) {
	return "The number of copies " + copies + ", your price is N" + copies * 2000;

}	else if(copies >= 5 & copies <= 9) {
	return "The number of copies " + copies + ", your price is N" + copies * 1800;

}	else if(copies >= 10 & copies <= 29) {
	return "The number of copies " + copies + ", your price is N" + copies * 1600;

}	else if(copies >= 30 & copies <= 49) {
	return "The number of copies " + copies + ", your price is N" + copies * 1500;

}	else if(copies >= 50 & copies <= 99) {
	return "The number of copies " + copies + ", your price is N" + copies * 1300;

}	else if(copies >= 100 & copies <= 199) {
	return "The number of copies " + copies + ", your price is N" + copies * 1200;

}	else if(copies >= 200 & copies <= 499) {
	return "The number of copies " + copies + ", your price is N" + copies * 1100;

}	else if(copies >= 5000) {
	return "The number of copies " + copies + ", your price is N" + copies * 1000;
}
	return "The number of copies " + copies + ", your price is N30000";

}

}
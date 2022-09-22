class PartyOfWordy {
	
	public static void main(String[] args) {

	String s1 = "København";
	//charStart
	//int = indexLength
	System.out.println(s1.substring(1,5));

	//her kalder vi metoden fra main (denne sektion)
	System.out.println("Aalborg".length());
	System.out.println(printPartOfWord("Aalborg", 3, 4));
	
}

public static String printPartOfWord(String s, int index, int endIndex){
	return s.substring(index, endIndex);

}
}



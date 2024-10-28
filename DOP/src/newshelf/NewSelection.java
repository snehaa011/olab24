package newshelf;


public class NewSelection {

	// done: Complete this method 
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		
		// if (o instanceof IBook) {
		// 	if (o instanceof Comic c){
		// 		return c.title();
		// 	}
		// 	else if (o instanceof Fiction f){
		// 		return f.name();
		// 	}
		// 	else if (o instanceof TextBook t){
		// 		return t.subject();
		// 	}
		// }
		// return null;

		return switch(o){
			case Comic c -> c.title();
			// case Fiction f when f.name().startsWith("A") -> "Fiction starting with A: "+f.name();
			case Fiction f -> f.name();
			case TextBook t -> t.subject();
			default -> "";
		};
	}

	public static void main(String[] args) {
		
		// done: Write a test code here and execute and text.
		TextBook t = new TextBook("Physics");
		System.out.println(getAgeOrTitle(t));
		Comic c = new Comic("Dear Diary", 11);
		System.out.println(getAgeOrTitle(c));
		
	}
}

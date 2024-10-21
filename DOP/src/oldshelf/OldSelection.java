package oldshelf;

public class OldSelection {

	// TODO: Complete this method.
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		
		if (o instanceof Book) {
			if (o instanceof Comic c){
				return c.getTitle();
			}
			else if (o instanceof Fiction f){
				return f.getname();
			}
			else if (o instanceof TextBook t){
				return t.getsubject();
			}
		}
		return null;
	}

	public static void main(String[] args) {
		
		// TODO: Write a test code here and execute and text.
		TextBook t = new TextBook("Chemistry");
		Fiction f = new Fiction("Nancy Drew", FictionType.Comedy);
		Comic c = new Comic("Suppandi Diaries", 20);
		System.out.println(getAgeOrTitle(t));
		System.out.println(getAgeOrTitle(c));
		System.out.println(getAgeOrTitle(f));
	}
}

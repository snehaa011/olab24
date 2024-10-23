package oldshelf;

public class TextBook extends Book {

	// done: Make this a final field with most strict visiibility possible.
	private final String subject;
	
	// done: Change the constructor if required? Correct any errors
	public TextBook(String subject) {
		this.subject=subject;
	}

	// done : create a getter if required.
	public String getsubject(){
		return subject;
	}
	
	// done: Create a setter if required
	
	// done: write a toString method
	@Override
	public final String toString() {
		return subject;
	}

	@Override
	public final int hashCode(){
		return subject.length();
	}

	@Override
	public final boolean equals(Object o){
		if (o instanceof TextBook t){
			if (t.hashCode() == this.hashCode()){
				return true;
			}
		}
		return false;
	}

}

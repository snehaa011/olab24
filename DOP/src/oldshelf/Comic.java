package oldshelf;

public class Comic extends Book {

	/* done: Add most strict modifiers here*/ 
	private final String Title;

	// done: Warning to be removed.
	private final int ageOfMainCharacter;

	// done Correct the error
	public Comic(String t, int a) {
		Title=t;
		ageOfMainCharacter=a;
	}
	
	// done : create a getter if required.
	String getTitle(){
		return Title;
	}

	int getageOfMainCharacter(){
		return ageOfMainCharacter;
	}
	
	// done: Create a setter if required

	// done: write a toString method
	@Override
	public String toString() {
		return Title;
	}

	// done: Bonus: 
	@Override
	public int hashCode() {
		// done: Fill up an arbitrary hash method that takes into account only the age of main characted and the Strign title
		return ageOfMainCharacter+Title.length();
	}
	
	// done: Bonus: 
	@Override
	public boolean equals(Object o) {
		// done: Based on the information about hashCode write the equals method.
		if (o instanceof Comic c1){
			if (c1.hashCode()==this.hashCode()){
				return true;
			}
		}
		return false;
	}
}

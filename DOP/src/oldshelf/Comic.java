package oldshelf;

public class Comic extends Book {

	/* TODO: Add most strict modifiers here*/ 
	private final String Title;

	// TODO: Warning to be removed.
	private final int ageOfMainCharacter;

	// TODO Correct the error
	public Comic(String t, int a) {
		Title=t;
		ageOfMainCharacter=a;
	}
	
	// TODO : create a getter if required.
	String getTitle(){
		return Title;
	}

	int getageOfMainCharacter(){
		return ageOfMainCharacter;
	}
	
	// TODO: Create a setter if required

	// TODO: write a toString method
	@Override
	public String toString() {
		return Title;
	}

	// TODO: Bonus: 
	@Override
	public int hashCode() {
		// TODO: Fill up an arbitrary hash method that takes into account only the age of main characted and the Strign title
		return ageOfMainCharacter+Title.length();
	}
	
	// TODO: Bonus: 
	@Override
	public boolean equals(Object o) {
		// TODO: Based on the information about hashCode write the equals method.
		if (o instanceof Comic c1){
			if (c1.hashCode()==this.hashCode()){
				return true;
			}
		}
		return false;
	}
}

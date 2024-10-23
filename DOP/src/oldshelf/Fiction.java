package oldshelf;

public class Fiction extends Book {

	/* done: Add most strict modifiers here*/ 
	private final String name;
	// done: change 
	/**
	 * type is  a per instance object and it is initialized only once.
	 * 
	 */
	private final FictionType type;
	public Fiction(String n, FictionType t) {
		name=n;
		type=t;
		// done  correct the above.
	}

	String getname(){
		return name;
	}

	FictionType gettype(){
		return type;
	}

}

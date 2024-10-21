package oldshelf;

public class Fiction extends Book {

	/* TODO: Add most strict modifiers here*/ 
	private final String name;
	// TODO: change 
	/**
	 * type is  a per instance object and it is initialized only once.
	 * 
	 */
	private final FictionType type;
	public Fiction(String n, FictionType t) {
		name=n;
		type=t;
		// TODO  correct the above.
	}

	String getname(){
		return name;
	}

	FictionType gettype(){
		return type;
	}

}

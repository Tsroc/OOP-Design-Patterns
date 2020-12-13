package ie.gmit.dip;

public class StrCypherKey implements CypherKey{


	public StrCypherKey(String key) {
		super();
		this.key = key;
	}

	private String key;

	@Override
	public void setPattern(String key) throws CypherException {
		//CaesarCypher.this.key = 7;	//Refers to the container's instance variable.
		this.key = key;	//Refers to the inner class instance variable.
	}

	@Override
	public String getPattern() {
		return ""+key;
	}
	
}
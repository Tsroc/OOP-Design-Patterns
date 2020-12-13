package ie.gmit.dip;

public abstract class AbstractCypher implements Cypherable {

	private CypherKey key;

	public AbstractCypher() {
		super();
	}
	
	public abstract byte[] doCypher(byte[] bytes, boolean encrypt) throws CypherException;

	public byte[] encrypt(byte[] plainText) throws CypherException {
		doCypher(plainText, true);
			
		return plainText;
	}

	public byte[] decrypt(byte[] cypherText) throws CypherException {
		doCypher(cypherText, false);
		
		return cypherText;
	}

	public CypherKey getCypherKey() {
		return key;
	}

	public void setCypherKey(CypherKey key) {
		this.key = key;
	}

}
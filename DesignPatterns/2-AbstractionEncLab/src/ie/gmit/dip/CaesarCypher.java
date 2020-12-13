package ie.gmit.dip;

public class CaesarCypher extends AbstractCypher {
	
	public byte[] doCypher(byte[] bytes, boolean encrypt) throws CypherException {
		int k = Integer.parseInt(super.getCypherKey().getPattern());
		for(int i = 0; i < bytes.length; i++) {
			if(encrypt){
				bytes[i] += k;
			} else {
				bytes[i] -= k;
			}
		}
		return bytes;
	}

	
	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}
}

package ie.gmit.dip;

public class CypherRunner {
	public static void main(String[] args) throws CypherException {
		Cypherable cc = new VernamCypher();
		CypherKey ck = new StrCypherKey("DFSDFsdgSDGDSGDSGdsfgdsfGDSG");
		cc.setCypherKey(ck);
		
		String s = "Happy Days!";
		String t = cc.encrypt(s);

		System.out.println(t);
		System.out.println(cc.decrypt(t));
		
		//CaesarCypher.CypherKey cck;
	}
}

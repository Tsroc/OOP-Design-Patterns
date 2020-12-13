package ie.gmit.sw.builder;

public class Runner {
	public static void main(String[] args) throws Exception {
		CharacterDirector cd = new CharacterDirector();
		
		for (char i = 0; i < 1000; i++) {
			cd.append(i);
		}
		System.out.println(cd.getCharSequence());
		
	}
}

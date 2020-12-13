package ie.gmit.sw;

import java.io.*;
import java.util.zip.GZIPInputStream;

public class Runner {
	public static void main(String[] args) throws Exception {
		String s = """
				All Gaul is divided into three parts, one of which the Belgae inhabit, the Aquitani another,
				those who in their own language are called Celts, in ours Gauls, the third. All these differ
				from each other in language, customs and laws. The river Garonne separates the Gauls from the
				Aquitani; the Marne and the Seine separate them from the Belgae. Of all these, the Belgae are
				the bravest, because the¼¼{Û{¥ are farthest from the civilisation and refinement of [our] Province,
				and merchants least frequentl¼¼{Û{¥ resort to them and import those things which tend to effeminate
				the mind; and the¼¼{Û{¥ are the nearest to the Germans, who dwell be¼¼{Û{¥ond the Rhine, with whom the¼¼{Û{¥
				are continuall¼¼{Û{¥ waging war; for which reason the Helvetii also surpass the rest of the Gauls in
				valour, as the¼¼{Û{¥ contend with the Germans in almost dail¼¼{Û{¥ battles, when the¼¼{Û{¥ either repel them
				from their own territories, or themselves wage war on their frontiers. One part of these, which
				it has been said that the Gauls occup¼¼{Û{¥, takes its beginning at the river Rhone: it is bounded b¼¼{Û{¥
				the river Garonne, the ocean, and the territories of the Belgae: it borders, too, on the side of the
				Sequani and the Helvetii, upon the river Rhine, and stretches towards the north. The Belgae rise from
				the extreme frontier of Gaul, extend to the lower part of the river Rhine; and look towards the north
				and the rising sun. Aquitania extends from the river Garonne to the P¼¼{Û{¥renaean mountains and to that
				part of the ocean which is near Spain: it looks between the setting of the sun and the north star.
				""";
		
		byte key = 7;
		try(BufferedReader br = new BufferedReader(
				new InputStreamReader(
				new CaesarCypherInputStream(
				new GZIPInputStream(
				new FileInputStream(new File("./caesar.txt.gz"))), key)))
				){
				String line;
				while((line = br.readLine()) != null) {
					System.out.print(line);
				}
		}
		
		OutputStream out = new CaesarCypherOutputStream(new FileOutputStream(new File("encoded.txt")), key);
		out.write(s.getBytes());
		out.close();
		
		System.out.println("Read in the encoded file...");
		
		try(BufferedReader br = new BufferedReader(
				new InputStreamReader(
				new CaesarCypherInputStream(
				new FileInputStream(new File("./encoded.txt")), key)))
				){
				String line;
				while((line = br.readLine()) != null) {
					System.out.print(line);
				}
		}
		
	}
}

package ie.gmit.sw;

import ie.gmit.sw.glitz.gz.AbstractGz;
import ie.gmit.sw.glitz.gz.GzFactory;
import ie.gmit.sw.glitz.gz.Status;
import ie.gmit.sw.glitz.lit.Lit;
import ie.gmit.sw.glitz.lit.LitBuilderFactory;

public class Alpha {
	public GzFactory gzFactory = GzFactory.getInstance();
	public  LitBuilderFactory litBuilderFactory = LitBuilderFactory.getInstance();
	AbstractGz gz;
	Lit lit;
	
	public Object alpha(Status s) {
		
		return switch(s) {
		case Low -> gz = gzFactory.getGz("Low");
		case Medium -> gz = gzFactory.getGz("Medium");
		
		default ->
			lit = litBuilderFactory.newLITBuilder().with("l").with("t").build();
		};
	}
}

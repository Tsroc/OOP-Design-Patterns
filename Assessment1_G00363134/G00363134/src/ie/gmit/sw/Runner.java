package ie.gmit.sw;

import ie.gmit.sw.glitz.Glitz;
import ie.gmit.sw.glitz.gz.AbstractGz;
import ie.gmit.sw.glitz.gz.Status;
import ie.gmit.sw.glitz.lit.Lit;
import ie.gmit.sw.glitz.lit.LitBuild;

public class Runner {
	public static void main(String[] args) {
		Alpha alpha = new Alpha();
		
		Glitz glitz = (Glitz) alpha.alpha(Status.Extreme);
		
		if(glitz.getClass() == new LitBuild().build().getClass()) {
			((Lit) glitz).getStatus();
		} else {
			((AbstractGz) glitz).getStatus();
		}
			
		glitz.about();
	}
}

public class Ristkylik{
	
	//Tekitab muutujad a ja b double andmetüübiga
	double a, b;
	
	public Ristkylik(double pikkus, double laius){
		
		if(pikkus<=0){throw new RuntimeException("Sobimatu pikkus");}
		if(laius <=0){throw new RuntimeException("Sobimatu laius");}
		
		a=pikkus;
		b=laius;
	}
	//Arvutab Pindala
	public double pindala(){
		return a*b;
	}
	
	//Arvutab ümbermõõdu
	public double ymberm66t(){
		return a+b+a+b;
	}
	public String toString(){
		return "Ristkülik "+a+"x"+b+"m, mille ümbermõõt on: "+
		       ymberm66t()+"m, ning pindalaks "+pindala()+" ruutmeetrit.";
	}
}
package Lista03;


public class Urna{

	public static void main(String[] args) {
		
			
		Partido p1 = new Partido();
		p1.codigo = 1;
		p1.sigla = "XYZ";
		p1.nome = "BlaBlaBla";
		
		Partido p2 = new Partido();
		p2.codigo = 2;
		p2.sigla = "ABC";
		p2.nome = "BlaBlaBla";
		
		Partido p3 = new Partido();
		p3.codigo = 3;
		p3.sigla = "GHI";
		p3.nome = "BlaBlaBla";
		
			
			System.out.println(p1.codigo);
			System.out.println(p1.sigla);
			System.out.println(p1.nome);
			
			System.out.println(p2.codigo);
			System.out.println(p2.sigla);
			System.out.println(p2.nome);
			
			System.out.println(p3.codigo);
			System.out.println(p3.sigla);
			System.out.println(p3.nome);
	
			Candidato c1 = new Candidato();
			c1.numero = 111; 
			c1.nome = "Pedro";
			c1.cargo = "presidente";
			c1.partido = p1; 
			
			Candidato c2 = new Candidato();
			c2.numero = 222; 
			c2.nome = "Diego";
			c2.cargo = "presidente";
			c2.partido = p2; 
			
			Candidato c3 = new Candidato();
			c3.numero = 333; 
			c3.nome = "André";
			c3.cargo = "presidente";
			c3.partido = p3; 
			
			Candidato c4 = new Candidato();
			c4.numero = 444; 
			c4.nome = "Jean";
			c4.cargo = "presidente";
			c4.partido = p1; 
			
			Candidato c5 = new Candidato();
			c5.numero = 555; 
			c5.nome = "Alex";
			c5.cargo = "presidente";
			c5.partido = p2; 
			
			Candidato c6 = new Candidato();
			c6.numero = 555; 
			c6.nome = "Alex";
			c6.cargo = "presidente";
			c6.partido = p3; 
			
			Eleitor e = new Eleitor();
	
					 
			
			
			
			
			
			
	}

}

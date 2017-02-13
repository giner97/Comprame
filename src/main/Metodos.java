package main;

public class Metodos {
	
	//Metodo control enteros
	
	public static boolean controlEnteros(int entradaDatos, int numMin, int numMax){
				
		if((entradaDatos>numMin)||(entradaDatos<numMax)){
			
			return true;
					
		}
		
		else{
			
			return false;
			
		}

	}
	
	//Metodo control longitud cadenas
	
		public static boolean controlCadenas(String entradaDatos, int numMin, int numMax){
					
			if((entradaDatos.length()<numMin)||(entradaDatos.length()>numMax)){
				
				return true;
						
			}
			
			else{
				
				return false;
				
			}

		}
		
}


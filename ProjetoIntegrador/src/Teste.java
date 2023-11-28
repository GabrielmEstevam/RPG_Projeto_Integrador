
public class Teste {
	

	
	    public static String validadorVoltaMenu(String escolha)
	    {
	        if(escolha != "0"){
	             String ver = "Opa, parece que você digitou algo errado, poderia digitar de novo \n\n";
	             return ver;
	        }
	        else{
	            String fal = "Entao vamos la";
	            return fal;
	        }

	    }

	    public static String validadorMenu(char escolha){
	        if(escolha != '1' && escolha != '2' && escolha != '3' && escolha != '4')      {
	             String ver = "Opa, parece que você digitou algo errado, poderia digitar de novo ";
	             return ver;
	        }
	        else       {
	            String fal = "Entao vamos la";
	            return fal;
	        }
	    }
	

}

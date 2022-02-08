package Objeto;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Arraylist {	
		
		public static void main(String[] args) {
				
			objectz c1 = new objectz("Alexa", 15);
			objectz c2 = new objectz("Roberto", 16);
			objectz c3 = new objectz("Claudia", 14);
			objectz c4 = new objectz("mikael", 15);
			
        List<objectz> c = Arrays.asList(c1,c2,c3,c4);	
 	      Function<objectz, String> toStringz =	
          cz -> "Meu nome é " + cz.nome + " e eu tenho " + cz.idade + " anos" ;		
          
          Predicate<objectz> maiorq16 = cc -> cc.idade >= 16; 
   
    c.stream()
    .filter(maiorq16)
    .map(toStringz)
    .forEach(System.out::println);	
     
   
		
		}
	}



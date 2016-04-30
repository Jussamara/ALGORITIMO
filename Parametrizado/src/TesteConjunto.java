
public class TesteConjunto {
	
	public static void main(String[] args) {
	/*    ConjuntoEspalhamentoGenerico conjunto = 
	        new ConjuntoEspalhamentoGenerico();
	    conjunto.adiciona("Rafael");
	    conjunto.adiciona("Rafael");
	    conjunto.adiciona("Ana");
	    conjunto.adiciona("Paulo");

	    System.out.println(conjunto.pegaTodos());
	  */
	    ConjuntoEspalhamentoParametrizado conjunto = 
		        new ConjuntoEspalhamentoParametrizado();
		    conjunto.adiciona("Rafael");
		    conjunto.adiciona("Rafael");
		    conjunto.adiciona("Ana");
		    conjunto.adiciona("Paulo");

		    System.out.println(conjunto.pegaTodos());
	  }
	
}

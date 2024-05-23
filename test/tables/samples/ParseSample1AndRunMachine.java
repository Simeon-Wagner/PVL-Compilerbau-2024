package tables.samples;

import statemachine.StateMachine;
import tables.parser.Parser;
import tables.semantics.symbols.SemanticException;
import tables.semantics.symbols.Symbols;

public class ParseSample1AndRunMachine {
	
	public static void main(String[] args) throws SemanticException {		
		Parser p = Parser.fromFile("samples/sample1.txt");
		
		p.entries();
		
		Symbols s = p.getSymbols();
		System.out.println(s);
		
		StateMachine sm = new StateMachine(s.getTable("integer"));
		System.out.println(sm.toDetailedString());
		/*
		{
			sm.init();
			int pos = 0;
			String input = "1234";
			while(sm.isRunning()) {
				char c = (pos < input.length() ? input.charAt(pos++) : 0);
				sm.consume(c);
			}
			System.out.println("Consuption of '" + input + "' succeeded" + " : " + sm.succeeded());
		}
		
		{
			sm.init();
			int pos = 0;
			String input = "abc";
			while(sm.isRunning()) {
				char c = (pos < input.length() ? input.charAt(pos++) : 0);
				sm.consume(c);
			}
			System.out.println("Consuption of '" + input + "' succeeded" + " : " + sm.succeeded());
		}

		 */
	}

}

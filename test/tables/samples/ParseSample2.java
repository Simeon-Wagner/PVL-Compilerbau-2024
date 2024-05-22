package tables.samples;

import statemachine.StateMachine;
import tables.parser.Parser;
import tables.semantics.symbols.SemanticException;
import tables.semantics.table.Table;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ParseSample2 {
	public static void main(String[] args) throws SemanticException {
		Parser p = Parser.fromFile("samples/sample2.txt");
		p.entries();
		Table t = p.getSymbols().getTable("nondet");
		Set <Integer> res = new HashSet<>();
		Map<Set<Integer>, List<Set<Integer>>> deaMap = t.buildDEA();
		Table dea  = t.createTableFromTransformedDEA(deaMap);
		System.out.println(dea.toString());
		StateMachine sm = new StateMachine(dea);
		System.out.println(sm.toDetailedString());

		{
			sm.init();
			int pos = 0;
			String input = "aaaabbaab";
			while(sm.isRunning()) {
				char c = (pos < input.length() ? input.charAt(pos++) : 0);
				sm.consume(c);
			}
			System.out.println("Consuption of '" + input + "' succeeded" + " : " + sm.succeeded());
		}

		{
			sm.init();
			int pos = 0;
			String input = "b";
			while(sm.isRunning()) {
				char c = (pos < input.length() ? input.charAt(pos++) : 0);
				sm.consume(c);
			}
			System.out.println("Consuption of '" + input + "' succeeded" + " : " + sm.succeeded());
		}

		{
			sm.init();
			int pos = 0;
			String input = ""; //Leere Wort wird auch akzeptiert
			while(sm.isRunning()) {
				char c = (pos < input.length() ? input.charAt(pos++) : 0);
				sm.consume(c);
			}
			System.out.println("Consuption of '" + input + "' succeeded" + " : " + sm.succeeded());
		}

	}
}

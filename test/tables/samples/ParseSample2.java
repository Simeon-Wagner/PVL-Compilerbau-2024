package tables.samples;

import tables.parser.Parser;
import tables.semantics.symbols.SemanticException;
import tables.semantics.table.Table;

import java.util.HashSet;
import java.util.Set;

public class ParseSample2 {

	public static void main(String[] args) throws SemanticException {
		
		Parser p = Parser.fromFile("samples/sample2.txt");
		
		p.entries();
		Table t = p.getSymbols().getTable("nondet");
		Set <Integer> res = new HashSet<>();
		res = t.returnStatesEpsilons(res, 0);
		res.forEach(System.out::println);

		System.out.println("Table t Transitions");
		t.getTransitions().forEach(System.out::println);
		t.buildDEA();
		//System.out.println(p.getSymbols());
		
	}

}

package tables.samples;

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
		Map<Set<Integer>, List<Set<Integer>>> dea = t.buildDEA();
		t.renameAutomat(dea);
	}
}

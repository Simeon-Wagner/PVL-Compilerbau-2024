package tables.semantics.states;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StateSet extends State {
	
	private final Set<Integer> ids;
	
	public StateSet(String image) {
		List<Integer> ids = Arrays.stream(image.split("\\|")).map(s -> Integer.valueOf(s)).toList();
		this.ids = new TreeSet<>(ids);
	}
	
	public Set<Integer> getIds() {
		return ids;
	}

	public String toString() {
		return ids.toString();
	}

}

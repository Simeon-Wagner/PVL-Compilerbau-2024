package tables.semantics.table;

import java.util.List;

import tables.semantics.states.SingleState;
import tables.semantics.states.State;

public record Transition (SingleState from, List<State> to) {
}


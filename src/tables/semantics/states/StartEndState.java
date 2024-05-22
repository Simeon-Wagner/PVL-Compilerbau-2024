package tables.semantics.states;

public class StartEndState extends SingleState {
    public StartEndState(String image) {
        super(image.substring(0, image.length() - 1));
    }

    @Override
    public boolean isStart() {
        return true;
    }

    @Override
    public boolean isEnd() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "b";
    }
}
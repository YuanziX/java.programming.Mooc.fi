import java.util.ArrayList;

public class Pipe<T> {
    private ArrayList<T> pipe;

    public Pipe() {
        pipe = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        pipe.add(value);
    }

    public T takeFromPipe() {
        if (pipe.isEmpty()) return null ;
        T prev = pipe.get(0);
        pipe.remove(0);
        return prev;
    }

    public boolean isInPipe() {
        return !(pipe.isEmpty());
    }
}

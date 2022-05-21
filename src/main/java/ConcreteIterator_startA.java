import java.util.Iterator;
import java.util.List;

public class ConcreteIterator_startA implements Iterator {

    private List<String> concreteColection;
    private int position;

    public ConcreteIterator_startA() {

        concreteColection = new ConcreteColection().getWordsList();
        position = 0;
    }

    @Override
    public boolean hasNext() {
        if (position < concreteColection.size()) {
            position++;
            return true;
        }
        return false;
    }

    @Override
    public String next() {
        if (concreteColection.get(position-1).startsWith("a")) {
            return concreteColection.get(position - 1);
        }
        return null;
    }

}

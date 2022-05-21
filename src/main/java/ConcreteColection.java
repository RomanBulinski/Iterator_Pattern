import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteColection implements IterableCollection {
    private List<String> wordsList;

    public ConcreteColection() {
        wordsList = new ArrayList<>();
        wordsList.add("gacccc");
        wordsList.add("abba");
        wordsList.add("ccc1");
        wordsList.add("adddd");
        wordsList.add("aeeeeea");
    }

    public List<String> getWordsList() {
        return wordsList;
    }

    @Override
    public Iterator createIterator_startA() {
        return new ConcreteIterator_startA();
    }

    @Override
    public Iterator createIterator_endA() {
        return new ConcreteIterator_endA();
    }
}

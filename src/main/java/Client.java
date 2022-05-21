import java.util.Iterator;

public class Client {

    IterableCollection iterableCollection = new ConcreteColection();
    Iterator myIterator;

    public Client(Boolean flag) {
        if(flag){
            myIterator = iterableCollection.createIterator_startA();
        }else{
            myIterator = iterableCollection.createIterator_endA();
        }
    }

    public void print(){
        while(myIterator.hasNext()){
            if(myIterator.next() != null){
                System.out.println(myIterator.next());
            }
        }



    }

}

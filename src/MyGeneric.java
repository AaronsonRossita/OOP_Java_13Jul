public class MyGeneric<T> {

    private T item;

    public MyGeneric(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void printClassName(){
        System.out.println(item.getClass());
    }
}

//Pair<K,V>

import java.util.HashMap;

// Разработать программу, имитирующую поведение коллекции HashSet. 
// В программе содать метод add добавляющий элемент, 
// метод toString возвращающий строку с элементами множества и метод 
// позволяющий читать элементы по индексу. Формат данных Integer.
public class Home_work_6 {

public static void main(String[] args) {
    MySet mySet = new MySet();
    mySet.add(4);
    mySet.add(56);
    mySet.add(12);
    System.out.println(mySet);

    for (int e = 0; e < mySet.size(); e++) {
        System.out.println(mySet.get(e));
    }
}
}
class MySet {
    private HashMap<Integer, Object> map = new HashMap<>();
    private final Object OBJ = new Object();
    @Override
    public String toString() {
        return map.keySet().toString();
    }

    public boolean add(Integer i) {
        return map.put(i, OBJ) != null ? true : false;
    }

    public Integer size() {
        return map.keySet().size();
    }

    public Integer get(Integer a) {
        return (Integer) map.keySet().toArray()[a];
    }
}
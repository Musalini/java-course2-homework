package generics;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Hello", 20);
        System.out.println("value1 = " + pair.getValue1());
        System.out.println("value2 = " + pair.getValue2());

        Pair<Integer, Double> pair2 = new Pair<>(20, 3.14);
        System.out.println("value1 = " + pair2.getValue1());
        System.out.println("value2 = " + pair2.getValue2());

        OtherPair<Integer> pair3 = new OtherPair<>(20,13);
        System.out.println("value1 = " + pair3.getValue1());
        System.out.println("value2 = " + pair3.getValue2());
    }
}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }
}

class OtherPair<V> {
    private V value1;
    private V value2;

    public <V> V abc(V value){
        return value;
    }

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }
}

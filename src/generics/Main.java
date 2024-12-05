package generics;

public class Main {

public static void main(String[] args) {
    GenericsTask<String> obj = new GenericsTask<>("Tofiq");
    GenericsTask<Integer> obj1 = new GenericsTask<>(34);
     obj.pr();
     obj1.pr();
}

}

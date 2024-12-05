package generics;

public class GenericsTask <T> {
        T   obj;
    public GenericsTask(T obj) {
        this.obj = obj;
    }
    public void pr (){
        System.out.println(obj);
    }

}

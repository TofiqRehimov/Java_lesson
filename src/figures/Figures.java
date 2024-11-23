package figures;

public abstract class Figures {
   public String name;
   public int line;

    public Figures(int line, String name) {
        this.line = line;
        this.name = name;
    }
     abstract void draw();
      public void figures(){
        System.out.println("figures");

    }

    @Override
    public String toString() {
        return  line +  " " +name ;
    }
}

public class Cars {
    String name;
    String carsClass;
    Integer Speed;

    public String setName(String name){
       return this.name = name;

    }
    public String getName(){
        return this.name;
    }
    public String setCarsClass(String carsClass){
        this.carsClass = carsClass;
        return carsClass;
    }
    public String getCarsClass(){
        return this.carsClass;
    }
    public int setSpeed(Integer Speed){
       return this.Speed = Speed;

    }
    public Integer getSpeed(){
        return this.Speed;
    }

    public Cars() {
    }

    public Cars(Integer speed, String name, String carsClass) {
      this.Speed = speed;
      this.name = name;
      this.carsClass = carsClass;
    }



//    public Cars(String carsClass, Integer speed) {
//        this.name = name;
//        this.carsClass = carsClass;
//        this.Speed = speed;
//    }

}

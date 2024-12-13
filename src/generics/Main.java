package generics;

public class Main {

    public static <T> void main(String[] args) {
//    GenericsTask<String> obj = new GenericsTask<>("Tofiq");
    GenericsTask<Integer> obj1 = new GenericsTask<>(34);
//     obj.pr();
//     obj1.pr();


        Students students = new Students("Tofiq",2);
        Students students2 = new Students("Tofiq",2);
//        students.setStudentName("John");
//        students.setStudentID(1);
        students.addCourse("ATL Academy");
        students.addCourse("Code Academy");
        students2.displayInfo();

        CourseGenerics<T> courseGenerics = new CourseGenerics<>("ATl academy",Subject.BACKENTENT);
        courseGenerics.addStudent((T) students);
      courseGenerics.displayInfoCourse();
    }

}

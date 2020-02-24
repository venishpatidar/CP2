import java.util.*;
class person{
  String name;
  person(String name){
    this.name = name;

  }

  String get_name(){
    return this.name;
  }


}
class Student extends person{
  List<String> courses = new ArrayList<String>();
  List<Integer> num = new ArrayList<>();
  Student(String name){
    super(name);
  }
  void addCourseandGrade(int marks,String courseName){
    courses.add(courseName);
    num.add(marks);
  }
  void printScore(){
    System.out.println(num);
    System.out.println(courses);
  }
  String get_avg(){
    int avg =0;
    for(int i =0;i<num.size();i++){
      avg = avg+num.get(i);
    }
    avg = avg/num.size();
    System.out.println(avg);
    String s = "The avg of marks is " + avg + "\n";
    return s;
  }


/*
  public static void main(String[] args){
    Student s = new Student("ad","d");
    s.addCourseandGrade(95,"Maths");
    s.addCourseandGrade(96,"Physic");
    s.addCourseandGrade(95,"Chemistry");
    s.printScore();
    s.get_avg();

  }
*/

}

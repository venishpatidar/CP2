import java.util.*;
class person{
  String name;
  String addr;
  person(String name,String addr){
    this.name = name;
    this.addr = addr;
  }

  String get_name(){
    return this.name;
  }
  String get_addr(){
    return this.addr;
  }

}
class Student extends person{
  List<String> courses = new ArrayList<String>();
  List<Integer> num = new ArrayList<>();
  Student(String name,String addr){
    super(name,addr);
  }
  void addCourseandGrade(int marks,String courseName){
    courses.add(courseName);
    num.add(marks);
  }
  void printScore(){
    System.out.println(num);
    System.out.println(courses);
  }
  void get_avg(){
    int avg =0;
    for(int i =0;i<num.size();i++){
      avg = avg+num.get(i);
    }
    avg = avg/num.size();
    System.out.println(avg);
  }



  public static void main(String[] args){
    Student s = new Student("ad","d");
    s.addCourseandGrade(95,"Maths");
    s.addCourseandGrade(96,"Physic");
    s.addCourseandGrade(95,"Chemistry");
    s.printScore();
    s.get_avg();

  }

}

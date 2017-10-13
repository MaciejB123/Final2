package package2;
  
import java.util.ArrayList;

import org.joda.time.DateTime;

import package1.Course_programme;
import package1.Module;
import package1.Student;

  
 public class Test{
   
  Student test = new Student(22,"31/05/1995","Maciej"); 
  Student test1 = new Student(23,"31/05/1994","Tim"); 
  Student test2 = new Student(24,"31/05/1993","John"); 
  Student test3 = new Student(25,"31/05/1992","Mike");
  Student test4 = new Student(26,"31/05/1991","Jim"); 
  Student test5 = new Student(27,"31/05/1990","Simon"); 
  Student test6 = new Student(21,"31/05/1996","Daniel"); 
  Student test7 = new Student(20,"31/05/1997","Stephen"); 
  Student test8 = new Student(19,"31/05/1998","Gary"); 
  Student test9 = new Student(18,"31/05/1999","Craig");
  
  public void test (){
  
  ArrayList<Student> listofStudents = new ArrayList<Student>();
  listofStudents.add(test); listofStudents.add(test1);
  listofStudents.add(test2); listofStudents.add(test3);
  
  ArrayList<Student> listofStudents1 = new ArrayList<Student>();
  listofStudents1.add(test4); 
  listofStudents1.add(test5);
  listofStudents1.add(test6);
  
  ArrayList<Student> listofStudents2 = new ArrayList<Student>();
  listofStudents1.add(test7); 
  listofStudents1.add(test8);
  listofStudents1.add(test9);
  
  Module testModule = new Module("Programming", "CT100", listofStudents);
  Module testModule1 = new Module("Programming2", "CT200", listofStudents1);
  Module testModule2 = new Module("Programming3", "CT200", listofStudents2);
  
  ArrayList<Module> listofModules = new ArrayList<Module>();
  
  listofModules.add(testModule); 
  listofModules.add(testModule1);
  listofModules.add(testModule2);
  
  Course_programme testProgramme = new Course_programme("Computer Science",listofModules, DateTime.now(), DateTime.now());
  
  String output = testModule.toString(); 
  String output1 = testModule1.toString(); 
  String output2 = testModule2.toString(); 
  String output3 = testProgramme.toString();
  
  System.out.println(output); 
  System.out.println(output1);
  System.out.println(output2); 
  System.out.println(output3); 
  }
  
 }
 
 
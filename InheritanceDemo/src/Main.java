import Business.UserManager;
import Business.InstructorManager;
import Business.StudentManager;
import Business.UserManager;
import Entities.Instructor;
import Entities.Student;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		Instructor instructor=new Instructor(1,"Engin DEMİROĞ","MCT,PMP,ITIL");
		Instructor instructor2 = new Instructor(2,"Kerem Varış","Eğitmen");
		
		Student student1=new Student(2,"Fatmanur GÜNEY",33453,"fnuravci@outlook.com","11111");
		Student student2=new Student(3,"Ali Asaf GÜNEY",1069,"asaf@gmail.com","222222");
		Student[] students= {student1,student2};
		
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.Add(instructor);
		instructorManager.Delete(instructor2);
		
		StudentManager studentManager=new StudentManager();
		studentManager.multipleAdd(students);
		studentManager.Update(student1);
		

	}

}

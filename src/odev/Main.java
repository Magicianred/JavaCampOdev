package odev;

public class Main {

	public static void main(String[] args) {	
	Lesson lesson1 =new Lesson(1, "Yaz�l�m Geli�tirici Kamp�(C# and ANGULAR)", "Engin Demiro�");
	Lesson lesson2 = new Lesson(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�(JAVA and REACT,)", "Engin Demiro�" );
	
	Lesson lesson3 = new Lesson();
	lesson3.id =3;
	lesson3.name = "Programlamaya Giri�";
	lesson3.instructor = "Engin Demio�";

	
	
	Lesson[] lessons = {lesson1, lesson2, lesson3};
	
	for (Lesson lesson : lessons) {
		System.out.println(lesson.name);
	}
	System.out.println(lessons.length);
	
	LessonManager lessonManager = new LessonManager();
	lessonManager.addLessons(lesson1);
	lessonManager.addLessons(lesson2);
	lessonManager.addLessons(lesson3);

	lessonManager.deleteLessons(lesson1);
	lessonManager.deleteLessons(lesson2);
	lessonManager.deleteLessons(lesson3);
	
	

		
	}
}

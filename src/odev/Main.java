package odev;

public class Main {

	public static void main(String[] args) {	
	Lesson lesson1 =new Lesson(1, "Yazýlým Geliþtirici Kampý(C# and ANGULAR)", "Engin Demiroð");
	Lesson lesson2 = new Lesson(2, "Yazýlým Geliþtirici Yetiþtirme Kampý(JAVA and REACT,)", "Engin Demiroð" );
	
	Lesson lesson3 = new Lesson();
	lesson3.id =3;
	lesson3.name = "Programlamaya Giriþ";
	lesson3.instructor = "Engin Demioð";

	
	
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

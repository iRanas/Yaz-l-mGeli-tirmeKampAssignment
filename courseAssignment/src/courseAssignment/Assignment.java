package courseAssignment;

public class Assignment {

	public static void main(String[] args) {
		Course course1 = new Course(1332369, "Java", "Engin Demiro�");
		Course course2 = new Course(1235979, "C#", "Engin Demiro�");

		Course[] courses = { course1, course2 };

		for (Course course : courses) {
			System.out.println(course.coursename +" "+ course.id +" " +course.instructor);

		}

		Webs�teCategory category1 = new Webs�teCategory("S�k sorulan sorular");
		Webs�teCategory category2 = new Webs�teCategory("T�m Kurslar");

		Webs�teCategory[] categories = { category1, category2 };
		
		for (Webs�teCategory webs�teCategory : categories) {
			System.out.println("Kategori :"+ webs�teCategory.categoryName);
			
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.completeTheCourse(course1);
		courseManager.completeTheCourse(course2);

		
		}

	}



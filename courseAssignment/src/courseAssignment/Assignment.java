package courseAssignment;

public class Assignment {

	public static void main(String[] args) {
		Course course1 = new Course(1332369, "Java", "Engin Demiroð");
		Course course2 = new Course(1235979, "C#", "Engin Demiroð");

		Course[] courses = { course1, course2 };

		for (Course course : courses) {
			System.out.println(course.coursename +" "+ course.id +" " +course.instructor);

		}

		WebsýteCategory category1 = new WebsýteCategory("Sýk sorulan sorular");
		WebsýteCategory category2 = new WebsýteCategory("Tüm Kurslar");

		WebsýteCategory[] categories = { category1, category2 };
		
		for (WebsýteCategory websýteCategory : categories) {
			System.out.println("Kategori :"+ websýteCategory.categoryName);
			
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.completeTheCourse(course1);
		courseManager.completeTheCourse(course2);

		
		}

	}



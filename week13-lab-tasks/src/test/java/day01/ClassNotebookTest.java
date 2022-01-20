package day01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ClassNotebookTest {

	@Test
	void addStudentTest() {
		ClassNotebook cn = new ClassNotebook();

		Student s = new Student(1, "John");
		cn.addStudent(s);
		assertTrue(cn.getNotebook().keySet().contains(s));
		assertEquals(0, cn.getNotebook().get(s).size());
	}

	@Test
	void addStudentInOrderTest() {
		ClassNotebook cn = new ClassNotebook();
		Student s1 = new Student(1, "John");
		Student s2 = new Student(3, "John");
		Student s3 = new Student(2, "John");
		cn.addStudent(s1);
		cn.addStudent(s2);
		cn.addStudent(s3);

		assertEquals(List.of(s1,s3,s2), new ArrayList<>(cn.getNotebook().keySet()));

		int i = 1;
		for(Map.Entry<Student, List<Integer>> actual : cn.getNotebook().entrySet()) {
			assertEquals(i, actual.getKey().getId());
			i++;
		}

//		Set<Student> referenceSet = Set.of(s1, s2, s3);
//
//		assertEquals(referenceSet, cn.getNotebook().keySet());
	}


	@Test
	void addMarkTest() {
		ClassNotebook cn = new ClassNotebook();

		Student s1 = new Student(1, "John");
		Student s2 = new Student(3, "John");
		Student s3 = new Student(2, "John");
		cn.addStudent(s1);
		cn.addStudent(s2);
		cn.addStudent(s3);

		cn.addMark(1,2);

		assertEquals(2,cn.getNotebook().get(2).get(0));

	}
}
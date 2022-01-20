package day01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ClassNotebook {
	private int mark;
	private Map<Student, List<Integer>> notebook = new TreeMap<>();

	public int getMark() {
		return mark;
	}

	public Map<Student, List<Integer>> getNotebook() {
		return notebook;
	}

	public void addStudent(Student student) {
		notebook.put(student, new ArrayList<>());
	}

	public void addMark(int id, int mark) {
		for (Map.Entry<Student, List<Integer>> actual : notebook.entrySet()) {
			if(actual.getKey().getId()==id) {
				actual.getValue().add(mark);
			}
		}

	}
}

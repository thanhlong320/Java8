package stream_api;

import stream_api.model.Classroom;
import stream_api.model.Student;

import java.util.*;
import java.util.stream.Collectors;

public class SampleStreamAPI {
    private static List<Student> studentList = new ArrayList<>();
    private static Map<Classroom, Student> classroomStudentMap = new HashMap<>();
    static{
        Classroom classroomC = new Classroom(1, "DH18DTC");
        Classroom classroomB = new Classroom(2, "DH18DTB");
        Classroom classroomA = new Classroom(3, "DH18DTA");
        Student student1 = new Student(1, "Nguyen Thanh Long", 22, classroomA);
        Student student2 = new Student(2, "Nguyen Van Phat", 20, classroomB);
        Student student3 = new Student(3, "Ta Anh Kiet", 1, classroomC);
        Student student4 = new Student(4, "Vuong Minh Dat", 26, classroomC);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
    }

    public static Student findStudentById(int id){
        System.out.println("Find Student By Id: " + id);
        return studentList.stream().filter(student -> student.getId() == id).findAny().orElse(null);
    }

    public static List<String> getAllStudentName(){
        return studentList.stream().map(Student::getName).collect(Collectors.toList());
    }

    public static void printAllStudentName(){
        getAllStudentName().forEach(System.out::println);
    }

    public static long countStudentName(String startWord){
        return studentList.stream().filter(student -> student.getName().startsWith(startWord)).count();
    }

    public static List<Student> getStudentByClassroomName(String classroomName){
        Map<Classroom, List<Student>> classroomListMap = studentList.stream().collect(Collectors.groupingBy(Student::getClassroom));
        for(Map.Entry<Classroom, List<Student>> classroomListEntry : classroomListMap.entrySet()){
            if ( classroomListEntry.getKey().getName().equals(classroomName)) return classroomListEntry.getValue();
        }
        return null;
    }

    public static void main(String[] args) {
        SampleStreamAPI.printAllStudentName();
        System.out.println(SampleStreamAPI.findStudentById(1).toString());
        System.out.println("Total student has name start with Nguyen: " + SampleStreamAPI.countStudentName("Nguyen"));
        System.out.println("All student in classroom DH18DTC: " + SampleStreamAPI.getStudentByClassroomName("DH18DTC"));
    }
}

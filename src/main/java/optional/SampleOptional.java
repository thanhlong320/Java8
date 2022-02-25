package optional;

import stream_api.SampleStreamAPI;
import stream_api.model.Classroom;
import stream_api.model.Student;

import java.util.Optional;

public class SampleOptional {
    public static Student findStudenById(int id){
        Student student = SampleStreamAPI.findStudentById(id);
        Optional<Student> optionalStudent = Optional.of(student);
        if (optionalStudent.isPresent())
            return student;
        else return null;
    }

    public static String findClassroomNameByStudentId(int id) {
        Optional<Student> user = Optional.ofNullable(SampleStreamAPI.findStudentById(id));
        return user.map(Student::getClassroom)
                .map(Classroom::getName)
                .orElse("not specified");
    }

    public static void main(String[] args) {
        System.out.println(SampleOptional.findStudenById(1).toString());
        System.out.println(SampleOptional.findClassroomNameByStudentId(2));
        System.out.println(SampleOptional.findClassroomNameByStudentId(10));
    }
}

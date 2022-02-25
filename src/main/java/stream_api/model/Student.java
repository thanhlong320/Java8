package stream_api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Student {
    private int id;
    private String name;
    private int age;
    private Classroom classroom;
}

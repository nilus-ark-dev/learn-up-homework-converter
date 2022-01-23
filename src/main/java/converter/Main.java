package converter;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Student student = new Student();
        student.setId(123);
        student.setName("Павел");
        student.setGroup("Java 1.01");
        
        Converter.toJSON(student);
        Converter.toJavaObject(student);
    }
}

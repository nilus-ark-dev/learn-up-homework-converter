package converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Converter {

    public static void toJSON(Student student) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(student);
        System.out.println("json " + jsonString);
    }

    public static void toJavaObject(Student student) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(student);
        Student newStudent = mapper.readValue(jsonString, Student.class);
        newStudent.say();
    }
}

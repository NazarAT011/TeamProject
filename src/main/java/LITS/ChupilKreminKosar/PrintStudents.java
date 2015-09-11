package LITS.ChupilKreminKosar;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class PrintStudents {
    public static void main(String[] args) throws IOException {
        InputStream input = new FileInputStream("students.json");

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objectMapper
                .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

        TypeFactory typeFactory = TypeFactory.defaultInstance();
        List<Student> StudentInformation = objectMapper.readValue(input, typeFactory
                .constructCollectionType(ArrayList.class, Student.class));
        System.out.println("\tSorted data by Surname name and age \n");

        StudentsComparator toComparator = new StudentsComparator();

        Collections.sort(StudentInformation, toComparator);
        for (int i = 0; i < StudentInformation.size(); i++) {
            System.out.println("" + StudentInformation.get(i));
            System.out.println();
        }
    }
}
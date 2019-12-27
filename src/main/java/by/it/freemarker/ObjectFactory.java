package by.it.freemarker;

import by.it.freemarker.beans.JBeans;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class ObjectFactory {

    public List<JBeans> getListOfBeans() {
        List<JBeans> listOfBeans = null;
        ObjectMapper objectMapper = new ObjectMapper ();
        objectMapper.configure (DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        File file = new File ("C:\\ProgramFiles\\Java\\freemarker\\src\\main\\resources\\persons.json");
        try {
            listOfBeans = Arrays.asList (objectMapper.readValue (file, JBeans[].class));
        } catch (IOException e) {
            e.printStackTrace ();
        }
        return listOfBeans;
    }
}

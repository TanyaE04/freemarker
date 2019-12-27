package by.it.freemarker;

import by.it.freemarker.beans.JBeans;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Template template = Config.getInstance ().getTemplate ();
        Map root = new HashMap ();
        List<JBeans> listOfBeans = new ObjectFactory ().getListOfBeans ();
        for (int i = 0; i < listOfBeans.size (); i++) {
            root.put ("obj", listOfBeans.get (i));
            try (FileWriter writer = new FileWriter ("person" + i + ".xml", false);) {
                template.process (root.get ("obj"), writer);
            } catch (TemplateException e) {
                e.printStackTrace ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }
    }
}

package by.it.freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

import java.io.File;
import java.io.IOException;

public class Config {
    private Template template;
    private static Config instance = new Config ();

    public static Config getInstance() {
        return instance;
    }

    private Config() {
        Configuration configuration = new Configuration (Configuration.VERSION_2_3_29);
        try {
            configuration.setDirectoryForTemplateLoading (new File ("C:\\ProgramFiles\\Java\\freemarker\\src\\main\\resources"));
            configuration.setDefaultEncoding ("UTF-8");
            configuration.setTemplateExceptionHandler (TemplateExceptionHandler.RETHROW_HANDLER);
            configuration.setLogTemplateExceptions (false);
            configuration.setWrapUncheckedExceptions (true);
            configuration.setFallbackOnNullLoopVariable (false);
            this.template = configuration.getTemplate ("template.ftlh");
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }

    public Template getTemplate() {
        return template;
    }
}

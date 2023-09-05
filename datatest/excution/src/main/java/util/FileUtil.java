package util;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileUtil {
    public static String writeTmpFile(String prefix, String suffix, String content) {
        File tmp;
        try {
            tmp = File.createTempFile(prefix, suffix);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(tmp), StandardCharsets.UTF_8));
            writer.write(content);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return tmp.getPath();
    }

}

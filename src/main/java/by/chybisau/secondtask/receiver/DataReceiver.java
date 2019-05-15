package by.chybisau.secondtask.receiver;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Maksim Chybisau on 15/05/19.
 * @version 0.0.1
 */

public class DataReceiver {

    public static List<String> obtainData(String path) throws IOException {
        File f = new File(path);
        if (path == null || !f.exists()) {
            throw new FileNotFoundException("File with input dates not found");
        }
        return Files.lines(Paths.get(path)).collect(Collectors.toList());
    }
}


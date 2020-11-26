package com.education.FileTourist;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteModelListService {

    public static void writeToFile(String fileName, List<FileLocationModel> files) throws IOException {

        File out = new File(fileName);
        FileWriter writer = new FileWriter(out);
        for (FileLocationModel fileLocation: files) {
            String line = "";
            if (fileLocation.getOffset() == 0) {
                line = fileLocation.getName() + "\n";
            } else {
                line = String.format("%1$" + (fileLocation.getOffset() * 3) + "s", "") + fileLocation.getName() + "\n";
            }
            writer.write(line);
        }
        writer.flush();
        writer.close();
    }

}

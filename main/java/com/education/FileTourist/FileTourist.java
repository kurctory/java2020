package com.education.FileTourist;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileTourist {


    private static List<FileLocationModel> doTravel(File file, int offset) {
        List<FileLocationModel> files = new ArrayList<>();
        files.add(new FileLocationModel(file.getName(), offset - 1));
        for (File subfile: file.listFiles()) {
            if (subfile.isDirectory()) {
                files.addAll(doTravel(subfile, offset + 1));
            } else {
                files.add(new FileLocationModel(subfile.getName(), offset));
            }
        }
        return files;
    }

    public static List<FileLocationModel> travel(String path) {
        File root = new File(path);
        List<FileLocationModel> files = doTravel(root, 1);
        return files;
    }

}

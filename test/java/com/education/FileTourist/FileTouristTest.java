package com.education.FileTourist;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.io.File;

class FileTouristTest {

    @Test
    void travel() throws IOException {
        String userDirectory = new File("").getAbsolutePath();
        String test = new File("test").getCanonicalPath();
        List<FileLocationModel> files = FileTourist.travel(userDirectory);
        WriteModelListService.writeToFile("src/test/java/com/education/FileTourist/test.txt", files);
    }
}
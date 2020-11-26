package com.education.FileTourist;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

class FileTouristTest {

    @Test
    void travel() throws IOException {
        List<FileLocationModel> files = FileTourist.travel("C:\\Users\\Dns\\IdeaProjects\\task1_ATM\\src\\main\\java\\com\\education");
        WriteModelListService.writeToFile("src/test/java/com/education/FileTourist/test.txt", files);
    }
}
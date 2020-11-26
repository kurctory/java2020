package com.education.FileTourist;

public class FileLocationModel {
    private String name;
    private int offset;

    public FileLocationModel(String name, int offset) {
        this.name = name;
        this.offset = offset;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getName() {
        return name;
    }

    public int getOffset() {
        return offset;
    }
}

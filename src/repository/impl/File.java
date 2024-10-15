package repository.impl;

import repository.FileComponent;

public class File implements FileComponent {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ShowDetails() {
        System.out.println("File: " + fileName);
    }
}

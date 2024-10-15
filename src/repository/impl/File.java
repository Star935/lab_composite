package repository.impl;

import repository.FileComponent;

public class File implements FileComponent {
    private String fileName;

    public File(String fileName) { // Constructor del File
        this.fileName = fileName;
    }

    @Override
    public void ShowDetails() { // Imprime en la terminal el nombre del File
        System.out.println("File: " + fileName);
    }
}

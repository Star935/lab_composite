package repository.impl;

import repository.FileComponent;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileComponent {
    private String folderName;
    private List<FileComponent> files = new ArrayList<>();

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    public void add(FileComponent file) {
        files.add(file);
    }

    public void remove(FileComponent file) {
        files.remove(file);
    }

    @Override
    public void ShowDetails() {
        System.out.println("Folder: " + folderName);
        for (FileComponent file : files) {
            file.ShowDetails();
        }
    }
}

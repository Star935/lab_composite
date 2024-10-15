package repository.impl;

import repository.FileComponent;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileComponent {
    private String folderName;
    private List<FileComponent> files = new ArrayList<>();

    public Folder(String folderName) { // Constructor del Folder
        this.folderName = folderName;
    }

    public void add(FileComponent file) { // Agrega un File a la lista
        files.add(file);
    }

    public void remove(FileComponent file) { // Elimina un File de la lista
        files.remove(file);
    }

    @Override
    public void ShowDetails() { // Imprime en la terminal el nombre del Folder y todos los Files que contiene
        System.out.println("Folder: " + folderName);
        for (FileComponent file : files) {
            file.ShowDetails();
        }
    }
}

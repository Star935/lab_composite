import repository.impl.File;
import repository.impl.Folder;

public class Main {
    public static void main(String[] args) {
        // Inicializa un nuevo folder para guardar un archivo
        Folder root = new Folder("Root");
        File document = new File("Document.txt");
        root.add(document);

        // Inicializa un nuevo archivo para utilizar el método de elimianr
        File documentRemove = new File("Doc.txt");
        root.add(documentRemove);

        // Inicializa un nuevo folder para varias imagenes
        Folder images = new Folder("Images");
        images.add(new File("Image1.png"));
        images.add(new File("Image2.png"));
        images.remove(new File("Image3.png"));

        // Guarda todos las imagenes
        root.add(images);

        // Elimina un archivo
        root.remove(documentRemove);

        // Imprime todas los folders y archivos que cada uno tiene
        root.ShowDetails();
    }
}
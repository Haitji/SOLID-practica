package com.kreitek.service;

import com.kreitek.files.Directory;
import com.kreitek.files.File;
import com.kreitek.files.FileSystemItem;

import java.util.List;

public class FileManager {

    public static int calculateSize(FileSystemItem fileSystemItem) {
        //Aqui incumplia el principio de abierto cerrado, porque usabamos una cadena de ifs en lugar de hacer un metodo abstracto.
        return fileSystemItem.getSize();
    }


    // Aquí habría otros métodos para gestionar ficheros y directorios:
    // Crear ficheros, mover ficheros, eliminar ficheros, etc.
}

package com.kreitek.files;

import java.util.List;

public interface FileSystemItem {
    /*
     Aqui estamos incumpliendo el principio de segregación de interfaces, porque esta interfaz esta gestionando tanto a los directorio como a
     los ficheros, y por ente hay varios métodos que solo se puede usar en una clase y en la otra no.
     */
    String getName();
    void setName(String name);
    FileSystemItem getParent();
    void setParent(FileSystemItem directory);
    String getFullPath();
    String getExtension();
    List<FileSystemItem> listFiles();
    void addFile(FileSystemItem file);
    void removeFile(FileSystemItem file);
    int getSize();
    void open();
    void close();
    void setPosition(int numberOfBytesFromBeginning);
    byte[] read(int numberOfBytesToRead);
    void write(byte[] buffer);

}

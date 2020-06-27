package com.company;

import java.util.Arrays;

public class Directory {
    String name;
    File[] mas;
    int size;
    public Directory(String name){
        this.name = name;
        this.mas = new File[100];
        this.size = 0;
    }
    public void addFile(File file){
        mas[size] = file;
        size+=1;
    }
    public void deleteFile(File file){
        for(int i = 0; i < size;i++){
            if(mas[i] == file){
                for(int j = i; j < size-1;j++){
                    mas[j] = mas[j+1];
                }
                size-=1;
                return;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<size;i++){
            stringBuilder.append(mas[i].getName()+" ");
            stringBuilder.append(mas[i].getType()+" \n");
        }
        String files = stringBuilder.toString();
        return "Directory{" + "\n" +
                "name = '" + name + '\'' + "\n" +
                "files: " + files +
                '}';
    }
}

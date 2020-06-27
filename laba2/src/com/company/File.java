package com.company;

import java.util.Objects;

public class File {
    String name;
    String type;
    String content;
    public File(String name){
        this.name = name;
    };

    @Override
    public String toString() {
        return "File{" +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
    public void changeContent(String newContent){};

    public String getContent() {
        return content;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return name.equals(file.name) &&
                Objects.equals(type, file.type) &&
                Objects.equals(content, file.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, content);
    }
}

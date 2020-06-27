package com.company;

public class TextFile extends File {
    public TextFile(String name, String content){
        super(name);
        this.content = content;
        this.type = "text";
    };

    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public void changeContent(String newContent) {
        this.content = newContent;
    }
}

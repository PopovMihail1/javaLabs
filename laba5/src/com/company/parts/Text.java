package com.company.parts;

import java.util.ArrayList;
import java.util.Iterator;

public class Text {
    ArrayList<Paragraph> paragraphList;

    public Text(){
        paragraphList = new ArrayList<Paragraph>();
    };
    public void addParagraph(Paragraph paragraph) {
        paragraphList.add(paragraph);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<Paragraph> paragraphIterator = paragraphList.iterator();
        stringBuilder.append("  ");
        for(int i=0;i<paragraphList.size();i++){
            Paragraph paragraph = paragraphIterator.next();
            String res = paragraph.toString();
            if(i==paragraphList.size()-1){
                stringBuilder.append(paragraph.toString());
            }else{
                stringBuilder.append(paragraph.toString() + ' ');
            }
        }
        String paragraph = stringBuilder.toString();
        return paragraph;
    }

    public void deleteConsonantWords(int len){
        for(Paragraph paragraph: paragraphList){
            paragraph.deleteConsonantWords(len);
        }
    }
}

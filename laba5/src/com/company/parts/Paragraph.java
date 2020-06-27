package com.company.parts;

import java.util.ArrayList;
import java.util.Iterator;

public class Paragraph {
    ArrayList<ParagraphPart> paragraphPartList;

    public Paragraph(){
        paragraphPartList = new ArrayList<ParagraphPart>();
    };
    public void addParagraphPart(ParagraphPart paragraphPart){
        paragraphPartList.add(paragraphPart);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<ParagraphPart> paragraphPartIterator = paragraphPartList.iterator();
        for(int i=0;i<paragraphPartList.size();i++){
            ParagraphPart paragraphPart = paragraphPartIterator.next();
            String res = paragraphPart.toString();
            if(i==paragraphPartList.size()-1){
                stringBuilder.append(paragraphPart.toString());
            }else{
                stringBuilder.append(paragraphPart.toString() + ' ');
            }
        }
        stringBuilder.append("\r\n\r\n");
        String paragraph = stringBuilder.toString();
        return paragraph;
    }

    public void deleteConsonantWords(int len){
        Iterator<ParagraphPart> paragraphPartIterator = paragraphPartList.iterator();
        for(int i=0;i<paragraphPartList.size();i++){
            ParagraphPart paragraphPart = paragraphPartIterator.next();
            if (paragraphPart instanceof Sentence){
                ((Sentence) paragraphPart).deleteConsonantWords(len);
            }
        }
    }
}

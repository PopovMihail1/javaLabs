package com.company.parts;

import java.util.ArrayList;
import java.util.Iterator;

public class Sentence extends ParagraphPart{
    ArrayList<SentencePart> sentencePartList;
    public Sentence(){
        sentencePartList = new ArrayList<SentencePart>();
    };
    public void addSentencePart(SentencePart sentencePart){
        sentencePartList.add(sentencePart);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        //stringBuilder.append("SENTENCE:");
        Iterator<SentencePart> sentencePartIterator = sentencePartList.iterator();
        for(int i=0;i<sentencePartList.size();i++){
            SentencePart sentencePart = sentencePartIterator.next();
            String res = sentencePart.toString();
            if(i==sentencePartList.size()-1){
                stringBuilder.append(sentencePart.toString());
            }else{
                stringBuilder.append(sentencePart.toString() + ' ');
            }
        }
        String sentence = stringBuilder.toString();
        return sentence;
    }

    public void deleteConsonantWords(int len){
        Iterator<SentencePart> sentencePartIterator = sentencePartList.iterator();
        int currentSize = sentencePartList.size();
        for(int i=0;i<currentSize;i++){
            SentencePart sentencePart = sentencePartIterator.next();
            if (sentencePart instanceof Word){
                if(checkOnConsonant( ((Word) sentencePart).getFirstCharacter().getCharacter() ) && ((Word) sentencePart).getSize()==len){
                    sentencePartIterator.remove();
                }
            }
        }
    }

    public static String consonants = "ZXCVBNMSDFGHJKLQWRTPzxcvbnmsdfghjklqwrtp";
    public static boolean checkOnConsonant(char character){
        if(consonants.contains("" + character)){
            return true;
        }else{
            return false;
        }
    }
}

package com.company.parts;

import java.util.ArrayList;

public class Word extends SentencePart{
    ArrayList<MyCharacter> myCharacterList;

    public Word(){
        super();
        myCharacterList = new ArrayList<MyCharacter>();
    };
    public Word(String word){
        myCharacterList = new ArrayList<MyCharacter>();
        for(int i=0;i<word.length();i++){
            myCharacterList.add(new MyCharacter(word.charAt(i)));
        }
    };
    public void addCharacter(MyCharacter myCharacter){
        myCharacterList.add(myCharacter);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        //stringBuilder.append("WORD:");
        for(MyCharacter myCharacter: myCharacterList){
            stringBuilder.append(myCharacter.toString());
        }
        String word = stringBuilder.toString();
        return word;
    }
    public MyCharacter getFirstCharacter(){
        return myCharacterList.get(0);
    }
    public int getSize(){
        return myCharacterList.size();
    }
}

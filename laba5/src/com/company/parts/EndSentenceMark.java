package com.company.parts;

public class EndSentenceMark extends ParagraphPart{
    char endSentenceMark;
    public EndSentenceMark(char endSentenceMark){
        this.endSentenceMark = endSentenceMark;
    }

    @Override
    public String toString() {
        return "" + endSentenceMark;
    }
}

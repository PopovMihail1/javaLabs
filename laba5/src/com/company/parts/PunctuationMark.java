package com.company.parts;

public class PunctuationMark extends SentencePart{
    char punctuationMark;
    public PunctuationMark(char punctuationMark){
        this.punctuationMark = punctuationMark;
    }

    @Override
    public String toString() {
        return "" + punctuationMark;
    }
}

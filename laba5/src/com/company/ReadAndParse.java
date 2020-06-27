package com.company;

import com.company.parts.*;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadAndParse {
    static String punctuations = ",:;-";//add all the punctuation marks you want.
    static String fileName = "file.txt";
    public static Text myRead(){
        try {
            FileInputStream inputStream = new FileInputStream(fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder stringBuilder = new StringBuilder();
            String line = null;
            String ls = System.getProperty("line.separator");
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            // delete the last new line separator
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            reader.close();
            String content = stringBuilder.toString();   //all file to string

            Text text = new Text();
            Paragraph newParagraph = new Paragraph();
            Sentence newSentence = new Sentence();
            Word newWord = new Word();

            String[] paragraphs = content.split("\\r\\n\\s\\s\\s\\s");
            for(int i = 0;i<paragraphs.length;i++){
                String paragraph = paragraphs[i];
                Pattern sentencePattern = Pattern.compile("[A-Za-z’\\s\r\n,:;-]+[.!?]");
                Matcher sentenceMatcher = sentencePattern.matcher(paragraph);
                while (sentenceMatcher.find()) {
                    String sentence = sentenceMatcher.group();
                    char endSentenceChar = sentence.charAt(sentence.length()-1);
                    EndSentenceMark endSentenceMark = new EndSentenceMark(endSentenceChar);
                    Pattern sentencePartPattern = Pattern.compile("([’A-Za-z]+|[,;:-]|(\r\n))");
                    Matcher sentencePartMatcher = sentencePartPattern.matcher(sentence);
                    while (sentencePartMatcher.find()) {
                        String sentencePartStr = sentencePartMatcher.group();
                        if(checkOnPunctuation(sentencePartStr)){
                            PunctuationMark punctuationMark = new PunctuationMark(sentencePartStr.charAt(0));
                            newSentence.addSentencePart(punctuationMark);
                        }else if(checkOnNextRow(sentencePartStr)){
                            NextRowCharacter nextRowCharacter = new NextRowCharacter();
                            newSentence.addSentencePart(nextRowCharacter);
                        } else{
                            newWord = new Word(sentencePartStr);
                            newSentence.addSentencePart(newWord);
                        }
                    }
                    newParagraph.addParagraphPart(newSentence);
                    newSentence = new Sentence();
                    newParagraph.addParagraphPart(endSentenceMark);
                }
                text.addParagraph(newParagraph);
                newParagraph = new Paragraph();
            }
            return text;
        }catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean checkOnNextRow(String character){
        if(character.equals("\r\n")){
            return true;
        }else {
            return false;
        }
    }

    public static boolean checkOnPunctuation(String character){
        if(punctuations.contains(character)) {
            return true;
        }else {
            return false;
        }
    }
}

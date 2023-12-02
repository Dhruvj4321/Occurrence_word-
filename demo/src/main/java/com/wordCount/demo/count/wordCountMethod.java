package com.wordCount.demo.count;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class wordCountMethod {
	
	
public static HashMap<String, Integer> wordCount(String text) {
		
		HashMap<String, Integer> words = new HashMap<>();
		
		for(String word : text.split(" ")) {
			
			if(words.containsKey(word)) {
				
				words.put(word, words.get(word) + 1);
				
			}
			
			else {
				
				words.put(word, 1);
				
			}
			
		}
		
		return words;
		
		
	}




public static void main(String[] args) {
	
//	wordCount("I like DSA, I like Java ");
//}
	
	String filePath = "C:\\Users\\USER\\Desktop\\Dhruv\\Springboot/F1.txt"; // Replace with the actual path to your text file

    try {
        String fileContent = readFile(filePath);

        wordCount(fileContent);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

private static String readFile(String filePath) throws IOException {
    Path path = Paths.get(filePath);
    return Files.readString(path);
}


}


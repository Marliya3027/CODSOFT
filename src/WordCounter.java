import java.util.*;

public class WordCounter 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text or filename: "); //Step1: Prompt the user to get the input
		String input = sc.nextLine();
		
		String text = " ";
		//Step 2: Read the text input or filename
		if(input.toLowerCase().equals("file"))
		{
			text = "Welcome to word counter game!. Input your text to count the words in the sentence.";
		}
		else
		{
			text = input;
		}
		
		//Step 3: Split all the text in the sentence to words.
		String[] words = text.split("[\\s\\p{Punct}]+");
		
		//Step 4: Initialize a variable for counter
		int wordCount = 0;
		
		//Step 5: Count the words in the sentence
		for(String word :words)
		{
			wordCount++;
		}
		System.out.println("Total word count: " +wordCount); //Step 6: Display the word count
		
		//Step 7: Ignoring common words or stopping words
		String[] stopWords = {"a","an","the","is","this","in"};
		int adjustedWordCount = 0;
		for(String word:words)
		{
			if(!contains(stopWords, word.toLowerCase()))
			{
				adjustedWordCount++;
			}
		}
		System.out.println("Word count (excluding common stop words): " + adjustedWordCount);
		
		//Step 8: Providing unique words and Frequencies
		Map<String,Integer>wordFrequency = new HashMap<>();
		for(String word : words)
		{
			word = word.toLowerCase();
			wordFrequency.put(word, wordFrequency.getOrDefault(wordFrequency, 0)+1);
		}
		System.out.println("Number of unique words: " + wordFrequency.size());
		System.out.println("Word Frequency: "+wordFrequency);
		
		sc.close();
	}

	private static boolean contains(String[] arr, String target) //This is a helper function to check if an array has a value
	{
		// TODO Auto-generated method stub
		for(String value : arr)
		{
			if(value.equals(target))
			{
				return true;
			}
		}
		return false;
	}

}

/* Anika Phatk
 * 12/11/24 Period 5
 * Punctuation.java
 *
 * Description: This program takes in a text, reads it word by word and only outputs the words with punctuation marks.
 * Purpose: The purpose of this program is to practice using String methods, such as charAt() and length(), while
 * practicing to use other skils such as using different methods and loops.
 * 
 * Pseudocode:
 * Class header
 * Main
 * 		Call searchIt();
 *		searchIt will call the other methods in the program
 * searchIt()
 *		D&I String text that will be used to check for punctuation
 * 		Call getPunctuationWords(pass in text) and store returned value in text
 * 		Call printWords(pass in text)
 *
 * getPunctuationWords()	
 *		D&I String word, that will store each word as it is read
 *		D&I String finalText, that will concatenate each word with punctuation to be printed at the end
 *		D&I int start and end, which will be changed and used to read the words
 *		D&I int length, which will be set to the length of the text
 *		D&I int wordLength, which will be used to calculate the length of the word read
 *		D&I int counter1, which will be used to count the number of punctuation words
 *
 *		Using a combination of loops, read the words in the given text, by reading from
 *		one space to another. 
 *			outer while loop with condition end < length, keep reading words until end of text
 			inner while loop with conditions: end < length && text2.charAt(end) != ' '
 *			 			- increment end by 1 in the inner while loop
 *						- It will read the word by reading each character until the next space
 *			Outside the inner while loop, but inside the outer while loop:
 *						- Store word, in word variable, by using substring and the start/end for the indexes
 *						- Calculate the length of the word, by subtracting start from end
 *						- Call checkForPunctuation(pass in word, and wordLength), store returned value in word
 *						- Call printWords, pass in counter1 and the word to print each punctuation word in a list
 *						- Add one to end, to start after the space, and set start to end
 * 		
 * checkForPunctuation(String word2, int wordLength)
 *		Using the word and wordLength, read each letter and check for punctuation using a for loop
 *						- If the character read in the four loop is a type of punctuation, return the word
 *		return an empty String
 *
 * printWords(String finalText2)
 *		Use a print statement to print the final words with punctuations 
 *		Increment number to update the number of punctuation words
 * 
 */ 
 
public class Punctuation	//class header
{
	public static void main(String[] args)		//main method
	{
		searchIt();		//cal searchIt, which will call the other methods
	}
	
	//The method searchIt will call all the other methods
	public static void searchIt()
	{
		String text = new String("Blood, Sweat, and Tears by Winston Churchill " + "May 13, 1940" +"Mr. Speaker:" + "On Friday evening last I received His Majesty’s commission to form a new " + "Administration. It was the evident wish and will of Parliament and the nation that this should be conceived on the broadest possible basis and that it should include all parties, both those who supported the late Government and also the parties of the Opposition." + "I have completed the most important part of this task. A War Cabinet has been formed of five Members, representing, with the Liberal Opposition, the unity of the nation. The three party Leaders have agreed to serve, either in the War Cabinet or in high executive office. The three Fighting Services have been filled. It was necessary that this should be done in one single day, on account of the extreme urgency and rigour of events. A number of other key positions were filled yesterday, and I am submitting a further list to His Majesty tonight. I hope to complete the appointment of the principal Ministers during tomorrow. The appointment of the other Ministers usually takes a little longer, but I trust that, when Parliament meets again, this part of my task will be completed, and that the Administration will be complete in all respects." + "Sir, I considered it in the public interest to suggest that the House should be summoned to meet today. Mr. Speaker agreed and took the necessary steps, in accordance with the powers conferred upon him by the Resolution of the House. At the end of the proceedings today, the Adjournment of the House will be proposed until Tuesday, the 21st May, with, of course, provision for earlier meeting, if need be. The business to be considered during that week will be notified to Members at the earliest opportunity. I now invite the House, by the Resolution which stands in my name, to record its approval of the steps taken and to declare its confidence in the new Government." + "Sir, to form an Administration of this scale and complexity is a serious undertaking in itself, but it must be remembered that we are in the preliminary stage of one of the greatest battles in history, that we are in action at many points in Norway and in Holland, that we have to be prepared in the Mediterranean, that the air battle is continuous and that many preparations have to be made here at home. In this crisis I hope I may be pardoned if I do not address the House at any length today. I hope that any of my friends and colleagues, or former colleagues, who are affected by the political reconstruction, will make all allowances for any lack of ceremony with which it has been necessary to act. I would say to the House, as I said to those who’ve joined this government: \"I have nothing to offer but blood, toil, tears and sweat.\"" + "We have before us an ordeal of the most grievous kind. We have before us many, many long months of struggle and of suffering. You ask, what is our policy? I will say: It is to wage war, by sea, land and air, with all our might and with all the strength that God can give us; to wage war against a monstrous tyranny, never surpassed in the dark and lamentable catalogue of human crime. That is our policy. You ask, what is our aim? I can answer in one word: victory. Victory at all costs, victory in spite of all terror, victory, however long and hard the road may be; for without victory, there is no survival. Let that be realised; no survival for the British Empire, no survival for all that the British Empire has stood for, no survival for the urge and impulse of the ages, that mankind will move forward towards its goal. " + "But I take up my task with buoyancy and hope. I feel sure that our cause will not be suffered to fail among men. At this time I feel entitled to claim the aid of all, and I say, \"Come then, let us go forward together with our united strength.\"");		//D&I the text that will be checked
		printStart();
		getPunctuationWords(text);		//Call the method getPunctuationWords, which will read each word in the text given
	}
	
	//The method getPunctuationWords will go through the entire text reading each word by
	//reading from one space to another, and storing the words that have punctuations
	// attached to the final text which will be printed.

	public static void getPunctuationWords(String text2)
	{
		String word = new String();		//D&I word, it will store the word being read
		String finalText = new String();		//D&I finalText, it will store all the punctuation words
		int start = 0;		//D&I start, it will be used to find where the word should be read from
		int end = 0;		//D&I end, it will be used to find where the word ends
		int length = 0;		//D&I length, it will store the length of the entire text
		int wordLength = 0;		//D&I wordLength, it will store the length of the word being read
		int counter1 = 0;		//D&I counter1, to count the number of punctuation words
		length = text2.length();		//store the length of the text in length
	
		//These nested while loops goes through each word in the text provided, storing
		//all the words with punctuations in the variable, finalText
		
		while(end < length)		//This condition ensures that the words are read until the end of the text, the length-1
		{
			//This while loop continues reading the letters until a space is found,
			//or until the word ends. The condition end < length, ensures that while
			//end is being incremented in the while loop, it does not exceed the number
			//of characters in the text.
			
			while (end < length && text2.charAt(end) != ' ')
			{
				end++;		//Increment end by one to keep reading the characters until the word ends
			}
			word = text2.substring(start, end);		//Store the word by reading it from the start to end
			wordLength = end - start;		//Calculate the length of the word, subtract ending value from starting value
			word = checkForPunctuation(word, wordLength);		//Call checkForPunctuation, to check if the word has any punctuation
			counter1 = printWords(word, counter1);
			end = end+1;		//Increment end by 1, to start from the next letter, not space
			start = end;		//Set start equal to end, to start from the next letter
		}
		System.out.println("\n\n\n");	//Print 3 blank lines at the end of the output
	}
	//This method uses a for loop to read all the characters in the word, and find if the
	//word has any punctuation attached. It accepts the word from getPunctuationWords, and the
	//length of that word.
	
	public static String checkForPunctuation(String word2, int length2)
	{
		//This for loop goes through each letter in the word, and utilizes a for loop
		//to check if the word has any punctuation.
		
		for (int i=0; i<length2; i++)
		{
			if (word2.charAt(i) == '.' || word2.charAt(i) == ',' || word2.charAt(i) == ';' || word2.charAt(i) == ':' || word2.charAt(i) == '!' || word2.charAt(i) == '?' || word2.charAt(i) == '"' || word2.charAt(i) == '(' || word2.charAt(i) == ')' || word2.charAt(i) == '-')
			{
				return word2;	//If the word has punctuation, it is returned to getPunctuationWords
			}
		}	
		return "";		//The default return value is an empty String
	}
	
	//This method prints the final words that have punctation in them. It accepts the
	//finalText (punctuation word) and number (number of punctuation words) from getPunctuationWords.
	
	public static int printWords(String finalText, int number)
	{
		if (finalText != "")
		{
			number++;	//Increment number for the number of punctuation words
			System.out.println("\t" + number + ". " + finalText);		//Use println to print the punctuation words
		}
		return number;		//return the number of punctuation words to keep it updated
	}
	
	//This method prints 3 blank lines and the header for the start of the output 
	public static void printStart ()
	{
		System.out.println("\n\n\n");
		System.out.println("The punctuation words in the text are: ");
	}
}
		
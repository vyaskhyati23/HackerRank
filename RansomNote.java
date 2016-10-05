/**
 * Author: Khyati K.Vyas
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RansomNote {

	public static String compute(int m_words, int n_words, String mag[], String note[]) {
		String answer = "No";

		if (m_words < n_words)
			answer = "No";
		else {
			Map<String, Integer> mags = new HashMap<>();
			Map<String, Integer> notes = new HashMap<>();

			/**
			 * Magazine
			 * if key is already present, get the count and add 1
			 */
			for (String str1 : mag) {
				 
				int cm = mags.containsKey(str1) ? mags.get(str1) : 0;
				mags.put(str1, (cm + 1));
			}
			System.out.println(mags);

			/**
			 * Note
			 * if key is already present, get the count and add 1
			 */
			for (String str2 : note) {
				 
				int cn = notes.containsKey(str2) ? notes.get(str2) : 0;
				notes.put(str2, (cn + 1));
			}
			System.out.println(notes);

			/**
			 * for every string in the note, check if it is present in the
			 * magazine. Next check the frequency of the string so that it can
			 * be compared to the frequency in the note. If the magazine
			 * contains equal or greater than the value in the note. answer is
			 * yes.
			 */
			
			
			for (String str3 : note) {
				if (mags.containsKey(str3)) {
					int mag_freq = mags.get(str3);
					int note_freq = notes.get(str3);

					if (mag_freq >= note_freq)
						answer = "Yes";
					else
						answer = "No";
				}
			}

		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();

		// magzine array
		String magazine[] = new String[m];
		for (int i = 0; i < m; i++) {
			magazine[i] = in.next().toLowerCase();
		}

		// ransom note array
		String ransom[] = new String[n];
		for (int j = 0; j < n; j++) {
			ransom[j] = in.next().toLowerCase();
		}

		String result = compute(m, n, magazine, ransom);
		System.out.println(result);
	}
}

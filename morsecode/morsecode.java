package morsecode;

public class morsecode {
	String input;
//	char inputChar;
	public morsecode() {
		input = "SOS ";
	}
	
	public morsecode(String text) {
		if (!text.equals("")) {
			if (text.charAt(text.length() - 1) == ' ') input = text + " ";
			else input = text + "  ";
		} else {
			input = "";
		}
	}
	
	void setText(String text) {
		if (!text.equals("")) {
			if (text.charAt(text.length() - 1) == ' ') input = text + " ";
			else input = text + "  ";
		} else {
			input = "";
		}
	}
	
	String getText() {
		return input;
	}
	
	char toUpperCase(char _input) {
		if (_input >= 65 && _input <= 90) {
			return Character.forDigit(_input + 32, 10);
		} else return _input;
	}
	
	String toMorse() {
		String returnString = "";
		char inputChar;
		for (int i = 0; i < input.length() - 2 /*the last two characters are the spaces that were added*/; i++) {
			inputChar = Character.toUpperCase(input.charAt(i));
//			System.out.println(inputChar);
			switch (inputChar) {
				case 'A': returnString += ".- "; break;
				case 'B': returnString += "-... "; break;
				case 'C': returnString += "-.-. "; break;
				case 'D': returnString += "-.. "; break;
				case 'E': returnString += ". "; break;
				case 'F': returnString += "..-. "; break;
				case 'G': returnString += "--. "; break;
				case 'H': returnString += ".... "; break;
				case 'I': returnString += ".. "; break;
				case 'J': returnString += ".--- "; break;
				case 'K': returnString += "-.- "; break;
				case 'L': returnString += ".-.. "; break;
				case 'M': returnString += "-- "; break;
				case 'N': returnString += "-. "; break;
				case 'O': returnString += "--- "; break;
				case 'P': returnString += ".--. "; break;
				case 'Q': returnString += "--.- "; break;
				case 'R': returnString += ".-. "; break;
				case 'S': returnString += "... "; break;
				case 'T': returnString += "- "; break;
				case 'U': returnString += "..- "; break;
				case 'V': returnString += "...- "; break;
				case 'W': returnString += ".-- "; break;
				case 'X': returnString += "-..- "; break;
				case 'Y': returnString += "-.-- "; break;
				case 'Z': returnString += "--.. "; break;
				case '0': returnString += ".---- "; break;
				case '1': returnString += "..--- "; break;
				case '2': returnString += "...-- "; break;
				case '3': returnString += "....- "; break;
				case '4': returnString += "..... "; break;
				case '5': returnString += "-.... "; break;
				case '6': returnString += "--... "; break;
				case '7': returnString += "---.. "; break;
				case '8': returnString += "----. "; break;
				case '9': returnString += "----- "; break;
				case '.': returnString += ".-.-.- "; break;
				case ',': returnString += "--..-- "; break;
				case '?': returnString += "..--.. "; break;
				case ' ': returnString += "/ "; break;
			}
		}
		return returnString;
	}
	
	String toText() {
		String inputString;
		String returnString = "";
		int ISLength = -1;
		int e = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ' && i != 0) {
				while (input.charAt(i) != ' ') {
					i++;
				}
				i++;
			}
//			System.out.println(input.indexOf(" ", i) + 1);
			inputString = input.substring(i, input.indexOf(" ", i) + 1);
			ISLength = inputString.length();
//			System.out.println(inputString);
			switch (inputString) {
				case ".- ": returnString += "A"; break;
				case "-... ": returnString += "B"; break;
				case "-.-. ": returnString += "C"; break;
				case "-.. ": returnString += "D"; break;
				case ". ": returnString += "E"; break;
				case "..-. ": returnString += "F"; break;
				case "--. ": returnString += "G"; break;
				case ".... ": returnString += "H"; break;
				case ".. ": returnString += "I"; break;
				case ".--- ": returnString += "J"; break;
				case "-.- ": returnString += "K"; break;
				case ".-.. ": returnString += "L"; break;
				case "-- ": returnString += "M"; break;
				case "-. ": returnString += "N"; break;
				case "--- ": returnString += "O"; break;
				case ".--. ": returnString += "P"; break;
				case "--.- ": returnString += "Q"; break;
				case ".-. ": returnString += "R"; break;
				case "... ": returnString += "S"; break;
				case "- ": returnString += "T"; break;
				case "..- ": returnString += "U"; break;
				case "...- ": returnString += "V"; break;
				case ".-- ": returnString += "W"; break;
				case "-..- ": returnString += "X"; break;
				case "-.-- ": returnString += "Y"; break;
				case "--.. ": returnString += "Z"; break;
				case ".---- ": returnString += "0"; break;
				case "..--- ": returnString += "1"; break;
				case "...-- ": returnString += "2"; break;
				case "....- ": returnString += "3"; break;
				case "..... ": returnString += "4"; break;
				case "-.... ": returnString += "5"; break;
				case "--... ": returnString += "6"; break;
				case "---.. ": returnString += "7"; break;
				case "----. ": returnString += "8"; break;
				case "----- ": returnString += "9"; break;
				case ".-.-.- ": returnString += "."; break;
				case "--..-- ": returnString += ","; break;
				case "..--.. ": returnString += "?"; break;
				case "/ ": returnString += " "; break;
			}
		}
		return returnString;
	}
	
	boolean isMorse() {
		char inputChar;
		for (int i = 0; i < input.length(); i++) {
			inputChar = input.charAt(i);
//			inputChar = toUpperCase(input.charAt(i));
			if (Character.isLetter(inputChar) || Character.isDigit(inputChar)) { return false; }
		}
		return true;
	}
	
	public String toString() {
		//System.out.println("\n"+isMorse());
		if (input.equals("")) return "A: .-\tB: -...\tC: -.-.\tD: -..\tE: .\tF: ..-.\tG: --.\tH: ....\tI: ..\tJ: .---\tK: -.-\tL: .-..\tM: --\nN: -.\tO: ---\tP: .--.\tQ: --.-\tR: .-.\tS: ...\tT: -\tU: ..-\tV: ...-\tW: .--\tX: -..-\tY: -.--\tZ: --..\n1: .----\t2: ..---\t3: ...--\t4: ....-\t5: .....\t6: -....\t7: --...\t8: ---..\t9: ----.\t0: -----";
		if (isMorse()) { return input.substring(0, input.length() - 2) + "is morse code for " + toText() + "(unrecognized characters ignored)"; }
		else { return input.substring(0, input.length() - 2) + "in morse code is " + toMorse() + "(non-letter/digit characters ignored)"; }
	}
}

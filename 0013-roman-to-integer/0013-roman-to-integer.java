class Solution {
    public int romanToInt(String s) {

    int intNum = 0;
	int pre = 0;
	char ch = 0;

	for (int i = 0; i < s.length(); i++) {
		pre = ch;
		ch = s.charAt(i);

		switch (ch) {
		case 'I':
			intNum++;
			break;
		case 'V':
			if (pre == 'I') {
				intNum += 3;
			} else {
				intNum += 5;
			}
			break;
		case 'X':
			if (pre == 'I') {
				intNum += 8;
			} else {
				intNum += 10;
			}
			break;
		case 'L':
			if (pre == 'V') {
				intNum += 40;
			}

			if (pre == 'X') {
				intNum += 30;
			} else {
				intNum += 50;
			}
			break;
		case 'C':
			if (pre == 'X') {
				intNum += 80;
			} else {
				intNum += 100;
			}
			break;
		case 'D':
			if (pre == 'C') {
				intNum += 300;
			} else {
				intNum += 500;
			}
			break;
		case 'M':
			if (pre == 'C') {
				intNum += 800;
			} else {
				intNum += 1000;
			}
			break;
		}
	}

	return intNum;
}
}
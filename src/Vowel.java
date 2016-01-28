public class Vowel {
    public String replaceVowelWithMommyString(String input) {
        int length = input.length();
        int count = getCount(input, length);

        String result = input;
        if (((count / (double) length) * 100) > 30) {
            for (int i = 0; i < length; i++) {
                if (isVowel(input.charAt(i))) {
                    if (i > 0 && isVowel(input.charAt(i - 1))) {
                        result = result.replaceFirst(String.valueOf(input.charAt(i)), "");
                    } else {
                        result = result.replaceFirst(String.valueOf(input.charAt(i)), "mommy");
                    }
                }
            }
        }
        return result;
    }

    private int getCount(String input, int length) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (isVowel(input.charAt(i))) {
                count += 1;
            }
        }
        return count;
    }

    private boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
}

public class Vowel {
    public String replaceVowelWithMommyString(String input) {
        int length = input.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (isVowel(input.charAt(i))) {
                count += 1;
            }
        }

        String[] vowels = {"a", "e", "i", "o", "u"};
        String result = input;
        if (((count / (double) length) * 100) > 30) {
            for (String vowel : vowels) {
                if (input.contains(vowel)) {
                    int vowelIndex = input.indexOf(vowel);
                    if (vowelIndex > 0 && isVowel(input.charAt(vowelIndex - 1))) {
                        result = result.replace(vowel, "");
                    } else {
                        result = result.replace(vowel, "mommy");
                    }
                }
            }
        }
        return result;
    }

    private boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
}

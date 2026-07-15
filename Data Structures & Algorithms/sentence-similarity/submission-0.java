class Solution {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {

        // 1. Both sentences must have the same amount of words
        if (sentence1.length != sentence2.length) {
            return false;
        }

        // 2. Iterate through the words of the sentences.
        for (int i = 0; i < sentence1.length; i++) { // Loop through ALL words
            String word1 = sentence1[i];
            String word2 = sentence2[i];

            // If words at index(i) are equal, they are similar, continue to the next pair.
            if (word1.equals(word2)) {
                continue;
            }

            // 3. If not equal, check if this specific pair is in similarPairs.
            boolean foundSimilarity = false;
            for (List<String> pair : similarPairs) {
                if (pair != null && pair.size() == 2) {
                    String p1 = pair.get(0);
                    String p2 = pair.get(1);

                    // Check for similarity in both directions
                    if ((Objects.equals(word1, p1) && Objects.equals(word2, p2)) ||
                        (Objects.equals(word1, p2) && Objects.equals(word2, p1))) {
                        foundSimilarity = true;
                        break; // Found a matching pair, no need to check further for these words
                    }
                }
            }

            // If after checking all similarPairs, no similarity was found for word1 and word2
            if (!foundSimilarity) {
                return false;
            }
        }

        // If the loop completes, all word pairs are either equal or excused by similarPairs.
        return true;
    }
}
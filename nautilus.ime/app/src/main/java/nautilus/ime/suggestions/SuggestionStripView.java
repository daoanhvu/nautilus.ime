package nautilus.ime.suggestions;

import nautilus.ime.SuggestedWords;

/**
 * Created by Dell on 6/14/2015.
 */
public final class SuggestionStripView {
    public interface Listener {
        public void addWordToUserDictionary(String word);
        public void pickSuggestionManually(int index, SuggestedWords.SuggestedWordInfo word);
    }
}

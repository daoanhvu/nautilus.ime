package nautilus.ime.suggestions;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.TextView;

import java.util.ArrayList;

import nautilus.ime.NautilusIMELogger;
import nautilus.ime.SuggestedWords;
import nautilus.ime.keyboard.MainKeyboardView;

/**
 * Created by Vu Dao Anh on 6/14/2015.
 */
public final class SuggestionStripView extends RelativeLayout implements OnClickListener,
        OnLongClickListener {
    public interface Listener {
        public void addWordToUserDictionary(String word);
        public void pickSuggestionManually(int index, SuggestedWords.SuggestedWordInfo word);
    }

    // The maximum number of suggestions available. See {@link Suggest#mPrefMaxSuggestions}.
    public static final int MAX_SUGGESTIONS = 18;

    static final boolean DBG = NautilusIMELogger.sDBG;

    private final ViewGroup mSuggestionsStrip;
    MainKeyboardView mMainKeyboardView;

    private final View mMoreSuggestionsContainer;
    private final MoreSuggestionsView mMoreSuggestionsView;
    private final MoreSuggestions.Builder mMoreSuggestionsBuilder;

    private final ArrayList<TextView> mWordViews = CollectionUtils.newArrayList();
    private final ArrayList<TextView> mDebugInfoViews = CollectionUtils.newArrayList();
    private final ArrayList<View> mDividerViews = CollectionUtils.newArrayList();

    Listener mListener;
    private SuggestedWords mSuggestedWords = SuggestedWords.EMPTY;

    private final SuggestionStripLayoutHelper mLayoutHelper;
}

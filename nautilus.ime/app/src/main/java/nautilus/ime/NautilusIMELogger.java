package nautilus.ime;

/**
 * Created by vdao5 on 6/16/2015.
 */
import android.content.SharedPreferences;
import android.view.inputmethod.EditorInfo;
import nautilus.ime.keyboard.Keyboard;

public final class NautilusIMELogger implements SharedPreferences.OnSharedPreferenceChangeListener {

    public static boolean sDBG = false;
    public static boolean sVISUALDEBUG = false;
    public static boolean sUsabilityStudy = false;

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
    }

    public static void init(NautilusIME context) {
    }

    public static void commit() {
    }

    public static boolean getUsabilityStudyMode(final SharedPreferences prefs) {
        return false;
    }

    public static void onDestroy() {
    }

    public static void logOnManualSuggestion(
            String before, String after, int position, SuggestedWords suggestedWords) {
    }

    public static void logOnAutoCorrectionForTyping(
            String before, String after, int separatorCode) {
    }

    public static void logOnAutoCorrectionForGeometric(String before, String after,
                                                       int separatorCode, InputPointers inputPointers) {
    }

    public static void logOnAutoCorrectionCancelled() {
    }

    public static void logOnDelete(int x, int y) {
    }

    public static void logOnInputChar() {
    }

    public static void logOnInputSeparator() {
    }

    public static void logOnException(String metaData, Throwable e) {
    }

    public static void logOnWarning(String warning) {
    }

    public static void onStartInputView(EditorInfo editorInfo) {
    }

    public static void onStartSuggestion(CharSequence previousWords) {
    }

    public static void onAddSuggestedWord(String word, String sourceDictionaryId) {
    }

    public static void onSetKeyboard(Keyboard kb) {
    }

    public static void onPrintAllUsabilityStudyLogs() {
    }
}

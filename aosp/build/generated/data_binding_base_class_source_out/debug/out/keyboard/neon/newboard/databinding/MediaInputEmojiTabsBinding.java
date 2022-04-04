// Generated by view binder compiler. Do not edit!
package keyboard.neon.newboard.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import keyboard.neon.newboard.R;

public final class MediaInputEmojiTabsBinding implements ViewBinding {
  @NonNull
  private final TabLayout rootView;

  @NonNull
  public final TabLayout mediaInputEmojiTabs;

  private MediaInputEmojiTabsBinding(@NonNull TabLayout rootView,
      @NonNull TabLayout mediaInputEmojiTabs) {
    this.rootView = rootView;
    this.mediaInputEmojiTabs = mediaInputEmojiTabs;
  }

  @Override
  @NonNull
  public TabLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MediaInputEmojiTabsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MediaInputEmojiTabsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.media_input_emoji_tabs, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MediaInputEmojiTabsBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    TabLayout mediaInputEmojiTabs = (TabLayout) rootView;

    return new MediaInputEmojiTabsBinding((TabLayout) rootView, mediaInputEmojiTabs);
  }
}

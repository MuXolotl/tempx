package defpackage;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Icon;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.util.ArrayList;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkx.activity.ShortcutBridgeActivity;

/* JADX INFO: renamed from: lًؚؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0170l {
    public static final String[] yandex = new String[0];

    public static void admob(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static void amazon(AppActivity appActivity) {
        ShortcutManager shortcutManager;
        if (Build.VERSION.SDK_INT < 25 || (shortcutManager = (ShortcutManager) appActivity.getSystemService(ShortcutManager.class)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        C16287l.yandex.getClass();
        if (C16287l.yandex()) {
            arrayList.add(loadAd(appActivity, "vkx_shortcut_lib", R.string.shortcut_library, R.drawable.shortcut_library));
            arrayList.add(loadAd(appActivity, "vkx_shortcut_recomm", R.string.shortcut_recomms, R.drawable.shortcut_recomms));
            arrayList.add(loadAd(appActivity, "vkx_shortcut_catalog", R.string.shortcut_catalog, R.drawable.shortcut_catalog));
            arrayList.add(loadAd(appActivity, "vkx_shortcut_cache", R.string.shortcut_cache, R.drawable.shortcut_cache));
        }
        shortcutManager.setDynamicShortcuts(arrayList);
    }

    public static void billing(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC5121l.subscription(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i >= 30) {
            AbstractC5121l.subscription(editorInfo, charSequence);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = charSequence.length();
        if (i4 < 0 || i2 > length) {
            admob(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            admob(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            admob(editorInfo, charSequence, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(charSequence.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        admob(editorInfo, i7 != i6 ? TextUtils.concat(charSequence.subSequence(i9, i9 + iMin2), charSequence.subSequence(i2, iMin + i2)) : charSequence.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    public static String[] crashlytics(EditorInfo editorInfo) {
        int i = Build.VERSION.SDK_INT;
        String[] strArr = yandex;
        if (i >= 25) {
            String[] strArr2 = editorInfo.contentMimeTypes;
            return strArr2 != null ? strArr2 : strArr;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return strArr;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : strArr;
    }

    public static ShortcutInfo loadAd(AppActivity appActivity, String str, int i, int i2) {
        ShortcutInfo.Builder builder = new ShortcutInfo.Builder(appActivity, str);
        builder.setShortLabel(appActivity.getString(i));
        builder.setLongLabel(appActivity.getString(i));
        LayerDrawable layerDrawable = (LayerDrawable) AbstractC13273l.loadAd(appActivity, i2);
        ((GradientDrawable) layerDrawable.findDrawableByLayerId(R.id.shortcut_bg)).setColor(AbstractC13209l.yandex(android.R.attr.windowBackground));
        Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.shortcut_icon);
        C12463l c12463l = AbstractC6145l.yandex;
        drawableFindDrawableByLayerId.setTint(AbstractC13209l.yandex(R.attr.global_accent));
        Bitmap bitmapCreateBitmap = (layerDrawable.getIntrinsicWidth() <= 0 || layerDrawable.getIntrinsicHeight() <= 0) ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(layerDrawable.getIntrinsicWidth(), layerDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        layerDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        layerDrawable.draw(canvas);
        builder.setIcon(Icon.createWithBitmap(bitmapCreateBitmap));
        Intent intent = new Intent(appActivity, (Class<?>) ShortcutBridgeActivity.class);
        intent.putExtra("from_shortcut", true);
        intent.setAction(str);
        builder.setIntent(intent);
        return builder.build();
    }

    public static void mopub(EditorInfo editorInfo, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            AbstractC7680l.subs(editorInfo, z);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    public static void purchase(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    public static boolean yandex(InputConnection inputConnection, InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return inputConnection.commitContent(inputContentInfo, i, bundle);
    }
}

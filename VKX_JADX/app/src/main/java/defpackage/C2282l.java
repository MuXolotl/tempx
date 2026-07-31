package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: lؓۨؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C2282l {
    public final Object[] yandex = new Object[2];
    public static final Class[] loadAd = {Context.class, AttributeSet.class};
    public static final int[] crashlytics = {R.attr.onClick};
    public static final int[] amazon = {R.attr.accessibilityHeading};
    public static final int[] purchase = {R.attr.accessibilityPaneTitle};
    public static final int[] billing = {R.attr.screenReaderFocusable};
    public static final String[] mopub = {"android.widget.", "android.view.", "android.webkit."};
    public static final C5128l admob = new C5128l(0);

    public C10637l amazon(Context context, AttributeSet attributeSet) {
        return new C10637l(context, attributeSet);
    }

    public final View billing(Context context, String str, String str2) {
        String strConcat;
        C5128l c5128l = admob;
        Constructor constructor = (Constructor) c5128l.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(loadAd);
            c5128l.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.yandex);
    }

    public C13798l crashlytics(Context context, AttributeSet attributeSet) {
        return new C13798l(context, attributeSet);
    }

    public C8347l loadAd(Context context, AttributeSet attributeSet) {
        return new C8347l(context, attributeSet, ua.itaysonlab.vkx.R.attr.buttonStyle);
    }

    public C9189l purchase(Context context, AttributeSet attributeSet) {
        return new C9189l(context, attributeSet);
    }

    public C5367l yandex(Context context, AttributeSet attributeSet) {
        return new C5367l(context, attributeSet, ua.itaysonlab.vkx.R.attr.autoCompleteTextViewStyle);
    }
}

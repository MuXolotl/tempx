package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: lَٕۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16030l {
    public final C3316l loadAd;
    public final TextView yandex;

    public C16030l(TextView textView) {
        this.yandex = textView;
        this.loadAd = new C3316l(textView);
    }

    public final void amazon(boolean z) {
        ((AbstractC6725l) this.loadAd.f7072l).mopub(z);
    }

    public final void crashlytics(boolean z) {
        ((AbstractC6725l) this.loadAd.f7072l).billing(z);
    }

    public final void loadAd(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.yandex.getContext().obtainStyledAttributes(attributeSet, AbstractC14657l.subs, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            amazon(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputFilter[] yandex(InputFilter[] inputFilterArr) {
        return ((AbstractC6725l) this.loadAd.f7072l).crashlytics(inputFilterArr);
    }
}

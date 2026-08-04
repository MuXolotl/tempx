package defpackage;

import android.view.textclassifier.TextClassification;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٛۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18436l {
    public final ArrayList amazon;
    public final TextClassification crashlytics;
    public final long loadAd;
    public final CharSequence yandex;

    public C18436l(CharSequence charSequence, long j, TextClassification textClassification, ArrayList arrayList) {
        this.yandex = charSequence;
        this.loadAd = j;
        this.crashlytics = textClassification;
        this.amazon = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18436l)) {
            return false;
        }
        C18436l c18436l = (C18436l) obj;
        return AbstractC8576l.yandex(this.yandex, c18436l.yandex) && C12814l.crashlytics(this.loadAd, c18436l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c18436l.crashlytics) && this.amazon.equals(c18436l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((C12814l.subs(this.loadAd) + (this.yandex.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.yandex) + ", selection=" + C12814l.isPro(this.loadAd) + ", textClassification=" + this.crashlytics + ", icons=" + this.amazon + ")";
    }
}

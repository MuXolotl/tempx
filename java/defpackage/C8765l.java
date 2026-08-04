package defpackage;

import android.graphics.drawable.Drawable;
import android.view.textclassifier.TextClassification;

/* JADX INFO: renamed from: lٌٟٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8765l extends AbstractC1680l {
    public final Drawable amazon;
    public final int crashlytics;
    public final TextClassification loadAd;

    public C8765l(Object obj, TextClassification textClassification, int i, Drawable drawable) {
        super(obj);
        this.loadAd = textClassification;
        this.crashlytics = i;
        this.amazon = drawable;
    }

    public final String toString() {
        return "TextContextMenuTextClassificationItem(key=" + this.yandex + ", textClassification=" + this.loadAd + ", index=" + this.crashlytics + ", icon=" + this.amazon + ")";
    }
}

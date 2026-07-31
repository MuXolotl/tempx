package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: lٟؒٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1235l {
    public float amazon;
    public float crashlytics;
    public int loadAd;
    public int yandex;

    public final void yandex(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4914l.mopub);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.crashlytics = typedArrayObtainStyledAttributes.getFloat(index, this.crashlytics);
            } else if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.yandex);
                this.yandex = i2;
                this.yandex = C4759l.amazon[i2];
            } else if (index == 4) {
                this.loadAd = typedArrayObtainStyledAttributes.getInt(index, this.loadAd);
            } else if (index == 3) {
                this.amazon = typedArrayObtainStyledAttributes.getFloat(index, this.amazon);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}

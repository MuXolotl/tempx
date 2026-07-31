package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: lؘؑۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0143l {
    public float[] loadAd;
    public final ArrayList yandex = new ArrayList();

    public C0143l() {
        float[] fArr = new float[5];
        for (int i = 0; i < 5; i++) {
            fArr[i] = Float.NaN;
        }
        this.loadAd = fArr;
    }

    public final void yandex(Enum r3, float f) {
        ArrayList arrayList = this.yandex;
        arrayList.add(r3);
        if (this.loadAd.length < arrayList.size()) {
            this.loadAd = Arrays.copyOf(this.loadAd, arrayList.size() + 2);
        }
        this.loadAd[arrayList.size() - 1] = f;
    }
}

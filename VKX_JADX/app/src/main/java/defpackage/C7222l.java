package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؚّۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7222l {
    public String[] admob;
    public int[] amazon;
    public int billing;
    public int crashlytics;
    public boolean[] firebase;
    public int[] isPro;
    public int[] loadAd;
    public int[] mopub;
    public float[] purchase;
    public int smaato;
    public int subs;
    public int[] yandex;

    public final void amazon(int i, boolean z) {
        int i2 = this.smaato;
        int[] iArr = this.isPro;
        if (i2 >= iArr.length) {
            this.isPro = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.firebase;
            this.firebase = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.isPro;
        int i3 = this.smaato;
        iArr2[i3] = i;
        boolean[] zArr2 = this.firebase;
        this.smaato = i3 + 1;
        zArr2[i3] = z;
    }

    public final void crashlytics(int i, String str) {
        int i2 = this.subs;
        int[] iArr = this.mopub;
        if (i2 >= iArr.length) {
            this.mopub = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.admob;
            this.admob = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.mopub;
        int i3 = this.subs;
        iArr2[i3] = i;
        String[] strArr2 = this.admob;
        this.subs = i3 + 1;
        strArr2[i3] = str;
    }

    public final void loadAd(int i, int i2) {
        int i3 = this.crashlytics;
        int[] iArr = this.yandex;
        if (i3 >= iArr.length) {
            this.yandex = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.loadAd;
            this.loadAd = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.yandex;
        int i4 = this.crashlytics;
        iArr3[i4] = i;
        int[] iArr4 = this.loadAd;
        this.crashlytics = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void yandex(int i, float f) {
        int i2 = this.billing;
        int[] iArr = this.amazon;
        if (i2 >= iArr.length) {
            this.amazon = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.purchase;
            this.purchase = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.amazon;
        int i3 = this.billing;
        iArr2[i3] = i;
        float[] fArr2 = this.purchase;
        this.billing = i3 + 1;
        fArr2[i3] = f;
    }
}

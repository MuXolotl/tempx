package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٓۙٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14386l {
    public final float[] admob;
    public final int[] amazon;
    public final int[] billing;
    public final int crashlytics;
    public final ArrayList isPro = new ArrayList();
    public final int loadAd;
    public final int[] mopub;
    public final int[] purchase;
    public final float[] subs;
    public final int yandex;

    public C14386l(int i) {
        int i2 = (2 * i) + 1;
        this.yandex = i2;
        this.loadAd = i2;
        int i3 = i2 * i2;
        this.crashlytics = i3;
        this.amazon = new int[i3];
        this.purchase = new int[i3];
        this.billing = new int[i3];
        this.mopub = new int[i3];
        this.admob = new float[i3];
        this.subs = new float[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = this.yandex;
            int i7 = 0;
            while (i7 < i6) {
                int i8 = i7 / i;
                i8 = i8 > 1 ? 1 : i8;
                int i9 = i5 / i;
                i9 = i9 > 1 ? 1 : i9;
                float f = 1.0f;
                this.admob[i4] = i7 == this.yandex - 1 ? 1.0f : (i7 % i) / i;
                float[] fArr = this.subs;
                if (i5 != this.loadAd - 1) {
                    f = (i5 % i) / i;
                }
                fArr[i4] = f;
                int i10 = (i9 * 3) + i8;
                this.amazon[i4] = i10;
                this.purchase[i4] = i10 + 1;
                int i11 = ((i9 + 1) * 3) + i8;
                this.billing[i4] = i11;
                this.mopub[i4] = i11 + 1;
                i4++;
                i7++;
            }
        }
        int i12 = this.loadAd - 1;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = this.yandex - 1;
            for (int i15 = 0; i15 < i14; i15++) {
                int i16 = this.yandex;
                int i17 = (i13 * i16) + i15;
                int i18 = i17 + 1;
                int i19 = ((i13 + 1) * i16) + i15;
                ArrayList arrayList = this.isPro;
                arrayList.add(Integer.valueOf(i17));
                arrayList.add(Integer.valueOf(i19));
                arrayList.add(Integer.valueOf(i18));
                ArrayList arrayList2 = this.isPro;
                arrayList2.add(Integer.valueOf(i18));
                arrayList2.add(Integer.valueOf(i19));
                arrayList2.add(Integer.valueOf(i19 + 1));
            }
        }
    }
}

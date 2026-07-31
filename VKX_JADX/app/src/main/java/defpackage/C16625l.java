package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٖۚۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16625l {
    public final C1028l amazon;
    public final ArrayList billing;
    public final long[] crashlytics;
    public final float[] loadAd;
    public final C1028l purchase;
    public final C14386l yandex;

    public C16625l(C14386l c14386l) {
        this.yandex = c14386l;
        int i = c14386l.crashlytics;
        float[] fArr = new float[i * 2];
        this.loadAd = fArr;
        long[] jArr = new long[i];
        this.crashlytics = jArr;
        this.amazon = new C1028l(fArr);
        this.purchase = new C1028l(jArr);
        this.billing = c14386l.isPro;
    }
}

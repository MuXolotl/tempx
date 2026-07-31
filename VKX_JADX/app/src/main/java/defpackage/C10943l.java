package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٍُ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10943l {
    public final boolean admob;
    public final float amazon;
    public final long billing;
    public final float crashlytics;
    public boolean firebase;
    public final C17697l isPro;
    public final float loadAd;
    public final int mopub;
    public final float purchase;
    public final ArrayList subs;
    public final String yandex;

    public C10943l(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? C9735l.firebase : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        boolean z2 = (i2 & 128) != 0 ? false : z;
        this.yandex = str;
        this.loadAd = f;
        this.crashlytics = f2;
        this.amazon = f3;
        this.purchase = f4;
        this.billing = j2;
        this.mopub = i3;
        this.admob = z2;
        ArrayList arrayList = new ArrayList();
        this.subs = arrayList;
        C17697l c17697l = new C17697l(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.isPro = c17697l;
        arrayList.add(c17697l);
    }

    public static void yandex(C10943l c10943l, ArrayList arrayList, C8990l c8990l) {
        if (c10943l.firebase) {
            AbstractC0081l.crashlytics("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((C17697l) AbstractC14814l.firebase(1, c10943l.subs)).isPro.add(new C3205l("", arrayList, 0, c8990l, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final C5197l loadAd() {
        if (this.firebase) {
            AbstractC0081l.crashlytics("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.subs;
            if (arrayList.size() <= 1) {
                C17697l c17697l = this.isPro;
                C5197l c5197l = new C5197l(this.yandex, this.loadAd, this.crashlytics, this.amazon, this.purchase, new C4623l(c17697l.yandex, c17697l.loadAd, c17697l.crashlytics, c17697l.amazon, c17697l.purchase, c17697l.billing, c17697l.mopub, c17697l.admob, c17697l.subs, c17697l.isPro), this.billing, this.mopub, this.admob);
                this.firebase = true;
                return c5197l;
            }
            if (this.firebase) {
                AbstractC0081l.crashlytics("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            C17697l c17697l2 = (C17697l) arrayList.remove(arrayList.size() - 1);
            ((C17697l) AbstractC14814l.firebase(1, arrayList)).isPro.add(new C4623l(c17697l2.yandex, c17697l2.loadAd, c17697l2.crashlytics, c17697l2.amazon, c17697l2.purchase, c17697l2.billing, c17697l2.mopub, c17697l2.admob, c17697l2.subs, c17697l2.isPro));
        }
    }
}

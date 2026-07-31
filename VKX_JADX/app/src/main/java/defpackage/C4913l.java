package defpackage;

import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: lؘٖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4913l {
    public final int Signature;
    public final C11644l ad;
    public final C2536l adcel;
    public final List admob;
    public final C18595l ads;
    public final int advert;
    public final long amazon;
    public final long billing;
    public final String crashlytics;
    public final int firebase;
    public final int isPro;
    public final boolean license;
    public final C10712l loadAd;
    public final float metrica;
    public final String mopub;
    public final C5138l pro;
    public final int purchase;
    public final float remoteconfig;
    public final int smaato;
    public final float startapp;
    public final C1406l subs;
    public final C2982l subscription;
    public final List tapsense;
    public final float vip;
    public final List yandex;

    public C4913l(List list, C10712l c10712l, String str, long j, int i, long j2, String str2, List list2, C1406l c1406l, int i2, int i3, int i4, float f, float f2, float f3, float f4, C2536l c2536l, C18595l c18595l, List list3, int i5, C2982l c2982l, boolean z, C5138l c5138l, C11644l c11644l, int i6) {
        this.yandex = list;
        this.loadAd = c10712l;
        this.crashlytics = str;
        this.amazon = j;
        this.purchase = i;
        this.billing = j2;
        this.mopub = str2;
        this.admob = list2;
        this.subs = c1406l;
        this.isPro = i2;
        this.firebase = i3;
        this.smaato = i4;
        this.remoteconfig = f;
        this.vip = f2;
        this.metrica = f3;
        this.startapp = f4;
        this.adcel = c2536l;
        this.ads = c18595l;
        this.tapsense = list3;
        this.Signature = i5;
        this.subscription = c2982l;
        this.license = z;
        this.pro = c5138l;
        this.ad = c11644l;
        this.advert = i6;
    }

    public final String toString() {
        return yandex("");
    }

    public final String yandex(String str) {
        int i;
        StringBuilder sbAd = AbstractC5020l.ad(str);
        sbAd.append(this.crashlytics);
        sbAd.append("\n");
        long j = this.billing;
        C10712l c10712l = this.loadAd;
        C4913l c4913l = (C4913l) c10712l.subs.amazon(j);
        if (c4913l != null) {
            sbAd.append("\t\tParents: ");
            sbAd.append(c4913l.crashlytics);
            for (C4913l c4913l2 = (C4913l) c10712l.subs.amazon(c4913l.billing); c4913l2 != null; c4913l2 = (C4913l) c10712l.subs.amazon(c4913l2.billing)) {
                sbAd.append("->");
                sbAd.append(c4913l2.crashlytics);
            }
            sbAd.append(str);
            sbAd.append("\n");
        }
        List list = this.admob;
        if (!list.isEmpty()) {
            sbAd.append(str);
            sbAd.append("\tMasks: ");
            sbAd.append(list.size());
            sbAd.append("\n");
        }
        int i2 = this.isPro;
        if (i2 != 0 && (i = this.firebase) != 0) {
            sbAd.append(str);
            sbAd.append("\tBackground: ");
            sbAd.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.smaato)));
        }
        List list2 = this.yandex;
        if (!list2.isEmpty()) {
            sbAd.append(str);
            sbAd.append("\tShapes:\n");
            for (Object obj : list2) {
                sbAd.append(str);
                sbAd.append("\t\t");
                sbAd.append(obj);
                sbAd.append("\n");
            }
        }
        return sbAd.toString();
    }
}

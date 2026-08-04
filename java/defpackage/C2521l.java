package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lًَؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2521l {
    public final String amazon;
    public final double crashlytics;
    public final char loadAd;
    public final String purchase;
    public final ArrayList yandex;

    public C2521l(ArrayList arrayList, char c, double d, String str, String str2) {
        this.yandex = arrayList;
        this.loadAd = c;
        this.crashlytics = d;
        this.amazon = str;
        this.purchase = str2;
    }

    public static int yandex(char c, String str, String str2) {
        return str2.hashCode() + AbstractC12589l.advert(c * 31, 31, str);
    }

    public final int hashCode() {
        return yandex(this.loadAd, this.purchase, this.amazon);
    }
}

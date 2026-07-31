package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lّ۟ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12894l extends AbstractC16800l {
    public final boolean amazon;
    public final AbstractC16800l[] billing;
    public final boolean crashlytics;
    public final String loadAd;
    public final String[] purchase;

    public C12894l(String str, boolean z, boolean z2, String[] strArr, AbstractC16800l[] abstractC16800lArr) {
        super("CTOC");
        this.loadAd = str;
        this.crashlytics = z;
        this.amazon = z2;
        this.purchase = strArr;
        this.billing = abstractC16800lArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12894l.class != obj.getClass()) {
            return false;
        }
        C12894l c12894l = (C12894l) obj;
        return this.crashlytics == c12894l.crashlytics && this.amazon == c12894l.amazon && this.loadAd.equals(c12894l.loadAd) && Arrays.equals(this.purchase, c12894l.purchase) && Arrays.equals(this.billing, c12894l.billing);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + ((((527 + (this.crashlytics ? 1 : 0)) * 31) + (this.amazon ? 1 : 0)) * 31);
    }
}

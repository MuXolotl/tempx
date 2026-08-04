package defpackage;

import java.util.Set;

/* JADX INFO: renamed from: lٌۦؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9188l {
    public final boolean amazon;
    public final AbstractC15211l billing;
    public final boolean crashlytics;
    public final int loadAd;
    public final Set purchase;
    public final int yandex;

    public /* synthetic */ C9188l(int i, boolean z, boolean z2, Set set, int i2) {
        this(i, 1, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? null : set, null);
    }

    public static C9188l yandex(C9188l c9188l, int i, boolean z, Set set, AbstractC15211l abstractC15211l, int i2) {
        int i3 = c9188l.yandex;
        if ((i2 & 2) != 0) {
            i = c9188l.loadAd;
        }
        int i4 = i;
        if ((i2 & 4) != 0) {
            z = c9188l.crashlytics;
        }
        boolean z2 = z;
        boolean z3 = c9188l.amazon;
        if ((i2 & 16) != 0) {
            set = c9188l.purchase;
        }
        Set set2 = set;
        if ((i2 & 32) != 0) {
            abstractC15211l = c9188l.billing;
        }
        c9188l.getClass();
        return new C9188l(i3, i4, z2, z3, set2, abstractC15211l);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9188l)) {
            return false;
        }
        C9188l c9188l = (C9188l) obj;
        return AbstractC8576l.yandex(c9188l.billing, this.billing) && c9188l.yandex == this.yandex && c9188l.loadAd == this.loadAd && c9188l.crashlytics == this.crashlytics && c9188l.amazon == this.amazon;
    }

    public final int hashCode() {
        AbstractC15211l abstractC15211l = this.billing;
        int iHashCode = abstractC15211l != null ? abstractC15211l.hashCode() : 0;
        int iInmobi = AbstractC5020l.inmobi(this.yandex) + (iHashCode * 31) + iHashCode;
        int iInmobi2 = AbstractC5020l.inmobi(this.loadAd) + (iInmobi * 31) + iInmobi;
        int i = (iInmobi2 * 31) + (this.crashlytics ? 1 : 0) + iInmobi2;
        return (i * 31) + (this.amazon ? 1 : 0) + i;
    }

    public final C9188l loadAd(int i) {
        return yandex(this, i, false, null, null, 61);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("JavaTypeAttributes(howThisTypeIsUsed=");
        String str2 = "null";
        int i = this.yandex;
        if (i != 1) {
            str = i != 2 ? "null" : "COMMON";
        } else {
            str = "SUPERTYPE";
        }
        sb.append(str);
        sb.append(", flexibility=");
        int i2 = this.loadAd;
        if (i2 == 1) {
            str2 = "INFLEXIBLE";
        } else if (i2 == 2) {
            str2 = "FLEXIBLE_UPPER_BOUND";
        } else if (i2 == 3) {
            str2 = "FLEXIBLE_LOWER_BOUND";
        }
        sb.append(str2);
        sb.append(", isRaw=");
        sb.append(this.crashlytics);
        sb.append(", isForAnnotationParameter=");
        sb.append(this.amazon);
        sb.append(", visitedTypeParameters=");
        sb.append(this.purchase);
        sb.append(", defaultType=");
        sb.append(this.billing);
        sb.append(')');
        return sb.toString();
    }

    public C9188l(int i, int i2, boolean z, boolean z2, Set set, AbstractC15211l abstractC15211l) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = z;
        this.amazon = z2;
        this.purchase = set;
        this.billing = abstractC15211l;
    }
}

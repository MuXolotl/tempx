package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lؔؖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2396l implements InterfaceC9719l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final BigInteger f5156l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C14396l f5157l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final BigInteger f5158l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final BigInteger f5159l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f5160l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final BigInteger f5161l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f5162l;

    public C2396l(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2, BigInteger bigInteger4, C14396l c14396l) {
        if (i2 != 0) {
            if (i2 > bigInteger.bitLength()) {
                C8339l.metrica("when l value specified, it must satisfy 2^(l-1) <= p");
                throw null;
            }
            if (i2 < i) {
                C8339l.metrica("when l value specified, it may not be less than m value");
                throw null;
            }
        }
        if (i > bigInteger.bitLength() && !AbstractC8151l.crashlytics("org.bouncycastle.dh.allow_unsafe_p_value")) {
            C8339l.metrica("unsafe p value so small specific l required");
            throw null;
        }
        this.f5159l = bigInteger2;
        this.f5158l = bigInteger;
        this.f5156l = bigInteger3;
        this.f5160l = i;
        this.f5162l = i2;
        this.f5161l = bigInteger4;
        this.f5157l = c14396l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2396l)) {
            return false;
        }
        C2396l c2396l = (C2396l) obj;
        BigInteger bigInteger = c2396l.f5156l;
        BigInteger bigInteger2 = this.f5156l;
        if (bigInteger2 != null) {
            if (!bigInteger2.equals(bigInteger)) {
                return false;
            }
        } else if (bigInteger != null) {
            return false;
        }
        return c2396l.f5158l.equals(this.f5158l) && c2396l.f5159l.equals(this.f5159l);
    }

    public final int hashCode() {
        int iHashCode = this.f5158l.hashCode() ^ this.f5159l.hashCode();
        BigInteger bigInteger = this.f5156l;
        return (bigInteger != null ? bigInteger.hashCode() : 0) ^ iHashCode;
    }

    public C2396l(int i, BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, null, (i != 0 && i < 160) ? i : 160, i, null, null);
    }
}

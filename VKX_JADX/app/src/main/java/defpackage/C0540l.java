package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: lؑۘٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0540l implements InterfaceC7373l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final BigInteger f1854l = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public SecureRandom f1855l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public BigInteger f1856l;

    @Override // defpackage.InterfaceC7373l
    public final void amazon(BigInteger bigInteger, SecureRandom secureRandom) {
        this.f1856l = bigInteger;
        this.f1855l = secureRandom;
    }

    @Override // defpackage.InterfaceC7373l
    public final boolean crashlytics() {
        return false;
    }

    @Override // defpackage.InterfaceC7373l
    public final BigInteger loadAd() {
        int iBitLength = this.f1856l.bitLength();
        while (true) {
            BigInteger bigIntegerCrashlytics = AbstractC16784l.crashlytics(iBitLength, this.f1855l);
            if (!bigIntegerCrashlytics.equals(f1854l) && bigIntegerCrashlytics.compareTo(this.f1856l) < 0) {
                return bigIntegerCrashlytics;
            }
        }
    }

    @Override // defpackage.InterfaceC7373l
    public final void purchase(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        throw new IllegalStateException("Operation not supported");
    }
}

package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: lؚؕٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7027l implements InterfaceC8145l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final BigInteger f14722l = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C1638l f14723l;

    @Override // defpackage.InterfaceC8145l
    public final C18595l purchase() {
        BigInteger bigIntegerAmazon;
        C1638l c1638l = this.f14723l;
        C12933l c12933l = c1638l.f3973l;
        BigInteger bigInteger = c12933l.f25381l;
        SecureRandom secureRandom = (SecureRandom) c1638l.f28907l;
        int iBitLength = bigInteger.bitLength() >>> 2;
        do {
            BigInteger bigInteger2 = f14722l;
            bigIntegerAmazon = AbstractC16784l.amazon(bigInteger2, bigInteger.subtract(bigInteger2), secureRandom);
        } while (AbstractC6660l.billing(bigIntegerAmazon) < iBitLength);
        return new C18595l(new C4767l(c12933l.f25382l.modPow(bigIntegerAmazon, c12933l.f25380l), c12933l), new C13649l(bigIntegerAmazon, c12933l), 7);
    }

    @Override // defpackage.InterfaceC8145l
    /* JADX INFO: renamed from: throws */
    public final void mo274throws(C14785l c14785l) {
        C1638l c1638l = (C1638l) c14785l;
        this.f14723l = c1638l;
        AbstractC16336l.purchase(c1638l.f3973l.f25380l);
        C12933l c12933l = this.f14723l.f3973l;
        ((C5911l) AbstractC8776l.purchase.get()).getClass();
    }
}

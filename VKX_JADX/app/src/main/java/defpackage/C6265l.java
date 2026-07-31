package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: lؙؙؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6265l implements InterfaceC8145l, InterfaceC11695l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public SecureRandom f13227l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C7838l f13228l;

    @Override // defpackage.InterfaceC8145l
    public C18595l purchase() {
        BigInteger bigInteger = this.f13228l.f16362l;
        int iBitLength = bigInteger.bitLength();
        int i = iBitLength >>> 2;
        while (true) {
            BigInteger bigIntegerCrashlytics = AbstractC16784l.crashlytics(iBitLength, this.f13227l);
            if (bigIntegerCrashlytics.compareTo(InterfaceC11695l.startapp) >= 0 && bigIntegerCrashlytics.compareTo(bigInteger) < 0 && AbstractC6660l.billing(bigIntegerCrashlytics) >= i) {
                return new C18595l(new C4148l(new C16732l(0).loadAd(this.f13228l.f16358l, bigIntegerCrashlytics), this.f13228l), new C8374l(bigIntegerCrashlytics, this.f13228l), 7);
            }
        }
    }

    @Override // defpackage.InterfaceC8145l
    /* JADX INFO: renamed from: throws */
    public final void mo274throws(C14785l c14785l) {
        C1054l c1054l = (C1054l) c14785l;
        this.f13227l = (SecureRandom) c1054l.f28907l;
        C7838l c7838l = c1054l.f2919l;
        this.f13228l = c7838l;
        AbstractC16336l.amazon(c7838l.f16360l);
        ((C5911l) AbstractC8776l.purchase.get()).getClass();
    }
}

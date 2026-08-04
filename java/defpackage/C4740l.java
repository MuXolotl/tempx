package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lؚۣؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4740l extends AbstractC12754l {
    public final C2723l crashlytics;
    public final AbstractC11918l loadAd;

    public C4740l(AbstractC11918l abstractC11918l, C2723l c2723l) {
        if (abstractC11918l.amazon == null) {
            C8339l.metrica("Need curve with known group order");
            throw null;
        }
        this.loadAd = abstractC11918l;
        this.crashlytics = c2723l;
    }

    @Override // defpackage.AbstractC12754l
    public final AbstractC8859l crashlytics(AbstractC8859l abstractC8859l, BigInteger bigInteger) {
        AbstractC11918l abstractC11918l = abstractC8859l.yandex;
        AbstractC11918l abstractC11918l2 = abstractC8859l.yandex;
        if (!this.loadAd.subs(abstractC11918l)) {
            C18073l.admob();
            return null;
        }
        BigInteger bigIntegerMod = bigInteger.mod(abstractC11918l2.amazon);
        C2723l c2723l = this.crashlytics;
        BigInteger[] bigIntegerArrYandex = c2723l.yandex(bigIntegerMod);
        boolean z = false;
        BigInteger bigInteger2 = bigIntegerArrYandex[0];
        BigInteger bigInteger3 = bigIntegerArrYandex[1];
        c2723l.getClass();
        boolean z2 = bigInteger2.signum() < 0;
        boolean z3 = bigInteger3.signum() < 0;
        BigInteger bigIntegerAbs = bigInteger2.abs();
        BigInteger bigIntegerAbs2 = bigInteger3.abs();
        C16556l c16556lAdmob = AbstractC6660l.admob(abstractC8859l, AbstractC6660l.mopub(Math.max(bigIntegerAbs.bitLength(), bigIntegerAbs2.bitLength()), 8, AbstractC6660l.f14008l));
        AbstractC8859l abstractC8859l2 = ((C2700l) abstractC11918l2.adcel(abstractC8859l, "bc_endo", new C10023l(c2723l, abstractC8859l, z))).loadAd;
        C16556l c16556l = (C16556l) abstractC8859l2.yandex.adcel(abstractC8859l2, "bc_wnaf", new C13568l(c16556lAdmob, c2723l.loadAd, 28));
        int iMin = Math.min(8, c16556lAdmob.billing);
        int iMin2 = Math.min(8, c16556l.billing);
        return AbstractC6974l.subs(z2 ? c16556lAdmob.amazon : c16556lAdmob.crashlytics, z2 ? c16556lAdmob.crashlytics : c16556lAdmob.amazon, AbstractC6660l.purchase(iMin, bigIntegerAbs), z3 ? c16556l.amazon : c16556l.crashlytics, z3 ? c16556l.crashlytics : c16556l.amazon, AbstractC6660l.purchase(iMin2, bigIntegerAbs2));
    }
}

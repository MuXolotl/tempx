package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: lِٕٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11861l extends AbstractC11918l {
    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC11861l(BigInteger bigInteger) {
        C18075l c18075l;
        C18075l c18075l2 = AbstractC7376l.yandex;
        int iBitLength = bigInteger.bitLength();
        if (bigInteger.signum() <= 0 || iBitLength < 2) {
            C8339l.metrica("'characteristic' must be >= 2");
            throw null;
        }
        if (iBitLength >= 3) {
            c18075l = new C18075l(bigInteger);
        } else {
            int iAdmob = AbstractC16784l.admob(bigInteger);
            if (iAdmob == 2) {
                c18075l = AbstractC7376l.yandex;
            } else if (iAdmob != 3) {
                c18075l = new C18075l(bigInteger);
            } else {
                c18075l = AbstractC7376l.loadAd;
            }
        }
        super(c18075l);
    }

    public abstract BigInteger Signature();

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l admob(int i, BigInteger bigInteger) {
        AbstractC2426l abstractC2426lIsPro = isPro(bigInteger);
        AbstractC2426l abstractC2426lSignature = abstractC2426lIsPro.license().amazon(this.loadAd).startapp(abstractC2426lIsPro).amazon(this.crashlytics).Signature();
        if (abstractC2426lSignature == null) {
            C8339l.metrica("Invalid point compression");
            return null;
        }
        if (abstractC2426lSignature.isVip() != (i == 1)) {
            abstractC2426lSignature = abstractC2426lSignature.subscription();
        }
        return purchase(abstractC2426lIsPro, abstractC2426lSignature);
    }

    @Override // defpackage.AbstractC11918l
    public AbstractC2426l ads(SecureRandom secureRandom) {
        BigInteger bigIntegerCrashlytics;
        BigInteger bigIntegerSignature = Signature();
        while (true) {
            bigIntegerCrashlytics = AbstractC16784l.crashlytics(bigIntegerSignature.bitLength(), secureRandom);
            if (bigIntegerCrashlytics.signum() > 0 && bigIntegerCrashlytics.compareTo(bigIntegerSignature) < 0) {
                break;
            }
        }
        AbstractC2426l abstractC2426lIsPro = isPro(bigIntegerCrashlytics);
        while (true) {
            BigInteger bigIntegerCrashlytics2 = AbstractC16784l.crashlytics(bigIntegerSignature.bitLength(), secureRandom);
            if (bigIntegerCrashlytics2.signum() > 0 && bigIntegerCrashlytics2.compareTo(bigIntegerSignature) < 0) {
                return abstractC2426lIsPro.startapp(isPro(bigIntegerCrashlytics2));
            }
        }
    }

    @Override // defpackage.AbstractC11918l
    public final boolean metrica(BigInteger bigInteger) {
        return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(Signature()) < 0;
    }
}

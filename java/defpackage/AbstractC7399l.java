package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

/* JADX INFO: renamed from: lؚٜٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7399l extends AbstractC11918l {
    public BigInteger[] subs;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC7399l(int i, int i2, int i3, int i4) {
        if (i > AbstractC8151l.yandex(1142, "org.bouncycastle.ec.max_f2m_field_size")) {
            C8339l.metrica(AbstractC0653l.vip(i, "field size out of range: "));
            throw null;
        }
        int[] iArr = (i3 | i4) == 0 ? new int[]{0, i2, i} : new int[]{0, i2, i3, i4, i};
        C18075l c18075l = AbstractC7376l.yandex;
        if (iArr[0] != 0) {
            C8339l.metrica("Irreducible polynomials in GF(2) must have constant term");
            throw null;
        }
        for (int i5 = 1; i5 < iArr.length; i5++) {
            if (iArr[i5] <= iArr[i5 - 1]) {
                C8339l.metrica("Polynomial exponents must be monotonically increasing");
                throw null;
            }
        }
        super(new C10044l(AbstractC7376l.yandex, new C4147l(iArr)));
        this.subs = null;
        if (AbstractC8151l.crashlytics("org.bouncycastle.ec.disable")) {
            C10754l.ads("F2M disabled by \"org.bouncycastle.ec.disable\"");
            throw null;
        }
        if (AbstractC8151l.crashlytics("org.bouncycastle.ec.disable_f2m")) {
            C10754l.ads("F2M disabled by \"org.bouncycastle.ec.disable_f2m\"");
            throw null;
        }
    }

    public boolean Signature() {
        if (this.amazon == null || this.purchase == null || !this.crashlytics.vip()) {
            return false;
        }
        return this.loadAd.metrica() || this.loadAd.vip();
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l admob(int i, BigInteger bigInteger) {
        AbstractC2426l abstractC2426lAmazon;
        AbstractC2426l abstractC2426lIsPro = isPro(bigInteger);
        if (abstractC2426lIsPro.metrica()) {
            abstractC2426lAmazon = this.crashlytics.Signature();
        } else {
            AbstractC2426l abstractC2426lLicense = license(abstractC2426lIsPro.license().remoteconfig().startapp(this.crashlytics).amazon(this.loadAd).amazon(abstractC2426lIsPro));
            if (abstractC2426lLicense != null) {
                if (abstractC2426lLicense.isVip() != (i == 1)) {
                    abstractC2426lLicense = abstractC2426lLicense.purchase();
                }
                int i2 = this.billing;
                abstractC2426lAmazon = (i2 == 5 || i2 == 6) ? abstractC2426lLicense.amazon(abstractC2426lIsPro) : abstractC2426lLicense.startapp(abstractC2426lIsPro);
            } else {
                abstractC2426lAmazon = null;
            }
        }
        if (abstractC2426lAmazon != null) {
            return purchase(abstractC2426lIsPro, abstractC2426lAmazon);
        }
        C8339l.metrica("Invalid point compression");
        return null;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC2426l ads(SecureRandom secureRandom) {
        BigInteger bigIntegerCrashlytics;
        BigInteger bigIntegerCrashlytics2;
        int iSmaato = smaato();
        do {
            bigIntegerCrashlytics = AbstractC16784l.crashlytics(iSmaato, secureRandom);
        } while (bigIntegerCrashlytics.signum() <= 0);
        AbstractC2426l abstractC2426lIsPro = isPro(bigIntegerCrashlytics);
        do {
            bigIntegerCrashlytics2 = AbstractC16784l.crashlytics(iSmaato, secureRandom);
        } while (bigIntegerCrashlytics2.signum() <= 0);
        return abstractC2426lIsPro.startapp(isPro(bigIntegerCrashlytics2));
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l amazon(BigInteger bigInteger, BigInteger bigInteger2) {
        AbstractC2426l abstractC2426lIsPro = isPro(bigInteger);
        AbstractC2426l abstractC2426lIsPro2 = isPro(bigInteger2);
        int i = this.billing;
        if (i == 5 || i == 6) {
            if (!abstractC2426lIsPro.metrica()) {
                abstractC2426lIsPro2 = abstractC2426lIsPro2.admob(abstractC2426lIsPro).amazon(abstractC2426lIsPro);
            } else if (!abstractC2426lIsPro2.license().equals(this.crashlytics)) {
                C11983l.crashlytics();
                return null;
            }
        }
        return purchase(abstractC2426lIsPro, abstractC2426lIsPro2);
    }

    public final AbstractC2426l license(AbstractC2426l abstractC2426l) {
        AbstractC2426l abstractC2426lAmazon;
        AbstractC13869l abstractC13869l = (AbstractC13869l) abstractC2426l;
        boolean zApplovin = abstractC13869l.applovin();
        if (zApplovin && abstractC13869l.appmetrica() != 0) {
            return null;
        }
        int iSmaato = smaato();
        if ((iSmaato & 1) != 0) {
            AbstractC2426l abstractC2426lPremium = abstractC13869l.premium();
            if (zApplovin || abstractC2426lPremium.license().amazon(abstractC2426lPremium).amazon(abstractC2426l).metrica()) {
                return abstractC2426lPremium;
            }
            return null;
        }
        if (abstractC2426l.metrica()) {
            return abstractC2426l;
        }
        AbstractC2426l abstractC2426lIsPro = isPro(InterfaceC11695l.metrica);
        Random random = new Random();
        do {
            AbstractC2426l abstractC2426lIsPro2 = isPro(new BigInteger(iSmaato, random));
            AbstractC2426l abstractC2426lAmazon2 = abstractC2426l;
            abstractC2426lAmazon = abstractC2426lIsPro;
            for (int i = 1; i < iSmaato; i++) {
                AbstractC2426l abstractC2426lLicense = abstractC2426lAmazon2.license();
                abstractC2426lAmazon = abstractC2426lAmazon.license().amazon(abstractC2426lLicense.startapp(abstractC2426lIsPro2));
                abstractC2426lAmazon2 = abstractC2426lLicense.amazon(abstractC2426l);
            }
            if (!abstractC2426lAmazon2.metrica()) {
                return null;
            }
        } while (abstractC2426lAmazon.license().amazon(abstractC2426lAmazon).metrica());
        return abstractC2426lAmazon;
    }

    @Override // defpackage.AbstractC11918l
    public final boolean metrica(BigInteger bigInteger) {
        return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= smaato();
    }
}

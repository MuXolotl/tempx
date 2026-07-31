package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٍؘّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12489l {
    public static final BigInteger yandex = BigInteger.valueOf(5000000);

    public static int crashlytics(BigInteger bigInteger) {
        if (bigInteger.signum() < 0) {
            C8339l.smaato("negative iteration count found");
            return 0;
        }
        if (bigInteger.bitLength() > 31) {
            C8339l.smaato("iteration counts >= 2^31 are not suppported");
            return 0;
        }
        String strLoadAd = AbstractC8151l.loadAd("org.bouncycastle.pkcs12.max_it_count");
        BigInteger bigInteger2 = strLoadAd != null ? new BigInteger(strLoadAd) : null;
        if (bigInteger2 == null) {
            bigInteger2 = yandex;
        }
        if (bigInteger.compareTo(bigInteger2) <= 0) {
            return AbstractC16784l.admob(bigInteger);
        }
        C18073l.metrica("iteration count ", bigInteger, " greater than ", bigInteger2);
        return 0;
    }

    public static Cthrow loadAd(C13016l c13016l) {
        Cthrow cthrow;
        Cclass cclass = c13016l.f25489l;
        if (cclass.size() == 3) {
            cthrow = (Cthrow) Cthrow.f36592l.m222l(Cfinal.inmobi(cclass.mo173throws(2)), false);
        } else {
            cthrow = null;
        }
        if (cthrow != null) {
            return cthrow;
        }
        throw new Celse("EncryptedContentInfo content missing");
    }

    public static applovin yandex(C14148l c14148l) {
        applovin applovinVar = c14148l.f27664l;
        if (applovinVar != null) {
            return applovinVar;
        }
        throw new Celse("ContentInfo content missing");
    }
}

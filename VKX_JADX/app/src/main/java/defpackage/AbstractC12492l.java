package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: renamed from: lٍِّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12492l {
    public static final byte[] yandex = AbstractC9008l.crashlytics("openssh-key-v1\u0000");

    public static AbstractC8831l loadAd(byte[] bArr) {
        byte[] bArrVip;
        int i;
        AbstractC8831l c6554l;
        C7838l c7838l;
        if (bArr[0] == 48) {
            Cclass cclassInmobi = Cclass.inmobi(bArr);
            if (cclassInmobi.size() == 6) {
                int i2 = 0;
                while (true) {
                    if (i2 >= cclassInmobi.size()) {
                        if (((Cstrictfp) cclassInmobi.mo173throws(0)).applovin().equals(AbstractC16784l.yandex)) {
                            c6554l = new C13649l(((Cstrictfp) cclassInmobi.mo173throws(5)).applovin(), new C12933l(((Cstrictfp) cclassInmobi.mo173throws(1)).applovin(), ((Cstrictfp) cclassInmobi.mo173throws(2)).applovin(), ((Cstrictfp) cclassInmobi.mo173throws(3)).applovin()));
                            break;
                        }
                    } else if (cclassInmobi.mo173throws(i2) instanceof Cstrictfp) {
                        i2++;
                    }
                    c6554l = null;
                    break;
                }
            }
            if (cclassInmobi.size() == 9) {
                int i3 = 0;
                while (true) {
                    if (i3 >= cclassInmobi.size()) {
                        if (((Cstrictfp) cclassInmobi.mo173throws(0)).applovin().equals(AbstractC16784l.yandex)) {
                            C15860l c15860lVip = C15860l.vip(cclassInmobi);
                            c6554l = new C6554l(c15860lVip.f31123l, c15860lVip.f31120l, c15860lVip.f31127l, c15860lVip.f31126l, c15860lVip.f31129l, c15860lVip.f31121l, c15860lVip.f31122l, c15860lVip.f31128l, false);
                            break;
                        }
                    } else if (cclassInmobi.mo173throws(i3) instanceof Cstrictfp) {
                        i3++;
                    }
                    c6554l = null;
                    break;
                }
            }
            if (cclassInmobi.size() != 4 || !(cclassInmobi.mo173throws(3) instanceof Cfinal) || !(cclassInmobi.mo173throws(2) instanceof Cfinal)) {
                c6554l = null;
                break;
            }
            C7154l c7154lVip = C7154l.vip(cclassInmobi);
            Ccase ccaseAds = c7154lVip.ads(0, -1);
            ccaseAds.getClass();
            Ccase ccase = C7130l.vip(ccaseAds).f14935l;
            if (ccase instanceof Cfor) {
                Cfor cforM192throws = Cfor.m192throws(ccase);
                AbstractC18276l abstractC18276l = (AbstractC18276l) AbstractC1624l.crashlytics.get(cforM192throws);
                C7100l c7100lAmazon = abstractC18276l == null ? null : abstractC18276l.amazon();
                if (c7100lAmazon == null) {
                    c7100lAmazon = AbstractC17195l.admob(cforM192throws);
                }
                c7838l = new C2542l(cforM192throws, c7100lAmazon);
            } else {
                c7838l = new C7838l(C7100l.vip(ccase));
            }
            c6554l = new C8374l(c7154lVip.metrica(), c7838l);
        } else {
            C6129l c6129l = new C6129l();
            c6129l.loadAd = 0;
            c6129l.yandex = bArr;
            int i4 = 0;
            while (true) {
                byte[] bArr2 = yandex;
                if (i4 == bArr2.length) {
                    c6129l.loadAd += bArr2.length;
                    if (!"none".equals(c6129l.purchase())) {
                        C8339l.smaato("encrypted keys not supported");
                        return null;
                    }
                    c6129l.mopub();
                    c6129l.mopub();
                    if (c6129l.billing() != 1) {
                        C8339l.smaato("multiple keys not supported");
                        return null;
                    }
                    AbstractC12396l.billing(c6129l.amazon());
                    int iBilling = c6129l.billing();
                    if (iBilling == 0) {
                        bArrVip = new byte[0];
                    } else {
                        int length = bArr.length;
                        int i5 = c6129l.loadAd;
                        if (iBilling > length - i5) {
                            C8339l.metrica("not enough data for block");
                            return null;
                        }
                        if (iBilling % 8 != 0) {
                            C8339l.metrica("missing padding");
                            return null;
                        }
                        int i6 = i5 + iBilling;
                        c6129l.loadAd = i6;
                        if (iBilling > 0 && (i = bArr[i6 - 1] & 255) > 0 && i < 8) {
                            i6 -= i;
                            int i7 = 1;
                            int i8 = i6;
                            while (i7 <= i) {
                                if (i7 != (bArr[i8] & 255)) {
                                    C8339l.metrica("incorrect padding");
                                    return null;
                                }
                                i7++;
                                i8++;
                            }
                        }
                        bArrVip = AbstractC14024l.vip(i5, i6, bArr);
                    }
                    if (c6129l.loadAd < c6129l.yandex.length) {
                        C8339l.metrica("decoded key has trailing data");
                        return null;
                    }
                    C6129l c6129l2 = new C6129l(bArrVip);
                    if (c6129l2.billing() != c6129l2.billing()) {
                        C8339l.smaato("private key check values are not the same");
                        return null;
                    }
                    String strPurchase = c6129l2.purchase();
                    if ("ssh-ed25519".equals(strPurchase)) {
                        c6129l2.amazon();
                        byte[] bArrAmazon = c6129l2.amazon();
                        if (bArrAmazon.length != 64) {
                            C8339l.smaato("private key value of wrong length");
                            return null;
                        }
                        c6554l = new C1438l(bArrAmazon, 0);
                    } else if (strPurchase.startsWith("ecdsa")) {
                        Cfor cfor = (Cfor) AbstractC9856l.loadAd.get(AbstractC9008l.yandex(c6129l2.amazon()));
                        if (cfor == null) {
                            C8339l.smaato("OID not found for: ".concat(strPurchase));
                            return null;
                        }
                        C7100l c7100lLoadAd = AbstractC6662l.loadAd(cfor);
                        if (c7100lLoadAd == null) {
                            C8339l.smaato(AbstractC9361l.license("Curve not found for: ", cfor));
                            return null;
                        }
                        c6129l2.amazon();
                        BigInteger bigInteger = new BigInteger(1, c6129l2.amazon());
                        C2542l c2542l = new C2542l(c7100lLoadAd);
                        c2542l.f5539l = cfor;
                        c6554l = new C8374l(bigInteger, c2542l);
                    } else if (strPurchase.startsWith("ssh-rsa")) {
                        BigInteger bigInteger2 = new BigInteger(1, c6129l2.amazon());
                        BigInteger bigInteger3 = new BigInteger(1, c6129l2.amazon());
                        BigInteger bigInteger4 = new BigInteger(1, c6129l2.amazon());
                        BigInteger bigInteger5 = new BigInteger(1, c6129l2.amazon());
                        BigInteger bigInteger6 = new BigInteger(1, c6129l2.amazon());
                        BigInteger bigInteger7 = new BigInteger(1, c6129l2.amazon());
                        BigInteger bigInteger8 = AbstractC16784l.loadAd;
                        c6554l = new C6554l(bigInteger2, bigInteger3, bigInteger4, bigInteger6, bigInteger7, bigInteger4.remainder(bigInteger6.subtract(bigInteger8)), bigInteger4.remainder(bigInteger7.subtract(bigInteger8)), bigInteger5, false);
                    } else {
                        c6554l = null;
                    }
                    c6129l2.mopub();
                    if (c6129l2.loadAd >= bArrVip.length) {
                        break;
                    }
                    C8339l.metrica("private key block has trailing data");
                    return null;
                }
                if (bArr2[i4] != bArr[i4]) {
                    C8339l.metrica("magic-number incorrect");
                    throw null;
                }
                i4++;
            }
        }
        if (c6554l != null) {
            return c6554l;
        }
        C8339l.metrica("unable to parse key");
        return null;
    }

    public static byte[] yandex(AbstractC8831l abstractC8831l) {
        if (abstractC8831l instanceof C6554l) {
            Ccase ccaseAds = AbstractC17160l.yandex(abstractC8831l, null).ads();
            ccaseAds.getClass();
            return ccaseAds.getEncoded();
        }
        if (abstractC8831l instanceof C8374l) {
            Ccase ccaseAds2 = AbstractC17160l.yandex(abstractC8831l, null).ads();
            ccaseAds2.getClass();
            return ccaseAds2.getEncoded();
        }
        if (abstractC8831l instanceof C13649l) {
            C13649l c13649l = (C13649l) abstractC8831l;
            BigInteger bigInteger = c13649l.f26673l;
            C12933l c12933l = (C12933l) c13649l.f16541l;
            BigInteger bigInteger2 = c12933l.f25382l;
            BigInteger bigInteger3 = c12933l.f25380l;
            BigInteger bigIntegerModPow = bigInteger2.modPow(bigInteger, bigInteger3);
            appmetrica appmetricaVar = new appmetrica((byte) 0, 0);
            appmetricaVar.purchase(Cstrictfp.f36573l);
            appmetricaVar.purchase(new Cstrictfp(bigInteger3));
            appmetricaVar.purchase(new Cstrictfp(c12933l.f25381l));
            appmetricaVar.purchase(new Cstrictfp(c12933l.f25382l));
            appmetricaVar.purchase(new Cstrictfp(bigIntegerModPow));
            appmetricaVar.purchase(new Cstrictfp(bigInteger));
            try {
                C11138l c11138l = new C11138l(appmetricaVar);
                c11138l.f22357l = -1;
                return c11138l.getEncoded();
            } catch (Exception e) {
                C8339l.smaato(AbstractC12900l.admob(e, new StringBuilder("unable to encode DSAPrivateKeyParameters ")));
                return null;
            }
        }
        if (!(abstractC8831l instanceof C1438l)) {
            C4875l.smaato(abstractC8831l.getClass().getName(), " to openssh private key", "unable to convert ");
            return null;
        }
        C1438l c1438l = (C1438l) abstractC8831l;
        C6254l c6254lYandex = c1438l.yandex();
        C5008l c5008l = new C5008l(22);
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) c5008l.f10245l;
        try {
            byteArrayOutputStream.write(yandex);
            c5008l.m1663extends(AbstractC9008l.crashlytics("none"));
            c5008l.m1663extends(AbstractC9008l.crashlytics("none"));
            c5008l.m1663extends(AbstractC9008l.crashlytics(""));
            c5008l.m1672volatile(1);
            c5008l.m1663extends(AbstractC12396l.purchase(c6254lYandex));
            C5008l c5008l2 = new C5008l(22);
            int iNextInt = AbstractC8776l.loadAd().nextInt();
            c5008l2.m1672volatile(iNextInt);
            c5008l2.m1672volatile(iNextInt);
            c5008l2.m1663extends(AbstractC9008l.crashlytics("ssh-ed25519"));
            byte[] encoded = c6254lYandex.getEncoded();
            c5008l2.m1663extends(encoded);
            c5008l2.m1663extends(AbstractC14024l.mopub(AbstractC14024l.crashlytics(c1438l.f3621l), encoded));
            c5008l2.m1663extends(AbstractC9008l.crashlytics(""));
            ByteArrayOutputStream byteArrayOutputStream2 = (ByteArrayOutputStream) c5008l2.f10245l;
            int size = byteArrayOutputStream2.size() % 8;
            if (size != 0) {
                int i = 8 - size;
                for (int i2 = 1; i2 <= i; i2++) {
                    byteArrayOutputStream2.write(i2);
                }
            }
            c5008l.m1663extends(byteArrayOutputStream2.toByteArray());
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            C4875l.remoteconfig(e2.getMessage(), e2);
            return null;
        }
    }
}

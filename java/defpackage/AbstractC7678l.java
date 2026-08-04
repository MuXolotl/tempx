package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;

/* JADX INFO: renamed from: lٌؚۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7678l {
    public static final HashMap yandex;

    static {
        HashMap map = new HashMap();
        yandex = map;
        map.put(InterfaceC0543l.f1922throw, new C9254l(12));
        map.put(InterfaceC0543l.f1918static, new C9254l(12));
        map.put(InterfaceC18049l.f35345l, new C9254l(12));
        map.put(InterfaceC15427l.f30146l, new C9254l(1));
        map.put(InterfaceC0543l.f1860abstract, new C9254l(0));
        map.put(InterfaceC15427l.f30177l, new C9254l(2));
        map.put(InterfaceC4502l.mopub, new C9254l(2));
        map.put(InterfaceC4502l.subs, new C9254l(7));
        map.put(InterfaceC15427l.f30173l, new C9254l(4));
        map.put(InterfaceC11987l.smaato, new C9254l(8));
        map.put(InterfaceC18410l.purchase, new C9254l(9));
        map.put(InterfaceC18410l.billing, new C9254l(9));
        map.put(InterfaceC18706l.loadAd, new C9254l(3));
        map.put(InterfaceC18706l.yandex, new C9254l(3));
        map.put(InterfaceC2716l.yandex, new C9254l(14));
        map.put(InterfaceC2716l.loadAd, new C9254l(15));
        map.put(InterfaceC2716l.crashlytics, new C9254l(5));
        map.put(InterfaceC2716l.amazon, new C9254l(6));
        map.put(InterfaceC8134l.f16997transient, new C9254l(10));
        map.put(InterfaceC8134l.f16986protected, new C9254l(10));
        map.put(InterfaceC8134l.f17000while, new C9254l(10));
        map.put(InterfaceC8134l.f16951implements, new C9254l(10));
        map.put(InterfaceC8134l.f16942const, new C9254l(10));
        map.put(InterfaceC8134l.f16988return, new C9254l(10));
        map.put(InterfaceC8134l.f16958l, new C9254l(11));
        map.put(InterfaceC8134l.f16977l, new C9254l(11));
        map.put(InterfaceC8134l.f16968l, new C9254l(11));
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16981l);
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16967l);
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16980l);
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16978l);
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16961l);
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16959l);
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16979l);
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16971l);
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16972l);
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16955l);
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16957l);
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16975l);
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16976l);
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16956l);
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16970l);
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16969l);
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16963l);
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16973l);
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16974l);
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16964l);
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16965l);
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16960l);
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16962l);
        AbstractC4338l.m1532package(map, InterfaceC8134l.f16966l);
    }

    public static AbstractC8831l yandex(C17029l c17029l) throws IOException {
        AbstractC8831l c9314l;
        C12410l c12410l;
        C7838l c7838l;
        C7838l c7838l2;
        byte b;
        String str;
        String str2;
        C12933l c12933l = null;
        if (c17029l == null) {
            C8339l.metrica("keyInfo argument null");
            return null;
        }
        C10198l c10198l = c17029l.f33175l;
        C9254l c9254l = (C9254l) yandex.get(c10198l.f20787l);
        if (c9254l == null) {
            C11467l.smaato(c10198l.f20787l, "algorithm identifier in public key not recognised: ");
            return null;
        }
        int i = 1;
        switch (c9254l.yandex) {
            case 0:
                C13061l c13061lVip = C13061l.vip(c17029l.f33175l.f20786l);
                Cstrictfp cstrictfp = (Cstrictfp) c17029l.metrica();
                BigInteger bigIntegerMetrica = c13061lVip.metrica();
                return new C7438l(cstrictfp.appmetrica(), new C2396l(bigIntegerMetrica != null ? bigIntegerMetrica.intValue() : 0, c13061lVip.f25574l.applovin(), c13061lVip.f25573l.applovin()));
            case 1:
                Cnative cnativeMetrica = c17029l.metrica();
                if (cnativeMetrica == null) {
                    c12410l = (C12410l) cnativeMetrica;
                } else {
                    if (!(cnativeMetrica instanceof Cstrictfp)) {
                        C8339l.metrica("Invalid DHPublicKey: ".concat(cnativeMetrica.getClass().getName()));
                        return null;
                    }
                    c12410l = new C12410l();
                    c12410l.f24504l = (Cstrictfp) cnativeMetrica;
                }
                BigInteger bigIntegerApplovin = c12410l.f24504l.applovin();
                C0500l c0500lVip = C0500l.vip(c17029l.f33175l.f20786l);
                BigInteger bigIntegerApplovin2 = c0500lVip.f1811l.applovin();
                BigInteger bigIntegerApplovin3 = c0500lVip.f1810l.applovin();
                BigInteger bigIntegerApplovin4 = c0500lVip.f1809l.applovin();
                BigInteger bigIntegerMetrica2 = c0500lVip.metrica() != null ? c0500lVip.metrica() : null;
                C14839l c14839l = c0500lVip.f1812l;
                return new C7438l(bigIntegerApplovin, new C2396l(bigIntegerApplovin2, bigIntegerApplovin3, bigIntegerApplovin4, 160, 0, bigIntegerMetrica2, c14839l != null ? new C14396l(c14839l.f29052l.applovin(), c14839l.f29051l.applovin().intValue()) : null));
            case 2:
                Cstrictfp cstrictfp2 = (Cstrictfp) c17029l.metrica();
                applovin applovinVar = c17029l.f33175l.f20786l;
                if (applovinVar != null) {
                    C15281l c15281lVip = C15281l.vip(applovinVar.billing());
                    c12933l = new C12933l(c15281lVip.f29883l.applovin(), c15281lVip.f29882l.applovin(), c15281lVip.f29881l.applovin());
                }
                return new C4767l(cstrictfp2.appmetrica(), c12933l);
            case 3:
                C10198l c10198l2 = c17029l.f33175l;
                Cfor cfor = c10198l2.f20787l;
                C14772l c14772lVip = C14772l.vip(c10198l2.f20786l);
                try {
                    byte[] bArrCrashlytics = AbstractC14024l.crashlytics(((Cthrow) c17029l.metrica()).f36593l);
                    Cfor cfor2 = InterfaceC18706l.yandex;
                    if (cfor.ad(cfor2)) {
                        C9254l.loadAd(bArrCrashlytics);
                    }
                    Cfor cfor3 = c14772lVip.f28858l;
                    if (cfor3 != null) {
                        c7838l = AbstractC11456l.loadAd(cfor3);
                    } else {
                        C4301l c4301l = c14772lVip.f28857l;
                        byte[] bArrCrashlytics2 = AbstractC14024l.crashlytics(c4301l.f8830l.f36593l);
                        if (cfor.ad(cfor2)) {
                            C9254l.loadAd(bArrCrashlytics2);
                        }
                        BigInteger bigInteger = new BigInteger(1, bArrCrashlytics2);
                        C1550l c1550l = c4301l.f8827l;
                        C6304l c6304l = new C6304l(c1550l.f3837l, c1550l.f3836l, c1550l.f3835l, c1550l.f3838l, c4301l.f8826l.appmetrica(), bigInteger, null, null);
                        byte[] bArrCrashlytics3 = AbstractC14024l.crashlytics(c4301l.f8831l.f36593l);
                        if (cfor.ad(cfor2)) {
                            C9254l.loadAd(bArrCrashlytics3);
                        }
                        c7838l = new C7838l(c6304l, AbstractC0135l.loadAd(c6304l, bArrCrashlytics3), c4301l.f8829l.appmetrica(), InterfaceC11695l.startapp, null);
                    }
                    c9314l = new C4148l(AbstractC0135l.loadAd(c7838l.f16360l, bArrCrashlytics), c7838l);
                } catch (IOException unused) {
                    C8339l.metrica("error recovering DSTU public key");
                    return null;
                }
                break;
            case 4:
                Ccase ccase = C7130l.vip(c17029l.f33175l.f20786l).f14935l;
                if (ccase instanceof Cfor) {
                    Cfor cfor4 = (Cfor) ccase;
                    AbstractC18276l abstractC18276l = (AbstractC18276l) AbstractC1624l.crashlytics.get(cfor4);
                    C7100l c7100lAmazon = abstractC18276l == null ? null : abstractC18276l.amazon();
                    if (c7100lAmazon == null) {
                        c7100lAmazon = AbstractC17195l.admob(cfor4);
                    }
                    c7838l2 = new C2542l(cfor4, c7100lAmazon);
                } else {
                    c7838l2 = ccase instanceof Cvolatile ? null : new C7838l(C7100l.vip(ccase));
                }
                byte[] bArrApplovin = c17029l.f33174l.applovin();
                Cthrow c11327l = new C11327l(bArrApplovin);
                if (bArrApplovin[0] == 4 && bArrApplovin[1] == bArrApplovin.length - 2 && (((b = bArrApplovin[2]) == 2 || b == 3) && c7838l2.f16360l.firebase() >= bArrApplovin.length - 3)) {
                    try {
                        c11327l = (Cthrow) Ccase.advert(bArrApplovin);
                    } catch (IOException unused2) {
                        C8339l.metrica("error recovering public key");
                        return null;
                    }
                }
                AbstractC11918l abstractC11918l = c7838l2.f16360l;
                byte[] bArrCrashlytics4 = AbstractC14024l.crashlytics(c11327l.f36593l);
                new C11327l(bArrCrashlytics4);
                c9314l = new C4148l(abstractC11918l.mopub(bArrCrashlytics4).startapp(), c7838l2);
                break;
            case 5:
                return new C6254l(c17029l.f33174l.inmobi());
            case 6:
                return new C11104l(c17029l.f33174l.inmobi());
            case 7:
                C8414l c8414lVip = C8414l.vip(c17029l.f33175l.f20786l);
                c9314l = new C14223l(((Cstrictfp) c17029l.metrica()).appmetrica(), new C12425l(0, c8414lVip.f17421l.applovin(), c8414lVip.f17420l.applovin()));
                break;
            case 8:
                C13777l c13777lVip = C13777l.vip(c17029l.f33175l.f20786l);
                Cfor cfor5 = c13777lVip.f26893l;
                C6895l c6895l = new C6895l(new C2542l(cfor5, AbstractC11696l.amazon(cfor5)), cfor5, c13777lVip.f26892l, c13777lVip.f26891l);
                try {
                    byte[] bArr = ((Cthrow) c17029l.metrica()).f36593l;
                    if (bArr.length != 64) {
                        str = "invalid length for GOST3410_2001 public key";
                        C8339l.metrica(str);
                        return null;
                    }
                    byte[] bArr2 = new byte[65];
                    bArr2[0] = 4;
                    while (i <= 32) {
                        bArr2[i] = bArr[32 - i];
                        bArr2[i + 32] = bArr[64 - i];
                        i++;
                    }
                    return new C4148l(c6895l.f16360l.mopub(bArr2), c6895l);
                } catch (IOException unused3) {
                    str = "error recovering GOST3410_2001 public key";
                }
                break;
            case 9:
                C10198l c10198l3 = c17029l.f33175l;
                Cfor cfor6 = c10198l3.f20787l;
                C13777l c13777lVip2 = C13777l.vip(c10198l3.f20786l);
                Cfor cfor7 = c13777lVip2.f26893l;
                C6895l c6895l2 = new C6895l(new C2542l(cfor7, AbstractC11696l.amazon(cfor7)), cfor7, c13777lVip2.f26892l, c13777lVip2.f26891l);
                try {
                    Cthrow cthrow = (Cthrow) c17029l.metrica();
                    int i2 = cfor6.ad(InterfaceC18410l.billing) ? 64 : 32;
                    int i3 = i2 * 2;
                    byte[] bArr3 = cthrow.f36593l;
                    if (bArr3.length != i3) {
                        str2 = "invalid length for GOST3410_2012 public key";
                        C8339l.metrica(str2);
                        return null;
                    }
                    byte[] bArr4 = new byte[i3 + 1];
                    bArr4[0] = 4;
                    while (i <= i2) {
                        bArr4[i] = bArr3[i2 - i];
                        bArr4[i + i2] = bArr3[i3 - i];
                        i++;
                    }
                    return new C4148l(c6895l2.f16360l.mopub(bArr4), c6895l2);
                } catch (IOException unused4) {
                    str2 = "error recovering GOST3410_2012 public key";
                }
                break;
            case 10:
                return C9254l.yandex((C13812l) AbstractC14907l.amazon.get(c17029l.f33175l.f20787l), c17029l.f33174l);
            case 11:
                c9314l = new C1658l((C18493l) AbstractC14907l.loadAd.get(c17029l.f33175l.f20787l), c17029l.f33174l.inmobi());
                break;
            case 12:
                C5199l c5199lVip = C5199l.vip(c17029l.metrica());
                return new C6963l(false, c5199lVip.f11274l, c5199lVip.f11273l, false);
            case 13:
                try {
                    byte[] bArr5 = Cthrow.premium(c17029l.metrica()).f36593l;
                    return new C9314l((C18097l) AbstractC14907l.billing.get(c17029l.f33175l.f20787l), AbstractC14024l.vip(4, bArr5.length, bArr5));
                } catch (Exception unused5) {
                    c9314l = new C9314l((C18097l) AbstractC14907l.billing.get(c17029l.f33175l.f20787l), c17029l.f33174l.inmobi());
                }
                break;
            case 14:
                return new C15654l(c17029l.f33174l.inmobi());
            default:
                return new C14685l(c17029l.f33174l.inmobi());
        }
        return c9314l;
    }
}

package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lٍُؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2509l {
    public static final HashMap yandex;

    static {
        HashMap map = new HashMap();
        yandex = map;
        HashMap map2 = new HashMap();
        map.put(InterfaceC0543l.f1912l, "MD2");
        map.put(InterfaceC0543l.f1893l, "MD4");
        map.put(InterfaceC0543l.f1910l, "MD5");
        Cfor cfor = InterfaceC4502l.billing;
        map.put(cfor, "SHA-1");
        Cfor cfor2 = InterfaceC8134l.amazon;
        map.put(cfor2, "SHA-224");
        Cfor cfor3 = InterfaceC8134l.yandex;
        map.put(cfor3, "SHA-256");
        Cfor cfor4 = InterfaceC8134l.loadAd;
        map.put(cfor4, "SHA-384");
        Cfor cfor5 = InterfaceC8134l.crashlytics;
        map.put(cfor5, "SHA-512");
        map.put(InterfaceC8134l.purchase, "SHA-512(224)");
        map.put(InterfaceC8134l.billing, "SHA-512(256)");
        map.put(InterfaceC4368l.loadAd, "RIPEMD-128");
        map.put(InterfaceC4368l.yandex, "RIPEMD-160");
        map.put(InterfaceC4368l.crashlytics, "RIPEMD-128");
        map.put(InterfaceC6770l.loadAd, "RIPEMD-128");
        map.put(InterfaceC6770l.yandex, "RIPEMD-160");
        map.put(InterfaceC11987l.yandex, "GOST3411");
        map.put(InterfaceC2572l.yandex, "Tiger");
        map.put(InterfaceC6770l.crashlytics, "Whirlpool");
        Cfor cfor6 = InterfaceC8134l.mopub;
        map.put(cfor6, "SHA3-224");
        Cfor cfor7 = InterfaceC8134l.admob;
        map.put(cfor7, "SHA3-256");
        Cfor cfor8 = InterfaceC8134l.subs;
        map.put(cfor8, "SHA3-384");
        Cfor cfor9 = InterfaceC8134l.isPro;
        map.put(cfor9, "SHA3-512");
        map.put(InterfaceC8134l.firebase, "SHAKE128");
        map.put(InterfaceC8134l.smaato, "SHAKE256");
        map.put(InterfaceC13724l.ads, "SM3");
        Cfor cfor10 = InterfaceC4787l.subscription;
        map.put(cfor10, "BLAKE3-256");
        map2.put("SHA-1", new C10198l(cfor, C14998l.f29509l));
        map2.put("SHA-224", new C10198l(cfor2));
        map2.put("SHA224", new C10198l(cfor2));
        map2.put("SHA-256", new C10198l(cfor3));
        map2.put("SHA256", new C10198l(cfor3));
        map2.put("SHA-384", new C10198l(cfor4));
        map2.put("SHA384", new C10198l(cfor4));
        map2.put("SHA-512", new C10198l(cfor5));
        map2.put("SHA512", new C10198l(cfor5));
        map2.put("SHA3-224", new C10198l(cfor6));
        map2.put("SHA3-256", new C10198l(cfor7));
        map2.put("SHA3-384", new C10198l(cfor8));
        map2.put("SHA3-512", new C10198l(cfor9));
        map2.put("BLAKE3-256", new C10198l(cfor10));
    }

    public static String yandex(Cfor cfor) {
        String str = (String) yandex.get(cfor);
        return str != null ? str : cfor.inmobi();
    }
}

package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: lؘۘۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5920l extends AbstractC18717l {
    public final C1424l yandex = new C1424l(15);
    public final ConcurrentHashMap loadAd = new ConcurrentHashMap();

    @Override // defpackage.AbstractC18717l
    public final InterfaceC7501l loadAd(AbstractC8320l abstractC8320l) {
        Object c11681l;
        ConcurrentHashMap concurrentHashMap = this.loadAd;
        Object obj = concurrentHashMap.get(abstractC8320l);
        if (obj == null) {
            boolean zEquals = abstractC8320l.equals(vip.tapsense);
            C1424l c1424l = this.yandex;
            if (zEquals) {
                c11681l = new C11681l(c1424l, "MD5");
            } else if (abstractC8320l.equals(vip.signatures)) {
                c11681l = new C11681l(c1424l, "SHA-1");
            } else if (abstractC8320l.equals(vip.premium)) {
                c11681l = new C11681l(c1424l, "SHA-224");
            } else if (abstractC8320l.equals(vip.applovin)) {
                c11681l = new C11681l(c1424l, "SHA-256");
            } else if (abstractC8320l.equals(vip.appmetrica)) {
                c11681l = new C11681l(c1424l, "SHA-384");
            } else if (abstractC8320l.equals(vip.f36856strictfp)) {
                c11681l = new C11681l(c1424l, "SHA-512");
            } else if (abstractC8320l.equals(vip.inmobi)) {
                c11681l = new C11681l(c1424l, "SHA3-224");
            } else if (abstractC8320l.equals(vip.f36858throws)) {
                c11681l = new C11681l(c1424l, "SHA3-256");
            } else if (abstractC8320l.equals(vip.f36855package)) {
                c11681l = new C11681l(c1424l, "SHA3-384");
            } else if (abstractC8320l.equals(vip.f36857synchronized)) {
                c11681l = new C11681l(c1424l, "SHA3-512");
            } else if (abstractC8320l.equals(vip.license)) {
                c11681l = new C11681l(c1424l, "RIPEMD160");
            } else {
                vip vipVar = vip.subscription;
                if (abstractC8320l.equals(vipVar)) {
                    c11681l = new C17336l();
                } else if (abstractC8320l.equals(vip.firebase)) {
                    c11681l = new C11681l(c1424l, 0);
                } else if (abstractC8320l.equals(vip.smaato)) {
                    c11681l = new C15486l(c1424l);
                } else if (abstractC8320l.equals(vip.remoteconfig)) {
                    c11681l = new C11681l(c1424l, 1);
                } else if (abstractC8320l.equals(vip.vip)) {
                    c11681l = new C11681l(c1424l, 2);
                } else if (abstractC8320l.equals(vip.metrica)) {
                    c11681l = new C11681l(c1424l, 3);
                } else if (abstractC8320l.equals(vip.pro) || abstractC8320l.equals(vip.advert) || abstractC8320l.equals(vip.ad) || abstractC8320l.equals(vip.isVip)) {
                    c11681l = new C11681l();
                } else if (abstractC8320l.equals(vip.adcel)) {
                    c11681l = new C9457l(c1424l);
                } else if (abstractC8320l.equals(vip.startapp)) {
                    c11681l = new C13826l(c1424l);
                } else if (abstractC8320l.equals(vip.Signature)) {
                    c11681l = new C11681l();
                } else if (abstractC8320l.equals(vip.ads)) {
                    C11681l c11681l2 = new C11681l();
                    c11681l = c11681l2;
                } else {
                    c11681l = null;
                }
            }
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(abstractC8320l, c11681l);
            obj = objPutIfAbsent == null ? c11681l : objPutIfAbsent;
        }
        return (InterfaceC7501l) obj;
    }
}

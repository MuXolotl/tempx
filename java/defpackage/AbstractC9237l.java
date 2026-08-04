package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lٍؚؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9237l {
    public static final HashMap yandex;

    static {
        HashMap map = new HashMap();
        yandex = map;
        map.put("SHA-1", InterfaceC18049l.f35338l);
        map.put("SHA-224", InterfaceC8134l.amazon);
        map.put("SHA-256", InterfaceC8134l.yandex);
        map.put("SHA-384", InterfaceC8134l.loadAd);
        map.put("SHA-512", InterfaceC8134l.crashlytics);
        map.put("SHA-512/224", InterfaceC8134l.purchase);
        map.put("SHA-512/256", InterfaceC8134l.billing);
        map.put("SHA3-224", InterfaceC8134l.mopub);
        map.put("SHA3-256", InterfaceC8134l.admob);
        map.put("SHA3-384", InterfaceC8134l.subs);
        map.put("SHA3-512", InterfaceC8134l.isPro);
        map.put("SHAKE128", InterfaceC8134l.firebase);
        map.put("SHAKE256", InterfaceC8134l.smaato);
    }

    public static Cfor yandex(String str) {
        HashMap map = yandex;
        if (map.containsKey(str)) {
            return (Cfor) map.get(str);
        }
        C8339l.metrica(AbstractC14814l.startapp("unrecognised digest algorithm: ", str));
        return null;
    }
}

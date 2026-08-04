package defpackage;

import java.util.HashMap;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٌؐؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8455l {
    public static final HashMap loadAd;
    public static final HashMap yandex;

    static {
        HashMap map = new HashMap();
        yandex = map;
        HashMap map2 = new HashMap();
        loadAd = map2;
        Cfor cfor = InterfaceC8134l.yandex;
        map.put("SHA-256", cfor);
        Cfor cfor2 = InterfaceC8134l.crashlytics;
        map.put("SHA-512", cfor2);
        Cfor cfor3 = InterfaceC8134l.firebase;
        map.put("SHAKE128", cfor3);
        Cfor cfor4 = InterfaceC8134l.smaato;
        map.put("SHAKE256", cfor4);
        map2.put(cfor, "SHA-256");
        map2.put(cfor2, "SHA-512");
        map2.put(cfor3, "SHAKE128");
        map2.put(cfor4, "SHAKE256");
    }

    public static Cfor loadAd(String str) {
        Cfor cfor = (Cfor) yandex.get(str);
        if (cfor != null) {
            return cfor;
        }
        C8339l.metrica(AbstractC14814l.startapp("unrecognized digest name: ", str));
        return null;
    }

    public static InterfaceC16922l yandex(Cfor cfor) {
        if (cfor.ad(InterfaceC8134l.yandex)) {
            return new C2657l();
        }
        if (cfor.ad(InterfaceC8134l.crashlytics)) {
            return new C17711l();
        }
        if (cfor.ad(InterfaceC8134l.firebase)) {
            return new C17951l(128);
        }
        if (cfor.ad(InterfaceC8134l.smaato)) {
            return new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
        C8339l.metrica(AbstractC9361l.license("unrecognized digest OID: ", cfor));
        return null;
    }
}

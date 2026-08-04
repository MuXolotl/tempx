package defpackage;

import j$.util.DesugarCollections;
import java.util.Enumeration;
import java.util.Map;

/* JADX INFO: renamed from: lٍ۟ۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9856l {
    public static final C0376l amazon;
    public static final Map crashlytics;
    public static final Map loadAd;
    public static final Map yandex;

    static {
        C0376l c0376l = new C0376l();
        c0376l.put("nistp256", InterfaceC16863l.f32907synchronized);
        c0376l.put("nistp384", InterfaceC16863l.signatures);
        c0376l.put("nistp521", InterfaceC16863l.premium);
        c0376l.put("nistk163", InterfaceC16863l.loadAd);
        c0376l.put("nistp192", InterfaceC16863l.f32903package);
        c0376l.put("nistp224", InterfaceC16863l.isVip);
        c0376l.put("nistk233", InterfaceC16863l.subscription);
        c0376l.put("nistb233", InterfaceC16863l.tapsense);
        c0376l.put("nistk283", InterfaceC16863l.remoteconfig);
        c0376l.put("nistk409", InterfaceC16863l.applovin);
        c0376l.put("nistb409", InterfaceC16863l.appmetrica);
        c0376l.put("nistt571", InterfaceC16863l.inmobi);
        loadAd = DesugarCollections.unmodifiableMap(c0376l);
        C0376l c0376l2 = new C0376l();
        String[][] strArr = {new String[]{"secp256r1", "nistp256"}, new String[]{"secp384r1", "nistp384"}, new String[]{"secp521r1", "nistp521"}, new String[]{"sect163k1", "nistk163"}, new String[]{"secp192r1", "nistp192"}, new String[]{"secp224r1", "nistp224"}, new String[]{"sect233k1", "nistk233"}, new String[]{"sect233r1", "nistb233"}, new String[]{"sect283k1", "nistk283"}, new String[]{"sect409k1", "nistk409"}, new String[]{"sect409r1", "nistb409"}, new String[]{"sect571k1", "nistt571"}};
        for (int i = 0; i != 12; i++) {
            String[] strArr2 = strArr[i];
            c0376l2.put(strArr2[0], strArr2[1]);
        }
        crashlytics = DesugarCollections.unmodifiableMap(c0376l2);
        C0376l c0376l3 = new C0376l();
        Enumeration enumerationElements = AbstractC1624l.purchase.elements();
        while (enumerationElements.hasMoreElements()) {
            String str = (String) enumerationElements.nextElement();
            c0376l3.put(AbstractC1624l.purchase(str).crashlytics(), str);
        }
        amazon = c0376l3;
        C0376l c0376l4 = new C0376l();
        for (String str2 : loadAd.keySet()) {
            c0376l4.put(loadAd.get(str2), str2);
        }
        yandex = DesugarCollections.unmodifiableMap(c0376l4);
    }
}

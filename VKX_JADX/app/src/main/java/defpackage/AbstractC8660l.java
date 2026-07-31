package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: renamed from: lٌٌؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8660l {
    public static final Hashtable crashlytics;
    public static final Hashtable loadAd;
    public static final Hashtable yandex;

    static {
        C5948l c5948l = new C5948l(10);
        C5948l c5948l2 = new C5948l(11);
        yandex = new Hashtable();
        loadAd = new Hashtable();
        crashlytics = new Hashtable();
        loadAd("wapip192v1", InterfaceC13724l.purchase, c5948l2);
        loadAd("wapi192v1", InterfaceC13724l.billing, c5948l2);
        loadAd("sm2p256v1", InterfaceC13724l.crashlytics, c5948l);
    }

    public static void loadAd(String str, Cfor cfor, AbstractC18276l abstractC18276l) {
        yandex.put(AbstractC9008l.amazon(str), cfor);
        crashlytics.put(cfor, str);
        loadAd.put(cfor, abstractC18276l);
    }

    public static BigInteger yandex(String str) {
        return new BigInteger(1, AbstractC8535l.crashlytics(str));
    }
}

package defpackage;

import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tapsense {
    public static final Hashtable crashlytics;
    public static final Hashtable loadAd;
    public static final Hashtable yandex;

    static {
        subscription subscriptionVar = new subscription(0);
        Hashtable hashtable = new Hashtable();
        yandex = hashtable;
        Hashtable hashtable2 = new Hashtable();
        loadAd = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        crashlytics = hashtable3;
        Cfor cfor = Signature.yandex;
        hashtable.put(AbstractC9008l.amazon("FRP256v1"), cfor);
        hashtable3.put(cfor, "FRP256v1");
        hashtable2.put(cfor, subscriptionVar);
    }
}

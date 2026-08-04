package defpackage;

import java.util.Hashtable;

/* JADX INFO: renamed from: lؙۖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6662l {
    public static final Hashtable yandex = new Hashtable();
    public static final Hashtable loadAd = new Hashtable();

    static {
        yandex("B-571", InterfaceC16863l.f32909throws);
        yandex("B-409", InterfaceC16863l.appmetrica);
        yandex("B-283", InterfaceC16863l.vip);
        yandex("B-233", InterfaceC16863l.tapsense);
        yandex("B-163", InterfaceC16863l.smaato);
        yandex("K-571", InterfaceC16863l.inmobi);
        yandex("K-409", InterfaceC16863l.applovin);
        yandex("K-283", InterfaceC16863l.remoteconfig);
        yandex("K-233", InterfaceC16863l.subscription);
        yandex("K-163", InterfaceC16863l.loadAd);
        yandex("P-521", InterfaceC16863l.premium);
        yandex("P-384", InterfaceC16863l.signatures);
        yandex("P-256", InterfaceC16863l.f32907synchronized);
        yandex("P-224", InterfaceC16863l.isVip);
        yandex("P-192", InterfaceC16863l.f32903package);
    }

    public static C7100l loadAd(Cfor cfor) {
        AbstractC18276l abstractC18276l;
        if (!loadAd.containsKey(cfor) || (abstractC18276l = (AbstractC18276l) AbstractC6569l.loadAd.get(cfor)) == null) {
            return null;
        }
        return abstractC18276l.amazon();
    }

    public static void yandex(String str, Cfor cfor) {
        yandex.put(str, cfor);
        loadAd.put(cfor, str);
    }
}

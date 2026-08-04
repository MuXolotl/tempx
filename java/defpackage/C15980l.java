package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: lٕ۠ۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15980l {
    public static final Map admob;
    public final int amazon;
    public final int billing;
    public final int crashlytics;
    public final int loadAd;
    public final C12676l mopub;
    public final String purchase;
    public final C11725l yandex;

    static {
        HashMap map = new HashMap();
        Cfor cfor = InterfaceC8134l.yandex;
        map.put(1, new C15980l(10, cfor));
        map.put(2, new C15980l(16, cfor));
        map.put(3, new C15980l(20, cfor));
        Cfor cfor2 = InterfaceC8134l.crashlytics;
        map.put(4, new C15980l(10, cfor2));
        map.put(5, new C15980l(16, cfor2));
        map.put(6, new C15980l(20, cfor2));
        Cfor cfor3 = InterfaceC8134l.firebase;
        map.put(7, new C15980l(10, cfor3));
        map.put(8, new C15980l(16, cfor3));
        map.put(9, new C15980l(20, cfor3));
        Cfor cfor4 = InterfaceC8134l.smaato;
        map.put(10, new C15980l(10, cfor4));
        map.put(11, new C15980l(16, cfor4));
        map.put(12, new C15980l(20, cfor4));
        admob = DesugarCollections.unmodifiableMap(map);
    }

    public C15980l(int i, Cfor cfor) {
        if (i < 2) {
            C8339l.metrica("height must be >= 2");
            throw null;
        }
        if (cfor == null) {
            C6541l.subs("digest == null");
            throw null;
        }
        this.loadAd = i;
        int i2 = 2;
        while (true) {
            int i3 = this.loadAd;
            if (i2 > i3) {
                C8339l.smaato("should never happen...");
                throw null;
            }
            if ((i3 - i2) % 2 == 0) {
                this.crashlytics = i2;
                String str = (String) AbstractC8455l.loadAd.get(cfor);
                if (str == null) {
                    C8339l.metrica(AbstractC9361l.license("unrecognized digest oid: ", cfor));
                    throw null;
                }
                this.purchase = str;
                C12676l c12676l = new C12676l(cfor);
                this.mopub = c12676l;
                int i4 = c12676l.loadAd;
                this.billing = i4;
                int i5 = c12676l.crashlytics;
                this.amazon = i5;
                this.yandex = (C11725l) C11725l.crashlytics.get(C11725l.yandex(str, i4, i5, c12676l.amazon, i));
                return;
            }
            i2++;
        }
    }

    public C15980l(int i, InterfaceC16922l interfaceC16922l) {
        this(i, AbstractC8455l.loadAd(interfaceC16922l.getAlgorithmName()));
    }
}

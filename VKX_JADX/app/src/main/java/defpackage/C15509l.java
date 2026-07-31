package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: lؘٕۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15509l {
    public static final Map purchase;
    public final int amazon;
    public final int crashlytics;
    public final C15980l loadAd;
    public final C15205l yandex;

    static {
        HashMap map = new HashMap();
        Cfor cfor = InterfaceC8134l.yandex;
        map.put(1, new C15509l(20, 2, cfor));
        AbstractC9029l.Signature(20, 4, cfor, map, 2);
        AbstractC9029l.Signature(40, 2, cfor, map, 3);
        AbstractC9029l.Signature(40, 4, cfor, map, 4);
        AbstractC9029l.Signature(40, 8, cfor, map, 5);
        AbstractC9029l.Signature(60, 3, cfor, map, 6);
        AbstractC9029l.Signature(60, 6, cfor, map, 7);
        AbstractC9029l.Signature(60, 12, cfor, map, 8);
        Cfor cfor2 = InterfaceC8134l.crashlytics;
        map.put(9, new C15509l(20, 2, cfor2));
        AbstractC9029l.Signature(20, 4, cfor2, map, 10);
        AbstractC9029l.Signature(40, 2, cfor2, map, 11);
        AbstractC9029l.Signature(40, 4, cfor2, map, 12);
        AbstractC9029l.Signature(40, 8, cfor2, map, 13);
        AbstractC9029l.Signature(60, 3, cfor2, map, 14);
        AbstractC9029l.Signature(60, 6, cfor2, map, 15);
        AbstractC9029l.Signature(60, 12, cfor2, map, 16);
        Cfor cfor3 = InterfaceC8134l.firebase;
        map.put(17, new C15509l(20, 2, cfor3));
        AbstractC9029l.Signature(20, 4, cfor3, map, 18);
        AbstractC9029l.Signature(40, 2, cfor3, map, 19);
        AbstractC9029l.Signature(40, 4, cfor3, map, 20);
        AbstractC9029l.Signature(40, 8, cfor3, map, 21);
        AbstractC9029l.Signature(60, 3, cfor3, map, 22);
        AbstractC9029l.Signature(60, 6, cfor3, map, 23);
        AbstractC9029l.Signature(60, 12, cfor3, map, 24);
        Cfor cfor4 = InterfaceC8134l.smaato;
        map.put(25, new C15509l(20, 2, cfor4));
        AbstractC9029l.Signature(20, 4, cfor4, map, 26);
        AbstractC9029l.Signature(40, 2, cfor4, map, 27);
        AbstractC9029l.Signature(40, 4, cfor4, map, 28);
        AbstractC9029l.Signature(40, 8, cfor4, map, 29);
        AbstractC9029l.Signature(60, 3, cfor4, map, 30);
        AbstractC9029l.Signature(60, 6, cfor4, map, 31);
        AbstractC9029l.Signature(60, 12, cfor4, map, 32);
        purchase = DesugarCollections.unmodifiableMap(map);
    }

    public C15509l(int i, int i2, Cfor cfor) {
        this.crashlytics = i;
        this.amazon = i2;
        if (i < 2) {
            C8339l.metrica("totalHeight must be > 1");
            throw null;
        }
        if (i % i2 != 0) {
            C8339l.metrica("layers must divide totalHeight without remainder");
            throw null;
        }
        int i3 = i / i2;
        if (i3 == 1) {
            C8339l.metrica("height / layers must be greater than 1");
            throw null;
        }
        C15980l c15980l = new C15980l(i3, cfor);
        this.loadAd = c15980l;
        int i4 = c15980l.mopub.amazon;
        String str = c15980l.purchase;
        if (str != null) {
            this.yandex = (C15205l) C15205l.crashlytics.get(C15205l.yandex(c15980l.billing, c15980l.amazon, i4, i, i2, str));
        } else {
            Map map = C15205l.crashlytics;
            C6541l.subs("algorithmName == null");
            throw null;
        }
    }

    public C15509l(int i, int i2, InterfaceC16922l interfaceC16922l) {
        this(i, i2, AbstractC8455l.loadAd(interfaceC16922l.getAlgorithmName()));
    }
}

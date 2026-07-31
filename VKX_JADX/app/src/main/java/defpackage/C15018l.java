package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lٔٛۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15018l {
    public final LinkedHashMap yandex = new LinkedHashMap();

    public final String toString() {
        String strLicense = AbstractC18202l.yandex.loadAd(C15018l.class).license();
        if (strLicense == null) {
            strLicense = "ViewModelStore";
        }
        int iHashCode = hashCode();
        AbstractC8576l.loadAd(16);
        return strLicense + "@" + Integer.toString(iHashCode, 16) + "(keys=" + AbstractC16901l.m4229l(this.yandex.keySet()) + ")";
    }

    public final void yandex() {
        LinkedHashMap linkedHashMap = this.yandex;
        Map mapTapsense = AbstractC8676l.tapsense(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = mapTapsense.values().iterator();
        while (it.hasNext()) {
            ((AbstractC4350l) it.next()).yandex();
        }
    }
}

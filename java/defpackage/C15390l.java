package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lٕٕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15390l {
    public final List amazon;
    public final Map crashlytics;
    public final Map loadAd;
    public final C18221l purchase;
    public final List yandex;

    public C15390l(List list, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, ArrayList arrayList, C18221l c18221l, int i) {
        int i2 = i & 2;
        C14054l c14054l = C14054l.f27396l;
        Map map = i2 != 0 ? c14054l : linkedHashMap;
        Map map2 = (i & 4) != 0 ? c14054l : linkedHashMap2;
        List list2 = (i & 8) != 0 ? C2580l.f5619l : arrayList;
        c18221l = (i & 16) != 0 ? null : c18221l;
        this.yandex = list;
        this.loadAd = map;
        this.crashlytics = map2;
        this.amazon = list2;
        this.purchase = c18221l;
    }

    public final String toString() {
        String str;
        C18221l c18221l = this.purchase;
        if (c18221l == null) {
            str = "";
        } else {
            str = ", template=" + ((Object) C18221l.loadAd(c18221l.yandex));
        }
        return "Request(streams=" + this.yandex + str + ")@" + Integer.toHexString(hashCode());
    }
}

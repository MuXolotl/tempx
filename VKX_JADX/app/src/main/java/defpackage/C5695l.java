package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lؘٔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5695l {
    public final String yandex;
    public final ArrayList loadAd = new ArrayList();
    public C8195l crashlytics = new C8195l("V", null);

    public C5695l(C18396l c18396l, String str, String str2) {
        this.yandex = str2;
    }

    public final void loadAd(String str, C9217l... c9217lArr) {
        C14297l c14297l = new C14297l(1, new C9636l(10, c9217lArr));
        int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(c14297l, 10));
        if (iFirebase < 16) {
            iFirebase = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase);
        Iterator it = c14297l.iterator();
        while (true) {
            C14596l c14596l = (C14596l) it;
            if (!c14596l.f28578l.hasNext()) {
                this.crashlytics = new C8195l(str, new C16750l(linkedHashMap));
                return;
            } else {
                C1143l c1143l = (C1143l) c14596l.next();
                linkedHashMap.put(Integer.valueOf(c1143l.yandex), (C9217l) c1143l.loadAd);
            }
        }
    }

    public final void yandex(String str, C9217l... c9217lArr) {
        C16750l c16750l;
        if (c9217lArr.length == 0) {
            c16750l = null;
        } else {
            C14297l c14297l = new C14297l(1, new C9636l(10, c9217lArr));
            int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(c14297l, 10));
            if (iFirebase < 16) {
                iFirebase = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase);
            Iterator it = c14297l.iterator();
            while (true) {
                C14596l c14596l = (C14596l) it;
                if (!c14596l.f28578l.hasNext()) {
                    break;
                }
                C1143l c1143l = (C1143l) c14596l.next();
                linkedHashMap.put(Integer.valueOf(c1143l.yandex), (C9217l) c1143l.loadAd);
            }
            c16750l = new C16750l(linkedHashMap);
        }
        this.loadAd.add(new C8195l(str, c16750l));
    }
}

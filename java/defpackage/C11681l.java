package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: lؙِۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11681l implements InterfaceC7501l {
    public C11681l(C1424l c1424l, int i) {
        switch (i) {
            case 1:
                new C2613l(this, 9);
                break;
            case 2:
                new C2613l(this, 10);
                break;
            case 3:
                new C2613l(this, 11);
                break;
            default:
                new C2613l(this, 8);
                break;
        }
    }

    public C11681l(C1424l c1424l, String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c1424l.f3603l;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            C16783l c16783l = new C16783l(new C8362l(str, 1));
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(str, c16783l);
            obj = objPutIfAbsent == null ? c16783l : objPutIfAbsent;
        }
    }
}

package defpackage;

/* JADX INFO: renamed from: lٟؒ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1243l {
    public final String loadAd;
    public final C0114l yandex;

    public C1243l(C0114l c0114l, String str) {
        this.yandex = c0114l;
        this.loadAd = str;
    }

    public final Object yandex(Object obj, Object obj2) {
        C0114l c0114l = this.yandex;
        Object obj3 = c0114l.get(obj);
        if (obj3 == null) {
            c0114l.appmetrica(obj, obj2);
            return null;
        }
        if (obj3.equals(obj2)) {
            return null;
        }
        return obj3;
    }

    public C1243l(C0114l c0114l) {
        this(c0114l, c0114l.f26701l);
    }
}

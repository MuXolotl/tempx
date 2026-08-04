package defpackage;

/* JADX INFO: renamed from: lۣؕ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3682l {
    public final C7394l yandex(Object obj, Object obj2) {
        C7394l c7394lLoadAd = (C7394l) obj;
        C7394l c7394l = (C7394l) obj2;
        if (!c7394l.isEmpty()) {
            if (!c7394lLoadAd.f15321l) {
                c7394lLoadAd = c7394lLoadAd.loadAd();
            }
            c7394lLoadAd.yandex();
            if (!c7394l.isEmpty()) {
                c7394lLoadAd.putAll(c7394l);
            }
        }
        return c7394lLoadAd;
    }
}

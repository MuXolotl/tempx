package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: lً۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8307l {
    public static final C8307l crashlytics = new C8307l();
    public final ConcurrentHashMap loadAd = new ConcurrentHashMap();
    public final C12143l yandex = new C12143l();

    public final InterfaceC12940l yandex(Class cls) {
        InterfaceC12940l c5494l;
        ConcurrentHashMap concurrentHashMap = this.loadAd;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (InterfaceC12940l) obj;
        }
        C12143l c12143l = this.yandex;
        c12143l.getClass();
        C8565l c8565l = AbstractC9626l.yandex;
        if (!AbstractC0288l.class.isAssignableFrom(cls)) {
            int i = AbstractC5004l.yandex;
        }
        C15683l c15683lCrashlytics = c12143l.yandex.crashlytics(cls);
        if ((c15683lCrashlytics.amazon & 2) == 2) {
            int i2 = AbstractC5004l.yandex;
            C8565l c8565l2 = AbstractC9626l.yandex;
            C6096l c6096l = AbstractC9206l.yandex;
            c5494l = new C5494l(c8565l2, c15683lCrashlytics.yandex);
        } else {
            int i3 = AbstractC5004l.yandex;
            int i4 = AbstractC13704l.yandex;
            int i5 = AbstractC9983l.yandex;
            C8565l c8565l3 = AbstractC9626l.yandex;
            C6096l c6096l2 = c15683lCrashlytics.yandex() + (-1) != 1 ? AbstractC9206l.yandex : null;
            int i6 = AbstractC18494l.yandex;
            c5494l = C3661l.advert(c15683lCrashlytics, c8565l3, c6096l2);
        }
        InterfaceC12940l interfaceC12940l = (InterfaceC12940l) concurrentHashMap.putIfAbsent(cls, c5494l);
        return interfaceC12940l != null ? interfaceC12940l : c5494l;
    }
}

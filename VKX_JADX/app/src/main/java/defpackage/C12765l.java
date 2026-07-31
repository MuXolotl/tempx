package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: lّۖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12765l {
    public static final C12765l crashlytics = new C12765l();
    public final ConcurrentHashMap loadAd = new ConcurrentHashMap();
    public final C1053l yandex = new C1053l();

    public final InterfaceC0101l yandex(Class cls) {
        InterfaceC0101l c13721l;
        Charset charset = AbstractC11966l.yandex;
        if (cls == null) {
            C6541l.subs("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.loadAd;
        InterfaceC0101l interfaceC0101l = (InterfaceC0101l) concurrentHashMap.get(cls);
        if (interfaceC0101l != null) {
            return interfaceC0101l;
        }
        C1053l c1053l = this.yandex;
        c1053l.getClass();
        C16222l c16222l = AbstractC3622l.yandex;
        if (!AbstractC17187l.class.isAssignableFrom(cls)) {
            int i = AbstractC0286l.yandex;
        }
        C4687l c4687lCrashlytics = c1053l.yandex.crashlytics(cls);
        if ((c4687lCrashlytics.amazon & 2) == 2) {
            int i2 = AbstractC0286l.yandex;
            C16222l c16222l2 = AbstractC3622l.yandex;
            C2183l c2183l = AbstractC16478l.yandex;
            c13721l = new C13721l(c16222l2, c4687lCrashlytics.yandex);
        } else {
            int i3 = AbstractC0286l.yandex;
            int i4 = AbstractC14037l.yandex;
            int i5 = AbstractC5527l.yandex;
            C16222l c16222l3 = AbstractC3622l.yandex;
            C2183l c2183l2 = c4687lCrashlytics.yandex() + (-1) != 1 ? AbstractC16478l.yandex : null;
            int i6 = AbstractC14230l.yandex;
            c13721l = C4048l.firebase(c4687lCrashlytics, c16222l3, c2183l2);
        }
        InterfaceC0101l interfaceC0101l2 = (InterfaceC0101l) concurrentHashMap.putIfAbsent(cls, c13721l);
        return interfaceC0101l2 != null ? interfaceC0101l2 : c13721l;
    }
}

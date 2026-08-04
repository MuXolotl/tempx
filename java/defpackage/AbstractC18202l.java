package defpackage;

import java.util.Collections;

/* JADX INFO: renamed from: l٘ۛٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18202l {
    public static final C2336l yandex;

    static {
        C2336l c2336l = null;
        try {
            c2336l = (C2336l) C2076l.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c2336l == null) {
            c2336l = new C2336l();
        }
        yandex = c2336l;
    }

    public static InterfaceC13012l crashlytics(Class cls, C0861l... c0861lArr) {
        C2336l c2336l = yandex;
        return c2336l.remoteconfig(c2336l.loadAd(cls), AbstractC8669l.m2415super(c0861lArr), false);
    }

    public static InterfaceC13012l loadAd(Class cls, C0861l c0861l) {
        C2336l c2336l = yandex;
        return c2336l.remoteconfig(c2336l.loadAd(cls), Collections.singletonList(c0861l), false);
    }

    public static InterfaceC13012l yandex(Class cls) {
        C2336l c2336l = yandex;
        return c2336l.remoteconfig(c2336l.loadAd(cls), Collections.EMPTY_LIST, false);
    }
}

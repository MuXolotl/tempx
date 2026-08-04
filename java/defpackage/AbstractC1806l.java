package defpackage;

import java.io.Serializable;
import java.util.Collections;
import kotlin.Unit;

/* JADX INFO: renamed from: lؙّؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1806l {
    public static final InterfaceC13012l amazon;
    public static final InterfaceC13012l crashlytics;
    public static final InterfaceC13012l loadAd;
    public static final C13267l purchase;
    public static final InterfaceC13012l yandex = AbstractC18202l.yandex(Object.class);

    static {
        C2336l c2336l = AbstractC18202l.yandex;
        loadAd = c2336l.remoteconfig(c2336l.loadAd(Object.class), Collections.EMPTY_LIST, true);
        crashlytics = AbstractC18202l.yandex(Cloneable.class);
        amazon = AbstractC18202l.yandex(Serializable.class);
        InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(Unit.class);
        C15152l c15152l = C15152l.f29726l;
        C2580l c2580l = C2580l.f5619l;
        purchase = new C13267l(interfaceC1388lLoadAd, c2580l, false, c2580l, null, false, false, false, null, c15152l);
    }
}

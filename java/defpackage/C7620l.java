package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lؚٕۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7620l implements InterfaceC16061l {
    public final C16838l amazon;
    public final C15079l billing;
    public final C18396l crashlytics;
    public final C14482l loadAd;
    public final C16543l purchase;
    public final C14965l yandex;

    public C7620l(C14965l c14965l, C14482l c14482l) {
        C18396l c18396l = AbstractC15319l.yandex;
        C16838l c16838l = new C16838l(AbstractC15319l.loadAd);
        C16543l c16543l = new C16543l((byte) 0, 21);
        this.yandex = c14965l;
        this.loadAd = c14482l;
        this.crashlytics = c18396l;
        this.amazon = c16838l;
        this.purchase = c16543l;
        this.billing = new C15079l(26, this);
    }

    public final InterfaceC16115l loadAd(AbstractC17569l abstractC17569l, C6886l c6886l, int i, int i2) {
        C14482l c14482l = this.loadAd;
        c14482l.getClass();
        int i3 = c14482l.yandex;
        C6886l c6886l2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? c6886l : new C6886l(AbstractC8576l.purchase(c6886l.f14426l + i3, 1, 1000));
        this.yandex.getClass();
        return yandex(new C16627l(abstractC17569l, c6886l2, i, i2, null));
    }

    public final InterfaceC16115l yandex(C16627l c16627l) {
        C18396l c18396l = this.crashlytics;
        C3005l c3005l = new C3005l(this, c16627l, 14);
        synchronized (((C14529l) c18396l.f35934l)) {
            InterfaceC16115l interfaceC16115l = (InterfaceC16115l) ((C1579l) c18396l.f35933l).loadAd(c16627l);
            if (interfaceC16115l != null) {
                if (interfaceC16115l.yandex()) {
                    return interfaceC16115l;
                }
            }
            try {
                InterfaceC16115l interfaceC16115l2 = (InterfaceC16115l) c3005l.invoke(new C15575l(c18396l, c16627l, 5));
                synchronized (((C14529l) c18396l.f35934l)) {
                    try {
                        if (((C1579l) c18396l.f35933l).loadAd(c16627l) == null && interfaceC16115l2.yandex()) {
                            ((C1579l) c18396l.f35933l).crashlytics(c16627l, interfaceC16115l2);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return interfaceC16115l2;
            } catch (Exception e) {
                C4875l.remoteconfig("Could not load font", e);
                return null;
            }
        }
    }
}

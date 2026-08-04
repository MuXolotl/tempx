package defpackage;

/* JADX INFO: renamed from: lٍُۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10944l {
    public static final InterfaceC11227l amazon;
    public static final InterfaceC11227l crashlytics;
    public static final InterfaceC12904l loadAd;
    public static final InterfaceC12904l yandex;

    static {
        C1698l c1698l = new C1698l(2);
        boolean z = AbstractC16035l.yandex;
        yandex = z ? new C5602l(c1698l) : new C0458l(c1698l);
        C1698l c1698l2 = new C1698l(3);
        loadAd = z ? new C5602l(c1698l2) : new C0458l(c1698l2);
        C14813l c14813l = new C14813l((byte) 0, 0);
        crashlytics = z ? new C5602l(c14813l) : new C18595l(c14813l);
        C14813l c14813l2 = new C14813l((byte) 0, 1);
        amazon = z ? new C5602l(c14813l2) : new C18595l(c14813l2);
    }
}

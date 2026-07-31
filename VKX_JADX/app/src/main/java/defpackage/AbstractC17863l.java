package defpackage;

/* JADX INFO: renamed from: lّ٘ؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17863l {
    public static final C13315l yandex = AbstractC0532l.admob(0.0f, 400.0f, AbstractC11922l.yandex, 1);
    public static final C9144l loadAd = new C9144l();

    static {
        new C13660l();
    }

    public static final void loadAd(C15578l c15578l, C6956l c6956l, int i) {
        c6956l.m2133new(1908320054);
        int i2 = 0;
        int i3 = 1;
        if (c6956l.m2127for(i & 1, (i & 3) != 2)) {
            AbstractC14760l.yandex(AbstractC14566l.amazon(2062852661, new C2892l(i2, c15578l), c6956l), c6956l, 6);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3782l(c15578l, i, i3);
        }
    }

    public static final void yandex(int i, C15578l c15578l, C6956l c6956l, InterfaceC17242l interfaceC17242l) {
        c6956l.m2133new(646379026);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(c15578l) ? 32 : 16;
        }
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            loadAd(AbstractC14566l.amazon(1948801580, new C13873l(c15578l), c6956l), c6956l, 6);
            interfaceC17242l = C4346l.f8873l;
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C13000l(interfaceC17242l, c15578l, i, i3);
        }
    }
}

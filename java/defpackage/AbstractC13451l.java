package defpackage;

/* JADX INFO: renamed from: lْ٘ۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13451l {
    public static final C17253l yandex;

    static {
        AbstractC3605l.yandex(12.0f, 2.0f);
        AbstractC3605l.amazon(12.0f, 0.0f, 4.0f, 0.0f, 10);
        float f = AbstractC14744l.yandex;
        yandex = new C17253l(12.0f, 0.0f, 12.0f, 0.0f);
        AbstractC3605l.yandex(0.0f, 2.0f);
    }

    public static C3500l yandex(C0764l c0764l) {
        C3500l c3500l = c0764l.f2310protected;
        if (c3500l != null) {
            return c3500l;
        }
        C3500l c3500l2 = new C3500l(AbstractC15038l.amazon(c0764l, 18), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)));
        c0764l.f2310protected = c3500l2;
        return c3500l2;
    }
}

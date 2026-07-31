package defpackage;

/* JADX INFO: renamed from: l٘ۢۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18295l implements InterfaceC15451l {
    public static final C18295l yandex = new C18295l();

    @Override // defpackage.InterfaceC15451l
    public final InterfaceC17242l yandex(InterfaceC17242l interfaceC17242l, float f, boolean z) {
        if (f <= 0.0d) {
            AbstractC10440l.yandex("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return interfaceC17242l.premium(new C9247l(f, z));
    }
}

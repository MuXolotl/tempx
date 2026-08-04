package defpackage;

/* JADX INFO: renamed from: lٔؒۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14631l {
    public static final C8540l yandex = new C8540l(new C8241l(22));

    public static final InterfaceC17242l yandex(InterfaceC17242l interfaceC17242l, C2403l c2403l, InterfaceC2186l interfaceC2186l) {
        if (interfaceC2186l == null) {
            return interfaceC17242l;
        }
        return interfaceC2186l instanceof InterfaceC2186l ? interfaceC17242l.premium(new C8022l(c2403l, interfaceC2186l)) : AbstractC17541l.loadAd(interfaceC17242l, new C0541l(interfaceC2186l, c2403l, 2));
    }
}

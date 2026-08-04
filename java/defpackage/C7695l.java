package defpackage;

/* JADX INFO: renamed from: lًؐٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l(with = C6000l.class)
public final class C7695l {
    public static final C14636l Companion = new C14636l();
    public C2494l loadAd;
    public byte[] yandex;

    public C7695l(byte[] bArr) {
        this.yandex = bArr;
    }

    public final Object yandex(InterfaceC16588l interfaceC16588l) {
        Object objSubs;
        C2494l c2494l = this.loadAd;
        if (c2494l != null) {
            objSubs = c2494l.f5291l;
        } else {
            byte[] bArr = this.yandex;
            objSubs = bArr != null ? AbstractC14289l.subs(interfaceC16588l, bArr) : null;
        }
        this.loadAd = null;
        this.yandex = null;
        return objSubs;
    }
}

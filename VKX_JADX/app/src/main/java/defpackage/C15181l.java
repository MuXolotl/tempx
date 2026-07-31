package defpackage;

/* JADX INFO: renamed from: lًٔۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15181l implements InterfaceC5329l {
    public final /* synthetic */ C4568l yandex;

    public C15181l(C4568l c4568l) {
        this.yandex = c4568l;
    }

    @Override // defpackage.InterfaceC5329l
    public final C18389l yandex(C8795l c8795l) {
        C18389l c18389lLoadAd = c8795l.loadAd(c8795l.purchase);
        C10049l c10049lYandex = c18389lLoadAd.yandex();
        c10049lYandex.mopub = new C16679l(c18389lLoadAd.f35907l, this.yandex);
        return c10049lYandex.yandex();
    }
}

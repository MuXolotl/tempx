package defpackage;

/* JADX INFO: renamed from: lؔؓؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2345l implements InterfaceC3804l {
    public final C15406l loadAd;
    public final Object yandex;

    public C2345l(Object obj, C15406l c15406l) {
        this.yandex = obj;
        this.loadAd = c15406l;
    }

    @Override // defpackage.InterfaceC3804l
    public final boolean test(Object obj) {
        return AbstractC8576l.yandex(this.loadAd.invoke(obj), this.yandex);
    }
}

package defpackage;

/* JADX INFO: renamed from: lًٌؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7143l implements InterfaceC3189l {
    public final /* synthetic */ C3813l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C7143l(C3813l c3813l, int i) {
        this.yandex = i;
        this.loadAd = c3813l;
    }

    @Override // defpackage.InterfaceC3189l
    public final boolean loadAd(Object obj) {
        switch (this.yandex) {
            case 0:
                return ((InterfaceC0838l) obj).admob();
            default:
                return ((InterfaceC0838l) obj).mopub();
        }
    }

    @Override // defpackage.InterfaceC3189l
    public final String yandex(Object obj) {
        int i = this.yandex;
        C3813l c3813l = this.loadAd;
        switch (i) {
            case 0:
                return AbstractC13402l.purchase(AbstractC13402l.crashlytics(AbstractC6052l.yandex, ((InterfaceC0838l) obj).crashlytics()), c3813l.loadAd(), false);
            default:
                return AbstractC13402l.purchase(((InterfaceC0838l) obj).firebase(), c3813l.loadAd(), false);
        }
    }
}

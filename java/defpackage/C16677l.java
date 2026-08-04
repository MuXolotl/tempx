package defpackage;

/* JADX INFO: renamed from: lؙٖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16677l implements InterfaceC16652l {
    public final /* synthetic */ C9950l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C16677l(C9950l c9950l, int i) {
        this.yandex = i;
        this.loadAd = c9950l;
    }

    @Override // defpackage.InterfaceC16652l
    public final void run() {
        int i = this.yandex;
        C9950l c9950l = this.loadAd;
        switch (i) {
            case 0:
                c9950l.firebase();
                break;
            default:
                c9950l.subs();
                break;
        }
    }
}

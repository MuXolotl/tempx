package defpackage;

/* JADX INFO: renamed from: lٌۣۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9161l implements InterfaceC15871l {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C9161l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // defpackage.InterfaceC15871l
    public final void yandex() {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                ((C10780l) obj).firebase = true;
                break;
            case 1:
                ((C10780l) obj).firebase = true;
                break;
            case 2:
                ((C10780l) obj).firebase = true;
                break;
            default:
                AbstractC10437l abstractC10437l = (AbstractC10437l) obj;
                boolean z = abstractC10437l.ads.subs() == 1.0f;
                if (z != abstractC10437l.ad) {
                    abstractC10437l.ad = z;
                    abstractC10437l.metrica.invalidateSelf();
                }
                break;
        }
    }
}

package defpackage;

/* JADX INFO: renamed from: lٌٌۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8668l implements InterfaceC18216l {
    public final /* synthetic */ AbstractC2338l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C8668l(AbstractC2338l abstractC2338l, int i) {
        this.yandex = i;
        this.loadAd = abstractC2338l;
    }

    @Override // defpackage.InterfaceC18216l
    public final void yandex(C11260l c11260l) {
        int i = this.yandex;
        AbstractC2338l abstractC2338l = this.loadAd;
        switch (i) {
            case 0:
                C14972l c14972l = abstractC2338l.f5074l;
                C5533l c5533l = c11260l.amazon;
                c14972l.setCurrentProgress((float) c5533l.yandex);
                if (c5533l.yandex == 1.0d) {
                    c11260l.yandex();
                    abstractC2338l.smaato();
                    abstractC2338l.f5081l.getApplication().unregisterActivityLifecycleCallbacks(abstractC2338l.f5072l);
                }
                break;
            default:
                C14972l c14972l2 = abstractC2338l.f5074l;
                C5533l c5533l2 = c11260l.amazon;
                c14972l2.setCurrentProgress((float) c5533l2.yandex);
                if (c5533l2.yandex == 0.0d) {
                    c11260l.yandex();
                }
                break;
        }
    }
}

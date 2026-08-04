package defpackage;

/* JADX INFO: renamed from: lؓؖۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1635l implements InterfaceC13321l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11674l f3965l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3966l;

    public /* synthetic */ C1635l(C11674l c11674l, int i) {
        this.f3966l = i;
        this.f3965l = c11674l;
    }

    @Override // defpackage.InterfaceC13321l
    public final long yandex() {
        int i = this.f3966l;
        C11674l c11674l = this.f3965l;
        switch (i) {
            case 0:
                long jYandex = c11674l.f23398l.yandex();
                if (jYandex != 16) {
                    return jYandex;
                }
                C8974l c8974l = (C8974l) AbstractC13402l.loadAd(c11674l, AbstractC10493l.loadAd);
                if (c8974l != null) {
                    long j = c8974l.yandex;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((C9735l) AbstractC13402l.loadAd(c11674l, AbstractC12502l.yandex)).yandex;
            case 1:
                return ((C14370l) AbstractC13402l.loadAd(c11674l, AbstractC16964l.yandex)).yandex.mopub;
            default:
                return ((C14370l) AbstractC13402l.loadAd(c11674l, AbstractC16964l.yandex)).yandex.billing;
        }
    }
}

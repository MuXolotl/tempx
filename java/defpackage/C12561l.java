package defpackage;

/* JADX INFO: renamed from: lؙّّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12561l implements InterfaceC7316l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12217l f24749l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24750l;

    public /* synthetic */ C12561l(C12217l c12217l, int i) {
        this.f24750l = i;
        this.f24749l = c12217l;
    }

    @Override // defpackage.InterfaceC7316l
    public final long yandex() {
        int i = this.f24750l;
        C12217l c12217l = this.f24749l;
        switch (i) {
            case 0:
                return c12217l.isPro(true).loadAd;
            case 1:
                return c12217l.startapp(true, true).loadAd;
            default:
                return c12217l.startapp(false, true).loadAd;
        }
    }
}

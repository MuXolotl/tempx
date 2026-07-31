package defpackage;

/* JADX INFO: renamed from: lؙؖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3834l extends AbstractC1859l {
    public final int billing;
    public final int mopub;
    public final int purchase;

    public C3834l(C13549l c13549l) {
        super(c13549l);
        this.purchase = c13549l.purchase;
        this.billing = c13549l.billing;
        this.mopub = c13549l.mopub;
    }

    @Override // defpackage.AbstractC1859l
    public final byte[] yandex() {
        byte[] bArrYandex = super.yandex();
        AbstractC10000l.isPro(this.purchase, 16, bArrYandex);
        AbstractC10000l.isPro(this.billing, 20, bArrYandex);
        AbstractC10000l.isPro(this.mopub, 24, bArrYandex);
        return bArrYandex;
    }
}

package defpackage;

/* JADX INFO: renamed from: lؚْٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13427l extends AbstractC1859l {
    public final int billing;
    public final int purchase;

    public C13427l(C16724l c16724l) {
        super(c16724l);
        this.purchase = c16724l.purchase;
        this.billing = c16724l.billing;
    }

    @Override // defpackage.AbstractC1859l
    public final byte[] yandex() {
        byte[] bArrYandex = super.yandex();
        AbstractC10000l.isPro(0, 16, bArrYandex);
        AbstractC10000l.isPro(this.purchase, 20, bArrYandex);
        AbstractC10000l.isPro(this.billing, 24, bArrYandex);
        return bArrYandex;
    }
}

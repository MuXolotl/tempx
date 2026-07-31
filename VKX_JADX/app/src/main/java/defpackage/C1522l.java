package defpackage;

/* JADX INFO: renamed from: lؒۨۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1522l extends AbstractC10794l {
    public final AbstractC10794l crashlytics;
    public final /* synthetic */ int loadAd;

    public /* synthetic */ C1522l(AbstractC10794l abstractC10794l, int i) {
        this.loadAd = i;
        this.crashlytics = abstractC10794l;
    }

    @Override // defpackage.AbstractC10794l
    public final AbstractC4946l amazon(AbstractC18041l abstractC18041l) {
        int i = this.loadAd;
        AbstractC10794l abstractC10794l = this.crashlytics;
        switch (i) {
            case 0:
                AbstractC4946l abstractC4946lAmazon = abstractC10794l.amazon(abstractC18041l);
                if (abstractC4946lAmazon == null) {
                    return null;
                }
                InterfaceC15234l interfaceC15234lPro = abstractC18041l.mo1339native().pro();
                return AbstractC7310l.amazon(abstractC4946lAmazon, interfaceC15234lPro instanceof InterfaceC16902l ? (InterfaceC16902l) interfaceC15234lPro : null);
            default:
                return abstractC10794l.amazon(abstractC18041l);
        }
    }

    @Override // defpackage.AbstractC10794l
    public final AbstractC18041l billing(int i, AbstractC18041l abstractC18041l) {
        int i2 = this.loadAd;
        AbstractC10794l abstractC10794l = this.crashlytics;
        switch (i2) {
            case 0:
                break;
        }
        return abstractC10794l.billing(i, abstractC18041l);
    }

    @Override // defpackage.AbstractC10794l
    public final InterfaceC3841l crashlytics(InterfaceC3841l interfaceC3841l) {
        int i = this.loadAd;
        AbstractC10794l abstractC10794l = this.crashlytics;
        switch (i) {
            case 0:
                break;
        }
        return abstractC10794l.crashlytics(interfaceC3841l);
    }

    @Override // defpackage.AbstractC10794l
    public boolean loadAd() {
        switch (this.loadAd) {
            case 0:
                return true;
            default:
                return super.loadAd();
        }
    }

    @Override // defpackage.AbstractC10794l
    public final boolean purchase() {
        int i = this.loadAd;
        AbstractC10794l abstractC10794l = this.crashlytics;
        switch (i) {
            case 0:
                break;
        }
        return abstractC10794l.purchase();
    }

    @Override // defpackage.AbstractC10794l
    public boolean yandex() {
        switch (this.loadAd) {
            case 0:
                return this.crashlytics.yandex();
            default:
                return super.yandex();
        }
    }
}

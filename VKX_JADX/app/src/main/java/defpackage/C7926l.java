package defpackage;

/* JADX INFO: renamed from: lًُّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7926l extends AbstractC10794l {
    public final AbstractC10794l crashlytics;
    public final AbstractC10794l loadAd;

    public C7926l(AbstractC10794l abstractC10794l, AbstractC10794l abstractC10794l2) {
        this.loadAd = abstractC10794l;
        this.crashlytics = abstractC10794l2;
    }

    @Override // defpackage.AbstractC10794l
    public final AbstractC4946l amazon(AbstractC18041l abstractC18041l) {
        AbstractC4946l abstractC4946lAmazon = this.loadAd.amazon(abstractC18041l);
        return abstractC4946lAmazon == null ? this.crashlytics.amazon(abstractC18041l) : abstractC4946lAmazon;
    }

    @Override // defpackage.AbstractC10794l
    public final AbstractC18041l billing(int i, AbstractC18041l abstractC18041l) {
        return this.crashlytics.billing(i, this.loadAd.billing(i, abstractC18041l));
    }

    @Override // defpackage.AbstractC10794l
    public final InterfaceC3841l crashlytics(InterfaceC3841l interfaceC3841l) {
        return this.crashlytics.crashlytics(this.loadAd.crashlytics(interfaceC3841l));
    }

    @Override // defpackage.AbstractC10794l
    public final boolean loadAd() {
        return this.loadAd.loadAd() || this.crashlytics.loadAd();
    }

    @Override // defpackage.AbstractC10794l
    public final boolean yandex() {
        return this.loadAd.yandex() || this.crashlytics.yandex();
    }
}

package defpackage;

/* JADX INFO: renamed from: lؙ۠ۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6806l implements InterfaceC18419l {
    public final C13056l yandex = new C13056l();
    public C17721l loadAd = C17721l.loadAd;
    public final C0090l crashlytics = new C0090l(13);
    public Object amazon = C18646l.yandex;
    public C2993l purchase = AbstractC1295l.crashlytics();
    public final C17535l billing = AbstractC4071l.yandex(true);

    public final void crashlytics(C6806l c6806l) {
        this.loadAd = c6806l.loadAd;
        this.amazon = c6806l.amazon;
        C17535l c17535l = c6806l.billing;
        loadAd((C11310l) c17535l.billing(AbstractC1891l.yandex));
        C13056l c13056l = c6806l.yandex;
        C13056l c13056l2 = this.yandex;
        AbstractC10433l.smaato(c13056l2, c13056l);
        c13056l2.admob = c13056l2.admob;
        AbstractC7720l.yandex(this.crashlytics, c6806l.crashlytics);
        for (C11911l c11911l : c17535l.amazon()) {
            this.billing.mopub(c11911l, c17535l.crashlytics(c11911l));
        }
    }

    public final void loadAd(C11310l c11310l) {
        C17535l c17535l = this.billing;
        if (c11310l != null) {
            c17535l.mopub(AbstractC1891l.yandex, c11310l);
        } else {
            c17535l.purchase().remove(AbstractC1891l.yandex);
        }
    }

    @Override // defpackage.InterfaceC18419l
    public final C0090l yandex() {
        return this.crashlytics;
    }
}

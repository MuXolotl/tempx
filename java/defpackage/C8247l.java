package defpackage;

/* JADX INFO: renamed from: lًَۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8247l extends AbstractC3386l {
    public final C10086l crashlytics;
    public final C10086l loadAd;
    public final C12014l yandex;

    public C8247l(C12014l c12014l, C8030l c8030l, C8896l c8896l) {
        this.yandex = c12014l;
        this.loadAd = AbstractC8020l.smaato(c8030l);
        this.crashlytics = AbstractC8020l.smaato(c8896l);
    }

    @Override // defpackage.AbstractC3386l
    public final AbstractC3386l admob() {
        C12014l c12014l = this.yandex;
        AbstractC7470l.isPro(C1187l.subs(((C1187l) ((C10086l) c12014l.f23943l).getValue()).yandex, ((C1187l) ((C10086l) c12014l.f23944l).getValue()).yandex), ((C14174l) ((C10086l) c12014l.f23941l).getValue()).yandex);
        C0633l c0633l = ((C8030l) this.loadAd.getValue()).f16717l;
        C10086l c10086l = c0633l.f2094l;
        C0020l c0020l = (C0020l) ((C8832l) c10086l.getValue()).loadAd.getValue();
        InterfaceC18212l interfaceC18212l = c0633l.purchase().loadAd.f28638l;
        if (interfaceC18212l == null) {
            C8339l.metrica("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
            return null;
        }
        AbstractC14707l.mopub(interfaceC18212l.smaato());
        c0020l.getClass();
        return C10323l.yandex;
    }

    @Override // defpackage.AbstractC3386l
    public final boolean amazon() {
        return true;
    }

    @Override // defpackage.AbstractC3386l
    public final C8896l crashlytics() {
        return (C8896l) this.crashlytics.getValue();
    }

    @Override // defpackage.AbstractC3386l
    public final C12014l purchase() {
        return this.yandex;
    }

    @Override // defpackage.AbstractC3386l
    public final void subs(C8896l c8896l) {
        this.crashlytics.setValue(c8896l);
    }

    @Override // defpackage.AbstractC3386l
    public final AbstractC3386l yandex(C14509l c14509l, C8030l c8030l, long j, long j2, long j3) {
        C10086l c10086l = this.loadAd;
        AbstractC17549l.crashlytics(this.yandex, j, j2, j3, !AbstractC8576l.yandex((C8030l) c10086l.getValue(), c8030l));
        c10086l.setValue(c8030l);
        return this;
    }

    @Override // defpackage.AbstractC3386l
    public final AbstractC3386l mopub(C8030l c8030l) {
        return this;
    }
}

package defpackage;

/* JADX INFO: renamed from: lّۧٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13008l extends AbstractC7498l {
    public Object crashlytics;

    public C13008l(long j, Object obj) {
        super(j);
        this.crashlytics = obj;
    }

    @Override // defpackage.AbstractC7498l
    public final AbstractC7498l crashlytics(long j) {
        return new C13008l(AbstractC9620l.isPro().mopub(), this.crashlytics);
    }

    @Override // defpackage.AbstractC7498l
    public final AbstractC7498l loadAd() {
        return new C13008l(AbstractC9620l.isPro().mopub(), this.crashlytics);
    }

    @Override // defpackage.AbstractC7498l
    public final void yandex(AbstractC7498l abstractC7498l) {
        this.crashlytics = ((C13008l) abstractC7498l).crashlytics;
    }
}

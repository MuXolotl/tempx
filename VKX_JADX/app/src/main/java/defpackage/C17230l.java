package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lٗٚۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17230l extends AbstractC7498l {
    public int amazon;
    public C15084l crashlytics;

    public C17230l(long j, C15084l c15084l) {
        super(j);
        this.crashlytics = c15084l;
    }

    @Override // defpackage.AbstractC7498l
    public final AbstractC7498l crashlytics(long j) {
        return new C17230l(j, this.crashlytics);
    }

    @Override // defpackage.AbstractC7498l
    public final AbstractC7498l loadAd() {
        return new C17230l(AbstractC9620l.isPro().mopub(), this.crashlytics);
    }

    @Override // defpackage.AbstractC7498l
    public final void yandex(AbstractC7498l abstractC7498l) {
        synchronized (AbstractC7798l.yandex) {
            this.crashlytics = ((C17230l) abstractC7498l).crashlytics;
            this.amazon = ((C17230l) abstractC7498l).amazon;
            Unit unit = Unit.INSTANCE;
        }
    }
}

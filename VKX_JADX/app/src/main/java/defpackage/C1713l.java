package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lٌؓؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1713l extends AbstractC7498l {
    public int amazon;
    public AbstractC5030l crashlytics;
    public int purchase;

    public C1713l(long j, AbstractC5030l abstractC5030l) {
        super(j);
        this.crashlytics = abstractC5030l;
    }

    @Override // defpackage.AbstractC7498l
    public final AbstractC7498l crashlytics(long j) {
        return new C1713l(j, this.crashlytics);
    }

    @Override // defpackage.AbstractC7498l
    public final AbstractC7498l loadAd() {
        return crashlytics(AbstractC9620l.isPro().mopub());
    }

    @Override // defpackage.AbstractC7498l
    public final void yandex(AbstractC7498l abstractC7498l) {
        synchronized (AbstractC18263l.yandex) {
            this.crashlytics = ((C1713l) abstractC7498l).crashlytics;
            this.amazon = ((C1713l) abstractC7498l).amazon;
            this.purchase = ((C1713l) abstractC7498l).purchase;
            Unit unit = Unit.INSTANCE;
        }
    }
}

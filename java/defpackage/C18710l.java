package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lۦ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18710l extends AbstractC7498l {
    public int amazon;
    public InterfaceC16176l crashlytics;

    public C18710l(long j, InterfaceC16176l interfaceC16176l) {
        super(j);
        this.crashlytics = interfaceC16176l;
    }

    @Override // defpackage.AbstractC7498l
    public final AbstractC7498l crashlytics(long j) {
        return new C18710l(j, this.crashlytics);
    }

    @Override // defpackage.AbstractC7498l
    public final AbstractC7498l loadAd() {
        return new C18710l(AbstractC9620l.isPro().mopub(), this.crashlytics);
    }

    @Override // defpackage.AbstractC7498l
    public final void yandex(AbstractC7498l abstractC7498l) {
        C18710l c18710l = (C18710l) abstractC7498l;
        synchronized (AbstractC15344l.yandex) {
            this.crashlytics = c18710l.crashlytics;
            this.amazon = c18710l.amazon;
            Unit unit = Unit.INSTANCE;
        }
    }
}

package defpackage;

/* JADX INFO: renamed from: lِؕؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3329l {
    public final Throwable crashlytics;
    public final InterfaceC7476l loadAd;
    public final InterfaceC7476l yandex;

    public /* synthetic */ C3329l(InterfaceC7476l interfaceC7476l, C8665l c8665l, Throwable th, int i) {
        this(interfaceC7476l, (i & 2) != 0 ? null : c8665l, (i & 4) != 0 ? null : th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3329l)) {
            return false;
        }
        C3329l c3329l = (C3329l) obj;
        return AbstractC8576l.yandex(this.yandex, c3329l.yandex) && AbstractC8576l.yandex(this.loadAd, c3329l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c3329l.crashlytics);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        InterfaceC7476l interfaceC7476l = this.loadAd;
        int iHashCode2 = (iHashCode + (interfaceC7476l == null ? 0 : interfaceC7476l.hashCode())) * 31;
        Throwable th = this.crashlytics;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.yandex + ", nextPlan=" + this.loadAd + ", throwable=" + this.crashlytics + ')';
    }

    public C3329l(InterfaceC7476l interfaceC7476l, InterfaceC7476l interfaceC7476l2, Throwable th) {
        this.yandex = interfaceC7476l;
        this.loadAd = interfaceC7476l2;
        this.crashlytics = th;
    }
}

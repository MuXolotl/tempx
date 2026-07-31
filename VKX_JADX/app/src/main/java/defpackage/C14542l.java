package defpackage;

/* JADX INFO: renamed from: lٓۥٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14542l implements InterfaceC11509l {
    public final Throwable crashlytics;
    public final C7819l loadAd;
    public final InterfaceC1286l yandex;

    public C14542l(InterfaceC1286l interfaceC1286l, C7819l c7819l, Throwable th) {
        this.yandex = interfaceC1286l;
        this.loadAd = c7819l;
        this.crashlytics = th;
    }

    @Override // defpackage.InterfaceC11509l
    public final C7819l billing() {
        return this.loadAd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14542l)) {
            return false;
        }
        C14542l c14542l = (C14542l) obj;
        return AbstractC8576l.yandex(this.yandex, c14542l.yandex) && AbstractC8576l.yandex(this.loadAd, c14542l.loadAd) && this.crashlytics.equals(c14542l.crashlytics);
    }

    public final int hashCode() {
        InterfaceC1286l interfaceC1286l = this.yandex;
        int iHashCode = interfaceC1286l == null ? 0 : interfaceC1286l.hashCode();
        return this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // defpackage.InterfaceC11509l
    public final InterfaceC1286l startapp() {
        return this.yandex;
    }

    public final String toString() {
        return "ErrorResult(image=" + this.yandex + ", request=" + this.loadAd + ", throwable=" + this.crashlytics + ")";
    }
}

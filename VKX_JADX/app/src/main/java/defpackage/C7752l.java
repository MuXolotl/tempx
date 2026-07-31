package defpackage;

/* JADX INFO: renamed from: lًؔؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7752l {
    public final C8509l crashlytics;
    public final C9598l loadAd;
    public final InterfaceC11450l yandex;

    public C7752l(InterfaceC11450l interfaceC11450l, C9598l c9598l, C8509l c8509l) {
        this.yandex = interfaceC11450l;
        this.loadAd = c9598l;
        this.crashlytics = c8509l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7752l) {
            C7752l c7752l = (C7752l) obj;
            return AbstractC8576l.yandex(this.yandex, c7752l.yandex) && this.loadAd == c7752l.loadAd && this.crashlytics == c7752l.crashlytics;
        }
        return false;
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ConfiguredCameraCaptureSession(session=" + this.yandex + ", processor=" + this.loadAd + ", captureSequenceProcessor=" + this.crashlytics + ')';
    }
}

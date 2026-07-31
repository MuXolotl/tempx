package defpackage;

/* JADX INFO: renamed from: lٖؒٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16134l implements InterfaceC6407l {
    public final C4199l crashlytics;
    public final int loadAd = 1;

    public C16134l(C4199l c4199l) {
        this.crashlytics = c4199l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C16134l.class == obj.getClass()) {
            C16134l c16134l = (C16134l) obj;
            return this.loadAd == c16134l.loadAd && this.crashlytics == c16134l.crashlytics;
        }
        return false;
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + (AbstractC5020l.inmobi(this.loadAd) * 31);
    }

    @Override // defpackage.InterfaceC6407l
    public final int loadAd() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC6407l
    public final AbstractC9544l yandex(float f, C4565l c4565l) {
        return (AbstractC9544l) this.crashlytics.invoke(Float.valueOf(f));
    }
}

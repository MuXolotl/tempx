package defpackage;

/* JADX INFO: renamed from: lًّٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8160l {
    public final InterfaceC5706l amazon;
    public final AbstractC12974l crashlytics;
    public final C6582l loadAd;
    public final InterfaceC3588l yandex;

    public C8160l(InterfaceC3588l interfaceC3588l, C6582l c6582l, AbstractC12974l abstractC12974l, InterfaceC5706l interfaceC5706l) {
        this.yandex = interfaceC3588l;
        this.loadAd = c6582l;
        this.crashlytics = abstractC12974l;
        this.amazon = interfaceC5706l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8160l)) {
            return false;
        }
        C8160l c8160l = (C8160l) obj;
        return AbstractC8576l.yandex(this.yandex, c8160l.yandex) && AbstractC8576l.yandex(this.loadAd, c8160l.loadAd) && this.crashlytics.equals(c8160l.crashlytics) && AbstractC8576l.yandex(this.amazon, c8160l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.yandex + ", classProto=" + this.loadAd + ", metadataVersion=" + this.crashlytics + ", sourceElement=" + this.amazon + ')';
    }
}

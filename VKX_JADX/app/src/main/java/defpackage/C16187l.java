package defpackage;

/* JADX INFO: renamed from: lَٖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16187l {
    public final boolean amazon;
    public final InterfaceC13238l crashlytics;
    public final InterfaceC13238l loadAd;
    public final InterfaceC13238l yandex;

    /* JADX WARN: Multi-variable type inference failed */
    public C16187l(InterfaceC13238l interfaceC13238l, InterfaceC13238l interfaceC13238l2, InterfaceC13238l interfaceC13238l3) {
        this.yandex = interfaceC13238l;
        this.loadAd = interfaceC13238l2;
        this.crashlytics = interfaceC13238l3;
        this.amazon = ((AbstractC7095l) interfaceC13238l).isEmpty() && ((AbstractC7095l) interfaceC13238l2).isEmpty() && ((AbstractC7095l) interfaceC13238l3).isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16187l)) {
            return false;
        }
        C16187l c16187l = (C16187l) obj;
        return AbstractC8576l.yandex(this.yandex, c16187l.yandex) && AbstractC8576l.yandex(this.loadAd, c16187l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c16187l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SearchResults(tracksByTitle=" + this.yandex + ", tracksByArtist=" + this.loadAd + ", playlists=" + this.crashlytics + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C16187l() {
        C11507l c11507l = C11507l.f23131l;
        this(c11507l, c11507l, c11507l);
    }
}

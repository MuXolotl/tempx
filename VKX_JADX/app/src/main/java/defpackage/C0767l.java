package defpackage;

/* JADX INFO: renamed from: lؒؑؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C0767l {
    public static final C7040l Companion = new C7040l();
    public static final InterfaceC1220l[] crashlytics = {AbstractC9968l.crashlytics(2, new C3342l(19)), null};
    public final C11168l loadAd;
    public final InterfaceC3136l yandex;

    public /* synthetic */ C0767l(int i, InterfaceC3136l interfaceC3136l, C11168l c11168l) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C9364l.yandex.purchase());
            throw null;
        }
        this.yandex = interfaceC3136l;
        this.loadAd = c11168l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0767l)) {
            return false;
        }
        C0767l c0767l = (C0767l) obj;
        return AbstractC8576l.yandex(this.yandex, c0767l.yandex) && AbstractC8576l.yandex(this.loadAd, c0767l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "VkxSavedState(source=" + this.yandex + ", lastTrack=" + this.loadAd + ')';
    }

    public C0767l(InterfaceC3136l interfaceC3136l, C11168l c11168l) {
        this.yandex = interfaceC3136l;
        this.loadAd = c11168l;
    }
}

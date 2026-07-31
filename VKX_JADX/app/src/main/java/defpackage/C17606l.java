package defpackage;

import java.util.List;

/* JADX INFO: renamed from: l٘ؑؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17606l implements InterfaceC18035l {
    public final C15358l loadAd;
    public final String yandex;

    public C17606l(String str, C15358l c15358l) {
        this.yandex = str;
        this.loadAd = c15358l;
    }

    @Override // defpackage.InterfaceC18035l
    public final String admob(int i) {
        loadAd();
        throw null;
    }

    @Override // defpackage.InterfaceC18035l
    public final int amazon(String str) {
        loadAd();
        throw null;
    }

    @Override // defpackage.InterfaceC18035l
    public final AbstractC2021l billing() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC18035l
    public final /* bridge */ boolean crashlytics() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17606l)) {
            return false;
        }
        C17606l c17606l = (C17606l) obj;
        return this.yandex.equals(c17606l.yandex) && AbstractC8576l.yandex(this.loadAd, c17606l.loadAd);
    }

    @Override // defpackage.InterfaceC18035l
    public final boolean firebase(int i) {
        loadAd();
        throw null;
    }

    @Override // defpackage.InterfaceC18035l
    public final /* bridge */ List getAnnotations() {
        return C2580l.f5619l;
    }

    public final int hashCode() {
        return (this.loadAd.hashCode() * 31) + this.yandex.hashCode();
    }

    @Override // defpackage.InterfaceC18035l
    public final InterfaceC18035l isPro(int i) {
        loadAd();
        throw null;
    }

    public final void loadAd() {
        throw new IllegalStateException(AbstractC0653l.ads(new StringBuilder("Primitive descriptor "), this.yandex, " does not have elements"));
    }

    @Override // defpackage.InterfaceC18035l
    public final int mopub() {
        return 0;
    }

    @Override // defpackage.InterfaceC18035l
    public final /* bridge */ boolean purchase() {
        return false;
    }

    @Override // defpackage.InterfaceC18035l
    public final List subs(int i) {
        loadAd();
        throw null;
    }

    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("PrimitiveDescriptor("), this.yandex, ')');
    }

    @Override // defpackage.InterfaceC18035l
    public final String yandex() {
        return this.yandex;
    }
}

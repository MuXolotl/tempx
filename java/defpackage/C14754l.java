package defpackage;

/* JADX INFO: renamed from: lًؘٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14754l extends AbstractC12494l {
    public final C15263l crashlytics;
    public final C11244l loadAd;
    public final String yandex;

    public C14754l(String str, C11244l c11244l, C15263l c15263l) {
        this.yandex = str;
        this.loadAd = c11244l;
        this.crashlytics = c15263l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14754l)) {
            return false;
        }
        C14754l c14754l = (C14754l) obj;
        return AbstractC8576l.yandex(this.yandex, c14754l.yandex) && AbstractC8576l.yandex(this.loadAd, c14754l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c14754l.crashlytics);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        C11244l c11244l = this.loadAd;
        int iHashCode2 = (iHashCode + (c11244l != null ? c11244l.hashCode() : 0)) * 31;
        C15263l c15263l = this.crashlytics;
        return iHashCode2 + (c15263l != null ? c15263l.hashCode() : 0);
    }

    @Override // defpackage.AbstractC12494l
    public final C11244l loadAd() {
        return this.loadAd;
    }

    public final String toString() {
        return AbstractC15560l.Signature("LinkAnnotation.Url(url=", this.yandex, ")");
    }

    @Override // defpackage.AbstractC12494l
    public final C15263l yandex() {
        return this.crashlytics;
    }
}

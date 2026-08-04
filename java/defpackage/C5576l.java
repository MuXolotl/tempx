package defpackage;

/* JADX INFO: renamed from: lٍؘۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C5576l {
    public static final C3846l Companion = new C3846l();
    public final C0415l amazon;
    public final C0415l crashlytics;
    public final C0415l loadAd;
    public final C0415l yandex;

    public /* synthetic */ C5576l(int i, C0415l c0415l, C0415l c0415l2, C0415l c0415l3, C0415l c0415l4) {
        if (15 != (i & 15)) {
            AbstractC11036l.isPro(i, 15, C12850l.yandex.purchase());
            throw null;
        }
        this.yandex = c0415l;
        this.loadAd = c0415l2;
        this.crashlytics = c0415l3;
        this.amazon = c0415l4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5576l)) {
            return false;
        }
        C5576l c5576l = (C5576l) obj;
        return AbstractC8576l.yandex(this.yandex, c5576l.yandex) && AbstractC8576l.yandex(this.loadAd, c5576l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c5576l.crashlytics) && AbstractC8576l.yandex(this.amazon, c5576l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Y25Background(desktop=" + this.yandex + ", mobile=" + this.loadAd + ", story=" + this.crashlytics + ", post=" + this.amazon + ')';
    }

    public C5576l(C0415l c0415l, C0415l c0415l2, C0415l c0415l3, C0415l c0415l4) {
        this.yandex = c0415l;
        this.loadAd = c0415l2;
        this.crashlytics = c0415l3;
        this.amazon = c0415l4;
    }
}

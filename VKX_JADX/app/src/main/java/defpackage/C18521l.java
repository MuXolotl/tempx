package defpackage;

/* JADX INFO: renamed from: lۗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18521l extends AbstractC15342l {
    public final C3903l amazon;
    public final C9902l purchase;

    public C18521l(C3903l c3903l) {
        C9902l c9902lYandex;
        this.amazon = c3903l;
        if (AbstractC8238l.purchase(c3903l)) {
            c9902lYandex = null;
        } else {
            c9902lYandex = AbstractC3478l.yandex();
            AbstractC15560l.firebase(c9902lYandex, c3903l);
        }
        this.purchase = c9902lYandex;
    }

    @Override // defpackage.AbstractC15342l
    public final C8896l crashlytics() {
        C3903l c3903l = this.amazon;
        return new C8896l(c3903l.yandex, c3903l.loadAd, c3903l.crashlytics, c3903l.amazon);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18521l) {
            return this.amazon.equals(((C18521l) obj).amazon);
        }
        return false;
    }

    public final int hashCode() {
        return this.amazon.hashCode();
    }
}

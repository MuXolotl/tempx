package defpackage;

/* JADX INFO: renamed from: lٜؔؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C2755l {
    public static final C3697l Companion = new C3697l();
    public final C7695l loadAd;
    public final String yandex;

    public /* synthetic */ C2755l(int i, String str, C7695l c7695l) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C4828l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = c7695l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2755l)) {
            return false;
        }
        C2755l c2755l = (C2755l) obj;
        return AbstractC8576l.yandex(this.yandex, c2755l.yandex) && AbstractC8576l.yandex(this.loadAd, c2755l.loadAd);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        C7695l c7695l = this.loadAd;
        return iHashCode + (c7695l == null ? 0 : c7695l.hashCode());
    }

    public final String toString() {
        return "SavedChildState(key=" + this.yandex + ", savedState=" + this.loadAd + ')';
    }

    public C2755l(String str, C7695l c7695l) {
        this.yandex = str;
        this.loadAd = c7695l;
    }
}

package defpackage;

/* JADX INFO: renamed from: lٗۨٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C17575l {
    public static final C4238l Companion = new C4238l();
    public final String loadAd;
    public final String yandex;

    public /* synthetic */ C17575l(String str, int i, String str2) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C6492l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17575l)) {
            return false;
        }
        C17575l c17575l = (C17575l) obj;
        return AbstractC8576l.yandex(this.yandex, c17575l.yandex) && AbstractC8576l.yandex(this.loadAd, c17575l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Y25ContentVideoType(type=");
        sb.append(this.yandex);
        sb.append(", url=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }
}

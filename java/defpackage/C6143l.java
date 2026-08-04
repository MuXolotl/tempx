package defpackage;

/* JADX INFO: renamed from: lؘِۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C6143l implements InterfaceC0582l {
    public static final C12385l Companion = new C12385l();
    public final String loadAd;
    public final String yandex;

    public /* synthetic */ C6143l(String str, int i, String str2) {
        if (1 != (i & 1)) {
            AbstractC11036l.isPro(i, 1, C1067l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6143l)) {
            return false;
        }
        C6143l c6143l = (C6143l) obj;
        return AbstractC8576l.yandex(this.yandex, c6143l.yandex) && AbstractC8576l.yandex(this.loadAd, c6143l.loadAd);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        String str = this.loadAd;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Plain(text=");
        sb.append(this.yandex);
        sb.append(", credits=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }

    public C6143l(String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
    }
}

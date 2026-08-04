package defpackage;

/* JADX INFO: renamed from: lٕٟٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15851l {
    public final C2397l loadAd;
    public final C1309l yandex;

    public C15851l(C1309l c1309l, C2397l c2397l) {
        this.yandex = c1309l;
        this.loadAd = c2397l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15851l.class == obj.getClass()) {
            C15851l c15851l = (C15851l) obj;
            return AbstractC8576l.yandex(this.yandex, c15851l.yandex) && this.loadAd == c15851l.loadAd;
        }
        return false;
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final void yandex() {
        C2397l c2397l = this.loadAd;
        if (c2397l.isVip()) {
            c2397l.subs(EnumC3455l.f7339l);
        }
    }
}

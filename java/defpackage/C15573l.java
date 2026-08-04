package defpackage;

/* JADX INFO: renamed from: lٌٕۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15573l {
    public EnumC9176l loadAd;
    public String yandex;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15573l)) {
            return false;
        }
        C15573l c15573l = (C15573l) obj;
        return AbstractC8576l.yandex(this.yandex, c15573l.yandex) && this.loadAd == c15573l.loadAd;
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.yandex + ", state=" + this.loadAd + ')';
    }
}

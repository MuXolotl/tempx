package defpackage;

/* JADX INFO: renamed from: lؙؙۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6678l {
    public final int loadAd;
    public final InterfaceC13238l yandex;

    public C6678l(InterfaceC13238l interfaceC13238l, int i) {
        this.yandex = interfaceC13238l;
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6678l)) {
            return false;
        }
        C6678l c6678l = (C6678l) obj;
        return AbstractC8576l.yandex(this.yandex, c6678l.yandex) && this.loadAd == c6678l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + this.loadAd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NowPlayingQueueState(queue=");
        sb.append(this.yandex);
        sb.append(", index=");
        return AbstractC0653l.adcel(sb, this.loadAd, ')');
    }
}

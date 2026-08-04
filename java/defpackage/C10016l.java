package defpackage;

/* JADX INFO: renamed from: lَؑٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10016l {
    public final C4812l loadAd;
    public final EnumC10062l yandex;

    public C10016l(EnumC10062l enumC10062l, C4812l c4812l) {
        this.yandex = enumC10062l;
        this.loadAd = c4812l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10016l)) {
            return false;
        }
        C10016l c10016l = (C10016l) obj;
        return this.yandex == c10016l.yandex && AbstractC8576l.yandex(this.loadAd, c10016l.loadAd);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        C4812l c4812l = this.loadAd;
        return iHashCode + (c4812l == null ? 0 : c4812l.hashCode());
    }

    public final String toString() {
        return "CombinedCameraState(state=" + this.yandex + ", error=" + this.loadAd + ')';
    }
}

package defpackage;

/* JADX INFO: renamed from: lؙِؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11592l implements InterfaceC18217l {
    public final boolean loadAd;
    public final EnumC4948l yandex;

    public C11592l(EnumC4948l enumC4948l, boolean z) {
        this.yandex = enumC4948l;
        this.loadAd = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11592l)) {
            return false;
        }
        C11592l c11592l = (C11592l) obj;
        return this.yandex == c11592l.yandex && this.loadAd == c11592l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + (this.loadAd ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnPreferencesChanged(engine=");
        sb.append(this.yandex);
        sb.append(", enabled=");
        return AbstractC0653l.tapsense(sb, this.loadAd, ')');
    }
}

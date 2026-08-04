package defpackage;

/* JADX INFO: renamed from: lِۙۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12088l extends AbstractC9941l {
    public final EnumC1996l loadAd;
    public final EnumC5625l yandex;

    public C12088l(EnumC5625l enumC5625l, EnumC1996l enumC1996l) {
        this.yandex = enumC5625l;
        this.loadAd = enumC1996l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9941l) {
            AbstractC9941l abstractC9941l = (AbstractC9941l) obj;
            EnumC5625l enumC5625l = this.yandex;
            if (enumC5625l != null ? enumC5625l.equals(((C12088l) abstractC9941l).yandex) : ((C12088l) abstractC9941l).yandex == null) {
                EnumC1996l enumC1996l = this.loadAd;
                if (enumC1996l != null ? enumC1996l.equals(((C12088l) abstractC9941l).loadAd) : ((C12088l) abstractC9941l).loadAd == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        EnumC5625l enumC5625l = this.yandex;
        int iHashCode = ((enumC5625l == null ? 0 : enumC5625l.hashCode()) ^ 1000003) * 1000003;
        EnumC1996l enumC1996l = this.loadAd;
        return iHashCode ^ (enumC1996l != null ? enumC1996l.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.yandex + ", mobileSubtype=" + this.loadAd + "}";
    }
}

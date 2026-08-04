package defpackage;

/* JADX INFO: renamed from: lؘٙۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5779l {
    public final String crashlytics;
    public final int loadAd;
    public final EnumC11781l yandex;

    public C5779l(EnumC11781l enumC11781l, int i, String str) {
        this.yandex = enumC11781l;
        this.loadAd = i;
        this.crashlytics = str;
    }

    public static C5779l yandex(C5779l c5779l, EnumC11781l enumC11781l, String str) {
        int i = c5779l.loadAd;
        c5779l.getClass();
        return new C5779l(enumC11781l, i, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5779l)) {
            return false;
        }
        C5779l c5779l = (C5779l) obj;
        return this.yandex == c5779l.yandex && this.loadAd == c5779l.loadAd && AbstractC8576l.yandex(this.crashlytics, c5779l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + (((this.yandex.hashCode() * 31) + this.loadAd) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EcosystemState(method=");
        sb.append(this.yandex);
        sb.append(", codeLength=");
        sb.append(this.loadAd);
        sb.append(", info=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}

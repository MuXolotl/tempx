package defpackage;

/* JADX INFO: renamed from: lِۡٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12186l {
    public final int crashlytics;
    public final int loadAd;
    public final C12638l yandex;

    public C12186l(C12638l c12638l, int i, int i2) {
        AbstractC11064l.loadAd(c12638l, "Null dependency anInterface.");
        this.yandex = c12638l;
        this.loadAd = i;
        this.crashlytics = i2;
    }

    public static C12186l loadAd(Class cls) {
        return new C12186l(1, 0, cls);
    }

    public static C12186l yandex(C12638l c12638l) {
        return new C12186l(c12638l, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12186l)) {
            return false;
        }
        C12186l c12186l = (C12186l) obj;
        return this.yandex.equals(c12186l.yandex) && this.loadAd == c12186l.loadAd && this.crashlytics == c12186l.crashlytics;
    }

    public final int hashCode() {
        return this.crashlytics ^ ((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd) * 1000003);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.yandex);
        sb.append(", type=");
        int i = this.loadAd;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.crashlytics;
        if (i2 == 0) {
            str2 = "direct";
        } else if (i2 == 1) {
            str2 = "provider";
        } else {
            if (i2 != 2) {
                C8339l.subs(AbstractC0653l.vip(i2, "Unsupported injection: "));
                return null;
            }
            str2 = "deferred";
        }
        return AbstractC0653l.ads(sb, str2, "}");
    }

    public C12186l(int i, int i2, Class cls) {
        this(C12638l.yandex(cls), i, i2);
    }
}

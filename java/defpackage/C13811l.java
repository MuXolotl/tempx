package defpackage;

/* JADX INFO: renamed from: lْۧؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13811l {
    public static final C13811l crashlytics = new C13811l(C18680l.firebase, 0);
    public final int loadAd;
    public final C18680l yandex;

    public C13811l(C18680l c18680l, int i) {
        if (c18680l == null) {
            C6541l.subs("Null fallbackQuality");
            throw null;
        }
        this.yandex = c18680l;
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13811l)) {
            return false;
        }
        C13811l c13811l = (C13811l) obj;
        return this.yandex.equals(c13811l.yandex) && this.loadAd == c13811l.loadAd;
    }

    public final int hashCode() {
        return this.loadAd ^ ((this.yandex.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb.append(this.yandex);
        sb.append(", fallbackRule=");
        return AbstractC14814l.remoteconfig(this.loadAd, "}", sb);
    }
}

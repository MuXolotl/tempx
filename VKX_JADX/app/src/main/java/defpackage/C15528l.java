package defpackage;

/* JADX INFO: renamed from: lؙٕۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15528l {
    public final C4304l loadAd;
    public final C4304l yandex;

    public C15528l(C4304l c4304l, C4304l c4304l2) {
        this.yandex = c4304l;
        this.loadAd = c4304l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15528l.class == obj.getClass()) {
            C15528l c15528l = (C15528l) obj;
            if (this.yandex.equals(c15528l.yandex) && this.loadAd.equals(c15528l.loadAd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        C4304l c4304l = this.yandex;
        sb.append(c4304l);
        C4304l c4304l2 = this.loadAd;
        if (c4304l.equals(c4304l2)) {
            str = "";
        } else {
            str = ", " + c4304l2;
        }
        return AbstractC0653l.ads(sb, str, "]");
    }
}

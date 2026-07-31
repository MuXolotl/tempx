package defpackage;

/* JADX INFO: renamed from: lؚۣؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7017l {
    public final String yandex;

    public C7017l(String str) {
        if (str != null) {
            this.yandex = str;
        } else {
            C6541l.subs("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7017l)) {
            return false;
        }
        return this.yandex.equals(((C7017l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC0653l.ads(new StringBuilder("Encoding{name=\""), this.yandex, "\"}");
    }
}

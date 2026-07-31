package defpackage;

/* JADX INFO: renamed from: lٕؑؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0021l {
    public static final C0021l loadAd = new C0021l();
    public final C5507l yandex;

    public C0021l() {
        this.yandex = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0021l) {
            return AbstractC8576l.yandex(this.yandex, ((C0021l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        C5507l c5507l = this.yandex;
        if (c5507l != null) {
            return c5507l.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.yandex + ")";
    }

    public C0021l(C5507l c5507l) {
        this.yandex = c5507l;
    }
}

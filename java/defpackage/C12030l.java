package defpackage;

/* JADX INFO: renamed from: lِۖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12030l {
    public final C3214l yandex;

    public C12030l(C3214l c3214l) {
        this.yandex = c3214l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C12030l) && this.yandex.equals(((C12030l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.yandex + "}";
    }
}

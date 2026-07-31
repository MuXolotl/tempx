package defpackage;

/* JADX INFO: renamed from: lؒۡؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1393l {
    public final C6956l yandex;

    public /* synthetic */ C1393l(C6956l c6956l) {
        this.yandex = c6956l;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1393l) {
            return AbstractC8576l.yandex(this.yandex, ((C1393l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.yandex + ")";
    }
}

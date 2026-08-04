package defpackage;

/* JADX INFO: renamed from: lؘٟٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16935l implements InterfaceC6442l {
    public final C3086l yandex;

    public C16935l(C3086l c3086l) {
        this.yandex = c3086l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16935l) && this.yandex.equals(((C16935l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "StartPlayback(source=" + this.yandex + ')';
    }
}

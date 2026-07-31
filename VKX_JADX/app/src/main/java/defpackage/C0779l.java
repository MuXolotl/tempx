package defpackage;

/* JADX INFO: renamed from: lؒؑۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0779l implements InterfaceC13514l {
    public final C6288l yandex;

    public C0779l(C6288l c6288l) {
        this.yandex = c6288l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0779l) && AbstractC8576l.yandex(this.yandex, ((C0779l) obj).yandex);
    }

    public final int hashCode() {
        C6288l c6288l = this.yandex;
        if (c6288l == null) {
            return 0;
        }
        return c6288l.yandex;
    }

    public final String toString() {
        return "Error(lastCameraError=" + this.yandex + ')';
    }
}

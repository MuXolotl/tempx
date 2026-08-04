package defpackage;

/* JADX INFO: renamed from: lٕٓؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15661l implements InterfaceC17314l {
    public final C3346l loadAd;
    public final String yandex;

    public C15661l(C3346l c3346l, String str) {
        this.yandex = str;
        this.loadAd = c3346l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (C15661l.class.equals(obj != null ? obj.getClass() : null)) {
            return this.yandex.equals(((C15661l) obj).yandex);
        }
        return false;
    }

    @Override // defpackage.InterfaceC17314l
    public final String getId() {
        return this.yandex;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }
}

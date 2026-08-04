package defpackage;

/* JADX INFO: renamed from: lٕٟٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17150l implements InterfaceC11325l {
    public final int loadAd;

    public C17150l(int i) {
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return C17150l.class.equals(obj != null ? obj.getClass() : null) && this.loadAd == ((C17150l) obj).loadAd;
    }

    public final int hashCode() {
        return this.loadAd;
    }

    public final String toString() {
        return AbstractC15560l.tapsense("AndroidPointerIcon(type=", this.loadAd, ")");
    }
}

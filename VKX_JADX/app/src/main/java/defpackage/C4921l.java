package defpackage;

/* JADX INFO: renamed from: lٖؗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4921l implements InterfaceC13643l {
    public final C3757l yandex;

    public C4921l(C3757l c3757l) {
        this.yandex = c3757l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4921l) && AbstractC8576l.yandex(this.yandex, ((C4921l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.yandex.hashCode();
    }

    public final String toString() {
        return "Success(dto=" + this.yandex + ')';
    }
}

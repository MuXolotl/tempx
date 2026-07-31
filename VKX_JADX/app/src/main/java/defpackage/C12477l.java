package defpackage;

/* JADX INFO: renamed from: lٌّٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12477l implements InterfaceC4141l {
    public final AbstractC14165l yandex;

    public C12477l(AbstractC14165l abstractC14165l) {
        this.yandex = abstractC14165l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12477l) && AbstractC8576l.yandex(this.yandex, ((C12477l) obj).yandex);
    }

    public final int hashCode() {
        AbstractC14165l abstractC14165l = this.yandex;
        if (abstractC14165l == null) {
            return 0;
        }
        return abstractC14165l.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.yandex + ")";
    }

    @Override // defpackage.InterfaceC4141l
    public final AbstractC14165l yandex() {
        return this.yandex;
    }
}

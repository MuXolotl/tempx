package defpackage;

/* JADX INFO: renamed from: lِؔۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11607l {
    public final InterfaceC6347l loadAd;
    public final InterfaceC6347l yandex;

    public C11607l(InterfaceC6347l interfaceC6347l, InterfaceC6347l interfaceC6347l2) {
        this.yandex = interfaceC6347l;
        this.loadAd = interfaceC6347l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C11607l)) {
            return false;
        }
        C11607l c11607l = (C11607l) obj;
        return AbstractC8576l.yandex(this.yandex, c11607l.yandex) && AbstractC8576l.yandex(this.loadAd, c11607l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }
}

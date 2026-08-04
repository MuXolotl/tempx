package defpackage;

/* JADX INFO: renamed from: lؚۤ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7629l {
    public final InterfaceC14328l loadAd;
    public final String yandex;

    public C7629l(String str, InterfaceC14328l interfaceC14328l) {
        this.yandex = str;
        this.loadAd = interfaceC14328l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7629l)) {
            return false;
        }
        C7629l c7629l = (C7629l) obj;
        return AbstractC8576l.yandex(this.yandex, c7629l.yandex) && AbstractC8576l.yandex(this.loadAd, c7629l.loadAd);
    }

    public final int hashCode() {
        String str = this.yandex;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC14328l interfaceC14328l = this.loadAd;
        return iHashCode + (interfaceC14328l != null ? interfaceC14328l.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.yandex + ", action=" + this.loadAd + ")";
    }
}

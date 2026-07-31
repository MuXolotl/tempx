package defpackage;

/* JADX INFO: renamed from: lُِؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C1948l.class)
public final class C4058l extends AbstractC3160l {
    public static final C5401l Companion = new C5401l();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C17918l f8352l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f8353l;

    public C4058l(String str, C17918l c17918l) {
        this.f8353l = str;
        this.f8352l = c17918l;
    }

    @Override // defpackage.AbstractC3160l
    public final int amazon() {
        return 13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        if (!AbstractC8576l.yandex(c2336l.loadAd(C4058l.class), c2336l.loadAd(obj.getClass()))) {
            return false;
        }
        C4058l c4058l = (C4058l) obj;
        return AbstractC8576l.yandex(this.f8353l, c4058l.f8353l) && AbstractC8576l.yandex(this.f8352l, c4058l.f8352l);
    }

    public final int hashCode() {
        return this.f8352l.hashCode() + (this.f8353l.hashCode() * 31);
    }

    public final String toString() {
        return "BsonDBPointer(namespace='" + this.f8353l + "', id=" + this.f8352l + ')';
    }
}

package defpackage;

/* JADX INFO: renamed from: lؙّۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C8370l.class)
public final class C12439l extends AbstractC3160l {
    public static final C18354l Companion = new C18354l();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C14705l f24551l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f24552l;

    public C12439l(String str, C14705l c14705l) {
        this.f24552l = str;
        this.f24551l = c14705l;
    }

    @Override // defpackage.AbstractC3160l
    public final int amazon() {
        return 16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        if (!AbstractC8576l.yandex(c2336l.loadAd(C12439l.class), c2336l.loadAd(obj.getClass()))) {
            return false;
        }
        C12439l c12439l = (C12439l) obj;
        return AbstractC8576l.yandex(this.f24552l, c12439l.f24552l) && AbstractC8576l.yandex(this.f24551l, c12439l.f24551l);
    }

    public final int hashCode() {
        return this.f24551l.f28763l.hashCode() + (this.f24552l.hashCode() * 31);
    }

    public final String toString() {
        return "BsonJavaScriptWithScope(code='" + this.f24552l + "', scope=" + this.f24551l + ')';
    }
}

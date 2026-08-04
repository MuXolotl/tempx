package defpackage;

/* JADX INFO: renamed from: lٗؕؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C11460l.class)
public final class C16882l extends AbstractC3160l {
    public static final C12458l Companion = new C12458l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f32933l;

    public C16882l(String str) {
        this.f32933l = str;
    }

    @Override // defpackage.AbstractC3160l
    public final int amazon() {
        return 14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        return AbstractC8576l.yandex(c2336l.loadAd(C16882l.class), c2336l.loadAd(obj.getClass())) && AbstractC8576l.yandex(this.f32933l, ((C16882l) obj).f32933l);
    }

    public final int hashCode() {
        return this.f32933l.hashCode();
    }

    public final String toString() {
        return AbstractC0653l.ads(new StringBuilder("BsonJavaScript(code='"), this.f32933l, "')");
    }
}

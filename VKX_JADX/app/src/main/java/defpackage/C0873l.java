package defpackage;

/* JADX INFO: renamed from: lؘؒٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C18607l.class)
public final class C0873l extends AbstractC3160l {
    public static final C5196l Companion = new C5196l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f2528l;

    public C0873l(String str) {
        this.f2528l = str;
    }

    @Override // defpackage.AbstractC3160l
    public final int amazon() {
        return 15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        return AbstractC8576l.yandex(c2336l.loadAd(C0873l.class), c2336l.loadAd(obj.getClass())) && AbstractC8576l.yandex(this.f2528l, ((C0873l) obj).f2528l);
    }

    public final int hashCode() {
        return this.f2528l.hashCode();
    }

    public final String toString() {
        return AbstractC0653l.ads(new StringBuilder("BsonSymbol(value='"), this.f2528l, "')");
    }
}

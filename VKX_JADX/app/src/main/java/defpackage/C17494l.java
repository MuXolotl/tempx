package defpackage;

/* JADX INFO: renamed from: lٗۢۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17494l {
    public final InterfaceC12001l loadAd;
    public final InterfaceC12001l yandex;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C17494l(InterfaceC12001l interfaceC12001l, int i) {
        int i2 = i & 2;
        C9885l c9885l = C9885l.yandex;
        this(c9885l, i2 != 0 ? c9885l : interfaceC12001l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17494l)) {
            return false;
        }
        C17494l c17494l = (C17494l) obj;
        return AbstractC8576l.yandex(this.yandex, c17494l.yandex) && AbstractC8576l.yandex(this.loadAd, c17494l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "ExtractedSizeAndCornerModifiers(sizeAndCornerModifiers=" + this.yandex + ", nonSizeOrCornerModifiers=" + this.loadAd + ')';
    }

    public C17494l(InterfaceC12001l interfaceC12001l, InterfaceC12001l interfaceC12001l2) {
        this.yandex = interfaceC12001l;
        this.loadAd = interfaceC12001l2;
    }
}

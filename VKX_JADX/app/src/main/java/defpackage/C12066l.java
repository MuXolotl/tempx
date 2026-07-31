package defpackage;

/* JADX INFO: renamed from: lٌِۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12066l implements InterfaceC3442l {
    public final int loadAd;
    public final int yandex;

    public C12066l(int i, int i2) {
        this.yandex = i;
        this.loadAd = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        AbstractC1786l.yandex("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12066l)) {
            return false;
        }
        C12066l c12066l = (C12066l) obj;
        return this.yandex == c12066l.yandex && this.loadAd == c12066l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex * 31) + this.loadAd;
    }

    public final String toString() {
        return AbstractC12589l.applovin(this.yandex, this.loadAd, "DeleteSurroundingTextCommand(lengthBeforeCursor=", ", lengthAfterCursor=", ")");
    }

    @Override // defpackage.InterfaceC3442l
    public final void yandex(C7221l c7221l) {
        int i = c7221l.f15048l;
        C11522l c11522l = (C11522l) c7221l.f15053l;
        int i2 = this.loadAd;
        int iPremium = i + i2;
        if (((i ^ iPremium) & (i2 ^ iPremium)) < 0) {
            iPremium = c11522l.premium();
        }
        c7221l.mopub(c7221l.f15048l, Math.min(iPremium, c11522l.premium()));
        int i3 = c7221l.f15049l;
        int i4 = this.yandex;
        int i5 = i3 - i4;
        if (((i4 ^ i3) & (i3 ^ i5)) < 0) {
            i5 = 0;
        }
        c7221l.mopub(Math.max(0, i5), c7221l.f15049l);
    }
}

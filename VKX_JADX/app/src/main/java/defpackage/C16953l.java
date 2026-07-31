package defpackage;

/* JADX INFO: renamed from: lؙٗۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16953l implements InterfaceC3442l {
    public final int loadAd;
    public final int yandex;

    public C16953l(int i, int i2) {
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
        if (!(obj instanceof C16953l)) {
            return false;
        }
        C16953l c16953l = (C16953l) obj;
        return this.yandex == c16953l.yandex && this.loadAd == c16953l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex * 31) + this.loadAd;
    }

    public final String toString() {
        return AbstractC12589l.applovin(this.yandex, this.loadAd, "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=", ", lengthAfterCursor=", ")");
    }

    @Override // defpackage.InterfaceC3442l
    public final void yandex(C7221l c7221l) {
        int i = 0;
        for (int i2 = 0; i2 < this.yandex; i2++) {
            int i3 = i + 1;
            int i4 = c7221l.f15049l;
            if (i4 <= i3) {
                i = i4;
                break;
            }
            i = (Character.isHighSurrogate(c7221l.admob((i4 - i3) + (-1))) && Character.isLowSurrogate(c7221l.admob(c7221l.f15049l - i3))) ? i + 2 : i3;
        }
        int iPremium = 0;
        for (int i5 = 0; i5 < this.loadAd; i5++) {
            int i6 = iPremium + 1;
            int i7 = c7221l.f15048l;
            C11522l c11522l = (C11522l) c7221l.f15053l;
            if (i7 + i6 >= c11522l.premium()) {
                iPremium = c11522l.premium() - c7221l.f15048l;
                break;
            }
            iPremium = (Character.isHighSurrogate(c7221l.admob((c7221l.f15048l + i6) + (-1))) && Character.isLowSurrogate(c7221l.admob(c7221l.f15048l + i6))) ? iPremium + 2 : i6;
        }
        int i8 = c7221l.f15048l;
        c7221l.mopub(i8, iPremium + i8);
        int i9 = c7221l.f15049l;
        c7221l.mopub(i9 - i, i9);
    }
}

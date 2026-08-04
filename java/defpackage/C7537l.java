package defpackage;

/* JADX INFO: renamed from: lؚۜۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7537l implements InterfaceC5404l, InterfaceC3501l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C8339l f15539l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f15540l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final float f15541l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final float f15542l;

    public C7537l(float f, boolean z, C8339l c8339l) {
        this.f15541l = f;
        this.f15540l = z;
        this.f15539l = c8339l;
        this.f15542l = f;
    }

    @Override // defpackage.InterfaceC5404l
    public final void Signature(InterfaceC13490l interfaceC13490l, int i, int[] iArr, EnumC9931l enumC9931l, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int iMo870l = interfaceC13490l.mo870l(this.f15541l);
        boolean z = this.f15540l && enumC9931l == EnumC9931l.f20222l;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int iMin = 0;
            int i4 = 0;
            while (i3 < length) {
                int iMax = Math.max(0, i - iArr[i3]);
                iArr2[i4] = iMax;
                iMin = Math.min(iMo870l, iMax);
                i = iArr2[i4] - iMin;
                i3++;
                i4++;
            }
            i2 = i + iMin;
        } else {
            int length2 = iArr.length;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i5 < length2) {
                int i9 = iArr[i5];
                int iMin2 = Math.min(i6, i - i9);
                iArr2[i8] = iMin2;
                int iMin3 = Math.min(iMo870l, (i - iMin2) - i9);
                int i10 = iArr2[i8] + i9 + iMin3;
                i5++;
                i7 = iMin3;
                i6 = i10;
                i8++;
            }
            i2 = i - (i6 - i7);
        }
        if (this.f15539l == null || i2 <= 0) {
            return;
        }
        int iRound = Math.round((1.0f + (enumC9931l == EnumC9931l.f20223l ? -1.0f : 1.0f)) * (i2 / 2.0f));
        if (z) {
            iRound -= i2;
        }
        if (iRound != 0) {
            int length3 = iArr2.length;
            for (int i11 = 0; i11 < length3; i11++) {
                iArr2[i11] = iArr2[i11] + iRound;
            }
        }
    }

    @Override // defpackage.InterfaceC5404l
    public final float amazon() {
        return this.f15542l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7537l)) {
            return false;
        }
        C7537l c7537l = (C7537l) obj;
        return C14467l.loadAd(this.f15541l, c7537l.f15541l) && this.f15540l == c7537l.f15540l && AbstractC8576l.yandex(this.f15539l, c7537l.f15539l);
    }

    public final int hashCode() {
        int iFloatToIntBits = ((Float.floatToIntBits(this.f15541l) * 31) + (this.f15540l ? 1231 : 1237)) * 31;
        C8339l c8339l = this.f15539l;
        return iFloatToIntBits + (c8339l == null ? 0 : c8339l.hashCode());
    }

    @Override // defpackage.InterfaceC3501l
    public final void startapp(InterfaceC13490l interfaceC13490l, int i, int[] iArr, int[] iArr2) {
        Signature(interfaceC13490l, i, iArr, EnumC9931l.f20223l, iArr2);
    }

    public final String toString() {
        return (this.f15540l ? "" : "Absolute") + "Arrangement#spacedAligned(" + C14467l.crashlytics(this.f15541l) + ", " + this.f15539l + ")";
    }
}

package defpackage;

/* JADX INFO: renamed from: lٌَّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8691l implements InterfaceC5404l, InterfaceC6951l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final float f17897l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final float f17898l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final float f17899l;

    public C8691l(float f) {
        this.f17899l = f;
        this.f17898l = f;
        this.f17897l = (f + f) / 2.0f;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    @Override // defpackage.InterfaceC5404l
    public void Signature(InterfaceC13490l interfaceC13490l, int i, int[] iArr, EnumC9931l enumC9931l, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int iMo870l = interfaceC13490l.mo870l(this.f17899l);
        int iMo870l2 = interfaceC13490l.mo870l(this.f17898l);
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            int i6 = i4 + 1;
            if (i4 == 0) {
                i2 = 0;
            } else if (i4 == 1) {
                int i7 = iArr[0];
                i2 = i7 + (i7 > 0 ? iMo870l : iMo870l2);
            } else if (i4 != 2) {
                i2 = 0;
            } else {
                i2 = i - i5;
            }
            if (enumC9931l != EnumC9931l.f20223l) {
                i2 = (i - i2) - i5;
            }
            iArr2[i4] = i2;
            i3++;
            i4 = i6;
        }
    }

    @Override // defpackage.InterfaceC5404l
    public float amazon() {
        return this.f17897l;
    }

    @Override // defpackage.InterfaceC6951l
    public long yandex(float f, float f2) {
        float f3 = f + this.f17899l;
        float f4 = this.f17898l;
        return C9699l.yandex(f3 / f4, (f2 + this.f17897l) / f4);
    }

    public C8691l(float f, float f2, float f3) {
        this.f17899l = f;
        this.f17898l = f2;
        this.f17897l = f3;
    }
}

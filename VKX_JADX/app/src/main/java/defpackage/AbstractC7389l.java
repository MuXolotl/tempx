package defpackage;

/* JADX INFO: renamed from: lؚٜ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7389l implements InterfaceC9273l, InterfaceC11512l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f15313l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f15314l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final EnumC2441l f15315l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f15316l;

    public AbstractC7389l(AbstractC7389l abstractC7389l) {
        this.f15314l = new byte[4];
        this.f15315l = abstractC7389l.f15315l;
        amazon(abstractC7389l);
    }

    public abstract void admob(int i, byte[] bArr);

    public final void amazon(AbstractC7389l abstractC7389l) {
        byte[] bArr = abstractC7389l.f15314l;
        System.arraycopy(bArr, 0, this.f15314l, 0, bArr.length);
        this.f15313l = abstractC7389l.f15313l;
        this.f15316l = abstractC7389l.f15316l;
    }

    public abstract void billing();

    @Override // defpackage.InterfaceC9273l
    public final int getByteLength() {
        return 64;
    }

    public abstract void mopub(long j);

    public final void purchase() {
        long j = this.f15316l << 3;
        byte b = -128;
        while (true) {
            update(b);
            if (this.f15313l == 0) {
                mopub(j);
                billing();
                return;
            }
            b = 0;
        }
    }

    @Override // defpackage.InterfaceC16922l
    public void reset() {
        this.f15316l = 0L;
        this.f15313l = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.f15314l;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int iMax = Math.max(0, i2);
        int i4 = this.f15313l;
        byte[] bArr2 = this.f15314l;
        if (i4 != 0) {
            int i5 = 0;
            while (true) {
                if (i5 >= iMax) {
                    i3 = i5;
                    break;
                }
                int i6 = this.f15313l;
                int i7 = i6 + 1;
                this.f15313l = i7;
                int i8 = i5 + 1;
                bArr2[i6] = bArr[i5 + i];
                if (i7 == 4) {
                    admob(0, bArr2);
                    this.f15313l = 0;
                    i3 = i8;
                    break;
                }
                i5 = i8;
            }
        }
        int i9 = iMax - 3;
        while (i3 < i9) {
            admob(i + i3, bArr);
            i3 += 4;
        }
        while (i3 < iMax) {
            int i10 = this.f15313l;
            this.f15313l = i10 + 1;
            bArr2[i10] = bArr[i3 + i];
            i3++;
        }
        this.f15316l += (long) iMax;
    }

    public AbstractC7389l(EnumC2441l enumC2441l) {
        this.f15314l = new byte[4];
        this.f15315l = enumC2441l;
        this.f15313l = 0;
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte b) {
        int i = this.f15313l;
        int i2 = i + 1;
        this.f15313l = i2;
        byte[] bArr = this.f15314l;
        bArr[i] = b;
        if (i2 == bArr.length) {
            admob(0, bArr);
            this.f15313l = 0;
        }
        this.f15316l++;
    }
}

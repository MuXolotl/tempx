package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: renamed from: lٌٗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8837l implements InterfaceC9273l, InterfaceC11512l, InterfaceC0363l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final byte[] f18149l = {2, 6, 3, 10, 7, 0, 4, 13, 1, 11, 12, 5, 9, 14, 15, 8};

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final int[] f18150l = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f18151l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int[] f18152l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Stack f18153l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int f18154l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public int f18155l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int[] f18156l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f18157l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public long f18158l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public int f18159l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int[] f18160l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int[] f18161l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f18162l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f18163l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[] f18164l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f18165l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public long f18166l;

    public C8837l() {
        this.f18157l = new byte[64];
        int[] iArr = new int[8];
        this.f18156l = iArr;
        this.f18152l = new int[8];
        this.f18161l = new int[16];
        this.f18160l = new int[16];
        this.f18164l = new byte[16];
        this.f18153l = new Stack();
        this.f18154l = 32;
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
        reset();
        System.arraycopy(f18150l, 0, iArr, 0, 8);
        this.f18165l = 0;
    }

    public final void admob(int i, int i2, int i3, int i4, int i5) {
        int i6 = i << 1;
        int[] iArr = this.f18161l;
        int i7 = iArr[i2];
        int i8 = iArr[i3];
        int i9 = i6 + 1;
        byte[] bArr = this.f18164l;
        byte b = bArr[i6];
        int[] iArr2 = this.f18160l;
        int i10 = i8 + iArr2[b] + i7;
        iArr[i2] = i10;
        int iRotateRight = Integer.rotateRight(iArr[i5] ^ i10, 16);
        iArr[i5] = iRotateRight;
        int i11 = iArr[i4] + iRotateRight;
        iArr[i4] = i11;
        int iRotateRight2 = Integer.rotateRight(iArr[i3] ^ i11, 12);
        iArr[i3] = iRotateRight2;
        int i12 = iRotateRight2 + iArr2[bArr[i9]] + iArr[i2];
        iArr[i2] = i12;
        int iRotateRight3 = Integer.rotateRight(iArr[i5] ^ i12, 8);
        iArr[i5] = iRotateRight3;
        int i13 = iArr[i4] + iRotateRight3;
        iArr[i4] = i13;
        iArr[i3] = Integer.rotateRight(iArr[i3] ^ i13, 7);
    }

    public final void amazon() {
        byte[] bArr;
        byte b = 0;
        while (true) {
            bArr = this.f18164l;
            if (b >= bArr.length) {
                break;
            }
            bArr[b] = b;
            b = (byte) (b + 1);
        }
        int i = 0;
        while (true) {
            subs();
            if (i >= 6) {
                break;
            }
            for (byte b2 = 0; b2 < bArr.length; b2 = (byte) (b2 + 1)) {
                bArr[b2] = f18149l[bArr[b2]];
            }
            i++;
        }
        boolean z = this.f18163l;
        int[] iArr = this.f18152l;
        int[] iArr2 = this.f18161l;
        if (!z) {
            for (int i2 = 0; i2 < 8; i2++) {
                iArr[i2] = iArr2[i2] ^ iArr2[i2 + 8];
            }
            return;
        }
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i3 + 8;
            iArr2[i3] = iArr2[i3] ^ iArr2[i4];
            iArr2[i4] = iArr2[i4] ^ iArr[i3];
        }
        AbstractC10000l.remoteconfig(this.f18157l, iArr2);
        this.f18155l = 0;
    }

    public final void billing(int i, boolean z) {
        int[] iArr = this.f18159l == 0 ? this.f18156l : this.f18152l;
        int[] iArr2 = this.f18161l;
        System.arraycopy(iArr, 0, iArr2, 0, 8);
        System.arraycopy(f18150l, 0, iArr2, 8, 4);
        long j = this.f18166l;
        iArr2[12] = (int) j;
        iArr2[13] = (int) (j >> 32);
        iArr2[14] = i;
        int i2 = this.f18165l;
        int i3 = this.f18159l;
        int i4 = i2 + (i3 == 0 ? 1 : 0) + (z ? 2 : 0);
        iArr2[15] = i4;
        int i5 = i3 + i;
        this.f18159l = i5;
        if (i5 >= 1024) {
            this.f18166l = j + 1;
            this.f18159l = 0;
            iArr2[15] = i4 | 2;
        }
        if (z && this.f18153l.isEmpty()) {
            isPro();
        }
    }

    @Override // defpackage.InterfaceC0363l
    public final int crashlytics(int i, int i2, byte[] bArr) {
        int i3;
        if (i > bArr.length - i2) {
            C18073l.ad("output buffer too short");
            return 0;
        }
        boolean z = this.f18163l;
        int[] iArr = this.f18152l;
        byte[] bArr2 = this.f18157l;
        if (!z) {
            billing(this.f18155l, true);
            int[] iArr2 = this.f18160l;
            AbstractC10000l.startapp(0, bArr2, iArr2);
            amazon();
            while (true) {
                Stack stack = this.f18153l;
                if (stack.isEmpty()) {
                    break;
                }
                System.arraycopy((int[]) stack.pop(), 0, iArr2, 0, 8);
                System.arraycopy(iArr, 0, iArr2, 8, 8);
                mopub();
                if (stack.isEmpty()) {
                    isPro();
                }
                amazon();
            }
        }
        if (i2 >= 0) {
            long j = this.f18158l;
            if (j < 0 || i2 <= j) {
                int i4 = this.f18155l;
                if (i4 < 64) {
                    int iMin = Math.min(i2, 64 - i4);
                    System.arraycopy(bArr2, this.f18155l, bArr, i, iMin);
                    this.f18155l += iMin;
                    i += iMin;
                    i3 = i2 - iMin;
                } else {
                    i3 = i2;
                }
                while (i3 > 0) {
                    this.f18166l++;
                    int[] iArr3 = this.f18161l;
                    System.arraycopy(iArr, 0, iArr3, 0, 8);
                    System.arraycopy(f18150l, 0, iArr3, 8, 4);
                    long j2 = this.f18166l;
                    iArr3[12] = (int) j2;
                    iArr3[13] = (int) (j2 >> 32);
                    iArr3[14] = this.f18151l;
                    iArr3[15] = this.f18162l;
                    amazon();
                    int iMin2 = Math.min(i3, 64);
                    System.arraycopy(bArr2, 0, bArr, i, iMin2);
                    this.f18155l += iMin2;
                    i += iMin2;
                    i3 -= iMin2;
                }
                this.f18158l -= (long) i2;
                reset();
                return i2;
            }
        }
        C8339l.metrica("Insufficient bytes remaining");
        return 0;
    }

    @Override // defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        int i2 = this.f18154l;
        crashlytics(i, i2, bArr);
        return i2;
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "BLAKE3";
    }

    @Override // defpackage.InterfaceC9273l
    public final int getByteLength() {
        return 64;
    }

    @Override // defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return this.f18154l;
    }

    public final void isPro() {
        int[] iArr = this.f18161l;
        int i = iArr[15] | 8;
        iArr[15] = i;
        this.f18162l = i;
        this.f18151l = iArr[14];
        this.f18166l = 0L;
        this.f18163l = true;
        this.f18158l = -1L;
        System.arraycopy(iArr, 0, this.f18152l, 0, 8);
    }

    @Override // defpackage.InterfaceC11512l
    public final void loadAd(InterfaceC11512l interfaceC11512l) {
        C8837l c8837l = (C8837l) interfaceC11512l;
        this.f18166l = c8837l.f18166l;
        this.f18159l = c8837l.f18159l;
        this.f18165l = c8837l.f18165l;
        this.f18163l = c8837l.f18163l;
        this.f18158l = c8837l.f18158l;
        this.f18162l = c8837l.f18162l;
        this.f18151l = c8837l.f18151l;
        int[] iArr = c8837l.f18152l;
        int[] iArr2 = this.f18152l;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = c8837l.f18156l;
        int[] iArr4 = this.f18156l;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        int[] iArr5 = c8837l.f18160l;
        int[] iArr6 = this.f18160l;
        System.arraycopy(iArr5, 0, iArr6, 0, iArr6.length);
        Stack stack = this.f18153l;
        stack.clear();
        Iterator it = c8837l.f18153l.iterator();
        while (it.hasNext()) {
            stack.push(AbstractC14024l.amazon((int[]) it.next()));
        }
        byte[] bArr = c8837l.f18157l;
        byte[] bArr2 = this.f18157l;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.f18155l = c8837l.f18155l;
    }

    public final void mopub() {
        int[] iArr = this.f18156l;
        int[] iArr2 = this.f18161l;
        System.arraycopy(iArr, 0, iArr2, 0, 8);
        System.arraycopy(f18150l, 0, iArr2, 8, 4);
        iArr2[12] = 0;
        iArr2[13] = 0;
        iArr2[14] = 64;
        iArr2[15] = this.f18165l | 4;
    }

    public final void purchase(int i, byte[] bArr) {
        int[] iArr;
        Stack stack;
        billing(64, false);
        int[] iArr2 = this.f18160l;
        AbstractC10000l.startapp(i, bArr, iArr2);
        amazon();
        if (this.f18159l == 0) {
            long j = this.f18166l;
            while (true) {
                iArr = this.f18152l;
                stack = this.f18153l;
                if (j <= 0 || (j & 1) == 1) {
                    break;
                }
                System.arraycopy((int[]) stack.pop(), 0, iArr2, 0, 8);
                System.arraycopy(iArr, 0, iArr2, 8, 8);
                mopub();
                amazon();
                j >>= 1;
            }
            int[] iArr3 = new int[8];
            System.arraycopy(iArr, 0, iArr3, 0, Math.min(iArr.length, 8));
            stack.push(iArr3);
        }
    }

    @Override // defpackage.InterfaceC16922l
    public final void reset() {
        this.f18166l = 0L;
        this.f18159l = 0;
        this.f18155l = 0;
        this.f18163l = false;
        Arrays.fill(this.f18157l, (byte) 0);
    }

    public final void subs() {
        admob(0, 0, 4, 8, 12);
        admob(1, 1, 5, 9, 13);
        admob(2, 2, 6, 10, 14);
        admob(3, 3, 7, 11, 15);
        admob(4, 0, 5, 10, 15);
        admob(5, 1, 6, 11, 12);
        admob(6, 2, 7, 8, 13);
        admob(7, 3, 4, 9, 14);
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null || i2 == 0) {
            return;
        }
        if (this.f18163l) {
            C8339l.smaato("Already outputting");
            return;
        }
        int i4 = this.f18155l;
        byte[] bArr2 = this.f18157l;
        if (i4 != 0) {
            i3 = 64 - i4;
            if (i3 >= i2) {
                System.arraycopy(bArr, i, bArr2, i4, i2);
                this.f18155l += i2;
                return;
            } else {
                System.arraycopy(bArr, i, bArr2, i4, i3);
                purchase(0, bArr2);
                this.f18155l = 0;
                Arrays.fill(bArr2, (byte) 0);
            }
        } else {
            i3 = 0;
        }
        int i5 = (i + i2) - 64;
        int i6 = i3 + i;
        while (i6 < i5) {
            purchase(i6, bArr);
            i6 += 64;
        }
        int i7 = (i2 - i6) + i;
        System.arraycopy(bArr, i6, bArr2, 0, i7);
        this.f18155l += i7;
    }

    @Override // defpackage.InterfaceC11512l
    public final InterfaceC11512l yandex() {
        return new C8837l(this);
    }

    public C8837l(C8837l c8837l) {
        this.f18157l = new byte[64];
        this.f18156l = new int[8];
        this.f18152l = new int[8];
        this.f18161l = new int[16];
        this.f18160l = new int[16];
        this.f18164l = new byte[16];
        this.f18153l = new Stack();
        this.f18154l = c8837l.f18154l;
        loadAd(c8837l);
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte b) {
        if (this.f18163l) {
            C8339l.smaato("Already outputting");
            return;
        }
        byte[] bArr = this.f18157l;
        if (bArr.length - this.f18155l == 0) {
            purchase(0, bArr);
            Arrays.fill(bArr, (byte) 0);
            this.f18155l = 0;
        }
        int i = this.f18155l;
        bArr[i] = b;
        this.f18155l = i + 1;
    }
}

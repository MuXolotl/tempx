package defpackage;

import android.R;

/* JADX INFO: renamed from: lؑۦؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0707l extends AbstractC6568l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f2184l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final InterfaceC10952l f2185l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f2186l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f2187l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f2188l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f2189l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f2190l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f2191l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f2192l;

    public C0707l(InterfaceC10952l interfaceC10952l) {
        super(interfaceC10952l);
        this.f2186l = true;
        this.f2185l = interfaceC10952l;
        int iLicense = interfaceC10952l.license();
        this.f2192l = iLicense;
        if (iLicense != 8) {
            C8339l.metrica("GCTR only for 64 bit block ciphers");
            throw null;
        }
        this.f2187l = new byte[interfaceC10952l.license()];
        this.f2184l = new byte[interfaceC10952l.license()];
        this.f2190l = new byte[interfaceC10952l.license()];
    }

    public static void amazon(int i, int i2, byte[] bArr) {
        bArr[i2 + 3] = (byte) (i >>> 24);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2] = (byte) i;
    }

    public static int crashlytics(int i, byte[] bArr) {
        return ((bArr[i + 3] << 24) & (-16777216)) + ((bArr[i + 2] << 16) & 16711680) + ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255);
    }

    @Override // defpackage.InterfaceC10952l
    public final String getAlgorithmName() {
        return this.f2185l.getAlgorithmName().concat("/GCTR");
    }

    @Override // defpackage.InterfaceC10952l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        this.f2186l = true;
        this.f2191l = 0;
        this.f2188l = 0;
        boolean z2 = interfaceC9719l instanceof C0272l;
        InterfaceC10952l interfaceC10952l = this.f2185l;
        if (!z2) {
            reset();
            if (interfaceC9719l != null) {
                interfaceC10952l.init(true, interfaceC9719l);
                return;
            }
            return;
        }
        C0272l c0272l = (C0272l) interfaceC9719l;
        byte[] bArr = c0272l.f1273l;
        int length = bArr.length;
        byte[] bArr2 = this.f2187l;
        if (length < bArr2.length) {
            System.arraycopy(bArr, 0, bArr2, bArr2.length - bArr.length, bArr.length);
            for (int i = 0; i < bArr2.length - bArr.length; i++) {
                bArr2[i] = 0;
            }
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        }
        reset();
        InterfaceC9719l interfaceC9719l2 = c0272l.f1272l;
        if (interfaceC9719l2 != null) {
            interfaceC10952l.init(true, interfaceC9719l2);
        }
    }

    @Override // defpackage.InterfaceC10952l
    public final int license() {
        return this.f2192l;
    }

    @Override // defpackage.AbstractC6568l
    public final byte loadAd(byte b) {
        int i = this.f2189l;
        byte[] bArr = this.f2190l;
        byte[] bArr2 = this.f2184l;
        if (i == 0) {
            boolean z = this.f2186l;
            InterfaceC10952l interfaceC10952l = this.f2185l;
            if (z) {
                this.f2186l = false;
                interfaceC10952l.tapsense(0, 0, bArr2, bArr);
                this.f2191l = crashlytics(0, bArr);
                this.f2188l = crashlytics(4, bArr);
            }
            int i2 = this.f2191l + R.attr.cacheColorHint;
            this.f2191l = i2;
            int i3 = this.f2188l;
            int i4 = i3 + R.attr.hand_minute;
            this.f2188l = i4;
            if (i4 < 16843012 && i4 > 0) {
                this.f2188l = i3 + R.attr.format;
            }
            amazon(i2, 0, bArr2);
            amazon(this.f2188l, 4, bArr2);
            interfaceC10952l.tapsense(0, 0, bArr2, bArr);
        }
        int i5 = this.f2189l;
        int i6 = i5 + 1;
        this.f2189l = i6;
        byte b2 = (byte) (b ^ bArr[i5]);
        int i7 = this.f2192l;
        if (i6 == i7) {
            this.f2189l = 0;
            System.arraycopy(bArr2, i7, bArr2, 0, bArr2.length - i7);
            System.arraycopy(bArr, 0, bArr2, bArr2.length - i7, i7);
        }
        return b2;
    }

    @Override // defpackage.InterfaceC10952l
    public final void reset() {
        this.f2186l = true;
        this.f2191l = 0;
        this.f2188l = 0;
        byte[] bArr = this.f2184l;
        byte[] bArr2 = this.f2187l;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        this.f2189l = 0;
        this.f2185l.reset();
    }

    @Override // defpackage.InterfaceC10952l
    public final int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        processBytes(bArr, i, this.f2192l, bArr2, i2);
        return this.f2192l;
    }
}

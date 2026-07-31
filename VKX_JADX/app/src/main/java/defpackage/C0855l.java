package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٖؒؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0855l implements InterfaceC14091l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C6963l f2504l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public InterfaceC5788l f2505l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public InterfaceC16922l f2506l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public byte[] f2507l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f2508l;

    @Override // defpackage.InterfaceC14091l
    public final byte[] crashlytics() {
        yandex(this.f2508l);
        InterfaceC5788l interfaceC5788l = this.f2505l;
        byte[] bArr = this.f2507l;
        BigInteger bigInteger = new BigInteger(1, interfaceC5788l.processBlock(bArr, 0, bArr.length));
        byte[] bArr2 = this.f2507l;
        for (int i = 0; i != bArr2.length; i++) {
            bArr2[i] = 0;
        }
        return AbstractC16784l.yandex(AbstractC16784l.mopub(this.f2504l.f14630l), bigInteger.min(this.f2504l.f14630l.subtract(bigInteger)));
    }

    @Override // defpackage.InterfaceC14091l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        C6963l c6963l = (C6963l) interfaceC9719l;
        this.f2504l = c6963l;
        this.f2505l.init(z, c6963l);
        this.f2507l = new byte[(this.f2504l.f14630l.bitLength() + 7) / 8];
        this.f2506l.reset();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if ((r5.intValue() & 15) == 12) goto L9;
     */
    @Override // defpackage.InterfaceC14091l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean loadAd(byte[] r5) {
        /*
            r4 = this;
            int r0 = r4.f2508l
            r1 = 0
            lؘٚٞ r2 = r4.f2505l     // Catch: java.lang.Exception -> L67
            int r3 = r5.length     // Catch: java.lang.Exception -> L67
            byte[] r5 = r2.processBlock(r5, r1, r3)     // Catch: java.lang.Exception -> L67
            r4.f2507l = r5     // Catch: java.lang.Exception -> L67
            java.math.BigInteger r5 = new java.math.BigInteger
            byte[] r2 = r4.f2507l
            r3 = 1
            r5.<init>(r3, r2)
            int r2 = r5.intValue()
            r2 = r2 & 15
            r3 = 12
            if (r2 != r3) goto L1f
            goto L2f
        L1f:
            lؚؑۛ r2 = r4.f2504l
            java.math.BigInteger r2 = r2.f14630l
            java.math.BigInteger r5 = r2.subtract(r5)
            int r2 = r5.intValue()
            r2 = r2 & 15
            if (r2 != r3) goto L67
        L2f:
            r4.yandex(r0)
            byte[] r2 = r4.f2507l
            int r2 = r2.length
            byte[] r5 = defpackage.AbstractC16784l.yandex(r2, r5)
            byte[] r2 = r4.f2507l
            boolean r2 = defpackage.AbstractC14024l.smaato(r2, r5)
            r3 = 15052(0x3acc, float:2.1092E-41)
            if (r0 != r3) goto L52
            if (r2 != 0) goto L52
            byte[] r0 = r4.f2507l
            int r2 = r0.length
            int r2 = r2 + (-2)
            r3 = 64
            r0[r2] = r3
            boolean r2 = defpackage.AbstractC14024l.smaato(r0, r5)
        L52:
            byte[] r4 = r4.f2507l
            r0 = r1
        L55:
            int r3 = r4.length
            if (r0 == r3) goto L5d
            r4[r0] = r1
            int r0 = r0 + 1
            goto L55
        L5d:
            r4 = r1
        L5e:
            int r0 = r5.length
            if (r4 == r0) goto L66
            r5[r4] = r1
            int r4 = r4 + 1
            goto L5e
        L66:
            return r2
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0855l.loadAd(byte[]):boolean");
    }

    @Override // defpackage.InterfaceC14091l
    public final void update(byte b) {
        this.f2506l.update(b);
    }

    public final void yandex(int i) {
        int length;
        InterfaceC16922l interfaceC16922l = this.f2506l;
        int digestSize = interfaceC16922l.getDigestSize();
        byte[] bArr = this.f2507l;
        if (i == 188) {
            length = (bArr.length - digestSize) - 1;
            interfaceC16922l.doFinal(bArr, length);
            byte[] bArr2 = this.f2507l;
            bArr2[bArr2.length - 1] = -68;
        } else {
            int length2 = (bArr.length - digestSize) - 2;
            interfaceC16922l.doFinal(bArr, length2);
            byte[] bArr3 = this.f2507l;
            bArr3[bArr3.length - 2] = (byte) (i >>> 8);
            bArr3[bArr3.length - 1] = (byte) i;
            length = length2;
        }
        this.f2507l[0] = 107;
        int i2 = length - 2;
        while (true) {
            byte[] bArr4 = this.f2507l;
            if (i2 == 0) {
                bArr4[length - 1] = -70;
                return;
            } else {
                bArr4[i2] = -69;
                i2--;
            }
        }
    }

    @Override // defpackage.InterfaceC14091l
    public final void update(byte[] bArr, int i, int i2) {
        this.f2506l.update(bArr, i, i2);
    }
}

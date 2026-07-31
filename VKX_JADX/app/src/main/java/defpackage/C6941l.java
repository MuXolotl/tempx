package defpackage;

/* JADX INFO: renamed from: lؚؐ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6941l extends C6921l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f14555l;

    public C6941l(InterfaceC17475l interfaceC17475l, boolean z) {
        super((Object) interfaceC17475l, 3, false);
        this.f14555l = z;
    }

    @Override // defpackage.C6921l
    public final void adcel(int i) {
        if (this.f14555l) {
            Signature(Long.toString(4294967295L & ((long) i), 10));
        } else {
            subscription(Long.toString(4294967295L & ((long) i), 10));
        }
    }

    @Override // defpackage.C6921l
    public final void ads(long j) {
        int i = 63;
        String str = "0";
        if (this.f14555l) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % 10), 10);
                        j2 /= 10;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            Signature(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j3 = (j >>> 1) / 5;
                cArr2[63] = Character.forDigit((int) (j - (j3 * 10)), 10);
                while (j3 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j3 % 10), 10);
                    j3 /= 10;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        subscription(str);
    }

    @Override // defpackage.C6921l
    public final void metrica(byte b) {
        if (this.f14555l) {
            Signature(String.valueOf(b & 255));
        } else {
            subscription(String.valueOf(b & 255));
        }
    }

    @Override // defpackage.C6921l
    public final void tapsense(short s) {
        if (this.f14555l) {
            Signature(String.valueOf(s & 65535));
        } else {
            subscription(String.valueOf(s & 65535));
        }
    }
}

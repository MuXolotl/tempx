package defpackage;

/* JADX INFO: renamed from: lًْٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8094l extends AbstractC11186l {
    public final byte[] loadAd;
    public final C0361l yandex;

    public C8094l(InterfaceC16922l interfaceC16922l) {
        C0361l c0361l = new C0361l(interfaceC16922l);
        this.yandex = c0361l;
        this.loadAd = new byte[c0361l.f1426l];
    }

    @Override // defpackage.AbstractC11186l
    public final InterfaceC9719l generateDerivedMacParameters(int i) {
        return generateDerivedParameters(i);
    }

    @Override // defpackage.AbstractC11186l
    public final InterfaceC9719l generateDerivedParameters(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] bArrYandex = yandex(i3 + i4);
        return new C0272l(new C13886l(bArrYandex, 0, i3), bArrYandex, i3, i4);
    }

    public final byte[] yandex(int i) {
        C0361l c0361l = this.yandex;
        int i2 = c0361l.f1426l;
        byte b = 1;
        int i3 = ((i + i2) - 1) / i2;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[i3 * i2];
        c0361l.init(new C13886l(this.password));
        int i4 = 1;
        int i5 = 0;
        while (i4 <= i3) {
            int i6 = 3;
            while (true) {
                byte b2 = (byte) (bArr[i6] + b);
                bArr[i6] = b2;
                if (b2 != 0) {
                    break;
                }
                i6--;
            }
            byte[] bArr3 = this.salt;
            int i7 = this.iterationCount;
            if (i7 == 0) {
                C8339l.metrica("iteration count must be at least 1.");
                return null;
            }
            if (bArr3 != null) {
                c0361l.update(bArr3, 0, bArr3.length);
            }
            c0361l.update(bArr, 0, 4);
            byte[] bArr4 = this.loadAd;
            c0361l.doFinal(bArr4, 0);
            System.arraycopy(bArr4, 0, bArr2, i5, bArr4.length);
            for (int i8 = b; i8 < i7; i8++) {
                c0361l.update(bArr4, 0, bArr4.length);
                c0361l.doFinal(bArr4, 0);
                for (int i9 = 0; i9 != bArr4.length; i9++) {
                    int i10 = i5 + i9;
                    bArr2[i10] = (byte) (bArr2[i10] ^ bArr4[i9]);
                }
            }
            i5 += i2;
            i4++;
            b = 1;
        }
        return bArr2;
    }

    @Override // defpackage.AbstractC11186l
    public final InterfaceC9719l generateDerivedParameters(int i) {
        int i2 = i / 8;
        return new C13886l(yandex(i2), 0, i2);
    }
}

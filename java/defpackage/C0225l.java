package defpackage;

/* JADX INFO: renamed from: lَؑٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0225l extends AbstractC4350l {
    public final C16977l loadAd;

    public C0225l() {
        C16977l c16977l = AbstractC6903l.yandex;
        this.loadAd = new C16977l();
    }

    @Override // defpackage.AbstractC4350l
    public final void loadAd() {
        C16977l c16977l = this.loadAd;
        int[] iArr = c16977l.loadAd;
        Object[] objArr = c16977l.crashlytics;
        long[] jArr = c16977l.yandex;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        C12463l c12463l = (C12463l) objArr[i4];
                        Object[] objArr2 = c12463l.yandex;
                        int i6 = c12463l.loadAd;
                        for (int i7 = 0; i7 < i6; i7++) {
                            C11603l c11603l = (C11603l) objArr2[i7];
                            InterfaceC3263l interfaceC3263l = c11603l.amazon;
                            if (interfaceC3263l != null) {
                                interfaceC3263l.cancel();
                            }
                            c11603l.amazon = null;
                            C3103l c3103l = (C3103l) c11603l.yandex.f7072l;
                            c3103l.f6645l = true;
                            c3103l.f6646l = false;
                            c3103l.yandex();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}

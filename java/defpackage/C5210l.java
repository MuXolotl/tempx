package defpackage;

/* JADX INFO: renamed from: lْؗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5210l extends C3734l {
    @Override // defpackage.C3734l, defpackage.InterfaceC2232l
    public final int doFinal(byte[] bArr, int i) {
        long j = this.f7815l;
        int i2 = this.f7812l;
        this.f7815l = ((j >>> ((7 - i2) << 3)) >>> 8) | ((((long) ((this.f7817l << 3) + i2)) & 255) << 56);
        crashlytics();
        this.f7808l ^= 238;
        int i3 = this.f7810l;
        yandex(i3);
        long j2 = this.f7813l;
        long j3 = this.f7816l;
        long j4 = ((j2 ^ j3) ^ this.f7808l) ^ this.f7809l;
        this.f7816l = j3 ^ 221;
        yandex(i3);
        long j5 = ((this.f7813l ^ this.f7816l) ^ this.f7808l) ^ this.f7809l;
        reset();
        AbstractC10000l.pro(j4, bArr, 0);
        AbstractC10000l.pro(j5, bArr, 8);
        return 16;
    }

    @Override // defpackage.C3734l, defpackage.InterfaceC2232l
    public final String getAlgorithmName() {
        return "SipHash128-" + this.f7811l + "-" + this.f7810l;
    }

    @Override // defpackage.C3734l, defpackage.InterfaceC2232l
    public final int getMacSize() {
        return 16;
    }

    @Override // defpackage.C3734l
    public final long loadAd() {
        throw new UnsupportedOperationException("doFinal() is not supported");
    }

    @Override // defpackage.C3734l, defpackage.InterfaceC2232l
    public final void reset() {
        super.reset();
        this.f7816l ^= 238;
    }
}

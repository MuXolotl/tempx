package defpackage;

/* JADX INFO: renamed from: lِٕؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11628l extends C3479l {
    @Override // defpackage.C3479l
    public final int crashlytics() {
        return 12;
    }

    @Override // defpackage.C3479l, defpackage.InterfaceC12774l
    public final String getAlgorithmName() {
        return "ChaCha7539";
    }

    @Override // defpackage.C3479l
    public final void loadAd(byte[] bArr) {
        int[] iArr = this.f7366l;
        int[] iArr2 = this.f7363l;
        C6173l.admob(iArr, iArr2);
        AbstractC10000l.remoteconfig(bArr, iArr2);
    }

    @Override // defpackage.C3479l
    public final void mopub(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.f7366l;
        if (bArr != null) {
            if (bArr.length != 32) {
                C8339l.metrica("ChaCha7539 requires 256 bit key");
                return;
            } else {
                C3479l.amazon(iArr, bArr.length);
                AbstractC10000l.adcel(bArr, 0, iArr, 4, 8);
            }
        }
        AbstractC10000l.adcel(bArr2, 0, iArr, 13, 3);
    }

    @Override // defpackage.C3479l
    public final void purchase() {
        this.f7366l[12] = 0;
    }

    @Override // defpackage.C3479l
    public final void yandex() {
        int[] iArr = this.f7366l;
        int i = iArr[12] + 1;
        iArr[12] = i;
        if (i != 0) {
            return;
        }
        C8339l.smaato("attempt to increase counter past 2^32.");
    }
}

package defpackage;

/* JADX INFO: renamed from: lؑؒۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0045l implements InterfaceC6152l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public byte[] f905l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public byte[] f906l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC16922l f907l;

    public C0045l(InterfaceC16922l interfaceC16922l) {
        this.f907l = interfaceC16922l;
    }

    @Override // defpackage.InterfaceC6152l
    public final void billing(InterfaceC16937l interfaceC16937l) {
        if (!(interfaceC16937l instanceof C9800l)) {
            C8339l.metrica("KDF parameters required for generator");
            return;
        }
        C9800l c9800l = (C9800l) interfaceC16937l;
        this.f906l = c9800l.loadAd;
        this.f905l = c9800l.yandex;
    }

    @Override // defpackage.InterfaceC6152l
    public final int purchase(int i, byte[] bArr) {
        if (bArr.length - i < 0) {
            C18073l.ad("output buffer too small");
            return 0;
        }
        InterfaceC16922l interfaceC16922l = this.f907l;
        interfaceC16922l.reset();
        int digestSize = interfaceC16922l.getDigestSize();
        if (i > ((long) digestSize) * 4294967295L) {
            C8339l.metrica("Output length too large");
            return 0;
        }
        byte[] bArr2 = new byte[4];
        int i2 = 1;
        int i3 = i;
        int i4 = 0;
        while (i3 > 0) {
            AbstractC10000l.firebase(i2, bArr2);
            byte[] bArr3 = this.f906l;
            interfaceC16922l.update(bArr3, 0, bArr3.length);
            interfaceC16922l.update(bArr2, 0, 4);
            byte[] bArr4 = this.f905l;
            if (bArr4 != null) {
                interfaceC16922l.update(bArr4, 0, bArr4.length);
            }
            if (i3 < digestSize) {
                byte[] bArr5 = new byte[digestSize];
                interfaceC16922l.doFinal(bArr5, 0);
                System.arraycopy(bArr5, 0, bArr, i4, i3);
                return i;
            }
            interfaceC16922l.doFinal(bArr, i4);
            i4 += digestSize;
            i3 -= digestSize;
            i2++;
        }
        return i;
    }
}

package defpackage;

/* JADX INFO: renamed from: lؙْٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13527l extends AbstractC8002l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final byte[] f26549l = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13527l(C13527l c13527l) {
        super(f26549l);
        c13527l.getClass();
        loadAd(c13527l);
    }

    @Override // defpackage.AbstractC8002l, defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        byte[] bArr2 = new byte[64];
        super.doFinal(bArr2, 0);
        System.arraycopy(bArr2, 32, bArr, i, 32);
        return 32;
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "GOST3411-2012-256";
    }

    @Override // defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return 32;
    }

    @Override // defpackage.InterfaceC11512l
    public final InterfaceC11512l yandex() {
        return new C13527l(this);
    }

    public C13527l() {
        super(f26549l);
    }
}

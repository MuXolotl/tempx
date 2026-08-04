package defpackage;

/* JADX INFO: renamed from: lؒۖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1259l implements InterfaceC10634l {
    public final byte[] loadAd;
    public final InterfaceC10634l yandex;

    public C1259l(InterfaceC10634l interfaceC10634l, byte[] bArr) {
        this.yandex = interfaceC10634l;
        this.loadAd = bArr;
    }

    @Override // defpackage.InterfaceC10634l
    public final byte[] yandex(byte[] bArr) {
        byte[] bArr2 = this.loadAd;
        int length = bArr2.length;
        InterfaceC10634l interfaceC10634l = this.yandex;
        return length == 0 ? interfaceC10634l.yandex(bArr) : AbstractC17265l.amazon(bArr2, interfaceC10634l.yandex(bArr));
    }
}

package defpackage;

/* JADX INFO: renamed from: lؙٚٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6568l extends AbstractC18213l implements InterfaceC12774l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC10952l f13718l;

    public AbstractC6568l(InterfaceC10952l interfaceC10952l) {
        this.f13718l = interfaceC10952l;
    }

    public abstract byte loadAd(byte b);

    @Override // defpackage.InterfaceC12774l
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i + i2;
        if (i4 > bArr.length) {
            C10754l.ad("input buffer too small");
            return 0;
        }
        if (i3 + i2 > bArr2.length) {
            C18073l.ad("output buffer too short");
            return 0;
        }
        while (i < i4) {
            bArr2[i3] = loadAd(bArr[i]);
            i3++;
            i++;
        }
        return i2;
    }
}

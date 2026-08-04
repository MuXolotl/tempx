package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: l٘ۙ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C18173l implements InterfaceC12774l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public byte[] f35585l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public byte[] f35586l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public byte f35584l = 0;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public byte[] f35583l = null;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public byte f35582l = 0;

    @Override // defpackage.InterfaceC12774l
    public String getAlgorithmName() {
        return "VMPC";
    }

    @Override // defpackage.InterfaceC12774l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        if (!(interfaceC9719l instanceof C0272l)) {
            C8339l.metrica("VMPC init parameters must include an IV");
            return;
        }
        C0272l c0272l = (C0272l) interfaceC9719l;
        InterfaceC9719l interfaceC9719l2 = c0272l.f1272l;
        if (!(interfaceC9719l2 instanceof C13886l)) {
            C8339l.metrica("VMPC init parameters must include a key");
            return;
        }
        C13886l c13886l = (C13886l) interfaceC9719l2;
        byte[] bArr = c0272l.f1273l;
        this.f35586l = bArr;
        if (bArr == null || bArr.length < 1 || bArr.length > 768) {
            C8339l.metrica("VMPC requires 1 to 768 bytes of IV");
            return;
        }
        byte[] bArr2 = c13886l.f27156l;
        this.f35585l = bArr2;
        yandex(bArr2, bArr);
        int length = this.f35585l.length;
        if (interfaceC9719l instanceof EnumC2441l) {
            C8339l.metrica("params should not be CryptoServicePurpose");
        } else {
            ((C5911l) AbstractC8776l.purchase.get()).getClass();
        }
    }

    @Override // defpackage.InterfaceC12774l
    public final int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i + i2 > bArr.length) {
            C10754l.ad("input buffer too short");
            return 0;
        }
        if (i3 + i2 > bArr2.length) {
            C18073l.ad("output buffer too short");
            return 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            byte[] bArr3 = this.f35583l;
            byte b = this.f35582l;
            byte b2 = this.f35584l;
            int i5 = b2 & 255;
            byte b3 = bArr3[i5];
            byte b4 = bArr3[(b + b3) & 255];
            this.f35582l = b4;
            int i6 = b4 & 255;
            byte b5 = bArr3[i6];
            byte b6 = bArr3[(bArr3[b5 & 255] + 1) & 255];
            bArr3[i5] = b5;
            bArr3[i6] = b3;
            this.f35584l = (byte) ((b2 + 1) & 255);
            bArr2[i4 + i3] = (byte) (bArr[i4 + i] ^ b6);
        }
        return i2;
    }

    @Override // defpackage.InterfaceC12774l
    public final void reset() {
        yandex(this.f35585l, this.f35586l);
    }

    public void yandex(byte[] bArr, byte[] bArr2) {
        this.f35582l = (byte) 0;
        this.f35583l = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i = 0; i < 256; i++) {
            this.f35583l[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            byte[] bArr3 = this.f35583l;
            byte b = this.f35582l;
            int i3 = i2 & 255;
            byte b2 = bArr3[i3];
            byte b3 = bArr3[(b + b2 + bArr[i2 % bArr.length]) & 255];
            this.f35582l = b3;
            bArr3[i3] = bArr3[b3 & 255];
            bArr3[b3 & 255] = b2;
        }
        for (int i4 = 0; i4 < 768; i4++) {
            byte[] bArr4 = this.f35583l;
            byte b4 = this.f35582l;
            int i5 = i4 & 255;
            byte b5 = bArr4[i5];
            byte b6 = bArr4[(b4 + b5 + bArr2[i4 % bArr2.length]) & 255];
            this.f35582l = b6;
            bArr4[i5] = bArr4[b6 & 255];
            bArr4[b6 & 255] = b5;
        }
        this.f35584l = (byte) 0;
    }
}

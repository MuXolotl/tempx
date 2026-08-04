package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٌؚؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7140l extends C18173l {
    @Override // defpackage.C18173l, defpackage.InterfaceC12774l
    public final String getAlgorithmName() {
        return "VMPC-KSA3";
    }

    @Override // defpackage.C18173l
    public final void yandex(byte[] bArr, byte[] bArr2) {
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
        for (int i6 = 0; i6 < 768; i6++) {
            byte[] bArr5 = this.f35583l;
            byte b7 = this.f35582l;
            int i7 = i6 & 255;
            byte b8 = bArr5[i7];
            byte b9 = bArr5[(b7 + b8 + bArr[i6 % bArr.length]) & 255];
            this.f35582l = b9;
            bArr5[i7] = bArr5[b9 & 255];
            bArr5[b9 & 255] = b8;
        }
        this.f35584l = (byte) 0;
    }
}

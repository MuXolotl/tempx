package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٌۧۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9214l implements InterfaceC12774l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public byte[] f18958l = null;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f18957l = 0;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f18956l = 0;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public byte[] f18959l = null;

    public C9214l() {
        ((C5911l) AbstractC8776l.purchase.get()).getClass();
    }

    @Override // defpackage.InterfaceC12774l
    public final String getAlgorithmName() {
        return "RC4";
    }

    @Override // defpackage.InterfaceC12774l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        if (!(interfaceC9719l instanceof C13886l)) {
            C8339l.metrica(AbstractC5020l.subscription("invalid parameter passed to RC4 init - ", interfaceC9719l));
            return;
        }
        byte[] bArr = ((C13886l) interfaceC9719l).f27156l;
        this.f18959l = bArr;
        yandex(bArr);
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
            int i5 = (this.f18957l + 1) & 255;
            this.f18957l = i5;
            byte[] bArr3 = this.f18958l;
            byte b = bArr3[i5];
            int i6 = (this.f18956l + b) & 255;
            this.f18956l = i6;
            bArr3[i5] = bArr3[i6];
            bArr3[i6] = b;
            bArr2[i4 + i3] = (byte) (bArr3[(bArr3[i5] + b) & 255] ^ bArr[i4 + i]);
        }
        return i2;
    }

    @Override // defpackage.InterfaceC12774l
    public final void reset() {
        yandex(this.f18959l);
    }

    public final void yandex(byte[] bArr) {
        this.f18959l = bArr;
        this.f18957l = 0;
        this.f18956l = 0;
        if (this.f18958l == null) {
            this.f18958l = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        }
        for (int i = 0; i < 256; i++) {
            this.f18958l[i] = (byte) i;
        }
        int length = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            int i4 = bArr[length] & 255;
            byte[] bArr2 = this.f18958l;
            byte b = bArr2[i3];
            i2 = (i4 + b + i2) & 255;
            bArr2[i3] = bArr2[i2];
            bArr2[i2] = b;
            length = (length + 1) % bArr.length;
        }
    }
}

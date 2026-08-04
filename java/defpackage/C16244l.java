package defpackage;

import java.security.SecureRandom;

/* JADX INFO: renamed from: lؚٖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16244l extends AbstractC8831l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f31795l;

    public C16244l(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.f31795l = bArr;
        if (bArr.length != 32) {
            C8339l.metrica("k");
            throw null;
        }
        secureRandom.nextBytes(bArr);
        if (bArr.length != 32) {
            C8339l.metrica("k");
            throw null;
        }
        bArr[0] = (byte) (bArr[0] & 248);
        byte b = (byte) (bArr[31] & 127);
        bArr[31] = b;
        bArr[31] = (byte) (b | 64);
    }

    public final C15654l yandex() {
        byte[] bArr = new byte[32];
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        byte[] bArr2 = new byte[32];
        AbstractC13041l.ads(this.f31795l, bArr2);
        C11644l c11644l = new C11644l(14);
        AbstractC13041l.Signature(bArr2, c11644l);
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        AbstractC11397l.applovin((int[]) c11644l.f23358l, iArr4);
        AbstractC11397l.applovin((int[]) c11644l.f23357l, iArr5);
        AbstractC11397l.applovin((int[]) c11644l.f23361l, iArr6);
        AbstractC11397l.Signature(iArr4, iArr5, iArr3);
        AbstractC11397l.appmetrica(iArr4, iArr5, iArr4);
        AbstractC11397l.Signature(iArr4, iArr6, iArr4);
        AbstractC11397l.applovin(iArr6, iArr6);
        AbstractC11397l.Signature(iArr3, AbstractC13041l.admob, iArr3);
        AbstractC11397l.purchase(iArr3, iArr6, iArr3);
        AbstractC11397l.purchase(iArr3, iArr4, iArr3);
        AbstractC11397l.ad(iArr3);
        AbstractC11397l.ad(iArr5);
        AbstractC11397l.ad(iArr6);
        if ((AbstractC11397l.subscription(iArr3) & (~AbstractC11397l.subscription(iArr5)) & (~AbstractC11397l.subscription(iArr6))) == 0) {
            C18073l.admob();
            return null;
        }
        AbstractC11397l.isPro(0, 0, (int[]) c11644l.f23357l, iArr);
        AbstractC11397l.isPro(0, 0, (int[]) c11644l.f23361l, iArr2);
        AbstractC11397l.billing(iArr2, iArr, iArr, iArr2);
        AbstractC11397l.ads(iArr2, iArr2);
        AbstractC11397l.Signature(iArr, iArr2, iArr);
        AbstractC11397l.ad(iArr);
        AbstractC11397l.metrica(0, 0, bArr, iArr);
        AbstractC11397l.metrica(5, 16, bArr, iArr);
        return new C15654l(bArr, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16244l(byte[] bArr) {
        super(true);
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            this.f31795l = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, 32);
            return;
        }
        C8339l.metrica("'buf' must have length 32");
        throw null;
    }
}

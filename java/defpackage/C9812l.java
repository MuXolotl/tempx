package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: lٌٍۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9812l implements InterfaceC13504l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C17548l f19987l = new C17548l(9);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f19988l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f19989l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final SecretKeySpec f19990l;

    public C9812l(byte[] bArr) throws GeneralSecurityException {
        AbstractC4630l.yandex(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f19990l = secretKeySpec;
        if (!AbstractC12589l.pro(1)) {
            C18262l.ads("Can not use AES-CMAC in FIPS-mode.");
            throw null;
        }
        Cipher cipher = (Cipher) f19987l.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrAmazon = AbstractC18323l.amazon(cipher.doFinal(new byte[16]));
        this.f19989l = bArrAmazon;
        this.f19988l = AbstractC18323l.amazon(bArrAmazon);
    }

    @Override // defpackage.InterfaceC13504l
    /* JADX INFO: renamed from: throws */
    public final byte[] mo1221throws(int i, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrFirebase;
        if (i > 16) {
            C18073l.pro("outputLength too large, max is 16 bytes");
            return null;
        }
        if (!AbstractC12589l.pro(1)) {
            C18262l.ads("Can not use AES-CMAC in FIPS-mode.");
            return null;
        }
        Cipher cipher = (Cipher) f19987l.get();
        cipher.init(1, this.f19990l);
        int length = bArr.length;
        int iRemoteconfig = length == 0 ? 1 : AbstractC5020l.remoteconfig(length, 1, 16, 1);
        if (iRemoteconfig * 16 == bArr.length) {
            bArrFirebase = AbstractC17265l.isPro((iRemoteconfig - 1) * 16, 16, bArr, this.f19989l);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iRemoteconfig - 1) * 16, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                C8339l.metrica("x must be smaller than a block.");
                return null;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = -128;
            bArrFirebase = AbstractC17265l.firebase(bArrCopyOf, this.f19988l);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i2 = 0; i2 < iRemoteconfig - 1; i2++) {
            int i3 = i2 * 16;
            for (int i4 = 0; i4 < 16; i4++) {
                bArr3[i4] = (byte) (bArr2[i4] ^ bArr[i4 + i3]);
            }
            if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                C8339l.smaato("Cipher didn't write full block");
                return null;
            }
        }
        for (int i5 = 0; i5 < 16; i5++) {
            bArr3[i5] = (byte) (bArr2[i5] ^ bArrFirebase[i5]);
        }
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return 16 == i ? bArr2 : Arrays.copyOf(bArr2, i);
        }
        C8339l.smaato("Cipher didn't write full block");
        return null;
    }
}

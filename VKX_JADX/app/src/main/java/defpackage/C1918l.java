package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: lؓ٘ۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1918l implements InterfaceC13883l {
    public final Object crashlytics;
    public final Object loadAd;
    public final /* synthetic */ int yandex;

    public C1918l(byte[] bArr, int i, byte[] bArr2) {
        this.yandex = i;
        switch (i) {
            case 4:
                this.crashlytics = new C10018l(bArr, 1);
                this.loadAd = bArr2;
                break;
            default:
                this.crashlytics = new C10018l(bArr, 0);
                this.loadAd = bArr2;
                break;
        }
    }

    public byte[] amazon(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 40) {
            C18262l.ads("ciphertext too short");
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 24);
        return ((C10018l) this.crashlytics).m4260l(ByteBuffer.wrap(bArr, 24, bArr.length - 24), bArrCopyOf, bArr2);
    }

    public byte[] crashlytics(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            C18262l.ads("ciphertext too short");
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        return ((C10018l) this.crashlytics).m4260l(ByteBuffer.wrap(bArr, 12, bArr.length - 12), bArrCopyOf, bArr2);
    }

    @Override // defpackage.InterfaceC13883l
    public final byte[] loadAd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = this.yandex;
        Object obj = this.crashlytics;
        Object obj2 = this.loadAd;
        byte[] bArrLoadAd = null;
        switch (i) {
            case 0:
                byte[] bArr3 = (byte[]) obj2;
                if (bArr == null) {
                    C6541l.subs("ciphertext is null");
                    return null;
                }
                if (bArr.length < bArr3.length + 28) {
                    C18262l.ads("ciphertext too short");
                    return null;
                }
                if (!AbstractC0647l.yandex(bArr3, bArr)) {
                    C18262l.ads("Decryption failed (OutputPrefix mismatch).");
                    return null;
                }
                AlgorithmParameterSpec algorithmParameterSpecYandex = AbstractC1606l.yandex(bArr3.length, 12, bArr);
                Cipher cipherCrashlytics = AbstractC1606l.crashlytics();
                cipherCrashlytics.init(2, (SecretKeySpec) obj, algorithmParameterSpecYandex);
                if (bArr2 != null && bArr2.length != 0) {
                    cipherCrashlytics.updateAAD(bArr2);
                }
                return cipherCrashlytics.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
            case 1:
                byte[] bArr4 = (byte[]) obj2;
                if (bArr4.length == 0) {
                    return crashlytics(bArr, bArr2);
                }
                if (AbstractC0647l.yandex(bArr4, bArr)) {
                    return crashlytics(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
                }
                C18262l.ads("Decryption failed (OutputPrefix mismatch).");
                return null;
            case 2:
                InterfaceC13883l interfaceC13883l = (InterfaceC13883l) obj;
                byte[] bArr5 = (byte[]) obj2;
                if (bArr5.length == 0) {
                    return interfaceC13883l.loadAd(bArr, bArr2);
                }
                if (AbstractC0647l.yandex(bArr5, bArr)) {
                    return interfaceC13883l.loadAd(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
                }
                C18262l.ads("wrong prefix");
                return null;
            case 3:
                Iterator it = ((C2308l) obj2).yandex(bArr).iterator();
                while (it.hasNext()) {
                    try {
                        bArrLoadAd = ((C8492l) it.next()).yandex.loadAd(bArr, bArr2);
                        return bArrLoadAd;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                C18262l.ads("decryption failed");
                return bArrLoadAd;
            default:
                byte[] bArr6 = (byte[]) obj2;
                if (bArr6.length == 0) {
                    return amazon(bArr, bArr2);
                }
                if (AbstractC0647l.yandex(bArr6, bArr)) {
                    return amazon(Arrays.copyOfRange(bArr, bArr6.length, bArr.length), bArr2);
                }
                C18262l.ads("Decryption failed (OutputPrefix mismatch).");
                return null;
        }
    }

    @Override // defpackage.InterfaceC13883l
    public final byte[] yandex(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = this.yandex;
        Object obj = this.loadAd;
        Object obj2 = this.crashlytics;
        switch (i) {
            case 0:
                byte[] bArr3 = (byte[]) obj;
                if (bArr == null) {
                    C6541l.subs("plaintext is null");
                    return null;
                }
                byte[] bArrYandex = AbstractC14640l.yandex(12);
                AlgorithmParameterSpec algorithmParameterSpecYandex = AbstractC1606l.yandex(0, bArrYandex.length, bArrYandex);
                Cipher cipherCrashlytics = AbstractC1606l.crashlytics();
                cipherCrashlytics.init(1, (SecretKeySpec) obj2, algorithmParameterSpecYandex);
                if (bArr2 != null && bArr2.length != 0) {
                    cipherCrashlytics.updateAAD(bArr2);
                }
                int outputSize = cipherCrashlytics.getOutputSize(bArr.length);
                if (outputSize > 2147483635 - bArr3.length) {
                    C18262l.ads("plaintext too long");
                    return null;
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
                System.arraycopy(bArrYandex, 0, bArrCopyOf, bArr3.length, 12);
                if (cipherCrashlytics.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr3.length + 12) == outputSize) {
                    return bArrCopyOf;
                }
                C18262l.ads("not enough data written");
                return null;
            case 1:
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] bArrYandex2 = AbstractC14640l.yandex(12);
                byteBufferAllocate.put(bArrYandex2);
                ((C10018l) obj2).m4262l(byteBufferAllocate, bArrYandex2, bArr, bArr2);
                byte[] bArrArray = byteBufferAllocate.array();
                byte[] bArr4 = (byte[]) obj;
                return bArr4.length == 0 ? bArrArray : AbstractC17265l.amazon(bArr4, bArrArray);
            case 2:
                byte[] bArr5 = (byte[]) obj;
                InterfaceC13883l interfaceC13883l = (InterfaceC13883l) obj2;
                return bArr5.length == 0 ? interfaceC13883l.yandex(bArr, bArr2) : AbstractC17265l.amazon(bArr5, interfaceC13883l.yandex(bArr, bArr2));
            case 3:
                byte[] bArrYandex3 = ((C8492l) obj2).yandex.yandex(bArr, bArr2);
                int length = bArr.length;
                return bArrYandex3;
            default:
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] bArrYandex4 = AbstractC14640l.yandex(24);
                byteBufferAllocate2.put(bArrYandex4);
                ((C10018l) obj2).m4262l(byteBufferAllocate2, bArrYandex4, bArr, bArr2);
                byte[] bArrArray2 = byteBufferAllocate2.array();
                byte[] bArr6 = (byte[]) obj;
                return bArr6.length == 0 ? bArrArray2 : AbstractC17265l.amazon(bArr6, bArrArray2);
        }
    }

    public C1918l(byte[] bArr, C0346l c0346l) throws GeneralSecurityException {
        this.yandex = 0;
        if (AbstractC12589l.ad(2)) {
            this.crashlytics = AbstractC1606l.loadAd(bArr);
            this.loadAd = c0346l.loadAd();
        } else {
            C18262l.ads("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
    }

    public C1918l(InterfaceC13883l interfaceC13883l, byte[] bArr) {
        this.yandex = 2;
        this.crashlytics = interfaceC13883l;
        if (bArr.length != 0 && bArr.length != 5) {
            C8339l.metrica("identifier has an invalid length");
            throw null;
        }
        this.loadAd = bArr;
    }

    public C1918l(C8492l c8492l, C2308l c2308l) {
        this.yandex = 3;
        this.crashlytics = c8492l;
        this.loadAd = c2308l;
    }
}

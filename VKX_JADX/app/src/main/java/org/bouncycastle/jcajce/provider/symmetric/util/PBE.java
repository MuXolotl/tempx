package org.bouncycastle.jcajce.provider.symmetric.util;

import defpackage.AbstractC11186l;
import defpackage.AbstractC12994l;
import defpackage.AbstractC14715l;
import defpackage.AbstractC14832l;
import defpackage.C0272l;
import defpackage.C0655l;
import defpackage.C0709l;
import defpackage.C0987l;
import defpackage.C10032l;
import defpackage.C13886l;
import defpackage.C15587l;
import defpackage.C17695l;
import defpackage.C17711l;
import defpackage.C18073l;
import defpackage.C18567l;
import defpackage.C2230l;
import defpackage.C2657l;
import defpackage.C3077l;
import defpackage.C4604l;
import defpackage.C4871l;
import defpackage.C5153l;
import defpackage.C8094l;
import defpackage.C8339l;
import defpackage.C9102l;
import defpackage.EnumC2441l;
import defpackage.InterfaceC9719l;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public interface PBE {
    public static final int GOST3411 = 6;
    public static final int MD2 = 5;
    public static final int MD5 = 0;
    public static final int OPENSSL = 3;
    public static final int PKCS12 = 2;
    public static final int PKCS5S1 = 0;
    public static final int PKCS5S1_UTF8 = 4;
    public static final int PKCS5S2 = 1;
    public static final int PKCS5S2_UTF8 = 5;
    public static final int RIPEMD160 = 2;
    public static final int SHA1 = 1;
    public static final int SHA224 = 7;
    public static final int SHA256 = 4;
    public static final int SHA384 = 8;
    public static final int SHA3_224 = 10;
    public static final int SHA3_256 = 11;
    public static final int SHA3_384 = 12;
    public static final int SHA3_512 = 13;
    public static final int SHA512 = 9;
    public static final int SHA512_224 = 15;
    public static final int SHA512_256 = 16;
    public static final int SM3 = 14;
    public static final int TIGER = 3;

    public static class Util {
        private static byte[] convertPassword(int i, PBEKeySpec pBEKeySpec) {
            if (i == 2) {
                return AbstractC11186l.PKCS12PasswordToBytes(pBEKeySpec.getPassword());
            }
            return (i == 5 || i == 4) ? AbstractC11186l.PKCS5PasswordToUTF8Bytes(pBEKeySpec.getPassword()) : AbstractC11186l.PKCS5PasswordToBytes(pBEKeySpec.getPassword());
        }

        private static AbstractC11186l makePBEGenerator(int i, int i2) {
            if (i == 0 || i == 4) {
                if (i2 == 0) {
                    int i3 = AbstractC14832l.yandex;
                    return new C2230l(new C3077l());
                }
                if (i2 == 1) {
                    int i4 = AbstractC14832l.yandex;
                    return new C2230l(new C0655l());
                }
                if (i2 == 5) {
                    return new C2230l(new C15587l());
                }
                C8339l.smaato("PKCS5 scheme 1 only supports MD2, MD5 and SHA1.");
                return null;
            }
            EnumC2441l enumC2441l = EnumC2441l.f5220l;
            if (i != 1 && i != 5) {
                if (i != 2) {
                    return new C2230l();
                }
                switch (i2) {
                    case 0:
                        int i5 = AbstractC14832l.yandex;
                        return new C0987l(new C3077l());
                    case 1:
                        int i6 = AbstractC14832l.yandex;
                        return new C0987l(new C0655l(enumC2441l));
                    case 2:
                        return new C0987l(new C4871l(enumC2441l));
                    case 3:
                        return new C0987l(new C17695l(enumC2441l));
                    case 4:
                        int i7 = AbstractC14832l.yandex;
                        return new C0987l(new C2657l(enumC2441l));
                    case 5:
                        return new C0987l(new C15587l(enumC2441l));
                    case 6:
                        return new C0987l(new C18567l(enumC2441l));
                    case 7:
                        int i8 = AbstractC14832l.yandex;
                        return new C0987l(new C9102l(enumC2441l));
                    case 8:
                        int i9 = AbstractC14832l.yandex;
                        return new C0987l(new C5153l(enumC2441l));
                    case 9:
                        int i10 = AbstractC14832l.yandex;
                        return new C0987l(new C17711l(enumC2441l));
                    default:
                        C8339l.smaato("unknown digest scheme for PBE encryption.");
                        return null;
                }
            }
            switch (i2) {
                case 0:
                    int i11 = AbstractC14832l.yandex;
                    return new C8094l(new C3077l());
                case 1:
                    int i12 = AbstractC14832l.yandex;
                    return new C8094l(new C0655l(enumC2441l));
                case 2:
                    return new C8094l(new C4871l(enumC2441l));
                case 3:
                    return new C8094l(new C17695l(enumC2441l));
                case 4:
                    int i13 = AbstractC14832l.yandex;
                    return new C8094l(new C2657l(enumC2441l));
                case 5:
                    return new C8094l(new C15587l(enumC2441l));
                case 6:
                    return new C8094l(new C18567l(enumC2441l));
                case 7:
                    int i14 = AbstractC14832l.yandex;
                    return new C8094l(new C9102l(enumC2441l));
                case 8:
                    int i15 = AbstractC14832l.yandex;
                    return new C8094l(new C5153l(enumC2441l));
                case 9:
                    int i16 = AbstractC14832l.yandex;
                    return new C8094l(new C17711l(enumC2441l));
                case 10:
                    int i17 = AbstractC14832l.yandex;
                    return new C8094l(new C4604l(224, 0));
                case 11:
                    int i18 = AbstractC14832l.yandex;
                    return new C8094l(new C4604l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 0));
                case 12:
                    int i19 = AbstractC14832l.yandex;
                    return new C8094l(new C4604l(384, 0));
                case 13:
                    int i20 = AbstractC14832l.yandex;
                    return new C8094l(new C4604l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, 0));
                case 14:
                    return new C8094l(new C0709l(enumC2441l));
                case 15:
                    int i21 = AbstractC14832l.yandex;
                    return new C8094l(new C10032l(224, 0));
                case 16:
                    int i22 = AbstractC14832l.yandex;
                    return new C8094l(new C10032l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 0));
                default:
                    C8339l.smaato("unknown digest scheme for PBE PKCS5S2 encryption.");
                    return null;
            }
        }

        public static InterfaceC9719l makePBEMacParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                C8339l.metrica("Need a PBEParameter spec with a PBE key.");
                return null;
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            AbstractC11186l abstractC11186lMakePBEGenerator = makePBEGenerator(bCPBEKey.getType(), bCPBEKey.getDigest());
            abstractC11186lMakePBEGenerator.init(bCPBEKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            return abstractC11186lMakePBEGenerator.generateDerivedMacParameters(bCPBEKey.getKeySize());
        }

        public static InterfaceC9719l makePBEParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, String str) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                C8339l.metrica("Need a PBEParameter spec with a PBE key.");
                return null;
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            AbstractC11186l abstractC11186lMakePBEGenerator = makePBEGenerator(bCPBEKey.getType(), bCPBEKey.getDigest());
            byte[] encoded = bCPBEKey.getEncoded();
            if (bCPBEKey.shouldTryWrongPKCS12()) {
                encoded = new byte[2];
            }
            abstractC11186lMakePBEGenerator.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            InterfaceC9719l interfaceC9719lGenerateDerivedParameters = bCPBEKey.getIvSize() != 0 ? abstractC11186lMakePBEGenerator.generateDerivedParameters(bCPBEKey.getKeySize(), bCPBEKey.getIvSize()) : abstractC11186lMakePBEGenerator.generateDerivedParameters(bCPBEKey.getKeySize());
            if (str.startsWith("DES")) {
                if (interfaceC9719lGenerateDerivedParameters instanceof C0272l) {
                    AbstractC14715l.crashlytics(((C13886l) ((C0272l) interfaceC9719lGenerateDerivedParameters).f1272l).f27156l);
                    return interfaceC9719lGenerateDerivedParameters;
                }
                AbstractC14715l.crashlytics(((C13886l) interfaceC9719lGenerateDerivedParameters).f27156l);
            }
            return interfaceC9719lGenerateDerivedParameters;
        }

        public static InterfaceC9719l makePBEMacParameters(PBEKeySpec pBEKeySpec, int i, int i2, int i3) {
            AbstractC11186l abstractC11186lMakePBEGenerator = makePBEGenerator(i, i2);
            byte[] bArrConvertPassword = convertPassword(i, pBEKeySpec);
            abstractC11186lMakePBEGenerator.init(bArrConvertPassword, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            InterfaceC9719l interfaceC9719lGenerateDerivedMacParameters = abstractC11186lMakePBEGenerator.generateDerivedMacParameters(i3);
            for (int i4 = 0; i4 != bArrConvertPassword.length; i4++) {
                bArrConvertPassword[i4] = 0;
            }
            return interfaceC9719lGenerateDerivedMacParameters;
        }

        public static InterfaceC9719l makePBEMacParameters(SecretKey secretKey, int i, int i2, int i3, PBEParameterSpec pBEParameterSpec) {
            AbstractC11186l abstractC11186lMakePBEGenerator = makePBEGenerator(i, i2);
            byte[] encoded = secretKey.getEncoded();
            abstractC11186lMakePBEGenerator.init(secretKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            InterfaceC9719l interfaceC9719lGenerateDerivedMacParameters = abstractC11186lMakePBEGenerator.generateDerivedMacParameters(i3);
            for (int i4 = 0; i4 != encoded.length; i4++) {
                encoded[i4] = 0;
            }
            return interfaceC9719lGenerateDerivedMacParameters;
        }

        public static InterfaceC9719l makePBEParameters(PBEKeySpec pBEKeySpec, int i, int i2, int i3, int i4) {
            AbstractC11186l abstractC11186lMakePBEGenerator = makePBEGenerator(i, i2);
            byte[] bArrConvertPassword = convertPassword(i, pBEKeySpec);
            abstractC11186lMakePBEGenerator.init(bArrConvertPassword, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            InterfaceC9719l interfaceC9719lGenerateDerivedParameters = i4 != 0 ? abstractC11186lMakePBEGenerator.generateDerivedParameters(i3, i4) : abstractC11186lMakePBEGenerator.generateDerivedParameters(i3);
            for (int i5 = 0; i5 != bArrConvertPassword.length; i5++) {
                bArrConvertPassword[i5] = 0;
            }
            return interfaceC9719lGenerateDerivedParameters;
        }

        public static InterfaceC9719l makePBEParameters(byte[] bArr, int i, int i2, int i3, int i4, AlgorithmParameterSpec algorithmParameterSpec, String str) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                C18073l.pro("Need a PBEParameter spec with a PBE key.");
                return null;
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            AbstractC11186l abstractC11186lMakePBEGenerator = makePBEGenerator(i, i2);
            abstractC11186lMakePBEGenerator.init(bArr, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            InterfaceC9719l interfaceC9719lGenerateDerivedParameters = i4 != 0 ? abstractC11186lMakePBEGenerator.generateDerivedParameters(i3, i4) : abstractC11186lMakePBEGenerator.generateDerivedParameters(i3);
            if (str.startsWith("DES")) {
                if (interfaceC9719lGenerateDerivedParameters instanceof C0272l) {
                    AbstractC14715l.crashlytics(((C13886l) ((C0272l) interfaceC9719lGenerateDerivedParameters).f1272l).f27156l);
                    return interfaceC9719lGenerateDerivedParameters;
                }
                AbstractC14715l.crashlytics(((C13886l) interfaceC9719lGenerateDerivedParameters).f27156l);
            }
            return interfaceC9719lGenerateDerivedParameters;
        }
    }
}

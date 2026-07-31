package org.bouncycastle.jce.provider;

import defpackage.AbstractC11186l;
import defpackage.AbstractC14832l;
import defpackage.C0272l;
import defpackage.C0655l;
import defpackage.C0987l;
import defpackage.C13886l;
import defpackage.C2230l;
import defpackage.C3077l;
import defpackage.C4871l;
import defpackage.C8094l;
import defpackage.C8339l;
import defpackage.InterfaceC9719l;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;

/* JADX INFO: loaded from: classes3.dex */
public interface BrokenPBE {
    public static final int MD5 = 0;
    public static final int OLD_PKCS12 = 3;
    public static final int PKCS12 = 2;
    public static final int PKCS5S1 = 0;
    public static final int PKCS5S2 = 1;
    public static final int RIPEMD160 = 2;
    public static final int SHA1 = 1;

    public static class Util {
        private static AbstractC11186l makePBEGenerator(int i, int i2) {
            if (i == 0) {
                if (i2 == 0) {
                    return new C2230l(new C3077l());
                }
                if (i2 == 1) {
                    return new C2230l(new C0655l());
                }
                C8339l.smaato("PKCS5 scheme 1 only supports only MD5 and SHA1.");
                return null;
            }
            if (i == 1) {
                int i3 = AbstractC14832l.yandex;
                return new C8094l(new C0655l());
            }
            if (i == 3) {
                if (i2 == 0) {
                    return new OldPKCS12ParametersGenerator(new C3077l());
                }
                if (i2 == 1) {
                    return new OldPKCS12ParametersGenerator(new C0655l());
                }
                if (i2 == 2) {
                    return new OldPKCS12ParametersGenerator(new C4871l());
                }
                C8339l.smaato("unknown digest scheme for PBE encryption.");
                return null;
            }
            if (i2 == 0) {
                return new C0987l(new C3077l());
            }
            if (i2 == 1) {
                return new C0987l(new C0655l());
            }
            if (i2 == 2) {
                return new C0987l(new C4871l());
            }
            C8339l.smaato("unknown digest scheme for PBE encryption.");
            return null;
        }

        public static InterfaceC9719l makePBEMacParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, int i, int i2, int i3) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                C8339l.metrica("Need a PBEParameter spec with a PBE key.");
                return null;
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            AbstractC11186l abstractC11186lMakePBEGenerator = makePBEGenerator(i, i2);
            byte[] encoded = bCPBEKey.getEncoded();
            abstractC11186lMakePBEGenerator.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            InterfaceC9719l interfaceC9719lGenerateDerivedMacParameters = abstractC11186lMakePBEGenerator.generateDerivedMacParameters(i3);
            for (int i4 = 0; i4 != encoded.length; i4++) {
                encoded[i4] = 0;
            }
            return interfaceC9719lGenerateDerivedMacParameters;
        }

        public static InterfaceC9719l makePBEParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, int i, int i2, String str, int i3, int i4) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                C8339l.metrica("Need a PBEParameter spec with a PBE key.");
                return null;
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            AbstractC11186l abstractC11186lMakePBEGenerator = makePBEGenerator(i, i2);
            byte[] encoded = bCPBEKey.getEncoded();
            abstractC11186lMakePBEGenerator.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            InterfaceC9719l interfaceC9719lGenerateDerivedParameters = i4 != 0 ? abstractC11186lMakePBEGenerator.generateDerivedParameters(i3, i4) : abstractC11186lMakePBEGenerator.generateDerivedParameters(i3);
            if (str.startsWith("DES")) {
                if (interfaceC9719lGenerateDerivedParameters instanceof C0272l) {
                    setOddParity(((C13886l) ((C0272l) interfaceC9719lGenerateDerivedParameters).f1272l).f27156l);
                } else {
                    setOddParity(((C13886l) interfaceC9719lGenerateDerivedParameters).f27156l);
                }
            }
            for (int i5 = 0; i5 != encoded.length; i5++) {
                encoded[i5] = 0;
            }
            return interfaceC9719lGenerateDerivedParameters;
        }

        private static void setOddParity(byte[] bArr) {
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                bArr[i] = (byte) ((((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) | (b & 254));
            }
        }
    }
}

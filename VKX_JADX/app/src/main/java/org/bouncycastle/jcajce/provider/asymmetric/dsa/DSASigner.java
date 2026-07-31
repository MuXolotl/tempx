package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import defpackage.AbstractC14832l;
import defpackage.AbstractC8831l;
import defpackage.C0554l;
import defpackage.C0655l;
import defpackage.C12014l;
import defpackage.C17711l;
import defpackage.C18725l;
import defpackage.C2657l;
import defpackage.C4871l;
import defpackage.C5153l;
import defpackage.C6080l;
import defpackage.C6114l;
import defpackage.C6928l;
import defpackage.C9102l;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC11795l;
import defpackage.InterfaceC15270l;
import defpackage.InterfaceC16922l;
import defpackage.InterfaceC18049l;
import defpackage.InterfaceC9719l;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public class DSASigner extends SignatureSpi implements InterfaceC0543l, InterfaceC18049l {
    private InterfaceC16922l digest;
    private InterfaceC15270l encoding = C6928l.f14515l;
    private SecureRandom random;
    private InterfaceC11795l signer;

    public static class detDSA extends DSASigner {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public detDSA() {
            super(new C0655l(), new C0554l(new C12014l(new C0655l())));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class detDSA224 extends DSASigner {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public detDSA224() {
            super(new C9102l(), new C0554l(new C12014l(new C9102l())));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class detDSA256 extends DSASigner {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public detDSA256() {
            super(new C2657l(), new C0554l(new C12014l(new C2657l())));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class detDSA384 extends DSASigner {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public detDSA384() {
            super(new C5153l(), new C0554l(new C12014l(new C5153l())));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class detDSA512 extends DSASigner {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public detDSA512() {
            super(new C17711l(), new C0554l(new C12014l(new C17711l())));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class detDSASha3_224 extends DSASigner {
        public detDSASha3_224() {
            super(AbstractC14832l.yandex(), new C0554l(new C12014l(AbstractC14832l.yandex())));
        }
    }

    public static class detDSASha3_256 extends DSASigner {
        public detDSASha3_256() {
            super(AbstractC14832l.loadAd(), new C0554l(new C12014l(AbstractC14832l.loadAd())));
        }
    }

    public static class detDSASha3_384 extends DSASigner {
        public detDSASha3_384() {
            super(AbstractC14832l.crashlytics(), new C0554l(new C12014l(AbstractC14832l.crashlytics())));
        }
    }

    public static class detDSASha3_512 extends DSASigner {
        public detDSASha3_512() {
            super(AbstractC14832l.amazon(), new C0554l(new C12014l(AbstractC14832l.amazon())));
        }
    }

    public static class dsa224 extends DSASigner {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dsa224() {
            super(new C9102l(), new C0554l(12));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class dsa256 extends DSASigner {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dsa256() {
            super(new C2657l(), new C0554l(12));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class dsa384 extends DSASigner {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dsa384() {
            super(new C5153l(), new C0554l(12));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class dsa512 extends DSASigner {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dsa512() {
            super(new C17711l(), new C0554l(12));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class dsaRMD160 extends DSASigner {
        public dsaRMD160() {
            super(new C4871l(), new C0554l(12));
        }
    }

    public static class dsaSha3_224 extends DSASigner {
        public dsaSha3_224() {
            super(AbstractC14832l.yandex(), new C0554l(12));
        }
    }

    public static class dsaSha3_256 extends DSASigner {
        public dsaSha3_256() {
            super(AbstractC14832l.loadAd(), new C0554l(12));
        }
    }

    public static class dsaSha3_384 extends DSASigner {
        public dsaSha3_384() {
            super(AbstractC14832l.crashlytics(), new C0554l(12));
        }
    }

    public static class dsaSha3_512 extends DSASigner {
        public dsaSha3_512() {
            super(AbstractC14832l.amazon(), new C0554l(12));
        }
    }

    public static class noneDSA extends DSASigner {
        public noneDSA() {
            super(new C6080l(), new C0554l(12));
        }
    }

    public static class stdDSA extends DSASigner {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public stdDSA() {
            super(new C0655l(), new C0554l(12));
            int i = AbstractC14832l.yandex;
        }
    }

    public DSASigner(InterfaceC16922l interfaceC16922l, InterfaceC11795l interfaceC11795l) {
        this.digest = interfaceC16922l;
        this.signer = interfaceC11795l;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        InterfaceC9719l interfaceC9719lGeneratePrivateKeyParameter = DSAUtil.generatePrivateKeyParameter(privateKey);
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            interfaceC9719lGeneratePrivateKeyParameter = new C6114l(interfaceC9719lGeneratePrivateKeyParameter, secureRandom);
        }
        this.digest.reset();
        this.signer.init(true, interfaceC9719lGeneratePrivateKeyParameter);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        AbstractC8831l abstractC8831lGeneratePublicKeyParameter = DSAUtil.generatePublicKeyParameter(publicKey);
        this.digest.reset();
        this.signer.init(false, abstractC8831lGeneratePublicKeyParameter);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        try {
            BigInteger[] bigIntegerArrCrashlytics = this.signer.crashlytics(bArr);
            return this.encoding.admob(this.signer.getOrder(), bigIntegerArrCrashlytics[0], bigIntegerArrCrashlytics[1]);
        } catch (Exception e) {
            C18725l.mopub(e);
            return null;
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) {
        this.digest.update(b);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        try {
            BigInteger[] bigIntegerArrYandex = this.encoding.yandex(this.signer.getOrder(), bArr);
            return this.signer.admob(bigIntegerArrYandex[0], bigIntegerArrYandex[1], bArr2);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.random = secureRandom;
        engineInitSign(privateKey);
    }
}

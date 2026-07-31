package org.bouncycastle.jcajce.provider.asymmetric.dh;

import defpackage.AbstractC14832l;
import defpackage.AbstractC16784l;
import defpackage.AbstractC4347l;
import defpackage.AbstractC9101l;
import defpackage.C0045l;
import defpackage.C0655l;
import defpackage.C11974l;
import defpackage.C12029l;
import defpackage.C13757l;
import defpackage.C14063l;
import defpackage.C17219l;
import defpackage.C17711l;
import defpackage.C18073l;
import defpackage.C2215l;
import defpackage.C2396l;
import defpackage.C2657l;
import defpackage.C5153l;
import defpackage.C7438l;
import defpackage.C8339l;
import defpackage.C9102l;
import defpackage.InterfaceC16922l;
import defpackage.InterfaceC3481l;
import defpackage.InterfaceC6152l;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;

/* JADX INFO: loaded from: classes3.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private AbstractC4347l dheParameters;
    private BigInteger g;
    private final InterfaceC3481l mqvAgreement;
    private AbstractC9101l mqvParameters;
    private BigInteger p;
    private byte[] result;
    private final C13757l unifiedAgreement;
    private BigInteger x;

    public static class DHUwithSHA1CKDF extends KeyAgreementSpi {
        public DHUwithSHA1CKDF() {
            C13757l c13757l = new C13757l();
            int i = AbstractC14832l.yandex;
            super("DHUwithSHA1CKDF", c13757l, new C17219l(new C0655l()));
        }
    }

    public static class DHUwithSHA1KDF extends KeyAgreementSpi {
        public DHUwithSHA1KDF() {
            C13757l c13757l = new C13757l();
            int i = AbstractC14832l.yandex;
            super("DHUwithSHA1KDF", c13757l, new C0045l(new C0655l()));
        }
    }

    public static class DHUwithSHA224CKDF extends KeyAgreementSpi {
        public DHUwithSHA224CKDF() {
            C13757l c13757l = new C13757l();
            int i = AbstractC14832l.yandex;
            super("DHUwithSHA224CKDF", c13757l, new C17219l(new C9102l()));
        }
    }

    public static class DHUwithSHA224KDF extends KeyAgreementSpi {
        public DHUwithSHA224KDF() {
            C13757l c13757l = new C13757l();
            int i = AbstractC14832l.yandex;
            super("DHUwithSHA224KDF", c13757l, new C0045l(new C9102l()));
        }
    }

    public static class DHUwithSHA256CKDF extends KeyAgreementSpi {
        public DHUwithSHA256CKDF() {
            C13757l c13757l = new C13757l();
            int i = AbstractC14832l.yandex;
            super("DHUwithSHA256CKDF", c13757l, new C17219l(new C2657l()));
        }
    }

    public static class DHUwithSHA256KDF extends KeyAgreementSpi {
        public DHUwithSHA256KDF() {
            C13757l c13757l = new C13757l();
            int i = AbstractC14832l.yandex;
            super("DHUwithSHA256KDF", c13757l, new C0045l(new C2657l()));
        }
    }

    public static class DHUwithSHA384CKDF extends KeyAgreementSpi {
        public DHUwithSHA384CKDF() {
            C13757l c13757l = new C13757l();
            int i = AbstractC14832l.yandex;
            super("DHUwithSHA384CKDF", c13757l, new C17219l((InterfaceC16922l) new C5153l()));
        }
    }

    public static class DHUwithSHA384KDF extends KeyAgreementSpi {
        public DHUwithSHA384KDF() {
            C13757l c13757l = new C13757l();
            int i = AbstractC14832l.yandex;
            super("DHUwithSHA384KDF", c13757l, new C0045l(new C5153l()));
        }
    }

    public static class DHUwithSHA512CKDF extends KeyAgreementSpi {
        public DHUwithSHA512CKDF() {
            C13757l c13757l = new C13757l();
            int i = AbstractC14832l.yandex;
            super("DHUwithSHA512CKDF", c13757l, new C17219l((InterfaceC16922l) new C17711l()));
        }
    }

    public static class DHUwithSHA512KDF extends KeyAgreementSpi {
        public DHUwithSHA512KDF() {
            C13757l c13757l = new C13757l();
            int i = AbstractC14832l.yandex;
            super("DHUwithSHA512KDF", c13757l, new C0045l(new C17711l()));
        }
    }

    public static class DHwithRFC2631KDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DHwithRFC2631KDF() {
            super("DHwithRFC2631KDF", new C11974l(new C0655l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class DHwithSHA1CKDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DHwithSHA1CKDF() {
            super("DHwithSHA1CKDF", new C17219l(new C0655l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class DHwithSHA1KDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DHwithSHA1KDF() {
            super("DHwithSHA1CKDF", new C0045l(new C0655l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class DHwithSHA224CKDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DHwithSHA224CKDF() {
            super("DHwithSHA224CKDF", new C17219l(new C9102l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class DHwithSHA224KDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DHwithSHA224KDF() {
            super("DHwithSHA224CKDF", new C0045l(new C9102l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class DHwithSHA256CKDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DHwithSHA256CKDF() {
            super("DHwithSHA256CKDF", new C17219l(new C2657l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class DHwithSHA256KDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DHwithSHA256KDF() {
            super("DHwithSHA256CKDF", new C0045l(new C2657l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class DHwithSHA384CKDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DHwithSHA384CKDF() {
            super("DHwithSHA384CKDF", new C17219l((InterfaceC16922l) new C5153l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class DHwithSHA384KDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DHwithSHA384KDF() {
            super("DHwithSHA384KDF", new C0045l(new C5153l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class DHwithSHA512CKDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DHwithSHA512CKDF() {
            super("DHwithSHA512CKDF", new C17219l((InterfaceC16922l) new C17711l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class DHwithSHA512KDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DHwithSHA512KDF() {
            super("DHwithSHA512KDF", new C0045l(new C17711l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class MQVwithSHA1CKDF extends KeyAgreementSpi {
        public MQVwithSHA1CKDF() {
            C2215l c2215l = new C2215l();
            int i = AbstractC14832l.yandex;
            super("MQVwithSHA1CKDF", c2215l, new C17219l(new C0655l()));
        }
    }

    public static class MQVwithSHA1KDF extends KeyAgreementSpi {
        public MQVwithSHA1KDF() {
            C2215l c2215l = new C2215l();
            int i = AbstractC14832l.yandex;
            super("MQVwithSHA1KDF", c2215l, new C0045l(new C0655l()));
        }
    }

    public static class MQVwithSHA224CKDF extends KeyAgreementSpi {
        public MQVwithSHA224CKDF() {
            C2215l c2215l = new C2215l();
            int i = AbstractC14832l.yandex;
            super("MQVwithSHA224CKDF", c2215l, new C17219l(new C9102l()));
        }
    }

    public static class MQVwithSHA224KDF extends KeyAgreementSpi {
        public MQVwithSHA224KDF() {
            C2215l c2215l = new C2215l();
            int i = AbstractC14832l.yandex;
            super("MQVwithSHA224KDF", c2215l, new C0045l(new C9102l()));
        }
    }

    public static class MQVwithSHA256CKDF extends KeyAgreementSpi {
        public MQVwithSHA256CKDF() {
            C2215l c2215l = new C2215l();
            int i = AbstractC14832l.yandex;
            super("MQVwithSHA256CKDF", c2215l, new C17219l(new C2657l()));
        }
    }

    public static class MQVwithSHA256KDF extends KeyAgreementSpi {
        public MQVwithSHA256KDF() {
            C2215l c2215l = new C2215l();
            int i = AbstractC14832l.yandex;
            super("MQVwithSHA256KDF", c2215l, new C0045l(new C2657l()));
        }
    }

    public static class MQVwithSHA384CKDF extends KeyAgreementSpi {
        public MQVwithSHA384CKDF() {
            C2215l c2215l = new C2215l();
            int i = AbstractC14832l.yandex;
            super("MQVwithSHA384CKDF", c2215l, new C17219l((InterfaceC16922l) new C5153l()));
        }
    }

    public static class MQVwithSHA384KDF extends KeyAgreementSpi {
        public MQVwithSHA384KDF() {
            C2215l c2215l = new C2215l();
            int i = AbstractC14832l.yandex;
            super("MQVwithSHA384KDF", c2215l, new C0045l(new C5153l()));
        }
    }

    public static class MQVwithSHA512CKDF extends KeyAgreementSpi {
        public MQVwithSHA512CKDF() {
            C2215l c2215l = new C2215l();
            int i = AbstractC14832l.yandex;
            super("MQVwithSHA512CKDF", c2215l, new C17219l((InterfaceC16922l) new C17711l()));
        }
    }

    public static class MQVwithSHA512KDF extends KeyAgreementSpi {
        public MQVwithSHA512KDF() {
            C2215l c2215l = new C2215l();
            int i = AbstractC14832l.yandex;
            super("MQVwithSHA512KDF", c2215l, new C0045l(new C17711l()));
        }
    }

    public KeyAgreementSpi(String str, InterfaceC3481l interfaceC3481l, InterfaceC6152l interfaceC6152l) {
        super(str, interfaceC6152l);
        this.unifiedAgreement = null;
        this.mqvAgreement = interfaceC3481l;
    }

    private C12029l generatePrivateKeyParameter(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof DHPrivateKey)) {
            C18073l.smaato("private key not a DHPrivateKey");
            return null;
        }
        if (privateKey instanceof BCDHPrivateKey) {
            return ((BCDHPrivateKey) privateKey).engineGetKeyParameters();
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
        DHParameterSpec params = dHPrivateKey.getParams();
        return new C12029l(dHPrivateKey.getX(), new C2396l(params.getL(), params.getP(), params.getG()));
    }

    private C7438l generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof DHPublicKey)) {
            C18073l.smaato("public key not a DHPublicKey");
            return null;
        }
        if (publicKey instanceof BCDHPublicKey) {
            return ((BCDHPublicKey) publicKey).engineGetKeyParameters();
        }
        DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
        DHParameterSpec params = dHPublicKey.getParams();
        if (params instanceof C14063l) {
            return new C7438l(dHPublicKey.getY(), ((C14063l) params).yandex());
        }
        return new C7438l(dHPublicKey.getY(), new C2396l(params.getL(), params.getP(), params.getG()));
    }

    public byte[] bigIntToBytes(BigInteger bigInteger) {
        return AbstractC16784l.yandex((this.p.bitLength() + 7) / 8, bigInteger);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] doCalcSecret() {
        return this.result;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public void doInitFromKey(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (!(key instanceof DHPrivateKey)) {
            C18073l.smaato("DHKeyAgreement requires DHPrivateKey for initialisation");
            return;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
        if (algorithmParameterSpec == null) {
            this.p = dHPrivateKey.getParams().getP();
            this.g = dHPrivateKey.getParams().getG();
        } else {
            if (!(algorithmParameterSpec instanceof DHParameterSpec)) {
                C18073l.pro("DHKeyAgreement only accepts DHParameterSpec");
                return;
            }
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            this.p = dHParameterSpec.getP();
            this.g = dHParameterSpec.getG();
            this.ukmParameters = null;
        }
        BigInteger x = dHPrivateKey.getX();
        this.x = x;
        this.result = bigIntToBytes(x);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z) throws InvalidKeyException {
        if (this.x == null) {
            C8339l.smaato("Diffie-Hellman not initialised.");
            return null;
        }
        if (!(key instanceof DHPublicKey)) {
            C18073l.smaato("DHKeyAgreement doPhase requires DHPublicKey");
            return null;
        }
        DHPublicKey dHPublicKey = (DHPublicKey) key;
        if (!dHPublicKey.getParams().getG().equals(this.g) || !dHPublicKey.getParams().getP().equals(this.p)) {
            C18073l.smaato("DHPublicKey not for this KeyAgreement!");
            return null;
        }
        BigInteger y = dHPublicKey.getY();
        if (y != null && y.compareTo(TWO) >= 0) {
            BigInteger bigInteger = this.p;
            BigInteger bigInteger2 = ONE;
            if (y.compareTo(bigInteger.subtract(bigInteger2)) < 0) {
                if (this.unifiedAgreement != null) {
                    if (z) {
                        generatePublicKeyParameter((PublicKey) key);
                        throw null;
                    }
                    C8339l.smaato("unified Diffie-Hellman can use only two key pairs");
                    return null;
                }
                if (this.mqvAgreement != null) {
                    if (z) {
                        generatePublicKeyParameter((PublicKey) key);
                        throw null;
                    }
                    C8339l.smaato("MQV Diffie-Hellman can use only two key pairs");
                    return null;
                }
                BigInteger bigIntegerModPow = y.modPow(this.x, this.p);
                if (bigIntegerModPow.compareTo(bigInteger2) == 0) {
                    C18073l.smaato("Shared key can't be 1");
                    return null;
                }
                this.result = bigIntToBytes(bigIntegerModPow);
                if (z) {
                    return null;
                }
                return new BCDHPublicKey(bigIntegerModPow, dHPublicKey.getParams());
            }
        }
        C18073l.smaato("Invalid DH PublicKey");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public SecretKey engineGenerateSecret(String str) {
        if (this.x != null) {
            return str.equals("TlsPremasterSecret") ? new SecretKeySpec(BaseAgreementSpi.trimZeroes(this.result), str) : super.engineGenerateSecret(str);
        }
        C8339l.smaato("Diffie-Hellman not initialised.");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (!(key instanceof DHPrivateKey)) {
            C18073l.smaato("DHKeyAgreement requires DHPrivateKey");
            return;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
        this.p = dHPrivateKey.getParams().getP();
        this.g = dHPrivateKey.getParams().getG();
        BigInteger x = dHPrivateKey.getX();
        this.x = x;
        this.result = bigIntToBytes(x);
    }

    public KeyAgreementSpi() {
        this("Diffie-Hellman", null);
    }

    public KeyAgreementSpi(String str, C13757l c13757l, InterfaceC6152l interfaceC6152l) {
        super(str, interfaceC6152l);
        this.unifiedAgreement = c13757l;
        this.mqvAgreement = null;
    }

    public KeyAgreementSpi(String str, InterfaceC6152l interfaceC6152l) {
        super(str, interfaceC6152l);
        this.unifiedAgreement = null;
        this.mqvAgreement = null;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i) {
        if (this.x != null) {
            return super.engineGenerateSecret(bArr, i);
        }
        C8339l.smaato("Diffie-Hellman not initialised.");
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() {
        if (this.x != null) {
            return super.engineGenerateSecret();
        }
        C8339l.smaato("Diffie-Hellman not initialised.");
        return null;
    }
}

package org.bouncycastle.jcajce.provider.asymmetric.edec;

import defpackage.AbstractC0653l;
import defpackage.AbstractC14832l;
import defpackage.AbstractC4347l;
import defpackage.AbstractC8151l;
import defpackage.AbstractC8831l;
import defpackage.C0045l;
import defpackage.C15714l;
import defpackage.C16244l;
import defpackage.C16638l;
import defpackage.C17190l;
import defpackage.C17219l;
import defpackage.C17711l;
import defpackage.C18073l;
import defpackage.C2313l;
import defpackage.C2657l;
import defpackage.C5153l;
import defpackage.C7026l;
import defpackage.C8339l;
import defpackage.InterfaceC16922l;
import defpackage.InterfaceC6152l;
import defpackage.InterfaceC9330l;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;

/* JADX INFO: loaded from: classes3.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private InterfaceC9330l agreement;
    private AbstractC4347l dhuSpec;
    private byte[] result;

    public static final class X25519 extends KeyAgreementSpi {
        public X25519() {
            super("X25519");
        }
    }

    public static class X25519UwithSHA256CKDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public X25519UwithSHA256CKDF() {
            super("X25519UwithSHA256CKDF", new C17219l(new C2657l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class X25519UwithSHA256KDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public X25519UwithSHA256KDF() {
            super("X25519UwithSHA256KDF", new C0045l(new C2657l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static final class X25519withSHA256CKDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public X25519withSHA256CKDF() {
            super("X25519withSHA256CKDF", new C17219l(new C2657l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static final class X25519withSHA256HKDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public X25519withSHA256HKDF() {
            super("X25519withSHA256HKDF", new C2313l(new C2657l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static final class X25519withSHA256KDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public X25519withSHA256KDF() {
            super("X25519withSHA256KDF", new C0045l(new C2657l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class X25519withSHA384CKDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public X25519withSHA384CKDF() {
            super("X25519withSHA384CKDF", new C17219l((InterfaceC16922l) new C5153l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class X25519withSHA512CKDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public X25519withSHA512CKDF() {
            super("X25519withSHA512CKDF", new C17219l((InterfaceC16922l) new C17711l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static final class X448 extends KeyAgreementSpi {
        public X448() {
            super("X448");
        }
    }

    public static class X448UwithSHA512CKDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public X448UwithSHA512CKDF() {
            super("X448UwithSHA512CKDF", new C17219l((InterfaceC16922l) new C17711l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class X448UwithSHA512KDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public X448UwithSHA512KDF() {
            super("X448UwithSHA512KDF", new C0045l(new C17711l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static final class X448withSHA256CKDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public X448withSHA256CKDF() {
            super("X448withSHA256CKDF", new C17219l(new C2657l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static class X448withSHA384CKDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public X448withSHA384CKDF() {
            super("X448withSHA384CKDF", new C17219l((InterfaceC16922l) new C5153l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static final class X448withSHA512CKDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public X448withSHA512CKDF() {
            super("X448withSHA512CKDF", new C17219l((InterfaceC16922l) new C17711l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static final class X448withSHA512HKDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public X448withSHA512HKDF() {
            super("X448withSHA512HKDF", new C2313l(new C17711l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static final class X448withSHA512KDF extends KeyAgreementSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public X448withSHA512KDF() {
            super("X448withSHA512KDF", new C0045l(new C17711l()));
            int i = AbstractC14832l.yandex;
        }
    }

    public static final class XDH extends KeyAgreementSpi {
        public XDH() {
            super("XDH");
        }
    }

    public KeyAgreementSpi(String str) {
        super(AbstractC8151l.crashlytics("org.bouncycastle.emulate.oracle") ? "XDH" : str, null);
    }

    private InterfaceC9330l getAgreement(String str) throws InvalidKeyException {
        if (this.kaAlgorithm.equals("XDH") || this.kaAlgorithm.startsWith(str)) {
            if (this.kaAlgorithm.indexOf(85) > 0) {
                return str.startsWith("X448") ? new C7026l(25, new C17190l(0)) : new C7026l(25, new C15714l());
            }
            return str.startsWith("X448") ? new C17190l(0) : new C15714l();
        }
        throw new InvalidKeyException("inappropriate key for " + this.kaAlgorithm);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] doCalcSecret() {
        return this.result;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public void doInitFromKey(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String str;
        if (!(key instanceof PrivateKey)) {
            C18073l.smaato("private XDH key required");
            return;
        }
        AbstractC8831l abstractC8831lGeneratePrivateKeyParameter = EdECUtil.generatePrivateKeyParameter((PrivateKey) key);
        if (abstractC8831lGeneratePrivateKeyParameter instanceof C16244l) {
            str = "X25519";
        } else {
            if (!(abstractC8831lGeneratePrivateKeyParameter instanceof C16638l)) {
                C18073l.smaato("unsupported private key type");
                return;
            }
            str = "X448";
        }
        this.agreement = getAgreement(str);
        this.ukmParameters = null;
        this.ukmParametersSalt = null;
        this.agreement.init(abstractC8831lGeneratePrivateKeyParameter);
        if (algorithmParameterSpec != null) {
            C18073l.pro("unknown ParameterSpec");
        } else {
            if (this.kdf == null || this.ukmParameters != null) {
                return;
            }
            this.ukmParameters = new byte[0];
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z) throws InvalidKeyException {
        if (!(key instanceof PublicKey)) {
            C18073l.smaato("public XDH key required");
            return null;
        }
        if (this.agreement == null) {
            C8339l.smaato(AbstractC0653l.ads(new StringBuilder(), this.kaAlgorithm, " not initialised."));
            return null;
        }
        if (!z) {
            C8339l.smaato(AbstractC0653l.ads(new StringBuilder(), this.kaAlgorithm, " can only be between two parties."));
            return null;
        }
        AbstractC8831l abstractC8831lGeneratePublicKeyParameter = EdECUtil.generatePublicKeyParameter((PublicKey) key);
        byte[] bArr = new byte[this.agreement.remoteconfig()];
        this.result = bArr;
        this.agreement.firebase(abstractC8831lGeneratePublicKeyParameter, bArr, 0);
        return null;
    }

    public KeyAgreementSpi(String str, InterfaceC6152l interfaceC6152l) {
        super(AbstractC8151l.crashlytics("org.bouncycastle.emulate.oracle") ? "XDH" : str, interfaceC6152l);
    }
}

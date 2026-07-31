package org.bouncycastle.jcajce.provider.asymmetric.ec;

import defpackage.AbstractC0653l;
import defpackage.AbstractC11918l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC14832l;
import defpackage.AbstractC4347l;
import defpackage.AbstractC9101l;
import defpackage.C0045l;
import defpackage.C0655l;
import defpackage.C11733l;
import defpackage.C14494l;
import defpackage.C17219l;
import defpackage.C17711l;
import defpackage.C17867l;
import defpackage.C18073l;
import defpackage.C2193l;
import defpackage.C2657l;
import defpackage.C4422l;
import defpackage.C4871l;
import defpackage.C5153l;
import defpackage.C7838l;
import defpackage.C8339l;
import defpackage.C8374l;
import defpackage.C9102l;
import defpackage.InterfaceC0885l;
import defpackage.InterfaceC16922l;
import defpackage.InterfaceC18238l;
import defpackage.InterfaceC3481l;
import defpackage.InterfaceC6152l;
import defpackage.InterfaceC9719l;
import java.math.BigInteger;
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
    private static final C2193l converter = new C2193l();
    private Object agreement;
    private AbstractC4347l dheParameters;
    private String kaAlgorithm;
    private AbstractC9101l mqvParameters;
    private C7838l parameters;
    private byte[] result;

    public static class CDHwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA1KDFAndSharedInfo() {
            C4422l c4422l = new C4422l();
            int i = AbstractC14832l.yandex;
            super("ECCDHwithSHA1KDF", c4422l, new C0045l(new C0655l()));
        }
    }

    public static class CDHwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA224KDFAndSharedInfo() {
            C4422l c4422l = new C4422l();
            int i = AbstractC14832l.yandex;
            super("ECCDHwithSHA224KDF", c4422l, new C0045l(new C9102l()));
        }
    }

    public static class CDHwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA256KDFAndSharedInfo() {
            C4422l c4422l = new C4422l();
            int i = AbstractC14832l.yandex;
            super("ECCDHwithSHA256KDF", c4422l, new C0045l(new C2657l()));
        }
    }

    public static class CDHwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA384KDFAndSharedInfo() {
            C4422l c4422l = new C4422l();
            int i = AbstractC14832l.yandex;
            super("ECCDHwithSHA384KDF", c4422l, new C0045l(new C5153l()));
        }
    }

    public static class CDHwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA512KDFAndSharedInfo() {
            C4422l c4422l = new C4422l();
            int i = AbstractC14832l.yandex;
            super("ECCDHwithSHA512KDF", c4422l, new C0045l(new C17711l()));
        }
    }

    public static class DH extends KeyAgreementSpi {
        public DH() {
            super("ECDH", new C11733l(), (InterfaceC6152l) null);
        }
    }

    public static class DHC extends KeyAgreementSpi {
        public DHC() {
            super("ECDHC", new C4422l(), (InterfaceC6152l) null);
        }
    }

    public static class DHUC extends KeyAgreementSpi {
        public DHUC() {
            super("ECCDHU", new C14494l(), (InterfaceC6152l) null);
        }
    }

    public static class DHUwithSHA1CKDF extends KeyAgreementSpi {
        public DHUwithSHA1CKDF() {
            C14494l c14494l = new C14494l();
            int i = AbstractC14832l.yandex;
            super("ECCDHUwithSHA1CKDF", c14494l, new C17219l(new C0655l()));
        }
    }

    public static class DHUwithSHA1KDF extends KeyAgreementSpi {
        public DHUwithSHA1KDF() {
            C14494l c14494l = new C14494l();
            int i = AbstractC14832l.yandex;
            super("ECCDHUwithSHA1KDF", c14494l, new C0045l(new C0655l()));
        }
    }

    public static class DHUwithSHA224CKDF extends KeyAgreementSpi {
        public DHUwithSHA224CKDF() {
            C14494l c14494l = new C14494l();
            int i = AbstractC14832l.yandex;
            super("ECCDHUwithSHA224CKDF", c14494l, new C17219l(new C9102l()));
        }
    }

    public static class DHUwithSHA224KDF extends KeyAgreementSpi {
        public DHUwithSHA224KDF() {
            C14494l c14494l = new C14494l();
            int i = AbstractC14832l.yandex;
            super("ECCDHUwithSHA224KDF", c14494l, new C0045l(new C9102l()));
        }
    }

    public static class DHUwithSHA256CKDF extends KeyAgreementSpi {
        public DHUwithSHA256CKDF() {
            C14494l c14494l = new C14494l();
            int i = AbstractC14832l.yandex;
            super("ECCDHUwithSHA256CKDF", c14494l, new C17219l(new C2657l()));
        }
    }

    public static class DHUwithSHA256KDF extends KeyAgreementSpi {
        public DHUwithSHA256KDF() {
            C14494l c14494l = new C14494l();
            int i = AbstractC14832l.yandex;
            super("ECCDHUwithSHA256KDF", c14494l, new C0045l(new C2657l()));
        }
    }

    public static class DHUwithSHA384CKDF extends KeyAgreementSpi {
        public DHUwithSHA384CKDF() {
            C14494l c14494l = new C14494l();
            int i = AbstractC14832l.yandex;
            super("ECCDHUwithSHA384CKDF", c14494l, new C17219l((InterfaceC16922l) new C5153l()));
        }
    }

    public static class DHUwithSHA384KDF extends KeyAgreementSpi {
        public DHUwithSHA384KDF() {
            C14494l c14494l = new C14494l();
            int i = AbstractC14832l.yandex;
            super("ECCDHUwithSHA384KDF", c14494l, new C0045l(new C5153l()));
        }
    }

    public static class DHUwithSHA512CKDF extends KeyAgreementSpi {
        public DHUwithSHA512CKDF() {
            C14494l c14494l = new C14494l();
            int i = AbstractC14832l.yandex;
            super("ECCDHUwithSHA512CKDF", c14494l, new C17219l((InterfaceC16922l) new C17711l()));
        }
    }

    public static class DHUwithSHA512KDF extends KeyAgreementSpi {
        public DHUwithSHA512KDF() {
            C14494l c14494l = new C14494l();
            int i = AbstractC14832l.yandex;
            super("ECCDHUwithSHA512KDF", c14494l, new C0045l(new C17711l()));
        }
    }

    public static class DHwithSHA1CKDF extends KeyAgreementSpi {
        public DHwithSHA1CKDF() {
            C4422l c4422l = new C4422l();
            int i = AbstractC14832l.yandex;
            super("ECDHwithSHA1CKDF", c4422l, new C17219l(new C0655l()));
        }
    }

    public static class DHwithSHA1KDF extends KeyAgreementSpi {
        public DHwithSHA1KDF() {
            C11733l c11733l = new C11733l();
            int i = AbstractC14832l.yandex;
            super("ECDHwithSHA1KDF", c11733l, new C0045l(new C0655l()));
        }
    }

    public static class DHwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA1KDFAndSharedInfo() {
            C11733l c11733l = new C11733l();
            int i = AbstractC14832l.yandex;
            super("ECDHwithSHA1KDF", c11733l, new C0045l(new C0655l()));
        }
    }

    public static class DHwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA224KDFAndSharedInfo() {
            C11733l c11733l = new C11733l();
            int i = AbstractC14832l.yandex;
            super("ECDHwithSHA224KDF", c11733l, new C0045l(new C9102l()));
        }
    }

    public static class DHwithSHA256CKDF extends KeyAgreementSpi {
        public DHwithSHA256CKDF() {
            C4422l c4422l = new C4422l();
            int i = AbstractC14832l.yandex;
            super("ECDHwithSHA256CKDF", c4422l, new C17219l(new C2657l()));
        }
    }

    public static class DHwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA256KDFAndSharedInfo() {
            C11733l c11733l = new C11733l();
            int i = AbstractC14832l.yandex;
            super("ECDHwithSHA256KDF", c11733l, new C0045l(new C2657l()));
        }
    }

    public static class DHwithSHA384CKDF extends KeyAgreementSpi {
        public DHwithSHA384CKDF() {
            C4422l c4422l = new C4422l();
            int i = AbstractC14832l.yandex;
            super("ECDHwithSHA384CKDF", c4422l, new C17219l((InterfaceC16922l) new C5153l()));
        }
    }

    public static class DHwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA384KDFAndSharedInfo() {
            C11733l c11733l = new C11733l();
            int i = AbstractC14832l.yandex;
            super("ECDHwithSHA384KDF", c11733l, new C0045l(new C5153l()));
        }
    }

    public static class DHwithSHA512CKDF extends KeyAgreementSpi {
        public DHwithSHA512CKDF() {
            C4422l c4422l = new C4422l();
            int i = AbstractC14832l.yandex;
            super("ECDHwithSHA512CKDF", c4422l, new C17219l((InterfaceC16922l) new C17711l()));
        }
    }

    public static class DHwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA512KDFAndSharedInfo() {
            C11733l c11733l = new C11733l();
            int i = AbstractC14832l.yandex;
            super("ECDHwithSHA512KDF", c11733l, new C0045l(new C17711l()));
        }
    }

    public static class ECKAEGwithRIPEMD160KDF extends KeyAgreementSpi {
        public ECKAEGwithRIPEMD160KDF() {
            super("ECKAEGwithRIPEMD160KDF", new C11733l(), new C0045l(new C4871l()));
        }
    }

    public static class ECKAEGwithSHA1KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA1KDF() {
            C11733l c11733l = new C11733l();
            int i = AbstractC14832l.yandex;
            super("ECKAEGwithSHA1KDF", c11733l, new C0045l(new C0655l()));
        }
    }

    public static class ECKAEGwithSHA224KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA224KDF() {
            C11733l c11733l = new C11733l();
            int i = AbstractC14832l.yandex;
            super("ECKAEGwithSHA224KDF", c11733l, new C0045l(new C9102l()));
        }
    }

    public static class ECKAEGwithSHA256KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA256KDF() {
            C11733l c11733l = new C11733l();
            int i = AbstractC14832l.yandex;
            super("ECKAEGwithSHA256KDF", c11733l, new C0045l(new C2657l()));
        }
    }

    public static class ECKAEGwithSHA384KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA384KDF() {
            C11733l c11733l = new C11733l();
            int i = AbstractC14832l.yandex;
            super("ECKAEGwithSHA384KDF", c11733l, new C0045l(new C5153l()));
        }
    }

    public static class ECKAEGwithSHA512KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA512KDF() {
            C11733l c11733l = new C11733l();
            int i = AbstractC14832l.yandex;
            super("ECKAEGwithSHA512KDF", c11733l, new C0045l(new C17711l()));
        }
    }

    public static class MQV extends KeyAgreementSpi {
        public MQV() {
            super("ECMQV", new C17867l(), (InterfaceC6152l) null);
        }
    }

    public static class MQVwithSHA1CKDF extends KeyAgreementSpi {
        public MQVwithSHA1CKDF() {
            C17867l c17867l = new C17867l();
            int i = AbstractC14832l.yandex;
            super("ECMQVwithSHA1CKDF", c17867l, new C17219l(new C0655l()));
        }
    }

    public static class MQVwithSHA1KDF extends KeyAgreementSpi {
        public MQVwithSHA1KDF() {
            C17867l c17867l = new C17867l();
            int i = AbstractC14832l.yandex;
            super("ECMQVwithSHA1KDF", c17867l, new C0045l(new C0655l()));
        }
    }

    public static class MQVwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA1KDFAndSharedInfo() {
            C17867l c17867l = new C17867l();
            int i = AbstractC14832l.yandex;
            super("ECMQVwithSHA1KDF", c17867l, new C0045l(new C0655l()));
        }
    }

    public static class MQVwithSHA224CKDF extends KeyAgreementSpi {
        public MQVwithSHA224CKDF() {
            C17867l c17867l = new C17867l();
            int i = AbstractC14832l.yandex;
            super("ECMQVwithSHA224CKDF", c17867l, new C17219l(new C9102l()));
        }
    }

    public static class MQVwithSHA224KDF extends KeyAgreementSpi {
        public MQVwithSHA224KDF() {
            C17867l c17867l = new C17867l();
            int i = AbstractC14832l.yandex;
            super("ECMQVwithSHA224KDF", c17867l, new C0045l(new C9102l()));
        }
    }

    public static class MQVwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA224KDFAndSharedInfo() {
            C17867l c17867l = new C17867l();
            int i = AbstractC14832l.yandex;
            super("ECMQVwithSHA224KDF", c17867l, new C0045l(new C9102l()));
        }
    }

    public static class MQVwithSHA256CKDF extends KeyAgreementSpi {
        public MQVwithSHA256CKDF() {
            C17867l c17867l = new C17867l();
            int i = AbstractC14832l.yandex;
            super("ECMQVwithSHA256CKDF", c17867l, new C17219l(new C2657l()));
        }
    }

    public static class MQVwithSHA256KDF extends KeyAgreementSpi {
        public MQVwithSHA256KDF() {
            C17867l c17867l = new C17867l();
            int i = AbstractC14832l.yandex;
            super("ECMQVwithSHA256KDF", c17867l, new C0045l(new C2657l()));
        }
    }

    public static class MQVwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA256KDFAndSharedInfo() {
            C17867l c17867l = new C17867l();
            int i = AbstractC14832l.yandex;
            super("ECMQVwithSHA256KDF", c17867l, new C0045l(new C2657l()));
        }
    }

    public static class MQVwithSHA384CKDF extends KeyAgreementSpi {
        public MQVwithSHA384CKDF() {
            C17867l c17867l = new C17867l();
            int i = AbstractC14832l.yandex;
            super("ECMQVwithSHA384CKDF", c17867l, new C17219l((InterfaceC16922l) new C5153l()));
        }
    }

    public static class MQVwithSHA384KDF extends KeyAgreementSpi {
        public MQVwithSHA384KDF() {
            C17867l c17867l = new C17867l();
            int i = AbstractC14832l.yandex;
            super("ECMQVwithSHA384KDF", c17867l, new C0045l(new C5153l()));
        }
    }

    public static class MQVwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA384KDFAndSharedInfo() {
            C17867l c17867l = new C17867l();
            int i = AbstractC14832l.yandex;
            super("ECMQVwithSHA384KDF", c17867l, new C0045l(new C5153l()));
        }
    }

    public static class MQVwithSHA512CKDF extends KeyAgreementSpi {
        public MQVwithSHA512CKDF() {
            C17867l c17867l = new C17867l();
            int i = AbstractC14832l.yandex;
            super("ECMQVwithSHA512CKDF", c17867l, new C17219l((InterfaceC16922l) new C17711l()));
        }
    }

    public static class MQVwithSHA512KDF extends KeyAgreementSpi {
        public MQVwithSHA512KDF() {
            C17867l c17867l = new C17867l();
            int i = AbstractC14832l.yandex;
            super("ECMQVwithSHA512KDF", c17867l, new C0045l(new C17711l()));
        }
    }

    public static class MQVwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA512KDFAndSharedInfo() {
            C17867l c17867l = new C17867l();
            int i = AbstractC14832l.yandex;
            super("ECMQVwithSHA512KDF", c17867l, new C0045l(new C17711l()));
        }
    }

    public KeyAgreementSpi(String str, InterfaceC3481l interfaceC3481l, InterfaceC6152l interfaceC6152l) {
        super(str, interfaceC6152l);
        this.kaAlgorithm = str;
        this.agreement = interfaceC3481l;
    }

    private static String getSimpleName(Class cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    public byte[] bigIntToBytes(BigInteger bigInteger) {
        C2193l c2193l = converter;
        AbstractC11918l abstractC11918l = this.parameters.f16360l;
        c2193l.getClass();
        return C2193l.yandex(abstractC11918l.firebase(), bigInteger);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] doCalcSecret() {
        return AbstractC14024l.crashlytics(this.result);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public void doInitFromKey(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null) {
            C18073l.pro("No algorithm parameters supported");
            return;
        }
        if (this.agreement instanceof C17867l) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.kaAlgorithm);
            sb.append(" key agreement requires ");
            throw new InvalidAlgorithmParameterException(AbstractC0653l.ads(sb, getSimpleName(AbstractC9101l.class), " for initialisation"));
        }
        if (!(key instanceof PrivateKey)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.kaAlgorithm);
            sb2.append(" key agreement requires ");
            throw new InvalidKeyException(AbstractC0653l.ads(sb2, getSimpleName(InterfaceC18238l.class), " for initialisation"));
        }
        C8374l c8374l = (C8374l) ECUtils.generatePrivateKeyParameter((PrivateKey) key);
        this.parameters = c8374l.f4542l;
        this.ukmParameters = null;
        ((InterfaceC3481l) this.agreement).init(c8374l);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z) throws InvalidKeyException {
        StringBuilder sb;
        String str;
        String str2;
        if (this.parameters == null) {
            sb = new StringBuilder();
            str = this.kaAlgorithm;
            str2 = " not initialised.";
        } else {
            if (z) {
                Object obj = this.agreement;
                if (obj instanceof C17867l) {
                    throw null;
                }
                if (obj instanceof C14494l) {
                    throw null;
                }
                if (!(key instanceof PublicKey)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.kaAlgorithm);
                    sb2.append(" key agreement requires ");
                    throw new InvalidKeyException(AbstractC0653l.ads(sb2, getSimpleName(InterfaceC0885l.class), " for doPhase"));
                }
                InterfaceC9719l interfaceC9719lGeneratePublicKeyParameter = ECUtils.generatePublicKeyParameter((PublicKey) key);
                try {
                    Object obj2 = this.agreement;
                    if (obj2 instanceof InterfaceC3481l) {
                        this.result = bigIntToBytes(((InterfaceC3481l) obj2).yandex(interfaceC9719lGeneratePublicKeyParameter));
                        return null;
                    }
                    ((C14494l) obj2).getClass();
                    throw null;
                } catch (Exception e) {
                    throw new InvalidKeyException(AbstractC12900l.admob(e, new StringBuilder("calculation failed: "))) { // from class: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi.1
                        @Override // java.lang.Throwable
                        public Throwable getCause() {
                            return e;
                        }
                    };
                }
            }
            sb = new StringBuilder();
            str = this.kaAlgorithm;
            str2 = " can only be between two parties.";
        }
        C8339l.smaato(AbstractC0653l.ads(sb, str, str2));
        return null;
    }

    public KeyAgreementSpi(String str, C14494l c14494l, InterfaceC6152l interfaceC6152l) {
        super(str, interfaceC6152l);
        this.kaAlgorithm = str;
        this.agreement = c14494l;
    }
}

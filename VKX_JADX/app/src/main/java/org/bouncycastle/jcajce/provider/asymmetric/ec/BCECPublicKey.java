package org.bouncycastle.jcajce.provider.asymmetric.ec;

import defpackage.AbstractC11918l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC8151l;
import defpackage.AbstractC8859l;
import defpackage.C10198l;
import defpackage.C11327l;
import defpackage.C12726l;
import defpackage.C17029l;
import defpackage.C4148l;
import defpackage.C7130l;
import defpackage.C7838l;
import defpackage.C8339l;
import defpackage.C8838l;
import defpackage.Ccase;
import defpackage.Cthrow;
import defpackage.InterfaceC0885l;
import defpackage.InterfaceC14821l;
import defpackage.InterfaceC15427l;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class BCECPublicKey implements ECPublicKey, InterfaceC0885l, InterfaceC14821l {
    static final long serialVersionUID = 2422789860422731812L;
    private String algorithm;
    private transient ProviderConfiguration configuration;
    private transient C4148l ecPublicKey;
    private transient ECParameterSpec ecSpec;
    private transient byte[] encoding;
    private transient boolean oldPcSet;
    private boolean withCompression;

    public BCECPublicKey(String str, C8838l c8838l, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        C12726l c12726l = c8838l.f4939l;
        AbstractC8859l abstractC8859l = c8838l.f18167l;
        if (c12726l != null) {
            EllipticCurve ellipticCurveConvertCurve = EC5Util.convertCurve(c12726l.f25097l, c12726l.f25096l);
            this.ecPublicKey = new C4148l(abstractC8859l, ECUtil.getDomainParameters(providerConfiguration, c12726l));
            this.ecSpec = EC5Util.convertSpec(ellipticCurveConvertCurve, c12726l);
        } else {
            AbstractC11918l abstractC11918l = providerConfiguration.getEcImplicitlyCa().f25097l;
            abstractC8859l.loadAd();
            this.ecPublicKey = new C4148l(abstractC11918l.amazon(abstractC8859l.loadAd.signatures(), abstractC8859l.purchase().signatures()), EC5Util.getDomainParameters(providerConfiguration, null));
            this.ecSpec = null;
        }
        this.configuration = providerConfiguration;
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, C7838l c7838l) {
        return new ECParameterSpec(ellipticCurve, EC5Util.convertPoint(c7838l.f16358l), c7838l.f16362l, c7838l.f16361l.intValue());
    }

    private void populateFromPubKeyInfo(C17029l c17029l) {
        byte b;
        C7130l c7130lVip = C7130l.vip(c17029l.f33175l.f20786l);
        AbstractC11918l curve = EC5Util.getCurve(this.configuration, c7130lVip);
        this.ecSpec = EC5Util.convertToSpec(c7130lVip, curve);
        byte[] bArrApplovin = c17029l.f33174l.applovin();
        Cthrow c11327l = new C11327l(bArrApplovin);
        if (bArrApplovin[0] == 4 && bArrApplovin[1] == bArrApplovin.length - 2 && (((b = bArrApplovin[2]) == 2 || b == 3) && curve.firebase() >= bArrApplovin.length - 3)) {
            try {
                c11327l = (Cthrow) Ccase.advert(bArrApplovin);
            } catch (IOException unused) {
                C8339l.metrica("error recovering public key");
                return;
            }
        }
        byte[] bArrCrashlytics = AbstractC14024l.crashlytics(c11327l.f36593l);
        new C11327l(bArrCrashlytics);
        this.ecPublicKey = new C4148l(curve.mopub(bArrCrashlytics).startapp(), ECUtil.getDomainParameters(this.configuration, c7130lVip));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        byte[] bArr = (byte[]) objectInputStream.readObject();
        this.configuration = BouncyCastleProvider.CONFIGURATION;
        populateFromPubKeyInfo(C17029l.vip(Ccase.advert(bArr)));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public C4148l engineGetKeyParameters() {
        return this.ecPublicKey;
    }

    public C12726l engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : this.configuration.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (obj instanceof BCECPublicKey) {
            BCECPublicKey bCECPublicKey = (BCECPublicKey) obj;
            return this.ecPublicKey.f8515l.amazon(bCECPublicKey.ecPublicKey.f8515l) && engineGetSpec().equals(bCECPublicKey.engineGetSpec());
        }
        if (obj instanceof ECPublicKey) {
            return Arrays.equals(getEncoded(), ((ECPublicKey) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        boolean zCrashlytics = AbstractC8151l.crashlytics("org.bouncycastle.ec.enable_pc");
        if (this.encoding == null || this.oldPcSet != zCrashlytics) {
            boolean z = this.withCompression || zCrashlytics;
            this.encoding = KeyUtil.getEncodedSubjectPublicKeyInfo(new C10198l(InterfaceC15427l.f30173l, ECUtils.getDomainParametersFromName(this.ecSpec, z)), this.ecPublicKey.f8515l.admob(z));
            this.oldPcSet = zCrashlytics;
        }
        return AbstractC14024l.crashlytics(this.encoding);
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // defpackage.InterfaceC11004l
    public C12726l getParameters() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.ecSpec;
    }

    @Override // defpackage.InterfaceC0885l
    public AbstractC8859l getQ() {
        AbstractC8859l abstractC8859l = this.ecPublicKey.f8515l;
        return this.ecSpec == null ? abstractC8859l.startapp().crashlytics() : abstractC8859l;
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
        return EC5Util.convertPoint(this.ecPublicKey.f8515l);
    }

    public int hashCode() {
        return engineGetSpec().hashCode() ^ this.ecPublicKey.f8515l.hashCode();
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
        this.encoding = null;
    }

    public String toString() {
        return ECUtil.publicKeyToString("EC", this.ecPublicKey.f8515l, engineGetSpec());
    }

    public BCECPublicKey(String str, C4148l c4148l, ECParameterSpec eCParameterSpec, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        C7838l c7838l = c4148l.f4542l;
        this.algorithm = str;
        this.ecPublicKey = c4148l;
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(EC5Util.convertCurve(c7838l.f16360l, AbstractC14024l.crashlytics(c7838l.f16359l)), c7838l);
        } else {
            this.ecSpec = eCParameterSpec;
        }
        this.configuration = providerConfiguration;
    }

    public BCECPublicKey(String str, C4148l c4148l, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        this.ecPublicKey = c4148l;
        this.ecSpec = null;
        this.configuration = providerConfiguration;
    }

    public BCECPublicKey(String str, C4148l c4148l, C12726l c12726l, ProviderConfiguration providerConfiguration) {
        ECParameterSpec eCParameterSpecConvertSpec;
        this.algorithm = "EC";
        C7838l c7838l = c4148l.f4542l;
        this.algorithm = str;
        if (c12726l == null) {
            eCParameterSpecConvertSpec = createSpec(EC5Util.convertCurve(c7838l.f16360l, AbstractC14024l.crashlytics(c7838l.f16359l)), c7838l);
        } else {
            eCParameterSpecConvertSpec = EC5Util.convertSpec(EC5Util.convertCurve(c12726l.f25097l, c12726l.f25096l), c12726l);
        }
        this.ecSpec = eCParameterSpecConvertSpec;
        this.ecPublicKey = c4148l;
        this.configuration = providerConfiguration;
    }

    public BCECPublicKey(String str, C17029l c17029l, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        this.configuration = providerConfiguration;
        populateFromPubKeyInfo(c17029l);
    }

    public BCECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new C4148l(EC5Util.convertPoint(params, eCPublicKeySpec.getW()), EC5Util.getDomainParameters(providerConfiguration, eCPublicKeySpec.getParams()));
        this.configuration = providerConfiguration;
    }

    public BCECPublicKey(String str, BCECPublicKey bCECPublicKey) {
        this.algorithm = str;
        this.ecPublicKey = bCECPublicKey.ecPublicKey;
        this.ecSpec = bCECPublicKey.ecSpec;
        this.withCompression = bCECPublicKey.withCompression;
        this.configuration = bCECPublicKey.configuration;
    }

    public BCECPublicKey(ECPublicKey eCPublicKey, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new C4148l(EC5Util.convertPoint(params, eCPublicKey.getW()), EC5Util.getDomainParameters(providerConfiguration, eCPublicKey.getParams()));
        this.configuration = providerConfiguration;
    }
}

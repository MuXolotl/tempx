package org.bouncycastle.jce.provider;

import defpackage.AbstractC11696l;
import defpackage.AbstractC11918l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC7016l;
import defpackage.AbstractC8859l;
import defpackage.AbstractC9008l;
import defpackage.C10198l;
import defpackage.C10825l;
import defpackage.C11327l;
import defpackage.C12726l;
import defpackage.C13777l;
import defpackage.C16217l;
import defpackage.C17029l;
import defpackage.C17209l;
import defpackage.C4148l;
import defpackage.C7100l;
import defpackage.C7130l;
import defpackage.C7838l;
import defpackage.C8339l;
import defpackage.C8838l;
import defpackage.Ccase;
import defpackage.Cfor;
import defpackage.Cthrow;
import defpackage.Cvolatile;
import defpackage.InterfaceC0885l;
import defpackage.InterfaceC11987l;
import defpackage.InterfaceC15427l;
import defpackage.advert;
import defpackage.applovin;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;

/* JADX INFO: loaded from: classes3.dex */
public class JCEECPublicKey implements ECPublicKey, InterfaceC0885l {
    private String algorithm;
    private ECParameterSpec ecSpec;
    private C13777l gostParams;
    private AbstractC8859l q;
    private boolean withCompression;

    public JCEECPublicKey(String str, C8838l c8838l) {
        ECParameterSpec eCParameterSpecConvertSpec;
        this.algorithm = str;
        AbstractC8859l abstractC8859l = c8838l.f18167l;
        this.q = abstractC8859l;
        C12726l c12726l = c8838l.f4939l;
        if (c12726l != null) {
            eCParameterSpecConvertSpec = EC5Util.convertSpec(EC5Util.convertCurve(c12726l.f25097l, c12726l.f25096l), c12726l);
        } else {
            if (abstractC8859l.yandex == null) {
                AbstractC11918l abstractC11918l = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().f25097l;
                AbstractC8859l abstractC8859l2 = this.q;
                abstractC8859l2.loadAd();
                this.q = abstractC11918l.amazon(abstractC8859l2.loadAd.signatures(), this.q.purchase().signatures());
            }
            eCParameterSpecConvertSpec = null;
        }
        this.ecSpec = eCParameterSpecConvertSpec;
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, C7838l c7838l) {
        return new ECParameterSpec(ellipticCurve, EC5Util.convertPoint(c7838l.f16358l), c7838l.f16362l, c7838l.f16361l.intValue());
    }

    private void extractBytes(byte[] bArr, int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i2 = 0; i2 != 32; i2++) {
            bArr[i + i2] = byteArray[(byteArray.length - 1) - i2];
        }
    }

    private void populateFromPubKeyInfo(C17029l c17029l) {
        AbstractC11918l abstractC11918l;
        byte b;
        C10198l c10198l = c17029l.f33175l;
        advert advertVar = c17029l.f33174l;
        Cfor cfor = c10198l.f20787l;
        applovin applovinVar = c10198l.f20786l;
        if (cfor.ad(InterfaceC11987l.smaato)) {
            this.algorithm = "ECGOST3410";
            try {
                byte[] bArr = ((Cthrow) Ccase.advert(advertVar.applovin())).f36593l;
                byte[] bArr2 = new byte[65];
                bArr2[0] = 4;
                for (int i = 1; i <= 32; i++) {
                    bArr2[i] = bArr[32 - i];
                    bArr2[i + 32] = bArr[64 - i];
                }
                C13777l c13777lVip = C13777l.vip(applovinVar);
                this.gostParams = c13777lVip;
                C17209l c17209lLoadAd = AbstractC7016l.loadAd(AbstractC11696l.purchase(c13777lVip.f26893l));
                AbstractC11918l abstractC11918l2 = c17209lLoadAd.f25097l;
                EllipticCurve ellipticCurveConvertCurve = EC5Util.convertCurve(abstractC11918l2, c17209lLoadAd.f25096l);
                this.q = abstractC11918l2.mopub(bArr2);
                this.ecSpec = new C10825l(AbstractC11696l.purchase(this.gostParams.f26893l), ellipticCurveConvertCurve, EC5Util.convertPoint(c17209lLoadAd.f25095l), c17209lLoadAd.f25099l, c17209lLoadAd.f25098l);
                return;
            } catch (IOException unused) {
                C8339l.metrica("error recovering public key");
                return;
            }
        }
        Ccase ccase = C7130l.vip(applovinVar).f14935l;
        if (ccase instanceof Cfor) {
            Cfor cfor2 = (Cfor) ccase;
            C7100l namedCurveByOid = ECUtil.getNamedCurveByOid(cfor2);
            abstractC11918l = namedCurveByOid.f14871l.f6465l;
            this.ecSpec = new C10825l(ECUtil.getCurveName(cfor2), EC5Util.convertCurve(abstractC11918l, namedCurveByOid.metrica()), EC5Util.convertPoint(namedCurveByOid.f14870l.vip()), namedCurveByOid.f14874l, namedCurveByOid.f14873l);
        } else if (ccase instanceof Cvolatile) {
            this.ecSpec = null;
            abstractC11918l = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().f25097l;
        } else {
            C7100l c7100lVip = C7100l.vip(ccase);
            abstractC11918l = c7100lVip.f14871l.f6465l;
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(abstractC11918l, c7100lVip.metrica()), EC5Util.convertPoint(c7100lVip.f14870l.vip()), c7100lVip.f14874l, c7100lVip.f14873l.intValue());
        }
        byte[] bArrApplovin = advertVar.applovin();
        Cthrow c11327l = new C11327l(bArrApplovin);
        if (bArrApplovin[0] == 4 && bArrApplovin[1] == bArrApplovin.length - 2 && (((b = bArrApplovin[2]) == 2 || b == 3) && abstractC11918l.firebase() >= bArrApplovin.length - 3)) {
            try {
                c11327l = (Cthrow) Ccase.advert(bArrApplovin);
            } catch (IOException unused2) {
                C8339l.metrica("error recovering public key");
                return;
            }
        }
        byte[] bArrCrashlytics = AbstractC14024l.crashlytics(c11327l.f36593l);
        new C11327l(bArrCrashlytics);
        this.q = abstractC11918l.mopub(bArrCrashlytics).startapp();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        populateFromPubKeyInfo(C17029l.vip(Ccase.advert((byte[]) objectInputStream.readObject())));
        this.algorithm = (String) objectInputStream.readObject();
        this.withCompression = objectInputStream.readBoolean();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getEncoded());
        objectOutputStream.writeObject(this.algorithm);
        objectOutputStream.writeBoolean(this.withCompression);
    }

    public AbstractC8859l engineGetQ() {
        return this.q;
    }

    public C12726l engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof JCEECPublicKey)) {
            return false;
        }
        JCEECPublicKey jCEECPublicKey = (JCEECPublicKey) obj;
        return engineGetQ().amazon(jCEECPublicKey.engineGetQ()) && engineGetSpec().equals(jCEECPublicKey.engineGetSpec());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        C7130l c7130l;
        C17029l c17029l;
        if (this.algorithm.equals("ECGOST3410")) {
            applovin c7130l2 = this.gostParams;
            if (c7130l2 == null) {
                ECParameterSpec eCParameterSpec = this.ecSpec;
                if (eCParameterSpec instanceof C10825l) {
                    c7130l2 = new C13777l(AbstractC11696l.billing(((C10825l) eCParameterSpec).f21882l), InterfaceC11987l.metrica);
                } else {
                    AbstractC11918l abstractC11918lConvertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                    c7130l2 = new C7130l(new C7100l(abstractC11918lConvertCurve, new C16217l(EC5Util.convertPoint(abstractC11918lConvertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
                }
            }
            AbstractC8859l abstractC8859l = this.q;
            abstractC8859l.loadAd();
            BigInteger bigIntegerSignatures = abstractC8859l.loadAd.signatures();
            BigInteger bigIntegerSignatures2 = this.q.purchase().signatures();
            byte[] bArr = new byte[64];
            extractBytes(bArr, 0, bigIntegerSignatures);
            extractBytes(bArr, 32, bigIntegerSignatures2);
            try {
                c17029l = new C17029l(new C10198l(InterfaceC11987l.smaato, c7130l2), new C11327l(bArr));
            } catch (IOException unused) {
                return null;
            }
        } else {
            ECParameterSpec eCParameterSpec2 = this.ecSpec;
            if (eCParameterSpec2 instanceof C10825l) {
                Cfor namedCurveOid = ECUtil.getNamedCurveOid(((C10825l) eCParameterSpec2).f21882l);
                if (namedCurveOid == null) {
                    namedCurveOid = new Cfor(((C10825l) this.ecSpec).f21882l);
                }
                c7130l = new C7130l(namedCurveOid);
            } else if (eCParameterSpec2 == null) {
                c7130l = new C7130l();
            } else {
                AbstractC11918l abstractC11918lConvertCurve2 = EC5Util.convertCurve(eCParameterSpec2.getCurve());
                c7130l = new C7130l(new C7100l(abstractC11918lConvertCurve2, new C16217l(EC5Util.convertPoint(abstractC11918lConvertCurve2, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
            c17029l = new C17029l(new C10198l(InterfaceC15427l.f30173l, c7130l), getQ().admob(this.withCompression));
        }
        return KeyUtil.getEncodedSubjectPublicKeyInfo(c17029l);
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
        ECParameterSpec eCParameterSpec = this.ecSpec;
        AbstractC8859l abstractC8859l = this.q;
        return eCParameterSpec == null ? abstractC8859l.startapp().crashlytics() : abstractC8859l;
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
        return EC5Util.convertPoint(this.q);
    }

    public int hashCode() {
        return engineGetSpec().hashCode() ^ engineGetQ().hashCode();
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EC Public Key");
        String str = AbstractC9008l.yandex;
        sb.append(str);
        sb.append("            X: ");
        AbstractC8859l abstractC8859l = this.q;
        abstractC8859l.loadAd();
        sb.append(abstractC8859l.loadAd.signatures().toString(16));
        sb.append(str);
        sb.append("            Y: ");
        sb.append(this.q.purchase().signatures().toString(16));
        sb.append(str);
        return sb.toString();
    }

    public JCEECPublicKey(String str, C4148l c4148l) {
        this.algorithm = str;
        this.q = c4148l.f8515l;
        this.ecSpec = null;
    }

    public JCEECPublicKey(String str, C4148l c4148l, C12726l c12726l) {
        ECParameterSpec eCParameterSpecConvertSpec;
        this.algorithm = "EC";
        C7838l c7838l = c4148l.f4542l;
        this.algorithm = str;
        this.q = c4148l.f8515l;
        if (c12726l == null) {
            eCParameterSpecConvertSpec = createSpec(EC5Util.convertCurve(c7838l.f16360l, AbstractC14024l.crashlytics(c7838l.f16359l)), c7838l);
        } else {
            eCParameterSpecConvertSpec = EC5Util.convertSpec(EC5Util.convertCurve(c12726l.f25097l, c12726l.f25096l), c12726l);
        }
        this.ecSpec = eCParameterSpecConvertSpec;
    }

    public JCEECPublicKey(String str, C4148l c4148l, ECParameterSpec eCParameterSpec) {
        this.algorithm = "EC";
        C7838l c7838l = c4148l.f4542l;
        this.algorithm = str;
        this.q = c4148l.f8515l;
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(EC5Util.convertCurve(c7838l.f16360l, AbstractC14024l.crashlytics(c7838l.f16359l)), c7838l);
        } else {
            this.ecSpec = eCParameterSpec;
        }
    }

    public JCEECPublicKey(C17029l c17029l) {
        this.algorithm = "EC";
        populateFromPubKeyInfo(c17029l);
    }

    public JCEECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec) {
        this.algorithm = str;
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.q = EC5Util.convertPoint(params, eCPublicKeySpec.getW());
    }

    public JCEECPublicKey(String str, JCEECPublicKey jCEECPublicKey) {
        this.algorithm = str;
        this.q = jCEECPublicKey.q;
        this.ecSpec = jCEECPublicKey.ecSpec;
        this.withCompression = jCEECPublicKey.withCompression;
        this.gostParams = jCEECPublicKey.gostParams;
    }

    public JCEECPublicKey(ECPublicKey eCPublicKey) {
        this.algorithm = "EC";
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.q = EC5Util.convertPoint(params, eCPublicKey.getW());
    }
}

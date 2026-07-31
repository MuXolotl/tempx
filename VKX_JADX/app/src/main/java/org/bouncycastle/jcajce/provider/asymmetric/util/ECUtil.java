package org.bouncycastle.jcajce.provider.asymmetric.util;

import defpackage.AbstractC0676l;
import defpackage.AbstractC11918l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC1624l;
import defpackage.AbstractC17195l;
import defpackage.AbstractC18276l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC8831l;
import defpackage.AbstractC8859l;
import defpackage.AbstractC9008l;
import defpackage.C12726l;
import defpackage.C16732l;
import defpackage.C17029l;
import defpackage.C17209l;
import defpackage.C17951l;
import defpackage.C18073l;
import defpackage.C18119l;
import defpackage.C2542l;
import defpackage.C2756l;
import defpackage.C4148l;
import defpackage.C7100l;
import defpackage.C7130l;
import defpackage.C7838l;
import defpackage.C8339l;
import defpackage.C8374l;
import defpackage.Ccase;
import defpackage.Cfor;
import defpackage.Cvolatile;
import defpackage.InterfaceC0885l;
import defpackage.InterfaceC18238l;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class ECUtil {
    public static int[] convertMidTerms(int[] iArr) {
        int i;
        int[] iArr2 = new int[3];
        if (iArr.length == 1) {
            iArr2[0] = iArr[0];
            return iArr2;
        }
        if (iArr.length != 3) {
            C8339l.metrica("Only Trinomials and pentanomials supported");
            return null;
        }
        int i2 = iArr[0];
        int i3 = iArr[1];
        if (i2 < i3 && i2 < (i = iArr[2])) {
            iArr2[0] = i2;
            if (i3 < i) {
                iArr2[1] = i3;
                iArr2[2] = i;
                return iArr2;
            }
            iArr2[1] = i;
            iArr2[2] = iArr[1];
            return iArr2;
        }
        int i4 = iArr[2];
        if (i3 < i4) {
            iArr2[0] = i3;
            int i5 = iArr[0];
            if (i5 < i4) {
                iArr2[1] = i5;
                iArr2[2] = i4;
                return iArr2;
            }
            iArr2[1] = i4;
            iArr2[2] = i5;
            return iArr2;
        }
        iArr2[0] = i4;
        int i6 = iArr[0];
        if (i6 < i3) {
            iArr2[1] = i6;
            iArr2[2] = iArr[1];
            return iArr2;
        }
        iArr2[1] = i3;
        iArr2[2] = i6;
        return iArr2;
    }

    public static String generateKeyFingerprint(AbstractC8859l abstractC8859l, C12726l c12726l) {
        AbstractC11918l abstractC11918l = c12726l.f25097l;
        AbstractC8859l abstractC8859l2 = c12726l.f25095l;
        char[] cArr = AbstractC0676l.yandex;
        int i = 0;
        byte[] bArrAdmob = abstractC8859l.admob(false);
        if (abstractC11918l == null) {
            if (160 % 8 != 0) {
                C8339l.metrica("bitLength must be a multiple of 8");
                return null;
            }
            C17951l c17951l = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            c17951l.billing(0, bArrAdmob.length, bArrAdmob);
            int i2 = 160 / 8;
            byte[] bArr = new byte[i2];
            c17951l.crashlytics(0, i2, bArr);
            StringBuilder sb = new StringBuilder();
            while (i != bArr.length) {
                if (i > 0) {
                    sb.append(":");
                }
                sb.append(cArr[(bArr[i] >>> 4) & 15]);
                sb.append(cArr[bArr[i] & 15]);
                i++;
            }
            return sb.toString();
        }
        byte[] bArrSubs = AbstractC14024l.subs(bArrAdmob, abstractC11918l.loadAd.isPro(), abstractC11918l.crashlytics.isPro(), abstractC8859l2.admob(false));
        if (160 % 8 != 0) {
            C8339l.metrica("bitLength must be a multiple of 8");
            return null;
        }
        C17951l c17951l2 = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        c17951l2.billing(0, bArrSubs.length, bArrSubs);
        int i3 = 160 / 8;
        byte[] bArr2 = new byte[i3];
        c17951l2.crashlytics(0, i3, bArr2);
        StringBuilder sb2 = new StringBuilder();
        while (i != bArr2.length) {
            if (i > 0) {
                sb2.append(":");
            }
            sb2.append(cArr[(bArr2[i] >>> 4) & 15]);
            sb2.append(cArr[bArr2[i] & 15]);
            i++;
        }
        return sb2.toString();
    }

    public static AbstractC8831l generatePrivateKeyParameter(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof InterfaceC18238l) {
            InterfaceC18238l interfaceC18238l = (InterfaceC18238l) privateKey;
            C12726l parameters = interfaceC18238l.getParameters();
            if (parameters == null) {
                parameters = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            }
            if (!(interfaceC18238l.getParameters() instanceof C17209l)) {
                return new C8374l(interfaceC18238l.getD(), new C7838l(parameters.f25097l, parameters.f25095l, parameters.f25099l, parameters.f25098l, parameters.f25096l));
            }
            return new C8374l(interfaceC18238l.getD(), new C2542l(AbstractC17195l.firebase(((C17209l) interfaceC18238l.getParameters()).f33402l), parameters.f25097l, parameters.f25095l, parameters.f25099l, parameters.f25098l, parameters.f25096l));
        }
        if (privateKey instanceof ECPrivateKey) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) privateKey;
            C12726l c12726lConvertSpec = EC5Util.convertSpec(eCPrivateKey.getParams());
            return new C8374l(eCPrivateKey.getS(), new C7838l(c12726lConvertSpec.f25097l, c12726lConvertSpec.f25095l, c12726lConvertSpec.f25099l, c12726lConvertSpec.f25098l, c12726lConvertSpec.f25096l));
        }
        try {
            byte[] encoded = privateKey.getEncoded();
            if (encoded == null) {
                throw new InvalidKeyException("no encoding for EC private key");
            }
            PrivateKey privateKey2 = BouncyCastleProvider.getPrivateKey(C2756l.vip(encoded));
            if (privateKey2 instanceof ECPrivateKey) {
                return generatePrivateKeyParameter(privateKey2);
            }
            C18073l.smaato("can't identify EC private key.");
            return null;
        } catch (Exception e) {
            throw new InvalidKeyException(AbstractC5020l.ads(e, new StringBuilder("cannot identify EC private key: ")));
        }
    }

    public static AbstractC8831l generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof InterfaceC0885l) {
            InterfaceC0885l interfaceC0885l = (InterfaceC0885l) publicKey;
            C12726l parameters = interfaceC0885l.getParameters();
            return new C4148l(interfaceC0885l.getQ(), new C7838l(parameters.f25097l, parameters.f25095l, parameters.f25099l, parameters.f25098l, parameters.f25096l));
        }
        if (publicKey instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            C12726l c12726lConvertSpec = EC5Util.convertSpec(eCPublicKey.getParams());
            return new C4148l(EC5Util.convertPoint(eCPublicKey.getParams(), eCPublicKey.getW()), new C7838l(c12726lConvertSpec.f25097l, c12726lConvertSpec.f25095l, c12726lConvertSpec.f25099l, c12726lConvertSpec.f25098l, c12726lConvertSpec.f25096l));
        }
        try {
            byte[] encoded = publicKey.getEncoded();
            if (encoded == null) {
                throw new InvalidKeyException("no encoding for EC public key");
            }
            PublicKey publicKey2 = BouncyCastleProvider.getPublicKey(C17029l.vip(encoded));
            if (publicKey2 instanceof ECPublicKey) {
                return generatePublicKeyParameter(publicKey2);
            }
            C18073l.smaato("cannot identify EC public key.");
            return null;
        } catch (Exception e) {
            throw new InvalidKeyException(AbstractC5020l.ads(e, new StringBuilder("cannot identify EC public key: ")));
        }
    }

    public static String getCurveName(Cfor cfor) {
        return AbstractC17195l.subs(cfor);
    }

    public static C7838l getDomainParameters(ProviderConfiguration providerConfiguration, C7130l c7130l) {
        Ccase ccase = c7130l.f14935l;
        if (ccase instanceof Cfor) {
            Cfor cforM192throws = Cfor.m192throws(ccase);
            C7100l namedCurveByOid = getNamedCurveByOid(cforM192throws);
            if (namedCurveByOid == null) {
                namedCurveByOid = (C7100l) providerConfiguration.getAdditionalECParameters().get(cforM192throws);
            }
            return new C2542l(cforM192throws, namedCurveByOid);
        }
        if (ccase instanceof Cvolatile) {
            C12726l ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
            return new C7838l(ecImplicitlyCa.f25097l, ecImplicitlyCa.f25095l, ecImplicitlyCa.f25099l, ecImplicitlyCa.f25098l, ecImplicitlyCa.f25096l);
        }
        C7100l c7100lVip = C7100l.vip(ccase);
        return new C7838l(c7100lVip.f14871l.f6465l, c7100lVip.f14870l.vip(), c7100lVip.f14874l, c7100lVip.f14873l, c7100lVip.metrica());
    }

    public static String getNameFrom(AlgorithmParameterSpec algorithmParameterSpec) {
        return (String) AccessController.doPrivileged(new C18119l(algorithmParameterSpec, 0));
    }

    public static C7100l getNamedCurveByName(String str) {
        AbstractC18276l abstractC18276lPurchase = AbstractC1624l.purchase(str);
        C7100l c7100lAmazon = abstractC18276lPurchase == null ? null : abstractC18276lPurchase.amazon();
        return c7100lAmazon == null ? AbstractC17195l.mopub(str) : c7100lAmazon;
    }

    public static C7100l getNamedCurveByOid(Cfor cfor) {
        AbstractC18276l abstractC18276l = (AbstractC18276l) AbstractC1624l.crashlytics.get(cfor);
        C7100l c7100lAmazon = abstractC18276l == null ? null : abstractC18276l.amazon();
        return c7100lAmazon == null ? AbstractC17195l.admob(cfor) : c7100lAmazon;
    }

    public static Cfor getNamedCurveOid(C12726l c12726l) {
        Enumeration enumerationIsPro = AbstractC17195l.isPro();
        while (enumerationIsPro.hasMoreElements()) {
            String str = (String) enumerationIsPro.nextElement();
            C7100l c7100lMopub = AbstractC17195l.mopub(str);
            if (c7100lMopub.f14874l.equals(c12726l.f25099l) && c7100lMopub.f14873l.equals(c12726l.f25098l) && c7100lMopub.f14871l.f6465l.subs(c12726l.f25097l) && c7100lMopub.f14870l.vip().amazon(c12726l.f25095l)) {
                return AbstractC17195l.firebase(str);
            }
        }
        return null;
    }

    public static int getOrderBitLength(ProviderConfiguration providerConfiguration, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger != null) {
            return bigInteger.bitLength();
        }
        if (providerConfiguration == null) {
            return bigInteger2.bitLength();
        }
        C12726l ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
        return ecImplicitlyCa == null ? bigInteger2.bitLength() : ecImplicitlyCa.f25099l.bitLength();
    }

    public static String privateKeyToString(String str, BigInteger bigInteger, C12726l c12726l) {
        StringBuilder sb = new StringBuilder();
        String str2 = AbstractC9008l.yandex;
        AbstractC8859l abstractC8859lStartapp = new C16732l(0).loadAd(c12726l.f25095l, bigInteger).startapp();
        sb.append(str);
        sb.append(" Private Key [");
        sb.append(generateKeyFingerprint(abstractC8859lStartapp, c12726l));
        sb.append("]");
        sb.append(str2);
        sb.append("            X: ");
        abstractC8859lStartapp.loadAd();
        sb.append(abstractC8859lStartapp.loadAd.signatures().toString(16));
        sb.append(str2);
        sb.append("            Y: ");
        sb.append(abstractC8859lStartapp.purchase().signatures().toString(16));
        sb.append(str2);
        return sb.toString();
    }

    public static String publicKeyToString(String str, AbstractC8859l abstractC8859l, C12726l c12726l) {
        StringBuilder sb = new StringBuilder();
        String str2 = AbstractC9008l.yandex;
        sb.append(str);
        sb.append(" Public Key [");
        sb.append(generateKeyFingerprint(abstractC8859l, c12726l));
        sb.append("]");
        sb.append(str2);
        sb.append("            X: ");
        abstractC8859l.loadAd();
        sb.append(abstractC8859l.loadAd.signatures().toString(16));
        sb.append(str2);
        sb.append("            Y: ");
        sb.append(abstractC8859l.purchase().signatures().toString(16));
        sb.append(str2);
        return sb.toString();
    }

    public static Cfor getNamedCurveOid(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.length() == 0) {
            return null;
        }
        int iIndexOf = strTrim.indexOf(32);
        if (iIndexOf > 0) {
            strTrim = strTrim.substring(iIndexOf + 1);
        }
        Cfor cforM190private = Cfor.m190private(strTrim);
        return cforM190private != null ? cforM190private : AbstractC17195l.firebase(strTrim);
    }

    public static C7838l getDomainParameters(ProviderConfiguration providerConfiguration, C12726l c12726l) {
        if (c12726l instanceof C17209l) {
            C17209l c17209l = (C17209l) c12726l;
            return new C2542l(getNamedCurveOid(c17209l.f33402l), c17209l.f25097l, c17209l.f25095l, c17209l.f25099l, c17209l.f25098l, c17209l.f25096l);
        }
        if (c12726l == null) {
            C12726l ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
            return new C7838l(ecImplicitlyCa.f25097l, ecImplicitlyCa.f25095l, ecImplicitlyCa.f25099l, ecImplicitlyCa.f25098l, ecImplicitlyCa.f25096l);
        }
        return new C7838l(c12726l.f25097l, c12726l.f25095l, c12726l.f25099l, c12726l.f25098l, c12726l.f25096l);
    }
}

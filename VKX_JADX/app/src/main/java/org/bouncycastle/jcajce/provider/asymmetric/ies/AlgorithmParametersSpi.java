package org.bouncycastle.jcajce.provider.asymmetric.ies;

import defpackage.AbstractC14024l;
import defpackage.AbstractC9027l;
import defpackage.C11138l;
import defpackage.C11327l;
import defpackage.C17132l;
import defpackage.C18073l;
import defpackage.C18262l;
import defpackage.C1838l;
import defpackage.C6541l;
import defpackage.C9320l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.Cfinal;
import defpackage.Cstrictfp;
import defpackage.Cthrow;
import defpackage.ad;
import defpackage.applovin;
import defpackage.appmetrica;
import defpackage.signatures;
import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    C1838l currentSpec;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        try {
            appmetrica appmetricaVar = new appmetrica((byte) 0, 0);
            if (AbstractC14024l.crashlytics(this.currentSpec.f4246l) != null) {
                appmetricaVar.purchase(new C9320l(false, 0, new C11327l(AbstractC14024l.crashlytics(this.currentSpec.f4246l))));
            }
            if (AbstractC14024l.crashlytics(this.currentSpec.f4245l) != null) {
                appmetricaVar.purchase(new C9320l(false, 1, new C11327l(AbstractC14024l.crashlytics(this.currentSpec.f4245l))));
            }
            appmetricaVar.purchase(Cstrictfp.m4580private(this.currentSpec.f4244l));
            byte[] bArrCrashlytics = AbstractC14024l.crashlytics(this.currentSpec.f4247l);
            if (bArrCrashlytics != null) {
                appmetrica appmetricaVar2 = new appmetrica((byte) 0, 0);
                appmetricaVar2.purchase(Cstrictfp.m4580private(this.currentSpec.f4248l));
                appmetricaVar2.purchase(new C11327l(bArrCrashlytics));
                C11138l c11138l = new C11138l(appmetricaVar2);
                c11138l.f22357l = -1;
                appmetricaVar.purchase(c11138l);
            }
            appmetricaVar.purchase(this.currentSpec.f4249l ? signatures.f36567l : signatures.f36565l);
            C11138l c11138l2 = new C11138l(appmetricaVar);
            c11138l2.f22357l = -1;
            return c11138l2.remoteconfig("DER");
        } catch (IOException unused) {
            C18073l.license("Error encoding IESParameters");
            return null;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        if (cls != null) {
            return localEngineGetParameterSpec(cls);
        }
        C6541l.subs("argument to getParameterSpec must not be null");
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        try {
            Cclass cclass = (Cclass) Ccase.advert(bArr);
            if (cclass.size() > 5) {
                throw new IOException("sequence too big");
            }
            Enumeration enumerationMo170package = cclass.mo170package();
            BigInteger bigInteger = null;
            boolean zAppmetrica = false;
            BigInteger bigIntegerAppmetrica = null;
            byte[] bArr2 = null;
            byte[] bArr3 = null;
            byte[] bArr4 = null;
            while (enumerationMo170package.hasMoreElements()) {
                Object objNextElement = enumerationMo170package.nextElement();
                if (objNextElement instanceof Cfinal) {
                    Cfinal cfinalInmobi = Cfinal.inmobi(objNextElement);
                    int i = cfinalInmobi.f821l;
                    ad adVar = Cthrow.f36592l;
                    if (i == 0) {
                        AbstractC9027l.loadAd(cfinalInmobi);
                        Ccase ccaseApplovin = cfinalInmobi.applovin(false, adVar);
                        adVar.m230l(ccaseApplovin);
                        bArr2 = ((Cthrow) ccaseApplovin).f36593l;
                    } else if (i == 1) {
                        AbstractC9027l.loadAd(cfinalInmobi);
                        Ccase ccaseApplovin2 = cfinalInmobi.applovin(false, adVar);
                        adVar.m230l(ccaseApplovin2);
                        bArr3 = ((Cthrow) ccaseApplovin2).f36593l;
                    }
                } else if (objNextElement instanceof Cstrictfp) {
                    bigIntegerAppmetrica = Cstrictfp.premium(objNextElement).appmetrica();
                } else if (objNextElement instanceof Cclass) {
                    Cclass cclassInmobi = Cclass.inmobi(objNextElement);
                    BigInteger bigIntegerAppmetrica2 = Cstrictfp.premium(cclassInmobi.mo173throws(0)).appmetrica();
                    bArr4 = Cthrow.premium(cclassInmobi.mo173throws(1)).f36593l;
                    bigInteger = bigIntegerAppmetrica2;
                } else if (objNextElement instanceof signatures) {
                    zAppmetrica = signatures.applovin((applovin) objNextElement).appmetrica();
                }
            }
            BigInteger bigInteger2 = bigIntegerAppmetrica;
            this.currentSpec = bigInteger != null ? new C1838l(bArr2, bArr3, bigInteger2.intValue(), bigInteger.intValue(), bArr4, zAppmetrica) : new C1838l(bArr2, bArr3, bigInteger2.intValue(), -1, null, zAppmetrica);
        } catch (ArrayIndexOutOfBoundsException unused) {
            C18262l.metrica("Not a valid IES Parameter encoding.");
        } catch (ClassCastException unused2) {
            C18262l.metrica("Not a valid IES Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "IES Parameters";
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == C1838l.class || cls == AlgorithmParameterSpec.class) {
            return this.currentSpec;
        }
        C17132l.startapp("unknown parameter spec passed to ElGamal parameters object.");
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) {
        if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (algorithmParameterSpec instanceof C1838l) {
            this.currentSpec = (C1838l) algorithmParameterSpec;
        } else {
            C17132l.startapp("IESParameterSpec required to initialise a IES algorithm parameters object");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
            engineInit(bArr);
        } else {
            C18262l.metrica("Unknown parameter format ".concat(str));
        }
    }
}

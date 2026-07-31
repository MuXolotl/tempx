package org.bouncycastle.jcajce.provider.asymmetric.gost;

import defpackage.C0419l;
import defpackage.C11138l;
import defpackage.C13777l;
import defpackage.C17132l;
import defpackage.C18073l;
import defpackage.C18262l;
import defpackage.C6230l;
import defpackage.C6541l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.Cfor;
import defpackage.appmetrica;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

/* JADX INFO: loaded from: classes3.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    C6230l currentSpec;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        Cfor cfor = new Cfor(this.currentSpec.f13161l);
        Cfor cfor2 = new Cfor(this.currentSpec.f13160l);
        Cfor cfor3 = new Cfor(this.currentSpec.f13163l);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            appmetrica appmetricaVar = new appmetrica(3, 0);
            appmetricaVar.purchase(cfor);
            appmetricaVar.purchase(cfor2);
            appmetricaVar.purchase(cfor3);
            C11138l c11138l = new C11138l(appmetricaVar);
            c11138l.f22357l = -1;
            c11138l.tapsense(byteArrayOutputStream, "DER");
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            C18073l.license("Error encoding GOST3410Parameters");
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
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
            engineInit(bArr);
        } else {
            C18262l.metrica("Unknown parameter format ".concat(str));
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "GOST3410 Parameters";
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == C0419l.class || cls == AlgorithmParameterSpec.class) {
            return this.currentSpec;
        }
        C17132l.startapp("unknown parameter spec passed to GOST3410 parameters object.");
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        try {
            this.currentSpec = C6230l.yandex(C13777l.vip((Cclass) Ccase.advert(bArr)));
        } catch (ArrayIndexOutOfBoundsException unused) {
            C18262l.metrica("Not a valid GOST3410 Parameter encoding.");
        } catch (ClassCastException unused2) {
            C18262l.metrica("Not a valid GOST3410 Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (algorithmParameterSpec instanceof C6230l) {
            this.currentSpec = (C6230l) algorithmParameterSpec;
        } else {
            C17132l.startapp("GOST3410ParameterSpec required to initialise a GOST3410 algorithm parameters object");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) {
        if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
            return engineGetEncoded();
        }
        return null;
    }
}

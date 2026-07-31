package org.bouncycastle.jce.provider;

import defpackage.AbstractC0653l;
import defpackage.AbstractC16164l;
import defpackage.AbstractC9027l;
import defpackage.C14148l;
import defpackage.C17900l;
import defpackage.C5427l;
import defpackage.C8339l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.Cfinal;
import defpackage.Cfor;
import defpackage.Cinterface;
import defpackage.Csynchronized;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC9124l;
import defpackage.ad;
import defpackage.applovin;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class X509AttrCertParser extends AbstractC16164l {
    private static final PEMUtil PEM_PARSER = new PEMUtil("ATTRIBUTE CERTIFICATE");
    private Cinterface sData = null;
    private int sDataObjectCount = 0;
    private InputStream currentStream = null;

    private InterfaceC9124l getCertificate() {
        if (this.sData == null) {
            return null;
        }
        while (true) {
            int i = this.sDataObjectCount;
            applovin[] applovinVarArr = this.sData.f842l;
            if (i >= applovinVarArr.length) {
                return null;
            }
            this.sDataObjectCount = i + 1;
            applovin applovinVar = applovinVarArr[i];
            if (applovinVar instanceof Cfinal) {
                Cfinal cfinal = (Cfinal) applovinVar;
                if (cfinal.f821l == 2) {
                    AbstractC9027l.loadAd(cfinal);
                    ad adVar = Cclass.f503l;
                    Ccase ccaseApplovin = cfinal.applovin(false, adVar);
                    adVar.m230l(ccaseApplovin);
                    return new C5427l(((Cclass) ccaseApplovin).getEncoded());
                }
            }
        }
    }

    private InterfaceC9124l readDERCertificate(InputStream inputStream) {
        Cclass cclassInmobi = Cclass.inmobi(new Csynchronized(inputStream).ads());
        if (cclassInmobi.size() <= 1 || !(cclassInmobi.mo173throws(0) instanceof Cfor) || !cclassInmobi.mo173throws(0).equals(InterfaceC0543l.f1902l)) {
            return new C5427l(cclassInmobi.getEncoded());
        }
        Enumeration enumerationMo170package = Cclass.appmetrica((Cfinal) cclassInmobi.mo173throws(1), true).mo170package();
        C14148l.vip(enumerationMo170package.nextElement());
        Cinterface cinterface = null;
        while (enumerationMo170package.hasMoreElements()) {
            Ccase ccase = (Ccase) enumerationMo170package.nextElement();
            if (ccase instanceof Cfinal) {
                Cfinal cfinal = (Cfinal) ccase;
                int i = cfinal.f821l;
                ad adVar = Cinterface.f840l;
                if (i == 0) {
                    AbstractC9027l.loadAd(cfinal);
                    Ccase ccaseApplovin = cfinal.applovin(false, adVar);
                    adVar.m230l(ccaseApplovin);
                    cinterface = (Cinterface) ccaseApplovin;
                } else {
                    if (i != 1) {
                        C8339l.metrica(AbstractC0653l.vip(i, "unknown tag value "));
                        return null;
                    }
                    AbstractC9027l.loadAd(cfinal);
                    Ccase ccaseApplovin2 = cfinal.applovin(false, adVar);
                    adVar.m230l(ccaseApplovin2);
                }
            }
        }
        this.sData = cinterface;
        return getCertificate();
    }

    private InterfaceC9124l readPEMCertificate(InputStream inputStream) throws IOException {
        Cclass pEMObject = PEM_PARSER.readPEMObject(inputStream);
        if (pEMObject != null) {
            return new C5427l(pEMObject.getEncoded());
        }
        return null;
    }

    public void engineInit(InputStream inputStream) {
        this.currentStream = inputStream;
        this.sData = null;
        this.sDataObjectCount = 0;
        if (inputStream.markSupported()) {
            return;
        }
        this.currentStream = new BufferedInputStream(this.currentStream);
    }

    public Object engineRead() throws C17900l {
        try {
            Cinterface cinterface = this.sData;
            if (cinterface != null) {
                if (this.sDataObjectCount != cinterface.f842l.length) {
                    return getCertificate();
                }
                this.sData = null;
                this.sDataObjectCount = 0;
                return null;
            }
            this.currentStream.mark(10);
            int i = this.currentStream.read();
            if (i == -1) {
                return null;
            }
            InputStream inputStream = this.currentStream;
            if (i != 48) {
                inputStream.reset();
                return readPEMCertificate(this.currentStream);
            }
            inputStream.reset();
            return readDERCertificate(this.currentStream);
        } catch (Exception e) {
            throw new C17900l(e.toString(), e);
        }
    }

    public Collection engineReadAll() {
        ArrayList arrayList = new ArrayList();
        while (true) {
            InterfaceC9124l interfaceC9124l = (InterfaceC9124l) engineRead();
            if (interfaceC9124l == null) {
                return arrayList;
            }
            arrayList.add(interfaceC9124l);
        }
    }
}

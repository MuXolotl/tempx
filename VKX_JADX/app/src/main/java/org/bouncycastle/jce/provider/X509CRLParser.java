package org.bouncycastle.jce.provider;

import defpackage.AbstractC0653l;
import defpackage.AbstractC16164l;
import defpackage.AbstractC9027l;
import defpackage.C0649l;
import defpackage.C14148l;
import defpackage.C17900l;
import defpackage.C8339l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.Cfinal;
import defpackage.Cfor;
import defpackage.Cinterface;
import defpackage.Csynchronized;
import defpackage.InterfaceC0543l;
import defpackage.ad;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CRL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class X509CRLParser extends AbstractC16164l {
    private static final PEMUtil PEM_PARSER = new PEMUtil("CRL");
    private Cinterface sData = null;
    private int sDataObjectCount = 0;
    private InputStream currentStream = null;

    private CRL getCRL() {
        Cinterface cinterface = this.sData;
        if (cinterface == null || this.sDataObjectCount >= cinterface.f842l.length) {
            return null;
        }
        Cinterface cinterface2 = this.sData;
        int i = this.sDataObjectCount;
        this.sDataObjectCount = i + 1;
        return new X509CRLObject(C0649l.vip(cinterface2.f842l[i]));
    }

    private CRL readDERCRL(InputStream inputStream) {
        Cclass cclass = (Cclass) new Csynchronized(inputStream).ads();
        if (cclass.size() <= 1 || !(cclass.mo173throws(0) instanceof Cfor) || !cclass.mo173throws(0).equals(InterfaceC0543l.f1902l)) {
            return new X509CRLObject(C0649l.vip(cclass));
        }
        Enumeration enumerationMo170package = Cclass.appmetrica((Cfinal) cclass.mo173throws(1), true).mo170package();
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
                } else {
                    if (i != 1) {
                        C8339l.metrica(AbstractC0653l.vip(i, "unknown tag value "));
                        return null;
                    }
                    AbstractC9027l.loadAd(cfinal);
                    Ccase ccaseApplovin2 = cfinal.applovin(false, adVar);
                    adVar.m230l(ccaseApplovin2);
                    cinterface = (Cinterface) ccaseApplovin2;
                }
            }
        }
        this.sData = cinterface;
        return getCRL();
    }

    private CRL readPEMCRL(InputStream inputStream) throws IOException {
        Cclass pEMObject = PEM_PARSER.readPEMObject(inputStream);
        if (pEMObject != null) {
            return new X509CRLObject(C0649l.vip(pEMObject));
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
                    return getCRL();
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
                return readPEMCRL(this.currentStream);
            }
            inputStream.reset();
            return readDERCRL(this.currentStream);
        } catch (Exception e) {
            throw new C17900l(e.toString(), e);
        }
    }

    public Collection engineReadAll() {
        ArrayList arrayList = new ArrayList();
        while (true) {
            CRL crl = (CRL) engineRead();
            if (crl == null) {
                return arrayList;
            }
            arrayList.add(crl);
        }
    }
}

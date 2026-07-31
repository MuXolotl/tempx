package org.bouncycastle.jce.provider;

import defpackage.AbstractC16164l;
import defpackage.C10818l;
import defpackage.C10938l;
import defpackage.C17900l;
import defpackage.C7208l;
import defpackage.C7633l;
import defpackage.Cclass;
import defpackage.Csynchronized;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public class X509CertPairParser extends AbstractC16164l {
    private InputStream currentStream = null;

    private C7208l readDERCrossCertificatePair(InputStream inputStream) {
        C10938l c10938lVip = C10938l.vip((Cclass) new Csynchronized(inputStream).ads());
        C7208l c7208l = new C7208l();
        new C7633l();
        C10818l c10818l = c10938lVip.f22059l;
        C10818l c10818l2 = c10938lVip.f22058l;
        if (c10818l != null) {
            c7208l.yandex = new X509CertificateObject(c10938lVip.f22059l);
        }
        if (c10818l2 != null) {
            c7208l.loadAd = new X509CertificateObject(c10818l2);
        }
        return c7208l;
    }

    public void engineInit(InputStream inputStream) {
        this.currentStream = inputStream;
        if (inputStream.markSupported()) {
            return;
        }
        this.currentStream = new BufferedInputStream(this.currentStream);
    }

    public Object engineRead() throws C17900l {
        try {
            this.currentStream.mark(10);
            if (this.currentStream.read() == -1) {
                return null;
            }
            this.currentStream.reset();
            return readDERCrossCertificatePair(this.currentStream);
        } catch (Exception e) {
            throw new C17900l(e.toString(), e);
        }
    }

    public Collection engineReadAll() {
        ArrayList arrayList = new ArrayList();
        while (true) {
            C7208l c7208l = (C7208l) engineRead();
            if (c7208l == null) {
                return arrayList;
            }
            arrayList.add(c7208l);
        }
    }
}

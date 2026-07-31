package org.bouncycastle.jce.provider;

import defpackage.AbstractC17025l;
import defpackage.AbstractC9137l;
import defpackage.AbstractC9690l;
import defpackage.C5970l;
import defpackage.InterfaceC0168l;
import defpackage.InterfaceC15681l;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public class X509StoreLDAPCerts extends AbstractC9690l {
    private AbstractC17025l helper;

    private Collection getCertificatesFromCrossCertificatePairs(C5970l c5970l) {
        new HashSet();
        new C5970l();
        throw null;
    }

    public Collection engineGetMatches(InterfaceC0168l interfaceC0168l) {
        if (!(interfaceC0168l instanceof C5970l)) {
            return Collections.EMPTY_SET;
        }
        C5970l c5970l = (C5970l) interfaceC0168l;
        new HashSet();
        if (c5970l.getBasicConstraints() > 0) {
            this.helper.getClass();
            throw null;
        }
        int basicConstraints = c5970l.getBasicConstraints();
        AbstractC17025l abstractC17025l = this.helper;
        if (basicConstraints == -2) {
            abstractC17025l.getClass();
            throw null;
        }
        abstractC17025l.getClass();
        throw null;
    }

    public void engineInit(InterfaceC15681l interfaceC15681l) {
        throw new IllegalArgumentException("Initialization parameters must be an instance of " + AbstractC9137l.class.getName() + ".");
    }
}

package org.bouncycastle.jce.provider;

import defpackage.AbstractC13346l;
import defpackage.AbstractC17025l;
import defpackage.AbstractC9137l;
import defpackage.AbstractC9690l;
import defpackage.InterfaceC0168l;
import defpackage.InterfaceC15681l;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public class X509StoreLDAPCertPairs extends AbstractC9690l {
    private AbstractC17025l helper;

    public Collection engineGetMatches(InterfaceC0168l interfaceC0168l) {
        if (!(interfaceC0168l instanceof AbstractC13346l)) {
            return Collections.EMPTY_SET;
        }
        new HashSet();
        this.helper.getClass();
        throw null;
    }

    public void engineInit(InterfaceC15681l interfaceC15681l) {
        throw new IllegalArgumentException("Initialization parameters must be an instance of " + AbstractC9137l.class.getName() + ".");
    }
}

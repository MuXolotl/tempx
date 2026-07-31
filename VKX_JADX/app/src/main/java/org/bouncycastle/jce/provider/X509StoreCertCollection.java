package org.bouncycastle.jce.provider;

import defpackage.AbstractC9690l;
import defpackage.C9313l;
import defpackage.InterfaceC0168l;
import defpackage.InterfaceC15681l;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public class X509StoreCertCollection extends AbstractC9690l {
    private C9313l _store;

    public Collection engineGetMatches(InterfaceC0168l interfaceC0168l) {
        return this._store.getMatches(interfaceC0168l);
    }

    public void engineInit(InterfaceC15681l interfaceC15681l) {
        throw new IllegalArgumentException(interfaceC15681l.toString());
    }
}

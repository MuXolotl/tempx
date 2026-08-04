package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: lٍؕؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9313l implements InterfaceC14413l, Iterable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public ArrayList f19125l;

    @Override // defpackage.InterfaceC14413l
    public final Collection getMatches(InterfaceC0168l interfaceC0168l) {
        ArrayList arrayList = this.f19125l;
        if (interfaceC0168l == null) {
            return new ArrayList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (interfaceC0168l.mopub(obj)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((ArrayList) getMatches(null)).iterator();
    }
}

package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: lُؗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5030l extends AbstractC9813l implements List, Collection, InterfaceC2356l {
    public abstract AbstractC5030l ad(int i, Object obj);

    public abstract AbstractC5030l advert(Object obj);

    public abstract AbstractC5030l applovin(int i);

    public abstract AbstractC5030l appmetrica(int i, Object obj);

    @Override // defpackage.AbstractC7095l, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.AbstractC7095l, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public AbstractC5030l isVip(Collection collection) {
        C0266l c0266lSignatures = signatures();
        c0266lSignatures.addAll(collection);
        return c0266lSignatures.advert();
    }

    @Override // defpackage.AbstractC9813l, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract AbstractC5030l premium(C1195l c1195l);

    public abstract C0266l signatures();

    @Override // defpackage.AbstractC9813l, java.util.List
    public final List subList(int i, int i2) {
        return new C15882l(this, i, i2);
    }
}

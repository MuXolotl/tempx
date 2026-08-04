package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: l٘ٞؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18082l extends AbstractC9813l implements InterfaceC13238l, Collection, InterfaceC2356l {
    public abstract AbstractC18082l ad(Object obj);

    public AbstractC18082l advert(Collection collection) {
        if (collection.isEmpty()) {
            return this;
        }
        C1637l c1637lIsVip = isVip();
        c1637lIsVip.addAll(collection);
        return c1637lIsVip.advert();
    }

    @Override // defpackage.AbstractC7095l, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.AbstractC7095l, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
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

    public abstract C1637l isVip();

    @Override // defpackage.AbstractC9813l, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract AbstractC18082l signatures(int i);

    @Override // defpackage.AbstractC9813l, java.util.List
    public final List subList(int i, int i2) {
        return new C17394l(this, i, i2);
    }
}

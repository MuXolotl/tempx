package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* JADX INFO: renamed from: lٌؙؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8562l extends C8833l implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f18139l).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f18139l.iterator();
        it.getClass();
        InterfaceC0629l interfaceC0629l = this.f18138l;
        interfaceC0629l.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC0629l.apply(next)) {
                return next;
            }
        }
        C4875l.firebase();
        return null;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new C8562l(((SortedSet) this.f18139l).headSet(obj), this.f18138l);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f18139l;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f18138l.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new C8562l(((SortedSet) this.f18139l).subSet(obj, obj2), this.f18138l);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new C8562l(((SortedSet) this.f18139l).tailSet(obj), this.f18138l);
    }
}

package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lٍۣۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C9898l extends AbstractC1979l implements List {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2168l f20132l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9898l(AbstractC2168l abstractC2168l, Object obj, List list, AbstractC1979l abstractC1979l) {
        super(abstractC2168l, obj, list, abstractC1979l);
        this.f20132l = abstractC2168l;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        billing();
        boolean zIsEmpty = this.f4493l.isEmpty();
        ((List) this.f4493l).add(i, obj);
        this.f20132l.f4809l++;
        if (zIsEmpty) {
            amazon();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f4493l).addAll(i, collection);
        if (zAddAll) {
            this.f20132l.f4809l += this.f4493l.size() - size;
            if (size == 0) {
                amazon();
            }
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        billing();
        return ((List) this.f4493l).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        billing();
        return ((List) this.f4493l).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        billing();
        return ((List) this.f4493l).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        billing();
        return new C9936l(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        billing();
        Object objRemove = ((List) this.f4493l).remove(i);
        this.f20132l.f4809l--;
        mopub();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        billing();
        return ((List) this.f4493l).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        billing();
        List listSubList = ((List) this.f4493l).subList(i, i2);
        AbstractC1979l abstractC1979l = this.f4492l;
        if (abstractC1979l == null) {
            abstractC1979l = this;
        }
        boolean z = listSubList instanceof RandomAccess;
        AbstractC2168l abstractC2168l = this.f20132l;
        Object obj = this.f4494l;
        return z ? new C15139l(abstractC2168l, obj, listSubList, abstractC1979l) : new C9898l(abstractC2168l, obj, listSubList, abstractC1979l);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        billing();
        return new C9936l(this, i);
    }
}

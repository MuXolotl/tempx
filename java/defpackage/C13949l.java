package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: lٓؗؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13949l extends AbstractC16029l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C13949l f27246l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final transient AbstractC1186l f27247l;

    static {
        C9258l c9258l = AbstractC1186l.f3181l;
        f27246l = new C13949l(C13708l.f26763l, C0058l.f957l);
    }

    public C13949l(AbstractC1186l abstractC1186l, Comparator comparator) {
        super(comparator);
        this.f27247l = abstractC1186l;
    }

    public final C13949l ad(int i, int i2) {
        AbstractC1186l abstractC1186l = this.f27247l;
        if (i == 0 && i2 == abstractC1186l.size()) {
            return this;
        }
        Comparator comparator = this.f31420l;
        if (i < i2) {
            return new C13949l(abstractC1186l.subList(i, i2), comparator);
        }
        return C0058l.f957l != comparator ? new C13949l(C13708l.f26763l, comparator) : f27246l;
    }

    @Override // defpackage.AbstractC5511l
    public final int admob() {
        return this.f27247l.admob();
    }

    public final int advert(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f27247l, obj, this.f31420l);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    @Override // defpackage.AbstractC8481l, defpackage.AbstractC5511l
    public final AbstractC1186l amazon() {
        return this.f27247l;
    }

    @Override // defpackage.AbstractC5511l
    public final int billing(int i, Object[] objArr) {
        return this.f27247l.billing(i, objArr);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iIsVip = isVip(obj, true);
        AbstractC1186l abstractC1186l = this.f27247l;
        if (iIsVip == abstractC1186l.size()) {
            return null;
        }
        return abstractC1186l.get(iIsVip);
    }

    @Override // defpackage.AbstractC5511l, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f27247l, obj, this.f31420l) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof AbstractC10977l) {
            collection = ((C8970l) ((AbstractC10977l) collection)).vip();
        }
        Comparator comparator = this.f31420l;
        if (!AbstractC18648l.crashlytics(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        AbstractC10199l it = iterator();
        Iterator it2 = collection.iterator();
        AbstractC6399l abstractC6399l = (AbstractC6399l) it;
        if (!abstractC6399l.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = abstractC6399l.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!abstractC6399l.hasNext()) {
                        return false;
                    }
                    next2 = abstractC6399l.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f27247l.applovin().listIterator(0);
    }

    @Override // defpackage.AbstractC8481l, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f27247l.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f31420l;
        if (!AbstractC18648l.crashlytics(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            AbstractC10199l it2 = iterator();
            do {
                AbstractC6399l abstractC6399l = (AbstractC6399l) it2;
                if (!abstractC6399l.hasNext()) {
                    return true;
                }
                next = abstractC6399l.next();
                next2 = it.next();
                if (next2 == null) {
                    return false;
                }
            } while (comparator.compare(next, next2) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // defpackage.AbstractC5511l
    public final int firebase() {
        return this.f27247l.firebase();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.f27247l.get(0);
        }
        C4875l.firebase();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iAdvert = advert(obj, true) - 1;
        if (iAdvert == -1) {
            return null;
        }
        return this.f27247l.get(iAdvert);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iIsVip = isVip(obj, false);
        AbstractC1186l abstractC1186l = this.f27247l;
        if (iIsVip == abstractC1186l.size()) {
            return null;
        }
        return abstractC1186l.get(iIsVip);
    }

    public final int isVip(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f27247l, obj, this.f31420l);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            C4875l.firebase();
            return null;
        }
        AbstractC1186l abstractC1186l = this.f27247l;
        return abstractC1186l.get(abstractC1186l.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iAdvert = advert(obj, false) - 1;
        if (iAdvert == -1) {
            return null;
        }
        return this.f27247l.get(iAdvert);
    }

    @Override // defpackage.AbstractC5511l
    public final Object[] mopub() {
        return this.f27247l.mopub();
    }

    @Override // defpackage.AbstractC5511l
    /* JADX INFO: renamed from: remoteconfig */
    public final AbstractC10199l iterator() {
        return this.f27247l.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f27247l.size();
    }

    @Override // defpackage.AbstractC5511l
    public final boolean smaato() {
        return this.f27247l.smaato();
    }
}

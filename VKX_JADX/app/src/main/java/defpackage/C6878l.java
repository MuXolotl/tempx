package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: lؙۥٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6878l implements InterfaceC5281l, Set, InterfaceC2356l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C1807l f14404l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C1807l f14405l;

    public C6878l(C1807l c1807l) {
        this.f14405l = c1807l;
        this.f14404l = c1807l;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f14404l.yandex(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        C1807l c1807l = this.f14404l;
        int i = c1807l.mopub;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c1807l.mopub(it.next());
        }
        return i != c1807l.mopub;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f14404l.loadAd();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f14405l.crashlytics(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f14405l.crashlytics(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6878l.class != obj.getClass()) {
            return false;
        }
        return AbstractC8576l.yandex(this.f14405l, ((C6878l) obj).f14405l);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f14405l.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f14405l.mopub == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C17991l(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f14404l.admob(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int iNumberOfTrailingZeros;
        C1807l c1807l = this.f14404l;
        int i = c1807l.mopub;
        Iterator it = collection.iterator();
        while (true) {
            int i2 = 1;
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i4 = iHashCode ^ (iHashCode << 16);
            int i5 = i4 & 127;
            int i6 = c1807l.billing;
            int i7 = (i4 >>> 7) & i6;
            while (true) {
                long[] jArr = c1807l.yandex;
                int i8 = i7 >> 3;
                int i9 = (i7 & 7) << 3;
                long j = ((jArr[i8 + i2] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
                long j2 = (((long) i5) * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (j3 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i6;
                    int i10 = i2;
                    if (AbstractC8576l.yandex(c1807l.loadAd[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i2 = i10;
                }
                int i11 = i2;
                if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i3 += 8;
                i7 = (i7 + i3) & i6;
                i2 = i11;
            }
            if (iNumberOfTrailingZeros >= 0) {
                c1807l.subs(iNumberOfTrailingZeros);
            }
        }
        return i != c1807l.mopub;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f14404l.isPro(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f14405l.mopub;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC18648l.billing(this);
    }

    public final String toString() {
        return this.f14405l.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC18648l.mopub(this, objArr);
    }
}

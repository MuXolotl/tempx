package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lؗؓ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4617l extends AbstractC2837l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C17963l f9367l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9368l;

    public /* synthetic */ C4617l(C17963l c17963l, int i) {
        this.f9368l = i;
        this.f9367l = c17963l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f9368l) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f9368l) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f9368l) {
            case 0:
                this.f9367l.clear();
                break;
            default:
                this.f9367l.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.f9368l;
        C17963l c17963l = this.f9367l;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                c17963l.getClass();
                int iMopub = c17963l.mopub(entry.getKey());
                if (iMopub < 0) {
                    return false;
                }
                return AbstractC8576l.yandex(c17963l.f34960l[iMopub], entry.getValue());
            default:
                return c17963l.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f9368l) {
            case 0:
                C17963l c17963l = this.f9367l;
                c17963l.getClass();
                for (Object obj : collection) {
                    if (obj == null) {
                        return false;
                    }
                    try {
                        Map.Entry entry = (Map.Entry) obj;
                        int iMopub = c17963l.mopub(entry.getKey());
                        if (!(iMopub < 0 ? false : AbstractC8576l.yandex(c17963l.f34960l[iMopub], entry.getValue()))) {
                            return false;
                        }
                    } catch (ClassCastException unused) {
                        return false;
                    }
                }
                return true;
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f9368l) {
            case 0:
                break;
        }
        return this.f9367l.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f9368l;
        C17963l c17963l = this.f9367l;
        switch (i) {
            case 0:
                c17963l.getClass();
                return new C0437l(c17963l, 0);
            default:
                c17963l.getClass();
                return new C0437l(c17963l, 1);
        }
    }

    @Override // defpackage.AbstractC2837l
    public final int pro() {
        switch (this.f9368l) {
            case 0:
                break;
        }
        return this.f9367l.f34966l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.f9368l;
        C17963l c17963l = this.f9367l;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    c17963l.amazon();
                    int iMopub = c17963l.mopub(entry.getKey());
                    if (iMopub >= 0 && AbstractC8576l.yandex(c17963l.f34960l[iMopub], entry.getValue())) {
                        c17963l.firebase(iMopub);
                        return true;
                    }
                }
                return false;
            default:
                c17963l.amazon();
                int iMopub2 = c17963l.mopub(obj);
                if (iMopub2 < 0) {
                    return false;
                }
                c17963l.firebase(iMopub2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.f9368l;
        C17963l c17963l = this.f9367l;
        switch (i) {
            case 0:
                c17963l.amazon();
                break;
            default:
                c17963l.amazon();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.f9368l;
        C17963l c17963l = this.f9367l;
        switch (i) {
            case 0:
                c17963l.amazon();
                break;
            default:
                c17963l.amazon();
                break;
        }
        return super.retainAll(collection);
    }
}

package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: lٌٖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4764l extends AbstractC18064l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f9781l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9782l;

    public C4764l(C11349l c11349l) {
        this.f9782l = 0;
        this.f9781l = c11349l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f9782l) {
            case 0:
                throw new UnsupportedOperationException("CaseInsensitiveMap.values does not support add");
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f9782l) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // defpackage.AbstractC18064l
    public final int amazon() {
        int i = this.f9782l;
        Object obj = this.f9781l;
        switch (i) {
            case 0:
                return ((C11349l) obj).f22889l;
            case 1:
                return ((C17963l) obj).f34966l;
            default:
                return ((C0046l) obj).amazon();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        switch (this.f9782l) {
            case 1:
                ((C17963l) this.f9781l).clear();
                break;
            case 2:
                ((C0046l) this.f9781l).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f9782l) {
            case 1:
                return ((C17963l) this.f9781l).containsValue(obj);
            case 2:
                return ((C0046l) this.f9781l).containsValue(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f9782l) {
            case 1:
                return ((C17963l) this.f9781l).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f9782l;
        Object obj = this.f9781l;
        switch (i) {
            case 0:
                return new C2921l((C11349l) obj, 2);
            case 1:
                C17963l c17963l = (C17963l) obj;
                c17963l.getClass();
                return new C0437l(c17963l, 2);
            default:
                C0046l c0046l = (C0046l) obj;
                AbstractC15674l[] abstractC15674lArr = new AbstractC15674l[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    abstractC15674lArr[i2] = new C15418l(2);
                }
                return new C1166l(c0046l, abstractC15674lArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        int i;
        switch (this.f9782l) {
            case 1:
                C17963l c17963l = (C17963l) this.f9781l;
                c17963l.amazon();
                int i2 = c17963l.f34967l;
                while (true) {
                    i = -1;
                    i2--;
                    if (i2 >= 0) {
                        if (c17963l.f34957l[i2] >= 0 && AbstractC8576l.yandex(c17963l.f34960l[i2], obj)) {
                            i = i2;
                        }
                    }
                }
                if (i < 0) {
                    return false;
                }
                c17963l.firebase(i);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f9782l) {
            case 1:
                ((C17963l) this.f9781l).amazon();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f9782l) {
            case 1:
                ((C17963l) this.f9781l).amazon();
                break;
        }
        return super.retainAll(collection);
    }

    public /* synthetic */ C4764l(int i, Object obj) {
        this.f9782l = i;
        this.f9781l = obj;
    }
}

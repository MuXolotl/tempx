package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: renamed from: lْٔۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13376l implements ListIterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f26249l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f26250l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26251l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Object f26252l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f26253l;

    public C13376l(C11362l c11362l, int i) {
        this.f26251l = 3;
        this.f26252l = c11362l;
        this.f26250l = i - 1;
        this.f26249l = -1;
        this.f26253l = ((C1713l) AbstractC9620l.admob(c11362l.f22912l)).purchase;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f26251l;
        Object obj2 = this.f26252l;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                yandex();
                C8923l c8923l = (C8923l) obj2;
                int i2 = this.f26250l;
                this.f26250l = i2 + 1;
                c8923l.add(i2, obj);
                this.f26249l = -1;
                this.f26253l = ((AbstractList) c8923l).modCount;
                return;
            case 2:
                crashlytics();
                C10227l c10227l = (C10227l) obj2;
                int i3 = this.f26250l;
                this.f26250l = i3 + 1;
                c10227l.add(i3, obj);
                this.f26249l = -1;
                this.f26253l = ((AbstractList) c10227l).modCount;
                return;
            default:
                amazon();
                C11362l c11362l = (C11362l) obj2;
                c11362l.add(this.f26250l + 1, obj);
                this.f26249l = -1;
                this.f26250l++;
                this.f26253l = ((C1713l) AbstractC9620l.admob(c11362l.f22912l)).purchase;
                return;
        }
    }

    public void amazon() {
        if (((C1713l) AbstractC9620l.admob(((C11362l) this.f26252l).f22912l)).purchase == this.f26253l) {
            return;
        }
        C8339l.mopub();
    }

    public void crashlytics() {
        if (((AbstractList) ((C10227l) this.f26252l)).modCount == this.f26253l) {
            return;
        }
        C8339l.mopub();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f26251l;
        Object obj = this.f26252l;
        switch (i) {
            case 0:
                return this.f26250l < this.f26253l;
            case 1:
                return this.f26250l < ((C8923l) obj).f18389l;
            case 2:
                return this.f26250l < ((C10227l) obj).f20845l;
            default:
                return this.f26250l < ((C11362l) obj).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f26251l) {
            case 0:
                return this.f26250l > this.f26249l;
            case 1:
                return this.f26250l > 0;
            case 2:
                return this.f26250l > 0;
            default:
                return this.f26250l >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f26251l;
        Object obj = this.f26252l;
        switch (i) {
            case 0:
                C12463l c12463l = ((C18333l) obj).f35844l;
                int i2 = this.f26250l;
                this.f26250l = i2 + 1;
                return (AbstractC14971l) c12463l.admob(i2);
            case 1:
                yandex();
                int i3 = this.f26250l;
                C8923l c8923l = (C8923l) obj;
                if (i3 >= c8923l.f18389l) {
                    C4875l.firebase();
                    return null;
                }
                this.f26250l = i3 + 1;
                this.f26249l = i3;
                return c8923l.f18391l[c8923l.f18390l + i3];
            case 2:
                crashlytics();
                int i4 = this.f26250l;
                C10227l c10227l = (C10227l) obj;
                if (i4 >= c10227l.f20845l) {
                    C4875l.firebase();
                    return null;
                }
                this.f26250l = i4 + 1;
                this.f26249l = i4;
                return c10227l.f20846l[i4];
            default:
                amazon();
                int i5 = this.f26250l + 1;
                this.f26249l = i5;
                C11362l c11362l = (C11362l) obj;
                AbstractC18263l.crashlytics(i5, c11362l.size());
                Object obj2 = c11362l.get(i5);
                this.f26250l = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f26251l) {
            case 0:
                return this.f26250l - this.f26249l;
            case 1:
                return this.f26250l;
            case 2:
                return this.f26250l;
            default:
                return this.f26250l + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f26251l;
        Object obj = this.f26252l;
        switch (i) {
            case 0:
                C12463l c12463l = ((C18333l) obj).f35844l;
                int i2 = this.f26250l - 1;
                this.f26250l = i2;
                return (AbstractC14971l) c12463l.admob(i2);
            case 1:
                yandex();
                int i3 = this.f26250l;
                if (i3 <= 0) {
                    C4875l.firebase();
                    return null;
                }
                int i4 = i3 - 1;
                this.f26250l = i4;
                this.f26249l = i4;
                C8923l c8923l = (C8923l) obj;
                return c8923l.f18391l[c8923l.f18390l + i4];
            case 2:
                crashlytics();
                int i5 = this.f26250l;
                if (i5 <= 0) {
                    C4875l.firebase();
                    return null;
                }
                int i6 = i5 - 1;
                this.f26250l = i6;
                this.f26249l = i6;
                return ((C10227l) obj).f20846l[i6];
            default:
                amazon();
                C11362l c11362l = (C11362l) obj;
                AbstractC18263l.crashlytics(this.f26250l, c11362l.size());
                int i7 = this.f26250l;
                this.f26249l = i7;
                Object obj2 = c11362l.get(i7);
                this.f26250l--;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f26251l) {
            case 0:
                return (this.f26250l - this.f26249l) - 1;
            case 1:
                i = this.f26250l;
                break;
            case 2:
                i = this.f26250l;
                break;
            default:
                return this.f26250l;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f26251l;
        Object obj = this.f26252l;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                C8923l c8923l = (C8923l) obj;
                yandex();
                int i2 = this.f26249l;
                if (i2 == -1) {
                    C8339l.smaato("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                c8923l.ad(i2);
                this.f26250l = this.f26249l;
                this.f26249l = -1;
                this.f26253l = ((AbstractList) c8923l).modCount;
                return;
            case 2:
                C10227l c10227l = (C10227l) obj;
                crashlytics();
                int i3 = this.f26249l;
                if (i3 == -1) {
                    C8339l.smaato("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                c10227l.ad(i3);
                this.f26250l = this.f26249l;
                this.f26249l = -1;
                this.f26253l = ((AbstractList) c10227l).modCount;
                return;
            default:
                amazon();
                C11362l c11362l = (C11362l) obj;
                c11362l.remove(this.f26249l);
                this.f26250l--;
                this.f26249l = -1;
                this.f26253l = ((C1713l) AbstractC9620l.admob(c11362l.f22912l)).purchase;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f26251l;
        Object obj2 = this.f26252l;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                yandex();
                int i2 = this.f26249l;
                if (i2 != -1) {
                    ((C8923l) obj2).set(i2, obj);
                    return;
                } else {
                    C8339l.smaato("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                crashlytics();
                int i3 = this.f26249l;
                if (i3 != -1) {
                    ((C10227l) obj2).set(i3, obj);
                    return;
                } else {
                    C8339l.smaato("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                C11362l c11362l = (C11362l) obj2;
                amazon();
                int i4 = this.f26249l;
                if (i4 < 0) {
                    C8339l.smaato("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    c11362l.set(i4, obj);
                    this.f26253l = ((C1713l) AbstractC9620l.admob(c11362l.f22912l)).purchase;
                    return;
                }
        }
    }

    public void yandex() {
        if (((AbstractList) ((C8923l) this.f26252l).f18392l).modCount == this.f26253l) {
            return;
        }
        C8339l.mopub();
    }

    public C13376l(C10227l c10227l, int i) {
        this.f26251l = 2;
        this.f26252l = c10227l;
        this.f26250l = i;
        this.f26249l = -1;
        this.f26253l = ((AbstractList) c10227l).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13376l(C18333l c18333l, int i, int i2) {
        this(c18333l, (i2 & 1) != 0 ? 0 : i, 0, c18333l.f35844l.loadAd);
        this.f26251l = 0;
    }

    public C13376l(C18333l c18333l, int i, int i2, int i3) {
        this.f26251l = 0;
        this.f26252l = c18333l;
        this.f26250l = i;
        this.f26249l = i2;
        this.f26253l = i3;
    }

    public C13376l(C8923l c8923l, int i) {
        this.f26251l = 1;
        this.f26252l = c8923l;
        this.f26250l = i;
        this.f26249l = -1;
        this.f26253l = ((AbstractList) c8923l).modCount;
    }
}

package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: renamed from: lٌؙٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6494l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f13544l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f13545l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13546l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Object f13547l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f13548l;

    public C6494l(C2859l c2859l, int i, int i2) {
        this.f13546l = 0;
        this.f13547l = c2859l;
        this.f13545l = i2;
        this.f13544l = i;
        this.f13548l = c2859l.f6219l;
        if (c2859l.f6218l) {
            AbstractC0736l.billing();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f13546l) {
            case 0:
                return this.f13544l < this.f13545l;
            default:
                yandex();
                return this.f13544l < ((C15525l) this.f13547l).pro();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f13546l;
        Object obj = this.f13547l;
        switch (i) {
            case 0:
                C2859l c2859l = (C2859l) obj;
                int i2 = c2859l.f6219l;
                int i3 = this.f13548l;
                if (i2 != i3) {
                    AbstractC0736l.billing();
                }
                int i4 = this.f13544l;
                this.f13544l = c2859l.f6221l[(i4 * 5) + 3] + i4;
                return new C17458l(c2859l, i4, i3);
            default:
                yandex();
                int i5 = this.f13544l;
                C15525l c15525l = (C15525l) obj;
                if (i5 >= c15525l.pro()) {
                    C18262l.adcel(AbstractC12589l.applovin(i5, c15525l.pro(), "Cannot access index ", " when size is ", ". Remember to check hasNext() before using next()."));
                    return null;
                }
                Object obj2 = c15525l.f30332l.get(i5);
                this.f13548l = i5;
                this.f13544l = i5 + 1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f13546l) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                yandex();
                C15525l c15525l = (C15525l) this.f13547l;
                InterfaceC2435l interfaceC2435l = c15525l.f30332l;
                if (c15525l.pro() == 0) {
                    C1759l.firebase("Could not remove last element returned by the iterator: set is empty.");
                    return;
                }
                int i = this.f13548l;
                if (i < 0) {
                    C8339l.smaato("Could not remove last element returned by the iterator: iterator never returned an element.");
                    return;
                }
                boolean zRemove = interfaceC2435l.remove(interfaceC2435l.get(i));
                int i2 = this.f13548l;
                int i3 = this.f13544l;
                if (i2 < i3) {
                    this.f13544l = i3 - 1;
                }
                this.f13548l = -1;
                this.f13545l = interfaceC2435l.admob();
                if (zRemove) {
                    return;
                }
                C1759l.firebase("Could not remove last element returned by the iterator: was there an element to remove?");
                return;
        }
    }

    public void yandex() {
        if (((C15525l) this.f13547l).f30332l.admob() != this.f13545l) {
            throw new ConcurrentModificationException("The underlying RealmSet was modified while iterating it.");
        }
    }

    public C6494l(C15525l c15525l) {
        this.f13546l = 1;
        this.f13547l = c15525l;
        this.f13545l = c15525l.f30332l.admob();
        this.f13548l = -1;
    }
}

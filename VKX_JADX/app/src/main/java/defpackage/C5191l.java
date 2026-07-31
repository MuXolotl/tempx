package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: renamed from: lؗ۟ۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5191l implements Iterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f11259l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f11260l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11261l;

    public C5191l(AbstractC1096l abstractC1096l) {
        this.f11261l = 2;
        if (!(abstractC1096l instanceof C2485l)) {
            this.f11260l = null;
            this.f11259l = (C1700l) abstractC1096l;
            return;
        }
        C2485l c2485l = (C2485l) abstractC1096l;
        ArrayDeque arrayDeque = new ArrayDeque(c2485l.f5285l);
        this.f11260l = arrayDeque;
        arrayDeque.push(c2485l);
        AbstractC1096l abstractC1096l2 = c2485l.f5287l;
        while (abstractC1096l2 instanceof C2485l) {
            C2485l c2485l2 = (C2485l) abstractC1096l2;
            ((ArrayDeque) this.f11260l).push(c2485l2);
            abstractC1096l2 = c2485l2.f5287l;
        }
        this.f11259l = (C1700l) abstractC1096l2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f11261l) {
            case 0:
                Iterator it2 = (Iterator) this.f11259l;
                if (((Iterator) this.f11260l) == null && it2.hasNext()) {
                    this.f11260l = ((List) ((Map.Entry) it2.next()).getValue()).iterator();
                }
                return it2.hasNext() || ((it = (Iterator) this.f11260l) != null && it.hasNext());
            case 1:
                return ((C7362l) this.f11259l) != null;
            default:
                return ((C1700l) this.f11259l) != null;
        }
    }

    public C1700l loadAd() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f11260l;
        C1700l c1700l = (C1700l) this.f11259l;
        C1700l c1700l2 = null;
        if (c1700l == null) {
            C4875l.firebase();
            return null;
        }
        while (arrayDeque != null && !arrayDeque.isEmpty()) {
            AbstractC1096l abstractC1096l = ((C2485l) arrayDeque.pop()).f5286l;
            while (abstractC1096l instanceof C2485l) {
                C2485l c2485l = (C2485l) abstractC1096l;
                arrayDeque.push(c2485l);
                abstractC1096l = c2485l.f5287l;
            }
            C1700l c1700l3 = (C1700l) abstractC1096l;
            if (c1700l3.admob() != 0) {
                c1700l2 = c1700l3;
                break;
            }
        }
        this.f11259l = c1700l2;
        return c1700l;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f11261l) {
            case 0:
                if (!((Iterator) this.f11260l).hasNext()) {
                    Iterator it = (Iterator) this.f11259l;
                    if (it.hasNext()) {
                        this.f11260l = ((List) ((Map.Entry) it.next()).getValue()).iterator();
                    }
                }
                return (InterfaceC4656l) ((Iterator) this.f11260l).next();
            case 1:
                return yandex();
            default:
                return loadAd();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f11261l) {
            case 0:
                ((Iterator) this.f11260l).remove();
                return;
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C7362l yandex() {
        Stack stack = (Stack) this.f11260l;
        C7362l c7362l = (C7362l) this.f11259l;
        C7362l c7362l2 = null;
        if (c7362l == null) {
            C4875l.firebase();
            return null;
        }
        while (!stack.isEmpty()) {
            AbstractC7735l abstractC7735l = ((C8710l) stack.pop()).f17923l;
            while (abstractC7735l instanceof C8710l) {
                C8710l c8710l = (C8710l) abstractC7735l;
                stack.push(c8710l);
                abstractC7735l = c8710l.f17919l;
            }
            C7362l c7362l3 = (C7362l) abstractC7735l;
            if (c7362l3.f15271l.length != 0) {
                c7362l2 = c7362l3;
                break;
            }
        }
        this.f11259l = c7362l2;
        return c7362l;
    }

    public C5191l(Iterator it) {
        this.f11261l = 0;
        this.f11259l = it;
    }

    public C5191l(AbstractC7735l abstractC7735l) {
        this.f11261l = 1;
        this.f11260l = new Stack();
        while (abstractC7735l instanceof C8710l) {
            C8710l c8710l = (C8710l) abstractC7735l;
            ((Stack) this.f11260l).push(c8710l);
            abstractC7735l = c8710l.f17919l;
        }
        this.f11259l = (C7362l) abstractC7735l;
    }
}

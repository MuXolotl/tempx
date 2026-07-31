package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٜ٘٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C17991l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f35176l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f35177l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35178l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f35179l;

    public C17991l(C11686l c11686l) {
        this.f35178l = 2;
        this.f35179l = c11686l;
        this.f35177l = -1;
        this.f35176l = AbstractC6900l.purchase(new C1148l(c11686l, this, null));
    }

    public void crashlytics() {
        Iterator it = (Iterator) this.f35179l;
        if (it.hasNext()) {
            Object next = it.next();
            if (((InterfaceC8371l) next) instanceof InterfaceC11661l) {
                this.f35177l = 1;
                this.f35176l = next;
                return;
            }
        }
        this.f35177l = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f35178l;
        Object obj = this.f35179l;
        switch (i) {
            case 0:
                if (this.f35177l < 0) {
                    yandex();
                }
                return this.f35177l == 1;
            case 1:
                return ((C11129l) this.f35176l).hasNext();
            case 2:
                return ((C11129l) this.f35176l).hasNext();
            case 3:
                return this.f35177l < ((Map) obj).size();
            case 4:
                C18415l c18415l = (C18415l) obj;
                Iterator it = (Iterator) this.f35176l;
                while (this.f35177l < c18415l.loadAd && it.hasNext()) {
                    it.next();
                    this.f35177l++;
                }
                return this.f35177l < c18415l.crashlytics && it.hasNext();
            case 5:
                if (this.f35177l == -1) {
                    crashlytics();
                }
                return this.f35177l == 1;
            default:
                return ((Iterator) this.f35176l).hasNext();
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.f35178l;
        Object obj = this.f35179l;
        Object obj2 = null;
        switch (i) {
            case 0:
                if (this.f35177l < 0) {
                    yandex();
                }
                if (this.f35177l == 0) {
                    C4875l.firebase();
                    return null;
                }
                Object obj3 = this.f35176l;
                this.f35177l = -1;
                return obj3;
            case 1:
                return ((C11129l) this.f35176l).next();
            case 2:
                return ((C11129l) this.f35176l).next();
            case 3:
                if (hasNext()) {
                    obj2 = this.f35176l;
                    this.f35177l++;
                    Object obj4 = ((Map) obj).get(obj2);
                    if (obj4 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
                    }
                    this.f35176l = ((C10966l) obj4).loadAd;
                } else {
                    C4875l.firebase();
                }
                return obj2;
            case 4:
                C18415l c18415l = (C18415l) obj;
                Iterator it = (Iterator) this.f35176l;
                while (this.f35177l < c18415l.loadAd && it.hasNext()) {
                    it.next();
                    this.f35177l++;
                }
                int i2 = this.f35177l;
                if (i2 < c18415l.crashlytics) {
                    this.f35177l = i2 + 1;
                    return it.next();
                }
                C4875l.firebase();
                return null;
            case 5:
                if (this.f35177l == -1) {
                    crashlytics();
                }
                if (this.f35177l == 0) {
                    C4875l.firebase();
                    return null;
                }
                Object obj5 = this.f35176l;
                this.f35176l = null;
                this.f35177l = -1;
                return obj5;
            default:
                C7927l c7927l = (C7927l) ((C6479l) obj).crashlytics;
                int i3 = this.f35177l;
                this.f35177l = i3 + 1;
                if (i3 >= 0) {
                    return c7927l.invoke(Integer.valueOf(i3), ((Iterator) this.f35176l).next());
                }
                AbstractC14055l.subscription();
                throw null;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.f35178l;
        Object obj = this.f35179l;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.f35177l;
                if (i2 != -1) {
                    ((C6878l) obj).f14404l.subs(i2);
                    this.f35177l = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.f35177l;
                if (i3 != -1) {
                    ((C11686l) obj).f23430l.vip(i3);
                    this.f35177l = -1;
                    return;
                }
                return;
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public void yandex() {
        int i = this.f35177l;
        C6479l c6479l = (C6479l) this.f35179l;
        Object objInvoke = i == -2 ? ((Function0) c6479l.loadAd).invoke() : ((Function1) c6479l.crashlytics).invoke(this.f35176l);
        this.f35176l = objInvoke;
        this.f35177l = objInvoke == null ? 0 : 1;
    }

    public C17991l(C6479l c6479l, byte b) {
        this.f35178l = 6;
        this.f35179l = c6479l;
        this.f35176l = new C12588l((C8767l) c6479l.loadAd);
    }

    public C17991l(C18415l c18415l) {
        this.f35178l = 4;
        this.f35179l = c18415l;
        this.f35176l = c18415l.yandex.iterator();
    }

    public C17991l(C17798l c17798l) {
        this.f35178l = 5;
        this.f35179l = ((InterfaceC11075l) c17798l.loadAd).iterator();
        this.f35177l = -1;
    }

    public C17991l(C6479l c6479l) {
        this.f35178l = 0;
        this.f35179l = c6479l;
        this.f35177l = -2;
    }

    public C17991l(Object obj, Map map) {
        this.f35178l = 3;
        this.f35176l = obj;
        this.f35179l = map;
    }

    public C17991l(C6878l c6878l) {
        this.f35178l = 1;
        this.f35179l = c6878l;
        this.f35177l = -1;
        this.f35176l = AbstractC6900l.purchase(new C5498l(c6878l, this, null));
    }
}

package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lؕۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3561l extends AbstractC10199l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f7489l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f7490l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Iterator f7491l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f7492l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f7493l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3561l(C2425l c2425l) {
        this();
        this.f7492l = 1;
        this.f7493l = c2425l;
        this.f7491l = c2425l.f5197l.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        AbstractC12442l.subscription(this.f7490l != 4);
        int iInmobi = AbstractC5020l.inmobi(this.f7490l);
        if (iInmobi == 0) {
            return true;
        }
        if (iInmobi != 2) {
            this.f7490l = 4;
            int i = this.f7492l;
            Object obj = null;
            Object obj2 = this.f7493l;
            Iterator it = this.f7491l;
            switch (i) {
                case 0:
                    while (true) {
                        if (!it.hasNext()) {
                            this.f7490l = 3;
                            break;
                        } else {
                            next = it.next();
                            if (((InterfaceC0629l) obj2).apply(next)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    break;
                default:
                    while (true) {
                        if (!it.hasNext()) {
                            this.f7490l = 3;
                            break;
                        } else {
                            next = it.next();
                            if (((C2425l) obj2).f5196l.contains(next)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    break;
            }
            this.f7489l = obj;
            if (this.f7490l != 3) {
                this.f7490l = 1;
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC10199l, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            C4875l.firebase();
            return null;
        }
        this.f7490l = 2;
        Object obj = this.f7489l;
        this.f7489l = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3561l(Iterator it, InterfaceC0629l interfaceC0629l) {
        this();
        this.f7492l = 0;
        this.f7491l = it;
        this.f7493l = interfaceC0629l;
    }

    public C3561l() {
        super(0);
        this.f7490l = 2;
    }
}

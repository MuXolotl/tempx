package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lؓۥٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C2234l extends C6731l implements InterfaceC11641l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final AbstractC15096l f4915l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final ArrayList f4916l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final ArrayList f4917l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C2234l f4918l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public C6731l f4919l;

    public C2234l(C2234l c2234l, AbstractC15096l abstractC15096l, boolean z, C10038l c10038l) {
        super(z, c10038l);
        this.f4918l = c2234l;
        this.f4915l = abstractC15096l;
        this.f4917l = new ArrayList();
        this.f4916l = new ArrayList();
    }

    public final void ads() {
        this.f4919l = null;
        Iterator it = this.f4917l.iterator();
        while (it.hasNext()) {
            ((C2234l) it.next()).ads();
        }
    }

    public final C2234l startapp(AbstractC15096l abstractC15096l) {
        Object next;
        ArrayList arrayList = this.f4917l;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC8576l.yandex(((C2234l) next).f4915l, abstractC15096l));
        C2234l c2234l = (C2234l) next;
        if (c2234l != null) {
            return c2234l;
        }
        C2234l c2234l2 = new C2234l(this, abstractC15096l, this.f14098l, this.f14095l);
        arrayList.add(c2234l2);
        return c2234l2;
    }

    public final String toString() {
        C2234l c2234l = this.f4918l;
        String string = c2234l != null ? c2234l.toString() : null;
        AbstractC15096l abstractC15096l = this.f4915l;
        if (string == null) {
            if (abstractC15096l instanceof C18345l) {
                return "/";
            }
            return "/" + abstractC15096l;
        }
        if (abstractC15096l instanceof C18345l) {
            return AbstractC12024l.m3344synchronized(string, '/') ? string : string.concat("/");
        }
        if (AbstractC12024l.m3344synchronized(string, '/')) {
            return string + abstractC15096l;
        }
        return string + '/' + abstractC15096l;
    }

    @Override // defpackage.AbstractC10598l
    public final void yandex() {
        ads();
    }
}

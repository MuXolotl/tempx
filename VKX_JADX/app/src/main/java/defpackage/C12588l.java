package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٍّٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12588l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f24793l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Iterator f24794l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24795l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC11075l f24796l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f24797l;

    public C12588l(C14432l c14432l) {
        this.f24795l = 0;
        this.f24796l = c14432l;
        this.f24794l = c14432l.yandex.iterator();
        this.f24793l = -1;
    }

    public boolean crashlytics() {
        Iterator it;
        Iterator it2 = (Iterator) this.f24797l;
        if (it2 != null && it2.hasNext()) {
            this.f24793l = 1;
            return true;
        }
        do {
            Iterator it3 = this.f24794l;
            if (!it3.hasNext()) {
                this.f24793l = 2;
                this.f24797l = null;
                return false;
            }
            Object next = it3.next();
            C8767l c8767l = (C8767l) this.f24796l;
            it = (Iterator) c8767l.crashlytics.invoke(c8767l.loadAd.invoke(next));
        } while (!it.hasNext());
        this.f24797l = it;
        this.f24793l = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f24795l) {
            case 0:
                if (this.f24793l == -1) {
                    yandex();
                }
                return this.f24793l == 1;
            default:
                int i = this.f24793l;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return crashlytics();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f24795l) {
            case 0:
                if (this.f24793l == -1) {
                    yandex();
                }
                if (this.f24793l == 0) {
                    C4875l.firebase();
                    return null;
                }
                Object obj = this.f24797l;
                this.f24797l = null;
                this.f24793l = -1;
                return obj;
            default:
                int i = this.f24793l;
                if (i == 2) {
                    C4875l.firebase();
                } else {
                    if (i != 0 || crashlytics()) {
                        this.f24793l = 0;
                        return ((Iterator) this.f24797l).next();
                    }
                    C4875l.firebase();
                }
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f24795l) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public void yandex() {
        Object next;
        C14432l c14432l = (C14432l) this.f24796l;
        do {
            Iterator it = this.f24794l;
            if (!it.hasNext()) {
                this.f24793l = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) c14432l.crashlytics.invoke(next)).booleanValue() != c14432l.loadAd);
        this.f24797l = next;
        this.f24793l = 1;
    }

    public C12588l(C8767l c8767l) {
        this.f24795l = 1;
        this.f24796l = c8767l;
        this.f24794l = c8767l.yandex.iterator();
    }
}

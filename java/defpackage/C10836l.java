package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lُؕۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10836l implements Iterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Iterator f21900l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Iterator f21901l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21902l = 0;

    public C10836l(C5181l c5181l, Iterator it, Iterator it2) {
        this.f21901l = it;
        this.f21900l = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f21902l) {
            case 0:
                return this.f21901l.hasNext() || this.f21900l.hasNext();
            default:
                if (this.f21901l.hasNext()) {
                    return true;
                }
                return this.f21900l.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f21902l;
        Iterator it = this.f21900l;
        Iterator it2 = this.f21901l;
        switch (i) {
            case 0:
                return it2.hasNext() ? it2.next() : it.next();
            default:
                if (it2.hasNext()) {
                    return new C13997l(((Integer) it2.next()).toString());
                }
                if (it.hasNext()) {
                    return new C13997l((String) it.next());
                }
                C4875l.firebase();
                return null;
        }
    }

    public C10836l(Iterator it, Iterator it2) {
        this.f21901l = it;
        this.f21900l = it2;
    }
}

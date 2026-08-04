package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lٓۧٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14572l implements Iterator {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Iterator f28535l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28536l = 0;

    public C14572l(C16021l c16021l) {
        this.f28535l = c16021l.f31403l.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f28536l) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f28535l.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f28536l) {
            case 0:
                return (String) this.f28535l.next();
            case 1:
                return (String) this.f28535l.next();
            default:
                return ((Map.Entry) this.f28535l.next()).getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f28536l) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException("Remove not supported");
            default:
                this.f28535l.remove();
                return;
        }
    }

    public /* synthetic */ C14572l() {
    }

    public C14572l(Iterator it) {
        it.getClass();
        this.f28535l = it;
    }
}

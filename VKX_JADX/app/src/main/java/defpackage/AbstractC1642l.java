package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lُؓؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1642l implements Iterator {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Iterator f3983l;

    public AbstractC1642l(Iterator it) {
        it.getClass();
        this.f3983l = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3983l.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return yandex(this.f3983l.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f3983l.remove();
    }

    public abstract Object yandex(Object obj);
}

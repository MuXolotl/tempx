package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٕؗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4906l implements Iterator {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ Iterator f10000l;

    public C4906l(Iterator it) {
        this.f10000l = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10000l.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C13997l((String) this.f10000l.next());
    }
}

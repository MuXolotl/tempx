package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٌُۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8708l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f17914l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f17915l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f17916l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f17917l;

    public C8708l(long j, long j2, long j3) {
        this.f17916l = j3;
        this.f17915l = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.f17914l = z;
        this.f17917l = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17914l;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(nextLong());
    }

    public final long nextLong() {
        long j = this.f17917l;
        if (j != this.f17915l) {
            this.f17917l = this.f17916l + j;
            return j;
        }
        if (this.f17914l) {
            this.f17914l = false;
            return j;
        }
        C4875l.firebase();
        return 0L;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

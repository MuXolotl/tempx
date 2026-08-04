package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: lؚۗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7464l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C17798l f15434l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f15435l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public String f15436l;

    public C7464l(C17798l c17798l) {
        this.f15434l = c17798l;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f15436l == null && !this.f15435l) {
            String line = ((BufferedReader) this.f15434l.loadAd).readLine();
            this.f15436l = line;
            if (line == null) {
                this.f15435l = true;
            }
        }
        return this.f15436l != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C4875l.firebase();
            return null;
        }
        String str = this.f15436l;
        this.f15436l = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

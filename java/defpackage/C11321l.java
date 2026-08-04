package defpackage;

import java.io.Closeable;

/* JADX INFO: renamed from: lُۚۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11321l implements Closeable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C17548l f22814l = new C17548l(16);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f22815l;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f22815l;
        if (i > 0) {
            this.f22815l = i - 1;
        } else {
            C8339l.subs("Mismatched calls to RecursionDepth (possible error in core library)");
        }
    }
}

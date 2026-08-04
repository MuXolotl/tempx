package defpackage;

import java.io.Closeable;

/* JADX INFO: renamed from: lًؘؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5530l implements Closeable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f11800l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C0869l f11801l;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f11801l != null) {
            this.f11801l = null;
        } else {
            C8339l.smaato("not attached to a buffer");
        }
    }
}

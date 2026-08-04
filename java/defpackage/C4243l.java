package defpackage;

/* JADX INFO: renamed from: lٜؖؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4243l extends AbstractC6897l implements InterfaceC14991l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f8697l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C12105l f8698l;

    public C4243l(C12105l c12105l, long j) {
        this.f8698l = c12105l;
        this.f8697l = j;
    }

    @Override // defpackage.InterfaceC14991l
    public final long ad(C0869l c0869l, long j) {
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // defpackage.AbstractC6897l
    public final long billing() {
        return this.f8697l;
    }

    @Override // defpackage.InterfaceC14991l
    public final C3446l isPro() {
        return C3446l.amazon;
    }

    @Override // defpackage.AbstractC6897l
    /* JADX INFO: renamed from: lؙٗۛ, reason: contains not printable characters */
    public final InterfaceC9473l mo1516l() {
        return new C1503l(this);
    }

    @Override // defpackage.AbstractC6897l
    public final C12105l mopub() {
        return this.f8698l;
    }

    @Override // defpackage.AbstractC6897l, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

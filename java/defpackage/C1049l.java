package defpackage;

/* JADX INFO: renamed from: lٍؒٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1049l extends Exception {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Throwable f2913l;

    public C1049l(Throwable th, AbstractC1872l abstractC1872l, InterfaceC12932l interfaceC12932l) {
        super("Coroutine dispatcher " + abstractC1872l + " threw an exception, context = " + interfaceC12932l, th);
        this.f2913l = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f2913l;
    }
}

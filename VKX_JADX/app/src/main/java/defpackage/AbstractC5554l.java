package defpackage;

/* JADX INFO: renamed from: lٌؘٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5554l implements InterfaceC10506l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC10506l f11838l;

    public AbstractC5554l(InterfaceC10506l interfaceC10506l) {
        this.f11838l = interfaceC10506l;
    }

    @Override // defpackage.InterfaceC10506l
    /* JADX INFO: renamed from: break */
    public void mo390break(C0869l c0869l, long j) {
        this.f11838l.mo390break(c0869l, j);
    }

    @Override // defpackage.InterfaceC10506l, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11838l.close();
    }

    @Override // defpackage.InterfaceC10506l, java.io.Flushable
    public void flush() {
        this.f11838l.flush();
    }

    @Override // defpackage.InterfaceC10506l
    public final C3446l isPro() {
        return this.f11838l.isPro();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f11838l + ')';
    }
}

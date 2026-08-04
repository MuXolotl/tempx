package defpackage;

/* JADX INFO: renamed from: lٍ۟ٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9847l extends AbstractC14971l implements InterfaceC16031l, InterfaceC3228l, InterfaceC12556l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C5733l f20042l = new C5733l(this, 1);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C5733l f20043l = new C5733l(this, 0);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C6523l f20044l;

    public C9847l(C6523l c6523l) {
        this.f20044l = c6523l;
    }

    @Override // defpackage.InterfaceC3228l
    /* JADX INFO: renamed from: synchronized */
    public final void mo1299synchronized(InterfaceC1389l interfaceC1389l) {
        interfaceC1389l.billing(this.f20043l);
        interfaceC1389l.crashlytics(this.f20042l);
    }
}

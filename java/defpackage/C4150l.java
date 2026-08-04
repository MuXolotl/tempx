package defpackage;

/* JADX INFO: renamed from: lٖؖؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4150l implements InterfaceC1711l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC3177l f8516l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C15974l f8517l;

    public C4150l(InterfaceC3177l interfaceC3177l, C15974l c15974l) {
        this.f8516l = interfaceC3177l;
        this.f8517l = c15974l;
    }

    @InterfaceC16020l(EnumC14812l.ON_DESTROY)
    public void onDestroy(InterfaceC3177l interfaceC3177l) {
        this.f8517l.vip(interfaceC3177l);
    }

    @InterfaceC16020l(EnumC14812l.ON_START)
    public void onStart(InterfaceC3177l interfaceC3177l) {
        this.f8517l.admob(interfaceC3177l);
    }

    @InterfaceC16020l(EnumC14812l.ON_STOP)
    public void onStop(InterfaceC3177l interfaceC3177l) {
        this.f8517l.subs(interfaceC3177l);
    }
}

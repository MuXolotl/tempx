package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: lٟؖٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4295l extends AbstractC1872l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8781l = AtomicIntegerFieldUpdater.newUpdater(C4295l.class, "lٍۥۗ");

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final AbstractC1872l f8782l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public volatile /* synthetic */ int f8783l = 1;

    public C4295l(AbstractC1872l abstractC1872l) {
        this.f8782l = abstractC1872l;
    }

    @Override // defpackage.AbstractC1872l
    public final void adcel(InterfaceC12932l interfaceC12932l, Runnable runnable) {
        m1523l().adcel(interfaceC12932l, runnable);
    }

    /* JADX INFO: renamed from: lًٚٔ, reason: contains not printable characters */
    public final AbstractC1872l m1523l() {
        return f8781l.get(this) == 1 ? AbstractC11463l.loadAd : this.f8782l;
    }

    @Override // defpackage.AbstractC1872l
    /* JADX INFO: renamed from: throw */
    public final boolean mo1065throw(InterfaceC12932l interfaceC12932l) {
        return m1523l().mo1065throw(interfaceC12932l);
    }

    @Override // defpackage.AbstractC1872l
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.f8782l + ")";
    }

    @Override // defpackage.AbstractC1872l
    public final void vip(InterfaceC12932l interfaceC12932l, Runnable runnable) {
        m1523l().vip(interfaceC12932l, runnable);
    }

    @Override // defpackage.AbstractC1872l
    /* JADX INFO: renamed from: while */
    public final AbstractC1872l mo1066while(int i) {
        return m1523l().mo1066while(i);
    }
}

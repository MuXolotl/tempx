package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lُٖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1872l extends AbstractC16682l implements InterfaceC0273l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C11583l f4294l = new C11583l(C6168l.f13001l, new C4741l(2));

    public AbstractC1872l() {
        super(C6168l.f13001l);
    }

    public void adcel(InterfaceC12932l interfaceC12932l, Runnable runnable) {
        AbstractC9853l.loadAd(this, interfaceC12932l, runnable);
    }

    @Override // defpackage.AbstractC16682l, defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: import */
    public final /* bridge */ InterfaceC12932l mo244import(InterfaceC15446l interfaceC15446l) {
        return AbstractC13611l.purchase(this, interfaceC15446l);
    }

    @Override // defpackage.AbstractC16682l, defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚۣؒ */
    public final /* bridge */ InterfaceC5763l mo245l(InterfaceC15446l interfaceC15446l) {
        return AbstractC13611l.crashlytics(this, interfaceC15446l);
    }

    @Override // defpackage.InterfaceC0273l
    /* JADX INFO: renamed from: package */
    public final InterfaceC14029l mo391package(AbstractC0283l abstractC0283l) {
        return new C16477l(this, abstractC0283l);
    }

    @Override // defpackage.InterfaceC0273l
    /* JADX INFO: renamed from: synchronized */
    public final void mo392synchronized(InterfaceC14029l interfaceC14029l) {
        C16477l c16477l = (C16477l) interfaceC14029l;
        c16477l.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C16477l.f32207l;
        while (atomicReferenceFieldUpdater.get(c16477l) == AbstractC9853l.loadAd) {
        }
        Object obj = atomicReferenceFieldUpdater.get(c16477l);
        C2397l c2397l = obj instanceof C2397l ? (C2397l) obj : null;
        if (c2397l != null) {
            c2397l.ads();
        }
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public boolean mo1065throw(InterfaceC12932l interfaceC12932l) {
        return !(this instanceof C8113l);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC17549l.purchase(this);
    }

    public abstract void vip(InterfaceC12932l interfaceC12932l, Runnable runnable);

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public AbstractC1872l mo1066while(int i) {
        AbstractC7798l.loadAd(i);
        return new C12286l(this, i);
    }
}

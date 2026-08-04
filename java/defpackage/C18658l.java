package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lۣٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18658l implements InterfaceC12932l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC12932l f36439l;

    public C18658l(InterfaceC12932l interfaceC12932l) {
        this.f36439l = interfaceC12932l;
    }

    public final boolean equals(Object obj) {
        return AbstractC8576l.yandex(this.f36439l, obj);
    }

    public final int hashCode() {
        return this.f36439l.hashCode();
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: import */
    public final InterfaceC12932l mo244import(InterfaceC15446l interfaceC15446l) {
        InterfaceC12932l interfaceC12932lMo244import = this.f36439l.mo244import(interfaceC15446l);
        int i = AbstractC1924l.loadAd;
        C11583l c11583l = AbstractC1872l.f4294l;
        AbstractC1872l abstractC1872l = (AbstractC1872l) mo245l(c11583l);
        AbstractC1872l abstractC1872l2 = (AbstractC1872l) interfaceC12932lMo244import.mo245l(c11583l);
        if ((abstractC1872l instanceof C4295l) && abstractC1872l != abstractC1872l2) {
            ((C4295l) abstractC1872l).f8783l = 0;
        }
        return new C18658l(interfaceC12932lMo244import);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚۣؒ */
    public final InterfaceC5763l mo245l(InterfaceC15446l interfaceC15446l) {
        return this.f36439l.mo245l(interfaceC15446l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final InterfaceC12932l mo246l(InterfaceC12932l interfaceC12932l) {
        InterfaceC12932l interfaceC12932lMo246l = this.f36439l.mo246l(interfaceC12932l);
        int i = AbstractC1924l.loadAd;
        C11583l c11583l = AbstractC1872l.f4294l;
        AbstractC1872l abstractC1872l = (AbstractC1872l) mo245l(c11583l);
        AbstractC1872l abstractC1872l2 = (AbstractC1872l) interfaceC12932lMo246l.mo245l(c11583l);
        if ((abstractC1872l instanceof C4295l) && abstractC1872l != abstractC1872l2) {
            ((C4295l) abstractC1872l).f8783l = 0;
        }
        return new C18658l(interfaceC12932lMo246l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚْٟ */
    public final Object mo247l(Object obj, Function2 function2) {
        return this.f36439l.mo247l(obj, function2);
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.f36439l + ")";
    }
}

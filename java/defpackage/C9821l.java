package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍۛۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9821l implements InterfaceC0273l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C9821l f20008l = new C9821l();

    @Override // defpackage.InterfaceC5763l
    public final InterfaceC15446l getKey() {
        return C6168l.f13001l;
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: import */
    public final /* bridge */ InterfaceC12932l mo244import(InterfaceC15446l interfaceC15446l) {
        return AbstractC13611l.purchase(this, interfaceC15446l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚۣؒ */
    public final /* bridge */ InterfaceC5763l mo245l(InterfaceC15446l interfaceC15446l) {
        return AbstractC13611l.crashlytics(this, interfaceC15446l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final InterfaceC12932l mo246l(InterfaceC12932l interfaceC12932l) {
        return AbstractC10586l.billing(this, interfaceC12932l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚْٟ */
    public final Object mo247l(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // defpackage.InterfaceC0273l
    /* JADX INFO: renamed from: package */
    public final InterfaceC14029l mo391package(AbstractC0283l abstractC0283l) {
        return new C10791l(abstractC0283l, Thread.currentThread().getContextClassLoader());
    }

    @Override // defpackage.InterfaceC0273l
    /* JADX INFO: renamed from: synchronized */
    public final /* bridge */ void mo392synchronized(InterfaceC14029l interfaceC14029l) {
    }
}

package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؑؐؐ, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements InterfaceC5763l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C6565l f845l = new C6565l(4);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC12932l f846l;

    public l(InterfaceC12932l interfaceC12932l) {
        this.f846l = interfaceC12932l;
    }

    @Override // defpackage.InterfaceC5763l
    public final InterfaceC15446l getKey() {
        return f845l;
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final /* bridge */ InterfaceC12932l mo244import(InterfaceC15446l interfaceC15446l) {
        return AbstractC2044l.mopub(this, interfaceC15446l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚۣؒ, reason: contains not printable characters */
    public final /* bridge */ InterfaceC5763l mo245l(InterfaceC15446l interfaceC15446l) {
        return AbstractC2044l.crashlytics(this, interfaceC15446l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lٜؓ۠, reason: contains not printable characters */
    public final InterfaceC12932l mo246l(InterfaceC12932l interfaceC12932l) {
        return AbstractC10586l.billing(this, interfaceC12932l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚْٟ, reason: contains not printable characters */
    public final Object mo247l(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}

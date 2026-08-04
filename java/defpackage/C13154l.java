package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lْؗۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13154l implements InterfaceC3928l, InterfaceC5763l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C11140l f25749l = new C11140l(27);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C6956l f25750l;

    public C13154l(C6956l c6956l) {
        this.f25750l = c6956l;
    }

    @Override // defpackage.InterfaceC3928l
    public final List admob(Integer num) {
        return this.f25750l.appmetrica();
    }

    @Override // defpackage.InterfaceC5763l
    public final InterfaceC15446l getKey() {
        return f25749l;
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: import */
    public final /* bridge */ InterfaceC12932l mo244import(InterfaceC15446l interfaceC15446l) {
        return AbstractC2044l.mopub(this, interfaceC15446l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚۣؒ */
    public final /* bridge */ InterfaceC5763l mo245l(InterfaceC15446l interfaceC15446l) {
        return AbstractC2044l.crashlytics(this, interfaceC15446l);
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

    @Override // defpackage.InterfaceC3928l
    public final boolean remoteconfig() {
        return this.f25750l.applovin;
    }
}

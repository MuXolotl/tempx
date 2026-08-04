package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُْٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13389l implements InterfaceC6752l, InterfaceC0805l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C18662l f26286l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Function2 f26287l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC12932l f26288l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C7504l f26289l;

    public C13389l(InterfaceC12932l interfaceC12932l, Function2 function2) {
        this.f26288l = interfaceC12932l;
        this.f26287l = function2;
        this.f26286l = AbstractC11990l.yandex(interfaceC12932l.mo246l(this));
    }

    @Override // defpackage.InterfaceC0805l
    /* JADX INFO: renamed from: continue */
    public final void mo685continue(InterfaceC12932l interfaceC12932l, Throwable th) throws Throwable {
        C13154l c13154l = (C13154l) interfaceC12932l.mo245l(C13154l.f25749l);
        if (c13154l != null) {
            AbstractC3605l.Signature(th, new C12242l(c13154l, this, 7));
        }
        InterfaceC0805l interfaceC0805l = (InterfaceC0805l) this.f26288l.mo245l(C13772l.f26879l);
        if (interfaceC0805l == null) {
            throw th;
        }
        interfaceC0805l.mo685continue(interfaceC12932l, th);
    }

    @Override // defpackage.InterfaceC6752l
    public final void crashlytics() {
        C7504l c7504l = this.f26289l;
        if (c7504l != null) {
            c7504l.ads(AbstractC4952l.yandex("Old job was still running!", null));
        }
        this.f26289l = AbstractC10999l.mopub(this.f26286l, null, 0, this.f26287l, 3);
    }

    @Override // defpackage.InterfaceC5763l
    public final InterfaceC15446l getKey() {
        return C13772l.f26879l;
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: import */
    public final InterfaceC12932l mo244import(InterfaceC15446l interfaceC15446l) {
        return AbstractC2044l.mopub(this, interfaceC15446l);
    }

    @Override // defpackage.InterfaceC6752l
    public final void loadAd() {
        C7504l c7504l = this.f26289l;
        if (c7504l != null) {
            c7504l.ad(new C10029l(1));
        }
        this.f26289l = null;
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚۣؒ */
    public final InterfaceC5763l mo245l(InterfaceC15446l interfaceC15446l) {
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

    @Override // defpackage.InterfaceC6752l
    public final void yandex() {
        C7504l c7504l = this.f26289l;
        if (c7504l != null) {
            c7504l.ad(new C10029l(1));
        }
        this.f26289l = null;
    }
}

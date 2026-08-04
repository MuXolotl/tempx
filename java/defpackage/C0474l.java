package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚؑٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0474l implements InterfaceC5763l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C12119l f1729l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ThreadLocal f1730l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f1731l;

    public C0474l(C10539l c10539l, ThreadLocal threadLocal) {
        this.f1731l = c10539l;
        this.f1730l = threadLocal;
        this.f1729l = new C12119l(threadLocal);
    }

    @Override // defpackage.InterfaceC5763l
    public final InterfaceC15446l getKey() {
        return this.f1729l;
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: import */
    public final InterfaceC12932l mo244import(InterfaceC15446l interfaceC15446l) {
        return this.f1729l.equals(interfaceC15446l) ? C17218l.f33421l : this;
    }

    public final Object loadAd() {
        ThreadLocal threadLocal = this.f1730l;
        Object obj = threadLocal.get();
        threadLocal.set(this.f1731l);
        return obj;
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚۣؒ */
    public final InterfaceC5763l mo245l(InterfaceC15446l interfaceC15446l) {
        if (this.f1729l.equals(interfaceC15446l)) {
            return this;
        }
        return null;
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

    public final String toString() {
        return "ThreadLocal(value=" + this.f1731l + ", threadLocal = " + this.f1730l + ')';
    }

    public final void yandex(Object obj) {
        this.f1730l.set(obj);
    }
}

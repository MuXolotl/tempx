package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lؚؕۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7035l implements InterfaceC7204l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f14747l = new Object();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC7799l f14748l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC5921l f14749l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC9473l f14750l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f14751l;

    public C7035l(InterfaceC9473l interfaceC9473l, AbstractC5921l abstractC5921l, AbstractC7799l abstractC7799l) {
        this.f14749l = abstractC5921l;
        this.f14748l = abstractC7799l;
        this.f14750l = interfaceC9473l;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f14747l) {
            this.f14751l = true;
            InterfaceC9473l interfaceC9473l = this.f14750l;
            if (interfaceC9473l != null) {
                try {
                    interfaceC9473l.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC7204l
    public final AbstractC5921l getFileSystem() {
        return this.f14749l;
    }

    @Override // defpackage.InterfaceC7204l
    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final AbstractC7799l mo2150interface() {
        return this.f14748l;
    }

    @Override // defpackage.InterfaceC7204l
    /* JADX INFO: renamed from: lؙٗۛ, reason: contains not printable characters */
    public final InterfaceC9473l mo2151l() {
        synchronized (this.f14747l) {
            if (this.f14751l) {
                throw new IllegalStateException("closed");
            }
            InterfaceC9473l interfaceC9473l = this.f14750l;
            if (interfaceC9473l != null) {
                return interfaceC9473l;
            }
            C1503l c1503l = new C1503l(this.f14749l.mo692default(null));
            this.f14750l = c1503l;
            return c1503l;
        }
    }

    @Override // defpackage.InterfaceC7204l
    /* JADX INFO: renamed from: lْ٘ۚ, reason: contains not printable characters */
    public final C14025l mo2152l() {
        synchronized (this.f14747l) {
            if (this.f14751l) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }
}

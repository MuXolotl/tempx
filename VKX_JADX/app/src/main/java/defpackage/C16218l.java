package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lؘٖٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16218l implements InterfaceC7204l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f31742l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C1503l f31743l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC5921l f31744l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C14025l f31745l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Object f31746l = new Object();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AutoCloseable f31747l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f31748l;

    public C16218l(C14025l c14025l, AbstractC5921l abstractC5921l, String str, AutoCloseable autoCloseable) {
        this.f31745l = c14025l;
        this.f31744l = abstractC5921l;
        this.f31742l = str;
        this.f31747l = autoCloseable;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.AutoCloseable
    public final void close() {
        AutoCloseable autoCloseable;
        synchronized (this.f31746l) {
            this.f31748l = true;
            C1503l c1503l = this.f31743l;
            if (c1503l != null) {
                try {
                    c1503l.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
                autoCloseable = this.f31747l;
                if (autoCloseable != null) {
                    try {
                        AbstractC12589l.m3425synchronized(autoCloseable);
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                    }
                }
                Unit unit = Unit.INSTANCE;
            } else {
                autoCloseable = this.f31747l;
                if (autoCloseable != null) {
                    AbstractC12589l.m3425synchronized(autoCloseable);
                }
                Unit unit2 = Unit.INSTANCE;
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC7204l
    public final AbstractC5921l getFileSystem() {
        return this.f31744l;
    }

    @Override // defpackage.InterfaceC7204l
    /* JADX INFO: renamed from: interface */
    public final AbstractC7799l mo2150interface() {
        return null;
    }

    @Override // defpackage.InterfaceC7204l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final InterfaceC9473l mo2151l() {
        synchronized (this.f31746l) {
            if (this.f31748l) {
                throw new IllegalStateException("closed");
            }
            C1503l c1503l = this.f31743l;
            if (c1503l != null) {
                return c1503l;
            }
            C1503l c1503l2 = new C1503l(this.f31744l.mo692default(this.f31745l));
            this.f31743l = c1503l2;
            return c1503l2;
        }
    }

    @Override // defpackage.InterfaceC7204l
    /* JADX INFO: renamed from: lْ٘ۚ */
    public final C14025l mo2152l() {
        C14025l c14025l;
        synchronized (this.f31746l) {
            if (this.f31748l) {
                throw new IllegalStateException("closed");
            }
            c14025l = this.f31745l;
        }
        return c14025l;
    }
}

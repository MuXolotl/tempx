package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٕؓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15404l implements AutoCloseable {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f30097l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C15291l f30098l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2427l f30099l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C1090l f30100l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C17954l f30102l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f30096l = new Object();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final ArrayList f30101l = new ArrayList();

    public C15404l(C2427l c2427l, C15291l c15291l) {
        this.f30099l = c2427l;
        this.f30098l = c15291l;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f30096l) {
            try {
                if (this.f30097l) {
                    return;
                }
                this.f30097l = true;
                AbstractC1186l abstractC1186lTapsense = AbstractC1186l.tapsense(this.f30101l);
                CallableC15551l callableC15551l = new CallableC15551l(0, new RunnableC11297l(22, this));
                C8911l c8911l = new C8911l(abstractC1186lTapsense, false);
                c8911l.f18308l = new C10313l(c8911l, callableC15551l);
                c8911l.subscription();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void yandex() {
        if (this.f30100l == null) {
            this.f30100l = new C1090l();
            C17954l c17954l = new C17954l(this.f30098l, this.f30099l, new C8797l(this), new C8797l(this));
            this.f30102l = c17954l;
            C9866l c9866l = C17954l.mopub;
            synchronized (c9866l) {
                c9866l.yandex.addLast(c17954l);
                c9866l.yandex();
            }
        }
    }
}

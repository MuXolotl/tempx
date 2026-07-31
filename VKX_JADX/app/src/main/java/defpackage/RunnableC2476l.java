package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lًؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2476l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ boolean f5256l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AtomicBoolean f5257l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f5258l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f5259l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ boolean f5260l;

    public /* synthetic */ RunnableC2476l(Object obj, AtomicBoolean atomicBoolean, boolean z, boolean z2, int i) {
        this.f5258l = i;
        this.f5259l = obj;
        this.f5257l = atomicBoolean;
        this.f5256l = z;
        this.f5260l = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5258l;
        boolean z = this.f5260l;
        boolean z2 = this.f5256l;
        AtomicBoolean atomicBoolean = this.f5257l;
        C4619l c4619l = (C4619l) this.f5259l;
        switch (i) {
            case 0:
                atomicBoolean.set(false);
                C13645l.startapp((C13645l) c4619l.f9373l, z2, z);
                break;
            default:
                atomicBoolean.set(false);
                ((C13568l) c4619l.f9373l).advert(z2, z);
                break;
        }
    }
}

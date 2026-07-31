package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lٖ۟ؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC16663l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AtomicBoolean f32670l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32671l;

    public /* synthetic */ RunnableC16663l(AtomicBoolean atomicBoolean, int i) {
        this.f32671l = i;
        this.f32670l = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f32671l;
        AtomicBoolean atomicBoolean = this.f32670l;
        switch (i) {
            case 0:
                atomicBoolean.set(true);
                break;
            default:
                atomicBoolean.set(true);
                break;
        }
    }
}

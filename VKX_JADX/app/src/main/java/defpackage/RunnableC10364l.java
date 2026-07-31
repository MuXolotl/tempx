package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lَ٘ٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC10364l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C5807l f21161l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AtomicBoolean f21162l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21163l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f21164l;

    public /* synthetic */ RunnableC10364l(AtomicBoolean atomicBoolean, C5807l c5807l, Function0 function0, int i) {
        this.f21163l = i;
        this.f21162l = atomicBoolean;
        this.f21161l = c5807l;
        this.f21164l = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f21163l;
        Function0 function0 = this.f21164l;
        C5807l c5807l = this.f21161l;
        AtomicBoolean atomicBoolean = this.f21162l;
        switch (i) {
            case 0:
                if (!atomicBoolean.get()) {
                    try {
                        c5807l.loadAd(function0.invoke());
                    } catch (Throwable th) {
                        c5807l.amazon(th);
                        return;
                    }
                    break;
                }
                break;
            default:
                if (!atomicBoolean.get()) {
                    try {
                        c5807l.loadAd(function0.invoke());
                    } catch (Throwable th2) {
                        c5807l.amazon(th2);
                    }
                    break;
                }
                break;
        }
    }
}

package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: renamed from: lٓۦَ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC14553l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f28495l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f28496l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28497l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f28498l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f28499l;

    public /* synthetic */ RunnableC14553l(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.f28497l = i;
        this.f28495l = obj;
        this.f28499l = obj2;
        this.f28498l = obj3;
        this.f28496l = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28497l) {
            case 0:
                Context context = (Context) this.f28495l;
                boolean z = this.f28496l;
                C17804l c17804l = (C17804l) this.f28499l;
                C17849l c17849l = (C17849l) this.f28498l;
                C15081l c15081lM3926import = C15081l.m3926import(context);
                if (c15081lM3926import == null) {
                    AbstractC6427l.vip("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z) {
                    C17505l c17505l = c17804l.f34701l;
                    c17505l.getClass();
                    c17505l.f34110l.yandex(c15081lM3926import);
                }
                LogSessionId logSessionIdM3931instanceof = c15081lM3926import.m3931instanceof();
                synchronized (c17849l) {
                    C17240l c17240l = c17849l.loadAd;
                    c17240l.getClass();
                    c17240l.admob(logSessionIdM3931instanceof);
                }
                return;
            case 1:
                C3726l c3726l = (C3726l) this.f28495l;
                boolean z2 = this.f28496l;
                C6499l c6499l = (C6499l) this.f28499l;
                Runnable runnable = (Runnable) this.f28498l;
                if (z2) {
                    c3726l.billing(c6499l, new C6536l(new C12417l("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY)));
                }
                runnable.run();
                c3726l.mopub.billing.metrica(c6499l);
                return;
            case 2:
                C3551l c3551l = (C3551l) this.f28495l;
                C15691l c15691l = (C15691l) this.f28499l;
                EnumC8920l enumC8920l = (EnumC8920l) this.f28498l;
                boolean z3 = this.f28496l;
                C15691l c15691l2 = c3551l.vip;
                if (c15691l2 != null && !c15691l2.admob.f32512l.isDone()) {
                    c3551l.vip.crashlytics();
                }
                c3551l.isVip = z3;
                c3551l.vip = c15691l;
                c3551l.metrica = enumC8920l;
                c3551l.subs(c15691l, enumC8920l, true);
                return;
            default:
                C12714l c12714l = (C12714l) this.f28495l;
                AbstractC2883l abstractC2883l = (AbstractC2883l) this.f28499l;
                C18724l c18724l = (C18724l) this.f28498l;
                boolean z4 = this.f28496l;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                ((C17093l) c12714l.f25074l).amazon(abstractC2883l, c18724l.yandex, z4);
                return;
        }
    }

    public /* synthetic */ RunnableC14553l(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.f28497l = i;
        this.f28495l = obj;
        this.f28496l = z;
        this.f28499l = obj2;
        this.f28498l = obj3;
    }
}

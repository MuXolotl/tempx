package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: lٓؓۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13896l extends AbstractC1872l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C8688l f27161l = new C8688l(C5617l.f11957l);

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C17548l f27162l = new C17548l(5);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Choreographer f27163l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f27166l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Handler f27168l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C2552l f27169l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f27170l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Object f27167l = new Object();

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C11315l f27171l = new C11315l();

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public ArrayList f27164l = new ArrayList();

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public ArrayList f27165l = new ArrayList();

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final ChoreographerFrameCallbackC8541l f27172l = new ChoreographerFrameCallbackC8541l(this);

    public C13896l(Choreographer choreographer, Handler handler) {
        this.f27163l = choreographer;
        this.f27168l = handler;
        this.f27169l = new C2552l(choreographer, this);
    }

    /* JADX INFO: renamed from: lًٚٔ, reason: contains not printable characters */
    public static final void m3799l(C13896l c13896l) {
        boolean z;
        do {
            Runnable runnableM3800l = c13896l.m3800l();
            while (runnableM3800l != null) {
                runnableM3800l.run();
                runnableM3800l = c13896l.m3800l();
            }
            synchronized (c13896l.f27167l) {
                if (c13896l.f27171l.isEmpty()) {
                    z = false;
                    c13896l.f27170l = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    /* JADX INFO: renamed from: lؗۨؑ, reason: contains not printable characters */
    public final Runnable m3800l() {
        Runnable runnable;
        synchronized (this.f27167l) {
            C11315l c11315l = this.f27171l;
            runnable = (Runnable) (c11315l.isEmpty() ? null : c11315l.removeFirst());
        }
        return runnable;
    }

    @Override // defpackage.AbstractC1872l
    public final void vip(InterfaceC12932l interfaceC12932l, Runnable runnable) {
        synchronized (this.f27167l) {
            try {
                this.f27171l.addLast(runnable);
                if (!this.f27170l) {
                    this.f27170l = true;
                    this.f27168l.post(this.f27172l);
                    if (!this.f27166l) {
                        this.f27166l = true;
                        this.f27163l.postFrameCallback(this.f27172l);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

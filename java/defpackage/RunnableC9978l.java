package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: lٍؚۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9978l extends AbstractC15029l implements Runnable, InterfaceC12833l, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C12923l f20376l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f20377l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f20378l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C1473l f20379l;

    public RunnableC9978l(C12923l c12923l) {
        super(!c12923l.tapsense ? 1 : 0);
        this.f20376l = c12923l;
    }

    @Override // defpackage.InterfaceC12833l
    /* JADX INFO: renamed from: implements */
    public final C1473l mo404implements(View view, C1473l c1473l) {
        this.f20379l = c1473l;
        C12923l c12923l = this.f20376l;
        C11414l c11414l = c12923l.ads;
        C17212l c17212l = c1473l.yandex;
        c11414l.billing(AbstractC13573l.crashlytics(c17212l.subs(8)));
        if (this.f20378l) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f20377l) {
            c12923l.subscription.billing(AbstractC13573l.crashlytics(c17212l.subs(8)));
            C12923l.loadAd(c12923l, c1473l);
        }
        return c12923l.tapsense ? C1473l.loadAd : c1473l;
    }

    @Override // defpackage.AbstractC15029l
    public final C13645l metrica(C12902l c12902l, C13645l c13645l) {
        this.f20378l = false;
        return c13645l;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // defpackage.AbstractC15029l
    public final void remoteconfig(C12902l c12902l) {
        this.f20378l = true;
        this.f20377l = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f20378l) {
            this.f20378l = false;
            this.f20377l = false;
            C1473l c1473l = this.f20379l;
            if (c1473l != null) {
                C12923l c12923l = this.f20376l;
                c12923l.subscription.billing(AbstractC13573l.crashlytics(c1473l.yandex.subs(8)));
                C12923l.loadAd(c12923l, c1473l);
                this.f20379l = null;
            }
        }
    }

    @Override // defpackage.AbstractC15029l
    public final void smaato(C12902l c12902l) {
        this.f20378l = false;
        this.f20377l = false;
        C1473l c1473l = this.f20379l;
        if (c12902l.yandex.yandex() > 0 && c1473l != null) {
            C17212l c17212l = c1473l.yandex;
            C12923l c12923l = this.f20376l;
            c12923l.subscription.billing(AbstractC13573l.crashlytics(c17212l.subs(8)));
            c12923l.ads.billing(AbstractC13573l.crashlytics(c17212l.subs(8)));
            C12923l.loadAd(c12923l, c1473l);
        }
        this.f20379l = null;
    }

    @Override // defpackage.AbstractC15029l
    public final C1473l vip(C1473l c1473l, List list) {
        C12923l c12923l = this.f20376l;
        C12923l.loadAd(c12923l, c1473l);
        return c12923l.tapsense ? C1473l.loadAd : c1473l;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}

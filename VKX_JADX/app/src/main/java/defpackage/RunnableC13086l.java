package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewAnimationUtils;

/* JADX INFO: renamed from: lْؓؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC13086l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f25606l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f25607l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25608l;

    public /* synthetic */ RunnableC13086l(Object obj, long j, int i) {
        this.f25608l = i;
        this.f25606l = obj;
        this.f25607l = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f25608l;
        long j = this.f25607l;
        Object obj = this.f25606l;
        switch (i) {
            case 0:
                SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l = (SurfaceHolderCallbackC18330l) ((C18595l) obj).f36316l;
                String str = AbstractC15323l.yandex;
                C17505l c17505l = surfaceHolderCallbackC18330l.yandex.f34701l;
                C5597l c5597lM4397goto = c17505l.m4397goto();
                c17505l.m4401super(c5597lM4397goto, 1010, new C9435l(j, c5597lM4397goto));
                break;
            default:
                View view = (View) obj;
                if (view.isAttachedToWindow()) {
                    view.setVisibility(0);
                    Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, (view.getRight() + view.getLeft()) / 2, (view.getBottom() + view.getTop()) / 2, 0.0f, Math.max(view.getWidth(), view.getHeight()));
                    animatorCreateCircularReveal.setDuration(j);
                    animatorCreateCircularReveal.start();
                }
                break;
        }
    }
}

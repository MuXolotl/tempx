package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؚ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7538l extends AnimatorListenerAdapter {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public C7538l(InterfaceC5174l interfaceC5174l, View view) {
        this.yandex = 8;
        this.loadAd = interfaceC5174l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f154l = null;
                actionBarOverlayLayout.f143l = false;
                break;
            case 8:
                ((InterfaceC5174l) obj).yandex();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f154l = null;
                actionBarOverlayLayout.f143l = false;
                break;
            case 1:
                C9437l c9437l = (C9437l) obj;
                ArrayList arrayList = new ArrayList(c9437l.f19300l);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((AbstractC5287l) arrayList.get(i2)).yandex(c9437l);
                }
                break;
            case 2:
                super.onAnimationEnd(animator);
                ((C5823l) obj).invoke();
                break;
            case 3:
                C0602l c0602l = (C0602l) obj;
                c0602l.startapp();
                c0602l.ads.start();
                break;
            case 4:
                ((HideBottomViewOnScrollBehavior) obj).admob = null;
                break;
            case 5:
                C0992l c0992l = (C0992l) obj;
                c0992l.f2739l = false;
                c0992l.purchase(c0992l.f2714l);
                break;
            case 6:
                AbstractC13209l.yandex.postDelayed((RunnableC12388l) obj, 100L);
                break;
            case 7:
                ((AbstractC1299l) obj).vip();
                animator.removeListener(this);
                break;
            default:
                ((InterfaceC5174l) obj).crashlytics();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 1:
                C9437l c9437l = (C9437l) obj;
                ArrayList arrayList = new ArrayList(c9437l.f19300l);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((AbstractC5287l) arrayList.get(i2)).loadAd(c9437l);
                }
                break;
            case 8:
                ((InterfaceC5174l) obj).loadAd();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ C7538l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }
}

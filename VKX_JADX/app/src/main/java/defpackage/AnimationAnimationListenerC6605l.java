package defpackage;

import android.view.View;
import android.view.animation.Animation;

/* JADX INFO: renamed from: lٍؙٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC6605l implements Animation.AnimationListener {
    public final /* synthetic */ View loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ AnimationAnimationListenerC6605l(View view, int i) {
        this.yandex = i;
        this.loadAd = view;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        InterfaceC10072l interfaceC10072l;
        int i = this.yandex;
        View view = this.loadAd;
        switch (i) {
            case 0:
                C12656l c12656l = (C12656l) view;
                if (!c12656l.f24891l) {
                    c12656l.smaato();
                } else {
                    c12656l.f24912l.setAlpha(255);
                    c12656l.f24912l.start();
                    if (c12656l.f24903l && (interfaceC10072l = c12656l.f24899l) != null) {
                        ((AbstractC11519l) ((C6536l) interfaceC10072l).f13620l).mo782this();
                    }
                    c12656l.f24919l = c12656l.f24894l.getTop();
                }
                break;
            case 1:
                C12656l c12656l2 = (C12656l) view;
                C4907l c4907l = new C4907l(c12656l2, 1);
                c12656l2.f24904l = c4907l;
                c4907l.setDuration(150L);
                C18365l c18365l = c12656l2.f24894l;
                c18365l.f35881l = null;
                c18365l.clearAnimation();
                c12656l2.f24894l.startAnimation(c12656l2.f24904l);
                break;
            default:
                ((C10218l) view).f20828l = null;
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.yandex;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i = this.yandex;
    }

    private final void amazon(Animation animation) {
    }

    private final void billing(Animation animation) {
    }

    private final void crashlytics(Animation animation) {
    }

    private final void loadAd(Animation animation) {
    }

    private final void purchase(Animation animation) {
    }

    private final void yandex(Animation animation) {
    }
}

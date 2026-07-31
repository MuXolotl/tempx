package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lً۟ؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8293l extends AnimatorListenerAdapter {
    public final /* synthetic */ AbstractC3371l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C8293l(AbstractC3371l abstractC3371l, int i) {
        this.yandex = i;
        this.loadAd = abstractC3371l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.yandex) {
            case 1:
                super.onAnimationEnd(animator);
                AbstractC3371l abstractC3371l = this.loadAd;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = abstractC3371l.f7186l;
                if (arrayList != null && !abstractC3371l.f7178l) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC5287l) it.next()).yandex(abstractC3371l);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.yandex) {
            case 0:
                super.onAnimationStart(animator);
                AbstractC3371l abstractC3371l = this.loadAd;
                ArrayList arrayList = abstractC3371l.f7186l;
                if (arrayList != null && !abstractC3371l.f7178l) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC5287l) it.next()).loadAd(abstractC3371l);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}

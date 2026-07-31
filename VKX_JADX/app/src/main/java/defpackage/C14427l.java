package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* JADX INFO: renamed from: lۣٓۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C14427l implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object crashlytics;
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C14427l(Object obj, Object obj2, int i) {
        this.yandex = i;
        this.loadAd = obj;
        this.crashlytics = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.yandex;
        Object obj = this.crashlytics;
        Object obj2 = this.loadAd;
        switch (i) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                int i2 = AppBarLayout.f590l;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((C5022l) obj).subs(fFloatValue);
                Drawable drawable = appBarLayout.f595l;
                if (drawable instanceof C5022l) {
                    ((C5022l) drawable).subs(fFloatValue);
                }
                Iterator it = appBarLayout.f603l.iterator();
                if (it.hasNext()) {
                    throw AbstractC15560l.adcel(it);
                }
                return;
            case 1:
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                num.getClass();
                ((C13703l) obj).billing.billing(num);
                ((C9478l) obj2).admob.invalidate();
                return;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((C9928l) obj2).mo2755else(1.0f - fFloatValue2);
                ((AbstractC17054l) obj).mo2755else(fFloatValue2);
                return;
        }
    }
}

package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* JADX INFO: renamed from: lٍؘٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9359l {
    public final /* synthetic */ NextDockView crashlytics;
    public final C10038l loadAd;
    public final C17572l yandex;

    public C9359l(final NextDockView nextDockView, C17572l c17572l, C10038l c10038l) {
        this.crashlytics = nextDockView;
        this.yandex = c17572l;
        this.loadAd = c10038l;
        ViewOnClickListenerC18156l viewOnClickListenerC18156l = new ViewOnClickListenerC18156l(nextDockView, this, 3);
        ((AppCompatImageView) c10038l.f20466l).setImageResource(c17572l.crashlytics);
        View view = (View) c10038l.f20462l;
        view.setContentDescription(c17572l.loadAd);
        view.setOnClickListener(viewOnClickListenerC18156l);
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: lؔۡؓ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                nextDockView.f36851l.invoke(this.yandex.yandex, view2);
                return true;
            }
        });
        yandex(AbstractC13209l.yandex(R.attr.text_secondary), 0);
    }

    public final void loadAd(boolean z, boolean z2) {
        int i = R.attr.global_accent;
        int i2 = R.attr.text_secondary;
        int i3 = 0;
        if (!z2) {
            if (z) {
                i2 = R.attr.global_accent;
            }
            yandex(AbstractC13209l.yandex(i2), z ? AbstractC13209l.yandex(R.attr.global_accent) : 0);
            return;
        }
        int iYandex = AbstractC13209l.yandex(z ? R.attr.text_secondary : R.attr.global_accent);
        if (z) {
            i2 = R.attr.global_accent;
        }
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(iYandex, AbstractC13209l.yandex(i2));
        valueAnimatorOfArgb.setDuration(350L);
        valueAnimatorOfArgb.addUpdateListener(new C12616l(this, i3));
        valueAnimatorOfArgb.start();
        if (this.crashlytics.f36853l) {
            return;
        }
        int iYandex2 = AbstractC13209l.yandex(z ? 0 : R.attr.global_accent);
        if (!z) {
            i = 0;
        }
        ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(iYandex2, AbstractC13209l.yandex(i));
        valueAnimatorOfArgb2.setDuration(350L);
        valueAnimatorOfArgb2.addUpdateListener(new C12616l(this, 1));
        valueAnimatorOfArgb2.start();
    }

    public final void yandex(int i, int i2) {
        C10038l c10038l = this.loadAd;
        ((AppCompatImageView) c10038l.f20466l).setImageTintList(ColorStateList.valueOf(i));
        boolean z = this.crashlytics.f36853l;
        FrameLayout frameLayout = (FrameLayout) c10038l.f20465l;
        if (z) {
            frameLayout.setBackgroundTintList(ColorStateList.valueOf(0));
        } else {
            frameLayout.setBackgroundTintList(ColorStateList.valueOf(i2));
        }
    }
}

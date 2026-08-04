package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؒۧٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1500l extends AbstractC13799l {
    public final TimeInterpolator admob;
    public final int billing;
    public final ViewOnFocusChangeListenerC10099l firebase;
    public final ViewOnClickListenerC9657l isPro;
    public final TimeInterpolator mopub;
    public final int purchase;
    public ValueAnimator remoteconfig;
    public AnimatorSet smaato;
    public EditText subs;

    public C1500l(C12124l c12124l) {
        super(c12124l);
        this.isPro = new ViewOnClickListenerC9657l(1, this);
        this.firebase = new ViewOnFocusChangeListenerC10099l(this, 0);
        this.purchase = AbstractC15422l.mopub(c12124l.getContext(), R.attr.motionDurationShort3, 100);
        this.billing = AbstractC15422l.mopub(c12124l.getContext(), R.attr.motionDurationShort3, 150);
        this.mopub = AbstractC15422l.admob(c12124l.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0926l.yandex);
        this.admob = AbstractC15422l.admob(c12124l.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0926l.amazon);
    }

    @Override // defpackage.AbstractC13799l
    public final void adcel() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.admob);
        valueAnimatorOfFloat.setDuration(this.billing);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: lُْٓ
            public final /* synthetic */ C1500l loadAd;

            {
                this.loadAd = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                C1500l c1500l = this.loadAd;
                switch (i2) {
                    case 0:
                        c1500l.amazon.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c1500l.amazon;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.mopub;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i2 = this.purchase;
        valueAnimatorOfFloat2.setDuration(i2);
        final int i3 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: lُْٓ
            public final /* synthetic */ C1500l loadAd;

            {
                this.loadAd = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i4 = i3;
                C1500l c1500l = this.loadAd;
                switch (i4) {
                    case 0:
                        c1500l.amazon.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c1500l.amazon;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.smaato = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.smaato.addListener(new C2745l(this, i3));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i2);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: lُْٓ
            public final /* synthetic */ C1500l loadAd;

            {
                this.loadAd = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i4 = i3;
                C1500l c1500l = this.loadAd;
                switch (i4) {
                    case 0:
                        c1500l.amazon.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c1500l.amazon;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.remoteconfig = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C2745l(this, i));
    }

    @Override // defpackage.AbstractC13799l
    public final void ads() {
        EditText editText = this.subs;
        if (editText != null) {
            editText.post(new RunnableC16112l(16, this));
        }
    }

    @Override // defpackage.AbstractC13799l
    public final int amazon() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.AbstractC13799l
    public final View.OnClickListener billing() {
        return this.isPro;
    }

    @Override // defpackage.AbstractC13799l
    public final int crashlytics() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.AbstractC13799l
    public final void metrica(boolean z) {
        if (this.loadAd.f24130l == null) {
            return;
        }
        subscription(z);
    }

    @Override // defpackage.AbstractC13799l
    public final View.OnFocusChangeListener mopub() {
        return this.firebase;
    }

    @Override // defpackage.AbstractC13799l
    public final View.OnFocusChangeListener purchase() {
        return this.firebase;
    }

    @Override // defpackage.AbstractC13799l
    public final void smaato(EditText editText) {
        this.subs = editText;
        this.yandex.setEndIconVisible(tapsense());
    }

    public final void subscription(boolean z) {
        boolean z2 = this.loadAd.crashlytics() == z;
        if (z && !this.smaato.isRunning()) {
            this.remoteconfig.cancel();
            this.smaato.start();
            if (z2) {
                this.smaato.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.smaato.cancel();
        this.remoteconfig.start();
        if (z2) {
            this.remoteconfig.end();
        }
    }

    public final boolean tapsense() {
        EditText editText = this.subs;
        if (editText != null) {
            return (editText.hasFocus() || this.amazon.hasFocus()) && this.subs.getText().length() > 0;
        }
        return false;
    }

    @Override // defpackage.AbstractC13799l
    public final void yandex() {
        if (this.loadAd.f24130l != null) {
            return;
        }
        subscription(tapsense());
    }
}

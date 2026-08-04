package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٖٗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17156l {
    public int Signature;
    public boolean ad;
    public boolean adcel;
    public final TextInputLayout admob;
    public C9189l ads;
    public C9189l advert;
    public final TimeInterpolator amazon;
    public final TimeInterpolator billing;
    public final int crashlytics;
    public FrameLayout firebase;
    public int isPro;
    public int isVip;
    public ColorStateList license;
    public final int loadAd;
    public int metrica;
    public final Context mopub;
    public Typeface premium;
    public CharSequence pro;
    public final TimeInterpolator purchase;
    public final float remoteconfig;
    public ColorStateList signatures;
    public AnimatorSet smaato;
    public CharSequence startapp;
    public LinearLayout subs;
    public CharSequence subscription;
    public int tapsense;
    public int vip;
    public final int yandex;

    public C17156l(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.mopub = context;
        this.admob = textInputLayout;
        this.remoteconfig = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.yandex = AbstractC15422l.mopub(context, R.attr.motionDurationShort4, 217);
        this.loadAd = AbstractC15422l.mopub(context, R.attr.motionDurationMedium4, 167);
        this.crashlytics = AbstractC15422l.mopub(context, R.attr.motionDurationShort4, 167);
        this.amazon = AbstractC15422l.admob(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0926l.amazon);
        LinearInterpolator linearInterpolator = AbstractC0926l.yandex;
        this.purchase = AbstractC15422l.admob(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.billing = AbstractC15422l.admob(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final boolean admob(C9189l c9189l, CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        TextInputLayout textInputLayout = this.admob;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.metrica == this.vip && c9189l != null && TextUtils.equals(c9189l.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void amazon(ArrayList arrayList, boolean z, C9189l c9189l, int i, int i2, int i3) {
        if (c9189l == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c9189l, (Property<C9189l, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.crashlytics;
            objectAnimatorOfFloat.setDuration(z2 ? this.loadAd : i4);
            objectAnimatorOfFloat.setInterpolator(z2 ? this.purchase : this.billing);
            if (i == i3 && i2 != 0) {
                objectAnimatorOfFloat.setStartDelay(i4);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c9189l, (Property<C9189l, Float>) View.TRANSLATION_Y, -this.remoteconfig, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.yandex);
            objectAnimatorOfFloat2.setInterpolator(this.amazon);
            objectAnimatorOfFloat2.setStartDelay(i4);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final void billing() {
        this.startapp = null;
        crashlytics();
        if (this.vip == 1) {
            if (!this.ad || TextUtils.isEmpty(this.pro)) {
                this.metrica = 0;
            } else {
                this.metrica = 2;
            }
        }
        subs(this.vip, this.metrica, admob(this.ads, ""));
    }

    public final void crashlytics() {
        AnimatorSet animatorSet = this.smaato;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void loadAd() {
        if (this.subs != null) {
            TextInputLayout textInputLayout = this.admob;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.mopub;
                boolean zSmaato = AbstractC4927l.smaato(context);
                LinearLayout linearLayout = this.subs;
                WeakHashMap weakHashMap = AbstractC15872l.yandex;
                int paddingStart = editText.getPaddingStart();
                if (zSmaato) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zSmaato) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zSmaato) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void mopub(C9189l c9189l, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.subs;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.firebase) != null) {
            frameLayout.removeView(c9189l);
        } else {
            linearLayout.removeView(c9189l);
        }
        int i2 = this.isPro - 1;
        this.isPro = i2;
        LinearLayout linearLayout2 = this.subs;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final TextView purchase(int i) {
        if (i == 1) {
            return this.ads;
        }
        if (i != 2) {
            return null;
        }
        return this.advert;
    }

    public final void subs(int i, int i2, boolean z) {
        TextView textViewPurchase;
        TextView textViewPurchase2;
        C17156l c17156l = this;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            c17156l.smaato = animatorSet;
            ArrayList arrayList = new ArrayList();
            c17156l.amazon(arrayList, c17156l.ad, c17156l.advert, 2, i, i2);
            c17156l.amazon(arrayList, c17156l.adcel, c17156l.ads, 1, i, i2);
            int size = arrayList.size();
            long jMax = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Animator animator = (Animator) arrayList.get(i3);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            C11973l c11973l = new C11973l(this, i2, purchase(i), i, c17156l.purchase(i2));
            c17156l = this;
            animatorSet.addListener(c11973l);
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewPurchase2 = c17156l.purchase(i2)) != null) {
                textViewPurchase2.setVisibility(0);
                textViewPurchase2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewPurchase = purchase(i)) != null) {
                textViewPurchase.setVisibility(4);
                if (i == 1) {
                    textViewPurchase.setText((CharSequence) null);
                }
            }
            c17156l.vip = i2;
        }
        TextInputLayout textInputLayout = c17156l.admob;
        textInputLayout.ads();
        textInputLayout.Signature(z, false);
        textInputLayout.ad();
    }

    public final void yandex(C9189l c9189l, int i) {
        if (this.subs == null && this.firebase == null) {
            Context context = this.mopub;
            LinearLayout linearLayout = new LinearLayout(context);
            this.subs = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.subs;
            TextInputLayout textInputLayout = this.admob;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.firebase = new FrameLayout(context);
            this.subs.addView(this.firebase, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                loadAd();
            }
        }
        if (i == 0 || i == 1) {
            this.firebase.setVisibility(0);
            this.firebase.addView(c9189l);
        } else {
            this.subs.addView(c9189l, new LinearLayout.LayoutParams(-2, -2));
        }
        this.subs.setVisibility(0);
        this.isPro++;
    }
}

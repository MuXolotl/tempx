package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚٟؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2468l {
    public static final double advert = Math.cos(Math.toRadians(45.0d));
    public static final ColorDrawable isVip;
    public final TimeInterpolator Signature;
    public C5022l adcel;
    public int admob;
    public final C5022l amazon;
    public int billing;
    public final C5022l crashlytics;
    public ColorStateList firebase;
    public Drawable isPro;
    public final int license;
    public RippleDrawable metrica;
    public int mopub;
    public final int pro;
    public int purchase;
    public C12564l remoteconfig;
    public ColorStateList smaato;
    public LayerDrawable startapp;
    public Drawable subs;
    public boolean subscription;
    public ValueAnimator tapsense;
    public ColorStateList vip;
    public final MaterialCardView yandex;
    public final Rect loadAd = new Rect();
    public boolean ads = false;
    public float ad = 0.0f;

    static {
        isVip = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public C2468l(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        this.yandex = materialCardView;
        C5022l c5022l = new C5022l(materialCardView.getContext(), attributeSet, i, R.style.Widget_MaterialComponents_CardView);
        this.crashlytics = c5022l;
        c5022l.mopub(materialCardView.getContext());
        c5022l.smaato();
        C4968l c4968lPurchase = c5022l.f10262l.yandex.purchase();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, AbstractC4548l.billing, i, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
            c4968lPurchase.purchase = new C16304l(dimension);
            c4968lPurchase.billing = new C16304l(dimension);
            c4968lPurchase.mopub = new C16304l(dimension);
            c4968lPurchase.admob = new C16304l(dimension);
        }
        this.amazon = new C5022l();
        admob(c4968lPurchase.yandex());
        this.Signature = AbstractC15422l.admob(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0926l.yandex);
        this.license = AbstractC15422l.mopub(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.pro = AbstractC15422l.mopub(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float loadAd(AbstractC16431l abstractC16431l, float f) {
        if (abstractC16431l instanceof C10978l) {
            return (float) ((1.0d - advert) * ((double) f));
        }
        if (abstractC16431l instanceof C16563l) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final void admob(C12564l c12564l) {
        this.remoteconfig = c12564l;
        C5022l c5022l = this.crashlytics;
        c5022l.setShapeAppearanceModel(c12564l);
        c5022l.f10275l = !c5022l.admob();
        C5022l c5022l2 = this.amazon;
        if (c5022l2 != null) {
            c5022l2.setShapeAppearanceModel(c12564l);
        }
        C5022l c5022l3 = this.adcel;
        if (c5022l3 != null) {
            c5022l3.setShapeAppearanceModel(c12564l);
        }
    }

    public final C3615l amazon(Drawable drawable) {
        int iCeil;
        int i;
        MaterialCardView materialCardView = this.yandex;
        if (materialCardView.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() * 1.5f) + (subs() ? yandex() : 0.0f));
            iCeil = (int) Math.ceil(materialCardView.getMaxCardElevation() + (subs() ? yandex() : 0.0f));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new C3615l(drawable, iCeil, i, iCeil, i);
    }

    public final void billing(boolean z, boolean z2) {
        Drawable drawable = this.isPro;
        if (drawable != null) {
            if (!z2) {
                drawable.setAlpha(z ? 255 : 0);
                this.ad = z ? 1.0f : 0.0f;
                return;
            }
            float f = z ? 1.0f : 0.0f;
            float f2 = this.ad;
            if (z) {
                f2 = 1.0f - f2;
            }
            ValueAnimator valueAnimator = this.tapsense;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.tapsense = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.ad, f);
            this.tapsense = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new C14131l(4, this));
            this.tapsense.setInterpolator(this.Signature);
            this.tapsense.setDuration((long) ((z ? this.license : this.pro) * f2));
            this.tapsense.start();
        }
    }

    public final LayerDrawable crashlytics() {
        if (this.metrica == null) {
            int[] iArr = AbstractC14521l.yandex;
            this.adcel = new C5022l(this.remoteconfig);
            this.metrica = new RippleDrawable(this.firebase, null, this.adcel);
        }
        if (this.startapp == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.metrica, this.amazon, this.isPro});
            this.startapp = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.startapp;
    }

    public final void firebase() {
        Drawable drawable = this.subs;
        Drawable drawableCrashlytics = isPro() ? crashlytics() : this.amazon;
        this.subs = drawableCrashlytics;
        if (drawable != drawableCrashlytics) {
            MaterialCardView materialCardView = this.yandex;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableCrashlytics);
            } else {
                materialCardView.setForeground(amazon(drawableCrashlytics));
            }
        }
    }

    public final boolean isPro() {
        View view = this.yandex;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void mopub(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.isPro = drawableMutate;
            drawableMutate.setTintList(this.smaato);
            billing(this.yandex.f675l, false);
        } else {
            this.isPro = isVip;
        }
        LayerDrawable layerDrawable = this.startapp;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.isPro);
        }
    }

    public final void purchase(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.startapp != null) {
            MaterialCardView materialCardView = this.yandex;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (subs() ? yandex() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (subs() ? yandex() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = this.mopub;
            boolean z = (i5 & 8388613) == 8388613;
            int i6 = this.purchase;
            int i7 = z ? ((i - i6) - this.billing) - iCeil2 : i6;
            int i8 = (i5 & 80) == 80 ? i6 : ((i2 - i6) - this.billing) - iCeil;
            int i9 = (i5 & 8388613) == 8388613 ? i6 : ((i - i6) - this.billing) - iCeil2;
            if ((i5 & 80) == 80) {
                i6 = ((i2 - i6) - this.billing) - iCeil;
            }
            int i10 = i6;
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            if (materialCardView.getLayoutDirection() == 1) {
                i4 = i9;
                i3 = i7;
            } else {
                i3 = i9;
                i4 = i7;
            }
            this.startapp.setLayerInset(2, i4, i10, i3, i8);
        }
    }

    public final void remoteconfig() {
        boolean z = this.ads;
        MaterialCardView materialCardView = this.yandex;
        if (!z) {
            materialCardView.setBackgroundInternal(amazon(this.crashlytics));
        }
        materialCardView.setForeground(amazon(this.subs));
    }

    public final void smaato() {
        MaterialCardView materialCardView = this.yandex;
        float cardViewRadius = 0.0f;
        float fYandex = ((!materialCardView.getPreventCornerOverlap() || this.crashlytics.admob()) && !subs()) ? 0.0f : yandex();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - advert) * ((double) materialCardView.getCardViewRadius()));
        }
        int i = (int) (fYandex - cardViewRadius);
        Rect rect = this.loadAd;
        materialCardView.f5589l.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        AbstractC2568l.f5587l.vip(materialCardView.f5592l);
    }

    public final boolean subs() {
        MaterialCardView materialCardView = this.yandex;
        return materialCardView.getPreventCornerOverlap() && this.crashlytics.admob() && materialCardView.getUseCompatPadding();
    }

    public final float yandex() {
        AbstractC16431l abstractC16431l = this.remoteconfig.yandex;
        C5022l c5022l = this.crashlytics;
        return Math.max(Math.max(loadAd(abstractC16431l, c5022l.purchase()), loadAd(this.remoteconfig.loadAd, c5022l.f10262l.yandex.billing.yandex(c5022l.amazon()))), Math.max(loadAd(this.remoteconfig.crashlytics, c5022l.f10262l.yandex.mopub.yandex(c5022l.amazon())), loadAd(this.remoteconfig.amazon, c5022l.f10262l.yandex.admob.yandex(c5022l.amazon()))));
    }
}

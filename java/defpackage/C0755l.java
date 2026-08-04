package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؒؐ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0755l extends C18595l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public boolean f2271l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C10519l f2272l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public ColorStateList f2273l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public boolean f2274l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Drawable f2275l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public PorterDuff.Mode f2276l;

    public C0755l(C10519l c10519l) {
        super(c10519l);
        this.f2273l = null;
        this.f2276l = null;
        this.f2274l = false;
        this.f2271l = false;
        this.f2272l = c10519l;
    }

    public final void premium(Canvas canvas) {
        if (this.f2275l != null) {
            C10519l c10519l = this.f2272l;
            int max = c10519l.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2275l.getIntrinsicWidth();
                int intrinsicHeight = this.f2275l.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2275l.setBounds(-i, -i2, i, i2);
                float width = ((c10519l.getWidth() - c10519l.getPaddingLeft()) - c10519l.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(c10519l.getPaddingLeft(), c10519l.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2275l.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    public final void signatures() {
        Drawable drawable = this.f2275l;
        if (drawable != null) {
            if (this.f2274l || this.f2271l) {
                Drawable drawableMutate = drawable.mutate();
                this.f2275l = drawableMutate;
                if (this.f2274l) {
                    drawableMutate.setTintList(this.f2273l);
                }
                if (this.f2271l) {
                    this.f2275l.setTintMode(this.f2276l);
                }
                if (this.f2275l.isStateful()) {
                    this.f2275l.setState(this.f2272l.getDrawableState());
                }
            }
        }
    }

    @Override // defpackage.C18595l
    public final void tapsense(AttributeSet attributeSet, int i) {
        super.tapsense(attributeSet, R.attr.seekBarStyle);
        C10519l c10519l = this.f2272l;
        Context context = c10519l.getContext();
        int[] iArr = AbstractC14657l.mopub;
        C12418l c12418lPro = C12418l.pro(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) c12418lPro.f24518l;
        AbstractC15872l.remoteconfig(c10519l, c10519l.getContext(), iArr, attributeSet, (TypedArray) c12418lPro.f24518l, R.attr.seekBarStyle);
        Drawable drawableSubscription = c12418lPro.subscription(0);
        if (drawableSubscription != null) {
            c10519l.setThumb(drawableSubscription);
        }
        Drawable drawableAds = c12418lPro.ads(1);
        Drawable drawable = this.f2275l;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2275l = drawableAds;
        if (drawableAds != null) {
            drawableAds.setCallback(c10519l);
            drawableAds.setLayoutDirection(c10519l.getLayoutDirection());
            if (drawableAds.isStateful()) {
                drawableAds.setState(c10519l.getDrawableState());
            }
            signatures();
        }
        c10519l.invalidate();
        if (typedArray.hasValue(3)) {
            this.f2276l = AbstractC2341l.crashlytics(typedArray.getInt(3, -1), this.f2276l);
            this.f2271l = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2273l = c12418lPro.adcel(2);
            this.f2274l = true;
        }
        c12418lPro.advert();
        signatures();
    }
}

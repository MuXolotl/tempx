package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* JADX INFO: renamed from: lؕۛؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3636l extends AbstractC13712l {
    public float admob;
    public C13698l amazon;
    public C13698l billing;
    public float firebase;
    public float isPro;
    public float mopub;
    public float purchase;
    public Paint.Join remoteconfig;
    public Paint.Cap smaato;
    public float subs;
    public float vip;

    public float getFillAlpha() {
        return this.admob;
    }

    public int getFillColor() {
        return this.billing.f26744l;
    }

    public float getStrokeAlpha() {
        return this.mopub;
    }

    public int getStrokeColor() {
        return this.amazon.f26744l;
    }

    public float getStrokeWidth() {
        return this.purchase;
    }

    public float getTrimPathEnd() {
        return this.isPro;
    }

    public float getTrimPathOffset() {
        return this.firebase;
    }

    public float getTrimPathStart() {
        return this.subs;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // defpackage.AbstractC3126l
    public final boolean loadAd(int[] iArr) {
        boolean z;
        C13698l c13698l = this.billing;
        boolean z2 = true;
        if (c13698l.m3682strictfp()) {
            ColorStateList colorStateList = (ColorStateList) c13698l.f26746l;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != c13698l.f26744l) {
                c13698l.f26744l = colorForState;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        C13698l c13698l2 = this.amazon;
        if (c13698l2.m3682strictfp()) {
            ColorStateList colorStateList2 = (ColorStateList) c13698l2.f26746l;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != c13698l2.f26744l) {
                c13698l2.f26744l = colorForState2;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        return z | z2;
    }

    public void setFillAlpha(float f) {
        this.admob = f;
    }

    public void setFillColor(int i) {
        this.billing.f26744l = i;
    }

    public void setStrokeAlpha(float f) {
        this.mopub = f;
    }

    public void setStrokeColor(int i) {
        this.amazon.f26744l = i;
    }

    public void setStrokeWidth(float f) {
        this.purchase = f;
    }

    public void setTrimPathEnd(float f) {
        this.isPro = f;
    }

    public void setTrimPathOffset(float f) {
        this.firebase = f;
    }

    public void setTrimPathStart(float f) {
        this.subs = f;
    }

    @Override // defpackage.AbstractC3126l
    public final boolean yandex() {
        return this.billing.m3682strictfp() || this.amazon.m3682strictfp();
    }
}

package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: renamed from: lِْؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0992l extends Drawable implements Animatable {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public int f2714l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public float f2715l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final float f2716l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final float f2717l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f2718l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public C7527l f2719l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public ObjectAnimator f2720l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int f2721l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final int f2723l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final float f2724l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final float f2725l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f2726l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final float f2729l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final float f2731l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final float f2732l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final float f2734l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final float f2735l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final float f2736l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final float f2737l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final Object f2738l = new Object();

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final Paint f2730l = new Paint();

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final Paint f2722l = new Paint();

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public float f2727l = 0.0f;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f2739l = false;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public int f2728l = 1;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public int f2733l = 1;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C10550l f2740l = new C10550l(8, Float.class, "transformation");

    public C0992l(Context context, int i) {
        Resources resources = context.getResources();
        float fApplyDimension = TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()) * 1.0f;
        this.f2724l = fApplyDimension;
        this.f2717l = TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()) * 1.0f;
        float fApplyDimension2 = TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()) * 1.0f;
        this.f2732l = fApplyDimension2;
        this.f2731l = TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()) * 1.0f;
        this.f2736l = TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()) * 1.0f;
        this.f2725l = fApplyDimension / 2.0f;
        this.f2723l = 2;
        this.f2726l = true;
        int iApplyDimension = (int) (TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()) * 1.0f);
        this.f2718l = iApplyDimension;
        int iApplyDimension2 = (int) (TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()) * 1.0f);
        this.f2721l = iApplyDimension2;
        float fApplyDimension3 = TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()) * 1.0f;
        this.f2729l = fApplyDimension3;
        this.f2716l = TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()) * 1.0f;
        this.f2735l = TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()) * 1.0f;
        this.f2734l = (iApplyDimension - fApplyDimension3) / 2.0f;
        this.f2737l = (iApplyDimension2 - (fApplyDimension2 * 5.0f)) / 2.0f;
        loadAd(i);
        yandex(800);
        this.f2719l = new C7527l(this);
    }

    public final float amazon(float f) {
        int iInmobi = AbstractC5020l.inmobi(this.f2723l);
        float f2 = this.f2732l;
        if (iInmobi == 0) {
            int i = this.f2733l;
            return (i == 3 || i == 6) ? f2 - (f * f2) : f * f2;
        }
        if (iInmobi != 1) {
            if (iInmobi != 2) {
                return 0.0f;
            }
            int i2 = this.f2733l;
            float f3 = this.f2731l;
            return (i2 == 3 || i2 == 6) ? f3 - ((f2 + this.f2724l) * f) : f * f3;
        }
        int i3 = this.f2733l;
        float f4 = this.f2725l;
        if (i3 != 3 && i3 != 6) {
            return (f2 + f4) * f;
        }
        float f5 = f2 + f4;
        return f5 - (f * f5);
    }

    public final void billing(int i, float f) {
        if (f < 0.0f || f > 2.0f) {
            C8339l.metrica("Value must be between 0.0 and 2.0");
            return;
        }
        this.f2733l = i;
        boolean z = f < 1.0f || f == 2.0f;
        this.f2728l = z ? AbstractC1757l.isVip(i) : AbstractC1757l.signatures(i);
        this.f2714l = z ? AbstractC1757l.signatures(i) : AbstractC1757l.isVip(i);
        this.f2727l = f;
        invalidateSelf();
    }

    public final boolean crashlytics() {
        return this.f2727l <= 1.0f;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0168  */
    /* JADX WARN: Code duplicated, block: B:39:0x016b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0170  */
    /* JADX WARN: Code duplicated, block: B:43:0x0173  */
    /* JADX WARN: Code duplicated, block: B:45:0x0176  */
    /* JADX WARN: Code duplicated, block: B:46:0x0181  */
    /* JADX WARN: Code duplicated, block: B:48:0x019b  */
    /* JADX WARN: Code duplicated, block: B:49:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:52:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:54:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:55:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:57:0x0200  */
    /* JADX WARN: Code duplicated, block: B:59:0x020a  */
    /* JADX WARN: Code duplicated, block: B:60:0x020c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0251  */
    /* JADX WARN: Code duplicated, block: B:66:0x0256  */
    /* JADX WARN: Code duplicated, block: B:68:0x0259  */
    /* JADX WARN: Code duplicated, block: B:70:0x025c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0263  */
    /* JADX WARN: Code duplicated, block: B:74:0x0266  */
    /* JADX WARN: Code duplicated, block: B:75:0x0271  */
    /* JADX WARN: Code duplicated, block: B:78:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:79:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:81:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x0306  */
    /* JADX WARN: Code duplicated, block: B:84:0x030e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0313  */
    /* JADX WARN: Code duplicated, block: B:87:0x0323  */
    /* JADX WARN: Code duplicated, block: B:89:0x0329  */
    /* JADX WARN: Code duplicated, block: B:91:0x0330  */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        int i;
        float f2;
        float f3;
        float f4;
        int i2;
        int iInmobi;
        float f5;
        float fSignature;
        int i3;
        float fAmazon;
        float f6;
        float f7;
        float f8;
        int iInmobi2;
        float fSignature2;
        float f9;
        float f10;
        float f11;
        float f12;
        float fAmazon2;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        if (this.f2726l) {
            float f22 = this.f2727l;
            if (f22 > 1.0f) {
                f22 = 2.0f - f22;
            }
            float f23 = f22;
            canvas.save();
            int i4 = this.f2718l;
            float f24 = i4 / 2;
            float f25 = this.f2732l;
            float f26 = f25 / 2.0f;
            float f27 = f26 + f24;
            float f28 = this.f2737l;
            float f29 = this.f2717l;
            float f30 = f28 + f29;
            float f31 = this.f2734l;
            float fAmazon3 = i4 - f31;
            int iInmobi3 = AbstractC5020l.inmobi(this.f2733l);
            int i5 = this.f2721l;
            float f32 = this.f2731l;
            float f33 = 0.0f;
            if (iInmobi3 != 0) {
                if (iInmobi3 != 1) {
                    if (iInmobi3 == 2) {
                        f19 = ((-181.0f) * f23) + 225.0f;
                        f20 = f23 * 90.0f;
                        f4 = (((f31 + f32) - f24) * f23) + f24;
                        float f34 = i5 / 2;
                        f21 = (((f28 + f25) - f34) * f23) + f34;
                        fAmazon3 -= amazon(f23);
                        f = f31 + f25;
                    } else if (iInmobi3 != 3) {
                        if (iInmobi3 == 4) {
                            f31 = f31;
                            f = f31;
                            i = (int) ((1.0f - f23) * 255.0f);
                        } else if (iInmobi3 != 5) {
                            f31 = f31;
                            f = f31;
                            i = 255;
                        } else {
                            float f35 = 1.0f - f23;
                            fAmazon3 = (f25 - (f25 * f35)) + fAmazon3;
                            f = f31 + f25;
                            f4 = f31 + f32;
                            i = (int) (f35 * 255.0f);
                            i5 = i5;
                            f33 = 90.0f;
                            f2 = 44.0f;
                            f31 = f31;
                            f3 = f28 + f25;
                        }
                        f3 = 0.0f;
                        f4 = 0.0f;
                        f2 = 0.0f;
                        f33 = 0.0f;
                    } else {
                        float f36 = i5 / 2;
                        fAmazon3 -= amazon(1.0f);
                        f = f31 + f25;
                        f2 = 225.0f;
                        f3 = f36;
                        i = (int) ((1.0f - f23) * 255.0f);
                    }
                    int i6 = (int) (this.f2715l * i);
                    Paint paint = this.f2730l;
                    paint.setAlpha(i6);
                    canvas.rotate(f2, f4, f3);
                    canvas.rotate(f33, f27, f30);
                    i2 = i5;
                    canvas.drawLine(f, f30, fAmazon3, f30, paint);
                    paint.setAlpha((int) (this.f2715l * 255.0f));
                    canvas.restore();
                    canvas.save();
                    float f37 = (5.0f * f26) + f28;
                    iInmobi = AbstractC5020l.inmobi(this.f2733l);
                    f5 = this.f2724l;
                    if (iInmobi != 0) {
                        if (iInmobi == 1) {
                            i3 = (int) ((1.0f - f23) * 255.0f);
                            fAmazon = fAmazon3;
                            fSignature = 0.0f;
                        } else if (iInmobi != 2) {
                            f16 = this.f2725l;
                            if (iInmobi != 3) {
                                if (iInmobi == 4) {
                                    fSignature = f23 * 135.0f;
                                    f6 = ((f26 + f32) * f23) + f31;
                                    f18 = f24 + f25 + f16;
                                    i3 = 255;
                                    fAmazon = (f23 * f5) + fAmazon3;
                                } else if (iInmobi != 5) {
                                    f24 = f24;
                                    i3 = 255;
                                    fSignature = 0.0f;
                                    f6 = f31;
                                    fAmazon = fAmazon3;
                                } else {
                                    fSignature = f23 * 135.0f;
                                    fAmazon = (f23 * f5) + fAmazon3;
                                    f18 = f24 + f25 + f16;
                                    i3 = (int) (f23 * 255.0f);
                                    f6 = ((f26 + f32) * f23) + f31;
                                }
                                f24 = f18;
                            } else {
                                if (crashlytics()) {
                                    fSignature = f23 * 135.0f;
                                    f17 = 1.0f;
                                } else {
                                    f17 = 1.0f;
                                    fSignature = 135.0f - ((1.0f - f23) * 135.0f);
                                }
                                f6 = ((f26 + f32) - ((f17 - f23) * f29)) + f31;
                                f24 = f24 + f25 + f16;
                                i3 = 255;
                                fAmazon = (f23 * f5) + fAmazon3;
                            }
                        } else {
                            float f38 = 1.0f - f23;
                            i3 = (int) (f38 * 255.0f);
                            f6 = (f38 * f29) + f31;
                            f24 = f24;
                            fAmazon = fAmazon3;
                            fSignature = 0.0f;
                        }
                        paint.setAlpha((int) (i3 * this.f2715l));
                        canvas.rotate(fSignature, f24, f24);
                        canvas.drawLine(f6, f37, fAmazon, f37, paint);
                        paint.setAlpha((int) (this.f2715l * 255.0f));
                        canvas.restore();
                        canvas.save();
                        f7 = i2;
                        f8 = f7 - f28;
                        float f39 = f8 - f29;
                        iInmobi2 = AbstractC5020l.inmobi(this.f2733l);
                        if (iInmobi2 != 0) {
                            if (iInmobi2 != 1) {
                                if (iInmobi2 != 2) {
                                    f24 += ((f31 + f32) - f24) * f23;
                                    float f40 = i2 / 2;
                                    f10 = f31 + f25;
                                    f13 = f23 * (-90.0f);
                                    f12 = f40 + (((f40 - f28) - f25) * f23);
                                    fAmazon2 = fAmazon3 - amazon(f23);
                                    f11 = (181.0f * f23) + 135.0f;
                                } else if (iInmobi2 != 3) {
                                    f15 = this.f2736l;
                                    if (iInmobi2 != 4) {
                                        float f41 = f25 * f23;
                                        f24 += f41;
                                        fAmazon3 -= amazon(f23);
                                        f11 = 45.0f * f23;
                                        f12 = (i2 / 2) - f41;
                                        f10 = (f15 * f23) + f31;
                                        fAmazon2 = fAmazon3;
                                        f13 = f33;
                                    } else if (iInmobi2 != 5) {
                                        fAmazon2 = fAmazon3;
                                        f12 = 0.0f;
                                        f13 = 0.0f;
                                        f24 = 0.0f;
                                        f11 = 0.0f;
                                        f10 = f31;
                                    } else {
                                        float f42 = 1.0f - f23;
                                        f33 = f42 * (-90.0f);
                                        f11 = (89.0f * f23) - 44.0f;
                                        f24 = ((((f24 + f25) - f31) - f32) * f23) + f31 + f32;
                                        f12 = (((f28 + (i2 / 2)) - f7) * f23) + (f8 - f25);
                                        f14 = (f15 - ((f32 + f5) * f42)) + f31;
                                        fAmazon3 -= amazon(f42);
                                    }
                                } else {
                                    f11 = (f23 * (-90.0f)) + 135.0f;
                                    float f43 = f25 * f23;
                                    f24 += f43;
                                    f9 = (i2 / 2) - f43;
                                    fAmazon3 -= amazon(1.0f);
                                    f10 = ((f32 + f5) * f23) + f25 + f31;
                                }
                                canvas.rotate(f11, f24, f12);
                                canvas.rotate(f13, f27, f39);
                                canvas.drawLine(f10, f39, fAmazon2, f39, paint);
                            }
                            if (crashlytics()) {
                                f33 = f23 * (-90.0f);
                            } else {
                                f33 = 90.0f * f23;
                            }
                            f24 = f31 + f32;
                            f12 = f8 - f25;
                            f14 = (f25 * f23) + f31;
                            f11 = f23 * (-44.0f);
                            f10 = f14;
                            fAmazon2 = fAmazon3;
                            f13 = f33;
                            canvas.rotate(f11, f24, f12);
                            canvas.rotate(f13, f27, f39);
                            canvas.drawLine(f10, f39, fAmazon2, f39, paint);
                        }
                        if (crashlytics()) {
                            fSignature2 = f23 * 135.0f;
                        } else {
                            fSignature2 = AbstractC4338l.Signature(1.0f, f23, 225.0f, 135.0f);
                        }
                        f9 = i2 / 2;
                        fAmazon3 -= amazon(f23);
                        f10 = (f25 * f23) + f31;
                        f11 = fSignature2;
                        f12 = f9;
                        fAmazon2 = fAmazon3;
                        f13 = f33;
                        canvas.rotate(f11, f24, f12);
                        canvas.rotate(f13, f27, f39);
                        canvas.drawLine(f10, f39, fAmazon2, f39, paint);
                    }
                    if (crashlytics()) {
                        fSignature = 180.0f * f23;
                    } else {
                        fSignature = AbstractC4338l.Signature(1.0f, f23, 180.0f, 180.0f);
                    }
                    i3 = 255;
                    fAmazon = fAmazon3 - ((amazon(f23) * f23) / 2.0f);
                    f6 = f31;
                    paint.setAlpha((int) (i3 * this.f2715l));
                    canvas.rotate(fSignature, f24, f24);
                    canvas.drawLine(f6, f37, fAmazon, f37, paint);
                    paint.setAlpha((int) (this.f2715l * 255.0f));
                    canvas.restore();
                    canvas.save();
                    f7 = i2;
                    f8 = f7 - f28;
                    float f310 = f8 - f29;
                    iInmobi2 = AbstractC5020l.inmobi(this.f2733l);
                    if (iInmobi2 != 0) {
                        if (iInmobi2 != 1) {
                            if (iInmobi2 != 2) {
                                f24 += ((f31 + f32) - f24) * f23;
                                float f44 = i2 / 2;
                                f10 = f31 + f25;
                                f13 = f23 * (-90.0f);
                                f12 = f44 + (((f44 - f28) - f25) * f23);
                                fAmazon2 = fAmazon3 - amazon(f23);
                                f11 = (181.0f * f23) + 135.0f;
                            } else if (iInmobi2 != 3) {
                                f15 = this.f2736l;
                                if (iInmobi2 != 4) {
                                    float f45 = f25 * f23;
                                    f24 += f45;
                                    fAmazon3 -= amazon(f23);
                                    f11 = 45.0f * f23;
                                    f12 = (i2 / 2) - f45;
                                    f10 = (f15 * f23) + f31;
                                    fAmazon2 = fAmazon3;
                                    f13 = f33;
                                } else if (iInmobi2 != 5) {
                                    fAmazon2 = fAmazon3;
                                    f12 = 0.0f;
                                    f13 = 0.0f;
                                    f24 = 0.0f;
                                    f11 = 0.0f;
                                    f10 = f31;
                                } else {
                                    float f46 = 1.0f - f23;
                                    f33 = f46 * (-90.0f);
                                    f11 = (89.0f * f23) - 44.0f;
                                    f24 = ((((f24 + f25) - f31) - f32) * f23) + f31 + f32;
                                    f12 = (((f28 + (i2 / 2)) - f7) * f23) + (f8 - f25);
                                    f14 = (f15 - ((f32 + f5) * f46)) + f31;
                                    fAmazon3 -= amazon(f46);
                                }
                            } else {
                                f11 = (f23 * (-90.0f)) + 135.0f;
                                float f47 = f25 * f23;
                                f24 += f47;
                                f9 = (i2 / 2) - f47;
                                fAmazon3 -= amazon(1.0f);
                                f10 = ((f32 + f5) * f23) + f25 + f31;
                            }
                            canvas.rotate(f11, f24, f12);
                            canvas.rotate(f13, f27, f310);
                            canvas.drawLine(f10, f310, fAmazon2, f310, paint);
                        }
                        if (crashlytics()) {
                            f33 = f23 * (-90.0f);
                        } else {
                            f33 = 90.0f * f23;
                        }
                        f24 = f31 + f32;
                        f12 = f8 - f25;
                        f14 = (f25 * f23) + f31;
                        f11 = f23 * (-44.0f);
                        f10 = f14;
                        fAmazon2 = fAmazon3;
                        f13 = f33;
                        canvas.rotate(f11, f24, f12);
                        canvas.rotate(f13, f27, f310);
                        canvas.drawLine(f10, f310, fAmazon2, f310, paint);
                    }
                    if (crashlytics()) {
                        fSignature2 = f23 * 135.0f;
                    } else {
                        fSignature2 = AbstractC4338l.Signature(1.0f, f23, 225.0f, 135.0f);
                    }
                    f9 = i2 / 2;
                    fAmazon3 -= amazon(f23);
                    f10 = (f25 * f23) + f31;
                    f11 = fSignature2;
                    f12 = f9;
                    fAmazon2 = fAmazon3;
                    f13 = f33;
                    canvas.rotate(f11, f24, f12);
                    canvas.rotate(f13, f27, f310);
                    canvas.drawLine(f10, f310, fAmazon2, f310, paint);
                }
                f19 = 44.0f * f23;
                f20 = f23 * 90.0f;
                f4 = f31 + f32;
                f21 = f28 + f25;
                f = (f25 * f23) + f31;
                fAmazon3 = fAmazon3;
                f2 = f19;
                f31 = f31;
                f3 = f21;
                f33 = f20;
                i = 255;
                int i7 = (int) (this.f2715l * i);
                Paint paint2 = this.f2730l;
                paint2.setAlpha(i7);
                canvas.rotate(f2, f4, f3);
                canvas.rotate(f33, f27, f30);
                i2 = i5;
                canvas.drawLine(f, f30, fAmazon3, f30, paint2);
                paint2.setAlpha((int) (this.f2715l * 255.0f));
                canvas.restore();
                canvas.save();
                float f311 = (5.0f * f26) + f28;
                iInmobi = AbstractC5020l.inmobi(this.f2733l);
                f5 = this.f2724l;
                if (iInmobi != 0) {
                    if (iInmobi == 1) {
                        i3 = (int) ((1.0f - f23) * 255.0f);
                        fAmazon = fAmazon3;
                        fSignature = 0.0f;
                    } else if (iInmobi != 2) {
                        f16 = this.f2725l;
                        if (iInmobi != 3) {
                            if (iInmobi == 4) {
                                fSignature = f23 * 135.0f;
                                f6 = ((f26 + f32) * f23) + f31;
                                f18 = f24 + f25 + f16;
                                i3 = 255;
                                fAmazon = (f23 * f5) + fAmazon3;
                            } else if (iInmobi != 5) {
                                f24 = f24;
                                i3 = 255;
                                fSignature = 0.0f;
                                f6 = f31;
                                fAmazon = fAmazon3;
                            } else {
                                fSignature = f23 * 135.0f;
                                fAmazon = (f23 * f5) + fAmazon3;
                                f18 = f24 + f25 + f16;
                                i3 = (int) (f23 * 255.0f);
                                f6 = ((f26 + f32) * f23) + f31;
                            }
                            f24 = f18;
                        } else {
                            if (crashlytics()) {
                                fSignature = f23 * 135.0f;
                                f17 = 1.0f;
                            } else {
                                f17 = 1.0f;
                                fSignature = 135.0f - ((1.0f - f23) * 135.0f);
                            }
                            f6 = ((f26 + f32) - ((f17 - f23) * f29)) + f31;
                            f24 = f24 + f25 + f16;
                            i3 = 255;
                            fAmazon = (f23 * f5) + fAmazon3;
                        }
                    } else {
                        float f312 = 1.0f - f23;
                        i3 = (int) (f312 * 255.0f);
                        f6 = (f312 * f29) + f31;
                        f24 = f24;
                        fAmazon = fAmazon3;
                        fSignature = 0.0f;
                    }
                    paint2.setAlpha((int) (i3 * this.f2715l));
                    canvas.rotate(fSignature, f24, f24);
                    canvas.drawLine(f6, f311, fAmazon, f311, paint2);
                    paint2.setAlpha((int) (this.f2715l * 255.0f));
                    canvas.restore();
                    canvas.save();
                    f7 = i2;
                    f8 = f7 - f28;
                    float f313 = f8 - f29;
                    iInmobi2 = AbstractC5020l.inmobi(this.f2733l);
                    if (iInmobi2 != 0) {
                        if (iInmobi2 != 1) {
                            if (iInmobi2 != 2) {
                                f24 += ((f31 + f32) - f24) * f23;
                                float f48 = i2 / 2;
                                f10 = f31 + f25;
                                f13 = f23 * (-90.0f);
                                f12 = f48 + (((f48 - f28) - f25) * f23);
                                fAmazon2 = fAmazon3 - amazon(f23);
                                f11 = (181.0f * f23) + 135.0f;
                            } else if (iInmobi2 != 3) {
                                f15 = this.f2736l;
                                if (iInmobi2 != 4) {
                                    float f49 = f25 * f23;
                                    f24 += f49;
                                    fAmazon3 -= amazon(f23);
                                    f11 = 45.0f * f23;
                                    f12 = (i2 / 2) - f49;
                                    f10 = (f15 * f23) + f31;
                                    fAmazon2 = fAmazon3;
                                    f13 = f33;
                                } else if (iInmobi2 != 5) {
                                    fAmazon2 = fAmazon3;
                                    f12 = 0.0f;
                                    f13 = 0.0f;
                                    f24 = 0.0f;
                                    f11 = 0.0f;
                                    f10 = f31;
                                } else {
                                    float f410 = 1.0f - f23;
                                    f33 = f410 * (-90.0f);
                                    f11 = (89.0f * f23) - 44.0f;
                                    f24 = ((((f24 + f25) - f31) - f32) * f23) + f31 + f32;
                                    f12 = (((f28 + (i2 / 2)) - f7) * f23) + (f8 - f25);
                                    f14 = (f15 - ((f32 + f5) * f410)) + f31;
                                    fAmazon3 -= amazon(f410);
                                }
                            } else {
                                f11 = (f23 * (-90.0f)) + 135.0f;
                                float f411 = f25 * f23;
                                f24 += f411;
                                f9 = (i2 / 2) - f411;
                                fAmazon3 -= amazon(1.0f);
                                f10 = ((f32 + f5) * f23) + f25 + f31;
                            }
                            canvas.rotate(f11, f24, f12);
                            canvas.rotate(f13, f27, f313);
                            canvas.drawLine(f10, f313, fAmazon2, f313, paint2);
                        }
                        if (crashlytics()) {
                            f33 = f23 * (-90.0f);
                        } else {
                            f33 = 90.0f * f23;
                        }
                        f24 = f31 + f32;
                        f12 = f8 - f25;
                        f14 = (f25 * f23) + f31;
                        f11 = f23 * (-44.0f);
                        f10 = f14;
                        fAmazon2 = fAmazon3;
                        f13 = f33;
                        canvas.rotate(f11, f24, f12);
                        canvas.rotate(f13, f27, f313);
                        canvas.drawLine(f10, f313, fAmazon2, f313, paint2);
                    }
                    if (crashlytics()) {
                        fSignature2 = f23 * 135.0f;
                    } else {
                        fSignature2 = AbstractC4338l.Signature(1.0f, f23, 225.0f, 135.0f);
                    }
                    f9 = i2 / 2;
                    fAmazon3 -= amazon(f23);
                    f10 = (f25 * f23) + f31;
                    f11 = fSignature2;
                    f12 = f9;
                    fAmazon2 = fAmazon3;
                    f13 = f33;
                    canvas.rotate(f11, f24, f12);
                    canvas.rotate(f13, f27, f313);
                    canvas.drawLine(f10, f313, fAmazon2, f313, paint2);
                }
                if (crashlytics()) {
                    fSignature = 180.0f * f23;
                } else {
                    fSignature = AbstractC4338l.Signature(1.0f, f23, 180.0f, 180.0f);
                }
                i3 = 255;
                fAmazon = fAmazon3 - ((amazon(f23) * f23) / 2.0f);
                f6 = f31;
                paint2.setAlpha((int) (i3 * this.f2715l));
                canvas.rotate(fSignature, f24, f24);
                canvas.drawLine(f6, f311, fAmazon, f311, paint2);
                paint2.setAlpha((int) (this.f2715l * 255.0f));
                canvas.restore();
                canvas.save();
                f7 = i2;
                f8 = f7 - f28;
                float f314 = f8 - f29;
                iInmobi2 = AbstractC5020l.inmobi(this.f2733l);
                if (iInmobi2 != 0) {
                    if (iInmobi2 != 1) {
                        if (iInmobi2 != 2) {
                            f24 += ((f31 + f32) - f24) * f23;
                            float f412 = i2 / 2;
                            f10 = f31 + f25;
                            f13 = f23 * (-90.0f);
                            f12 = f412 + (((f412 - f28) - f25) * f23);
                            fAmazon2 = fAmazon3 - amazon(f23);
                            f11 = (181.0f * f23) + 135.0f;
                        } else if (iInmobi2 != 3) {
                            f15 = this.f2736l;
                            if (iInmobi2 != 4) {
                                float f413 = f25 * f23;
                                f24 += f413;
                                fAmazon3 -= amazon(f23);
                                f11 = 45.0f * f23;
                                f12 = (i2 / 2) - f413;
                                f10 = (f15 * f23) + f31;
                                fAmazon2 = fAmazon3;
                                f13 = f33;
                            } else if (iInmobi2 != 5) {
                                fAmazon2 = fAmazon3;
                                f12 = 0.0f;
                                f13 = 0.0f;
                                f24 = 0.0f;
                                f11 = 0.0f;
                                f10 = f31;
                            } else {
                                float f414 = 1.0f - f23;
                                f33 = f414 * (-90.0f);
                                f11 = (89.0f * f23) - 44.0f;
                                f24 = ((((f24 + f25) - f31) - f32) * f23) + f31 + f32;
                                f12 = (((f28 + (i2 / 2)) - f7) * f23) + (f8 - f25);
                                f14 = (f15 - ((f32 + f5) * f414)) + f31;
                                fAmazon3 -= amazon(f414);
                            }
                        } else {
                            f11 = (f23 * (-90.0f)) + 135.0f;
                            float f415 = f25 * f23;
                            f24 += f415;
                            f9 = (i2 / 2) - f415;
                            fAmazon3 -= amazon(1.0f);
                            f10 = ((f32 + f5) * f23) + f25 + f31;
                        }
                        canvas.rotate(f11, f24, f12);
                        canvas.rotate(f13, f27, f314);
                        canvas.drawLine(f10, f314, fAmazon2, f314, paint2);
                    }
                    if (crashlytics()) {
                        f33 = f23 * (-90.0f);
                    } else {
                        f33 = 90.0f * f23;
                    }
                    f24 = f31 + f32;
                    f12 = f8 - f25;
                    f14 = (f25 * f23) + f31;
                    f11 = f23 * (-44.0f);
                    f10 = f14;
                    fAmazon2 = fAmazon3;
                    f13 = f33;
                    canvas.rotate(f11, f24, f12);
                    canvas.rotate(f13, f27, f314);
                    canvas.drawLine(f10, f314, fAmazon2, f314, paint2);
                }
                if (crashlytics()) {
                    fSignature2 = f23 * 135.0f;
                } else {
                    fSignature2 = AbstractC4338l.Signature(1.0f, f23, 225.0f, 135.0f);
                }
                f9 = i2 / 2;
                fAmazon3 -= amazon(f23);
                f10 = (f25 * f23) + f31;
                f11 = fSignature2;
                f12 = f9;
                fAmazon2 = fAmazon3;
                f13 = f33;
                canvas.rotate(f11, f24, f12);
                canvas.rotate(f13, f27, f314);
                canvas.drawLine(f10, f314, fAmazon2, f314, paint2);
            }
            float fSignature3 = crashlytics() ? f23 * 225.0f : AbstractC4338l.Signature(1.0f, f23, 135.0f, 225.0f);
            float f50 = i5 / 2;
            fAmazon3 -= amazon(f23);
            f = (f25 * f23) + f31;
            i = 255;
            f2 = fSignature3;
            f3 = f50;
            f4 = f24;
            int i8 = (int) (this.f2715l * i);
            Paint paint3 = this.f2730l;
            paint3.setAlpha(i8);
            canvas.rotate(f2, f4, f3);
            canvas.rotate(f33, f27, f30);
            i2 = i5;
            canvas.drawLine(f, f30, fAmazon3, f30, paint3);
            paint3.setAlpha((int) (this.f2715l * 255.0f));
            canvas.restore();
            canvas.save();
            float f315 = (5.0f * f26) + f28;
            iInmobi = AbstractC5020l.inmobi(this.f2733l);
            f5 = this.f2724l;
            if (iInmobi != 0) {
                if (iInmobi == 1) {
                    i3 = (int) ((1.0f - f23) * 255.0f);
                    fAmazon = fAmazon3;
                    fSignature = 0.0f;
                } else if (iInmobi != 2) {
                    f16 = this.f2725l;
                    if (iInmobi != 3) {
                        if (iInmobi == 4) {
                            fSignature = f23 * 135.0f;
                            f6 = ((f26 + f32) * f23) + f31;
                            f18 = f24 + f25 + f16;
                            i3 = 255;
                            fAmazon = (f23 * f5) + fAmazon3;
                        } else if (iInmobi != 5) {
                            f24 = f24;
                            i3 = 255;
                            fSignature = 0.0f;
                            f6 = f31;
                            fAmazon = fAmazon3;
                        } else {
                            fSignature = f23 * 135.0f;
                            fAmazon = (f23 * f5) + fAmazon3;
                            f18 = f24 + f25 + f16;
                            i3 = (int) (f23 * 255.0f);
                            f6 = ((f26 + f32) * f23) + f31;
                        }
                        f24 = f18;
                    } else {
                        if (crashlytics()) {
                            fSignature = f23 * 135.0f;
                            f17 = 1.0f;
                        } else {
                            f17 = 1.0f;
                            fSignature = 135.0f - ((1.0f - f23) * 135.0f);
                        }
                        f6 = ((f26 + f32) - ((f17 - f23) * f29)) + f31;
                        f24 = f24 + f25 + f16;
                        i3 = 255;
                        fAmazon = (f23 * f5) + fAmazon3;
                    }
                } else {
                    float f316 = 1.0f - f23;
                    i3 = (int) (f316 * 255.0f);
                    f6 = (f316 * f29) + f31;
                    f24 = f24;
                    fAmazon = fAmazon3;
                    fSignature = 0.0f;
                }
                paint3.setAlpha((int) (i3 * this.f2715l));
                canvas.rotate(fSignature, f24, f24);
                canvas.drawLine(f6, f315, fAmazon, f315, paint3);
                paint3.setAlpha((int) (this.f2715l * 255.0f));
                canvas.restore();
                canvas.save();
                f7 = i2;
                f8 = f7 - f28;
                float f317 = f8 - f29;
                iInmobi2 = AbstractC5020l.inmobi(this.f2733l);
                if (iInmobi2 != 0) {
                    if (iInmobi2 != 1) {
                        if (iInmobi2 != 2) {
                            f24 += ((f31 + f32) - f24) * f23;
                            float f416 = i2 / 2;
                            f10 = f31 + f25;
                            f13 = f23 * (-90.0f);
                            f12 = f416 + (((f416 - f28) - f25) * f23);
                            fAmazon2 = fAmazon3 - amazon(f23);
                            f11 = (181.0f * f23) + 135.0f;
                        } else if (iInmobi2 != 3) {
                            f15 = this.f2736l;
                            if (iInmobi2 != 4) {
                                float f417 = f25 * f23;
                                f24 += f417;
                                fAmazon3 -= amazon(f23);
                                f11 = 45.0f * f23;
                                f12 = (i2 / 2) - f417;
                                f10 = (f15 * f23) + f31;
                                fAmazon2 = fAmazon3;
                                f13 = f33;
                            } else if (iInmobi2 != 5) {
                                fAmazon2 = fAmazon3;
                                f12 = 0.0f;
                                f13 = 0.0f;
                                f24 = 0.0f;
                                f11 = 0.0f;
                                f10 = f31;
                            } else {
                                float f418 = 1.0f - f23;
                                f33 = f418 * (-90.0f);
                                f11 = (89.0f * f23) - 44.0f;
                                f24 = ((((f24 + f25) - f31) - f32) * f23) + f31 + f32;
                                f12 = (((f28 + (i2 / 2)) - f7) * f23) + (f8 - f25);
                                f14 = (f15 - ((f32 + f5) * f418)) + f31;
                                fAmazon3 -= amazon(f418);
                            }
                        } else {
                            f11 = (f23 * (-90.0f)) + 135.0f;
                            float f419 = f25 * f23;
                            f24 += f419;
                            f9 = (i2 / 2) - f419;
                            fAmazon3 -= amazon(1.0f);
                            f10 = ((f32 + f5) * f23) + f25 + f31;
                        }
                        canvas.rotate(f11, f24, f12);
                        canvas.rotate(f13, f27, f317);
                        canvas.drawLine(f10, f317, fAmazon2, f317, paint3);
                    }
                    if (crashlytics()) {
                        f33 = f23 * (-90.0f);
                    } else {
                        f33 = 90.0f * f23;
                    }
                    f24 = f31 + f32;
                    f12 = f8 - f25;
                    f14 = (f25 * f23) + f31;
                    f11 = f23 * (-44.0f);
                    f10 = f14;
                    fAmazon2 = fAmazon3;
                    f13 = f33;
                    canvas.rotate(f11, f24, f12);
                    canvas.rotate(f13, f27, f317);
                    canvas.drawLine(f10, f317, fAmazon2, f317, paint3);
                }
                if (crashlytics()) {
                    fSignature2 = f23 * 135.0f;
                } else {
                    fSignature2 = AbstractC4338l.Signature(1.0f, f23, 225.0f, 135.0f);
                }
                f9 = i2 / 2;
                fAmazon3 -= amazon(f23);
                f10 = (f25 * f23) + f31;
                f11 = fSignature2;
                f12 = f9;
                fAmazon2 = fAmazon3;
                f13 = f33;
                canvas.rotate(f11, f24, f12);
                canvas.rotate(f13, f27, f317);
                canvas.drawLine(f10, f317, fAmazon2, f317, paint3);
            }
            if (crashlytics()) {
                fSignature = 180.0f * f23;
            } else {
                fSignature = AbstractC4338l.Signature(1.0f, f23, 180.0f, 180.0f);
            }
            i3 = 255;
            fAmazon = fAmazon3 - ((amazon(f23) * f23) / 2.0f);
            f6 = f31;
            paint3.setAlpha((int) (i3 * this.f2715l));
            canvas.rotate(fSignature, f24, f24);
            canvas.drawLine(f6, f315, fAmazon, f315, paint3);
            paint3.setAlpha((int) (this.f2715l * 255.0f));
            canvas.restore();
            canvas.save();
            f7 = i2;
            f8 = f7 - f28;
            float f318 = f8 - f29;
            iInmobi2 = AbstractC5020l.inmobi(this.f2733l);
            if (iInmobi2 != 0) {
                if (iInmobi2 != 1) {
                    if (iInmobi2 != 2) {
                        f24 += ((f31 + f32) - f24) * f23;
                        float f4110 = i2 / 2;
                        f10 = f31 + f25;
                        f13 = f23 * (-90.0f);
                        f12 = f4110 + (((f4110 - f28) - f25) * f23);
                        fAmazon2 = fAmazon3 - amazon(f23);
                        f11 = (181.0f * f23) + 135.0f;
                    } else if (iInmobi2 != 3) {
                        f15 = this.f2736l;
                        if (iInmobi2 != 4) {
                            float f4111 = f25 * f23;
                            f24 += f4111;
                            fAmazon3 -= amazon(f23);
                            f11 = 45.0f * f23;
                            f12 = (i2 / 2) - f4111;
                            f10 = (f15 * f23) + f31;
                            fAmazon2 = fAmazon3;
                            f13 = f33;
                        } else if (iInmobi2 != 5) {
                            fAmazon2 = fAmazon3;
                            f12 = 0.0f;
                            f13 = 0.0f;
                            f24 = 0.0f;
                            f11 = 0.0f;
                            f10 = f31;
                        } else {
                            float f4112 = 1.0f - f23;
                            f33 = f4112 * (-90.0f);
                            f11 = (89.0f * f23) - 44.0f;
                            f24 = ((((f24 + f25) - f31) - f32) * f23) + f31 + f32;
                            f12 = (((f28 + (i2 / 2)) - f7) * f23) + (f8 - f25);
                            f14 = (f15 - ((f32 + f5) * f4112)) + f31;
                            fAmazon3 -= amazon(f4112);
                        }
                    } else {
                        f11 = (f23 * (-90.0f)) + 135.0f;
                        float f4113 = f25 * f23;
                        f24 += f4113;
                        f9 = (i2 / 2) - f4113;
                        fAmazon3 -= amazon(1.0f);
                        f10 = ((f32 + f5) * f23) + f25 + f31;
                    }
                    canvas.rotate(f11, f24, f12);
                    canvas.rotate(f13, f27, f318);
                    canvas.drawLine(f10, f318, fAmazon2, f318, paint3);
                }
                if (crashlytics()) {
                    f33 = f23 * (-90.0f);
                } else {
                    f33 = 90.0f * f23;
                }
                f24 = f31 + f32;
                f12 = f8 - f25;
                f14 = (f25 * f23) + f31;
                f11 = f23 * (-44.0f);
                f10 = f14;
                fAmazon2 = fAmazon3;
                f13 = f33;
                canvas.rotate(f11, f24, f12);
                canvas.rotate(f13, f27, f318);
                canvas.drawLine(f10, f318, fAmazon2, f318, paint3);
            }
            if (crashlytics()) {
                fSignature2 = f23 * 135.0f;
            } else {
                fSignature2 = AbstractC4338l.Signature(1.0f, f23, 225.0f, 135.0f);
            }
            f9 = i2 / 2;
            fAmazon3 -= amazon(f23);
            f10 = (f25 * f23) + f31;
            f11 = fSignature2;
            f12 = f9;
            fAmazon2 = fAmazon3;
            f13 = f33;
            canvas.rotate(f11, f24, f12);
            canvas.rotate(f13, f27, f318);
            canvas.drawLine(f10, f318, fAmazon2, f318, paint3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return (int) (this.f2715l * 255.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        this.f2719l.yandex = getChangingConfigurations();
        return this.f2719l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f2721l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f2718l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f2739l;
    }

    public final void loadAd(int i) {
        Paint paint = this.f2730l;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f2735l);
        paint.setColor(i);
        Paint paint2 = this.f2722l;
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(i);
        paint2.setAlpha(200);
        setBounds(0, 0, this.f2718l, this.f2721l);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f2719l = new C7527l(this);
        return this;
    }

    public final void purchase(int i) {
        synchronized (this.f2738l) {
            try {
                if (this.f2739l) {
                    this.f2720l.cancel();
                    this.f2739l = false;
                }
                if (this.f2728l == i) {
                    return;
                }
                int iInmobi = AbstractC5020l.inmobi(i);
                if (iInmobi == 0) {
                    this.f2733l = 1;
                    this.f2727l = 0.0f;
                } else if (iInmobi == 1) {
                    this.f2733l = 1;
                    this.f2727l = 1.0f;
                } else if (iInmobi == 2) {
                    this.f2733l = 2;
                    this.f2727l = 1.0f;
                } else if (iInmobi == 3) {
                    this.f2733l = 5;
                    this.f2727l = 1.0f;
                }
                this.f2728l = i;
                invalidateSelf();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f2715l = i / 255.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f2730l.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        int i;
        if (this.f2739l) {
            return;
        }
        int i2 = this.f2714l;
        if (i2 != 0 && i2 != (i = this.f2728l)) {
            this.f2739l = true;
            boolean z = i == 1;
            boolean z2 = i == 2;
            boolean z3 = i == 3;
            boolean z4 = i == 4;
            boolean z5 = i2 == 1;
            boolean z6 = i2 == 2;
            boolean z7 = i2 == 3;
            boolean z8 = i2 == 4;
            if ((z && z6) || (z2 && z5)) {
                this.f2733l = 1;
            } else {
                if ((z2 && z7) || (z3 && z6)) {
                    this.f2733l = 3;
                } else if ((z && z7) || (z3 && z5)) {
                    this.f2733l = 2;
                } else if ((z2 && z8) || (z4 && z6)) {
                    this.f2733l = 4;
                } else if ((z && z8) || (z4 && z5)) {
                    this.f2733l = 5;
                } else {
                    if ((!z3 || !z8) && (!z4 || !z7)) {
                        throw new IllegalStateException("Animating from " + AbstractC1757l.m1031continue(i) + " to " + AbstractC1757l.m1031continue(i2) + " is not supported");
                    }
                    this.f2733l = 6;
                    z = z3;
                }
                z = z2;
            }
            this.f2720l.setFloatValues(z ? 0.0f : 1.0f, z ? 1.0f : 2.0f);
            this.f2720l.start();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.f2739l && this.f2720l.isRunning()) {
            this.f2720l.end();
        } else {
            this.f2739l = false;
            invalidateSelf();
        }
    }

    public final void yandex(int i) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, this.f2740l, 0.0f);
        this.f2720l = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(3.0f));
        this.f2720l.setDuration(i);
        this.f2720l.addListener(new C7538l(5, this));
    }

    public C0992l(int i, int i2, long j, int i3, int i4, float f, float f2, float f3, float f4) {
        this.f2724l = f4;
        this.f2717l = f4 * 2.0f;
        float f5 = 3.0f * f4;
        this.f2732l = f5;
        this.f2731l = 4.0f * f4;
        this.f2736l = 8.0f * f4;
        this.f2725l = f4 / 2.0f;
        this.f2723l = i2;
        this.f2718l = i3;
        this.f2721l = i4;
        this.f2729l = f;
        this.f2716l = f2;
        this.f2735l = f3;
        this.f2734l = (i3 - f) / 2.0f;
        this.f2737l = (i4 - (f5 * 5.0f)) / 2.0f;
        loadAd(i);
        yandex((int) j);
        this.f2719l = new C7527l(this);
    }
}

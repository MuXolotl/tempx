package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;

/* JADX INFO: renamed from: lؙٖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC6500l implements View.OnTouchListener {

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final int f13555l = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public boolean f13556l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C9945l f13557l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f13558l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int f13559l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public boolean f13560l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AccelerateInterpolator f13561l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2153l f13562l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C9945l f13563l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final float[] f13564l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public boolean f13565l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final float[] f13566l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public RunnableC5360l f13567l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public boolean f13568l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final float[] f13569l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final float[] f13570l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final float[] f13571l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public boolean f13572l;

    public ViewOnTouchListenerC6500l(C9945l c9945l) {
        C2153l c2153l = new C2153l();
        c2153l.purchase = Long.MIN_VALUE;
        c2153l.mopub = -1L;
        c2153l.billing = 0L;
        this.f13562l = c2153l;
        this.f13561l = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f13566l = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f13570l = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f13569l = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f13564l = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f13571l = fArr5;
        this.f13557l = c9945l;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f13558l = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f13559l = f13555l;
        c2153l.yandex = 500;
        c2153l.loadAd = 500;
        this.f13563l = c9945l;
    }

    public static float loadAd(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    public final void amazon() {
        int i = 0;
        if (this.f13556l) {
            this.f13565l = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        C2153l c2153l = this.f13562l;
        int i2 = (int) (jCurrentAnimationTimeMillis - c2153l.purchase);
        int i3 = c2153l.loadAd;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c2153l.subs = i;
        c2153l.admob = c2153l.yandex(jCurrentAnimationTimeMillis);
        c2153l.mopub = jCurrentAnimationTimeMillis;
    }

    public final float crashlytics(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.f13558l;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f13565l && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f13560l
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7c
        L17:
            r7.amazon()
            return r1
        L1b:
            r7.f13572l = r2
            r7.f13568l = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            lٍۦؕ r4 = r7.f13557l
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.yandex(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.yandex(r9, r8, r3, r2)
            lؓ۠ؕ r9 = r7.f13562l
            r9.crashlytics = r0
            r9.amazon = r8
            boolean r8 = r7.f13565l
            if (r8 != 0) goto L7c
            boolean r8 = r7.purchase()
            if (r8 == 0) goto L7c
            lؘٖؑ r8 = r7.f13567l
            if (r8 != 0) goto L60
            lؘٖؑ r8 = new lؘٖؑ
            r8.<init>(r2, r7)
            r7.f13567l = r8
        L60:
            r7.f13565l = r2
            r7.f13556l = r2
            boolean r8 = r7.f13568l
            if (r8 != 0) goto L75
            int r8 = r7.f13559l
            if (r8 <= 0) goto L75
            lؘٖؑ r9 = r7.f13567l
            long r5 = (long) r8
            java.util.WeakHashMap r8 = defpackage.AbstractC15872l.yandex
            r4.postOnAnimationDelayed(r9, r5)
            goto L7a
        L75:
            lؘٖؑ r8 = r7.f13567l
            r8.run()
        L7a:
            r7.f13568l = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnTouchListenerC6500l.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final boolean purchase() {
        C9945l c9945l;
        int count;
        C2153l c2153l = this.f13562l;
        float f = c2153l.amazon;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(c2153l.crashlytics);
        if (iAbs != 0 && (count = (c9945l = this.f13563l).getCount()) != 0) {
            int childCount = c9945l.getChildCount();
            int firstVisiblePosition = c9945l.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c9945l.getChildAt(0).getTop() >= 0)) : !(i >= count && c9945l.getChildAt(childCount - 1).getBottom() <= c9945l.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float yandex(float f, float f2, float f3, int i) {
        float fLoadAd;
        float interpolation;
        float fLoadAd2 = loadAd(this.f13566l[i] * f2, 0.0f, this.f13570l[i]);
        float fCrashlytics = crashlytics(f2 - f, fLoadAd2) - crashlytics(f, fLoadAd2);
        AccelerateInterpolator accelerateInterpolator = this.f13561l;
        if (fCrashlytics >= 0.0f) {
            if (fCrashlytics > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fCrashlytics);
            } else {
                fLoadAd = 0.0f;
            }
            if (fLoadAd == 0.0f) {
                return 0.0f;
            }
            float f4 = this.f13569l[i];
            float f5 = this.f13564l[i];
            float f6 = this.f13571l[i];
            float f7 = f4 * f3;
            return fLoadAd > 0.0f ? loadAd(fLoadAd * f7, f5, f6) : -loadAd((-fLoadAd) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fCrashlytics);
        fLoadAd = loadAd(interpolation, -1.0f, 1.0f);
        if (fLoadAd == 0.0f) {
            return 0.0f;
        }
        float f8 = this.f13569l[i];
        float f9 = this.f13564l[i];
        float f10 = this.f13571l[i];
        float f11 = f8 * f3;
        if (fLoadAd > 0.0f) {
        }
    }
}

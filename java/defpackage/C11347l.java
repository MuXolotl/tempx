package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: renamed from: lُٖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11347l extends AbstractC3126l {
    public float admob;
    public float amazon;
    public float billing;
    public float crashlytics;
    public String firebase;
    public final Matrix isPro;
    public final ArrayList loadAd;
    public float mopub;
    public float purchase;
    public float subs;
    public final Matrix yandex;

    public C11347l(C11347l c11347l, C11154l c11154l) {
        AbstractC13712l c6567l;
        this.yandex = new Matrix();
        this.loadAd = new ArrayList();
        this.crashlytics = 0.0f;
        this.amazon = 0.0f;
        this.purchase = 0.0f;
        this.billing = 1.0f;
        this.mopub = 1.0f;
        this.admob = 0.0f;
        this.subs = 0.0f;
        Matrix matrix = new Matrix();
        this.isPro = matrix;
        this.firebase = null;
        this.crashlytics = c11347l.crashlytics;
        this.amazon = c11347l.amazon;
        this.purchase = c11347l.purchase;
        this.billing = c11347l.billing;
        this.mopub = c11347l.mopub;
        this.admob = c11347l.admob;
        this.subs = c11347l.subs;
        String str = c11347l.firebase;
        this.firebase = str;
        if (str != null) {
            c11154l.put(str, this);
        }
        matrix.set(c11347l.isPro);
        ArrayList arrayList = c11347l.loadAd;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C11347l) {
                this.loadAd.add(new C11347l((C11347l) obj, c11154l));
            } else {
                if (obj instanceof C3636l) {
                    C3636l c3636l = (C3636l) obj;
                    C3636l c3636l2 = new C3636l(c3636l);
                    c3636l2.purchase = 0.0f;
                    c3636l2.mopub = 1.0f;
                    c3636l2.admob = 1.0f;
                    c3636l2.subs = 0.0f;
                    c3636l2.isPro = 1.0f;
                    c3636l2.firebase = 0.0f;
                    c3636l2.smaato = Paint.Cap.BUTT;
                    c3636l2.remoteconfig = Paint.Join.MITER;
                    c3636l2.vip = 4.0f;
                    c3636l2.amazon = c3636l.amazon;
                    c3636l2.purchase = c3636l.purchase;
                    c3636l2.mopub = c3636l.mopub;
                    c3636l2.billing = c3636l.billing;
                    c3636l2.crashlytics = c3636l.crashlytics;
                    c3636l2.admob = c3636l.admob;
                    c3636l2.subs = c3636l.subs;
                    c3636l2.isPro = c3636l.isPro;
                    c3636l2.firebase = c3636l.firebase;
                    c3636l2.smaato = c3636l.smaato;
                    c3636l2.remoteconfig = c3636l.remoteconfig;
                    c3636l2.vip = c3636l.vip;
                    c6567l = c3636l2;
                } else {
                    if (!(obj instanceof C6567l)) {
                        C8339l.smaato("Unknown object in the tree!");
                        throw null;
                    }
                    c6567l = new C6567l((C6567l) obj);
                }
                this.loadAd.add(c6567l);
                Object obj2 = c6567l.loadAd;
                if (obj2 != null) {
                    c11154l.put(obj2, c6567l);
                }
            }
        }
    }

    public final void crashlytics() {
        Matrix matrix = this.isPro;
        matrix.reset();
        matrix.postTranslate(-this.amazon, -this.purchase);
        matrix.postScale(this.billing, this.mopub);
        matrix.postRotate(this.crashlytics, 0.0f, 0.0f);
        matrix.postTranslate(this.admob + this.amazon, this.subs + this.purchase);
    }

    public String getGroupName() {
        return this.firebase;
    }

    public Matrix getLocalMatrix() {
        return this.isPro;
    }

    public float getPivotX() {
        return this.amazon;
    }

    public float getPivotY() {
        return this.purchase;
    }

    public float getRotation() {
        return this.crashlytics;
    }

    public float getScaleX() {
        return this.billing;
    }

    public float getScaleY() {
        return this.mopub;
    }

    public float getTranslateX() {
        return this.admob;
    }

    public float getTranslateY() {
        return this.subs;
    }

    @Override // defpackage.AbstractC3126l
    public final boolean loadAd(int[] iArr) {
        int i = 0;
        boolean zLoadAd = false;
        while (true) {
            ArrayList arrayList = this.loadAd;
            if (i >= arrayList.size()) {
                return zLoadAd;
            }
            zLoadAd |= ((AbstractC3126l) arrayList.get(i)).loadAd(iArr);
            i++;
        }
    }

    public void setPivotX(float f) {
        if (f != this.amazon) {
            this.amazon = f;
            crashlytics();
        }
    }

    public void setPivotY(float f) {
        if (f != this.purchase) {
            this.purchase = f;
            crashlytics();
        }
    }

    public void setRotation(float f) {
        if (f != this.crashlytics) {
            this.crashlytics = f;
            crashlytics();
        }
    }

    public void setScaleX(float f) {
        if (f != this.billing) {
            this.billing = f;
            crashlytics();
        }
    }

    public void setScaleY(float f) {
        if (f != this.mopub) {
            this.mopub = f;
            crashlytics();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.admob) {
            this.admob = f;
            crashlytics();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.subs) {
            this.subs = f;
            crashlytics();
        }
    }

    @Override // defpackage.AbstractC3126l
    public final boolean yandex() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.loadAd;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC3126l) arrayList.get(i)).yandex()) {
                return true;
            }
            i++;
        }
    }

    public C11347l() {
        this.yandex = new Matrix();
        this.loadAd = new ArrayList();
        this.crashlytics = 0.0f;
        this.amazon = 0.0f;
        this.purchase = 0.0f;
        this.billing = 1.0f;
        this.mopub = 1.0f;
        this.admob = 0.0f;
        this.subs = 0.0f;
        this.isPro = new Matrix();
        this.firebase = null;
    }
}

package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;

/* JADX INFO: renamed from: lُؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10780l {
    public final C10017l Signature;
    public final boolean ad;
    public final C10017l adcel;
    public final C10017l ads;
    public final Matrix amazon;
    public final Matrix crashlytics;
    public final C10017l license;
    public final Matrix loadAd;
    public final C10017l metrica;
    public final C10017l pro;
    public final float[] purchase;
    public final AbstractC4383l remoteconfig;
    public final AbstractC13890l smaato;
    public final C10017l startapp;
    public final C10017l subscription;
    public final C10017l tapsense;
    public final C14720l vip;
    public final Matrix yandex = new Matrix();
    public float billing = Float.NaN;
    public float mopub = Float.NaN;
    public float admob = Float.NaN;
    public float subs = 1.0f;
    public float isPro = 1.0f;
    public boolean firebase = true;

    public C10780l(C1406l c1406l) {
        C15659l c15659l = c1406l.yandex;
        this.smaato = (AbstractC13890l) (c15659l == null ? null : c15659l.mo1225l());
        InterfaceC15782l interfaceC15782l = c1406l.loadAd;
        this.remoteconfig = interfaceC15782l == null ? null : interfaceC15782l.mo1225l();
        C2536l c2536l = c1406l.crashlytics;
        this.vip = (C14720l) (c2536l == null ? null : c2536l.mo1225l());
        C2982l c2982l = c1406l.amazon;
        this.metrica = c2982l == null ? null : c2982l.mo1225l();
        C2982l c2982l2 = c1406l.billing;
        C10017l c10017lMo1225l = c2982l2 == null ? null : c2982l2.mo1225l();
        this.adcel = c10017lMo1225l;
        this.ad = c1406l.remoteconfig;
        C2982l c2982l3 = c1406l.admob;
        this.subscription = c2982l3 == null ? null : c2982l3.mo1225l();
        C2982l c2982l4 = c1406l.subs;
        this.tapsense = c2982l4 == null ? null : c2982l4.mo1225l();
        C2982l c2982l5 = c1406l.isPro;
        this.Signature = c2982l5 == null ? null : c2982l5.mo1225l();
        if (c10017lMo1225l != null) {
            this.loadAd = new Matrix();
            this.crashlytics = new Matrix();
            this.amazon = new Matrix();
            this.purchase = new float[9];
        } else {
            this.loadAd = null;
            this.crashlytics = null;
            this.amazon = null;
            this.purchase = null;
        }
        C2982l c2982l6 = c1406l.mopub;
        this.ads = c2982l6 == null ? null : c2982l6.mo1225l();
        C2536l c2536l2 = c1406l.purchase;
        if (c2536l2 != null) {
            this.startapp = (C10017l) c2536l2.mo1225l();
        }
        C2982l c2982l7 = c1406l.firebase;
        if (c2982l7 != null) {
            this.license = c2982l7.mo1225l();
        } else {
            this.license = null;
        }
        C2982l c2982l8 = c1406l.smaato;
        if (c2982l8 != null) {
            this.pro = c2982l8.mo1225l();
        } else {
            this.pro = null;
        }
    }

    public final Matrix amazon() {
        PointF pointF;
        C5798l c5798l;
        PointF pointF2;
        Matrix matrix = this.yandex;
        matrix.reset();
        C14720l c14720l = this.vip;
        AbstractC13890l abstractC13890l = this.smaato;
        AbstractC4383l abstractC4383l = this.remoteconfig;
        C10017l c10017l = this.Signature;
        C10017l c10017l2 = this.tapsense;
        C10017l c10017l3 = this.subscription;
        if ((c10017l3 == null || c10017l3.subs() == 0.0f) && ((c10017l2 == null || c10017l2.subs() == 0.0f) && (c10017l == null || c10017l.subs() == 0.0f))) {
            if (abstractC4383l != null && (pointF2 = (PointF) abstractC4383l.amazon()) != null) {
                float f = pointF2.x;
                if (f != 0.0f || pointF2.y != 0.0f) {
                    matrix.preTranslate(f, pointF2.y);
                }
            }
            if (!this.ad) {
                C10017l c10017l4 = this.metrica;
                if (c10017l4 != null) {
                    float fSubs = c10017l4.subs();
                    if (fSubs != 0.0f) {
                        matrix.preRotate(fSubs);
                    }
                }
            } else if (abstractC4383l != null) {
                float f2 = abstractC4383l.amazon;
                PointF pointF3 = (PointF) abstractC4383l.amazon();
                float f3 = pointF3.x;
                float f4 = pointF3.y;
                abstractC4383l.mopub(1.0E-4f + f2);
                PointF pointF4 = (PointF) abstractC4383l.amazon();
                abstractC4383l.mopub(f2);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f4, pointF4.x - f3)));
            }
            C10017l c10017l5 = this.adcel;
            if (c10017l5 != null) {
                C10017l c10017l6 = this.ads;
                float fCos = c10017l6 == null ? 0.0f : (float) Math.cos(Math.toRadians((-c10017l6.subs()) + 90.0f));
                float fSin = c10017l6 == null ? 1.0f : (float) Math.sin(Math.toRadians((-c10017l6.subs()) + 90.0f));
                float fTan = (float) Math.tan(Math.toRadians(c10017l5.subs()));
                crashlytics();
                float[] fArr = this.purchase;
                fArr[0] = fCos;
                fArr[1] = fSin;
                float f5 = -fSin;
                fArr[3] = f5;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix2 = this.loadAd;
                matrix2.setValues(fArr);
                crashlytics();
                fArr[0] = 1.0f;
                fArr[3] = fTan;
                fArr[4] = 1.0f;
                fArr[8] = 1.0f;
                Matrix matrix3 = this.crashlytics;
                matrix3.setValues(fArr);
                crashlytics();
                fArr[0] = fCos;
                fArr[1] = f5;
                fArr[3] = fSin;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix4 = this.amazon;
                matrix4.setValues(fArr);
                matrix3.preConcat(matrix2);
                matrix4.preConcat(matrix3);
                matrix.preConcat(matrix4);
            }
            if (c14720l != null && (c5798l = (C5798l) c14720l.amazon()) != null) {
                float f6 = c5798l.yandex;
                if (f6 != 1.0f || c5798l.loadAd != 1.0f) {
                    matrix.preScale(f6, c5798l.loadAd);
                }
            }
            if (abstractC13890l != null && (pointF = (PointF) abstractC13890l.amazon()) != null) {
                float f7 = pointF.x;
                if (f7 != 0.0f || pointF.y != 0.0f) {
                    matrix.preTranslate(-f7, -pointF.y);
                }
            }
        } else {
            float fSubs2 = c10017l3 != null ? c10017l3.subs() : 0.0f;
            float fSubs3 = c10017l2 != null ? c10017l2.subs() : 0.0f;
            float fSubs4 = c10017l != null ? c10017l.subs() : 0.0f;
            if (this.firebase || fSubs2 != this.billing || fSubs3 != this.mopub || fSubs4 != this.admob) {
                this.billing = fSubs2;
                this.mopub = fSubs3;
                this.admob = fSubs4;
                if (fSubs2 != 0.0f) {
                    this.subs = (float) Math.cos(Math.toRadians(fSubs2));
                } else {
                    this.subs = 1.0f;
                }
                if (fSubs3 != 0.0f) {
                    this.isPro = (float) Math.cos(Math.toRadians(fSubs3));
                } else {
                    this.isPro = 1.0f;
                }
                this.firebase = false;
            }
            PointF pointF5 = abstractC13890l == null ? null : (PointF) abstractC13890l.amazon();
            PointF pointF6 = abstractC4383l == null ? null : (PointF) abstractC4383l.amazon();
            C5798l c5798l2 = c14720l != null ? (C5798l) c14720l.amazon() : null;
            float f8 = c5798l2 != null ? c5798l2.yandex : 1.0f;
            float f9 = c5798l2 != null ? c5798l2.loadAd : 1.0f;
            float f10 = this.subs;
            float f11 = this.isPro;
            matrix.reset();
            if (pointF6 != null) {
                float f12 = pointF6.x;
                if (f12 != 0.0f || pointF6.y != 0.0f) {
                    matrix.preTranslate(f12, pointF6.y);
                }
            }
            if (fSubs4 != 0.0f) {
                matrix.preRotate(fSubs4);
            }
            if (fSubs3 != 0.0f) {
                matrix.preScale(f11, 1.0f);
            }
            if (fSubs2 != 0.0f) {
                matrix.preScale(1.0f, f10);
            }
            if (f8 != 1.0f || f9 != 1.0f) {
                matrix.preScale(f8, f9);
            }
            if (pointF5 != null) {
                float f13 = pointF5.x;
                if (f13 != 0.0f || pointF5.y != 0.0f) {
                    matrix.preTranslate(-f13, -pointF5.y);
                    return matrix;
                }
            }
        }
        return matrix;
    }

    public final void crashlytics() {
        for (int i = 0; i < 9; i++) {
            this.purchase[i] = 0.0f;
        }
    }

    public final void loadAd(InterfaceC15871l interfaceC15871l) {
        C10017l c10017l = this.startapp;
        if (c10017l != null) {
            c10017l.yandex(interfaceC15871l);
        }
        C10017l c10017l2 = this.license;
        if (c10017l2 != null) {
            c10017l2.yandex(interfaceC15871l);
        }
        C10017l c10017l3 = this.pro;
        if (c10017l3 != null) {
            c10017l3.yandex(interfaceC15871l);
        }
        AbstractC13890l abstractC13890l = this.smaato;
        if (abstractC13890l != null) {
            abstractC13890l.yandex(interfaceC15871l);
        }
        AbstractC4383l abstractC4383l = this.remoteconfig;
        if (abstractC4383l != null) {
            abstractC4383l.yandex(interfaceC15871l);
        }
        C14720l c14720l = this.vip;
        if (c14720l != null) {
            c14720l.yandex(interfaceC15871l);
        }
        C10017l c10017l4 = this.metrica;
        if (c10017l4 != null) {
            c10017l4.yandex(interfaceC15871l);
        }
        C10017l c10017l5 = this.adcel;
        if (c10017l5 != null) {
            c10017l5.yandex(interfaceC15871l);
        }
        C10017l c10017l6 = this.ads;
        if (c10017l6 != null) {
            c10017l6.yandex(interfaceC15871l);
        }
        C10017l c10017l7 = this.subscription;
        if (c10017l7 != null) {
            c10017l7.yandex(interfaceC15871l);
            c10017l7.yandex(new C9161l(0, this));
        }
        C10017l c10017l8 = this.tapsense;
        if (c10017l8 != null) {
            c10017l8.yandex(interfaceC15871l);
            c10017l8.yandex(new C9161l(1, this));
        }
        C10017l c10017l9 = this.Signature;
        if (c10017l9 != null) {
            c10017l9.yandex(interfaceC15871l);
            c10017l9.yandex(new C9161l(2, this));
        }
    }

    public final Matrix purchase(float f) {
        AbstractC4383l abstractC4383l = this.remoteconfig;
        PointF pointF = abstractC4383l == null ? null : (PointF) abstractC4383l.amazon();
        C14720l c14720l = this.vip;
        C5798l c5798l = c14720l == null ? null : (C5798l) c14720l.amazon();
        AbstractC13890l abstractC13890l = this.smaato;
        PointF pointF2 = abstractC13890l != null ? (PointF) abstractC13890l.amazon() : null;
        Matrix matrix = this.yandex;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        C10017l c10017l = this.subscription;
        float fSubs = c10017l != null ? c10017l.subs() * f : 0.0f;
        C10017l c10017l2 = this.tapsense;
        float fSubs2 = c10017l2 != null ? c10017l2.subs() * f : 0.0f;
        C10017l c10017l3 = this.Signature;
        float fSubs3 = c10017l3 != null ? c10017l3.subs() * f : 0.0f;
        if (fSubs == 0.0f && fSubs2 == 0.0f && fSubs3 == 0.0f) {
            C10017l c10017l4 = this.metrica;
            if (c10017l4 != null) {
                matrix.preRotate(((Float) c10017l4.amazon()).floatValue() * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
        } else {
            float fCos = fSubs != 0.0f ? (float) Math.cos(Math.toRadians(fSubs)) : 1.0f;
            float fCos2 = fSubs2 != 0.0f ? (float) Math.cos(Math.toRadians(fSubs2)) : 1.0f;
            if (fSubs3 != 0.0f) {
                matrix.preRotate(fSubs3, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
            if (fSubs2 != 0.0f) {
                matrix.preScale(fCos2, 1.0f);
            }
            if (fSubs != 0.0f) {
                matrix.preScale(1.0f, fCos);
            }
        }
        if (c5798l != null) {
            double d = f;
            matrix.preScale((float) Math.pow(c5798l.yandex, d), (float) Math.pow(c5798l.loadAd, d));
        }
        return matrix;
    }

    public final void yandex(AbstractC10437l abstractC10437l) {
        abstractC10437l.amazon(this.startapp);
        abstractC10437l.amazon(this.license);
        abstractC10437l.amazon(this.pro);
        abstractC10437l.amazon(this.smaato);
        abstractC10437l.amazon(this.remoteconfig);
        abstractC10437l.amazon(this.vip);
        abstractC10437l.amazon(this.metrica);
        abstractC10437l.amazon(this.adcel);
        abstractC10437l.amazon(this.ads);
        abstractC10437l.amazon(this.subscription);
        abstractC10437l.amazon(this.tapsense);
        abstractC10437l.amazon(this.Signature);
    }
}

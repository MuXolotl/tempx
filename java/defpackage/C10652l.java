package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: renamed from: lَٖۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10652l {
    public static final Matrix startapp = new Matrix();
    public float admob;
    public Paint amazon;
    public PathMeasure billing;
    public final Matrix crashlytics;
    public float firebase;
    public float isPro;
    public final Path loadAd;
    public final C11154l metrica;
    public final C11347l mopub;
    public Paint purchase;
    public String remoteconfig;
    public int smaato;
    public float subs;
    public Boolean vip;
    public final Path yandex;

    public C10652l(C10652l c10652l) {
        this.crashlytics = new Matrix();
        this.admob = 0.0f;
        this.subs = 0.0f;
        this.isPro = 0.0f;
        this.firebase = 0.0f;
        this.smaato = 255;
        this.remoteconfig = null;
        this.vip = null;
        C11154l c11154l = new C11154l(0);
        this.metrica = c11154l;
        this.mopub = new C11347l(c10652l.mopub, c11154l);
        this.yandex = new Path(c10652l.yandex);
        this.loadAd = new Path(c10652l.loadAd);
        this.admob = c10652l.admob;
        this.subs = c10652l.subs;
        this.isPro = c10652l.isPro;
        this.firebase = c10652l.firebase;
        this.smaato = c10652l.smaato;
        this.remoteconfig = c10652l.remoteconfig;
        String str = c10652l.remoteconfig;
        if (str != null) {
            c11154l.put(str, this);
        }
        this.vip = c10652l.vip;
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.smaato;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.smaato = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void yandex(C11347l c11347l, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        Matrix matrix2 = c11347l.yandex;
        ArrayList arrayList = c11347l.loadAd;
        matrix2.set(matrix);
        Matrix matrix3 = c11347l.yandex;
        matrix3.preConcat(c11347l.isPro);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            AbstractC3126l abstractC3126l = (AbstractC3126l) arrayList.get(i5);
            if (abstractC3126l instanceof C11347l) {
                yandex((C11347l) abstractC3126l, matrix3, canvas, i, i2);
            } else {
                if (abstractC3126l instanceof AbstractC13712l) {
                    AbstractC13712l abstractC13712l = (AbstractC13712l) abstractC3126l;
                    float f2 = i / this.isPro;
                    float f3 = i2 / this.firebase;
                    float fMin = Math.min(f2, f3);
                    Matrix matrix4 = this.crashlytics;
                    matrix4.set(matrix3);
                    matrix4.postScale(f2, f3);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                    boolean z = c;
                    i3 = i5;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f4 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f4) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.yandex;
                        path.reset();
                        C15101l[] c15101lArr = abstractC13712l.yandex;
                        if (c15101lArr != null) {
                            AbstractC15300l.subs(c15101lArr, path);
                        }
                        Path path2 = this.loadAd;
                        path2.reset();
                        if (abstractC13712l instanceof C6567l) {
                            path2.setFillType(abstractC13712l.crashlytics == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            C3636l c3636l = (C3636l) abstractC13712l;
                            float f5 = c3636l.subs;
                            if (f5 != 0.0f || c3636l.isPro != 1.0f) {
                                float f6 = c3636l.firebase;
                                float f7 = (f5 + f6) % 1.0f;
                                float f8 = (c3636l.isPro + f6) % 1.0f;
                                if (this.billing == null) {
                                    this.billing = new PathMeasure();
                                }
                                this.billing.setPath(path, z);
                                float length = this.billing.getLength();
                                float f9 = f7 * length;
                                float f10 = f8 * length;
                                path.reset();
                                PathMeasure pathMeasure = this.billing;
                                if (f9 > f10) {
                                    pathMeasure.getSegment(f9, length, path, true);
                                    f = 0.0f;
                                    this.billing.getSegment(0.0f, f10, path, true);
                                } else {
                                    f = 0.0f;
                                    pathMeasure.getSegment(f9, f10, path, true);
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            C13698l c13698l = c3636l.billing;
                            float f11 = 255.0f;
                            if (((Shader) c13698l.f26743l) == null && c13698l.f26744l == 0) {
                                f11 = 255.0f;
                                i4 = 16777215;
                            } else {
                                if (this.purchase == null) {
                                    i4 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.purchase = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i4 = 16777215;
                                }
                                Paint paint2 = this.purchase;
                                Shader shader = (Shader) c13698l.f26743l;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(c3636l.admob * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i6 = c13698l.f26744l;
                                    float f12 = c3636l.admob;
                                    PorterDuff.Mode mode = C5669l.f12063l;
                                    paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(c3636l.crashlytics == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            C13698l c13698l2 = c3636l.amazon;
                            if (((Shader) c13698l2.f26743l) != null || c13698l2.f26744l != 0) {
                                if (this.amazon == null) {
                                    Paint paint3 = new Paint(1);
                                    this.amazon = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.amazon;
                                Paint.Join join = c3636l.remoteconfig;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = c3636l.smaato;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(c3636l.vip);
                                Shader shader2 = (Shader) c13698l2.f26743l;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(c3636l.mopub * f11));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i7 = c13698l2.f26744l;
                                    float f13 = c3636l.mopub;
                                    PorterDuff.Mode mode2 = C5669l.f12063l;
                                    paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(c3636l.purchase * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public C10652l() {
        this.crashlytics = new Matrix();
        this.admob = 0.0f;
        this.subs = 0.0f;
        this.isPro = 0.0f;
        this.firebase = 0.0f;
        this.smaato = 255;
        this.remoteconfig = null;
        this.vip = null;
        this.metrica = new C11154l(0);
        this.mopub = new C11347l();
        this.yandex = new Path();
        this.loadAd = new Path();
    }
}

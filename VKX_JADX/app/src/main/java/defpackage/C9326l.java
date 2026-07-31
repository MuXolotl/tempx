package defpackage;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: renamed from: lٍؕۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9326l {
    public static final Matrix premium = new Matrix();
    public Canvas Signature;
    public float ad = 0.0f;
    public float[] adcel;
    public RectF admob;
    public Bitmap ads;
    public RenderNode advert;
    public RectF amazon;
    public Rect billing;
    public int crashlytics;
    public C13957l firebase;
    public RectF isPro;
    public RenderNode isVip;
    public C13957l license;
    public C14785l loadAd;
    public C13957l metrica;
    public RectF mopub;
    public BlurMaskFilter pro;
    public RectF purchase;
    public Canvas remoteconfig;
    public C15480l signatures;
    public Bitmap smaato;
    public Matrix startapp;
    public Rect subs;
    public Bitmap subscription;
    public Canvas tapsense;
    public Rect vip;
    public Canvas yandex;

    public static boolean amazon(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public static Bitmap yandex(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(((double) rectF.width()) * 1.05d), 1), Math.max((int) Math.ceil(((double) rectF.height()) * 1.05d), 1), config);
    }

    public final void crashlytics() {
        float f;
        C13957l c13957l;
        if (this.yandex == null || this.loadAd == null || this.adcel == null || this.amazon == null) {
            C8339l.smaato("OffscreenBitmap: finish() call without matching start()");
            return;
        }
        int iInmobi = AbstractC5020l.inmobi(this.crashlytics);
        if (iInmobi == 0 || iInmobi == 1) {
            this.yandex.restore();
        } else {
            if (iInmobi != 2) {
                if (iInmobi == 3) {
                    if (this.advert == null) {
                        C8339l.smaato("RenderNode is not ready; should've been initialized at start() time");
                        return;
                    }
                    int i = Build.VERSION.SDK_INT;
                    if (i < 29) {
                        C8339l.smaato("RenderNode not supported but we chose it as render strategy");
                        return;
                    }
                    this.yandex.save();
                    Canvas canvas = this.yandex;
                    float[] fArr = this.adcel;
                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                    this.advert.endRecording();
                    if (this.loadAd.tapsense()) {
                        Canvas canvas2 = this.yandex;
                        C15480l c15480l = (C15480l) this.loadAd.f28907l;
                        if (this.advert == null || this.isVip == null) {
                            C8339l.smaato("Cannot render to render node outside a start()/finish() block");
                            return;
                        }
                        if (i < 31) {
                            C18073l.license("RenderEffect is not supported on API level <31");
                            return;
                        }
                        float[] fArr2 = this.adcel;
                        float f2 = fArr2 != null ? fArr2[0] : 1.0f;
                        f = fArr2 != null ? fArr2[4] : 1.0f;
                        C15480l c15480l2 = this.signatures;
                        if (c15480l2 == null || c15480l.yandex != c15480l2.yandex || c15480l.loadAd != c15480l2.loadAd || c15480l.crashlytics != c15480l2.crashlytics || c15480l.amazon != c15480l2.amazon) {
                            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(c15480l.amazon, PorterDuff.Mode.SRC_IN));
                            float f3 = c15480l.yandex;
                            if (f3 > 0.0f) {
                                float f4 = ((f2 + f) * f3) / 2.0f;
                                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(f4, f4, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
                            }
                            this.isVip.setRenderEffect(renderEffectCreateColorFilterEffect);
                            this.signatures = c15480l;
                        }
                        RectF rectFLoadAd = loadAd(this.amazon, c15480l);
                        RectF rectF = new RectF(rectFLoadAd.left * f2, rectFLoadAd.top * f, rectFLoadAd.right * f2, rectFLoadAd.bottom * f);
                        this.isVip.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                        RecordingCanvas recordingCanvasBeginRecording = this.isVip.beginRecording((int) rectF.width(), (int) rectF.height());
                        recordingCanvasBeginRecording.translate((c15480l.loadAd * f2) + (-rectF.left), (c15480l.crashlytics * f) + (-rectF.top));
                        recordingCanvasBeginRecording.drawRenderNode(this.advert);
                        this.isVip.endRecording();
                        canvas2.save();
                        canvas2.translate(rectF.left, rectF.top);
                        canvas2.drawRenderNode(this.isVip);
                        canvas2.restore();
                    }
                    this.yandex.drawRenderNode(this.advert);
                    this.yandex.restore();
                }
            } else {
                if (this.smaato == null) {
                    C8339l.smaato("Bitmap is not ready; should've been initialized at start() time");
                    return;
                }
                if (this.loadAd.tapsense()) {
                    Canvas canvas3 = this.yandex;
                    C15480l c15480l3 = (C15480l) this.loadAd.f28907l;
                    RectF rectF2 = this.amazon;
                    if (rectF2 == null || this.smaato == null) {
                        C8339l.smaato("Cannot render to bitmap outside a start()/finish() block");
                        return;
                    }
                    RectF rectFLoadAd2 = loadAd(rectF2, c15480l3);
                    if (this.billing == null) {
                        this.billing = new Rect();
                    }
                    this.billing.set((int) Math.floor(rectFLoadAd2.left), (int) Math.floor(rectFLoadAd2.top), (int) Math.ceil(rectFLoadAd2.right), (int) Math.ceil(rectFLoadAd2.bottom));
                    float[] fArr3 = this.adcel;
                    float f5 = fArr3 != null ? fArr3[0] : 1.0f;
                    f = fArr3 != null ? fArr3[4] : 1.0f;
                    if (this.admob == null) {
                        this.admob = new RectF();
                    }
                    this.admob.set(rectFLoadAd2.left * f5, rectFLoadAd2.top * f, rectFLoadAd2.right * f5, rectFLoadAd2.bottom * f);
                    if (this.subs == null) {
                        this.subs = new Rect();
                    }
                    this.subs.set(0, 0, Math.round(this.admob.width()), Math.round(this.admob.height()));
                    if (amazon(this.ads, this.admob)) {
                        Bitmap bitmap = this.ads;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        Bitmap bitmap2 = this.subscription;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        this.ads = yandex(this.admob, Bitmap.Config.ARGB_8888);
                        this.subscription = yandex(this.admob, Bitmap.Config.ALPHA_8);
                        this.tapsense = new Canvas(this.ads);
                        this.Signature = new Canvas(this.subscription);
                    } else {
                        Canvas canvas4 = this.tapsense;
                        if (canvas4 == null || this.Signature == null || (c13957l = this.metrica) == null) {
                            C8339l.smaato("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                            return;
                        } else {
                            canvas4.drawRect(this.subs, c13957l);
                            this.Signature.drawRect(this.subs, this.metrica);
                        }
                    }
                    if (this.subscription == null) {
                        C8339l.smaato("Expected to have allocated a shadow mask bitmap");
                        return;
                    }
                    if (this.license == null) {
                        this.license = new C13957l(1, 0);
                    }
                    RectF rectF3 = this.amazon;
                    this.Signature.drawBitmap(this.smaato, Math.round((rectF3.left - rectFLoadAd2.left) * f5), Math.round((rectF3.top - rectFLoadAd2.top) * f), (Paint) null);
                    if (this.pro == null || this.ad != c15480l3.yandex) {
                        float f6 = ((f5 + f) * c15480l3.yandex) / 2.0f;
                        if (f6 > 0.0f) {
                            this.pro = new BlurMaskFilter(f6, BlurMaskFilter.Blur.NORMAL);
                        } else {
                            this.pro = null;
                        }
                        this.ad = c15480l3.yandex;
                    }
                    this.license.setColor(c15480l3.amazon);
                    float f7 = c15480l3.yandex;
                    C13957l c13957l2 = this.license;
                    if (f7 > 0.0f) {
                        c13957l2.setMaskFilter(this.pro);
                    } else {
                        c13957l2.setMaskFilter(null);
                    }
                    this.license.setFilterBitmap(true);
                    this.tapsense.drawBitmap(this.subscription, Math.round(c15480l3.loadAd * f5), Math.round(c15480l3.crashlytics * f), this.license);
                    canvas3.drawBitmap(this.ads, this.subs, this.billing, this.firebase);
                }
                if (this.vip == null) {
                    this.vip = new Rect();
                }
                this.vip.set(0, 0, (int) (this.amazon.width() * this.adcel[0]), (int) (this.amazon.height() * this.adcel[4]));
                this.yandex.drawBitmap(this.smaato, this.vip, this.amazon, this.firebase);
            }
        }
        this.yandex = null;
    }

    public final RectF loadAd(RectF rectF, C15480l c15480l) {
        if (this.purchase == null) {
            this.purchase = new RectF();
        }
        if (this.mopub == null) {
            this.mopub = new RectF();
        }
        this.purchase.set(rectF);
        this.purchase.offsetTo(rectF.left + c15480l.loadAd, rectF.top + c15480l.crashlytics);
        RectF rectF2 = this.purchase;
        float f = c15480l.yandex;
        rectF2.inset(-f, -f);
        this.mopub.set(rectF);
        this.purchase.union(this.mopub);
        return this.purchase;
    }

    public final Canvas purchase(Canvas canvas, RectF rectF, C14785l c14785l) {
        if (this.yandex != null) {
            C8339l.smaato("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
            return null;
        }
        if (this.adcel == null) {
            this.adcel = new float[9];
        }
        if (this.startapp == null) {
            this.startapp = new Matrix();
        }
        canvas.getMatrix(this.startapp);
        this.startapp.getValues(this.adcel);
        float[] fArr = this.adcel;
        float f = fArr[0];
        int i = 4;
        float f2 = fArr[4];
        if (this.isPro == null) {
            this.isPro = new RectF();
        }
        this.isPro.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
        this.yandex = canvas;
        this.loadAd = c14785l;
        if (c14785l.f28908l >= 255 && !c14785l.tapsense()) {
            i = 1;
        } else if (c14785l.tapsense()) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 29 || !canvas.isHardwareAccelerated() || i2 <= 31) {
                i = 3;
            }
        } else {
            i = 2;
        }
        this.crashlytics = i;
        if (this.amazon == null) {
            this.amazon = new RectF();
        }
        this.amazon.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.firebase == null) {
            this.firebase = new C13957l();
        }
        this.firebase.reset();
        int iInmobi = AbstractC5020l.inmobi(this.crashlytics);
        if (iInmobi == 0) {
            canvas.save();
            return canvas;
        }
        if (iInmobi == 1) {
            this.firebase.setAlpha(c14785l.f28908l);
            this.firebase.setColorFilter(null);
            C13957l c13957l = this.firebase;
            Matrix matrix = AbstractC4218l.yandex;
            canvas.saveLayer(rectF, c13957l);
            return canvas;
        }
        Matrix matrix2 = premium;
        if (iInmobi == 2) {
            if (this.metrica == null) {
                C13957l c13957l2 = new C13957l();
                this.metrica = c13957l2;
                c13957l2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (amazon(this.smaato, this.isPro)) {
                Bitmap bitmap = this.smaato;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.smaato = yandex(this.isPro, Bitmap.Config.ARGB_8888);
                this.remoteconfig = new Canvas(this.smaato);
            } else {
                Canvas canvas2 = this.remoteconfig;
                if (canvas2 == null) {
                    C8339l.smaato("If needNewBitmap() returns true, we should have a canvas ready");
                    return null;
                }
                canvas2.setMatrix(matrix2);
                this.remoteconfig.drawRect(-1.0f, -1.0f, this.isPro.width() + 1.0f, this.isPro.height() + 1.0f, this.metrica);
            }
            AbstractC6604l.crashlytics(0, this.firebase);
            this.firebase.setColorFilter(null);
            this.firebase.setAlpha(c14785l.f28908l);
            Canvas canvas3 = this.remoteconfig;
            canvas3.scale(f, f2);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (iInmobi != 3) {
            C18073l.license("Invalid render strategy for OffscreenLayer");
            return null;
        }
        if (Build.VERSION.SDK_INT < 29) {
            C8339l.smaato("RenderNode not supported but we chose it as render strategy");
            return null;
        }
        if (this.advert == null) {
            this.advert = new RenderNode("OffscreenLayer.main");
        }
        if (c14785l.tapsense() && this.isVip == null) {
            this.isVip = new RenderNode("OffscreenLayer.shadow");
            this.signatures = null;
        }
        this.advert.setAlpha(c14785l.f28908l / 255.0f);
        if (c14785l.tapsense()) {
            RenderNode renderNode = this.isVip;
            if (renderNode == null) {
                C8339l.smaato("Must initialize shadowRenderNode when we have shadow");
                return null;
            }
            renderNode.setAlpha(c14785l.f28908l / 255.0f);
        }
        this.advert.setHasOverlappingRendering(true);
        RenderNode renderNode2 = this.advert;
        RectF rectF2 = this.isPro;
        renderNode2.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.advert.beginRecording((int) this.isPro.width(), (int) this.isPro.height());
        recordingCanvasBeginRecording.setMatrix(matrix2);
        recordingCanvasBeginRecording.scale(f, f2);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }
}

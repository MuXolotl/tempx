package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: lؘؙْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6289l extends AbstractC10437l {
    public final Rect applovin;
    public final Rect appmetrica;
    public final RectF inmobi;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final C18103l f13243package;
    public final C13957l premium;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public C14785l f13244strictfp;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public C9326l f13245synchronized;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final C3547l f13246throws;

    public C6289l(C9950l c9950l, C4913l c4913l) {
        super(c9950l, c4913l);
        this.premium = new C13957l(3, 0);
        this.applovin = new Rect();
        this.appmetrica = new Rect();
        this.inmobi = new RectF();
        String str = c4913l.mopub;
        C10712l c10712l = c9950l.f20287l;
        this.f13246throws = c10712l == null ? null : (C3547l) ((HashMap) c10712l.crashlytics()).get(str);
        C11644l c11644l = this.startapp.ad;
        if (c11644l != null) {
            this.f13243package = new C18103l(this, this, c11644l);
        }
    }

    @Override // defpackage.AbstractC10437l, defpackage.InterfaceC15345l
    public final void crashlytics(RectF rectF, Matrix matrix, boolean z) {
        super.crashlytics(rectF, matrix, z);
        C3547l c3547l = this.f13246throws;
        if (c3547l != null) {
            float fCrashlytics = AbstractC4218l.crashlytics();
            this.metrica.getClass();
            Bitmap bitmapVip = vip();
            if (bitmapVip != null) {
                rectF.set(0.0f, 0.0f, bitmapVip.getWidth() * fCrashlytics, bitmapVip.getHeight() * fCrashlytics);
            } else {
                rectF.set(0.0f, 0.0f, c3547l.yandex * fCrashlytics, c3547l.loadAd * fCrashlytics);
            }
            this.vip.mapRect(rectF);
        }
    }

    @Override // defpackage.AbstractC10437l
    public final void subs(Canvas canvas, Matrix matrix, int i, C15480l c15480l) {
        Bitmap bitmapVip = vip();
        if (bitmapVip == null || bitmapVip.isRecycled() || this.f13246throws == null) {
            return;
        }
        float fCrashlytics = AbstractC4218l.crashlytics();
        C13957l c13957l = this.premium;
        c13957l.setAlpha(i);
        C18103l c18103l = this.f13243package;
        if (c18103l != null) {
            c15480l = c18103l.loadAd(matrix, i);
        }
        int width = bitmapVip.getWidth();
        int height = bitmapVip.getHeight();
        Rect rect = this.applovin;
        rect.set(0, 0, width, height);
        this.metrica.getClass();
        int width2 = (int) (bitmapVip.getWidth() * fCrashlytics);
        int height2 = (int) (bitmapVip.getHeight() * fCrashlytics);
        Rect rect2 = this.appmetrica;
        rect2.set(0, 0, width2, height2);
        boolean z = c15480l != null;
        if (z) {
            if (this.f13245synchronized == null) {
                this.f13245synchronized = new C9326l();
            }
            if (this.f13244strictfp == null) {
                this.f13244strictfp = new C14785l((byte) 0, 16);
            }
            C14785l c14785l = this.f13244strictfp;
            c14785l.f28908l = 255;
            c14785l.f28907l = null;
            c15480l.getClass();
            C15480l c15480l2 = new C15480l(c15480l);
            c14785l.f28907l = c15480l2;
            c15480l2.loadAd(i);
            float f = rect2.left;
            float f2 = rect2.top;
            float f3 = rect2.right;
            float f4 = rect2.bottom;
            RectF rectF = this.inmobi;
            rectF.set(f, f2, f3, f4);
            matrix.mapRect(rectF);
            canvas = this.f13245synchronized.purchase(canvas, rectF, this.f13244strictfp);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapVip, rect, rect2, c13957l);
        if (z) {
            this.f13245synchronized.crashlytics();
            if (this.f13245synchronized.crashlytics == 4) {
                return;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX WARN: Code duplicated, block: B:37:0x00af  */
    public final Bitmap vip() {
        Bitmap bitmapAmazon;
        String str = this.startapp.mopub;
        C9950l c9950l = this.metrica;
        C10111l c10111l = c9950l.f20302l;
        if (c10111l != null) {
            Context contextBilling = c9950l.billing();
            Context context = (Context) c10111l.f20587l;
            if (contextBilling != null) {
                if (context instanceof Application) {
                    contextBilling = contextBilling.getApplicationContext();
                }
                if (contextBilling != context) {
                    c9950l.f20302l = null;
                }
            } else if (context != null) {
                c9950l.f20302l = null;
            }
        }
        if (c9950l.f20302l == null) {
            c9950l.f20302l = new C10111l(c9950l.getCallback(), c9950l.f20287l.crashlytics());
        }
        C10111l c10111l2 = c9950l.f20302l;
        if (c10111l2 != null) {
            String str2 = (String) c10111l2.f20586l;
            C3547l c3547l = (C3547l) ((Map) c10111l2.f20589l).get(str);
            if (c3547l == null) {
                bitmapAmazon = null;
            } else {
                int i = c3547l.loadAd;
                int i2 = c3547l.yandex;
                bitmapAmazon = c3547l.billing;
                if (bitmapAmazon == null) {
                    Context context2 = (Context) c10111l2.f20587l;
                    if (context2 == null) {
                        bitmapAmazon = null;
                    } else {
                        String str3 = c3547l.amazon;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        if (!str3.startsWith("data:") || str3.indexOf("base64,") <= 0) {
                            try {
                                if (TextUtils.isEmpty(str2)) {
                                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                }
                                try {
                                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context2.getAssets().open(str2 + str3), null, options);
                                    if (bitmapDecodeStream == null) {
                                        AbstractC17968l.loadAd("Decoded image `" + str + "` is null.");
                                        bitmapAmazon = null;
                                    } else {
                                        bitmapAmazon = AbstractC4218l.amazon(bitmapDecodeStream, i2, i);
                                        c10111l2.premium(str, bitmapAmazon);
                                    }
                                } catch (IllegalArgumentException e) {
                                    AbstractC17968l.crashlytics("Unable to decode image `" + str + "`.", e);
                                }
                            } catch (IOException e2) {
                                AbstractC17968l.crashlytics("Unable to open asset.", e2);
                            }
                        } else {
                            try {
                                byte[] bArrDecode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                                try {
                                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                                    if (bitmapDecodeByteArray == null) {
                                        AbstractC17968l.loadAd("Decoded image `" + str + "` is null.");
                                        bitmapAmazon = null;
                                    } else {
                                        bitmapAmazon = AbstractC4218l.amazon(bitmapDecodeByteArray, i2, i);
                                        synchronized (C10111l.f20582l) {
                                            ((C3547l) ((Map) c10111l2.f20589l).get(str)).billing = bitmapAmazon;
                                        }
                                    }
                                } catch (IllegalArgumentException e3) {
                                    AbstractC17968l.crashlytics("Unable to decode image `" + str + "`.", e3);
                                }
                            } catch (IllegalArgumentException e4) {
                                AbstractC17968l.crashlytics("data URL did not have correct base64 format.", e4);
                            }
                        }
                    }
                }
            }
        } else {
            bitmapAmazon = null;
        }
        if (bitmapAmazon != null) {
            return bitmapAmazon;
        }
        C3547l c3547l2 = this.f13246throws;
        if (c3547l2 != null) {
            return c3547l2.billing;
        }
        return null;
    }
}

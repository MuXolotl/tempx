package com.google.android.renderscript;

import android.graphics.Bitmap;
import defpackage.AbstractC14412l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC15560l;
import defpackage.C10754l;
import defpackage.C8339l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0003\u0010\u0004J:\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJB\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0082 ¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/google/android/renderscript/Toolkit;", "", "", "createNative", "()J", "nativeHandle", "Landroid/graphics/Bitmap;", "inputBitmap", "outputBitmap", "", "radius", "Lcom/google/android/renderscript/Range2d;", "restriction", "", "nativeBlurBitmap", "(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;ILcom/google/android/renderscript/Range2d;)V", "", "matrix", "addVector", "nativeColorMatrixBitmap", "(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[F[FLcom/google/android/renderscript/Range2d;)V", "renderscript-toolkit"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Toolkit {
    public static final long loadAd;
    public static final Toolkit yandex;

    static {
        Toolkit toolkit = new Toolkit();
        yandex = toolkit;
        System.loadLibrary("renderscript-toolkit");
        loadAd = toolkit.createNative();
    }

    private final native long createNative();

    public static Bitmap loadAd(Bitmap bitmap, float[] fArr) {
        float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.0f};
        AbstractC14412l.subs("colorMatrix", bitmap);
        if (fArr.length != 16) {
            C10754l.metrica(AbstractC14814l.remoteconfig(fArr.length, " provided.", new StringBuilder("RenderScript Toolkit colorMatrix. matrix should have 16 entries. ")));
            return null;
        }
        if (fArr2.length != 4) {
            C8339l.metrica("RenderScript Toolkit colorMatrix. addVector should have 4 entries.");
            return null;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        yandex.nativeColorMatrixBitmap(loadAd, bitmap, bitmapCreateBitmap, fArr, fArr2, null);
        return bitmapCreateBitmap;
    }

    private final native void nativeBlurBitmap(long nativeHandle, Bitmap inputBitmap, Bitmap outputBitmap, int radius, Range2d restriction);

    private final native void nativeColorMatrixBitmap(long nativeHandle, Bitmap inputBitmap, Bitmap outputBitmap, float[] matrix, float[] addVector, Range2d restriction);

    public static Bitmap yandex(Bitmap bitmap, int i) {
        AbstractC14412l.subs("blur", bitmap);
        if (1 > i || i >= 26) {
            C10754l.metrica(AbstractC15560l.tapsense("RenderScript Toolkit blur. The radius should be between 1 and 25. ", i, " provided."));
            return null;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        yandex.nativeBlurBitmap(loadAd, bitmap, bitmapCreateBitmap, i, null);
        return bitmapCreateBitmap;
    }
}

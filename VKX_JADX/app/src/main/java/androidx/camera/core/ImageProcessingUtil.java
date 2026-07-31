package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import defpackage.AbstractC5088l;
import defpackage.C1282l;
import defpackage.C1566l;
import defpackage.C17736l;
import defpackage.InterfaceC11792l;
import defpackage.InterfaceC12679l;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class ImageProcessingUtil {
    public static int yandex;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static void admob(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            AbstractC5088l.crashlytics("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    public static boolean amazon(int i) {
        return i == 0 || i == 90 || i == 180 || i == 270;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    public static C1282l billing(InterfaceC11792l interfaceC11792l, InterfaceC12679l interfaceC12679l, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        C1282l c1282l;
        if (!purchase(interfaceC11792l)) {
            AbstractC5088l.crashlytics("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!amazon(i)) {
            AbstractC5088l.crashlytics("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        if (i > 0) {
            int iPurchase = interfaceC11792l.purchase();
            int iLoadAd = interfaceC11792l.loadAd();
            int iFirebase = interfaceC11792l.license()[0].firebase();
            int iFirebase2 = interfaceC11792l.license()[1].firebase();
            int iFirebase3 = interfaceC11792l.license()[2].firebase();
            int iAd = interfaceC11792l.license()[1].ad();
            Image imageDequeueInputImage = imageWriter.dequeueInputImage();
            if (imageDequeueInputImage == null) {
                c1282l = null;
            } else {
                c1282l = null;
                if (nativeRotateYUV(interfaceC11792l.license()[0].crashlytics(), iFirebase, interfaceC11792l.license()[1].crashlytics(), iFirebase2, interfaceC11792l.license()[2].crashlytics(), iFirebase3, iAd, imageDequeueInputImage.getPlanes()[0].getBuffer(), imageDequeueInputImage.getPlanes()[0].getRowStride(), imageDequeueInputImage.getPlanes()[0].getPixelStride(), imageDequeueInputImage.getPlanes()[1].getBuffer(), imageDequeueInputImage.getPlanes()[1].getRowStride(), imageDequeueInputImage.getPlanes()[1].getPixelStride(), imageDequeueInputImage.getPlanes()[2].getBuffer(), imageDequeueInputImage.getPlanes()[2].getRowStride(), imageDequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, iPurchase, iLoadAd, i) == 0) {
                    imageWriter.queueInputImage(imageDequeueInputImage);
                    InterfaceC11792l interfaceC11792lSmaato = interfaceC12679l.smaato();
                    if (interfaceC11792lSmaato == null) {
                        AbstractC5088l.crashlytics("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
                        return null;
                    }
                    C1282l c1282l2 = new C1282l(interfaceC11792lSmaato);
                    c1282l2.yandex(new C17736l(interfaceC11792lSmaato, interfaceC11792l, 1));
                    return c1282l2;
                }
            }
        } else {
            c1282l = null;
        }
        AbstractC5088l.crashlytics("ImageProcessingUtil", "rotate YUV failure");
        return c1282l;
    }

    public static void crashlytics(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static C1282l loadAd(InterfaceC11792l interfaceC11792l, InterfaceC12679l interfaceC12679l, ByteBuffer byteBuffer, int i, boolean z) {
        if (!purchase(interfaceC11792l)) {
            AbstractC5088l.crashlytics("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!amazon(i)) {
            AbstractC5088l.crashlytics("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        Surface surface = interfaceC12679l.getSurface();
        int iPurchase = interfaceC11792l.purchase();
        int iLoadAd = interfaceC11792l.loadAd();
        int iFirebase = interfaceC11792l.license()[0].firebase();
        int iFirebase2 = interfaceC11792l.license()[1].firebase();
        int iFirebase3 = interfaceC11792l.license()[2].firebase();
        int iAd = interfaceC11792l.license()[0].ad();
        int iAd2 = interfaceC11792l.license()[1].ad();
        if (nativeConvertAndroid420ToABGR(interfaceC11792l.license()[0].crashlytics(), iFirebase, interfaceC11792l.license()[1].crashlytics(), iFirebase2, interfaceC11792l.license()[2].crashlytics(), iFirebase3, iAd, iAd2, surface, byteBuffer, iPurchase, iLoadAd, z ? iAd : 0, z ? iAd2 : 0, z ? iAd2 : 0, i) != 0) {
            AbstractC5088l.crashlytics("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            AbstractC5088l.yandex("ImageProcessingUtil", "Image processing performance profiling, duration: [" + (System.currentTimeMillis() - jCurrentTimeMillis) + "], image count: " + yandex);
            yandex = yandex + 1;
        }
        InterfaceC11792l interfaceC11792lSmaato = interfaceC12679l.smaato();
        if (interfaceC11792lSmaato == null) {
            AbstractC5088l.crashlytics("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        C1282l c1282l = new C1282l(interfaceC11792lSmaato);
        c1282l.yandex(new C17736l(interfaceC11792lSmaato, interfaceC11792l, 0));
        return c1282l;
    }

    public static C1282l mopub(InterfaceC11792l interfaceC11792l, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i) {
        if (!purchase(interfaceC11792l)) {
            AbstractC5088l.crashlytics("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!amazon(i)) {
            AbstractC5088l.crashlytics("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        if (i == 0 && interfaceC11792l.license().length == 3 && interfaceC11792l.license()[1].ad() == 2 && nativeGetYUVImageVUOff(interfaceC11792l.license()[2].crashlytics(), interfaceC11792l.license()[1].crashlytics()) == -1) {
            return null;
        }
        int i2 = i % 180;
        int iPurchase = i2 == 0 ? interfaceC11792l.purchase() : interfaceC11792l.loadAd();
        int iLoadAd = i2 == 0 ? interfaceC11792l.loadAd() : interfaceC11792l.purchase();
        ByteBuffer byteBufferNativeNewDirectByteBuffer = nativeNewDirectByteBuffer(byteBuffer5, 1, byteBuffer5.capacity());
        if (nativeRotateYUV(interfaceC11792l.license()[0].crashlytics(), interfaceC11792l.license()[0].firebase(), interfaceC11792l.license()[1].crashlytics(), interfaceC11792l.license()[1].firebase(), interfaceC11792l.license()[2].crashlytics(), interfaceC11792l.license()[2].firebase(), interfaceC11792l.license()[2].ad(), byteBuffer4, iPurchase, 1, byteBufferNativeNewDirectByteBuffer, iPurchase, 2, byteBuffer5, iPurchase, 2, byteBuffer, byteBuffer2, byteBuffer3, interfaceC11792l.purchase(), interfaceC11792l.loadAd(), i) == 0) {
            return new C1282l(new C1566l(interfaceC11792l, byteBuffer4, byteBufferNativeNewDirectByteBuffer, byteBuffer5, iPurchase, iLoadAd));
        }
        AbstractC5088l.crashlytics("ImageProcessingUtil", "rotate YUV failure");
        return null;
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    public static native int nativeGetYUVImageVUOff(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public static native ByteBuffer nativeNewDirectByteBuffer(ByteBuffer byteBuffer, int i, int i2);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, int i6, ByteBuffer byteBuffer5, int i7, int i8, ByteBuffer byteBuffer6, int i9, int i10, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i11, int i12, int i13);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);

    public static boolean purchase(InterfaceC11792l interfaceC11792l) {
        return interfaceC11792l.getFormat() == 35 && interfaceC11792l.license().length == 3;
    }

    public static void yandex(InterfaceC11792l interfaceC11792l) {
        if (!purchase(interfaceC11792l)) {
            AbstractC5088l.crashlytics("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return;
        }
        int iPurchase = interfaceC11792l.purchase();
        int iLoadAd = interfaceC11792l.loadAd();
        int iFirebase = interfaceC11792l.license()[0].firebase();
        int iFirebase2 = interfaceC11792l.license()[1].firebase();
        int iFirebase3 = interfaceC11792l.license()[2].firebase();
        int iAd = interfaceC11792l.license()[0].ad();
        int iAd2 = interfaceC11792l.license()[1].ad();
        if (nativeShiftPixel(interfaceC11792l.license()[0].crashlytics(), iFirebase, interfaceC11792l.license()[1].crashlytics(), iFirebase2, interfaceC11792l.license()[2].crashlytics(), iFirebase3, iAd, iAd2, iPurchase, iLoadAd, iAd, iAd2, iAd2) != 0) {
            AbstractC5088l.crashlytics("ImageProcessingUtil", "One pixel shift for YUV failure");
        }
    }
}

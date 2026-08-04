package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import androidx.car.app.model.Alert;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lٍؘؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3940l implements Closeable, InterfaceC1711l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C3797l f8113l = new C3797l("MobileVisionBase", "");

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C1770l f8114l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C1976l f8115l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AtomicBoolean f8116l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Executor f8117l;

    public AbstractC3940l(C1976l c1976l, Executor executor) {
        this.f8115l = c1976l;
        C1770l c1770l = new C1770l(7);
        this.f8114l = c1770l;
        this.f8117l = executor;
        c1976l.loadAd.incrementAndGet();
        c1976l.yandex(executor, CallableC14486l.loadAd, (C5008l) c1770l.f4179l).crashlytics(C1083l.f2982l);
    }

    public final C3823l billing(Image image, int i, Matrix matrix) {
        C3049l c3049l;
        int iLimit;
        C4845l c4845lMopub;
        EnumC14796l enumC14796l;
        Bitmap bitmapCreateBitmap;
        boolean z = false;
        AbstractC1051l.crashlytics(image.getFormat() == 35, "Only YUV_420_888 is supported now");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C3049l.loadAd(i);
        AbstractC1051l.crashlytics(image.getFormat() == 256 || image.getFormat() == 35, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            iLimit = image.getPlanes()[0].getBuffer().limit();
            AbstractC1051l.crashlytics(image.getFormat() == 256, "Only JPEG is supported now");
            Image.Plane[] planes2 = image.getPlanes();
            if (planes2 == null || planes2.length != 1) {
                C8339l.metrica("Unexpected image format, JPEG should have exactly 1 image plane");
                return null;
            }
            ByteBuffer buffer = planes2[0].getBuffer();
            buffer.rewind();
            int iRemaining = buffer.remaining();
            byte[] bArr = new byte[iRemaining];
            buffer.get(bArr);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining);
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            if (i == 0) {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, width, height);
            } else {
                Matrix matrix2 = new Matrix();
                matrix2.postRotate(i);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, width, height, matrix2, true);
            }
            c3049l = new C3049l(bitmapCreateBitmap);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            c3049l = new C3049l(image, image.getWidth(), image.getHeight(), i, matrix);
            iLimit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
        }
        int format = image.getFormat();
        int height2 = image.getHeight();
        int width2 = image.getWidth();
        synchronized (AbstractC1497l.class) {
            c4845lMopub = AbstractC1497l.mopub(new C4434l());
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        EnumC13682l enumC13682l = EnumC13682l.INPUT_IMAGE_CONSTRUCTION;
        C3823l c3823l = c4845lMopub.purchase;
        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap map = c4845lMopub.subs;
        if (map.get(enumC13682l) == null || jElapsedRealtime3 - ((Long) map.get(enumC13682l)).longValue() > 30000) {
            map.put(enumC13682l, Long.valueOf(jElapsedRealtime3));
            C6472l c6472l = new C6472l(5);
            int i2 = 16;
            if (format == -1) {
                enumC14796l = EnumC14796l.BITMAP;
            } else if (format == 35) {
                enumC14796l = EnumC14796l.YUV_420_888;
            } else if (format == 842094169) {
                enumC14796l = EnumC14796l.YV12;
            } else if (format != 16) {
                enumC14796l = format != 17 ? EnumC14796l.UNKNOWN_FORMAT : EnumC14796l.NV21;
            } else {
                enumC14796l = EnumC14796l.NV16;
            }
            c6472l.f13515l = enumC14796l;
            c6472l.f13509l = EnumC13351l.ANDROID_MEDIA_IMAGE;
            c6472l.f13514l = Integer.valueOf(iLimit & Alert.DURATION_SHOW_INDEFINITELY);
            c6472l.f13510l = Integer.valueOf(height2 & Alert.DURATION_SHOW_INDEFINITELY);
            c6472l.f13516l = Integer.valueOf(width2 & Alert.DURATION_SHOW_INDEFINITELY);
            c6472l.f13512l = Long.valueOf(jElapsedRealtime2 & Long.MAX_VALUE);
            c6472l.f13511l = Integer.valueOf(i & Alert.DURATION_SHOW_INDEFINITELY);
            C4536l c4536l = new C4536l(c6472l);
            C4816l c4816l = new C4816l(i2, z);
            c4816l.f9862l = c4536l;
            EnumC1150l.f3126l.execute(new RunnableC7706l(c4845lMopub, new C7847l(c4816l), c3823l.smaato() ? (String) c3823l.isPro() : C18318l.crashlytics.yandex(c4845lMopub.mopub)));
        }
        return vip(c3049l);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, defpackage.InterfaceC8544l
    @InterfaceC16020l(EnumC14812l.ON_DESTROY)
    public synchronized void close() {
        boolean z = true;
        if (this.f8116l.getAndSet(true)) {
            return;
        }
        this.f8114l.purchase();
        C1976l c1976l = this.f8115l;
        Executor executor = this.f8117l;
        boolean z2 = false;
        if (c1976l.loadAd.get() <= 0) {
            z = false;
        }
        AbstractC1051l.smaato(z);
        c1976l.yandex.Signature(new RunnableC16301l(c1976l, new C2350l(), z2, 13), executor);
    }

    public final synchronized C3823l vip(C3049l c3049l) {
        if (this.f8116l.get()) {
            return AbstractC4311l.billing(new C12397l("This detector is already closed!", 14));
        }
        if (c3049l.crashlytics < 32 || c3049l.amazon < 32) {
            return AbstractC4311l.billing(new C12397l("InputImage width and height should be at least 32!", 3));
        }
        return this.f8115l.yandex(this.f8117l, new CallableC14455l(this, c3049l, 0), (C5008l) this.f8114l.f4179l);
    }
}

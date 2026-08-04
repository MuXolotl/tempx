package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.usage.StorageStatsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.display.DisplayManager;
import android.media.AudioAttributes;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.text.StaticLayout;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.MenuItem;
import android.view.Surface;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.textclassifier.TextClassification;
import androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import j$.util.function.DoubleUnaryOperator$CC;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘۙۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5941l {
    public static Boolean loadAd;
    public static Context yandex;

    public static void Signature(NotificationChannel notificationChannel) {
        notificationChannel.enableVibration(false);
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public static void m1877abstract(NotificationChannel notificationChannel) {
        notificationChannel.setLightColor(0);
    }

    public static void ad(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i = configuration.colorMode & 3;
        int i2 = configuration2.colorMode & 3;
        if (i != i2) {
            configuration3.colorMode |= i2;
        }
        int i3 = configuration.colorMode & 12;
        int i4 = configuration2.colorMode & 12;
        if (i3 != i4) {
            configuration3.colorMode |= i4;
        }
    }

    public static Icon adcel(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static boolean admob(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }

    public static boolean ads(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
            return false;
        }
        for (int i : hdrCapabilities.getSupportedHdrTypes()) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    public static final int advert(Bitmap bitmap) {
        int i;
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                if (config == Bitmap.Config.ALPHA_8) {
                    i = 1;
                } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                    i = 2;
                } else {
                    i = (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8;
                }
                return height * i;
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static boolean amazon(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    public static PendingIntent applovin(Context context, Intent intent, int i) {
        return PendingIntent.getForegroundService(context, 0, intent, i);
    }

    public static PendingIntent appmetrica(Context context, Intent intent) {
        return PendingIntent.getForegroundService(context, 0, intent, 201326592);
    }

    public static boolean billing(Canvas canvas, int i, int i2, int i3, int i4) {
        return canvas.clipOutRect(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public static void m1878break(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public static void m1879case(ViewStructure viewStructure, int i) {
        viewStructure.setAutofillType(i);
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static void m1880catch(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public static void m1881class(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public static final Bitmap.Config m1882const(int i) {
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26 || i != 3) {
            return (i2 < 26 || i != 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.RGBA_F16;
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public static void m1883continue(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:27:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x0128  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:81:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0083 -> B:49:0x0120). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0090 -> B:49:0x0120). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a3 -> B:49:0x0120). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object crashlytics(java.lang.Object r17, defpackage.InterfaceC5059l r18, defpackage.C14187l r19, defpackage.InterfaceC1452l r20, defpackage.AbstractC0283l r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5941l.crashlytics(java.lang.Object, lٌٟؗ, lٖٓۚ, lٕؒۤ, lّؑۧ):java.lang.Object");
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static void m1884default(NotificationChannel notificationChannel) {
        notificationChannel.setGroup(null);
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public static void m1885else(ViewStructure viewStructure, AutofillId autofillId, int i) {
        viewStructure.setAutofillId(autofillId, i);
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static Intent m1886extends(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 2);
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public static void m1887final(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public static void m1888finally(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static Notification.Builder firebase(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static void m1889for(Context context, TextClassification textClassification) throws PendingIntent.CanceledException {
        String text = textClassification.getText();
        PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC5917l.m1869package(activity);
        } else {
            activity.send();
        }
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public static void m1890goto(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public static void m1891implements(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public static final void m1892import(StaticLayout.Builder builder, int i) {
        builder.setJustificationMode(i);
    }

    public static C8195l inmobi(Activity activity) {
        if (Build.VERSION.SDK_INT < 26) {
            return m1908synchronized(Environment.getDataDirectory().getPath());
        }
        StorageStatsManager storageStatsManager = (StorageStatsManager) activity.getSystemService(StorageStatsManager.class);
        if (storageStatsManager == null) {
            return m1908synchronized(Environment.getDataDirectory().getPath());
        }
        UUID uuid = StorageManager.UUID_DEFAULT;
        return new C8195l(Long.valueOf(storageStatsManager.getFreeBytes(uuid)), Long.valueOf(storageStatsManager.getTotalBytes(uuid)));
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public static void m1893instanceof(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public static void m1894interface(ViewStructure viewStructure, boolean z) {
        viewStructure.setDataIsSensitive(z);
    }

    public static final Bitmap isPro(int i, int i2, int i3, AbstractC11833l abstractC11833l) {
        ColorSpace rgb;
        ColorSpace rgb2;
        ColorSpace colorSpacePurchase;
        ColorSpace colorSpaceIsVip;
        ColorSpace colorSpace;
        Bitmap.Config configM1882const = m1882const(i3);
        if (AbstractC8576l.yandex(abstractC11833l, C3955l.purchase)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (AbstractC8576l.yandex(abstractC11833l, C3955l.adcel)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (AbstractC8576l.yandex(abstractC11833l, C3955l.ads)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (AbstractC8576l.yandex(abstractC11833l, C3955l.metrica)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (AbstractC8576l.yandex(abstractC11833l, C3955l.isPro)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (AbstractC8576l.yandex(abstractC11833l, C3955l.subs)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (AbstractC8576l.yandex(abstractC11833l, C3955l.tapsense)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (AbstractC8576l.yandex(abstractC11833l, C3955l.subscription)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (AbstractC8576l.yandex(abstractC11833l, C3955l.firebase)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (AbstractC8576l.yandex(abstractC11833l, C3955l.smaato)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (AbstractC8576l.yandex(abstractC11833l, C3955l.mopub)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (AbstractC8576l.yandex(abstractC11833l, C3955l.admob)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (AbstractC8576l.yandex(abstractC11833l, C3955l.billing)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (AbstractC8576l.yandex(abstractC11833l, C3955l.remoteconfig)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else {
            if (!AbstractC8576l.yandex(abstractC11833l, C3955l.startapp)) {
                if (AbstractC8576l.yandex(abstractC11833l, C3955l.vip)) {
                    colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
                } else {
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 34 && (colorSpaceIsVip = AbstractC5917l.isVip(abstractC11833l)) != null) {
                        rgb2 = colorSpaceIsVip;
                    } else if (i4 < 36 || (colorSpacePurchase = AbstractC12479l.purchase(abstractC11833l)) == null) {
                        if (abstractC11833l instanceof C0777l) {
                            String str = abstractC11833l.yandex;
                            C0777l c0777l = (C0777l) abstractC11833l;
                            float[] fArrYandex = c0777l.amazon.yandex();
                            C0411l c0411l = c0777l.mopub;
                            ColorSpace.Rgb.TransferParameters transferParameters = c0411l != null ? new ColorSpace.Rgb.TransferParameters(c0411l.loadAd, c0411l.crashlytics, c0411l.amazon, c0411l.purchase, c0411l.billing, c0411l.mopub, c0411l.yandex) : null;
                            float[] fArr = c0777l.subs;
                            final int i5 = 0;
                            if (transferParameters != null) {
                                ColorSpace.Rgb rgb3 = new ColorSpace.Rgb(str, c0777l.admob, fArrYandex, transferParameters);
                                if (Float.isNaN(fArr[0]) || Arrays.equals(rgb3.getTransform(), fArr)) {
                                    rgb2 = rgb3;
                                } else {
                                    rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                                }
                            } else {
                                float[] fArr2 = c0777l.admob;
                                final C7982l c7982l = c0777l.smaato;
                                DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: lۣؗۘ
                                    public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator2) {
                                        int i6 = i5;
                                        return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator2);
                                    }

                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final double applyAsDouble(double d) {
                                        int i6 = i5;
                                        Function1 function1 = c7982l;
                                        switch (i6) {
                                            case 0:
                                                break;
                                        }
                                        return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
                                    }

                                    public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator2) {
                                        int i6 = i5;
                                        return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator2);
                                    }
                                };
                                final C7982l c7982l2 = c0777l.metrica;
                                final int i6 = 1;
                                rgb2 = new ColorSpace.Rgb(str, fArr2, fArrYandex, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: lۣؗۘ
                                    public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator2) {
                                        int i7 = i6;
                                        return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator2);
                                    }

                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final double applyAsDouble(double d) {
                                        int i7 = i6;
                                        Function1 function1 = c7982l2;
                                        switch (i7) {
                                            case 0:
                                                break;
                                        }
                                        return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
                                    }

                                    public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator2) {
                                        int i7 = i6;
                                        return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator2);
                                    }
                                }, c0777l.purchase, c0777l.billing);
                            }
                        } else {
                            configM1882const = configM1882const;
                            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                        }
                        rgb2 = rgb;
                    } else {
                        rgb2 = colorSpacePurchase;
                    }
                    configM1882const = configM1882const;
                }
                return Bitmap.createBitmap((DisplayMetrics) null, i, i2, configM1882const, true, rgb2);
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        rgb2 = colorSpace;
        configM1882const = configM1882const;
        return Bitmap.createBitmap((DisplayMetrics) null, i, i2, configM1882const, true, rgb2);
    }

    public static AutofillValue isVip(String str) {
        return AutofillValue.forText(AbstractC11141l.subs(str));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x020a A[Catch: NoSuchMethodError -> 0x0270, TryCatch #2 {NoSuchMethodError -> 0x0270, blocks: (B:100:0x0202, B:102:0x020a, B:104:0x0211, B:106:0x0215, B:112:0x0224, B:114:0x0238, B:115:0x0253, B:109:0x021e, B:116:0x0254, B:117:0x026f), top: B:185:0x0202 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0211 A[Catch: NoSuchMethodError -> 0x0270, TryCatch #2 {NoSuchMethodError -> 0x0270, blocks: (B:100:0x0202, B:102:0x020a, B:104:0x0211, B:106:0x0215, B:112:0x0224, B:114:0x0238, B:115:0x0253, B:109:0x021e, B:116:0x0254, B:117:0x026f), top: B:185:0x0202 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0215 A[Catch: NoSuchMethodError -> 0x0270, TryCatch #2 {NoSuchMethodError -> 0x0270, blocks: (B:100:0x0202, B:102:0x020a, B:104:0x0211, B:106:0x0215, B:112:0x0224, B:114:0x0238, B:115:0x0253, B:109:0x021e, B:116:0x0254, B:117:0x026f), top: B:185:0x0202 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x021e A[Catch: NoSuchMethodError -> 0x0270, LOOP:5: B:105:0x0213->B:109:0x021e, LOOP_END, TryCatch #2 {NoSuchMethodError -> 0x0270, blocks: (B:100:0x0202, B:102:0x020a, B:104:0x0211, B:106:0x0215, B:112:0x0224, B:114:0x0238, B:115:0x0253, B:109:0x021e, B:116:0x0254, B:117:0x026f), top: B:185:0x0202 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0224 A[Catch: NoSuchMethodError -> 0x0270, TryCatch #2 {NoSuchMethodError -> 0x0270, blocks: (B:100:0x0202, B:102:0x020a, B:104:0x0211, B:106:0x0215, B:112:0x0224, B:114:0x0238, B:115:0x0253, B:109:0x021e, B:116:0x0254, B:117:0x026f), top: B:185:0x0202 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0238 A[Catch: NoSuchMethodError -> 0x0270, TryCatch #2 {NoSuchMethodError -> 0x0270, blocks: (B:100:0x0202, B:102:0x020a, B:104:0x0211, B:106:0x0215, B:112:0x0224, B:114:0x0238, B:115:0x0253, B:109:0x021e, B:116:0x0254, B:117:0x026f), top: B:185:0x0202 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0254 A[Catch: NoSuchMethodError -> 0x0270, TryCatch #2 {NoSuchMethodError -> 0x0270, blocks: (B:100:0x0202, B:102:0x020a, B:104:0x0211, B:106:0x0215, B:112:0x0224, B:114:0x0238, B:115:0x0253, B:109:0x021e, B:116:0x0254, B:117:0x026f), top: B:185:0x0202 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0282  */
    /* JADX WARN: Code duplicated, block: B:125:0x0285  */
    /* JADX WARN: Code duplicated, block: B:126:0x028c  */
    /* JADX WARN: Code duplicated, block: B:128:0x028f  */
    /* JADX WARN: Code duplicated, block: B:131:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:138:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:140:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:141:0x02da  */
    /* JADX WARN: Code duplicated, block: B:144:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:149:0x0303  */
    /* JADX WARN: Code duplicated, block: B:152:0x030d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0334  */
    /* JADX WARN: Code duplicated, block: B:165:0x033c A[PHI: r0 r1 r2 r3 r5 r6 r8
  0x033c: PHI (r0v13 int) = (r0v5 int), (r0v16 int) binds: [B:163:0x0339, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x033c: PHI (r1v5 lٖٓۚ) = (r1v0 lٖٓۚ), (r1v7 lٖٓۚ) binds: [B:163:0x0339, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x033c: PHI (r2v1 lٕؒۤ) = (r2v0 lٕؒۤ), (r2v3 lٕؒۤ) binds: [B:163:0x0339, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x033c: PHI (r3v6 int) = (r3v4 int), (r3v7 int) binds: [B:163:0x0339, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x033c: PHI (r5v13 java.lang.Object) = (r5v9 java.lang.Object), (r5v15 java.lang.Object) binds: [B:163:0x0339, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x033c: PHI (r6v21 lٌٟؗ) = (r6v11 lٌٟؗ), (r6v22 lٌٟؗ) binds: [B:163:0x0339, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x033c: PHI (r8v36 ??) = (r8v10 ??), (r8v37 ??) binds: [B:163:0x0339, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:170:0x0353  */
    /* JADX WARN: Code duplicated, block: B:172:0x035b  */
    /* JADX WARN: Code duplicated, block: B:174:0x0367  */
    /* JADX WARN: Code duplicated, block: B:204:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x021d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x032a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x0307 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0174  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x034d, code lost:
    
        if (crashlytics(r5, r6, r1, r2, r4) == r10) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01fb, code lost:
    
        if (crashlytics(r0, r6, r1, r2, r4) == r10) goto L167;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:114:0x0238, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:116:0x0254, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, lٕؒۤ, lٖٓۚ] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v36, types: [lٕؒۤ, lٌٟؗ, lٖٓۚ] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object license(java.lang.ClassLoader r19, java.lang.String r20, defpackage.C14187l r21, defpackage.InterfaceC1452l r22, defpackage.AbstractC0283l r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 907
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5941l.license(java.lang.ClassLoader, java.lang.String, lٖٓۚ, lٕؒۤ, lّؑۧ):java.lang.Object");
    }

    public static final Bitmap loadAd(C14115l c14115l) {
        if (c14115l instanceof C14115l) {
            return c14115l.yandex;
        }
        C10754l.ads("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public static final void m1895l(Image.Plane plane, int i, int i2, byte[] bArr, int i3, int i4) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i5 = i / (i2 / rowStride);
        int rowStride2 = 0;
        for (int i6 = 0; i6 < rowStride; i6++) {
            int pixelStride = rowStride2;
            for (int i7 = 0; i7 < i5; i7++) {
                bArr[i3] = buffer.get(pixelStride);
                i3 += i4;
                pixelStride += plane.getPixelStride();
            }
            rowStride2 += plane.getRowStride();
        }
    }

    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public static final void m1896l(C10685l c10685l, C14180l c14180l) {
        C5104l c5104l = (C5104l) c10685l.f21690l;
        if (((ImageCapturePixelHDRPlusQuirk) AbstractC17919l.yandex(ImageCapturePixelHDRPlusQuirk.class)) == null) {
            return;
        }
        C6916l c6916l = C14180l.f27767l;
        if (((C7420l) c14180l.subs()).mo861strictfp(c6916l)) {
            int iIntValue = ((Integer) c14180l.f27773l.adcel(c6916l)).intValue();
            if (iIntValue == 0) {
                CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                c5104l.mopub(AbstractC5641l.billing(key), Boolean.TRUE);
            } else {
                if (iIntValue != 1) {
                    return;
                }
                CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                c5104l.mopub(AbstractC5641l.billing(key2), Boolean.FALSE);
            }
        }
    }

    public static void metrica(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static boolean mopub(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static final void m1897native(C5265l c5265l, SparseArray sparseArray) {
        C6556l c6556l = c5265l.loadAd;
        if (c6556l.yandex.isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValueMopub = C14377l.mopub(sparseArray.get(iKeyAt));
            if (autofillValueMopub.isText()) {
                autofillValueMopub.getTextValue().toString();
                if (c6556l.yandex.get(Integer.valueOf(iKeyAt)) != null) {
                    C18725l.loadAd();
                    return;
                }
            } else {
                if (autofillValueMopub.isDate()) {
                    throw new C13165l("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (autofillValueMopub.isList()) {
                    throw new C13165l("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (autofillValueMopub.isToggle()) {
                    throw new C13165l("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static void m1898new(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static synchronized boolean m1899package(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = yandex;
        if (context2 != null && (bool = loadAd) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        loadAd = null;
        if (AbstractC12300l.subs()) {
            loadAd = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                loadAd = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                loadAd = Boolean.FALSE;
            }
        }
        yandex = applicationContext;
        return loadAd.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    public static C8195l premium(Activity activity, String str) {
        UUID uuidFromString;
        List<StorageVolume> storageVolumes;
        Object next;
        String uuid;
        if (Build.VERSION.SDK_INT < 26) {
            return m1908synchronized(str);
        }
        try {
            StorageManager storageManager = (StorageManager) activity.getSystemService(StorageManager.class);
            if (storageManager == null || (storageVolumes = storageManager.getStorageVolumes()) == null) {
                uuidFromString = null;
            } else {
                Iterator<T> it = storageVolumes.iterator();
                do {
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    next = it.next();
                } while (((StorageVolume) next).isPrimary());
                StorageVolume storageVolume = (StorageVolume) next;
                if (storageVolume == null || (uuid = storageVolume.getUuid()) == null) {
                    uuidFromString = null;
                } else {
                    uuidFromString = (uuid.length() == 9 && uuid.charAt(4) == '-') ? UUID.fromString("fafafafa-fafa-5afa-8afa-fafa".concat(AbstractC16648l.advert(uuid, "-", "", false))) : UUID.fromString(uuid);
                }
            }
            StorageStatsManager storageStatsManager = (StorageStatsManager) activity.getSystemService(StorageStatsManager.class);
            if (storageStatsManager != null) {
                return uuidFromString != null ? new C8195l(Long.valueOf(storageStatsManager.getFreeBytes(uuidFromString)), Long.valueOf(storageStatsManager.getTotalBytes(uuidFromString))) : m1908synchronized(str);
            }
            return m1908synchronized(str);
        } catch (Exception unused) {
            return m1908synchronized(str);
        }
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static Intent m1900private(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
    }

    public static final void pro(CameraCaptureSession cameraCaptureSession, ArrayList arrayList) throws CameraAccessException {
        cameraCaptureSession.finalizeOutputConfigurations(arrayList);
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public static void m1901protected(NotificationChannel notificationChannel) {
        notificationChannel.setVibrationPattern(null);
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public static void m1902public(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static boolean purchase(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.clipOutRect(f, f2, f3, f4);
    }

    public static final C5828l remoteconfig(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new C5828l(AutofillValue.forText(AbstractC11141l.subs(charSequence)));
        }
        return null;
    }

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public static final int m1903return(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || config != Bitmap.Config.RGBA_F16) {
            return (i < 26 || config != Bitmap.Config.HARDWARE) ? 0 : 4;
        }
        return 3;
    }

    public static AutofillValue signatures(boolean z) {
        return AutofillValue.forToggle(z);
    }

    public static final C5828l smaato(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new C5828l(AutofillValue.forToggle(z));
        }
        return null;
    }

    public static void startapp(Context context, String str, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            notificationManager.getClass();
            NotificationChannel notificationChannel = new NotificationChannel(str, context.getString(i), 2);
            if (i2 != 0) {
                notificationChannel.setDescription(context.getString(i2));
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public static void m1904static(NotificationChannel notificationChannel, String str) {
        notificationChannel.setDescription(str);
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static void m1905strictfp(File file, File file2) throws IOException {
        java.nio.file.Path path = file.toPath();
        java.nio.file.Path path2 = file2.toPath();
        try {
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (AtomicMoveNotSupportedException e) {
            try {
                Files.move(path, path2, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e2) {
                AbstractC11718l.yandex(e2, e);
                throw e2;
            }
        } catch (FileAlreadyExistsException e3) {
            try {
                Files.move(path, path2, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e4) {
                AbstractC11718l.yandex(e4, e3);
                throw e4;
            }
        }
    }

    public static ByteBuffer subs(C3049l c3049l) throws C12397l {
        int i = c3049l.billing;
        int i2 = 0;
        if (i != -1) {
            if (i == 17) {
                AbstractC1051l.subs(null);
                throw null;
            }
            if (i != 35) {
                if (i != 842094169) {
                    throw new C12397l("Unsupported image format", 13);
                }
                AbstractC1051l.subs(null);
                throw null;
            }
            Image.Plane[] planeArrYandex = c3049l.yandex();
            AbstractC1051l.subs(planeArrYandex);
            int i3 = c3049l.crashlytics;
            int i4 = c3049l.amazon;
            int i5 = i3 * i4;
            int i6 = i5 / 4;
            byte[] bArr = new byte[i6 + i6 + i5];
            ByteBuffer buffer = planeArrYandex[1].getBuffer();
            ByteBuffer buffer2 = planeArrYandex[2].getBuffer();
            int iPosition = buffer2.position();
            int iLimit = buffer.limit();
            buffer2.position(iPosition + 1);
            buffer.limit(iLimit - 1);
            int i7 = (i5 + i5) / 4;
            boolean z = buffer2.remaining() == i7 + (-2) && buffer2.compareTo(buffer) == 0;
            buffer2.position(iPosition);
            buffer.limit(iLimit);
            if (z) {
                planeArrYandex[0].getBuffer().get(bArr, 0, i5);
                ByteBuffer buffer3 = planeArrYandex[1].getBuffer();
                planeArrYandex[2].getBuffer().get(bArr, i5, 1);
                buffer3.get(bArr, i5 + 1, i7 - 1);
            } else {
                m1895l(planeArrYandex[0], i3, i4, bArr, 0, 1);
                m1895l(planeArrYandex[1], i3, i4, bArr, i5 + 1, 2);
                m1895l(planeArrYandex[2], i3, i4, bArr, i5, 2);
            }
            return ByteBuffer.wrap(bArr);
        }
        Bitmap bitmapCopy = c3049l.yandex;
        AbstractC1051l.subs(bitmapCopy);
        if (Build.VERSION.SDK_INT >= 26 && bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
        }
        Bitmap bitmap = bitmapCopy;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i8 = width * height;
        int[] iArr = new int[i8];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(((double) height) / 2.0d);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((iCeil + iCeil) * ((int) Math.ceil(((double) width) / 2.0d))) + i8);
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < height) {
            int i12 = i2;
            while (i12 < width) {
                int i13 = iArr[i11];
                int i14 = i13 >> 16;
                int i15 = i13 >> 8;
                int i16 = i13 & 255;
                int i17 = i10 + 1;
                int i18 = i14 & 255;
                int i19 = i15 & 255;
                byteBufferAllocateDirect.put(i10, (byte) Math.min(255, ((((i16 * 25) + ((i19 * 129) + (i18 * 66))) + 128) >> 8) + 16));
                if (i9 % 2 == 0 && i11 % 2 == 0) {
                    int i20 = ((((i18 * 112) - (i19 * 94)) - (i16 * 18)) + 128) >> 8;
                    int i21 = (((((i18 * (-38)) - (i19 * 74)) + (i16 * 112)) + 128) >> 8) + 128;
                    int i22 = i8 + 1;
                    byteBufferAllocateDirect.put(i8, (byte) Math.min(255, i20 + 128));
                    i8 += 2;
                    byteBufferAllocateDirect.put(i22, (byte) Math.min(255, i21));
                }
                i11++;
                i12++;
                i10 = i17;
            }
            i9++;
            i2 = 0;
        }
        return byteBufferAllocateDirect;
    }

    public static void subscription(NotificationChannel notificationChannel) {
        notificationChannel.enableLights(false);
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public static void m1906super(ViewStructure viewStructure) {
        viewStructure.setInputType(129);
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public static void m1907switch(ViewStructure viewStructure, AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static C8195l m1908synchronized(String str) {
        StatFs statFs = new StatFs(str);
        return new C8195l(Long.valueOf(statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()), Long.valueOf(statFs.getBlockSizeLong() * statFs.getBlockCountLong()));
    }

    public static final void tapsense(OutputConfiguration outputConfiguration) {
        outputConfiguration.enableSurfaceSharing();
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public static void m1909this(NotificationChannel notificationChannel, boolean z) {
        notificationChannel.setShowBadge(z);
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public static void m1910throw(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static final boolean m1911throws(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public static void m1912transient(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public static void m1913try(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
        notificationChannel.setSound(uri, audioAttributes);
    }

    public static NotificationChannel vip(CharSequence charSequence, String str) {
        return new NotificationChannel(str, charSequence, 4);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static final void m1914volatile(C5809l c5809l, C11561l c11561l) {
        Iterator it = ((List) c11561l.yandex).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(c5809l);
        }
    }

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public static void m1915while(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    public static final void yandex(OutputConfiguration outputConfiguration, Surface surface) {
        outputConfiguration.addSurface(surface);
    }
}

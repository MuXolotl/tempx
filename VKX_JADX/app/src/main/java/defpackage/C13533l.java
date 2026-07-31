package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lْٝٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13533l implements InterfaceC3773l {
    public final C7455l amazon;
    public final C16628l crashlytics;
    public final C15106l loadAd;
    public final InterfaceC7204l yandex;

    public C13533l(InterfaceC7204l interfaceC7204l, C15106l c15106l, C16628l c16628l, C7455l c7455l) {
        this.yandex = interfaceC7204l;
        this.loadAd = c15106l;
        this.crashlytics = c16628l;
        this.amazon = c7455l;
    }

    public static C9969l loadAd(C13533l c13533l) throws Exception {
        C4091l c4091l;
        boolean z;
        int i;
        Bitmap bitmapCreateBitmap;
        int i2;
        int iMin;
        double dMax;
        int i3;
        BitmapFactory.Options options = new BitmapFactory.Options();
        C15106l c15106l = c13533l.loadAd;
        C17065l c17065l = new C17065l(c13533l.yandex.mo2151l());
        C1503l c1503l = new C1503l(c17065l);
        options.inJustDecodeBounds = true;
        int i4 = 4;
        BitmapFactory.decodeStream(new C11270l(i4, c1503l.peek()), null, options);
        Exception exc = c17065l.f33220l;
        if (exc != null) {
            throw exc;
        }
        options.inJustDecodeBounds = false;
        Paint paint = AbstractC12368l.yandex;
        String str = options.outMimeType;
        c13533l.amazon.getClass();
        if (str != null && (str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif"))) {
            C17769l c17769l = new C17769l(new C3157l(new C11270l(i4, c1503l.peek())));
            int iCrashlytics = c17769l.crashlytics(1, "Orientation");
            boolean z2 = iCrashlytics == 2 || iCrashlytics == 7 || iCrashlytics == 4 || iCrashlytics == 5;
            switch (c17769l.crashlytics(1, "Orientation")) {
                case 3:
                case 4:
                    i3 = 180;
                    break;
                case 5:
                case 8:
                    i3 = 270;
                    break;
                case 6:
                case 7:
                    i3 = 90;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            c4091l = new C4091l(z2, i3);
        } else {
            c4091l = C4091l.crashlytics;
        }
        int i5 = c4091l.loadAd;
        boolean z3 = c4091l.yandex;
        Exception exc2 = c17065l.f33220l;
        if (exc2 != null) {
            throw exc2;
        }
        options.inMutable = false;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26 && AbstractC10413l.crashlytics(c15106l) != null) {
            options.inPreferredColorSpace = (ColorSpace) AbstractC0532l.amazon(c15106l, AbstractC10413l.crashlytics);
        }
        boolean zBooleanValue = ((Boolean) AbstractC0532l.amazon(c15106l, AbstractC10413l.amazon)).booleanValue();
        Context context = c15106l.yandex;
        options.inPremultiplied = zBooleanValue;
        Bitmap.Config config = (Bitmap.Config) AbstractC0532l.amazon(c15106l, AbstractC10413l.loadAd);
        if ((z3 || i5 > 0) && (config == null || AbstractC5941l.m1911throws(config))) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (((Boolean) AbstractC0532l.amazon(c15106l, AbstractC10413l.mopub)).booleanValue() && config == Bitmap.Config.ARGB_8888 && AbstractC8576l.yandex(options.outMimeType, "image/jpeg")) {
            config = Bitmap.Config.RGB_565;
        }
        if (i6 >= 26) {
            Bitmap.Config config2 = options.outConfig;
            Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
            if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                config = config3;
            }
        }
        options.inPreferredConfig = config;
        int i7 = options.outWidth;
        if (i7 <= 0 || (i2 = options.outHeight) <= 0) {
            options.inSampleSize = 1;
            z = false;
            options.inScaled = false;
        } else {
            int i8 = (i5 == 90 || i5 == 270) ? i2 : i7;
            if (i5 != 90 && i5 != 270) {
                i7 = i2;
            }
            C9192l c9192l = c15106l.loadAd;
            int i9 = c15106l.crashlytics;
            C16543l c16543l = AbstractC12872l.loadAd;
            long jCrashlytics = AbstractC3105l.crashlytics(i8, i7, c9192l, i9, (C9192l) AbstractC0532l.amazon(c15106l, c16543l));
            int i10 = (int) (jCrashlytics >> 32);
            int i11 = (int) (jCrashlytics & 4294967295L);
            int iHighestOneBit = Integer.highestOneBit(i8 / i10);
            int iHighestOneBit2 = Integer.highestOneBit(i7 / i11);
            context = context;
            int iInmobi = AbstractC5020l.inmobi(i9);
            if (iInmobi == 0) {
                iMin = Math.min(iHighestOneBit, iHighestOneBit2);
            } else {
                if (iInmobi != 1) {
                    C18725l.billing();
                    return r6;
                }
                iMin = Math.max(iHighestOneBit, iHighestOneBit2);
            }
            if (iMin < 1) {
                iMin = 1;
            }
            options.inSampleSize = iMin;
            i5 = i5;
            double d = iMin;
            double d2 = ((double) i8) / d;
            double d3 = ((double) i7) / d;
            C9192l c9192l2 = (C9192l) AbstractC0532l.amazon(c15106l, c16543l);
            double d4 = ((double) i10) / d2;
            double d5 = ((double) i11) / d3;
            int iInmobi2 = AbstractC5020l.inmobi(i9);
            if (iInmobi2 == 0) {
                dMax = Math.max(d4, d5);
            } else {
                if (iInmobi2 != 1) {
                    C18725l.billing();
                    return r6;
                }
                dMax = Math.min(d4, d5);
            }
            InterfaceC18382l interfaceC18382l = c9192l2.yandex;
            if (interfaceC18382l instanceof C12881l) {
                double d6 = ((double) ((C12881l) interfaceC18382l).yandex) / d2;
                if (dMax > d6) {
                    dMax = d6;
                }
            }
            InterfaceC18382l interfaceC18382l2 = c9192l2.loadAd;
            if (interfaceC18382l2 instanceof C12881l) {
                double d7 = ((double) ((C12881l) interfaceC18382l2).yandex) / d3;
                if (dMax > d7) {
                    dMax = d7;
                }
            }
            if (c15106l.amazon == 2 && dMax > 1.0d) {
                dMax = 1.0d;
            }
            boolean z4 = dMax == 1.0d;
            options.inScaled = !z4;
            if (!z4) {
                if (dMax > 1.0d) {
                    options.inDensity = AbstractC5573l.adcel(2.147483647E9d / dMax);
                    options.inTargetDensity = Alert.DURATION_SHOW_INDEFINITELY;
                } else {
                    options.inDensity = Alert.DURATION_SHOW_INDEFINITELY;
                    options.inTargetDensity = AbstractC5573l.adcel(2.147483647E9d * dMax);
                }
            }
            z = false;
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new C11270l(4, c1503l), null, options);
            c1503l.close();
            Exception exc3 = c17065l.f33220l;
            if (exc3 != null) {
                throw exc3;
            }
            if (bitmapDecodeStream == null) {
                C8339l.smaato("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                return null;
            }
            bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
            if (z3 || i5 > 0) {
                Matrix matrix = new Matrix();
                float width = bitmapDecodeStream.getWidth() / 2.0f;
                float height = bitmapDecodeStream.getHeight() / 2.0f;
                if (z3) {
                    matrix.postScale(-1.0f, 1.0f, width, height);
                }
                if (i5 > 0) {
                    i = i5;
                    matrix.postRotate(i, width, height);
                } else {
                    i = i5;
                }
                RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                matrix.mapRect(rectF);
                float f = rectF.left;
                if (f != 0.0f || rectF.top != 0.0f) {
                    matrix.postTranslate(-f, -rectF.top);
                }
                if (i == 90 || i == 270) {
                    int height2 = bitmapDecodeStream.getHeight();
                    int width2 = bitmapDecodeStream.getWidth();
                    Bitmap.Config config4 = bitmapDecodeStream.getConfig();
                    if (config4 == null) {
                        config4 = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                } else {
                    int width3 = bitmapDecodeStream.getWidth();
                    int height3 = bitmapDecodeStream.getHeight();
                    Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                    if (config5 == null) {
                        config5 = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config5);
                }
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, AbstractC12368l.yandex);
                bitmapDecodeStream.recycle();
                bitmapDecodeStream = bitmapCreateBitmap;
            }
            return new C9969l(AbstractC3230l.crashlytics(new BitmapDrawable(context.getResources(), bitmapDecodeStream)), (options.inSampleSize > 1 || options.inScaled) ? true : z);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC7876l.loadAd(c1503l, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC3773l
    public final Object yandex(InterfaceC14029l interfaceC14029l) throws Throwable {
        C13111l c13111l;
        C16628l c16628l;
        Throwable th;
        C16628l c16628l2;
        if (interfaceC14029l instanceof C13111l) {
            c13111l = (C13111l) interfaceC14029l;
            int i = c13111l.f25639l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c13111l.f25639l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c13111l = new C13111l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c13111l = new C13111l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object obj = c13111l.f25640l;
        int i2 = c13111l.f25639l;
        InterfaceC14029l interfaceC14029l2 = null;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                c16628l = this.crashlytics;
                c13111l.f25641l = c16628l;
                c13111l.f25639l = 1;
                if (c16628l.loadAd(c13111l) != enumC9342l) {
                }
                return enumC9342l;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c16628l2 = c13111l.f25641l;
                try {
                    AbstractC2829l.crashlytics(obj);
                    C9969l c9969l = (C9969l) obj;
                    c16628l2.amazon();
                    return c9969l;
                } catch (Throwable th2) {
                    th = th2;
                    c16628l2.amazon();
                    throw th;
                }
            }
            C16628l c16628l3 = c13111l.f25641l;
            AbstractC2829l.crashlytics(obj);
            c16628l = c16628l3;
            C9636l c9636l = new C9636l(22, this);
            c13111l.f25641l = c16628l;
            c13111l.f25639l = 2;
            Object objFirebase = AbstractC10999l.firebase(C17218l.f33421l, new C13624l(c9636l, interfaceC14029l2, 24), c13111l);
            if (objFirebase != enumC9342l) {
                C16628l c16628l4 = c16628l;
                obj = objFirebase;
                c16628l2 = c16628l4;
                C9969l c9969l2 = (C9969l) obj;
                c16628l2.amazon();
                return c9969l2;
            }
            return enumC9342l;
        } catch (Throwable th3) {
            C16628l c16628l5 = c16628l;
            th = th3;
            c16628l2 = c16628l5;
            c16628l2.amazon();
            throw th;
        }
    }
}

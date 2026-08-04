package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.Image;
import android.os.Parcel;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.MultiScaleDecodingOptions;
import com.google.android.libraries.barhopper.MultiScaleDetectionOptions;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lُۣۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC11439l extends AbstractBinderC17401l implements InterfaceC13688l {
    public static final int[] admob = {5, 7, 7, 7, 5, 5};
    public static final double[][] subs = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};
    public final C15194l billing;
    public BarhopperV3 mopub;
    public final Context purchase;

    public BinderC11439l(Context context, C15194l c15194l) {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
        this.purchase = context;
        this.billing = c15194l;
    }

    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public static C16674l m3087l(C4235l c4235l, String str, String str2) {
        if (c4235l == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return new C16674l(c4235l.subscription(), c4235l.adcel(), c4235l.vip(), c4235l.metrica(), c4235l.startapp(), c4235l.ads(), c4235l.Signature(), matcher.find() ? matcher.group(1) : null);
    }

    @Override // defpackage.AbstractBinderC17401l
    public final boolean crashlytics(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            isPro();
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            BarhopperV3 barhopperV3 = this.mopub;
            if (barhopperV3 != null) {
                barhopperV3.close();
                this.mopub = null;
            }
            parcel2.writeNoException();
            return true;
        }
        C15194l c15194l = this.billing;
        if (i == 3) {
            InterfaceC3396l interfaceC3396lM3896l = BinderC14844l.m3896l(parcel.readStrongBinder());
            C13173l c13173l = (C13173l) AbstractC12343l.yandex(parcel, C13173l.CREATOR);
            AbstractC12343l.loadAd(parcel);
            RecognitionOptions recognitionOptions = new RecognitionOptions();
            recognitionOptions.yandex(c15194l.f29790l);
            recognitionOptions.billing(c15194l.f29789l);
            recognitionOptions.loadAd();
            recognitionOptions.crashlytics();
            ArrayList arrayListM3088l = m3088l(interfaceC3396lM3896l, c13173l, recognitionOptions);
            parcel2.writeNoException();
            parcel2.writeTypedList(arrayListM3088l);
            return true;
        }
        if (i != 4) {
            if (i != 5) {
                return false;
            }
            AbstractC12343l.loadAd(parcel);
            isPro();
            parcel2.writeNoException();
            return true;
        }
        InterfaceC3396l interfaceC3396lM3896l2 = BinderC14844l.m3896l(parcel.readStrongBinder());
        C13173l c13173l2 = (C13173l) AbstractC12343l.yandex(parcel, C13173l.CREATOR);
        C17840l c17840l = (C17840l) AbstractC12343l.yandex(parcel, C17840l.CREATOR);
        AbstractC12343l.loadAd(parcel);
        RecognitionOptions recognitionOptions2 = new RecognitionOptions();
        recognitionOptions2.yandex(c15194l.f29790l);
        recognitionOptions2.billing(c15194l.f29789l);
        recognitionOptions2.loadAd();
        recognitionOptions2.crashlytics();
        MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();
        multiScaleDecodingOptions.yandex(c17840l.f34769l.f7299l);
        C3434l c3434l = c17840l.f34769l;
        multiScaleDecodingOptions.loadAd(c3434l.f7298l);
        multiScaleDecodingOptions.crashlytics(c3434l.f7297l);
        recognitionOptions2.amazon(multiScaleDecodingOptions);
        MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();
        multiScaleDetectionOptions.yandex(c3434l.f7299l);
        recognitionOptions2.purchase(multiScaleDetectionOptions);
        recognitionOptions2.mopub(c17840l.f34767l);
        ArrayList arrayListM3088l2 = m3088l(interfaceC3396lM3896l2, c13173l2, recognitionOptions2);
        parcel2.writeNoException();
        parcel2.writeTypedList(arrayListM3088l2);
        return true;
    }

    public final void isPro() {
        Context context = this.purchase;
        if (this.mopub != null) {
            return;
        }
        BarhopperV3 barhopperV3 = new BarhopperV3();
        System.loadLibrary("barhopper_v3");
        this.mopub = barhopperV3;
        C5369l c5369lVip = C18366l.vip();
        C0886l c0886lVip = C1287l.vip();
        int i = 16;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            C12139l c12139lVip = C17434l.vip();
            c12139lVip.purchase();
            C17434l.ads((C17434l) c12139lVip.f16649l, i);
            c12139lVip.purchase();
            C17434l.metrica((C17434l) c12139lVip.f16649l, i);
            for (int i4 = 0; i4 < admob[i3]; i4++) {
                double[] dArr = subs[i2];
                double d = dArr[0] * 320.0d;
                float fSqrt = (float) Math.sqrt(dArr[1]);
                float f = (float) d;
                c12139lVip.purchase();
                C17434l.startapp((C17434l) c12139lVip.f16649l, f / fSqrt);
                c12139lVip.purchase();
                C17434l.adcel((C17434l) c12139lVip.f16649l, f * fSqrt);
                i2++;
            }
            i += i;
            c0886lVip.purchase();
            C1287l.metrica((C1287l) c0886lVip.f16649l, (C17434l) c12139lVip.loadAd());
        }
        c5369lVip.purchase();
        C18366l.metrica((C18366l) c5369lVip.f16649l, (C1287l) c0886lVip.loadAd());
        try {
            InputStream inputStreamOpen = context.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
            try {
                InputStream inputStreamOpen2 = context.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                try {
                    InputStream inputStreamOpen3 = context.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                    try {
                        BarhopperV3 barhopperV4 = this.mopub;
                        AbstractC1051l.subs(barhopperV4);
                        C0470l c0470lVip = C1302l.vip();
                        AbstractC1096l abstractC1096lSignatures = AbstractC1096l.signatures(inputStreamOpen);
                        c5369lVip.purchase();
                        C18366l.startapp((C18366l) c5369lVip.f16649l, abstractC1096lSignatures);
                        c0470lVip.purchase();
                        C1302l.metrica((C1302l) c0470lVip.f16649l, (C18366l) c5369lVip.loadAd());
                        C7826l c7826lVip = C4203l.vip();
                        AbstractC1096l abstractC1096lSignatures2 = AbstractC1096l.signatures(inputStreamOpen2);
                        c7826lVip.purchase();
                        C4203l.startapp((C4203l) c7826lVip.f16649l, abstractC1096lSignatures2);
                        AbstractC1096l abstractC1096lSignatures3 = AbstractC1096l.signatures(inputStreamOpen3);
                        c7826lVip.purchase();
                        C4203l.metrica((C4203l) c7826lVip.f16649l, abstractC1096lSignatures3);
                        c0470lVip.purchase();
                        C1302l.startapp((C1302l) c0470lVip.f16649l, (C4203l) c7826lVip.loadAd());
                        barhopperV4.yandex((C1302l) c0470lVip.loadAd());
                        if (inputStreamOpen3 != null) {
                            inputStreamOpen3.close();
                        }
                        if (inputStreamOpen2 != null) {
                            inputStreamOpen2.close();
                        }
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                    } catch (Throwable th) {
                        if (inputStreamOpen3 != null) {
                            try {
                                inputStreamOpen3.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    if (inputStreamOpen2 != null) {
                        try {
                            inputStreamOpen2.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        } catch (IOException e) {
            C4875l.remoteconfig("Failed to open Barcode models", e);
        }
    }

    /* JADX INFO: renamed from: lٕؓۡ, reason: contains not printable characters */
    public final ArrayList m3088l(InterfaceC3396l interfaceC3396l, C13173l c13173l, RecognitionOptions recognitionOptions) {
        C13503l c13503lVip;
        Matrix matrix;
        C13115l c13115l;
        C9652l c9652l;
        C11703l c11703l;
        C0008l c0008l;
        C12330l c12330l;
        C17247l c17247l;
        C16051l c16051l;
        C15996l c15996l;
        C8894l c8894l;
        int i;
        int i2;
        String strTapsense;
        byte[] bArr;
        Point[] pointArr;
        int i3;
        C9652l[] c9652lArr;
        C13115l[] c13115lArr;
        C18504l[] c18504lArr;
        String strTapsense2;
        String strTapsense3;
        int i4 = c13173l.f25782l;
        int i5 = c13173l.f25784l;
        AbstractC15603l abstractC15603l = null;
        int i6 = -1;
        if (i4 == -1) {
            BarhopperV3 barhopperV3 = this.mopub;
            AbstractC1051l.subs(barhopperV3);
            c13503lVip = barhopperV3.vip((Bitmap) BinderC14844l.m3897l(interfaceC3396l), recognitionOptions);
        } else if (i4 == 17) {
            c13503lVip = m3089l((ByteBuffer) BinderC14844l.m3897l(interfaceC3396l), c13173l, recognitionOptions);
        } else if (i4 != 35) {
            if (i4 != 842094169) {
                C8339l.metrica(AbstractC0653l.vip(i4, "Unsupported image format: "));
                return null;
            }
            c13503lVip = m3089l((ByteBuffer) BinderC14844l.m3897l(interfaceC3396l), c13173l, recognitionOptions);
        } else {
            Image image = (Image) BinderC14844l.m3897l(interfaceC3396l);
            AbstractC1051l.subs(image);
            c13503lVip = m3089l(image.getPlanes()[0].getBuffer(), c13173l, recognitionOptions);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = c13173l.f25781l;
        int i8 = c13173l.f25780l;
        if (i5 == 0) {
            matrix = null;
        } else {
            matrix = new Matrix();
            matrix.postTranslate((-i7) / 2.0f, (-i8) / 2.0f);
            matrix.postRotate(i5 * 90);
            int i9 = i5 % 2;
            int i10 = i9 != 0 ? i8 : i7;
            if (i9 == 0) {
                i7 = i8;
            }
            matrix.postTranslate(i10 / 2.0f, i7 / 2.0f);
        }
        for (C11044l c11044l : c13503lVip.metrica()) {
            int i11 = 5;
            if (c11044l.metrica() > 0 && matrix != null) {
                float[] fArr = new float[8];
                InterfaceC14009l interfaceC14009lSignatures = c11044l.signatures();
                int iMetrica = c11044l.metrica();
                for (int i12 = 0; i12 < iMetrica; i12++) {
                    int i13 = i12 + i12;
                    fArr[i13] = ((C1885l) interfaceC14009lSignatures.get(i12)).vip();
                    fArr[i13 + 1] = ((C1885l) interfaceC14009lSignatures.get(i12)).metrica();
                }
                matrix.mapPoints(fArr);
                int i14 = 0;
                while (i14 < iMetrica) {
                    AbstractC7986l abstractC7986l = (AbstractC7986l) c11044l.remoteconfig(i11, abstractC15603l);
                    if (!abstractC7986l.f16650l.equals(c11044l)) {
                        if (!abstractC7986l.f16649l.firebase()) {
                            abstractC7986l.billing();
                        }
                        AbstractC15603l abstractC15603l2 = abstractC7986l.f16649l;
                        C13940l.crashlytics.yandex(abstractC15603l2.getClass()).mopub(abstractC15603l2, c11044l);
                    }
                    C17527l c17527l = (C17527l) abstractC7986l;
                    int i15 = i14 + i14;
                    C2864l c2864lStartapp = C1885l.startapp();
                    int i16 = (int) fArr[i15];
                    c2864lStartapp.purchase();
                    C1885l.adcel((C1885l) c2864lStartapp.f16649l, i16);
                    int i17 = (int) fArr[i15 + 1];
                    c2864lStartapp.purchase();
                    C1885l.ads((C1885l) c2864lStartapp.f16649l, i17);
                    C1885l c1885l = (C1885l) c2864lStartapp.loadAd();
                    c17527l.purchase();
                    C11044l.premium((C11044l) c17527l.f16649l, (i14 + i5) % iMetrica, c1885l);
                    c11044l = (C11044l) c17527l.loadAd();
                    i14++;
                    i6 = i6;
                    abstractC15603l = null;
                    i11 = 5;
                }
            }
            int i18 = i6;
            if (c11044l.m3034throws()) {
                C8601l c8601lTapsense = c11044l.tapsense();
                c13115l = new C13115l(c8601lTapsense.ads() - 1, c8601lTapsense.metrica(), c8601lTapsense.adcel(), c8601lTapsense.startapp());
            } else {
                c13115l = null;
            }
            if (c11044l.m3033synchronized()) {
                C17171l c17171lStartapp = c11044l.startapp();
                c9652l = new C9652l(c17171lStartapp.startapp() - 1, c17171lStartapp.metrica());
            } else {
                c9652l = null;
            }
            if (c11044l.m3032strictfp()) {
                C14268l c14268lLicense = c11044l.license();
                c11703l = new C11703l(c14268lLicense.metrica(), c14268lLicense.startapp());
            } else {
                c11703l = null;
            }
            if (c11044l.m3029native()) {
                C16919l c16919lAd = c11044l.ad();
                c0008l = new C0008l(c16919lAd.startapp(), c16919lAd.adcel() - 1, c16919lAd.metrica());
            } else {
                c0008l = null;
            }
            if (c11044l.m3035volatile()) {
                C7019l c7019lPro = c11044l.pro();
                c12330l = new C12330l(c7019lPro.metrica(), c7019lPro.startapp());
            } else {
                c12330l = null;
            }
            if (c11044l.m3030package()) {
                C1707l c1707lSignature = c11044l.Signature();
                c17247l = new C17247l(c1707lSignature.vip(), c1707lSignature.metrica());
            } else {
                c17247l = null;
            }
            if (c11044l.applovin()) {
                C13433l c13433lAdcel = c11044l.adcel();
                String strSignature = c13433lAdcel.Signature();
                String strAdcel = c13433lAdcel.adcel();
                String strAds = c13433lAdcel.ads();
                String strSubscription = c13433lAdcel.subscription();
                String strTapsense4 = c13433lAdcel.tapsense();
                C4235l c4235lMetrica = c13433lAdcel.metrica();
                if (c11044l.advert().pro()) {
                    AbstractC1096l abstractC1096lAdvert = c11044l.advert();
                    abstractC1096lAdvert.getClass();
                    strTapsense2 = abstractC1096lAdvert.admob() == 0 ? "" : abstractC1096lAdvert.tapsense(AbstractC11565l.yandex);
                } else {
                    strTapsense2 = null;
                }
                C16674l c16674lM3087l = m3087l(c4235lMetrica, strTapsense2, "DTSTART:([0-9TZ]*)");
                C4235l c4235lVip = c13433lAdcel.vip();
                if (c11044l.advert().pro()) {
                    AbstractC1096l abstractC1096lAdvert2 = c11044l.advert();
                    abstractC1096lAdvert2.getClass();
                    strTapsense3 = abstractC1096lAdvert2.admob() == 0 ? "" : abstractC1096lAdvert2.tapsense(AbstractC11565l.yandex);
                } else {
                    strTapsense3 = null;
                }
                c16051l = new C16051l(strSignature, strAdcel, strAds, strSubscription, strTapsense4, c16674lM3087l, m3087l(c4235lVip, strTapsense3, "DTEND:([0-9TZ]*)"));
            } else {
                c16051l = null;
            }
            if (c11044l.appmetrica()) {
                C12581l c12581lAds = c11044l.ads();
                C10195l c10195lVip = c12581lAds.vip();
                C16566l c16566l = c10195lVip != null ? new C16566l(c10195lVip.startapp(), c10195lVip.tapsense(), c10195lVip.subscription(), c10195lVip.metrica(), c10195lVip.ads(), c10195lVip.adcel(), c10195lVip.Signature()) : null;
                String strStartapp = c12581lAds.startapp();
                String strAdcel2 = c12581lAds.adcel();
                InterfaceC14009l interfaceC14009lTapsense = c12581lAds.tapsense();
                if (interfaceC14009lTapsense.isEmpty()) {
                    c9652lArr = null;
                } else {
                    C9652l[] c9652lArr2 = new C9652l[interfaceC14009lTapsense.size()];
                    for (int i19 = 0; i19 < interfaceC14009lTapsense.size(); i19++) {
                        c9652lArr2[i19] = new C9652l(((C17171l) interfaceC14009lTapsense.get(i19)).startapp() - 1, ((C17171l) interfaceC14009lTapsense.get(i19)).metrica());
                    }
                    c9652lArr = c9652lArr2;
                }
                InterfaceC14009l interfaceC14009lSubscription = c12581lAds.subscription();
                if (interfaceC14009lSubscription.isEmpty()) {
                    c13115lArr = null;
                } else {
                    C13115l[] c13115lArr2 = new C13115l[interfaceC14009lSubscription.size()];
                    for (int i20 = 0; i20 < interfaceC14009lSubscription.size(); i20++) {
                        c13115lArr2[i20] = new C13115l(((C8601l) interfaceC14009lSubscription.get(i20)).ads() - 1, ((C8601l) interfaceC14009lSubscription.get(i20)).metrica(), ((C8601l) interfaceC14009lSubscription.get(i20)).adcel(), ((C8601l) interfaceC14009lSubscription.get(i20)).startapp());
                    }
                    c13115lArr = c13115lArr2;
                }
                String[] strArr = (String[]) c12581lAds.Signature().toArray(new String[0]);
                InterfaceC14009l interfaceC14009lAds = c12581lAds.ads();
                if (interfaceC14009lAds.isEmpty()) {
                    c18504lArr = null;
                } else {
                    C18504l[] c18504lArr2 = new C18504l[interfaceC14009lAds.size()];
                    for (int i21 = 0; i21 < interfaceC14009lAds.size(); i21++) {
                        c18504lArr2[i21] = new C18504l(((C11009l) interfaceC14009lAds.get(i21)).metrica() - 1, (String[]) ((C11009l) interfaceC14009lAds.get(i21)).vip().toArray(new String[0]));
                    }
                    c18504lArr = c18504lArr2;
                }
                c15996l = new C15996l(c16566l, strStartapp, strAdcel2, c9652lArr, c13115lArr, strArr, c18504lArr);
            } else {
                c15996l = null;
            }
            if (c11044l.inmobi()) {
                C14079l c14079lSubscription = c11044l.subscription();
                c8894l = new C8894l(c14079lSubscription.tapsense(), c14079lSubscription.license(), c14079lSubscription.premium(), c14079lSubscription.isVip(), c14079lSubscription.pro(), c14079lSubscription.adcel(), c14079lSubscription.metrica(), c14079lSubscription.startapp(), c14079lSubscription.ads(), c14079lSubscription.signatures(), c14079lSubscription.ad(), c14079lSubscription.Signature(), c14079lSubscription.subscription(), c14079lSubscription.advert());
            } else {
                c8894l = null;
            }
            int i22 = 2;
            switch (c11044l.m3031private() - 1) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 4;
                    break;
                case 4:
                    i = 8;
                    break;
                case 5:
                    i2 = 16;
                    i = i2;
                    break;
                case 6:
                    i2 = 32;
                    i = i2;
                    break;
                case 7:
                    i2 = 64;
                    i = i2;
                    break;
                case 8:
                    i2 = 128;
                    i = i2;
                    break;
                case 9:
                    i2 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    i = i2;
                    break;
                case 10:
                    i2 = AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    i = i2;
                    break;
                case 11:
                    i2 = 1024;
                    i = i2;
                    break;
                case 12:
                    i2 = 2048;
                    i = i2;
                    break;
                case 13:
                    i2 = 4096;
                    i = i2;
                    break;
                default:
                    i = i18;
                    break;
            }
            String strIsVip = c11044l.isVip();
            if (c11044l.advert().pro()) {
                AbstractC1096l abstractC1096lAdvert3 = c11044l.advert();
                abstractC1096lAdvert3.getClass();
                strTapsense = abstractC1096lAdvert3.admob() != 0 ? abstractC1096lAdvert3.tapsense(AbstractC11565l.yandex) : "";
            } else {
                strTapsense = null;
            }
            AbstractC1096l abstractC1096lAdvert4 = c11044l.advert();
            int iAdmob = abstractC1096lAdvert4.admob();
            if (iAdmob == 0) {
                bArr = AbstractC11565l.loadAd;
            } else {
                byte[] bArr2 = new byte[iAdmob];
                abstractC1096lAdvert4.firebase(bArr2, 0, 0, iAdmob);
                bArr = bArr2;
            }
            InterfaceC14009l interfaceC14009lSignatures2 = c11044l.signatures();
            if (interfaceC14009lSignatures2.isEmpty()) {
                pointArr = null;
            } else {
                Point[] pointArr2 = new Point[interfaceC14009lSignatures2.size()];
                for (int i23 = 0; i23 < interfaceC14009lSignatures2.size(); i23++) {
                    pointArr2[i23] = new Point(((C1885l) interfaceC14009lSignatures2.get(i23)).vip(), ((C1885l) interfaceC14009lSignatures2.get(i23)).metrica());
                }
                pointArr = pointArr2;
            }
            switch (c11044l.vip() - 1) {
                case 1:
                    i3 = 1;
                    continue;
                    arrayList.add(new C5949l(i, strIsVip, strTapsense, bArr, pointArr, i3, c13115l, c9652l, c11703l, c0008l, c12330l, c17247l, c16051l, c15996l, c8894l));
                    i6 = i18;
                    abstractC15603l = null;
                    break;
                case 2:
                    break;
                case 3:
                    i22 = 3;
                    break;
                case 4:
                    i3 = 4;
                    continue;
                    arrayList.add(new C5949l(i, strIsVip, strTapsense, bArr, pointArr, i3, c13115l, c9652l, c11703l, c0008l, c12330l, c17247l, c16051l, c15996l, c8894l));
                    i6 = i18;
                    abstractC15603l = null;
                    break;
                case 5:
                    i3 = 5;
                    continue;
                    arrayList.add(new C5949l(i, strIsVip, strTapsense, bArr, pointArr, i3, c13115l, c9652l, c11703l, c0008l, c12330l, c17247l, c16051l, c15996l, c8894l));
                    i6 = i18;
                    abstractC15603l = null;
                    break;
                case 6:
                    i22 = 6;
                    break;
                case 7:
                    i22 = 7;
                    break;
                case 8:
                    i3 = 8;
                    continue;
                    arrayList.add(new C5949l(i, strIsVip, strTapsense, bArr, pointArr, i3, c13115l, c9652l, c11703l, c0008l, c12330l, c17247l, c16051l, c15996l, c8894l));
                    i6 = i18;
                    abstractC15603l = null;
                    break;
                case 9:
                    i22 = 9;
                    break;
                case 10:
                    i22 = 10;
                    break;
                case 11:
                    i22 = 11;
                    break;
                case 12:
                    i22 = 12;
                    break;
                default:
                    i3 = 0;
                    continue;
                    arrayList.add(new C5949l(i, strIsVip, strTapsense, bArr, pointArr, i3, c13115l, c9652l, c11703l, c0008l, c12330l, c17247l, c16051l, c15996l, c8894l));
                    i6 = i18;
                    abstractC15603l = null;
                    break;
            }
            i3 = i22;
            arrayList.add(new C5949l(i, strIsVip, strTapsense, bArr, pointArr, i3, c13115l, c9652l, c11703l, c0008l, c12330l, c17247l, c16051l, c15996l, c8894l));
            i6 = i18;
            abstractC15603l = null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: lْؕ۠, reason: contains not printable characters */
    public final C13503l m3089l(ByteBuffer byteBuffer, C13173l c13173l, RecognitionOptions recognitionOptions) {
        BarhopperV3 barhopperV3 = this.mopub;
        AbstractC1051l.subs(barhopperV3);
        AbstractC1051l.subs(byteBuffer);
        if (byteBuffer.isDirect()) {
            return barhopperV3.billing(c13173l.f25781l, c13173l.f25780l, byteBuffer, recognitionOptions);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.mopub(c13173l.f25781l, c13173l.f25780l, byteBuffer.array(), recognitionOptions);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.mopub(c13173l.f25781l, c13173l.f25780l, bArr, recognitionOptions);
    }
}

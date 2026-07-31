package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lُٖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10861l implements InterfaceC5389l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C10596l f21956l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final InterfaceC1220l f21957l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final InterfaceC1220l f21958l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final CameraCharacteristics f21959l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f21960l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Set f21962l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final ArrayMap f21961l = new ArrayMap();

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final ArrayMap f21963l = new ArrayMap();

    public C10861l(String str, CameraCharacteristics cameraCharacteristics, C10596l c10596l, Set set) {
        this.f21960l = str;
        this.f21959l = cameraCharacteristics;
        this.f21956l = c10596l;
        this.f21962l = set;
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: lٍؒۧ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C10861l f2634l;

            {
                this.f2634l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Set setM4229l;
                int i2 = i;
                List list = C2580l.f5619l;
                C5746l c5746l = C5746l.f12138l;
                C10861l c10861l = this.f2634l;
                switch (i2) {
                    case 0:
                        String str2 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) C10160l.loadAd(str2)) + "#supportedExtensions");
                                C10596l c10596l2 = c10861l.f21956l;
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setM4229l = AbstractC16901l.m4229l(AbstractC12148l.tapsense(c10596l2.billing(str2)));
                                    break;
                                } else {
                                    setM4229l = c5746l;
                                }
                                return setM4229l;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) C10160l.loadAd(str2)), e);
                            return c5746l;
                        }
                    case 1:
                        String str3 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = c10861l.f21959l.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) C10160l.loadAd(str3)) + '}', e2);
                            return c5746l;
                        }
                    case 2:
                        String str4 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = c10861l.f21959l.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) C10160l.loadAd(str4)), e3);
                            return c5746l;
                        }
                    case 3:
                        String str5 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = c10861l.f21959l.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) C10160l.loadAd(str5)), e4);
                            return c5746l;
                        }
                    case 4:
                        String str6 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str6)) + "#physicalCameraIds");
                                Set setAd = AbstractC13950l.ad(c10861l.f21959l);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) C10160l.loadAd(str6)) + ": " + setAd);
                                Set<String> set2 = setAd;
                                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(set2, 10));
                                for (String str7 : set2) {
                                    C10160l.yandex(str7);
                                    arrayList.add(new C10160l(str7));
                                }
                                return AbstractC16901l.m4229l(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C10160l.loadAd(str6)), e5);
                            return c5746l;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C10160l.loadAd(str6)), e6);
                            return c5746l;
                        }
                    case 5:
                        String str8 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List listMetrica = AbstractC13950l.metrica(c10861l.f21959l);
                                if (listMetrica != null) {
                                    list = listMetrica;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c5746l;
                        }
                    case 6:
                        String str9 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 35) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List listCrashlytics = AbstractC7680l.crashlytics(c10861l.f21959l);
                                if (listCrashlytics != null) {
                                    list = listCrashlytics;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c5746l;
                        }
                    default:
                        String str10 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List listStartapp = AbstractC13950l.startapp(c10861l.f21959l);
                                if (listStartapp != null) {
                                    list = listStartapp;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c5746l;
                        }
                }
            }
        };
        final int i2 = 2;
        this.f21957l = AbstractC9968l.crashlytics(2, function0);
        final int i3 = 1;
        AbstractC9968l.crashlytics(2, new Function0(this) { // from class: lٍؒۧ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C10861l f2634l;

            {
                this.f2634l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Set setM4229l;
                int i4 = i3;
                List list = C2580l.f5619l;
                C5746l c5746l = C5746l.f12138l;
                C10861l c10861l = this.f2634l;
                switch (i4) {
                    case 0:
                        String str2 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) C10160l.loadAd(str2)) + "#supportedExtensions");
                                C10596l c10596l2 = c10861l.f21956l;
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setM4229l = AbstractC16901l.m4229l(AbstractC12148l.tapsense(c10596l2.billing(str2)));
                                    break;
                                } else {
                                    setM4229l = c5746l;
                                }
                                return setM4229l;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) C10160l.loadAd(str2)), e);
                            return c5746l;
                        }
                    case 1:
                        String str3 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = c10861l.f21959l.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) C10160l.loadAd(str3)) + '}', e2);
                            return c5746l;
                        }
                    case 2:
                        String str4 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = c10861l.f21959l.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) C10160l.loadAd(str4)), e3);
                            return c5746l;
                        }
                    case 3:
                        String str5 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = c10861l.f21959l.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) C10160l.loadAd(str5)), e4);
                            return c5746l;
                        }
                    case 4:
                        String str6 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str6)) + "#physicalCameraIds");
                                Set setAd = AbstractC13950l.ad(c10861l.f21959l);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) C10160l.loadAd(str6)) + ": " + setAd);
                                Set<String> set2 = setAd;
                                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(set2, 10));
                                for (String str7 : set2) {
                                    C10160l.yandex(str7);
                                    arrayList.add(new C10160l(str7));
                                }
                                return AbstractC16901l.m4229l(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C10160l.loadAd(str6)), e5);
                            return c5746l;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C10160l.loadAd(str6)), e6);
                            return c5746l;
                        }
                    case 5:
                        String str8 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List listMetrica = AbstractC13950l.metrica(c10861l.f21959l);
                                if (listMetrica != null) {
                                    list = listMetrica;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c5746l;
                        }
                    case 6:
                        String str9 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 35) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List listCrashlytics = AbstractC7680l.crashlytics(c10861l.f21959l);
                                if (listCrashlytics != null) {
                                    list = listCrashlytics;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c5746l;
                        }
                    default:
                        String str10 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List listStartapp = AbstractC13950l.startapp(c10861l.f21959l);
                                if (listStartapp != null) {
                                    list = listStartapp;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c5746l;
                        }
                }
            }
        });
        AbstractC9968l.crashlytics(2, new Function0(this) { // from class: lٍؒۧ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C10861l f2634l;

            {
                this.f2634l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Set setM4229l;
                int i4 = i2;
                List list = C2580l.f5619l;
                C5746l c5746l = C5746l.f12138l;
                C10861l c10861l = this.f2634l;
                switch (i4) {
                    case 0:
                        String str2 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) C10160l.loadAd(str2)) + "#supportedExtensions");
                                C10596l c10596l2 = c10861l.f21956l;
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setM4229l = AbstractC16901l.m4229l(AbstractC12148l.tapsense(c10596l2.billing(str2)));
                                    break;
                                } else {
                                    setM4229l = c5746l;
                                }
                                return setM4229l;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) C10160l.loadAd(str2)), e);
                            return c5746l;
                        }
                    case 1:
                        String str3 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = c10861l.f21959l.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) C10160l.loadAd(str3)) + '}', e2);
                            return c5746l;
                        }
                    case 2:
                        String str4 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = c10861l.f21959l.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) C10160l.loadAd(str4)), e3);
                            return c5746l;
                        }
                    case 3:
                        String str5 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = c10861l.f21959l.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) C10160l.loadAd(str5)), e4);
                            return c5746l;
                        }
                    case 4:
                        String str6 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str6)) + "#physicalCameraIds");
                                Set setAd = AbstractC13950l.ad(c10861l.f21959l);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) C10160l.loadAd(str6)) + ": " + setAd);
                                Set<String> set2 = setAd;
                                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(set2, 10));
                                for (String str7 : set2) {
                                    C10160l.yandex(str7);
                                    arrayList.add(new C10160l(str7));
                                }
                                return AbstractC16901l.m4229l(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C10160l.loadAd(str6)), e5);
                            return c5746l;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C10160l.loadAd(str6)), e6);
                            return c5746l;
                        }
                    case 5:
                        String str8 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List listMetrica = AbstractC13950l.metrica(c10861l.f21959l);
                                if (listMetrica != null) {
                                    list = listMetrica;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c5746l;
                        }
                    case 6:
                        String str9 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 35) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List listCrashlytics = AbstractC7680l.crashlytics(c10861l.f21959l);
                                if (listCrashlytics != null) {
                                    list = listCrashlytics;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c5746l;
                        }
                    default:
                        String str10 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List listStartapp = AbstractC13950l.startapp(c10861l.f21959l);
                                if (listStartapp != null) {
                                    list = listStartapp;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c5746l;
                        }
                }
            }
        });
        final int i4 = 3;
        AbstractC9968l.crashlytics(2, new Function0(this) { // from class: lٍؒۧ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C10861l f2634l;

            {
                this.f2634l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Set setM4229l;
                int i5 = i4;
                List list = C2580l.f5619l;
                C5746l c5746l = C5746l.f12138l;
                C10861l c10861l = this.f2634l;
                switch (i5) {
                    case 0:
                        String str2 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) C10160l.loadAd(str2)) + "#supportedExtensions");
                                C10596l c10596l2 = c10861l.f21956l;
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setM4229l = AbstractC16901l.m4229l(AbstractC12148l.tapsense(c10596l2.billing(str2)));
                                    break;
                                } else {
                                    setM4229l = c5746l;
                                }
                                return setM4229l;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) C10160l.loadAd(str2)), e);
                            return c5746l;
                        }
                    case 1:
                        String str3 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = c10861l.f21959l.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) C10160l.loadAd(str3)) + '}', e2);
                            return c5746l;
                        }
                    case 2:
                        String str4 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = c10861l.f21959l.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) C10160l.loadAd(str4)), e3);
                            return c5746l;
                        }
                    case 3:
                        String str5 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = c10861l.f21959l.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) C10160l.loadAd(str5)), e4);
                            return c5746l;
                        }
                    case 4:
                        String str6 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str6)) + "#physicalCameraIds");
                                Set setAd = AbstractC13950l.ad(c10861l.f21959l);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) C10160l.loadAd(str6)) + ": " + setAd);
                                Set<String> set2 = setAd;
                                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(set2, 10));
                                for (String str7 : set2) {
                                    C10160l.yandex(str7);
                                    arrayList.add(new C10160l(str7));
                                }
                                return AbstractC16901l.m4229l(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C10160l.loadAd(str6)), e5);
                            return c5746l;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C10160l.loadAd(str6)), e6);
                            return c5746l;
                        }
                    case 5:
                        String str8 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List listMetrica = AbstractC13950l.metrica(c10861l.f21959l);
                                if (listMetrica != null) {
                                    list = listMetrica;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c5746l;
                        }
                    case 6:
                        String str9 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 35) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List listCrashlytics = AbstractC7680l.crashlytics(c10861l.f21959l);
                                if (listCrashlytics != null) {
                                    list = listCrashlytics;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c5746l;
                        }
                    default:
                        String str10 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List listStartapp = AbstractC13950l.startapp(c10861l.f21959l);
                                if (listStartapp != null) {
                                    list = listStartapp;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c5746l;
                        }
                }
            }
        });
        final int i5 = 4;
        AbstractC9968l.crashlytics(2, new Function0(this) { // from class: lٍؒۧ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C10861l f2634l;

            {
                this.f2634l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Set setM4229l;
                int i6 = i5;
                List list = C2580l.f5619l;
                C5746l c5746l = C5746l.f12138l;
                C10861l c10861l = this.f2634l;
                switch (i6) {
                    case 0:
                        String str2 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) C10160l.loadAd(str2)) + "#supportedExtensions");
                                C10596l c10596l2 = c10861l.f21956l;
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setM4229l = AbstractC16901l.m4229l(AbstractC12148l.tapsense(c10596l2.billing(str2)));
                                    break;
                                } else {
                                    setM4229l = c5746l;
                                }
                                return setM4229l;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) C10160l.loadAd(str2)), e);
                            return c5746l;
                        }
                    case 1:
                        String str3 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = c10861l.f21959l.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) C10160l.loadAd(str3)) + '}', e2);
                            return c5746l;
                        }
                    case 2:
                        String str4 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = c10861l.f21959l.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) C10160l.loadAd(str4)), e3);
                            return c5746l;
                        }
                    case 3:
                        String str5 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = c10861l.f21959l.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) C10160l.loadAd(str5)), e4);
                            return c5746l;
                        }
                    case 4:
                        String str6 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str6)) + "#physicalCameraIds");
                                Set setAd = AbstractC13950l.ad(c10861l.f21959l);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) C10160l.loadAd(str6)) + ": " + setAd);
                                Set<String> set2 = setAd;
                                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(set2, 10));
                                for (String str7 : set2) {
                                    C10160l.yandex(str7);
                                    arrayList.add(new C10160l(str7));
                                }
                                return AbstractC16901l.m4229l(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C10160l.loadAd(str6)), e5);
                            return c5746l;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C10160l.loadAd(str6)), e6);
                            return c5746l;
                        }
                    case 5:
                        String str8 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List listMetrica = AbstractC13950l.metrica(c10861l.f21959l);
                                if (listMetrica != null) {
                                    list = listMetrica;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c5746l;
                        }
                    case 6:
                        String str9 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 35) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List listCrashlytics = AbstractC7680l.crashlytics(c10861l.f21959l);
                                if (listCrashlytics != null) {
                                    list = listCrashlytics;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c5746l;
                        }
                    default:
                        String str10 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List listStartapp = AbstractC13950l.startapp(c10861l.f21959l);
                                if (listStartapp != null) {
                                    list = listStartapp;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c5746l;
                        }
                }
            }
        });
        final int i6 = 5;
        AbstractC9968l.crashlytics(2, new Function0(this) { // from class: lٍؒۧ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C10861l f2634l;

            {
                this.f2634l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Set setM4229l;
                int i7 = i6;
                List list = C2580l.f5619l;
                C5746l c5746l = C5746l.f12138l;
                C10861l c10861l = this.f2634l;
                switch (i7) {
                    case 0:
                        String str2 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) C10160l.loadAd(str2)) + "#supportedExtensions");
                                C10596l c10596l2 = c10861l.f21956l;
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setM4229l = AbstractC16901l.m4229l(AbstractC12148l.tapsense(c10596l2.billing(str2)));
                                    break;
                                } else {
                                    setM4229l = c5746l;
                                }
                                return setM4229l;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) C10160l.loadAd(str2)), e);
                            return c5746l;
                        }
                    case 1:
                        String str3 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = c10861l.f21959l.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) C10160l.loadAd(str3)) + '}', e2);
                            return c5746l;
                        }
                    case 2:
                        String str4 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = c10861l.f21959l.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) C10160l.loadAd(str4)), e3);
                            return c5746l;
                        }
                    case 3:
                        String str5 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = c10861l.f21959l.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) C10160l.loadAd(str5)), e4);
                            return c5746l;
                        }
                    case 4:
                        String str6 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str6)) + "#physicalCameraIds");
                                Set setAd = AbstractC13950l.ad(c10861l.f21959l);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) C10160l.loadAd(str6)) + ": " + setAd);
                                Set<String> set2 = setAd;
                                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(set2, 10));
                                for (String str7 : set2) {
                                    C10160l.yandex(str7);
                                    arrayList.add(new C10160l(str7));
                                }
                                return AbstractC16901l.m4229l(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C10160l.loadAd(str6)), e5);
                            return c5746l;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C10160l.loadAd(str6)), e6);
                            return c5746l;
                        }
                    case 5:
                        String str8 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List listMetrica = AbstractC13950l.metrica(c10861l.f21959l);
                                if (listMetrica != null) {
                                    list = listMetrica;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c5746l;
                        }
                    case 6:
                        String str9 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 35) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List listCrashlytics = AbstractC7680l.crashlytics(c10861l.f21959l);
                                if (listCrashlytics != null) {
                                    list = listCrashlytics;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c5746l;
                        }
                    default:
                        String str10 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List listStartapp = AbstractC13950l.startapp(c10861l.f21959l);
                                if (listStartapp != null) {
                                    list = listStartapp;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c5746l;
                        }
                }
            }
        });
        final int i7 = 6;
        AbstractC9968l.crashlytics(2, new Function0(this) { // from class: lٍؒۧ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C10861l f2634l;

            {
                this.f2634l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Set setM4229l;
                int i8 = i7;
                List list = C2580l.f5619l;
                C5746l c5746l = C5746l.f12138l;
                C10861l c10861l = this.f2634l;
                switch (i8) {
                    case 0:
                        String str2 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) C10160l.loadAd(str2)) + "#supportedExtensions");
                                C10596l c10596l2 = c10861l.f21956l;
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setM4229l = AbstractC16901l.m4229l(AbstractC12148l.tapsense(c10596l2.billing(str2)));
                                    break;
                                } else {
                                    setM4229l = c5746l;
                                }
                                return setM4229l;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) C10160l.loadAd(str2)), e);
                            return c5746l;
                        }
                    case 1:
                        String str3 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = c10861l.f21959l.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) C10160l.loadAd(str3)) + '}', e2);
                            return c5746l;
                        }
                    case 2:
                        String str4 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = c10861l.f21959l.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) C10160l.loadAd(str4)), e3);
                            return c5746l;
                        }
                    case 3:
                        String str5 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = c10861l.f21959l.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) C10160l.loadAd(str5)), e4);
                            return c5746l;
                        }
                    case 4:
                        String str6 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str6)) + "#physicalCameraIds");
                                Set setAd = AbstractC13950l.ad(c10861l.f21959l);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) C10160l.loadAd(str6)) + ": " + setAd);
                                Set<String> set2 = setAd;
                                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(set2, 10));
                                for (String str7 : set2) {
                                    C10160l.yandex(str7);
                                    arrayList.add(new C10160l(str7));
                                }
                                return AbstractC16901l.m4229l(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C10160l.loadAd(str6)), e5);
                            return c5746l;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C10160l.loadAd(str6)), e6);
                            return c5746l;
                        }
                    case 5:
                        String str8 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List listMetrica = AbstractC13950l.metrica(c10861l.f21959l);
                                if (listMetrica != null) {
                                    list = listMetrica;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c5746l;
                        }
                    case 6:
                        String str9 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 35) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List listCrashlytics = AbstractC7680l.crashlytics(c10861l.f21959l);
                                if (listCrashlytics != null) {
                                    list = listCrashlytics;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c5746l;
                        }
                    default:
                        String str10 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List listStartapp = AbstractC13950l.startapp(c10861l.f21959l);
                                if (listStartapp != null) {
                                    list = listStartapp;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c5746l;
                        }
                }
            }
        });
        final int i8 = 7;
        this.f21958l = AbstractC9968l.crashlytics(2, new Function0(this) { // from class: lٍؒۧ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C10861l f2634l;

            {
                this.f2634l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Set setM4229l;
                int i9 = i8;
                List list = C2580l.f5619l;
                C5746l c5746l = C5746l.f12138l;
                C10861l c10861l = this.f2634l;
                switch (i9) {
                    case 0:
                        String str2 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) C10160l.loadAd(str2)) + "#supportedExtensions");
                                C10596l c10596l2 = c10861l.f21956l;
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setM4229l = AbstractC16901l.m4229l(AbstractC12148l.tapsense(c10596l2.billing(str2)));
                                    break;
                                } else {
                                    setM4229l = c5746l;
                                }
                                return setM4229l;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) C10160l.loadAd(str2)), e);
                            return c5746l;
                        }
                    case 1:
                        String str3 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = c10861l.f21959l.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) C10160l.loadAd(str3)) + '}', e2);
                            return c5746l;
                        }
                    case 2:
                        String str4 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = c10861l.f21959l.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) C10160l.loadAd(str4)), e3);
                            return c5746l;
                        }
                    case 3:
                        String str5 = c10861l.f21960l;
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = c10861l.f21959l.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) C10160l.loadAd(str5)), e4);
                            return c5746l;
                        }
                    case 4:
                        String str6 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) C10160l.loadAd(str6)) + "#physicalCameraIds");
                                Set setAd = AbstractC13950l.ad(c10861l.f21959l);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) C10160l.loadAd(str6)) + ": " + setAd);
                                Set<String> set2 = setAd;
                                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(set2, 10));
                                for (String str7 : set2) {
                                    C10160l.yandex(str7);
                                    arrayList.add(new C10160l(str7));
                                }
                                return AbstractC16901l.m4229l(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C10160l.loadAd(str6)), e5);
                            return c5746l;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C10160l.loadAd(str6)), e6);
                            return c5746l;
                        }
                    case 5:
                        String str8 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List listMetrica = AbstractC13950l.metrica(c10861l.f21959l);
                                if (listMetrica != null) {
                                    list = listMetrica;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c5746l;
                        }
                    case 6:
                        String str9 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 35) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List listCrashlytics = AbstractC7680l.crashlytics(c10861l.f21959l);
                                if (listCrashlytics != null) {
                                    list = listCrashlytics;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c5746l;
                        }
                    default:
                        String str10 = c10861l.f21960l;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c5746l;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List listStartapp = AbstractC13950l.startapp(c10861l.f21959l);
                                if (listStartapp != null) {
                                    list = listStartapp;
                                }
                                return AbstractC16901l.m4229l(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c5746l;
                        }
                }
            }
        });
    }

    public final Object crashlytics(CameraCharacteristics.Key key) {
        Object obj;
        if (this.f21962l.contains(key)) {
            try {
                return this.f21959l.get(key);
            } catch (AssertionError unused) {
                C18262l.firebase(key, ": Framework throw an AssertionError", "Failed to get characteristic for ");
                return null;
            }
        }
        synchronized (this.f21961l) {
            obj = this.f21961l.get(key);
        }
        if (obj != null) {
            return obj;
        }
        try {
            Object obj2 = this.f21959l.get(key);
            if (obj2 == null) {
                return obj2;
            }
            synchronized (this.f21961l) {
                this.f21961l.put(key, obj2);
                Unit unit = Unit.INSTANCE;
            }
            return obj2;
        } catch (AssertionError unused2) {
            C18262l.firebase(key, ": Framework throw an AssertionError", "Failed to get characteristic for ");
            return null;
        }
    }

    @Override // defpackage.InterfaceC5899l
    /* JADX INFO: renamed from: while */
    public final Object mo842while(InterfaceC1388l interfaceC1388l) {
        if (interfaceC1388l.equals(AbstractC18202l.yandex.loadAd(CameraCharacteristics.class))) {
            return this.f21959l;
        }
        return null;
    }
}

package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.SurfaceHolder;
import androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk;
import androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: lٌِؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8462l {
    public final C1276l admob;
    public final C5849l amazon;
    public final InterfaceC18560l billing;
    public final C17927l crashlytics;
    public final DynamicRangeProfiles firebase;
    public final C14965l isPro = new C14965l(5);
    public final C5342l loadAd;
    public final InterfaceC5389l mopub;
    public final InterfaceC2889l purchase;
    public final C3797l subs;
    public final C10035l yandex;

    public C8462l(C10035l c10035l, C5342l c5342l, C17927l c17927l, C5849l c5849l, InterfaceC2889l interfaceC2889l, InterfaceC18560l interfaceC18560l, InterfaceC5389l interfaceC5389l, C1276l c1276l, C3797l c3797l) {
        this.yandex = c10035l;
        this.loadAd = c5342l;
        this.crashlytics = c17927l;
        this.amazon = c5849l;
        this.purchase = interfaceC2889l;
        this.billing = interfaceC18560l;
        this.mopub = interfaceC5389l;
        this.admob = c1276l;
        this.subs = c3797l;
        int i = Build.VERSION.SDK_INT;
        DynamicRangeProfiles dynamicRangeProfilesYandex = null;
        if (i >= 33 && interfaceC5389l != null) {
            C15053l c15053lPurchase = AbstractC2847l.purchase(interfaceC5389l);
            if (i < 33) {
                C8936l.subs(AbstractC15560l.tapsense("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher. is not supported on API ", i, " (requires API 33)"));
                throw null;
            }
            dynamicRangeProfilesYandex = ((InterfaceC0553l) c15053lPurchase.f29576l).yandex();
        }
        this.firebase = dynamicRangeProfilesYandex;
    }

    public final String toString() {
        return "CameraGraphConfigProvider<" + ((Object) C10160l.loadAd(this.crashlytics.loadAd)) + '>';
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0205  */
    /* JADX WARN: Code duplicated, block: B:103:0x021a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0228  */
    /* JADX WARN: Code duplicated, block: B:106:0x023b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0241  */
    /* JADX WARN: Code duplicated, block: B:114:0x025b  */
    /* JADX WARN: Code duplicated, block: B:163:0x035d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0125  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:53:0x0136  */
    /* JADX WARN: Code duplicated, block: B:55:0x013e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0141  */
    /* JADX WARN: Code duplicated, block: B:58:0x0149  */
    /* JADX WARN: Code duplicated, block: B:59:0x014c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0150  */
    /* JADX WARN: Code duplicated, block: B:63:0x0160  */
    /* JADX WARN: Code duplicated, block: B:65:0x016c  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:94:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01eb  */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x01a9, please report this as an issue */
    public final C8863l yandex(int i, C10814l c10814l, boolean z, C7686l c7686l, Integer num, Map map, Map map2) {
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        LinkedHashMap linkedHashMap;
        int i2;
        C4069l c4069l;
        ArrayList arrayList2;
        C4069l c4069l2;
        String str;
        C8259l c8259l;
        C8259l c8259l2;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList3;
        C4220l c4220l;
        String str2;
        C8259l c8259l3;
        C8259l c8259l4;
        C15617l c15617l;
        Size size;
        C5565l c5565l;
        C5959l c5959l;
        AbstractC2371l abstractC2371lMopub;
        C4069l c4069l3;
        LinkedHashMap linkedHashMap3;
        List list;
        Long l;
        C5959l c5959l2;
        Long l2;
        C5565l c5565l2;
        long[] jArr;
        Class cls;
        C15617l c15617l2;
        C15617l c15617l3 = C15617l.f30495l;
        Integer num2 = 0;
        boolean z4 = i == 2;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        ArrayList arrayList4 = new ArrayList();
        boolean z5 = z4;
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        if (c10814l != null) {
            C0665l c0665l = c10814l.mopub;
            z2 = false;
            C3797l c3797l = this.subs;
            if (c3797l != null) {
                ((C15715l) c3797l.f7903l).yandex.yandex = AbstractC16901l.m4213const(c10814l.crashlytics);
                ((C11561l) ((C0458l) c3797l.f7902l).f1690l).yandex = AbstractC16901l.m4213const(c10814l.amazon);
            }
            int i3 = c0665l.crashlytics;
            if (i3 == -1) {
                i3 = 1;
            }
            linkedHashMap5.putAll(this.billing.crashlytics(new C18221l(i3)));
            linkedHashMap5.putAll(AbstractC5641l.isPro(c0665l.loadAd));
            if (i == 2) {
                linkedHashMap5.put(AbstractC12634l.yandex, num);
            }
            String str3 = (String) c10814l.mopub.loadAd.smaato(C16443l.f32154l, null);
            Iterator it = c10814l.yandex.iterator();
            C4069l c4069l4 = null;
            while (it.hasNext()) {
                C14113l c14113l = (C14113l) it.next();
                C15617l c15617l4 = c15617l3;
                AbstractC0958l abstractC0958l = c14113l.yandex;
                int i4 = i3;
                int i5 = c14113l.amazon;
                String str4 = str3;
                String str5 = str3 == null ? null : str4;
                C15421l c15421l = c14113l.purchase;
                int i6 = c14113l.crashlytics;
                boolean z6 = z5;
                int i7 = Build.VERSION.SDK_INT;
                Iterator it2 = it;
                if (i7 >= 33) {
                    linkedHashMap2 = linkedHashMap4;
                    arrayList3 = arrayList4;
                    C4220l c4220l2 = new C4220l(1L);
                    DynamicRangeProfiles dynamicRangeProfiles = this.firebase;
                    if (dynamicRangeProfiles == null) {
                        c4220l = c4220l2;
                    } else {
                        Long lYandex = AbstractC12156l.yandex(c15421l, dynamicRangeProfiles);
                        if (lYandex != null) {
                            c4220l = new C4220l(lYandex.longValue());
                        } else {
                            if (AbstractC5088l.smaato()) {
                                Log.e("CXCP", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n " + c15421l);
                            }
                            c4220l = c4220l2;
                        }
                    }
                } else {
                    linkedHashMap2 = linkedHashMap4;
                    arrayList3 = arrayList4;
                    c4220l = null;
                }
                Size size2 = abstractC0958l.admob;
                int i8 = abstractC0958l.subs;
                if (str5 == null) {
                    str2 = null;
                } else {
                    C10160l.yandex(str5);
                    str2 = str5;
                }
                if (i6 != 0) {
                    if (i6 != 1) {
                        c8259l4 = null;
                    } else {
                        c8259l3 = new C8259l(2);
                    }
                    if (z) {
                        cls = c14113l.yandex.isPro;
                        if (AbstractC8576l.yandex(cls, MediaCodec.class)) {
                            c15617l2 = C15617l.f30508l;
                        } else if (AbstractC8576l.yandex(cls, SurfaceHolder.class)) {
                            c15617l2 = C15617l.f30509l;
                        } else if (AbstractC8576l.yandex(cls, SurfaceTexture.class)) {
                            c15617l2 = C15617l.f30503l;
                        } else {
                            c15617l = c15617l4;
                        }
                        c15617l = c15617l2;
                    } else {
                        c15617l = c15617l4;
                    }
                    if (z6) {
                        size = size2;
                        c5565l = null;
                    } else {
                        InterfaceC5389l interfaceC5389l = this.mopub;
                        l2 = (Long) map.get(abstractC0958l);
                        if (l2 != null) {
                            c5565l2 = new C5565l(l2.longValue());
                        } else {
                            c5565l2 = null;
                        }
                        if (i7 >= 33 || c5565l2 == null || interfaceC5389l == null || (jArr = (long[]) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null) {
                            size = size2;
                        } else {
                            long j = c5565l2.yandex;
                            int length = jArr.length;
                            size = size2;
                            int i9 = 0;
                            while (true) {
                                if (i9 >= length) {
                                    i9 = -1;
                                    break;
                                }
                                if (j == jArr[i9]) {
                                    break;
                                }
                                i9++;
                            }
                            if (!(i9 >= 0)) {
                            }
                            c5565l = c5565l2;
                        }
                        if (AbstractC5088l.metrica()) {
                            Log.w("CXCP", "Expected stream use case for " + abstractC0958l + ", " + c5565l2 + " cannot be set!");
                        }
                        c5565l2 = null;
                        c5565l = c5565l2;
                    }
                    if (z6) {
                        c5959l = null;
                    } else {
                        l = (Long) map2.get(abstractC0958l);
                        if (l != null) {
                            c5959l2 = new C5959l(l.longValue());
                        } else {
                            c5959l2 = null;
                        }
                        c5959l = c5959l2;
                    }
                    abstractC2371lMopub = C13975l.mopub(i8, 544, c15617l, c4220l, c8259l4, c5565l, c5959l, size, str2);
                    for (AbstractC0958l abstractC0958l2 : AbstractC16901l.m4218final(abstractC0958l, c14113l.loadAd)) {
                        c4069l3 = new C4069l(Collections.singletonList(abstractC2371lMopub));
                        linkedHashMap6.put(c4069l3, abstractC0958l2);
                        if (i5 != -1) {
                            linkedHashMap3 = linkedHashMap2;
                            list = (List) linkedHashMap3.get(Integer.valueOf(i5));
                            if (list == null) {
                                linkedHashMap3.put(Integer.valueOf(i5), AbstractC14055l.metrica(c4069l3));
                            } else {
                                list.add(c4069l3);
                            }
                        } else {
                            linkedHashMap3 = linkedHashMap2;
                        }
                        if (!AbstractC8576l.yandex(abstractC0958l2, abstractC0958l) && this.purchase.purchase(abstractC0958l2, c10814l)) {
                            c4069l4 = c4069l3;
                        }
                        linkedHashMap2 = linkedHashMap3;
                        i5 = i5;
                    }
                    str3 = str4;
                    c15617l3 = c15617l4;
                    i3 = i4;
                    z5 = z6;
                    it = it2;
                    linkedHashMap4 = linkedHashMap2;
                    arrayList4 = arrayList3;
                } else {
                    c8259l3 = new C8259l(1);
                }
                c8259l4 = c8259l3;
                if (z) {
                    cls = c14113l.yandex.isPro;
                    if (AbstractC8576l.yandex(cls, MediaCodec.class)) {
                        c15617l2 = C15617l.f30508l;
                    } else if (AbstractC8576l.yandex(cls, SurfaceHolder.class)) {
                        c15617l2 = C15617l.f30509l;
                    } else if (AbstractC8576l.yandex(cls, SurfaceTexture.class)) {
                        c15617l2 = C15617l.f30503l;
                    } else {
                        c15617l = c15617l4;
                    }
                    c15617l = c15617l2;
                } else {
                    c15617l = c15617l4;
                }
                if (z6) {
                    InterfaceC5389l interfaceC5389l2 = this.mopub;
                    l2 = (Long) map.get(abstractC0958l);
                    if (l2 != null) {
                        c5565l2 = new C5565l(l2.longValue());
                    } else {
                        c5565l2 = null;
                    }
                    if (i7 >= 33) {
                        size = size2;
                        if (AbstractC5088l.metrica()) {
                            Log.w("CXCP", "Expected stream use case for " + abstractC0958l + ", " + c5565l2 + " cannot be set!");
                        }
                        c5565l2 = null;
                    } else {
                        size = size2;
                        if (AbstractC5088l.metrica()) {
                            Log.w("CXCP", "Expected stream use case for " + abstractC0958l + ", " + c5565l2 + " cannot be set!");
                        }
                        c5565l2 = null;
                    }
                    c5565l = c5565l2;
                } else {
                    size = size2;
                    c5565l = null;
                }
                if (z6) {
                    l = (Long) map2.get(abstractC0958l);
                    if (l != null) {
                        c5959l2 = new C5959l(l.longValue());
                    } else {
                        c5959l2 = null;
                    }
                    c5959l = c5959l2;
                } else {
                    c5959l = null;
                }
                abstractC2371lMopub = C13975l.mopub(i8, 544, c15617l, c4220l, c8259l4, c5565l, c5959l, size, str2);
                while (r6.hasNext()) {
                    c4069l3 = new C4069l(Collections.singletonList(abstractC2371lMopub));
                    linkedHashMap6.put(c4069l3, abstractC0958l2);
                    if (i5 != -1) {
                        linkedHashMap3 = linkedHashMap2;
                        list = (List) linkedHashMap3.get(Integer.valueOf(i5));
                        if (list == null) {
                            linkedHashMap3.put(Integer.valueOf(i5), AbstractC14055l.metrica(c4069l3));
                        } else {
                            list.add(c4069l3);
                        }
                    } else {
                        linkedHashMap3 = linkedHashMap2;
                    }
                    if (!AbstractC8576l.yandex(abstractC0958l2, abstractC0958l)) {
                    }
                    linkedHashMap2 = linkedHashMap3;
                    i5 = i5;
                }
                str3 = str4;
                c15617l3 = c15617l4;
                i3 = i4;
                z5 = z6;
                it = it2;
                linkedHashMap4 = linkedHashMap2;
                arrayList4 = arrayList3;
            }
            int i10 = i3;
            ArrayList arrayList5 = arrayList4;
            z3 = z5;
            linkedHashMap = linkedHashMap4;
            if (c10814l.subs == null || c4069l4 == null) {
                arrayList = arrayList5;
            } else {
                arrayList = arrayList5;
                arrayList.add(new C13228l(c4069l4, ((AbstractC2371l) AbstractC16901l.m4208abstract(c4069l4.yandex)).loadAd));
            }
            i2 = i10;
        } else {
            z2 = false;
            arrayList = arrayList4;
            z3 = z5;
            linkedHashMap = linkedHashMap4;
            i2 = 1;
        }
        C5849l c5849l = this.amazon;
        if (c5849l.yandex().yandex(CaptureSessionStuckQuirk.class) && AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "CameraPipe should be enabling CaptureSessionStuckQuirk by default");
        }
        boolean zIsVip = AbstractC16648l.isVip(Build.MODEL.toLowerCase(Locale.getDefault()), "cph", z2);
        C10379l c10379l = new C10379l((!z3 || AbstractC17919l.yandex(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class) == null) && AbstractC17919l.yandex(DisableAbortCapturesOnStopQuirk.class) == null && Build.VERSION.SDK_INT >= 30, new C14513l(c5849l.yandex().yandex(QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.class) ? 1 : 0, 1), zIsVip ? 1 : 0, ((CloseCameraDeviceOnCameraGraphCloseQuirk) this.isPro.f29441l) != null ? (CloseCameraDeviceOnCameraGraphCloseQuirk.crashlytics || !(!CloseCameraDeviceOnCameraGraphCloseQuirk.purchase || CloseCameraDeviceOnCameraGraphCloseQuirk.yandex || CloseCameraDeviceOnCameraGraphCloseQuirk.loadAd)) ? z3 : true : false, 9);
        if (c10814l != null) {
            C0665l c0665l2 = c10814l.mopub;
            Integer num3 = (Integer) c0665l2.loadAd.smaato(InterfaceC0048l.f918l, num2);
            Objects.requireNonNull(num3);
            int iIntValue = num3.intValue();
            Integer num4 = (Integer) c0665l2.loadAd.smaato(InterfaceC0048l.f921l, num2);
            Objects.requireNonNull(num4);
            int iIntValue2 = num4.intValue();
            if (iIntValue != 1 && iIntValue2 != 1) {
                if (iIntValue == 2) {
                    num2 = 2;
                } else if (iIntValue2 == 2) {
                    num2 = 1;
                } else {
                    num2 = null;
                }
            }
        } else {
            num2 = null;
        }
        Range rangeYandex = c10814l != null ? c10814l.mopub.yandex() : null;
        if (AbstractC8576l.yandex(rangeYandex, C5464l.admob)) {
            rangeYandex = null;
        }
        C17963l c17963l = new C17963l();
        if (z3) {
            c17963l.put(AbstractC12634l.crashlytics, Boolean.TRUE);
        }
        if (num2 != null) {
            c17963l.put(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(num2.intValue()));
        }
        c17963l.put(AbstractC12634l.loadAd, "android.hardware.camera2.CaptureRequest.setTag.CX");
        if (rangeYandex != null) {
            c17963l.put(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeYandex);
        }
        C17963l c17963lCrashlytics = c17963l.crashlytics();
        if (rangeYandex != null) {
            linkedHashMap5.put(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeYandex);
        }
        if (num2 != null) {
            linkedHashMap5.put(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, num2);
        }
        if (c10814l != null) {
            String str6 = (String) c10814l.mopub.loadAd.smaato(C16443l.f32154l, null);
            C14113l c14113l2 = c10814l.loadAd;
            if (c14113l2 != null) {
                AbstractC0958l abstractC0958l3 = c14113l2.yandex;
                if (str6 == null) {
                    str6 = null;
                }
                int i11 = c14113l2.crashlytics;
                Size size3 = abstractC0958l3.admob;
                int i12 = abstractC0958l3.subs;
                if (str6 == null) {
                    str = null;
                } else {
                    C10160l.yandex(str6);
                    str = str6;
                }
                if (i11 != 0) {
                    if (i11 != 1) {
                        c8259l2 = null;
                    } else {
                        c8259l = new C8259l(2);
                    }
                    c4069l2 = new C4069l(Collections.singletonList(C13975l.mopub(i12, 1000, null, null, c8259l2, null, null, size3, str)));
                    linkedHashMap6.put(c4069l2, abstractC0958l3);
                } else {
                    c8259l = new C8259l(1);
                }
                c8259l2 = c8259l;
                c4069l2 = new C4069l(Collections.singletonList(C13975l.mopub(i12, 1000, null, null, c8259l2, null, null, size3, str)));
                linkedHashMap6.put(c4069l2, abstractC0958l3);
            } else {
                c4069l2 = null;
            }
            c4069l = c4069l2;
        } else {
            c4069l = null;
        }
        C1276l c1276l = this.admob;
        if (c1276l != null) {
            arrayList2 = null;
            if (c1276l.f3327l.smaato(AbstractC16999l.yandex, null) != null) {
                C18725l.loadAd();
                return null;
            }
        } else {
            arrayList2 = null;
        }
        return new C8863l(new C7931l(this.crashlytics.loadAd, AbstractC16901l.m4213const(linkedHashMap6.keySet()), AbstractC16901l.m4213const(linkedHashMap.values()), arrayList.isEmpty() ? arrayList2 : arrayList, c4069l, i2, linkedHashMap5, i, c17963lCrashlytics, AbstractC14055l.remoteconfig(this.yandex, this.loadAd), AbstractC14055l.vip(c7686l), c10379l), AbstractC8676l.tapsense(linkedHashMap6));
    }
}

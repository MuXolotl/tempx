package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؓؒٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1557l {
    public final boolean Signature;
    public final C5979l ad;
    public final boolean adcel;
    public final ArrayList admob;
    public final boolean ads;
    public final C13283l advert;
    public final String amazon;
    public final C13198l applovin;
    public final ArrayList billing;
    public final InterfaceC7744l crashlytics;
    public final ArrayList firebase;
    public final ArrayList isPro;
    public final C1770l isVip;
    public C7179l license;
    public final InterfaceC2360l loadAd;
    public final boolean metrica;
    public final ArrayList mopub;
    public final C8634l premium;
    public final ArrayList pro;
    public final int purchase;
    public final ArrayList remoteconfig;
    public final C16222l signatures;
    public final LinkedHashMap smaato;
    public final boolean startapp;
    public final ArrayList subs;
    public final boolean subscription;
    public final boolean tapsense;
    public final ArrayList vip;
    public final InterfaceC5389l yandex;

    public C1557l(Context context, InterfaceC5389l interfaceC5389l, InterfaceC2360l interfaceC2360l, InterfaceC7744l interfaceC7744l) {
        boolean zTapsense;
        char c;
        char c2;
        this.yandex = interfaceC5389l;
        this.loadAd = interfaceC2360l;
        this.crashlytics = interfaceC7744l;
        C10861l c10861l = (C10861l) interfaceC5389l;
        String str = c10861l.f21960l;
        this.amazon = str;
        Integer num = (Integer) c10861l.crashlytics(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        int iIntValue = num != null ? num.intValue() : 2;
        this.purchase = iIntValue;
        ArrayList arrayList = new ArrayList();
        this.billing = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.mopub = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.admob = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.subs = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        this.isPro = arrayList5;
        this.firebase = new ArrayList();
        this.smaato = new LinkedHashMap();
        ArrayList arrayList6 = new ArrayList();
        this.remoteconfig = arrayList6;
        this.vip = new ArrayList();
        InterfaceC5389l.admob.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            InterfaceC5389l.admob.getClass();
            int[] iArr = (int[]) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
            zTapsense = AbstractC8669l.tapsense(iArr == null ? C11905l.loadAd : iArr, 2);
        } else {
            zTapsense = false;
        }
        this.tapsense = zTapsense;
        this.pro = new ArrayList();
        this.ad = isPro();
        ExtraSupportedSurfaceCombinationsQuirk extraSupportedSurfaceCombinationsQuirk = (ExtraSupportedSurfaceCombinationsQuirk) AbstractC17919l.yandex(ExtraSupportedSurfaceCombinationsQuirk.class);
        this.advert = C13283l.mopub.crashlytics(context);
        this.isVip = new C1770l(25);
        this.signatures = new C16222l(12);
        C8634l c8634l = new C8634l(interfaceC5389l);
        this.premium = c8634l;
        this.applovin = new C13198l(interfaceC5389l);
        int[] iArr2 = (int[]) c10861l.crashlytics(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr2 != null) {
            this.metrica = AbstractC8669l.tapsense(iArr2, 3);
            this.startapp = AbstractC8669l.tapsense(iArr2, 6);
            this.subscription = AbstractC8669l.tapsense(iArr2, 16);
            this.Signature = AbstractC8669l.tapsense(iArr2, 1);
        }
        boolean z = this.metrica;
        boolean z2 = this.startapp;
        C8688l c8688l = AbstractC2094l.yandex;
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        C13476l c13476l = new C13476l();
        EnumC18632l enumC18632l = C2483l.purchase;
        boolean z3 = zTapsense;
        EnumC7005l enumC7005l = EnumC7005l.MAXIMUM;
        EnumC13290l enumC13290l = EnumC13290l.f26074l;
        C13476l c13476lMetrica = AbstractC2812l.metrica(enumC13290l, enumC7005l, c13476l, arrayList8, c13476l);
        EnumC13290l enumC13290l2 = EnumC13290l.f26072l;
        C13476l c13476lMetrica2 = AbstractC2812l.metrica(enumC13290l2, enumC7005l, c13476lMetrica, arrayList8, c13476lMetrica);
        EnumC13290l enumC13290l3 = EnumC13290l.f26073l;
        C13476l c13476lMetrica3 = AbstractC2812l.metrica(enumC13290l3, enumC7005l, c13476lMetrica2, arrayList8, c13476lMetrica2);
        EnumC7005l enumC7005l2 = EnumC7005l.PREVIEW;
        AbstractC2812l.ad(enumC13290l, enumC7005l2, c13476lMetrica3, enumC13290l2, enumC7005l);
        C13476l c13476lStartapp = AbstractC2812l.startapp(arrayList8, c13476lMetrica3);
        AbstractC2812l.ad(enumC13290l3, enumC7005l2, c13476lStartapp, enumC13290l2, enumC7005l);
        C13476l c13476lStartapp2 = AbstractC2812l.startapp(arrayList8, c13476lStartapp);
        AbstractC2812l.ad(enumC13290l, enumC7005l2, c13476lStartapp2, enumC13290l, enumC7005l2);
        C13476l c13476lStartapp3 = AbstractC2812l.startapp(arrayList8, c13476lStartapp2);
        AbstractC2812l.ad(enumC13290l, enumC7005l2, c13476lStartapp3, enumC13290l3, enumC7005l2);
        C13476l c13476lStartapp4 = AbstractC2812l.startapp(arrayList8, c13476lStartapp3);
        AbstractC2812l.ad(enumC13290l, enumC7005l2, c13476lStartapp4, enumC13290l3, enumC7005l2);
        c13476lStartapp4.yandex(C2582l.tapsense(enumC13290l2, enumC7005l));
        arrayList8.add(c13476lStartapp4);
        arrayList7.addAll(arrayList8);
        if (iIntValue == 0 || iIntValue == 1 || iIntValue == 3 || iIntValue == 4) {
            ArrayList arrayList9 = new ArrayList();
            C13476l c13476l2 = new C13476l();
            c13476l2.yandex(C2582l.tapsense(enumC13290l, enumC7005l2));
            EnumC7005l enumC7005l3 = EnumC7005l.RECORD;
            C13476l c13476lMetrica4 = AbstractC2812l.metrica(enumC13290l, enumC7005l3, c13476l2, arrayList9, c13476l2);
            AbstractC2812l.ad(enumC13290l, enumC7005l2, c13476lMetrica4, enumC13290l3, enumC7005l3);
            C13476l c13476lStartapp5 = AbstractC2812l.startapp(arrayList9, c13476lMetrica4);
            AbstractC2812l.ad(enumC13290l3, enumC7005l2, c13476lStartapp5, enumC13290l3, enumC7005l3);
            C13476l c13476lStartapp6 = AbstractC2812l.startapp(arrayList9, c13476lStartapp5);
            AbstractC2812l.ad(enumC13290l, enumC7005l2, c13476lStartapp6, enumC13290l, enumC7005l3);
            C13476l c13476lMetrica5 = AbstractC2812l.metrica(enumC13290l2, enumC7005l3, c13476lStartapp6, arrayList9, c13476lStartapp6);
            AbstractC2812l.ad(enumC13290l, enumC7005l2, c13476lMetrica5, enumC13290l3, enumC7005l3);
            C13476l c13476lMetrica6 = AbstractC2812l.metrica(enumC13290l2, enumC7005l3, c13476lMetrica5, arrayList9, c13476lMetrica5);
            AbstractC2812l.ad(enumC13290l3, enumC7005l2, c13476lMetrica6, enumC13290l3, enumC7005l2);
            c13476lMetrica6.yandex(C2582l.tapsense(enumC13290l2, enumC7005l));
            arrayList9.add(c13476lMetrica6);
            arrayList7.addAll(arrayList9);
        }
        if (iIntValue == 1 || iIntValue == 3) {
            ArrayList arrayList10 = new ArrayList();
            C13476l c13476l3 = new C13476l();
            AbstractC2812l.ad(enumC13290l, enumC7005l2, c13476l3, enumC13290l, enumC7005l);
            C13476l c13476lStartapp7 = AbstractC2812l.startapp(arrayList10, c13476l3);
            AbstractC2812l.ad(enumC13290l, enumC7005l2, c13476lStartapp7, enumC13290l3, enumC7005l);
            C13476l c13476lStartapp8 = AbstractC2812l.startapp(arrayList10, c13476lStartapp7);
            AbstractC2812l.ad(enumC13290l3, enumC7005l2, c13476lStartapp8, enumC13290l3, enumC7005l);
            C13476l c13476lStartapp9 = AbstractC2812l.startapp(arrayList10, c13476lStartapp8);
            AbstractC2812l.ad(enumC13290l, enumC7005l2, c13476lStartapp9, enumC13290l, enumC7005l2);
            C13476l c13476lMetrica7 = AbstractC2812l.metrica(enumC13290l2, enumC7005l, c13476lStartapp9, arrayList10, c13476lStartapp9);
            EnumC7005l enumC7005l4 = EnumC7005l.VGA;
            AbstractC2812l.ad(enumC13290l3, enumC7005l4, c13476lMetrica7, enumC13290l, enumC7005l2);
            C13476l c13476lMetrica8 = AbstractC2812l.metrica(enumC13290l3, enumC7005l, c13476lMetrica7, arrayList10, c13476lMetrica7);
            AbstractC2812l.ad(enumC13290l3, enumC7005l4, c13476lMetrica8, enumC13290l3, enumC7005l2);
            c13476lMetrica8.yandex(C2582l.tapsense(enumC13290l3, enumC7005l));
            arrayList10.add(c13476lMetrica8);
            arrayList7.addAll(arrayList10);
        }
        EnumC13290l enumC13290l4 = EnumC13290l.f26075l;
        if (z) {
            ArrayList arrayList11 = new ArrayList();
            C13476l c13476l4 = new C13476l();
            C13476l c13476lMetrica9 = AbstractC2812l.metrica(enumC13290l4, enumC7005l, c13476l4, arrayList11, c13476l4);
            AbstractC2812l.ad(enumC13290l, enumC7005l2, c13476lMetrica9, enumC13290l4, enumC7005l);
            C13476l c13476lStartapp10 = AbstractC2812l.startapp(arrayList11, c13476lMetrica9);
            AbstractC2812l.ad(enumC13290l3, enumC7005l2, c13476lStartapp10, enumC13290l4, enumC7005l);
            C13476l c13476lStartapp11 = AbstractC2812l.startapp(arrayList11, c13476lStartapp10);
            AbstractC2812l.ad(enumC13290l, enumC7005l2, c13476lStartapp11, enumC13290l, enumC7005l2);
            C13476l c13476lMetrica10 = AbstractC2812l.metrica(enumC13290l4, enumC7005l, c13476lStartapp11, arrayList11, c13476lStartapp11);
            AbstractC2812l.ad(enumC13290l, enumC7005l2, c13476lMetrica10, enumC13290l3, enumC7005l2);
            C13476l c13476lMetrica11 = AbstractC2812l.metrica(enumC13290l4, enumC7005l, c13476lMetrica10, arrayList11, c13476lMetrica10);
            AbstractC2812l.ad(enumC13290l3, enumC7005l2, c13476lMetrica11, enumC13290l3, enumC7005l2);
            C13476l c13476lMetrica12 = AbstractC2812l.metrica(enumC13290l4, enumC7005l, c13476lMetrica11, arrayList11, c13476lMetrica11);
            AbstractC2812l.ad(enumC13290l, enumC7005l2, c13476lMetrica12, enumC13290l2, enumC7005l);
            C13476l c13476lMetrica13 = AbstractC2812l.metrica(enumC13290l4, enumC7005l, c13476lMetrica12, arrayList11, c13476lMetrica12);
            AbstractC2812l.ad(enumC13290l3, enumC7005l2, c13476lMetrica13, enumC13290l2, enumC7005l);
            c13476lMetrica13.yandex(C2582l.tapsense(enumC13290l4, enumC7005l));
            arrayList11.add(c13476lMetrica13);
            arrayList7.addAll(arrayList11);
        }
        if (z2 && iIntValue == 0) {
            ArrayList arrayList12 = new ArrayList();
            C13476l c13476l5 = new C13476l();
            AbstractC2812l.ad(enumC13290l, enumC7005l2, c13476l5, enumC13290l, enumC7005l);
            C13476l c13476lStartapp12 = AbstractC2812l.startapp(arrayList12, c13476l5);
            AbstractC2812l.ad(enumC13290l, enumC7005l2, c13476lStartapp12, enumC13290l3, enumC7005l);
            C13476l c13476lStartapp13 = AbstractC2812l.startapp(arrayList12, c13476lStartapp12);
            AbstractC2812l.ad(enumC13290l3, enumC7005l2, c13476lStartapp13, enumC13290l3, enumC7005l);
            arrayList12.add(c13476lStartapp13);
            arrayList7.addAll(arrayList12);
        }
        if (iIntValue == 3) {
            ArrayList arrayList13 = new ArrayList();
            C13476l c13476l6 = new C13476l();
            c13476l6.yandex(C2582l.tapsense(enumC13290l, enumC7005l2));
            EnumC7005l enumC7005l5 = EnumC7005l.VGA;
            AbstractC2812l.ad(enumC13290l, enumC7005l5, c13476l6, enumC13290l3, enumC7005l);
            C13476l c13476lMetrica14 = AbstractC2812l.metrica(enumC13290l4, enumC7005l, c13476l6, arrayList13, c13476l6);
            AbstractC2812l.ad(enumC13290l, enumC7005l2, c13476lMetrica14, enumC13290l, enumC7005l5);
            AbstractC2812l.ad(enumC13290l2, enumC7005l, c13476lMetrica14, enumC13290l4, enumC7005l);
            arrayList13.add(c13476lMetrica14);
            arrayList7.addAll(arrayList13);
        }
        arrayList2.addAll(arrayList7);
        C2580l c2580l = C2580l.f5619l;
        List listSingletonList = c2580l;
        if (extraSupportedSurfaceCombinationsQuirk != null) {
            C13476l c13476l7 = ExtraSupportedSurfaceCombinationsQuirk.yandex;
            String str2 = Build.DEVICE;
            if ("heroqltevzw".equalsIgnoreCase(str2) || "heroqltetmo".equalsIgnoreCase(str2)) {
                ArrayList arrayList14 = new ArrayList();
                listSingletonList = arrayList14;
                if (str.equals("1")) {
                    arrayList14.add(ExtraSupportedSurfaceCombinationsQuirk.yandex);
                    listSingletonList = arrayList14;
                }
            } else if (AbstractC16357l.billing() || AbstractC16357l.mopub()) {
                listSingletonList = c2580l;
                listSingletonList = Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.loadAd);
            }
        }
        listSingletonList = c2580l;
        arrayList2.addAll(listSingletonList);
        if (this.subscription) {
            ArrayList arrayList15 = new ArrayList();
            C13476l c13476l8 = new C13476l();
            EnumC7005l enumC7005l6 = EnumC7005l.ULTRA_MAXIMUM;
            AbstractC2812l.ad(enumC13290l3, enumC7005l6, c13476l8, enumC13290l, enumC7005l2);
            EnumC7005l enumC7005l7 = EnumC7005l.RECORD;
            C13476l c13476lMetrica15 = AbstractC2812l.metrica(enumC13290l, enumC7005l7, c13476l8, arrayList15, c13476l8);
            AbstractC2812l.ad(enumC13290l2, enumC7005l6, c13476lMetrica15, enumC13290l, enumC7005l2);
            C13476l c13476lMetrica16 = AbstractC2812l.metrica(enumC13290l, enumC7005l7, c13476lMetrica15, arrayList15, c13476lMetrica15);
            AbstractC2812l.ad(enumC13290l4, enumC7005l6, c13476lMetrica16, enumC13290l, enumC7005l2);
            C13476l c13476lMetrica17 = AbstractC2812l.metrica(enumC13290l, enumC7005l7, c13476lMetrica16, arrayList15, c13476lMetrica16);
            AbstractC2812l.ad(enumC13290l3, enumC7005l6, c13476lMetrica17, enumC13290l, enumC7005l2);
            C13476l c13476lMetrica18 = AbstractC2812l.metrica(enumC13290l2, enumC7005l, c13476lMetrica17, arrayList15, c13476lMetrica17);
            AbstractC2812l.ad(enumC13290l2, enumC7005l6, c13476lMetrica18, enumC13290l, enumC7005l2);
            C13476l c13476lMetrica19 = AbstractC2812l.metrica(enumC13290l2, enumC7005l, c13476lMetrica18, arrayList15, c13476lMetrica18);
            AbstractC2812l.ad(enumC13290l4, enumC7005l6, c13476lMetrica19, enumC13290l, enumC7005l2);
            C13476l c13476lMetrica20 = AbstractC2812l.metrica(enumC13290l2, enumC7005l, c13476lMetrica19, arrayList15, c13476lMetrica19);
            AbstractC2812l.ad(enumC13290l3, enumC7005l6, c13476lMetrica20, enumC13290l, enumC7005l2);
            C13476l c13476lMetrica21 = AbstractC2812l.metrica(enumC13290l3, enumC7005l, c13476lMetrica20, arrayList15, c13476lMetrica20);
            AbstractC2812l.ad(enumC13290l2, enumC7005l6, c13476lMetrica21, enumC13290l, enumC7005l2);
            C13476l c13476lMetrica22 = AbstractC2812l.metrica(enumC13290l3, enumC7005l, c13476lMetrica21, arrayList15, c13476lMetrica21);
            AbstractC2812l.ad(enumC13290l4, enumC7005l6, c13476lMetrica22, enumC13290l, enumC7005l2);
            C13476l c13476lMetrica23 = AbstractC2812l.metrica(enumC13290l3, enumC7005l, c13476lMetrica22, arrayList15, c13476lMetrica22);
            AbstractC2812l.ad(enumC13290l3, enumC7005l6, c13476lMetrica23, enumC13290l, enumC7005l2);
            C13476l c13476lMetrica24 = AbstractC2812l.metrica(enumC13290l4, enumC7005l, c13476lMetrica23, arrayList15, c13476lMetrica23);
            AbstractC2812l.ad(enumC13290l2, enumC7005l6, c13476lMetrica24, enumC13290l, enumC7005l2);
            C13476l c13476lMetrica25 = AbstractC2812l.metrica(enumC13290l4, enumC7005l, c13476lMetrica24, arrayList15, c13476lMetrica24);
            AbstractC2812l.ad(enumC13290l4, enumC7005l6, c13476lMetrica25, enumC13290l, enumC7005l2);
            c13476lMetrica25.yandex(C2582l.tapsense(enumC13290l4, enumC7005l));
            arrayList15.add(c13476lMetrica25);
            arrayList4.addAll(arrayList15);
        }
        boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
        this.adcel = zHasSystemFeature;
        if (zHasSystemFeature) {
            ArrayList arrayList16 = new ArrayList();
            C13476l c13476l9 = new C13476l();
            EnumC7005l enumC7005l8 = EnumC7005l.S1440P_4_3;
            C13476l c13476lMetrica26 = AbstractC2812l.metrica(enumC13290l3, enumC7005l8, c13476l9, arrayList16, c13476l9);
            C13476l c13476lMetrica27 = AbstractC2812l.metrica(enumC13290l, enumC7005l8, c13476lMetrica26, arrayList16, c13476lMetrica26);
            C13476l c13476lMetrica28 = AbstractC2812l.metrica(enumC13290l2, enumC7005l8, c13476lMetrica27, arrayList16, c13476lMetrica27);
            EnumC7005l enumC7005l9 = EnumC7005l.S720P_16_9;
            AbstractC2812l.ad(enumC13290l3, enumC7005l9, c13476lMetrica28, enumC13290l2, enumC7005l8);
            C13476l c13476lStartapp14 = AbstractC2812l.startapp(arrayList16, c13476lMetrica28);
            AbstractC2812l.ad(enumC13290l, enumC7005l9, c13476lStartapp14, enumC13290l2, enumC7005l8);
            C13476l c13476lStartapp15 = AbstractC2812l.startapp(arrayList16, c13476lStartapp14);
            AbstractC2812l.ad(enumC13290l3, enumC7005l9, c13476lStartapp15, enumC13290l3, enumC7005l8);
            C13476l c13476lStartapp16 = AbstractC2812l.startapp(arrayList16, c13476lStartapp15);
            AbstractC2812l.ad(enumC13290l3, enumC7005l9, c13476lStartapp16, enumC13290l, enumC7005l8);
            C13476l c13476lStartapp17 = AbstractC2812l.startapp(arrayList16, c13476lStartapp16);
            AbstractC2812l.ad(enumC13290l, enumC7005l9, c13476lStartapp17, enumC13290l3, enumC7005l8);
            C13476l c13476lStartapp18 = AbstractC2812l.startapp(arrayList16, c13476lStartapp17);
            AbstractC2812l.ad(enumC13290l, enumC7005l9, c13476lStartapp18, enumC13290l, enumC7005l8);
            arrayList16.add(c13476lStartapp18);
            arrayList.addAll(arrayList16);
        }
        if (c8634l.f17793l) {
            C13476l c13476l10 = new C13476l();
            c13476l10.yandex(C2582l.tapsense(enumC13290l, enumC7005l));
            Unit unit = Unit.INSTANCE;
            C13476l c13476l11 = new C13476l();
            c13476l11.yandex(C2582l.tapsense(enumC13290l3, enumC7005l));
            C13476l c13476l12 = new C13476l();
            c13476l12.yandex(C2582l.tapsense(enumC13290l, enumC7005l2));
            c13476l12.yandex(C2582l.tapsense(enumC13290l2, enumC7005l));
            C13476l c13476l13 = new C13476l();
            c13476l13.yandex(C2582l.tapsense(enumC13290l, enumC7005l2));
            c13476l13.yandex(C2582l.tapsense(enumC13290l3, enumC7005l));
            C13476l c13476l14 = new C13476l();
            c13476l14.yandex(C2582l.tapsense(enumC13290l3, enumC7005l2));
            c13476l14.yandex(C2582l.tapsense(enumC13290l3, enumC7005l));
            C13476l c13476l15 = new C13476l();
            c13476l15.yandex(C2582l.tapsense(enumC13290l, enumC7005l2));
            EnumC7005l enumC7005l10 = EnumC7005l.RECORD;
            c = 7;
            c13476l15.yandex(C2582l.tapsense(enumC13290l, enumC7005l10));
            C13476l c13476l16 = new C13476l();
            AbstractC2812l.ad(enumC13290l, enumC7005l2, c13476l16, enumC13290l, enumC7005l10);
            c2 = 5;
            c13476l16.yandex(C2582l.tapsense(enumC13290l3, enumC7005l10));
            C13476l c13476l17 = new C13476l();
            AbstractC2812l.ad(enumC13290l, enumC7005l2, c13476l17, enumC13290l, enumC7005l10);
            c13476l17.yandex(C2582l.tapsense(enumC13290l2, enumC7005l10));
            arrayList6.addAll(AbstractC14055l.remoteconfig(c13476l10, c13476l11, c13476l12, c13476l13, c13476l14, c13476l15, c13476l16, c13476l17));
        } else {
            c = 7;
            c2 = 5;
        }
        if (z3) {
            ArrayList arrayList17 = new ArrayList();
            C13476l c13476l18 = new C13476l();
            EnumC7005l enumC7005l11 = EnumC7005l.S1440P_4_3;
            C13476l c13476lMetrica29 = AbstractC2812l.metrica(enumC13290l, enumC7005l11, c13476l18, arrayList17, c13476l18);
            C13476l c13476lMetrica30 = AbstractC2812l.metrica(enumC13290l3, enumC7005l11, c13476lMetrica29, arrayList17, c13476lMetrica29);
            AbstractC2812l.ad(enumC13290l, enumC7005l11, c13476lMetrica30, enumC13290l2, enumC7005l);
            C13476l c13476lStartapp19 = AbstractC2812l.startapp(arrayList17, c13476lMetrica30);
            AbstractC2812l.ad(enumC13290l3, enumC7005l11, c13476lStartapp19, enumC13290l2, enumC7005l);
            C13476l c13476lStartapp20 = AbstractC2812l.startapp(arrayList17, c13476lStartapp19);
            AbstractC2812l.ad(enumC13290l, enumC7005l11, c13476lStartapp20, enumC13290l3, enumC7005l);
            C13476l c13476lStartapp21 = AbstractC2812l.startapp(arrayList17, c13476lStartapp20);
            AbstractC2812l.ad(enumC13290l3, enumC7005l11, c13476lStartapp21, enumC13290l3, enumC7005l);
            C13476l c13476lStartapp22 = AbstractC2812l.startapp(arrayList17, c13476lStartapp21);
            AbstractC2812l.ad(enumC13290l, enumC7005l2, c13476lStartapp22, enumC13290l, enumC7005l11);
            C13476l c13476lStartapp23 = AbstractC2812l.startapp(arrayList17, c13476lStartapp22);
            AbstractC2812l.ad(enumC13290l3, enumC7005l2, c13476lStartapp23, enumC13290l, enumC7005l11);
            C13476l c13476lStartapp24 = AbstractC2812l.startapp(arrayList17, c13476lStartapp23);
            AbstractC2812l.ad(enumC13290l, enumC7005l2, c13476lStartapp24, enumC13290l3, enumC7005l11);
            C13476l c13476lStartapp25 = AbstractC2812l.startapp(arrayList17, c13476lStartapp24);
            AbstractC2812l.ad(enumC13290l3, enumC7005l2, c13476lStartapp25, enumC13290l3, enumC7005l11);
            arrayList17.add(c13476lStartapp25);
            arrayList5.addAll(arrayList17);
        }
        boolean zAmazon = AbstractC18386l.amazon(interfaceC5389l);
        this.ads = zAmazon;
        if (zAmazon && Build.VERSION.SDK_INT >= 33) {
            C13476l c13476l19 = new C13476l();
            EnumC7005l enumC7005l12 = EnumC7005l.S1440P_4_3;
            EnumC18632l enumC18632l2 = EnumC18632l.PREVIEW_VIDEO_STILL;
            c13476l19.yandex(new C2483l(enumC13290l, enumC7005l12, enumC18632l2));
            Unit unit2 = Unit.INSTANCE;
            C13476l c13476l20 = new C13476l();
            c13476l20.yandex(new C2483l(enumC13290l3, enumC7005l12, enumC18632l2));
            C13476l c13476l21 = new C13476l();
            EnumC7005l enumC7005l13 = EnumC7005l.RECORD;
            EnumC18632l enumC18632l3 = EnumC18632l.VIDEO_RECORD;
            c13476l21.yandex(new C2483l(enumC13290l, enumC7005l13, enumC18632l3));
            C13476l c13476l22 = new C13476l();
            c13476l22.yandex(new C2483l(enumC13290l3, enumC7005l13, enumC18632l3));
            C13476l c13476l23 = new C13476l();
            EnumC18632l enumC18632l4 = EnumC18632l.STILL_CAPTURE;
            c13476l23.yandex(new C2483l(enumC13290l2, enumC7005l, enumC18632l4));
            C13476l c13476l24 = new C13476l();
            c13476l24.yandex(new C2483l(enumC13290l3, enumC7005l, enumC18632l4));
            C13476l c13476l25 = new C13476l();
            EnumC18632l enumC18632l5 = EnumC18632l.PREVIEW;
            c13476l25.yandex(new C2483l(enumC13290l, enumC7005l2, enumC18632l5));
            c13476l25.yandex(new C2483l(enumC13290l2, enumC7005l, enumC18632l4));
            C13476l c13476l26 = new C13476l();
            c13476l26.yandex(new C2483l(enumC13290l, enumC7005l2, enumC18632l5));
            c13476l26.yandex(new C2483l(enumC13290l3, enumC7005l, enumC18632l4));
            C13476l c13476l27 = new C13476l();
            c13476l27.yandex(new C2483l(enumC13290l, enumC7005l2, enumC18632l5));
            c13476l27.yandex(new C2483l(enumC13290l, enumC7005l13, enumC18632l3));
            C13476l c13476l28 = new C13476l();
            c13476l28.yandex(new C2483l(enumC13290l, enumC7005l2, enumC18632l5));
            c13476l28.yandex(new C2483l(enumC13290l3, enumC7005l13, enumC18632l3));
            C13476l c13476l29 = new C13476l();
            c13476l29.yandex(new C2483l(enumC13290l, enumC7005l2, enumC18632l5));
            c13476l29.yandex(new C2483l(enumC13290l3, enumC7005l2, enumC18632l5));
            C13476l c13476l30 = new C13476l();
            c13476l30.yandex(new C2483l(enumC13290l, enumC7005l2, enumC18632l5));
            c13476l30.yandex(new C2483l(enumC13290l, enumC7005l13, enumC18632l3));
            c13476l30.yandex(new C2483l(enumC13290l2, enumC7005l13, enumC18632l4));
            C13476l c13476l31 = new C13476l();
            c13476l31.yandex(new C2483l(enumC13290l, enumC7005l2, enumC18632l5));
            c13476l31.yandex(new C2483l(enumC13290l3, enumC7005l13, enumC18632l3));
            c13476l31.yandex(new C2483l(enumC13290l2, enumC7005l13, enumC18632l4));
            C13476l c13476l32 = new C13476l();
            c13476l32.yandex(new C2483l(enumC13290l, enumC7005l2, enumC18632l5));
            c13476l32.yandex(new C2483l(enumC13290l3, enumC7005l2, enumC18632l5));
            c13476l32.yandex(new C2483l(enumC13290l2, enumC7005l, enumC18632l4));
            C13476l[] c13476lArr = new C13476l[14];
            c13476lArr[0] = c13476l19;
            c13476lArr[1] = c13476l20;
            c13476lArr[2] = c13476l21;
            c13476lArr[3] = c13476l22;
            c13476lArr[r1] = c13476l23;
            c13476lArr[c2] = c13476l24;
            c13476lArr[6] = c13476l25;
            c13476lArr[c] = c13476l26;
            c13476lArr[8] = c13476l27;
            c13476lArr[9] = c13476l28;
            c13476lArr[10] = c13476l29;
            c13476lArr[11] = c13476l30;
            c13476lArr[12] = c13476l31;
            c13476lArr[13] = c13476l32;
            arrayList3.addAll(AbstractC14055l.remoteconfig(c13476lArr));
        }
        loadAd();
    }

    public static int admob(Range range) {
        return (((Number) range.getUpper()).intValue() - ((Number) range.getLower()).intValue()) + 1;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cd  */
    public static Range crashlytics(Range range, int i, Range[] rangeArr) {
        Range range2 = C5464l.admob;
        if (AbstractC8576l.yandex(range, range2) || rangeArr == null) {
            return range2;
        }
        Range range3 = new Range(Integer.valueOf(Math.min(((Number) range.getLower()).intValue(), i)), Integer.valueOf(Math.min(((Number) range.getUpper()).intValue(), i)));
        int iAdmob = 0;
        for (Range range4 : rangeArr) {
            if (i >= ((Number) range4.getLower()).intValue()) {
                if (AbstractC8576l.yandex(range2, C5464l.admob)) {
                    range2 = range4;
                }
                if (range4.equals(range3)) {
                    return range4;
                }
                try {
                    int iAdmob2 = admob(range4.intersect(range3));
                    if (iAdmob == 0) {
                        range2 = range4;
                        iAdmob = iAdmob2;
                    } else if (iAdmob2 >= iAdmob) {
                        double dAdmob = admob(range2.intersect(range3));
                        double dAdmob2 = admob(range4.intersect(range3));
                        double dAdmob3 = dAdmob2 / ((double) admob(range4));
                        double dAdmob4 = dAdmob / ((double) admob(range2));
                        if (dAdmob2 > dAdmob) {
                            if (dAdmob3 >= 0.5d || dAdmob3 >= dAdmob4) {
                                range2 = range4;
                            }
                        } else if (dAdmob2 == dAdmob) {
                            if (dAdmob3 > dAdmob4 || (dAdmob3 == dAdmob4 && ((Number) range4.getLower()).intValue() > ((Number) range2.getLower()).intValue())) {
                                range2 = range4;
                            }
                        } else if (dAdmob4 < 0.5d && dAdmob3 > dAdmob4) {
                            range2 = range4;
                        }
                        iAdmob = admob(range3.intersect(range2));
                    }
                } catch (IllegalArgumentException unused) {
                    if (iAdmob == 0 && (mopub(range4, range3) < mopub(range2, range3) || (mopub(range4, range3) == mopub(range2, range3) && (((Number) range4.getLower()).intValue() > ((Number) range2.getUpper()).intValue() || admob(range4) < admob(range2))))) {
                        range2 = range4;
                    }
                }
            }
        }
        return range2;
    }

    public static int mopub(Range range, Range range2) {
        if (!range.contains(range2.getUpper()) && !range.contains(range2.getLower())) {
            return ((Number) range.getLower()).intValue() > ((Number) range2.getUpper()).intValue() ? ((Number) range.getLower()).intValue() - ((Number) range2.getUpper()).intValue() : ((Number) range2.getLower()).intValue() - ((Number) range.getUpper()).intValue();
        }
        C8339l.metrica("Ranges must not intersect");
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0010  */
    public static Size purchase(StreamConfigurationMap streamConfigurationMap, int i, boolean z, Rational rational) {
        Object c18435l;
        Object outputSizes;
        try {
            if (i == 34) {
                if (streamConfigurationMap != null) {
                    outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                } else {
                    outputSizes = null;
                }
            } else if (streamConfigurationMap != null) {
                outputSizes = streamConfigurationMap.getOutputSizes(i);
            } else {
                outputSizes = null;
            }
            c18435l = outputSizes;
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        if (c18435l instanceof C18435l) {
            c18435l = null;
        }
        Size[] sizeArr = (Size[]) c18435l;
        if (sizeArr == null) {
            sizeArr = null;
        } else if (rational != null) {
            ArrayList arrayList = new ArrayList();
            for (Size size : sizeArr) {
                Rational rational2 = AbstractC14608l.yandex;
                if (AbstractC14608l.yandex(size, rational, AbstractC5513l.crashlytics)) {
                    arrayList.add(size);
                }
            }
            sizeArr = (Size[]) arrayList.toArray(new Size[0]);
        }
        if (sizeArr == null || sizeArr.length == 0) {
            return null;
        }
        C16027l c16027l = new C16027l(false);
        Size size2 = (Size) Collections.max(Arrays.asList(sizeArr), c16027l);
        Size size3 = AbstractC5513l.yandex;
        if (z) {
            Size[] highResolutionOutputSizes = streamConfigurationMap != null ? streamConfigurationMap.getHighResolutionOutputSizes(i) : null;
            if (highResolutionOutputSizes != null && highResolutionOutputSizes.length != 0) {
                size3 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), c16027l);
            }
        }
        return (Size) Collections.max(AbstractC14055l.remoteconfig(size2, size3), c16027l);
    }

    public static Range vip(Range range, Range range2, boolean z) {
        Range range3 = C5464l.admob;
        if (AbstractC8576l.yandex(range2, range3) && AbstractC8576l.yandex(range, range3)) {
            return range3;
        }
        if (AbstractC8576l.yandex(range2, range3)) {
            return range;
        }
        if (AbstractC8576l.yandex(range, range3)) {
            return range2;
        }
        if (z) {
            AbstractC5641l.purchase("All targetFrameRate should be the same if strict fps is required", AbstractC8576l.yandex(range, range2));
            return range;
        }
        try {
            return range2.intersect(range);
        } catch (IllegalArgumentException unused) {
            return range2;
        }
    }

    public final void adcel(LinkedHashMap linkedHashMap, Size size, int i) {
        if (this.adcel) {
            Size sizePurchase = purchase((StreamConfigurationMap) this.ad.crashlytics.f16631l, i, false, null);
            Integer numValueOf = Integer.valueOf(i);
            if (sizePurchase != null) {
                size = (Size) Collections.min(AbstractC14055l.remoteconfig(size, sizePurchase), new C16027l(false));
            }
            linkedHashMap.put(numValueOf, size);
        }
    }

    public final void ads(C14591l c14591l) {
        int i = c14591l.yandex;
        boolean z = c14591l.mopub;
        String str = "CONCURRENT_CAMERA";
        String str2 = this.amazon;
        if (i != 0 && c14591l.purchase) {
            StringBuilder sbIsVip = AbstractC5020l.isVip("Camera device Id is ", str2, ". Ultra HDR is not currently supported in ");
            if (i != 1) {
                str = i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            C10754l.metrica(AbstractC0653l.ads(sbIsVip, str, " camera mode."));
            return;
        }
        if (i != 0 && c14591l.loadAd == 10) {
            StringBuilder sbIsVip2 = AbstractC5020l.isVip("Camera device Id is ", str2, ". 10 bit dynamic range is not currently supported in ");
            if (i != 1) {
                str = i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            C10754l.metrica(AbstractC0653l.ads(sbIsVip2, str, " camera mode."));
            return;
        }
        if (i != 0 && z) {
            StringBuilder sbIsVip3 = AbstractC5020l.isVip("Camera device Id is ", str2, ". feature combination is not currently supported in ");
            if (i != 1) {
                str = i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            C10754l.metrica(AbstractC0653l.ads(sbIsVip3, str, " camera mode."));
            return;
        }
        boolean z2 = c14591l.billing;
        if (z2 && z) {
            C8339l.metrica("High-speed session is not supported with feature combination");
        } else {
            if (!z2 || ((Boolean) this.applovin.loadAd.getValue()).booleanValue()) {
                return;
            }
            C8339l.metrica("High-speed session is not supported on this device.");
        }
    }

    public final int amazon(int i, Size size, boolean z, int i2) {
        long jMo2228else;
        int iIntValue = 0;
        if (!z) {
            try {
                jMo2228else = isPro().crashlytics.mo2228else(i, size);
            } catch (RuntimeException e) {
                if (AbstractC5088l.metrica()) {
                    Log.w("CXCP", "Unable to get min frame duration for format = " + i + " and size = " + size, e);
                }
                jMo2228else = 0;
            }
            if (jMo2228else > 0) {
                iIntValue = (int) (1.0E9d / jMo2228else);
            } else if (!this.Signature) {
                iIntValue = Alert.DURATION_SHOW_INDEFINITELY;
            } else if (AbstractC5088l.metrica()) {
                Log.w("CXCP", "minFrameDuration: " + jMo2228else + " is invalid for imageFormat = " + i + ", size = " + size);
            }
        } else {
            if (i != 34) {
                C8339l.smaato("Check failed.");
                return 0;
            }
            List listCrashlytics = this.applovin.crashlytics(size);
            if (listCrashlytics.isEmpty()) {
                listCrashlytics = null;
            }
            if (listCrashlytics == null) {
                AbstractC5088l.tapsense("HighSpeedResolver", "No supported high speed  fps for " + size);
            } else {
                Iterator it = listCrashlytics.iterator();
                if (!it.hasNext()) {
                    C4875l.firebase();
                    return 0;
                }
                Integer num = (Integer) ((Range) it.next()).getUpper();
                while (it.hasNext()) {
                    Integer num2 = (Integer) ((Range) it.next()).getUpper();
                    if (num.compareTo(num2) < 0) {
                        num = num2;
                    }
                }
                iIntValue = num.intValue();
            }
        }
        return Math.min(i2, iIntValue);
    }

    public final List billing(C14591l c14591l, ArrayList arrayList, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        C6916l c6916l = AbstractC18386l.yandex;
        if (c14591l.yandex == 0 && c14591l.loadAd == 8 && !c14591l.billing) {
            Iterator it = this.admob.iterator();
            while (it.hasNext()) {
                List listCrashlytics = ((C13476l) it.next()).crashlytics(arrayList);
                if (listCrashlytics != null) {
                    C6916l c6916l2 = AbstractC18386l.yandex;
                    int size = listCrashlytics.size();
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            z = true;
                            break;
                        }
                        long j = ((C2483l) listCrashlytics.get(i)).crashlytics.f36415l;
                        boolean zContainsKey = linkedHashMap.containsKey(Integer.valueOf(i));
                        EnumC11949l enumC11949l = EnumC11949l.f23818l;
                        if (zContainsKey) {
                            List list = ((C7314l) linkedHashMap.get(Integer.valueOf(i))).purchase;
                            if (list.size() == 1) {
                                enumC11949l = (EnumC11949l) list.get(0);
                            }
                            if (!AbstractC18386l.crashlytics(enumC11949l, j, list)) {
                                break;
                            }
                            i++;
                        } else {
                            if (!linkedHashMap2.containsKey(Integer.valueOf(i))) {
                                C8339l.subs("SurfaceConfig does not map to any use case");
                                return null;
                            }
                            InterfaceC0048l interfaceC0048l = (InterfaceC0048l) linkedHashMap2.get(Integer.valueOf(i));
                            if (!AbstractC18386l.crashlytics(interfaceC0048l.mo256native(), j, interfaceC0048l.mo256native() == enumC11949l ? (List) AbstractC4338l.firebase((C5307l) interfaceC0048l, C5307l.f11424l) : C2580l.f5619l)) {
                                break;
                            }
                            i++;
                        }
                    }
                    C8688l c8688l = new C8688l(new C8652l(this, listCrashlytics, 27));
                    if (z && ((Boolean) c8688l.getValue()).booleanValue()) {
                        return listCrashlytics;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:177:0x039c  */
    /* JADX WARN: Code duplicated, block: B:187:0x03bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1, types: [android.util.Range, lۣ٘ٞ] */
    /* JADX WARN: Type inference failed for: r4v11, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final C18093l firebase(int i, ArrayList arrayList, LinkedHashMap linkedHashMap, int i2, boolean z, boolean z2) {
        boolean z3;
        Map map;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        Map map2;
        List list;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap2;
        String str;
        C13283l c13283l = this.advert;
        synchronized (c13283l.crashlytics) {
            c13283l.billing = c13283l.yandex();
            Unit unit = Unit.INSTANCE;
        }
        Object obj = null;
        if (this.license == null) {
            loadAd();
        } else {
            Size sizeCrashlytics = this.advert.crashlytics();
            C7179l c7179l = this.license;
            Size size = (c7179l != null ? c7179l : null).yandex;
            LinkedHashMap linkedHashMap3 = (c7179l != null ? c7179l : null).loadAd;
            LinkedHashMap linkedHashMap4 = (c7179l != null ? c7179l : null).amazon;
            Size size2 = (c7179l != null ? c7179l : null).purchase;
            LinkedHashMap linkedHashMap5 = (c7179l != null ? c7179l : null).billing;
            LinkedHashMap linkedHashMap6 = (c7179l != null ? c7179l : null).mopub;
            LinkedHashMap linkedHashMap7 = (c7179l != null ? c7179l : null).admob;
            if (c7179l == null) {
                c7179l = null;
            }
            this.license = new C7179l(size, linkedHashMap3, sizeCrashlytics, linkedHashMap4, size2, linkedHashMap5, linkedHashMap6, linkedHashMap7, c7179l.subs);
        }
        Range range = C13198l.billing;
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(Integer.valueOf(((C7314l) it.next()).mopub));
        }
        Set set = setKeySet;
        ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList4.add(Integer.valueOf(((InterfaceC0048l) it2.next()).mo254for()));
        }
        ArrayList arrayListM4232new = AbstractC16901l.m4232new(arrayList3, arrayList4);
        if (arrayListM4232new.isEmpty()) {
            z3 = false;
            break;
        }
        Iterator it3 = arrayListM4232new.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z3 = false;
                break;
            }
            if (((Number) it3.next()).intValue() == 1) {
                z3 = true;
                break;
            }
        }
        if (z3 && !arrayListM4232new.isEmpty()) {
            Iterator it4 = arrayListM4232new.iterator();
            while (it4.hasNext()) {
                if (((Number) it4.next()).intValue() != 1) {
                    C8339l.metrica("All sessionTypes should be high-speed when any of them is high-speed");
                    return null;
                }
            }
        }
        if (z3) {
            C13198l c13198l = this.applovin;
            c13198l.getClass();
            List listYandex = C13198l.yandex(AbstractC16901l.m4213const(linkedHashMap.values()));
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : listYandex) {
                if (((List) c13198l.purchase.getValue()).contains((Size) obj2)) {
                    arrayList5.add(obj2);
                }
            }
            Map linkedHashMap8 = new LinkedHashMap(AbstractC2200l.firebase(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                List list2 = (List) entry.getValue();
                ArrayList arrayList6 = new ArrayList();
                for (Object obj3 : list2) {
                    if (arrayList5.contains((Size) obj3)) {
                        arrayList6.add(obj3);
                    }
                }
                linkedHashMap8.put(key, arrayList6);
            }
            map = linkedHashMap8;
        } else {
            map = linkedHashMap;
        }
        List<InterfaceC0048l> listM4213const = AbstractC16901l.m4213const(map.keySet());
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        Iterator it5 = listM4213const.iterator();
        while (it5.hasNext()) {
            int iSubscription = ((InterfaceC0048l) it5.next()).subscription();
            if (!arrayList8.contains(Integer.valueOf(iSubscription))) {
                arrayList8.add(Integer.valueOf(iSubscription));
            }
        }
        AbstractC3826l.tapsense(arrayList8);
        Collections.reverse(arrayList8);
        Iterator it6 = arrayList8.iterator();
        while (it6.hasNext()) {
            int iIntValue = ((Number) it6.next()).intValue();
            for (InterfaceC0048l interfaceC0048l : listM4213const) {
                if (iIntValue == interfaceC0048l.subscription()) {
                    arrayList7.add(Integer.valueOf(listM4213const.indexOf(interfaceC0048l)));
                }
            }
        }
        LinkedHashMap linkedHashMapAd = this.premium.ad(arrayList, listM4213const, arrayList7);
        if (AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "resolvedDynamicRanges = " + linkedHashMapAd);
        }
        Iterator it7 = arrayList.iterator();
        while (true) {
            if (!it7.hasNext()) {
                Iterator it8 = map.keySet().iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        z4 = false;
                        break;
                    }
                    if (((InterfaceC0048l) it8.next()).firebase() == 4101) {
                    }
                }
            } else if (((C7314l) it7.next()).loadAd == 4101) {
            }
            z4 = true;
            break;
        }
        Iterator it9 = arrayList.iterator();
        Boolean boolValueOf = null;
        while (it9.hasNext()) {
            boolean z5 = ((C7314l) it9.next()).subs;
            if (boolValueOf != null && !boolValueOf.equals(Boolean.valueOf(z5))) {
                C8339l.smaato("All isStrictFpsRequired should be the same");
                return null;
            }
            boolValueOf = Boolean.valueOf(z5);
        }
        Iterator it10 = listM4213const.iterator();
        while (it10.hasNext()) {
            boolean zMo253final = ((InterfaceC0048l) it10.next()).mo253final();
            if (boolValueOf != null && !boolValueOf.equals(Boolean.valueOf(zMo253final))) {
                C8339l.smaato("All isStrictFpsRequired should be the same");
                return null;
            }
            boolValueOf = Boolean.valueOf(zMo253final);
        }
        boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
        Range rangeVip = C5464l.admob;
        Iterator it11 = arrayList.iterator();
        while (it11.hasNext()) {
            rangeVip = vip(((C7314l) it11.next()).admob, rangeVip, zBooleanValue);
        }
        Iterator it12 = arrayList7.iterator();
        while (it12.hasNext()) {
            rangeVip = vip(((InterfaceC0048l) listM4213const.get(((Number) it12.next()).intValue())).mo251catch(C5464l.admob), rangeVip, zBooleanValue);
            obj = obj;
        }
        ?? r18 = obj;
        boolean zBooleanValue2 = Boolean.valueOf(zBooleanValue).booleanValue();
        boolean z6 = i2 == 4;
        if (AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "getSuggestedStreamSpecifications: isPreviewStabilizationSupported = " + this.tapsense + ", isFeatureComboInvocation = " + z2);
        }
        if (z6 && !this.tapsense && z2) {
            C8339l.metrica("Preview stabilization is not supported by the camera.");
            return r18;
        }
        Iterator it13 = linkedHashMapAd.values().iterator();
        while (true) {
            if (!it13.hasNext()) {
                i3 = 8;
                break;
            }
            if (((C15421l) it13.next()).loadAd == 10) {
                i3 = 10;
                break;
            }
        }
        Range range2 = rangeVip;
        C14591l c14591l = new C14591l(i, i3, z, i2, z4, z3, z2, false, range2, zBooleanValue2);
        ads(c14591l);
        Collection collectionValues = linkedHashMapAd.values();
        if (z2) {
            ?? Contains = collectionValues.contains(C15421l.purchase);
            Integer num = (Integer) range2.getUpper();
            if (num != null && num.intValue() == 60) {
                i4 = Contains;
                i4 = Contains;
                i4 = Contains + 1;
            }
            if (i2 != 3) {
                i5 = i4;
                if (i2 == 4) {
                    i5 = i4 + 1;
                }
            } else {
                i5 = i4 + 1;
            }
            if (z4) {
                i5++;
            }
            if (i5 > 1) {
                i6 = 2;
            } else if (i5 == 1) {
                i6 = 3;
            } else {
                i6 = 1;
            }
        } else {
            i6 = 1;
        }
        if (AbstractC5088l.firebase("CXCP")) {
            if (i6 == 1) {
                str = "WITHOUT_FEATURE_COMBO";
            } else if (i6 != 2) {
                str = i6 != 3 ? "null" : "WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT";
            } else {
                str = "WITH_FEATURE_COMBO";
            }
            Log.d("CXCP", "resolveSpecsByCheckingMethod: checkingMethod = ".concat(str));
        }
        int iInmobi = AbstractC5020l.inmobi(i6);
        if (iInmobi == 0) {
            Map map3 = map;
            C14591l c14591lYandex = C14591l.yandex(c14591l, false, r18, 895);
            ads(c14591lYandex);
            return metrica(c14591lYandex, arrayList, map3, listM4213const, arrayList7, linkedHashMapAd);
        }
        if (iInmobi == 1) {
            Map map4 = map;
            if (z2) {
                Range range3 = C5464l.admob;
            }
            C14591l c14591lYandex2 = C14591l.yandex(c14591l, true, range2, 639);
            ads(c14591lYandex2);
            return metrica(c14591lYandex2, arrayList, map4, listM4213const, arrayList7, linkedHashMapAd);
        }
        if (iInmobi != 2) {
            C18725l.billing();
            return r18;
        }
        Map map5 = map;
        try {
            C14591l c14591lYandex3 = C14591l.yandex(c14591l, false, r18, 895);
            ads(c14591lYandex3);
            map2 = map5;
            list = listM4213const;
            arrayList2 = arrayList7;
            linkedHashMap2 = linkedHashMapAd;
            try {
                return metrica(c14591lYandex3, arrayList, map2, list, arrayList2, linkedHashMap2);
            } catch (IllegalArgumentException e) {
                e = e;
                if (AbstractC5088l.firebase("CXCP")) {
                    Log.d("CXCP", "Failed to find a supported combination without feature combo, trying again with feature combo", e);
                }
                C14591l c14591lYandex4 = C14591l.yandex(c14591l, true, null, 895);
                ads(c14591lYandex4);
                return metrica(c14591lYandex4, arrayList, map2, list, arrayList2, linkedHashMap2);
            }
        } catch (IllegalArgumentException e2) {
            e = e2;
            map2 = map5;
            list = listM4213const;
            arrayList2 = arrayList7;
            linkedHashMap2 = linkedHashMapAd;
        }
    }

    public final C5979l isPro() {
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        InterfaceC5389l interfaceC5389l = this.yandex;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((C10861l) interfaceC5389l).crashlytics(key);
        if (streamConfigurationMap != null) {
            return new C5979l(streamConfigurationMap, new C3111l(interfaceC5389l));
        }
        C8339l.metrica("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
        return null;
    }

    public final void loadAd() {
        Object c18435l;
        Object outputSizes;
        Size sizeSubs;
        Size sizeCrashlytics = this.advert.crashlytics();
        try {
            Integer.parseInt(this.amazon);
            sizeSubs = subs();
            if (sizeSubs == null) {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.ad.crashlytics.f16631l;
                if (streamConfigurationMap != null) {
                    try {
                        outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
                    } catch (Throwable th) {
                        c18435l = new C18435l(th);
                    }
                } else {
                    outputSizes = null;
                }
                c18435l = outputSizes;
                if (c18435l instanceof C18435l) {
                    c18435l = null;
                }
                Size[] sizeArr = (Size[]) c18435l;
                if (sizeArr != null) {
                    Arrays.sort(sizeArr, new C16027l(true));
                    int length = sizeArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            sizeSubs = null;
                            break;
                        }
                        Size size = sizeArr[i];
                        int width = size.getWidth();
                        Size size2 = AbstractC5513l.billing;
                        if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                            sizeSubs = size;
                            break;
                        }
                        i++;
                    }
                } else {
                    sizeSubs = null;
                    break;
                }
                if (sizeSubs == null) {
                    sizeSubs = AbstractC5513l.amazon;
                }
            }
        } catch (NumberFormatException unused) {
        }
        this.license = new C7179l(AbstractC5513l.crashlytics, new LinkedHashMap(), sizeCrashlytics, new LinkedHashMap(), sizeSubs, new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap());
    }

    /* JADX WARN: Code duplicated, block: B:209:0x05fb A[PHI: r14 r20 r26
  0x05fb: PHI (r14v18 int) = (r14v17 int), (r14v17 int), (r14v25 int), (r14v27 int) binds: [B:197:0x05d0, B:199:0x05dc, B:205:0x05e9, B:208:0x05f6] A[DONT_GENERATE, DONT_INLINE]
  0x05fb: PHI (r20v7 boolean) = (r20v6 boolean), (r20v6 boolean), (r20v6 boolean), (r20v8 boolean) binds: [B:197:0x05d0, B:199:0x05dc, B:205:0x05e9, B:208:0x05f6] A[DONT_GENERATE, DONT_INLINE]
  0x05fb: PHI (r26v6 java.util.List) = (r26v5 java.util.List), (r26v5 java.util.List), (r26v8 java.util.List), (r26v9 java.util.List) binds: [B:197:0x05d0, B:199:0x05dc, B:205:0x05e9, B:208:0x05f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:210:0x05fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:226:0x0640  */
    /* JADX WARN: Code duplicated, block: B:302:0x0816  */
    /* JADX WARN: Code duplicated, block: B:304:0x081d  */
    /* JADX WARN: Code duplicated, block: B:306:0x0835  */
    /* JADX WARN: Code duplicated, block: B:308:0x084b  */
    /* JADX WARN: Code duplicated, block: B:310:0x085d  */
    /* JADX WARN: Code duplicated, block: B:312:0x0863  */
    /* JADX WARN: Code duplicated, block: B:318:0x087b  */
    /* JADX WARN: Code duplicated, block: B:320:0x0887  */
    /* JADX WARN: Code duplicated, block: B:322:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:377:0x0877 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x0871 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x08ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x08b0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Type inference failed for: r36v1, types: [int] */
    /* JADX WARN: Type inference failed for: r36v6 */
    /* JADX WARN: Type inference failed for: r36v7 */
    /* JADX WARN: Type inference failed for: r49v0, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    public final C18093l metrica(C14591l c14591l, ArrayList arrayList, Map map, List list, ArrayList arrayList2, LinkedHashMap linkedHashMap) {
        C2580l c2580l;
        String str;
        InterfaceC5389l interfaceC5389l;
        LinkedHashMap linkedHashMap2;
        ?? r27;
        boolean z;
        C14591l c14591l2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        List listBilling;
        int i;
        ArrayList arrayList3;
        LinkedHashMap linkedHashMap5;
        LinkedHashMap linkedHashMap6;
        ?? r36;
        List<InterfaceC0048l> list2;
        int i2;
        List list3;
        List list4;
        int size;
        int i3;
        long j;
        LinkedHashMap linkedHashMap7;
        LinkedHashMap linkedHashMap8;
        InterfaceC0048l interfaceC0048l;
        C5464l c5464l;
        C16443l c16443lLoadAd;
        C7314l c7314l;
        C16443l c16443lLoadAd2;
        C6472l c6472lYandex;
        Range range;
        C15421l c15421l;
        C15421l c15421l2;
        ?? arrayList4;
        Size size2;
        LinkedHashMap linkedHashMap9;
        ArrayList<Size> arrayList5;
        Size sizeAmazon;
        C1557l c1557l = this;
        C14591l c14591l3 = c14591l;
        Map map2 = map;
        boolean z2 = c14591l3.billing;
        if (AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "resolveSpecsBySettings: featureSettings = " + c14591l3);
        }
        boolean z3 = c14591l3.mopub;
        Range range2 = c14591l3.subs;
        C2580l c2580l2 = C2580l.f5619l;
        String str2 = ". New configs: ";
        String str3 = c1557l.amazon;
        if (z3) {
            c2580l = c2580l2;
            str = "No supported surface combination is found for camera device - Id : ";
        } else {
            ArrayList arrayList6 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList6.add(((C7314l) it.next()).yandex);
            }
            C16027l c16027l = new C16027l(false);
            for (InterfaceC0048l interfaceC0048l2 : map2.keySet()) {
                C2580l c2580l3 = c2580l2;
                List list5 = (List) map2.get(interfaceC0048l2);
                if (list5 == null || list5.isEmpty()) {
                    C11467l.isPro(46, interfaceC0048l2, "No available output size is found for ");
                    return null;
                }
                Size size3 = (Size) Collections.min(list5, c16027l);
                int iFirebase = interfaceC0048l2.firebase();
                EnumC18632l enumC18632lMo257package = interfaceC0048l2.mo257package();
                EnumC18632l enumC18632l = C2483l.purchase;
                arrayList6.add(C2582l.Signature(iFirebase, size3, c1557l.remoteconfig(iFirebase), c14591l3.yandex, 2, enumC18632lMo257package));
                c2580l2 = c2580l3;
            }
            c2580l = c2580l2;
            str = "No supported surface combination is found for camera device - Id : ";
            if (!c1557l.yandex(c14591l3, arrayList6, C14054l.f27396l, c2580l2, c2580l)) {
                throw new IllegalArgumentException((str + str3 + ". May be attempting to bind too many use cases. Existing surfaces: " + arrayList + ". New configs: " + list + ". GroupableFeature settings: " + c14591l3 + '.').toString());
            }
        }
        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
        Iterator it2 = map2.keySet().iterator();
        Map map3 = map2;
        while (it2.hasNext()) {
            InterfaceC0048l interfaceC0048l3 = (InterfaceC0048l) it2.next();
            ArrayList arrayList7 = new ArrayList();
            LinkedHashMap linkedHashMap11 = new LinkedHashMap();
            for (Size size4 : (List) map3.get(interfaceC0048l3)) {
                Iterator it3 = it2;
                int iFirebase2 = interfaceC0048l3.firebase();
                int iMo252extends = interfaceC0048l3.mo252extends(size4);
                EnumC18632l enumC18632lMo257package2 = interfaceC0048l3.mo257package();
                EnumC18632l enumC18632l2 = C2483l.purchase;
                String str4 = str2;
                EnumC7005l enumC7005l = C2582l.Signature(iFirebase2, size4, c1557l.remoteconfig(iFirebase2), c14591l3.yandex, c14591l3.admob ? 1 : 2, enumC18632lMo257package2).loadAd;
                String str5 = str;
                Range range3 = C5464l.admob;
                int iAmazon = AbstractC8576l.yandex(range2, range3) ? Alert.DURATION_SHOW_INDEFINITELY : c1557l.amazon(iFirebase2, size4, z2, iMo252extends);
                if (!z3 || (enumC7005l != EnumC7005l.NOT_SUPPORT && (AbstractC8576l.yandex(range2, range3) || iAmazon >= ((Number) range2.getUpper()).intValue()))) {
                    Set linkedHashSet = (Set) linkedHashMap11.get(enumC7005l);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                        linkedHashMap11.put(enumC7005l, linkedHashSet);
                    }
                    if (!linkedHashSet.contains(Integer.valueOf(iAmazon))) {
                        arrayList7.add(size4);
                        linkedHashSet.add(Integer.valueOf(iAmazon));
                    }
                }
                str2 = str4;
                it2 = it3;
                str = str5;
            }
            linkedHashMap10.put(interfaceC0048l3, arrayList7);
            map3 = map;
        }
        String str6 = str;
        String str7 = str2;
        ArrayList arrayList8 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it4.hasNext();
            interfaceC5389l = c1557l.yandex;
            if (!zHasNext) {
                break;
            }
            int iIntValue = ((Number) it4.next()).intValue();
            List<Size> list6 = (List) linkedHashMap10.get(list.get(iIntValue));
            int iFirebase3 = ((InterfaceC0048l) list.get(iIntValue)).firebase();
            c1557l.signatures.getClass();
            Rational rational = ((((Nexus4AndroidLTargetAspectRatioQuirk) AbstractC17919l.yandex(Nexus4AndroidLTargetAspectRatioQuirk.class)) == null && ((AspectRatioLegacyApi21Quirk) new C5849l(interfaceC5389l, c1557l.ad).yandex().loadAd(AspectRatioLegacyApi21Quirk.class)) == null) || (size2 = (Size) c1557l.remoteconfig(PSKKeyManager.MAX_KEY_LENGTH_BYTES).billing.get(Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES))) == null) ? null : new Rational(size2.getWidth(), size2.getHeight());
            if (rational == null) {
                arrayList5 = new ArrayList(list6);
                linkedHashMap9 = linkedHashMap10;
            } else {
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                for (Size size5 : list6) {
                    Rational rational2 = AbstractC14608l.yandex;
                    LinkedHashMap linkedHashMap12 = linkedHashMap10;
                    if (AbstractC14608l.yandex(size5, rational, AbstractC5513l.crashlytics)) {
                        arrayList9.add(size5);
                    } else {
                        arrayList10.add(size5);
                    }
                    linkedHashMap10 = linkedHashMap12;
                }
                linkedHashMap9 = linkedHashMap10;
                arrayList10.addAll(0, arrayList9);
                arrayList5 = arrayList10;
            }
            EnumC18632l enumC18632l3 = C2483l.purchase;
            EnumC13290l enumC13290l = (EnumC13290l) C2483l.admob.get(Integer.valueOf(iFirebase3));
            if (enumC13290l == null) {
                enumC13290l = EnumC13290l.f26074l;
            }
            if (((ExtraCroppingQuirk) c1557l.isVip.f4179l) != null && (sizeAmazon = ExtraCroppingQuirk.amazon(enumC13290l)) != null) {
                ArrayList arrayList11 = new ArrayList();
                arrayList11.add(sizeAmazon);
                for (Size size6 : arrayList5) {
                    if (!AbstractC8576l.yandex(size6, sizeAmazon)) {
                        arrayList11.add(size6);
                    }
                }
                arrayList5 = arrayList11;
            }
            arrayList8.add(arrayList5);
            linkedHashMap10 = linkedHashMap9;
        }
        LinkedHashMap linkedHashMap13 = new LinkedHashMap();
        LinkedHashMap linkedHashMap14 = new LinkedHashMap();
        C13198l c13198l = c1557l.applovin;
        if (z2) {
            c13198l.getClass();
            if (arrayList8.isEmpty()) {
                arrayList4 = c2580l;
            } else {
                List listYandex = C13198l.yandex(arrayList8);
                arrayList4 = new ArrayList(AbstractC14055l.billing(listYandex, 10));
                Iterator it5 = listYandex.iterator();
                while (it5.hasNext()) {
                    Size size7 = (Size) it5.next();
                    int size8 = arrayList8.size();
                    Iterator it6 = it5;
                    ArrayList arrayList12 = new ArrayList(size8);
                    LinkedHashMap linkedHashMap15 = linkedHashMap13;
                    for (int i4 = 0; i4 < size8; i4++) {
                        arrayList12.add(size7);
                    }
                    arrayList4.add(arrayList12);
                    it5 = it6;
                    linkedHashMap13 = linkedHashMap15;
                }
            }
            linkedHashMap2 = linkedHashMap13;
            r27 = arrayList4;
        } else {
            linkedHashMap2 = linkedHashMap13;
            Iterator it7 = arrayList8.iterator();
            int size9 = 1;
            while (it7.hasNext()) {
                size9 *= ((List) it7.next()).size();
            }
            if (size9 == 0) {
                C8339l.metrica("Failed to find supported resolutions.");
                return null;
            }
            ArrayList arrayList13 = new ArrayList();
            for (int i5 = 0; i5 < size9; i5++) {
                arrayList13.add(new ArrayList());
            }
            int size10 = size9 / ((List) arrayList8.get(0)).size();
            int size11 = arrayList8.size();
            int i6 = size9;
            int size12 = size10;
            int i7 = 0;
            while (i7 < size11) {
                int i8 = size11;
                List list7 = (List) arrayList8.get(i7);
                LinkedHashMap linkedHashMap16 = linkedHashMap14;
                int i9 = 0;
                while (i9 < size9) {
                    ((List) arrayList13.get(i9)).add(list7.get((i9 % i6) / size12));
                    i9++;
                    arrayList13 = arrayList13;
                    size9 = size9;
                }
                ArrayList arrayList14 = arrayList13;
                int i10 = size9;
                if (i7 < arrayList8.size() - 1) {
                    i6 = size12;
                    size12 /= ((List) arrayList8.get(i7 + 1)).size();
                }
                i7++;
                size11 = i8;
                linkedHashMap14 = linkedHashMap16;
                arrayList13 = arrayList14;
                size9 = i10;
            }
            r27 = arrayList13;
        }
        LinkedHashMap linkedHashMap17 = linkedHashMap14;
        C6916l c6916l = AbstractC18386l.yandex;
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                Iterator it9 = list.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        z = false;
                        break;
                    }
                    InterfaceC0048l interfaceC0048l4 = (InterfaceC0048l) it9.next();
                    if (AbstractC18386l.purchase(interfaceC0048l4, interfaceC0048l4.mo256native())) {
                    }
                }
            } else {
                C7314l c7314l2 = (C7314l) it8.next();
                if (AbstractC18386l.purchase(c7314l2.billing, (EnumC11949l) c7314l2.purchase.get(0))) {
                }
            }
            z = true;
            break;
        }
        if (!c1557l.ads || z) {
            c14591l2 = c14591l3;
            linkedHashMap3 = linkedHashMap2;
            linkedHashMap4 = linkedHashMap17;
            listBilling = null;
        } else {
            Iterator it10 = r27.iterator();
            listBilling = null;
            while (true) {
                if (!it10.hasNext()) {
                    c14591l2 = c14591l3;
                    linkedHashMap3 = linkedHashMap2;
                    linkedHashMap4 = linkedHashMap17;
                    break;
                }
                C14591l c14591l4 = c14591l3;
                c14591l2 = c14591l4;
                LinkedHashMap linkedHashMap18 = linkedHashMap2;
                LinkedHashMap linkedHashMap19 = linkedHashMap17;
                linkedHashMap3 = linkedHashMap18;
                linkedHashMap4 = linkedHashMap19;
                listBilling = c1557l.billing(c14591l2, c1557l.smaato(c14591l4.yandex, arrayList, (List) it10.next(), list, arrayList2, linkedHashMap18, linkedHashMap19, false), linkedHashMap3, linkedHashMap4);
                if (listBilling != null) {
                    break;
                }
                linkedHashMap3.clear();
                linkedHashMap4.clear();
                linkedHashMap2 = linkedHashMap3;
                linkedHashMap17 = linkedHashMap4;
                c14591l3 = c14591l2;
            }
            if (AbstractC5088l.firebase("CXCP")) {
                Log.d("CXCP", "orderedSurfaceConfigListForStreamUseCase = " + listBilling);
            }
        }
        Iterator it11 = arrayList.iterator();
        int iMin = Alert.DURATION_SHOW_INDEFINITELY;
        while (it11.hasNext()) {
            C7314l c7314l3 = (C7314l) it11.next();
            iMin = Math.min(iMin, c1557l.amazon(c7314l3.loadAd, c7314l3.crashlytics, z2, c7314l3.isPro));
        }
        Iterator it12 = r27.iterator();
        List list8 = null;
        List list9 = null;
        int i11 = Alert.DURATION_SHOW_INDEFINITELY;
        int i12 = Alert.DURATION_SHOW_INDEFINITELY;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            if (!it12.hasNext()) {
                C14591l c14591l5 = c14591l2;
                i = i11;
                c14591l2 = c14591l5;
                arrayList3 = arrayList2;
                listBilling = listBilling;
                linkedHashMap5 = linkedHashMap3;
                linkedHashMap6 = linkedHashMap4;
                interfaceC5389l = interfaceC5389l;
                r36 = z2;
                str3 = str3;
                list2 = list;
                i2 = i12;
                list3 = list8;
                list4 = list9;
                break;
            }
            List<Size> list10 = (List) it12.next();
            int i13 = i12;
            LinkedHashMap linkedHashMap20 = new LinkedHashMap();
            LinkedHashMap linkedHashMap21 = new LinkedHashMap();
            int i14 = i11;
            int i15 = c14591l2.yandex;
            boolean z6 = c14591l2.admob;
            listBilling = listBilling;
            linkedHashMap6 = linkedHashMap4;
            linkedHashMap5 = linkedHashMap3;
            i = i14;
            List list11 = list;
            interfaceC5389l = interfaceC5389l;
            str3 = str3;
            int i16 = iMin;
            ArrayList arrayListSmaato = c1557l.smaato(i15, arrayList, list10, list11, arrayList2, linkedHashMap20, linkedHashMap21, z6);
            int iMin2 = i16;
            int i17 = 0;
            for (Size size13 : list10) {
                int i18 = i17 + 1;
                ArrayList arrayList15 = arrayListSmaato;
                InterfaceC0048l interfaceC0048l5 = (InterfaceC0048l) list11.get(((Number) arrayList2.get(i17)).intValue());
                iMin2 = Math.min(iMin2, c1557l.amazon(interfaceC0048l5.firebase(), size13, z2, interfaceC0048l5.mo252extends(size13)));
                list11 = list;
                i17 = i18;
                arrayListSmaato = arrayList15;
            }
            ArrayList arrayList16 = arrayListSmaato;
            boolean z7 = AbstractC8576l.yandex(range2, C5464l.admob) || iMin2 >= i16 || iMin2 >= ((Number) range2.getUpper()).intValue();
            LinkedHashMap linkedHashMap22 = new LinkedHashMap();
            int i19 = 0;
            for (Object obj : arrayList16) {
                int i20 = i19 + 1;
                if (i19 < 0) {
                    AbstractC14055l.subscription();
                    throw null;
                }
                C2483l c2483l = (C2483l) obj;
                C7314l c7314l4 = (C7314l) linkedHashMap20.get(Integer.valueOf(i19));
                if (c7314l4 == null || (c15421l2 = c7314l4.amazon) == null) {
                    Object obj2 = linkedHashMap.get(linkedHashMap21.get(Integer.valueOf(i19)));
                    if (obj2 == null) {
                        C8339l.metrica("Required value was null.");
                        return null;
                    }
                    c15421l2 = (C15421l) obj2;
                }
                linkedHashMap22.put(c2483l, c15421l2);
                i19 = i20;
            }
            boolean z8 = z2 ? 1 : 0;
            C7655l c7655l = new C7655l(this, c14591l, arrayList16, linkedHashMap22, list, arrayList2, 1);
            c1557l = this;
            c14591l2 = c14591l;
            list2 = list;
            arrayList3 = arrayList2;
            InterfaceC1220l interfaceC1220lCrashlytics = AbstractC9968l.crashlytics(3, c7655l);
            if (z4 || !((Boolean) interfaceC1220lCrashlytics.getValue()).booleanValue()) {
                if (listBilling != null || z5 || c1557l.billing(c14591l2, arrayList16, linkedHashMap20, linkedHashMap21) == null) {
                    i11 = i;
                    i12 = i13;
                } else {
                    if (i13 != Integer.MAX_VALUE && i13 >= iMin2) {
                        i12 = i13;
                    } else {
                        i12 = iMin2;
                        list9 = list10;
                    }
                    if (!z7) {
                        i11 = i;
                    } else {
                        if (z4) {
                            i2 = iMin2;
                            list3 = list8;
                            list4 = list10;
                            r36 = z8;
                            break;
                        }
                        int i21 = i;
                        c14591l2 = c14591l2;
                        i11 = i21;
                        listBilling = listBilling;
                        i12 = iMin2;
                        z5 = true;
                        list9 = list10;
                    }
                    linkedHashMap3 = linkedHashMap5;
                    linkedHashMap4 = linkedHashMap6;
                    iMin = i16;
                    z2 = z8 ? 1 : 0;
                }
                linkedHashMap3 = linkedHashMap5;
                linkedHashMap4 = linkedHashMap6;
                iMin = i16;
                z2 = z8 ? 1 : 0;
            } else {
                if (i == Integer.MAX_VALUE || i < iMin2) {
                    i = iMin2;
                    list8 = list10;
                }
                if (!z7) {
                    if (listBilling != null) {
                        i11 = i;
                        i12 = i13;
                    } else {
                        i11 = i;
                        i12 = i13;
                    }
                    linkedHashMap3 = linkedHashMap5;
                    linkedHashMap4 = linkedHashMap6;
                    iMin = i16;
                    z2 = z8 ? 1 : 0;
                } else {
                    if (z5) {
                        i = iMin2;
                        i2 = i13;
                        list4 = list9;
                        list3 = list10;
                        r36 = z8;
                        break;
                    }
                    i = iMin2;
                    z4 = true;
                    list8 = list10;
                    if (listBilling != null) {
                        i11 = i;
                        i12 = i13;
                    } else {
                        i11 = i;
                        i12 = i13;
                    }
                    linkedHashMap3 = linkedHashMap5;
                    linkedHashMap4 = linkedHashMap6;
                    iMin = i16;
                    z2 = z8 ? 1 : 0;
                }
            }
        }
        C8272l c8272l = (list3 != null && (z3 == 0 || AbstractC8576l.yandex(range2, C5464l.admob) || (i != Integer.MAX_VALUE && i >= ((Number) range2.getUpper()).intValue()))) ? new C8272l(i, i2, Alert.DURATION_SHOW_INDEFINITELY, list3, list4) : null;
        if (c8272l == null) {
            StringBuilder sbIsVip = AbstractC5020l.isVip(str6, str3, " and Hardware level: ");
            sbIsVip.append(c1557l.purchase);
            sbIsVip.append(". May be the specified resolution is too large and not supported. Existing surfaces: ");
            sbIsVip.append(arrayList);
            sbIsVip.append(str7);
            C10754l.metrica(AbstractC0653l.subscription(sbIsVip, list2, '.'));
            return null;
        }
        int i22 = c8272l.crashlytics;
        List list12 = c8272l.yandex;
        if (AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "resolveSpecsBySettings: bestSizesAndFps = " + c8272l);
        }
        LinkedHashMap linkedHashMap23 = new LinkedHashMap();
        Range rangeCrashlytics = C5464l.admob;
        if (!AbstractC8576l.yandex(range2, rangeCrashlytics)) {
            Range[] rangeArrLoadAd = r36 != 0 ? c13198l.loadAd(list12) : (Range[]) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            Range rangeCrashlytics2 = crashlytics(range2, i22, rangeArrLoadAd);
            if ((z3 != 0 || c14591l2.isPro) && !AbstractC8576l.yandex(rangeCrashlytics2, range2)) {
                StringBuilder sb = new StringBuilder("Target FPS range ");
                sb.append(range2);
                sb.append(" is not supported. Max FPS supported by the calculated best combination: ");
                sb.append(i22);
                sb.append(". Calculated best FPS range for device: ");
                sb.append(rangeCrashlytics2);
                String string = Arrays.toString(rangeArrLoadAd);
                sb.append(". Device supported FPS ranges: ");
                sb.append(string);
                sb.append('.');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            rangeCrashlytics = rangeCrashlytics2;
        } else if (r36 != 0) {
            rangeCrashlytics = crashlytics(C13198l.billing, i22, c13198l.loadAd(list12));
        }
        int i23 = 0;
        for (InterfaceC0048l interfaceC0048l6 : list2) {
            int i24 = i23 + 1;
            C6472l c6472lYandex2 = C5464l.yandex((Size) list12.get(arrayList3.indexOf(Integer.valueOf(i23))));
            c6472lYandex2.f13514l = Integer.valueOf((int) r36);
            Object obj3 = linkedHashMap.get(interfaceC0048l6);
            if (obj3 == null) {
                C8339l.smaato("Required value was null.");
                return null;
            }
            c6472lYandex2.f13515l = (C15421l) obj3;
            C6916l c6916l2 = AbstractC18386l.yandex;
            C5104l c5104lCrashlytics = C5104l.crashlytics();
            C6916l c6916l3 = C16443l.f32153l;
            if (interfaceC0048l6.mo861strictfp(c6916l3)) {
                c5104lCrashlytics.mopub(c6916l3, interfaceC0048l6.adcel(c6916l3));
            }
            C6916l c6916l4 = InterfaceC0048l.f929l;
            if (interfaceC0048l6.mo861strictfp(c6916l4)) {
                c5104lCrashlytics.mopub(c6916l4, interfaceC0048l6.adcel(c6916l4));
            }
            C6916l c6916l5 = C14180l.f27767l;
            if (interfaceC0048l6.mo861strictfp(c6916l5)) {
                c5104lCrashlytics.mopub(c6916l5, interfaceC0048l6.adcel(c6916l5));
            }
            C6916l c6916l6 = InterfaceC16352l.advert;
            if (interfaceC0048l6.mo861strictfp(c6916l6)) {
                c5104lCrashlytics.mopub(c6916l6, interfaceC0048l6.adcel(c6916l6));
            }
            c6472lYandex2.f13510l = new C16443l(5, c5104lCrashlytics);
            c6472lYandex2.f13511l = Boolean.valueOf(c14591l2.crashlytics);
            if (!AbstractC8576l.yandex(rangeCrashlytics, C5464l.admob)) {
                if (rangeCrashlytics == null) {
                    C6541l.subs("Null expectedFrameRateRange");
                    return null;
                }
                c6472lYandex2.f13516l = rangeCrashlytics;
            }
            linkedHashMap23.put(interfaceC0048l6, c6472lYandex2.yandex());
            i23 = i24;
        }
        LinkedHashMap linkedHashMap24 = new LinkedHashMap();
        if (listBilling != null) {
            List list13 = c8272l.loadAd;
            if (i22 == c8272l.amazon && list12.size() == list13.size()) {
                ArrayList<C8195l> arrayListM4226l = AbstractC16901l.m4226l(list13, list12);
                if (!arrayListM4226l.isEmpty()) {
                    for (C8195l c8195l : arrayListM4226l) {
                        if (!AbstractC8576l.yandex(c8195l.f17098l, c8195l.f17097l)) {
                        }
                    }
                    if (!AbstractC18386l.billing(interfaceC5389l, arrayList, linkedHashMap23, linkedHashMap24)) {
                        size = listBilling.size();
                        i3 = 0;
                        while (i3 < size) {
                            List list14 = listBilling;
                            j = ((C2483l) list14.get(i3)).crashlytics.f36415l;
                            linkedHashMap7 = linkedHashMap5;
                            if (linkedHashMap7.containsKey(Integer.valueOf(i3))) {
                                c7314l = (C7314l) linkedHashMap7.get(Integer.valueOf(i3));
                                c16443lLoadAd2 = AbstractC18386l.loadAd(c7314l.billing, Long.valueOf(j));
                                if (c16443lLoadAd2 != null) {
                                    c6472lYandex = C5464l.yandex(c7314l.crashlytics);
                                    c6472lYandex.f13514l = Integer.valueOf(c7314l.mopub);
                                    range = c7314l.admob;
                                    if (range != null) {
                                        C6541l.subs("Null expectedFrameRateRange");
                                        return null;
                                    }
                                    c6472lYandex.f13516l = range;
                                    c15421l = c7314l.amazon;
                                    if (c15421l != null) {
                                        C6541l.subs("Null dynamicRange");
                                        return null;
                                    }
                                    c6472lYandex.f13515l = c15421l;
                                    c6472lYandex.f13510l = c16443lLoadAd2;
                                    linkedHashMap24.put(c7314l, c6472lYandex.yandex());
                                }
                                linkedHashMap8 = linkedHashMap6;
                            } else {
                                linkedHashMap8 = linkedHashMap6;
                                if (linkedHashMap8.containsKey(Integer.valueOf(i3))) {
                                    C8339l.subs("SurfaceConfig does not map to any use case");
                                    return null;
                                }
                                interfaceC0048l = (InterfaceC0048l) linkedHashMap8.get(Integer.valueOf(i3));
                                c5464l = (C5464l) linkedHashMap23.get(interfaceC0048l);
                                c16443lLoadAd = AbstractC18386l.loadAd(c5464l.billing, Long.valueOf(j));
                                if (c16443lLoadAd != null) {
                                    C6472l c6472lLoadAd = c5464l.loadAd();
                                    c6472lLoadAd.f13510l = c16443lLoadAd;
                                    linkedHashMap23.put(interfaceC0048l, c6472lLoadAd.yandex());
                                }
                            }
                            i3++;
                            listBilling = list14;
                            linkedHashMap5 = linkedHashMap7;
                            linkedHashMap6 = linkedHashMap8;
                        }
                    }
                } else if (!AbstractC18386l.billing(interfaceC5389l, arrayList, linkedHashMap23, linkedHashMap24)) {
                    size = listBilling.size();
                    i3 = 0;
                    while (i3 < size) {
                        List list15 = listBilling;
                        j = ((C2483l) list15.get(i3)).crashlytics.f36415l;
                        linkedHashMap7 = linkedHashMap5;
                        if (linkedHashMap7.containsKey(Integer.valueOf(i3))) {
                            c7314l = (C7314l) linkedHashMap7.get(Integer.valueOf(i3));
                            c16443lLoadAd2 = AbstractC18386l.loadAd(c7314l.billing, Long.valueOf(j));
                            if (c16443lLoadAd2 != null) {
                                c6472lYandex = C5464l.yandex(c7314l.crashlytics);
                                c6472lYandex.f13514l = Integer.valueOf(c7314l.mopub);
                                range = c7314l.admob;
                                if (range != null) {
                                    C6541l.subs("Null expectedFrameRateRange");
                                    return null;
                                }
                                c6472lYandex.f13516l = range;
                                c15421l = c7314l.amazon;
                                if (c15421l != null) {
                                    C6541l.subs("Null dynamicRange");
                                    return null;
                                }
                                c6472lYandex.f13515l = c15421l;
                                c6472lYandex.f13510l = c16443lLoadAd2;
                                linkedHashMap24.put(c7314l, c6472lYandex.yandex());
                            }
                            linkedHashMap8 = linkedHashMap6;
                        } else {
                            linkedHashMap8 = linkedHashMap6;
                            if (linkedHashMap8.containsKey(Integer.valueOf(i3))) {
                                C8339l.subs("SurfaceConfig does not map to any use case");
                                return null;
                            }
                            interfaceC0048l = (InterfaceC0048l) linkedHashMap8.get(Integer.valueOf(i3));
                            c5464l = (C5464l) linkedHashMap23.get(interfaceC0048l);
                            c16443lLoadAd = AbstractC18386l.loadAd(c5464l.billing, Long.valueOf(j));
                            if (c16443lLoadAd != null) {
                                C6472l c6472lLoadAd2 = c5464l.loadAd();
                                c6472lLoadAd2.f13510l = c16443lLoadAd;
                                linkedHashMap23.put(interfaceC0048l, c6472lLoadAd2.yandex());
                            }
                        }
                        i3++;
                        listBilling = list15;
                        linkedHashMap5 = linkedHashMap7;
                        linkedHashMap6 = linkedHashMap8;
                    }
                }
            }
        }
        return new C18093l(linkedHashMap23, linkedHashMap24, c8272l.purchase);
    }

    public final C7179l remoteconfig(int i) {
        Size sizePurchase;
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayList = this.pro;
        if (!arrayList.contains(numValueOf)) {
            C7179l c7179l = this.license;
            if (c7179l == null) {
                c7179l = null;
            }
            adcel(c7179l.loadAd, AbstractC5513l.purchase, i);
            C7179l c7179l2 = this.license;
            if (c7179l2 == null) {
                c7179l2 = null;
            }
            adcel(c7179l2.amazon, AbstractC5513l.mopub, i);
            C7179l c7179l3 = this.license;
            if (c7179l3 == null) {
                c7179l3 = null;
            }
            startapp(c7179l3.billing, i, null);
            C7179l c7179l4 = this.license;
            if (c7179l4 == null) {
                c7179l4 = null;
            }
            startapp(c7179l4.mopub, i, AbstractC14608l.yandex);
            C7179l c7179l5 = this.license;
            if (c7179l5 == null) {
                c7179l5 = null;
            }
            startapp(c7179l5.admob, i, AbstractC14608l.crashlytics);
            C7179l c7179l6 = this.license;
            if (c7179l6 == null) {
                c7179l6 = null;
            }
            LinkedHashMap linkedHashMap = c7179l6.subs;
            if (Build.VERSION.SDK_INT >= 31 && this.subscription) {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((C10861l) this.yandex).crashlytics(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION);
                if (streamConfigurationMap != null && (sizePurchase = purchase(streamConfigurationMap, i, true, null)) != null) {
                    linkedHashMap.put(Integer.valueOf(i), sizePurchase);
                }
            }
            arrayList.add(Integer.valueOf(i));
        }
        C7179l c7179l7 = this.license;
        if (c7179l7 != null) {
            return c7179l7;
        }
        return null;
    }

    public final ArrayList smaato(int i, ArrayList arrayList, List list, List list2, ArrayList arrayList2, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, boolean z) {
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7314l c7314l = (C7314l) it.next();
            arrayList3.add(c7314l.yandex);
            linkedHashMap.put(Integer.valueOf(arrayList3.size() - 1), c7314l);
        }
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            int i3 = i2 + 1;
            Size size = (Size) it2.next();
            InterfaceC0048l interfaceC0048l = (InterfaceC0048l) list2.get(((Number) arrayList2.get(i2)).intValue());
            int iFirebase = interfaceC0048l.firebase();
            EnumC18632l enumC18632lMo257package = interfaceC0048l.mo257package();
            EnumC18632l enumC18632l = C2483l.purchase;
            arrayList3.add(C2582l.Signature(iFirebase, size, remoteconfig(iFirebase), i, z ? 1 : 2, enumC18632lMo257package));
            linkedHashMap2.put(Integer.valueOf(arrayList3.size() - 1), interfaceC0048l);
            i2 = i3;
        }
        return arrayList3;
    }

    public final void startapp(LinkedHashMap linkedHashMap, int i, Rational rational) {
        Size sizePurchase = purchase((StreamConfigurationMap) this.ad.crashlytics.f16631l, i, true, rational);
        if (sizePurchase != null) {
            linkedHashMap.put(Integer.valueOf(i), sizePurchase);
        }
    }

    public final Size subs() {
        InterfaceC15313l interfaceC15313lLoadAd;
        Iterator it = AbstractC14055l.remoteconfig(1, 13, 10, 8, 12, 6, 5, 4).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            InterfaceC2360l interfaceC2360l = this.loadAd;
            if (interfaceC2360l.yandex(iIntValue) && (interfaceC15313lLoadAd = interfaceC2360l.loadAd(iIntValue)) != null && !interfaceC15313lLoadAd.amazon().isEmpty()) {
                return ((C6410l) interfaceC15313lLoadAd.amazon().get(0)).yandex();
            }
        }
        return null;
    }

    public final boolean yandex(C14591l c14591l, ArrayList arrayList, Map map, List list, List list2) {
        ArrayList arrayList2;
        List list3;
        boolean z;
        Size size;
        EnumC15475l enumC15475l;
        int i = c14591l.amazon;
        boolean z2 = c14591l.admob;
        LinkedHashMap linkedHashMap = this.smaato;
        if (linkedHashMap.containsKey(c14591l)) {
            list3 = (List) linkedHashMap.get(c14591l);
            z2 = z2;
        } else {
            ArrayList arrayList3 = new ArrayList();
            int i2 = c14591l.yandex;
            if (z2) {
                C8688l c8688l = AbstractC2094l.yandex;
                arrayList3.addAll(AbstractC2094l.loadAd(this.yandex, i));
                z2 = z2;
            } else if (c14591l.purchase) {
                ArrayList arrayList4 = this.vip;
                if (arrayList4.isEmpty()) {
                    C8688l c8688l2 = AbstractC2094l.yandex;
                    ArrayList arrayList5 = new ArrayList();
                    C13476l c13476l = new C13476l();
                    EnumC18632l enumC18632l = C2483l.purchase;
                    EnumC7005l enumC7005l = EnumC7005l.MAXIMUM;
                    EnumC13290l enumC13290l = EnumC13290l.f26076l;
                    C13476l c13476lMetrica = AbstractC2812l.metrica(enumC13290l, enumC7005l, c13476l, arrayList5, c13476l);
                    AbstractC2812l.ad(EnumC13290l.f26074l, EnumC7005l.PREVIEW, c13476lMetrica, enumC13290l, enumC7005l);
                    arrayList5.add(c13476lMetrica);
                    arrayList4.addAll(arrayList5);
                }
                if (i2 == 0) {
                    arrayList3.addAll(arrayList4);
                }
            } else {
                z2 = z2;
                if (c14591l.billing) {
                    ArrayList arrayList6 = this.firebase;
                    if (arrayList6.isEmpty()) {
                        C13198l c13198l = this.applovin;
                        if (((Boolean) c13198l.loadAd.getValue()).booleanValue()) {
                            arrayList6.clear();
                            Size size2 = (Size) c13198l.crashlytics.getValue();
                            if (size2 != null) {
                                C7179l c7179lRemoteconfig = remoteconfig(34);
                                C8688l c8688l3 = AbstractC2094l.yandex;
                                ArrayList arrayList7 = new ArrayList();
                                EnumC18632l enumC18632l2 = C2483l.purchase;
                                C2483l c2483lSignature = C2582l.Signature(34, size2, c7179lRemoteconfig, 0, 2, C2483l.purchase);
                                C13476l c13476l2 = new C13476l();
                                c13476l2.yandex(c2483lSignature);
                                arrayList7.add(c13476l2);
                                C13476l c13476l3 = new C13476l();
                                c13476l3.yandex(c2483lSignature);
                                c13476l3.yandex(c2483lSignature);
                                arrayList7.add(c13476l3);
                                arrayList6.addAll(arrayList7);
                            }
                        }
                    }
                    arrayList3.addAll(arrayList6);
                } else {
                    int i3 = c14591l.loadAd;
                    if (i3 == 8) {
                        if (i2 != 1) {
                            ArrayList arrayList8 = this.mopub;
                            if (i2 != 2) {
                                if (i == 4) {
                                    arrayList8 = this.isPro;
                                }
                                arrayList3.addAll(arrayList8);
                            } else {
                                arrayList3.addAll(this.subs);
                                arrayList3.addAll(arrayList8);
                            }
                        } else {
                            arrayList2 = this.billing;
                        }
                        linkedHashMap.put(c14591l, arrayList2);
                        list3 = arrayList2;
                    } else if (i3 == 10 && i2 == 0) {
                        arrayList3.addAll(this.remoteconfig);
                    }
                }
            }
            arrayList2 = arrayList3;
            linkedHashMap.put(c14591l, arrayList2);
            list3 = arrayList2;
        }
        if (list3 != null && list3.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = list3.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((C13476l) it.next()).crashlytics(arrayList) != null) {
                z = true;
                break;
            }
        }
        if (!z || !z2) {
            return z;
        }
        C11419l c11419l = new C11419l();
        Iterator it2 = arrayList.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            C2483l c2483l = (C2483l) next;
            C7179l c7179lRemoteconfig2 = remoteconfig(c2483l.amazon);
            int i6 = c2483l.amazon;
            LinkedHashMap linkedHashMap2 = c7179lRemoteconfig2.billing;
            EnumC7005l enumC7005l2 = c2483l.loadAd;
            int iOrdinal = enumC7005l2.ordinal();
            Iterator it3 = it2;
            if (iOrdinal != 3) {
                switch (iOrdinal) {
                    case 9:
                        size = c7179lRemoteconfig2.purchase;
                        break;
                    case 10:
                        size = (Size) linkedHashMap2.get(Integer.valueOf(i6));
                        break;
                    case 11:
                        size = (Size) linkedHashMap2.get(Integer.valueOf(i6));
                        break;
                    case 12:
                        size = (Size) linkedHashMap2.get(Integer.valueOf(i6));
                        break;
                    case 13:
                        size = (Size) c7179lRemoteconfig2.subs.get(Integer.valueOf(i6));
                        break;
                    case 14:
                        C8339l.smaato("Not supported config size");
                        return false;
                    default:
                        size = enumC7005l2.f14693l;
                        break;
                }
            } else {
                size = c7179lRemoteconfig2.crashlytics;
            }
            InterfaceC0048l interfaceC0048l = (InterfaceC0048l) list.get(((Number) list2.get(i4)).intValue());
            Object obj = map.get(c2483l);
            if (obj == null) {
                C8339l.metrica("Required value was null.");
                return false;
            }
            C15421l c15421l = (C15421l) obj;
            C10375l c10375l = new C10375l(interfaceC0048l.firebase(), size);
            int iOrdinal2 = interfaceC0048l.mo256native().ordinal();
            if (iOrdinal2 == 0) {
                enumC15475l = EnumC15475l.f30272l;
            } else if (iOrdinal2 == 1) {
                enumC15475l = EnumC15475l.f30275l;
            } else if (iOrdinal2 == 2) {
                enumC15475l = EnumC15475l.f30277l;
            } else if (iOrdinal2 != 3) {
                enumC15475l = iOrdinal2 != 4 ? EnumC15475l.f30273l : EnumC15475l.f30278l;
            } else {
                enumC15475l = EnumC15475l.f30276l;
            }
            Class cls = enumC15475l.f30279l;
            if (cls != null) {
                c10375l.isPro = cls;
            }
            C16774l c16774lAmazon = C16774l.amazon(interfaceC0048l, size);
            C9598l c9598l = c16774lAmazon.loadAd;
            c16774lAmazon.loadAd(c10375l, c15421l, -1);
            Range range = c14591l.subs;
            Range range2 = AbstractC8576l.yandex(range, C5464l.admob) ? null : range;
            if (range2 == null) {
                range2 = C12632l.yandex;
            }
            c9598l.getClass();
            ((C5104l) c9598l.f19553l).mopub(C0665l.billing, range2);
            if (i == 4) {
                c9598l.getClass();
                ((C5104l) c9598l.f19553l).mopub(InterfaceC0048l.f918l, 2);
            } else if (i == 3) {
                c9598l.getClass();
                ((C5104l) c9598l.f19553l).mopub(InterfaceC0048l.f921l, 2);
            }
            c11419l.yandex(c16774lAmazon.crashlytics());
            boolean zCrashlytics = c11419l.crashlytics();
            StringBuilder sb = new StringBuilder("Cannot create a combined SessionConfig for feature combo after adding ");
            sb.append(interfaceC0048l);
            sb.append(" with ");
            sb.append(c2483l);
            sb.append(" due to [");
            sb.append(!c11419l.remoteconfig ? "Template is not set" : c11419l.smaato.toString());
            sb.append("]; surfaceConfigList = ");
            sb.append(arrayList);
            sb.append(", featureSettings = ");
            sb.append(c14591l);
            sb.append(", newUseCaseConfigs = ");
            sb.append(list);
            AbstractC5641l.purchase(sb.toString(), zCrashlytics);
            it2 = it3;
            i4 = i5;
        }
        C10814l c10814lLoadAd = c11419l.loadAd();
        boolean zAds = this.crashlytics.ads(c10814lLoadAd);
        Iterator it4 = c10814lLoadAd.loadAd().iterator();
        while (it4.hasNext()) {
            ((AbstractC0958l) it4.next()).yandex();
        }
        return zAds;
    }
}

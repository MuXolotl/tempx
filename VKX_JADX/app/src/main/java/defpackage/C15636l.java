package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lّٕٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15636l implements InterfaceC15879l, InterfaceC5899l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C7647l f30569l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final InterfaceC2360l f30570l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C5979l f30571l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C17927l f30572l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C15736l f30573l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C8688l f30574l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C10035l f30575l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C5800l f30576l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C8688l f30577l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C5849l f30578l;

    public C15636l(C15736l c15736l, C17927l c17927l, C7647l c7647l, C5800l c5800l, C10035l c10035l, C5849l c5849l, InterfaceC2360l interfaceC2360l, C5979l c5979l) {
        String str;
        this.f30573l = c15736l;
        this.f30572l = c17927l;
        this.f30569l = c7647l;
        this.f30576l = c5800l;
        this.f30575l = c10035l;
        this.f30578l = c5849l;
        this.f30570l = interfaceC2360l;
        this.f30571l = c5979l;
        Object objCrashlytics = ((C10861l) c15736l.loadAd).crashlytics(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        Integer num = (Integer) (objCrashlytics != null ? objCrashlytics : -1);
        final int i = 1;
        if (num.intValue() == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (num.intValue() == 4) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        } else if (num.intValue() == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (num.intValue() == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (num.intValue() == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else {
            str = "Unknown value: " + num;
        }
        if (AbstractC5088l.remoteconfig()) {
            Log.i("CXCP", "Device Level: ".concat(str));
        }
        final int i2 = 0;
        this.f30577l = new C8688l(new Function0(this) { // from class: lٌٌٙ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C15636l f18235l;

            {
                this.f18235l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                C15636l c15636l = this.f18235l;
                switch (i3) {
                    case 0:
                        C11905l c11905l = InterfaceC5389l.admob;
                        InterfaceC5389l interfaceC5389l = c15636l.f30573l.loadAd;
                        c11905l.getClass();
                        return Boolean.valueOf(C11905l.loadAd(interfaceC5389l));
                    default:
                        C15736l c15736l2 = c15636l.f30573l;
                        C7487l c7487l = new C7487l();
                        String str2 = c15736l2.yandex.loadAd;
                        return c7487l;
                }
            }
        });
        this.f30574l = new C8688l(new Function0(this) { // from class: lٌٌٙ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C15636l f18235l;

            {
                this.f18235l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                C15636l c15636l = this.f18235l;
                switch (i3) {
                    case 0:
                        C11905l c11905l = InterfaceC5389l.admob;
                        InterfaceC5389l interfaceC5389l = c15636l.f30573l.loadAd;
                        c11905l.getClass();
                        return Boolean.valueOf(C11905l.loadAd(interfaceC5389l));
                    default:
                        C15736l c15736l2 = c15636l.f30573l;
                        C7487l c7487l = new C7487l();
                        String str2 = c15736l2.yandex.loadAd;
                        return c7487l;
                }
            }
        });
    }

    @Override // defpackage.InterfaceC15879l
    public final InterfaceC2360l ad() {
        return this.f30570l;
    }

    @Override // defpackage.InterfaceC15879l
    public final AbstractC8769l admob() {
        return this.f30576l.loadAd.purchase;
    }

    @Override // defpackage.InterfaceC15879l
    public final List advert() {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f30571l.crashlytics.f16631l;
        Size[] highSpeedVideoSizes = streamConfigurationMap != null ? streamConfigurationMap.getHighSpeedVideoSizes() : null;
        return highSpeedVideoSizes != null ? AbstractC8669l.m2415super(highSpeedVideoSizes) : C2580l.f5619l;
    }

    @Override // defpackage.InterfaceC15879l
    public final boolean amazon() {
        if (metrica() == 2) {
            return true;
        }
        Integer num = (Integer) ((C10861l) this.f30573l.loadAd).crashlytics(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 4;
    }

    @Override // defpackage.InterfaceC15879l
    public final C17735l applovin() {
        return this.f30578l.yandex();
    }

    @Override // defpackage.InterfaceC15879l
    public final List appmetrica(int i) {
        Size[] sizeArrYandex = this.f30571l.yandex(i);
        return sizeArrYandex != null ? AbstractC8669l.m2415super(sizeArrYandex) : C2580l.f5619l;
    }

    @Override // defpackage.InterfaceC15879l
    public final int crashlytics() {
        return tapsense(0);
    }

    @Override // defpackage.InterfaceC15879l
    public final Rect firebase() {
        Rect rect = (Rect) ((C10861l) this.f30573l.loadAd).crashlytics(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return ("robolectric".equals(Build.FINGERPRINT) && rect == null) ? new Rect(0, 0, 4000, 3000) : rect;
    }

    @Override // defpackage.InterfaceC15879l
    public final List isPro(Range range) {
        Object c18435l;
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f30571l.crashlytics.f16631l;
            Size[] highSpeedVideoSizesFor = streamConfigurationMap != null ? streamConfigurationMap.getHighSpeedVideoSizesFor(range) : null;
            c18435l = highSpeedVideoSizesFor != null ? AbstractC8669l.m2415super(highSpeedVideoSizesFor) : null;
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        List list = (List) (c18435l instanceof C18435l ? null : c18435l);
        return list == null ? C2580l.f5619l : list;
    }

    @Override // defpackage.InterfaceC15879l
    public final Object license() {
        return (CameraCharacteristics) ((C10861l) this.f30573l.loadAd).mo842while(AbstractC18202l.yandex.loadAd(CameraCharacteristics.class));
    }

    @Override // defpackage.InterfaceC15879l
    public final Set loadAd() {
        return ((InterfaceC0553l) AbstractC2847l.purchase(this.f30573l.loadAd).f29576l).loadAd();
    }

    @Override // defpackage.InterfaceC15879l
    public final int metrica() {
        int iIntValue = ((Number) ((C10861l) this.f30573l.loadAd).crashlytics(CameraCharacteristics.LENS_FACING)).intValue();
        if (iIntValue == 0) {
            return 0;
        }
        int i = 1;
        if (iIntValue != 1) {
            i = 2;
            if (iIntValue != 2) {
                if (!AbstractC5088l.metrica()) {
                    return -1;
                }
                Log.w("CXCP", "Unrecognized lens facing: " + iIntValue + '!');
                return -1;
            }
        }
        return i;
    }

    @Override // defpackage.InterfaceC15879l
    public final String mopub() {
        return this.f30572l.loadAd;
    }

    @Override // defpackage.InterfaceC15879l
    /* JADX INFO: renamed from: native */
    public final void mo3790native(AbstractC4829l abstractC4829l) {
        C10035l c10035l = this.f30575l;
        synchronized (c10035l.f20455l) {
            c10035l.f20455l.remove(abstractC4829l);
            c10035l.f20453l = AbstractC8676l.tapsense(c10035l.f20455l);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC15879l
    public final void premium(Executor executor, C4470l c4470l) {
        this.f30575l.yandex(c4470l, executor);
    }

    @Override // defpackage.InterfaceC15879l
    public final /* synthetic */ boolean pro(C5008l c5008l, C1869l c1869l) {
        return AbstractC14814l.yandex(this, c1869l, c5008l);
    }

    @Override // defpackage.InterfaceC15879l
    public final boolean purchase() {
        int[] iArr = (int[]) ((C10861l) this.f30573l.loadAd).crashlytics(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        return iArr != null && AbstractC8669l.tapsense(iArr, 1);
    }

    @Override // defpackage.InterfaceC15879l
    public final void remoteconfig(C10038l c10038l) {
        AbstractC17943l.smaato = c10038l;
    }

    @Override // defpackage.InterfaceC15879l
    public final boolean smaato() {
        C11905l c11905l = InterfaceC5389l.admob;
        InterfaceC5389l interfaceC5389l = this.f30573l.loadAd;
        c11905l.getClass();
        int[] iArr = (int[]) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr == null) {
            iArr = C11905l.loadAd;
        }
        return AbstractC8669l.tapsense(iArr, 9);
    }

    @Override // defpackage.InterfaceC15879l
    public final EnumC8920l startapp() {
        int iIntValue = ((Number) ((C10861l) this.f30573l.loadAd).crashlytics(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE)).intValue();
        EnumC8920l enumC8920l = EnumC8920l.f18385l;
        return (iIntValue == 0 || iIntValue != 1) ? enumC8920l : EnumC8920l.f18384l;
    }

    @Override // defpackage.InterfaceC15879l
    /* JADX INFO: renamed from: strictfp */
    public final Set mo3791strictfp() {
        int length;
        int[] iArr = (int[]) ((C10861l) this.f30573l.loadAd).crashlytics(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        C5746l c5746l = C5746l.f12138l;
        if (iArr == null || (length = iArr.length) == 0) {
            return c5746l;
        }
        if (length == 1) {
            return Collections.singleton(Integer.valueOf(iArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC2200l.firebase(iArr.length));
        for (int i : iArr) {
            linkedHashSet.add(Integer.valueOf(i));
        }
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC15879l
    public final String subscription() {
        return ((Boolean) this.f30577l.getValue()).booleanValue() ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // defpackage.InterfaceC15879l
    public final int tapsense(int i) {
        return AbstractC7799l.loadAd(AbstractC7799l.purchase(i), ((Number) ((C10861l) this.f30573l.loadAd).crashlytics(CameraCharacteristics.SENSOR_ORIENTATION)).intValue(), 1 == metrica());
    }

    @Override // defpackage.InterfaceC15879l
    /* JADX INFO: renamed from: throws */
    public final AbstractC8769l mo3792throws() {
        return (C13716l) this.f30576l.yandex.purchase.getValue();
    }

    public final String toString() {
        return "CameraInfoAdapter<" + this.f30572l + ".cameraId>";
    }

    @Override // defpackage.InterfaceC15879l
    /* JADX INFO: renamed from: volatile */
    public final Set mo3793volatile() {
        Integer[] numArrMo2223catch = this.f30571l.crashlytics.mo2223catch();
        return numArrMo2223catch != null ? AbstractC8669l.m2407import(numArrMo2223catch) : C5746l.f12138l;
    }

    @Override // defpackage.InterfaceC5899l
    /* JADX INFO: renamed from: while */
    public final Object mo842while(InterfaceC1388l interfaceC1388l) {
        C2336l c2336l = AbstractC18202l.yandex;
        if (interfaceC1388l.equals(c2336l.loadAd(C7487l.class))) {
            return (C7487l) this.f30574l.getValue();
        }
        boolean zEquals = interfaceC1388l.equals(c2336l.loadAd(C15736l.class));
        C15736l c15736l = this.f30573l;
        if (zEquals) {
            return c15736l;
        }
        return interfaceC1388l.equals(c2336l.loadAd(InterfaceC5389l.class)) ? c15736l.loadAd : ((C10861l) c15736l.loadAd).mo842while(interfaceC1388l);
    }

    @Override // defpackage.InterfaceC15879l
    public final AbstractC8769l yandex() {
        return this.f30569l.crashlytics;
    }

    @Override // defpackage.InterfaceC15879l
    public final InterfaceC15879l subs() {
        return this;
    }
}

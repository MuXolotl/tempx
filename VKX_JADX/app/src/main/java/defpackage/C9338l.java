package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Unit;

/* JADX INFO: renamed from: lٍؖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9338l implements InterfaceC10408l {
    public final InterfaceC2889l admob;
    public final C0708l amazon;
    public final C12094l billing;
    public final C15158l crashlytics;
    public final C16656l isPro;
    public final C15736l loadAd;
    public final C15048l mopub;
    public final C8715l purchase;
    public final C9410l subs;

    public C9338l(C15736l c15736l, C15158l c15158l, C0708l c0708l, C4280l c4280l, C8715l c8715l, C12094l c12094l, C15048l c15048l, InterfaceC2889l interfaceC2889l, C9410l c9410l, C15252l c15252l, C14338l c14338l, C16656l c16656l) {
        this.loadAd = c15736l;
        this.crashlytics = c15158l;
        this.amazon = c0708l;
        this.purchase = c8715l;
        this.billing = c12094l;
        this.mopub = c15048l;
        this.admob = interfaceC2889l;
        this.subs = c9410l;
        this.isPro = c16656l;
    }

    @Override // defpackage.InterfaceC10408l
    public final void admob(InterfaceC2406l interfaceC2406l) {
        this.crashlytics.getClass();
    }

    @Override // defpackage.InterfaceC10408l
    public final ListenableFuture amazon(float f) {
        float fLoadAd;
        C15048l c15048l = this.mopub;
        c15048l.getClass();
        if (f > 1.0f || f < 0.0f) {
            return new C11077l(1, new IllegalArgumentException(AbstractC4582l.loadAd("Requested linearZoom ", f, " is not within valid range [0, 1]")));
        }
        float f2 = c15048l.loadAd;
        float f3 = c15048l.crashlytics;
        float f4 = f - 1.0f;
        if (Math.abs(f4) < ((double) Math.ulp(Math.abs(f4))) * 2.0d) {
            fLoadAd = f3;
        } else {
            float f5 = f - 0.0f;
            if (Math.abs(f5) < ((double) Math.ulp(Math.abs(f5))) * 2.0d) {
                fLoadAd = f2;
            } else {
                float f6 = 1.0f / f2;
                fLoadAd = AbstractC12704l.loadAd(1.0f / (f6 - ((f6 - (1.0f / f3)) * f)), f2, f3);
            }
        }
        return c15048l.yandex(new C11888l(fLoadAd, f2, f3), true, true);
    }

    @Override // defpackage.InterfaceC10408l
    public final ListenableFuture billing(float f) {
        C15048l c15048l = this.mopub;
        float f2 = c15048l.loadAd;
        float f3 = c15048l.crashlytics;
        if (f <= f3 && f >= f2) {
            return c15048l.yandex(new C11888l(f, f2, f3), true, true);
        }
        StringBuilder sbTapsense = AbstractC14814l.tapsense("Requested zoomRatio ", f, " is not within valid range [", f2, ", ");
        sbTapsense.append(f3);
        sbTapsense.append(']');
        return new C11077l(1, new IllegalArgumentException(sbTapsense.toString()));
    }

    @Override // defpackage.InterfaceC10408l
    public final void crashlytics() {
        C11879l c11879l = this.isPro.yandex;
        c11879l.getClass();
        int iDecrementAndGet = C11879l.loadAd.decrementAndGet(c11879l);
        if (iDecrementAndGet >= 0) {
            if (AbstractC5088l.firebase("CXCP")) {
                Log.d("CXCP", "decrementUsage: videoUsage = " + iDecrementAndGet);
                return;
            }
            return;
        }
        if (AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "decrementUsage: videoUsage = " + iDecrementAndGet + ", which is less than 0!");
        }
    }

    @Override // defpackage.InterfaceC10408l
    public final InterfaceC17944l firebase() {
        C5501l c5501l;
        C17295l c17295l = this.subs.yandex;
        synchronized (c17295l.f33567l) {
            C16443l c16443lM2952for = c17295l.f33565l.m2952for();
            C3316l c3316l = new C3316l(6);
            c16443lM2952for.inmobi(new C5131l(c3316l, c16443lM2952for, 0));
            c5501l = new C5501l(5, C7420l.yandex((C5104l) c3316l.f7072l));
        }
        return c5501l;
    }

    @Override // defpackage.InterfaceC10408l
    public final ListenableFuture isPro(boolean z) {
        Integer num;
        C11905l c11905l = InterfaceC5389l.admob;
        InterfaceC5389l interfaceC5389l = this.loadAd.loadAd;
        c11905l.getClass();
        int[] iArr = (int[]) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (!(iArr == null ? false : AbstractC8669l.tapsense(iArr, 6)) || ((num = (Integer) this.billing.billing.amazon()) != null && num.intValue() == -1)) {
            return AbstractC11356l.admob(AbstractC11356l.smaato(C15815l.loadAd(AbstractC0140l.crashlytics(C8715l.yandex(this.purchase, z, 6))), new C1770l(14, new C8936l(24)), AbstractC12272l.yandex()));
        }
        if (AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "Unable to enable/disable torch when low-light boost is on.");
        }
        return new C11077l(1, new IllegalStateException("Torch can not be enabled/disable when low-light boost is on!"));
    }

    @Override // defpackage.InterfaceC10408l
    public final void loadAd(C16774l c16774l) {
        this.admob.loadAd(c16774l);
    }

    @Override // defpackage.InterfaceC10408l
    public final void mopub(int i) {
        boolean z = true;
        this.crashlytics.crashlytics(i, true);
        if (i != 1 && i != 0) {
            z = false;
        }
        this.admob.crashlytics(z);
    }

    @Override // defpackage.InterfaceC10408l
    public final void purchase(InterfaceC17944l interfaceC17944l) {
        C9410l c9410l = this.subs;
        C3316l c3316l = new C3316l(6);
        interfaceC17944l.inmobi(new C5131l(c3316l, interfaceC17944l, 0));
        C7420l c7420lYandex = C7420l.yandex((C5104l) c3316l.f7072l);
        C17295l c17295l = c9410l.yandex;
        synchronized (c17295l.f33567l) {
            try {
                for (C6916l c6916l : c7420lYandex.startapp()) {
                    ((C5104l) c17295l.f33565l.f21690l).purchase(c6916l, EnumC10534l.f21430l, c7420lYandex.adcel(c6916l));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        C9426l c9426lYandex = c9410l.yandex.yandex(c9410l.amazon, true);
        C5807l c5807l = new C5807l();
        c5807l.crashlytics = new C0011l();
        C16565l c16565l = new C16565l(c5807l);
        c5807l.loadAd = c16565l;
        c5807l.yandex = AbstractC5020l.class;
        try {
            c9426lYandex.mo2154l(new C3005l(c5807l, c9426lYandex, 4));
            c5807l.yandex = "addCaptureRequestOptions";
        } catch (Exception e) {
            c16565l.loadAd(e);
        }
        AbstractC11356l.admob(c16565l);
    }

    @Override // defpackage.InterfaceC10408l
    public final void remoteconfig() {
        C11879l c11879l = this.isPro.yandex;
        c11879l.getClass();
        int iIncrementAndGet = C11879l.loadAd.incrementAndGet(c11879l);
        if (AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "incrementUsage: videoUsage = " + iIncrementAndGet);
        }
    }

    @Override // defpackage.InterfaceC10408l
    public final void smaato() {
        C9410l c9410l = this.subs;
        C17295l c17295l = c9410l.yandex;
        synchronized (c17295l.f33567l) {
            c17295l.f33565l = new C10685l(3);
            Unit unit = Unit.INSTANCE;
        }
        C9426l c9426lYandex = c9410l.yandex.yandex(c9410l.amazon, true);
        C5807l c5807l = new C5807l();
        c5807l.crashlytics = new C0011l();
        C16565l c16565l = new C16565l(c5807l);
        c5807l.loadAd = c16565l;
        c5807l.yandex = AbstractC5020l.class;
        try {
            c9426lYandex.mo2154l(new C3005l(c5807l, c9426lYandex, 4));
            c5807l.yandex = "clearCaptureRequestOptions";
        } catch (Exception e) {
            c16565l.loadAd(e);
        }
        AbstractC11356l.admob(c16565l);
    }

    /* JADX WARN: Failed to calculate best type for var: r10v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v0 ??, new type: lًٜٗ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v0 ??, new type: lًٜٗ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r18v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v2 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r18v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v2 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v18 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v3 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v3 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
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
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // defpackage.InterfaceC10408l
    public final com.google.common.util.concurrent.ListenableFuture subs(defpackage.C0093l r26) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9338l.subs(lٟؑؕ):com.google.common.util.concurrent.ListenableFuture");
    }

    @Override // defpackage.InterfaceC10408l
    public final void yandex() {
        this.admob.yandex();
    }
}

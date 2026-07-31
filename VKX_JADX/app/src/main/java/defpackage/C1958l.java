package defpackage;

import android.os.Trace;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؓٛۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1958l {
    public boolean amazon;
    public boolean crashlytics;
    public C15519l subs;
    public final C3654l yandex;
    public final C18449l loadAd = new C18449l(14);
    public final C18396l purchase = new C18396l(11);
    public final C17893l billing = new C17893l(0, new C3654l[16]);
    public final long mopub = 1;
    public final C17893l admob = new C17893l(0, new C13255l[16]);

    public C1958l(C3654l c3654l) {
        this.yandex = c3654l;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    public static boolean amazon(C3654l c3654l, C15519l c15519l) {
        boolean zM1465return;
        C3654l c3654l2 = c3654l.f7693l;
        C14070l c14070l = c3654l.f7667l;
        if (c3654l2 == null) {
            return false;
        }
        if (c15519l == null) {
            C4020l c4020l = c14070l.adcel;
            C15519l c15519l2 = c4020l != null ? c4020l.f8284l : null;
            if (c15519l2 == null || c3654l2 == null) {
                zM1465return = false;
            } else {
                zM1465return = c4020l.m1465return(c15519l2.yandex);
            }
        } else if (c3654l2 != null) {
            zM1465return = c14070l.adcel.m1465return(c15519l.yandex);
        } else {
            zM1465return = false;
        }
        C3654l c3654lLicense = c3654l.license();
        if (zM1465return && c3654lLicense != null) {
            if (c3654lLicense.f7693l == null) {
                C3654l.m1371goto(c3654lLicense, false, 3);
                return zM1465return;
            }
            if (c3654l.tapsense() == 1) {
                C3654l.m1370final(c3654lLicense, false, 3);
                return zM1465return;
            }
            if (c3654l.tapsense() == 2) {
                c3654lLicense.m1378default(false);
            }
        }
        return zM1465return;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:21:0x0037 A[SYNTHETIC] */
    public static boolean firebase(C3654l c3654l) {
        if (c3654l.ads()) {
            do {
                if (c3654l.subscription() != 3 || c3654l.f7667l.startapp.f29327l.purchase()) {
                    c3654l = c3654l.license();
                    if (c3654l == null) {
                    }
                } else {
                    C3654l c3654lLicense = c3654l.license();
                    if ((c3654lLicense != null ? c3654lLicense.f7667l.amazon : 0) == 1) {
                        c3654l = c3654l.license();
                        if (c3654l == null) {
                        }
                    }
                }
            } while (!c3654l.m1389private());
            return true;
        }
        return false;
    }

    public static boolean isPro(C3654l c3654l) {
        C4020l c4020l;
        C7074l c7074l;
        if (c3654l.f7667l.purchase) {
            return (c3654l.tapsense() == 3 && ((c4020l = c3654l.f7667l.adcel) == null || (c7074l = c4020l.f8272l) == null || !c7074l.purchase())) ? false : true;
        }
        return false;
    }

    public static boolean purchase(C3654l c3654l, C15519l c15519l) {
        boolean zM1394switch = c15519l != null ? c3654l.m1394switch(c15519l) : C3654l.m1369continue(c3654l);
        C3654l c3654lLicense = c3654l.license();
        if (zM1394switch && c3654lLicense != null) {
            if (c3654l.subscription() == 1) {
                C3654l.m1371goto(c3654lLicense, false, 3);
                return zM1394switch;
            }
            if (c3654l.subscription() == 2) {
                c3654lLicense.m1387new(false);
            }
        }
        return zM1394switch;
    }

    public static boolean smaato(C3654l c3654l) {
        C4020l c4020l;
        C7074l c7074l;
        C14070l c14070l = c3654l.f7667l;
        return c3654l.m1389private() || c14070l.startapp.f29322l || firebase(c3654l) || AbstractC8576l.yandex(c3654l.m1380extends(), Boolean.TRUE) || isPro(c3654l) || c14070l.startapp.f29327l.purchase() || !((c4020l = c14070l.adcel) == null || (c7074l = c4020l.f8272l) == null || !c7074l.purchase());
    }

    public static final boolean yandex(C1958l c1958l, C3654l c3654l, boolean z) {
        AbstractC9601l placementScope;
        C11103l c11103l;
        C3654l c3654lLicense;
        C3654l c3654l2 = c1958l.yandex;
        boolean z2 = c3654l.f7684l;
        C14070l c14070l = c3654l.f7667l;
        boolean zAmazon = false;
        if (!z2 && smaato(c3654l)) {
            C15519l c15519l = c3654l == c3654l2 ? c1958l.subs : null;
            if (z) {
                zAmazon = c14070l.purchase ? amazon(c3654l, c15519l) : false;
                if ((zAmazon || c14070l.billing) && AbstractC8576l.yandex(c3654l.m1380extends(), Boolean.TRUE)) {
                    c3654l.m1382for();
                }
            } else {
                boolean zPurchase = c3654l.ads() ? purchase(c3654l, c15519l) : false;
                if (c3654l.adcel() && (c3654l == c3654l2 || ((c3654lLicense = c3654l.license()) != null && c3654lLicense.m1389private() && c14070l.startapp.f29322l))) {
                    if (c3654l == c3654l2) {
                        if (c3654l.f7698l == 3) {
                            c3654l.billing();
                        }
                        C3654l c3654lLicense2 = c3654l.license();
                        if (c3654lLicense2 == null || (c11103l = (C11103l) c3654lLicense2.f7703l.amazon) == null || (placementScope = c11103l.f23546l) == null) {
                            placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c3654l)).getPlacementScope();
                        }
                        AbstractC9601l.smaato(placementScope, c14070l.startapp, 0, 0);
                    } else {
                        c3654l.m1392static();
                    }
                    C18396l c18396l = c1958l.purchase;
                    c18396l.getClass();
                    if (c3654l.f7672l > 0) {
                        ((C17893l) c18396l.f35934l).crashlytics(c3654l);
                        c3654l.f7681l = true;
                    }
                }
                zAmazon = zPurchase;
            }
            c1958l.billing();
        }
        return zAmazon;
    }

    public final void adcel(C3654l c3654l) {
        C17893l c17893lSignatures = c3654l.signatures();
        Object[] objArr = c17893lSignatures.f34848l;
        int i = c17893lSignatures.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            C3654l c3654l2 = (C3654l) objArr[i2];
            if (c3654l2.subscription() == 1 || c3654l2.f7667l.startapp.f29327l.purchase()) {
                if (AbstractC13082l.loadAd(c3654l2)) {
                    ads(c3654l2, true);
                } else {
                    adcel(c3654l2);
                }
            }
        }
    }

    public final void admob(C3654l c3654l, boolean z) {
        if (!this.crashlytics) {
            AbstractC0081l.crashlytics("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? c3654l.f7667l.purchase : c3654l.ads()) {
            AbstractC0081l.yandex("node not yet measured");
        }
        subs(c3654l, z);
    }

    public final void ads(C3654l c3654l, boolean z) {
        if (c3654l.f7684l) {
            return;
        }
        C15519l c15519l = c3654l == this.yandex ? this.subs : null;
        if (z) {
            amazon(c3654l, c15519l);
        } else {
            purchase(c3654l, c15519l);
        }
    }

    public final void billing() {
        C17893l c17893l = this.admob;
        int i = c17893l.f34846l;
        if (i != 0) {
            Object[] objArr = c17893l.f34848l;
            for (int i2 = 0; i2 < i; i2++) {
                C13255l c13255l = (C13255l) objArr[i2];
                if (c13255l.yandex.m1386native()) {
                    boolean z = c13255l.loadAd;
                    C3654l c3654l = c13255l.yandex;
                    boolean z2 = c13255l.crashlytics;
                    if (z) {
                        C3654l.m1370final(c3654l, z2, 2);
                    } else {
                        C3654l.m1371goto(c3654l, z2, 2);
                    }
                }
            }
            c17893l.isPro();
        }
    }

    public final void crashlytics(boolean z) {
        C18396l c18396l = this.purchase;
        if (z) {
            C17893l c17893l = (C17893l) c18396l.f35934l;
            C3654l c3654l = this.yandex;
            if (c3654l.f7672l > 0) {
                c17893l.isPro();
                c17893l.crashlytics(c3654l);
                c3654l.f7681l = true;
            }
        }
        if (((C17893l) c18396l.f35934l).f34846l != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                c18396l.Signature();
                Unit unit = Unit.INSTANCE;
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void loadAd() {
        AbstractC14971l abstractC14971l;
        C17893l c17893l = this.billing;
        Object[] objArr = c17893l.f34848l;
        int i = c17893l.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            C18289l c18289l = ((C3654l) objArr[i2]).f7703l;
            C11103l c11103l = (C11103l) c18289l.amazon;
            boolean zMopub = AbstractC3068l.mopub(4194304);
            if (zMopub) {
                abstractC14971l = c11103l.f22307l;
            } else {
                abstractC14971l = c11103l.f22307l.f29456l;
                if (abstractC14971l == null) {
                }
            }
            C6148l c6148l = AbstractC18026l.f35263l;
            for (AbstractC14971l abstractC14971lM4493l = c11103l.m4493l(zMopub); abstractC14971lM4493l != null && (abstractC14971lM4493l.f29457l & 4194304) != 0; abstractC14971lM4493l = abstractC14971lM4493l.f29460l) {
                if ((abstractC14971lM4493l.f29450l & 4194304) != 0) {
                    ?? LoadAd = abstractC14971lM4493l;
                    ?? c17893l2 = 0;
                    while (LoadAd != 0) {
                        if (LoadAd instanceof InterfaceC15641l) {
                            ((InterfaceC15641l) LoadAd).startapp((C11103l) c18289l.amazon);
                        } else if ((LoadAd.f29450l & 4194304) != 0 && (LoadAd instanceof AbstractC11340l)) {
                            AbstractC14971l abstractC14971l2 = ((AbstractC11340l) LoadAd).f22875l;
                            int i3 = 0;
                            LoadAd = LoadAd;
                            c17893l2 = c17893l2;
                            while (abstractC14971l2 != null) {
                                if ((abstractC14971l2.f29450l & 4194304) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        c17893l2 = c17893l2;
                                        LoadAd = abstractC14971l2;
                                    } else {
                                        if (c17893l2 == 0) {
                                            c17893l2 = new C17893l(0, new AbstractC14971l[16]);
                                        }
                                        if (LoadAd != 0) {
                                            c17893l2.crashlytics(LoadAd);
                                            LoadAd = 0;
                                        }
                                        c17893l2.crashlytics(abstractC14971l2);
                                    }
                                }
                                abstractC14971l2 = abstractC14971l2.f29460l;
                                LoadAd = LoadAd;
                                c17893l2 = c17893l2;
                            }
                            if (i3 == 1) {
                            }
                        }
                        LoadAd = AbstractC5573l.loadAd(c17893l2);
                    }
                }
                if (abstractC14971lM4493l == abstractC14971l) {
                    break;
                }
            }
        }
        c17893l.isPro();
    }

    public final void metrica() {
        C18449l c18449l = this.loadAd;
        if (c18449l.m4540else()) {
            C3654l c3654l = this.yandex;
            if (!c3654l.m1386native()) {
                AbstractC0081l.yandex("performMeasureAndLayout called with unattached root");
            }
            if (!c3654l.m1389private()) {
                AbstractC0081l.yandex("performMeasureAndLayout called with unplaced root");
            }
            if (this.crashlytics) {
                AbstractC0081l.yandex("performMeasureAndLayout called during measure layout");
            }
            if (this.subs != null) {
                this.crashlytics = true;
                this.amazon = false;
                try {
                    if ((((C10127l) ((C7972l) c18449l.f36012l).f16631l).isEmpty() || ((C10127l) ((C7972l) c18449l.f36010l).f16631l).isEmpty()) ? false : true) {
                        if (c3654l.f7693l != null) {
                            ads(c3654l, true);
                        } else {
                            adcel(c3654l);
                        }
                    }
                    ads(c3654l, false);
                    this.crashlytics = false;
                    this.amazon = false;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        this.crashlytics = false;
                        this.amazon = false;
                        throw th2;
                    }
                }
            }
        }
    }

    public final void mopub(C3654l c3654l) {
        C17893l c17893lSignatures = c3654l.signatures();
        Object[] objArr = c17893lSignatures.f34848l;
        int i = c17893lSignatures.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            C3654l c3654l2 = (C3654l) objArr[i2];
            if (AbstractC8576l.yandex(c3654l2.m1380extends(), Boolean.TRUE) && !c3654l2.f7684l) {
                if (this.loadAd.premium(c3654l2)) {
                    c3654l2.m1382for();
                }
                mopub(c3654l2);
            }
        }
    }

    public final boolean remoteconfig(Function0 function0) {
        boolean z;
        boolean z2;
        C3654l c3654l;
        boolean z3;
        boolean zStartapp;
        C18449l c18449l = this.loadAd;
        C3654l c3654l2 = this.yandex;
        if (!c3654l2.m1386native()) {
            AbstractC0081l.yandex("performMeasureAndLayout called with unattached root");
        }
        if (!c3654l2.m1389private()) {
            AbstractC0081l.yandex("performMeasureAndLayout called with unplaced root");
        }
        if (this.crashlytics) {
            AbstractC0081l.yandex("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.subs != null) {
            this.crashlytics = true;
            this.amazon = true;
            try {
                boolean zM4540else = c18449l.m4540else();
                C7972l c7972l = (C7972l) c18449l.f36010l;
                if (zM4540else) {
                    z = false;
                    while (true) {
                        C7972l c7972l2 = (C7972l) c18449l.f36012l;
                        C7972l c7972l3 = (C7972l) c18449l.f36009l;
                        if (!((C10127l) c7972l.f16631l).isEmpty()) {
                            c3654l = (C3654l) ((C10127l) c7972l.f16631l).first();
                            c7972l.m2236new(c3654l);
                            z3 = c3654l.f7693l != null;
                            z2 = false;
                        } else if (!((C10127l) c7972l3.f16631l).isEmpty()) {
                            c3654l = (C3654l) ((C10127l) c7972l3.f16631l).first();
                            c7972l3.m2236new(c3654l);
                            z3 = c3654l.f7693l != null;
                            z2 = true;
                        } else {
                            if (((C10127l) c7972l2.f16631l).isEmpty()) {
                                break;
                            }
                            C3654l c3654l3 = (C3654l) ((C10127l) c7972l2.f16631l).first();
                            c7972l2.m2236new(c3654l3);
                            z2 = true;
                            c3654l = c3654l3;
                            z3 = false;
                        }
                        if (z2) {
                            zStartapp = yandex(this, c3654l, z3);
                        } else {
                            zStartapp = startapp(c3654l, z3);
                            if (c3654l.f7667l.billing) {
                                c18449l.ads(2, c3654l);
                            }
                            if (c3654l.adcel()) {
                                c18449l.ads(4, c3654l);
                            }
                        }
                        if (c3654l == c3654l2 && zStartapp) {
                            z = true;
                        }
                    }
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    z = false;
                }
                this.crashlytics = false;
                this.amazon = false;
                z4 = z;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.crashlytics = false;
                    this.amazon = false;
                    throw th2;
                }
            }
        }
        loadAd();
        return z4;
    }

    public final boolean startapp(C3654l c3654l, boolean z) {
        boolean zPurchase = false;
        if (!c3654l.f7684l && smaato(c3654l)) {
            C15519l c15519l = c3654l == this.yandex ? this.subs : null;
            if (z) {
                if (c3654l.f7667l.purchase) {
                    zPurchase = amazon(c3654l, c15519l);
                }
            } else if (c3654l.ads()) {
                zPurchase = purchase(c3654l, c15519l);
            }
            billing();
        }
        return zPurchase;
    }

    public final void subs(C3654l c3654l, boolean z) {
        C4020l c4020l;
        C7074l c7074l;
        C17893l c17893lSignatures = c3654l.signatures();
        Object[] objArr = c17893lSignatures.f34848l;
        int i = c17893lSignatures.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            C3654l c3654l2 = (C3654l) objArr[i2];
            if ((!z && (c3654l2.subscription() == 1 || c3654l2.f7667l.startapp.f29327l.purchase())) || (z && (c3654l2.tapsense() == 1 || ((c4020l = c3654l2.f7667l.adcel) != null && (c7074l = c4020l.f8272l) != null && c7074l.purchase())))) {
                boolean zLoadAd = AbstractC13082l.loadAd(c3654l2);
                C14070l c14070l = c3654l2.f7667l;
                if (zLoadAd && !z) {
                    if (c14070l.purchase && this.loadAd.premium(c3654l2)) {
                        startapp(c3654l2, true);
                    } else {
                        admob(c3654l2, true);
                    }
                }
                if (z ? c14070l.purchase : c3654l2.ads()) {
                    startapp(c3654l2, z);
                }
                if (!(z ? c14070l.purchase : c3654l2.ads())) {
                    subs(c3654l2, z);
                }
            }
        }
        if (z ? c3654l.f7667l.purchase : c3654l.ads()) {
            startapp(c3654l, z);
        }
    }

    public final boolean subscription(C3654l c3654l, boolean z) {
        int iInmobi = AbstractC5020l.inmobi(c3654l.f7667l.amazon);
        if (iInmobi != 0 && iInmobi != 1) {
            if (iInmobi == 2 || iInmobi == 3) {
                this.admob.crashlytics(new C13255l(c3654l, false, z));
            } else {
                if (iInmobi != 4) {
                    C18725l.billing();
                    return false;
                }
                if (!c3654l.ads() || z) {
                    c3654l.f7667l.startapp.f29321l = true;
                    if (!c3654l.f7684l && (c3654l.m1389private() || firebase(c3654l))) {
                        C3654l c3654lLicense = c3654l.license();
                        if (c3654lLicense == null || !c3654lLicense.ads()) {
                            this.loadAd.ads(3, c3654l);
                        }
                        if (!this.amazon) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void tapsense(long j) {
        C15519l c15519l = this.subs;
        if (c15519l == null ? false : C15519l.loadAd(c15519l.yandex, j)) {
            return;
        }
        if (this.crashlytics) {
            AbstractC0081l.yandex("updateRootConstraints called while measuring");
        }
        this.subs = new C15519l(j);
        C3654l c3654l = this.yandex;
        boolean zM1386native = c3654l.m1386native();
        C14070l c14070l = c3654l.f7667l;
        if (zM1386native) {
            C3654l c3654l2 = c3654l.f7693l;
            if (c3654l2 != null) {
                c14070l.purchase = true;
            }
            c14070l.startapp.f29321l = true;
            this.loadAd.ads(c3654l2 == null ? 3 : 1, c3654l);
        }
    }

    public final void vip(C3654l c3654l, long j) {
        if (c3654l.f7684l) {
            return;
        }
        C3654l c3654l2 = this.yandex;
        if (c3654l == c3654l2) {
            AbstractC0081l.yandex("measureAndLayout called on root");
        }
        if (!c3654l2.m1386native()) {
            AbstractC0081l.yandex("performMeasureAndLayout called with unattached root");
        }
        if (!c3654l2.m1389private()) {
            AbstractC0081l.yandex("performMeasureAndLayout called with unplaced root");
        }
        if (this.crashlytics) {
            AbstractC0081l.yandex("performMeasureAndLayout called during measure layout");
        }
        if (this.subs != null) {
            this.crashlytics = true;
            this.amazon = false;
            try {
                C18449l c18449l = this.loadAd;
                ((C7972l) c18449l.f36010l).m2236new(c3654l);
                ((C7972l) c18449l.f36009l).m2236new(c3654l);
                ((C7972l) c18449l.f36012l).m2236new(c3654l);
                if ((amazon(c3654l, new C15519l(j)) || c3654l.f7667l.billing) && AbstractC8576l.yandex(c3654l.m1380extends(), Boolean.TRUE)) {
                    c3654l.m1382for();
                }
                mopub(c3654l);
                purchase(c3654l, new C15519l(j));
                if (c3654l.adcel() && c3654l.m1389private()) {
                    c3654l.m1392static();
                    C18396l c18396l = this.purchase;
                    c18396l.getClass();
                    if (c3654l.f7672l > 0) {
                        ((C17893l) c18396l.f35934l).crashlytics(c3654l);
                        c3654l.f7681l = true;
                    }
                }
                billing();
                this.crashlytics = false;
                this.amazon = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.crashlytics = false;
                    this.amazon = false;
                    throw th2;
                }
            }
        }
        loadAd();
    }
}

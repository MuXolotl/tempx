package defpackage;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌۥّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9168l {
    public static final C15578l yandex = new C15578l(-1571120048, false, new C14393l());
    public static final C15578l loadAd = new C15578l(-1455401925, false, new C2464l(11));

    public static boolean admob(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void amazon(int i, int[] iArr, int[] iArr2) {
        iArr2[i] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
    }

    public static boolean billing(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
            int i2 = iArr[i] + RecyclerView.UNDEFINED_DURATION;
            int i3 = iArr2[i] + RecyclerView.UNDEFINED_DURATION;
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static final void crashlytics(WorkDatabase workDatabase, C12211l c12211l, C5934l c5934l) {
        int i;
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        ArrayList arrayListMetrica = AbstractC14055l.metrica(c5934l);
        int i2 = 0;
        while (!arrayListMetrica.isEmpty()) {
            List list = ((C5934l) AbstractC3984l.isVip(arrayListMetrica)).amazon;
            if (list.isEmpty()) {
                i = 0;
            } else {
                Iterator it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((C9335l) it.next()).loadAd.isPro.loadAd() && (i = i + 1) < 0) {
                        AbstractC14055l.ads();
                        throw null;
                    }
                }
            }
            i2 += i;
        }
        if (i2 == 0) {
            return;
        }
        int iIntValue = ((Number) AbstractC2021l.purchase(workDatabase.Signature().yandex, true, false, new C8125l(16))).intValue();
        int i3 = c12211l.isPro;
        if (iIntValue + i2 <= i3) {
            return;
        }
        C8339l.metrica(AbstractC14814l.remoteconfig(i2, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", AbstractC14814l.subscription(i3, iIntValue, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: ")));
    }

    public static int firebase(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static void isPro(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 8;
        int i2 = 0;
        int i3 = 3;
        while (true) {
            int i4 = i3 - 1;
            long j2 = ((long) iArr[i3]) & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i - 1] = (i2 << 31) | ((int) (j3 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j3 >>> 1);
            i2 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | (((long) (i2 << 31)) & 4294967295L);
                iArr2[0] = (int) j4;
                int i5 = ((int) (j4 >>> 32)) & 1;
                long j6 = ((long) iArr[1]) & 4294967295L;
                long j7 = ((long) iArr2[2]) & 4294967295L;
                long j8 = (j6 * j) + j5;
                int i6 = (int) j8;
                iArr2[1] = i5 | (i6 << 1);
                int i7 = i6 >>> 31;
                long j9 = ((long) iArr[2]) & 4294967295L;
                long j10 = ((long) iArr2[3]) & 4294967295L;
                long j11 = ((long) iArr2[4]) & 4294967295L;
                long j12 = (j9 * j) + j7 + (j8 >>> 32);
                int i8 = (int) j12;
                iArr2[2] = i7 | (i8 << 1);
                long jRemoteconfig = AbstractC0653l.remoteconfig(j9, j6, j12 >>> 32, j10);
                long j13 = j11 + (jRemoteconfig >>> 32);
                long j14 = ((long) iArr[3]) & 4294967295L;
                long j15 = (((long) iArr2[5]) & 4294967295L) + (j13 >>> 32);
                long j16 = (((long) iArr2[6]) & 4294967295L) + (j15 >>> 32);
                long j17 = (j * j14) + (jRemoteconfig & 4294967295L);
                int i9 = (int) j17;
                iArr2[3] = (i8 >>> 31) | (i9 << 1);
                long jRemoteconfig2 = AbstractC0653l.remoteconfig(j14, j6, j17 >>> 32, j13 & 4294967295L);
                long jRemoteconfig3 = AbstractC0653l.remoteconfig(j14, j9, jRemoteconfig2 >>> 32, j15 & 4294967295L);
                long j18 = j16 + (jRemoteconfig3 >>> 32);
                int i10 = (int) jRemoteconfig2;
                iArr2[4] = (i9 >>> 31) | (i10 << 1);
                int i11 = i10 >>> 31;
                int i12 = (int) (jRemoteconfig3 & 4294967295L);
                iArr2[5] = i11 | (i12 << 1);
                int i13 = i12 >>> 31;
                int i14 = (int) j18;
                iArr2[6] = i13 | (i14 << 1);
                iArr2[7] = (i14 >>> 31) | ((iArr2[7] + ((int) (j18 >>> 32))) << 1);
                return;
            }
            i3 = i4;
        }
    }

    public static int loadAd(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    public static boolean mopub(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void purchase(int i, long[] jArr, long[] jArr2) {
        jArr2[i] = jArr[0];
        jArr2[i + 1] = jArr[1];
    }

    public static final long remoteconfig(long j) {
        int i = (int) (63 & j);
        return (i == C3955l.ad.crashlytics || i == C3955l.subscription.crashlytics || i == C3955l.tapsense.crashlytics) ? smaato(C9735l.yandex(j, C3955l.purchase)) : smaato(j);
    }

    public static final long smaato(long j) {
        long j2 = 63 & j;
        int i = (int) j2;
        if (i <= 15) {
            return j;
        }
        if (i == C3955l.Signature.crashlytics) {
            return AbstractC12953l.startapp(j);
        }
        if ((i == C3955l.license.crashlytics || i == C3955l.pro.crashlytics) && Build.VERSION.SDK_INT < 34) {
            return AbstractC12953l.startapp(j);
        }
        return (i != C3955l.ad.crashlytics || Build.VERSION.SDK_INT >= 36) ? (j & (-64)) | (j2 - 1) : AbstractC12953l.startapp(j);
    }

    public static void subs(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 4294967295L;
        long j2 = ((long) iArr2[0]) & 4294967295L;
        int i = 1;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = ((long) iArr[0]) & 4294967295L;
        long j7 = j6 * j2;
        iArr3[0] = (int) j7;
        long j8 = (j6 * j3) + (j7 >>> 32);
        iArr3[1] = (int) j8;
        long j9 = (j6 * j4) + (j8 >>> 32);
        iArr3[2] = (int) j9;
        long j10 = (j6 * j5) + (j9 >>> 32);
        iArr3[3] = (int) j10;
        iArr3[4] = (int) (j10 >>> 32);
        for (int i2 = 4; i < i2; i2 = 4) {
            long j11 = ((long) iArr[i]) & j;
            long j12 = (j11 * j2) + (((long) iArr3[i]) & j);
            iArr3[i] = (int) j12;
            int i3 = i + 1;
            long j13 = j;
            long j14 = (j11 * j3) + (((long) iArr3[i3]) & j13) + (j12 >>> 32);
            iArr3[i3] = (int) j14;
            int i4 = i + 2;
            long j15 = (j11 * j4) + (((long) iArr3[i4]) & j13) + (j14 >>> 32);
            iArr3[i4] = (int) j15;
            long j16 = j15 >>> 32;
            int i5 = i + 3;
            long j17 = (j11 * j5) + (((long) iArr3[i5]) & j13) + j16;
            iArr3[i5] = (int) j17;
            iArr3[i + 4] = (int) (j17 >>> 32);
            i = i3;
            j = j13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0170  */
    /* JADX WARN: Code duplicated, block: B:45:0x0174  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ad  */
    public static final void yandex(C7463l c7463l, InterfaceC17242l interfaceC17242l, boolean z, boolean z2, boolean z3, Function1 function1, C15578l c15578l, C6956l c6956l, final int i) {
        final C15578l c15578l2;
        final InterfaceC17242l interfaceC17242l2;
        final boolean z4;
        final boolean z5;
        final boolean z6;
        final Function1 function2;
        C16290l c16290lYandex;
        C13863l c13863l;
        boolean zAdmob;
        Object objM2132native;
        Function1 function3;
        final C7463l c7463l2 = c7463l;
        c6956l.m2133new(-741495334);
        int i2 = i | (c6956l.admob(c7463l2) ? 4 : 2) | 1797504;
        if (c6956l.m2127for(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objM2132native2 = c6956l.m2132native();
            int i3 = 25;
            C13863l c13863l2 = C1867l.yandex;
            if (objM2132native2 == c13863l2) {
                objM2132native2 = new C1698l(i3);
                c6956l.m2147try(objM2132native2);
            }
            Function1 function4 = (Function1) objM2132native2;
            C15389l c15389l = c7463l2.yandex;
            C15389l c15389l2 = c7463l2.yandex;
            boolean z7 = ((EnumC12805l) ((C10086l) c15389l.amazon).getValue()) == EnumC12805l.f25184l;
            if (c7463l2.loadAd != null) {
                c6956l.m2123default(387580721);
                C4776l c4776l = AbstractC2124l.yandex;
                C15389l c15389l3 = c7463l2.yandex;
                Function1 function5 = c7463l2.loadAd;
                if (function5 == null) {
                    function5 = null;
                }
                c16290lYandex = AbstractC2124l.yandex(c15389l3, function5, null, c6956l, AbstractC2124l.crashlytics << 9, 4);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(-869697757);
                c6956l.startapp(false);
                c16290lYandex = null;
            }
            C4346l c4346l = C4346l.f8873l;
            EnumC7283l enumC7283l = EnumC7283l.f15125l;
            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC12019l.crashlytics(c4346l, c15389l, enumC7283l, z7, c16290lYandex);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, true);
            long j = c6956l.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lCrashlytics);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i4);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            InterfaceC17242l interfaceC17242lLoadAd = C16170l.yandex.loadAd();
            C0086l c0086l = C18450l.f36044l;
            C1083l c1083l = AbstractC8313l.yandex;
            C5062l c5062lYandex = AbstractC7001l.yandex(c1083l, c0086l, c6956l, 0);
            long j2 = c6956l.f14595continue;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lLoadAd);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i5, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            C15578l c15578l3 = AbstractC17834l.yandex;
            C18295l c18295l = C18295l.yandex;
            c15578l3.invoke(c18295l, c6956l, 54);
            c6956l.startapp(true);
            boolean zAdmob2 = c6956l.admob(c7463l2);
            Object objM2132native3 = c6956l.m2132native();
            if (zAdmob2) {
                c13863l = c13863l2;
            } else {
                c13863l = c13863l2;
                if (objM2132native3 == c13863l) {
                }
                InterfaceC17242l interfaceC17242lAmazon = AbstractC14231l.amazon(c4346l, c15389l2, enumC7283l, (Function2) objM2132native3);
                C5062l c5062lYandex2 = AbstractC7001l.yandex(c1083l, c0086l, c6956l, 0);
                C13863l c13863l3 = c13863l;
                long j3 = c6956l.f14595continue;
                int i6 = (int) (j3 ^ (j3 >>> 32));
                InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
                InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon);
                c6956l.m2140super();
                if (c6956l.f14603switch) {
                    c6956l.firebase(c16395l);
                } else {
                    c6956l.m2136protected();
                }
                AbstractC8182l.billing(c6956l, c5062lYandex2, c6415l);
                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, c6415l2);
                AbstractC11043l.isPro(i6, c6956l, c6415l3, c6956l, c11192l);
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling3, c6415l4);
                c15578l2 = c15578l;
                c15578l2.invoke(c18295l, c6956l, 54);
                c6956l.startapp(true);
                c6956l.startapp(true);
                EnumC12805l enumC12805l = (EnumC12805l) ((C10086l) c15389l2.amazon).getValue();
                c7463l2 = c7463l;
                zAdmob = c6956l.admob(c7463l2);
                objM2132native = c6956l.m2132native();
                if (!zAdmob || objM2132native == c13863l3) {
                    function3 = function4;
                    objM2132native = new C7864l(c7463l2, function3, (InterfaceC14029l) null, 25);
                    c6956l.m2147try(objM2132native);
                } else {
                    function3 = function4;
                }
                AbstractC12311l.purchase(enumC12805l, function3, (Function2) objM2132native, c6956l);
                z5 = true;
                z6 = true;
                function2 = function3;
                interfaceC17242l2 = c4346l;
                z4 = true;
            }
            objM2132native3 = new C1645l(19, c7463l2);
            c6956l.m2147try(objM2132native3);
            InterfaceC17242l interfaceC17242lAmazon2 = AbstractC14231l.amazon(c4346l, c15389l2, enumC7283l, (Function2) objM2132native3);
            C5062l c5062lYandex3 = AbstractC7001l.yandex(c1083l, c0086l, c6956l, 0);
            C13863l c13863l4 = c13863l;
            long j4 = c6956l.f14595continue;
            int i7 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato4 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon2);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex3, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato4, c6415l2);
            AbstractC11043l.isPro(i7, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling4, c6415l4);
            c15578l2 = c15578l;
            c15578l2.invoke(c18295l, c6956l, 54);
            c6956l.startapp(true);
            c6956l.startapp(true);
            EnumC12805l enumC12805l2 = (EnumC12805l) ((C10086l) c15389l2.amazon).getValue();
            c7463l2 = c7463l;
            zAdmob = c6956l.admob(c7463l2);
            objM2132native = c6956l.m2132native();
            if (zAdmob) {
                function3 = function4;
                objM2132native = new C7864l(c7463l2, function3, (InterfaceC14029l) null, 25);
                c6956l.m2147try(objM2132native);
            } else {
                function3 = function4;
                objM2132native = new C7864l(c7463l2, function3, (InterfaceC14029l) null, 25);
                c6956l.m2147try(objM2132native);
            }
            AbstractC12311l.purchase(enumC12805l2, function3, (Function2) objM2132native, c6956l);
            z5 = true;
            z6 = true;
            function2 = function3;
            interfaceC17242l2 = c4346l;
            z4 = true;
        } else {
            c15578l2 = c15578l;
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            z4 = z;
            z5 = z2;
            z6 = z3;
            function2 = function1;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(interfaceC17242l2, z4, z5, z6, function2, c15578l2, i) { // from class: lًٌۖ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ boolean f17825l;

                /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                public final /* synthetic */ C15578l f17826l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f17827l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ boolean f17829l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ boolean f17830l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ Function1 f17831l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(12582969);
                    AbstractC9168l.yandex(this.f17828l, this.f17827l, this.f17825l, this.f17830l, this.f17829l, this.f17831l, this.f17826l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}

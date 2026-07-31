package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍّ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9843l {
    public static final int[] yandex = {1, 10, 100, 1000, ModuleDescriptor.MODULE_VERSION, 100000, 1000000, 10000000, 100000000, 1000000000};

    public static final boolean admob() {
        Object c18435l;
        try {
            String strLoadAd = AbstractC3352l.loadAd("ro.miui.ui.version.name");
            c18435l = Boolean.valueOf((strLoadAd == null || strLoadAd.length() == 0 || AbstractC3352l.crashlytics()) ? false : true);
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        if (c18435l instanceof C18435l) {
            c18435l = null;
        }
        Boolean bool = (Boolean) c18435l;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void amazon(C6956l c6956l, int i) {
        c6956l.m2133new(-1413442675);
        if (c6956l.m2127for(i & 1, i != 0)) {
            String strPurchase = AbstractC11999l.purchase(c6956l, R.string.ota_card_failed);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(C4346l.f8873l, 1.0f), ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.purchase, c6956l, 48, 0, 130040);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17251l(i, 3);
        }
    }

    public static C6702l billing(InterfaceC13012l interfaceC13012l) {
        C17334l c17334l = C17334l.f33654l;
        InterfaceC2224l interfaceC2224lMo1209package = c17334l.mo1209package((AbstractC6786l) interfaceC13012l);
        int iMo1217switch = c17334l.mo1217switch(interfaceC2224lMo1209package);
        ArrayList arrayList = new ArrayList(iMo1217switch);
        for (int i = 0; i < iMo1217switch; i++) {
            arrayList.add((AbstractC11726l) c17334l.mo1216super(interfaceC2224lMo1209package, i));
        }
        return !arrayList.isEmpty() ? new C6702l(AbstractC8676l.subscription(AbstractC16901l.m4226l(interfaceC13012l.mo1617throws(), arrayList))) : C6702l.loadAd;
    }

    public static final void crashlytics(C8311l c8311l, Function0 function0, C6956l c6956l, int i) {
        c6956l.m2133new(-1560328396);
        int i2 = (c6956l.billing(c8311l) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(function0) ? 32 : 16;
        }
        int i3 = i2;
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC3383l.loadAd(function0, interfaceC17242lAmazon, false, null, AbstractC13880l.yandex(AbstractC12953l.firebase(C9735l.loadAd(0.05f, ((C14370l) c6956l.isPro(c10707l)).yandex.yandex), ((C14370l) c6956l.isPro(c10707l)).yandex.ads), 0L, 0L, 0L, c6956l, 0, 14), null, null, AbstractC14566l.amazon(-2066587031, new C16561l(26, c8311l), c6956l), c6956l, ((i3 >> 3) & 14) | 100663344, 236);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0741l(c8311l, function0, i, 27);
        }
    }

    public static String firebase(long j) {
        if (mopub(j, 12884901888L)) {
            return "Rgb";
        }
        if (mopub(j, 12884901889L)) {
            return "Xyz";
        }
        if (mopub(j, 12884901890L)) {
            return "Lab";
        }
        return mopub(j, 17179869187L) ? "Cmyk" : "Unknown";
    }

    public static final Object isPro(AbstractC6475l abstractC6475l, EnumC8981l enumC8981l, Function2 function2, AbstractC5563l abstractC5563l) {
        if (enumC8981l == EnumC8981l.f18521l) {
            C8339l.metrica("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
            return null;
        }
        if (((C5268l) abstractC6475l).subs == EnumC8981l.f18522l) {
            return Unit.INSTANCE;
        }
        Object objAdmob = AbstractC11990l.admob(new C8036l(abstractC6475l, enumC8981l, function2, null, 0), abstractC5563l);
        return objAdmob == EnumC9342l.f19165l ? objAdmob : Unit.INSTANCE;
    }

    public static final void loadAd(Function0 function0, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(159208144);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            AbstractC3383l.loadAd(function0, AbstractC0080l.amazon(C4346l.f8873l, 1.0f), false, null, AbstractC13880l.crashlytics(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex), null, null, AbstractC3230l.yandex, c6956l, (i2 & 14) | 100663344, 236);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1106l(i, function0);
        }
    }

    public static final boolean mopub(long j, long j2) {
        return j == j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    public static final void purchase(final C8311l c8311l, boolean z, final boolean z2, final Function0 function0, final Function0 function1, final Function0 function2, final Function0 function3, C6956l c6956l, final int i) {
        ?? r0;
        C4346l c4346l;
        float f;
        final boolean z3 = z;
        c6956l.m2133new(1677166610);
        int i2 = i | (c6956l.billing(c8311l) ? 4 : 2) | (c6956l.mopub(z3) ? 32 : 16) | (c6956l.mopub(z2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.admob(function0) ? 2048 : 1024) | (c6956l.admob(function1) ? 16384 : 8192) | (c6956l.admob(function2) ? 131072 : 65536) | (c6956l.admob(function3) ? 1048576 : 524288);
        if (c6956l.m2127for(i2 & 1, (599187 & i2) != 599186)) {
            float fYandex = ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).yandex(c6956l) + 16.0f;
            C4346l c4346l2 = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c4346l2, 16.0f, 0.0f, 16.0f, fYandex, 2);
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36034l, c6956l, 48);
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lStartapp);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            if (z3) {
                c6956l.m2123default(1925746594);
                r0 = 0;
                c4346l = c4346l2;
                f = 16.0f;
                C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l, 196608, 31);
                c6956l.startapp(false);
            } else {
                r0 = 0;
                c4346l = c4346l2;
                f = 16.0f;
                c6956l.m2123default(1925808377);
                AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 16.0f));
                c6956l.startapp(false);
            }
            amazon(c6956l, r0);
            AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, f));
            int i4 = i2 >> 6;
            crashlytics(c8311l, function0, c6956l, (i2 & 14) | (i4 & 112));
            AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, f));
            if (z2) {
                c6956l.m2123default(1926074636);
                loadAd(function3, c6956l, (i2 >> 18) & 14);
                AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, f));
            } else {
                c6956l.m2123default(1923787642);
            }
            c6956l.startapp(r0);
            z3 = z;
            yandex(z3, function2, function1, c6956l, ((i2 >> 3) & 14) | ((i2 >> 12) & 112) | (i4 & 896));
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(z3, z2, function0, function1, function2, function3, i) { // from class: lؙ۟ؕ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ boolean f14192l;

                /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                public final /* synthetic */ Function0 f14193l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ boolean f14194l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ Function0 f14196l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ Function0 f14197l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ Function0 f14198l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(1);
                    AbstractC9843l.purchase(this.f14195l, this.f14194l, this.f14192l, this.f14197l, this.f14196l, this.f14198l, this.f14193l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    public static final C3535l subs(long j, long j2) {
        long j3;
        if (j == 0 || j2 == 0) {
            return new C3535l(0L, 0L);
        }
        if (j2 == -1) {
            if (j == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = -j;
            }
        } else if (j2 == 1) {
            j3 = j;
        } else {
            j3 = j * j2;
            if (j3 / j2 != j) {
                j3 = 0;
            }
        }
        if (j3 != 0) {
            return new C3535l(j3 / 1000000000, j3 % 1000000000);
        }
        if (j2 == 1000000000) {
            return new C3535l(j, 0L);
        }
        if (j == 1000000000) {
            return new C3535l(j2, 0L);
        }
        long j4 = j >= 0 ? 0L : -1L;
        long j5 = j2 >= 0 ? 0L : -1L;
        long j6 = j & 4294967295L;
        long j7 = (j >> 32) & 4294967295L;
        long j8 = j2 & 4294967295L;
        long j9 = (j2 >> 32) & 4294967295L;
        long j10 = (j7 * j5) + (j4 * j9);
        long j11 = (j5 * j6) + (j7 * j9) + (j4 * j8);
        long j12 = j7 * j8;
        long j13 = j9 * j6;
        long j14 = j6 * j8;
        long j15 = j14 & 4294967295L;
        long j16 = (j12 & 4294967295L) + (j13 & 4294967295L) + ((j14 >> 32) & 4294967295L);
        long j17 = j16 & 4294967295L;
        long j18 = ((j16 >> 32) & 4294967295L) + (j11 & 4294967295L) + ((j12 >> 32) & 4294967295L) + ((j13 >> 32) & 4294967295L);
        long j19 = (j17 << 32) | j15;
        long j20 = (j18 & 4294967295L) | (((((j18 >> 32) & 4294967295L) + ((j11 >> 32) & 4294967295L)) + (j10 & 4294967295L)) << 32);
        int i = ((j20 >> 63) & 1) == 1 ? -1 : 1;
        if (i == -1) {
            j19 = (~j19) + 1;
            j20 = ~j20;
            if (j19 == 0) {
                j20++;
            }
        }
        int i2 = 127;
        long j21 = 0;
        long j22 = 0;
        while (-1 < i2) {
            j22 = (j22 << 1) | ((i2 < 64 ? j19 >> i2 : j20 >> (i2 - 64)) & 1);
            if (j22 >= 1000000000 || j22 < 0) {
                j22 -= 1000000000;
                if (i2 >= 63) {
                    throw new ArithmeticException("The result of a multiplication followed by division overflows a long");
                }
                j21 |= 1 << i2;
            }
            i2--;
        }
        long j23 = i;
        return new C3535l(j21 * j23, j23 * j22);
    }

    public static final void yandex(boolean z, Function0 function0, Function0 function1, C6956l c6956l, int i) {
        int i2;
        Function0 function2;
        Function0 function3 = function1;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-427363472);
        if ((i & 6) == 0) {
            i2 = (c6956l2.mopub(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l2.admob(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l2.admob(function3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i3 = i2;
        if (c6956l2.m2127for(i3 & 1, (i3 & 147) != 146)) {
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36044l, c6956l2, 0);
            long j = c6956l2.f14595continue;
            int i4 = (int) ((j >>> 32) ^ j);
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, C4346l.f8873l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            if (z) {
                c6956l2.m2123default(-847560202);
                AbstractC17457l.mopub(function0, null, false, null, null, null, AbstractC3230l.loadAd, c6956l2, ((i3 >> 3) & 14) | 805306368, 510);
            } else {
                c6956l2.m2123default(-852782834);
            }
            c6956l2.startapp(false);
            AbstractC9334l.yandex(c6956l2, new C9247l(1.0f, true));
            function2 = function0;
            AbstractC17457l.loadAd(function3, null, false, null, null, null, null, null, AbstractC3230l.crashlytics, c6956l, ((i3 >> 6) & 14) | 805306368, 510);
            function3 = function3;
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            function2 = function0;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9607l(z, function2, function3, i);
        }
    }
}

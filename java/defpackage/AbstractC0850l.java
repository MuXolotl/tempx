package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؚؒؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0850l {
    public static final C17253l yandex = AbstractC3605l.amazon(0.0f, 0.0f, 0.0f, 16.0f, 7);
    public static final C17253l loadAd = AbstractC3605l.amazon(0.0f, 0.0f, 0.0f, 16.0f, 7);
    public static final C8540l crashlytics = new C8540l(new C7282l(4));

    public static final void amazon(Function0 function0, InterfaceC17242l interfaceC17242l, C9401l c9401l, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(24925658);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.billing(c9401l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.admob(c15578l) ? 2048 : 1024;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            ((C12285l) c6956l.isPro(crashlytics)).yandex(new C10038l(function0, interfaceC17242l, c9401l, c15578l, 5), c6956l, 0);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17983l(function0, interfaceC17242l, c9401l, c15578l, i, 1);
        }
    }

    public static final void crashlytics(final Function0 function0, final C15578l c15578l, final InterfaceC17242l interfaceC17242l, final Function2 function2, final Function2 function3, final Function2 function4, final Function2 function5, final InterfaceC6347l interfaceC6347l, final long j, final long j2, final long j3, final long j4, final C9401l c9401l, C6956l c6956l, final int i, final int i2) {
        int i3;
        C15578l c15578l2;
        Function2 function6;
        int i4;
        c6956l.m2133new(-867616355);
        if ((i & 6) == 0) {
            i3 = (c6956l.admob(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            c15578l2 = c15578l;
            i3 |= c6956l.admob(c15578l2) ? 32 : 16;
        } else {
            c15578l2 = c15578l;
        }
        if ((i & 384) == 0) {
            i3 |= c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            function6 = function2;
            i3 |= c6956l.admob(function6) ? 2048 : 1024;
        } else {
            function6 = function2;
        }
        if ((i & 24576) == 0) {
            i3 |= c6956l.admob(function3) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= c6956l.admob(function4) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= c6956l.admob(function5) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= c6956l.billing(interfaceC6347l) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= c6956l.purchase(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= c6956l.purchase(j2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (c6956l.purchase(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c6956l.purchase(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c6956l.crashlytics(0.0f) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c6956l.billing(c9401l) ? 2048 : 1024;
        }
        int i5 = i4;
        if (c6956l.m2127for(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            final C15578l c15578l3 = c15578l2;
            final Function2 function7 = function6;
            amazon(function0, interfaceC17242l, c9401l, AbstractC14566l.amazon(527420759, new Function2() { // from class: lؙؑۚ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C6956l c6956l2 = (C6956l) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i6 = 0;
                    if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                        AbstractC0850l.yandex(AbstractC14566l.amazon(1367541877, new C15923l(c15578l3, function7, i6), c6956l2), null, function3, function4, function5, interfaceC6347l, j, AbstractC15038l.purchase(c6956l2, 26), j2, j3, j4, c6956l2, 6);
                    } else {
                        c6956l2.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c6956l, (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i5 >> 3) & 896));
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lِٗۦ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(i | 1);
                    int iPurchase2 = AbstractC0545l.purchase(i2);
                    AbstractC0850l.crashlytics(function0, c15578l, interfaceC17242l, function2, function3, function4, function5, interfaceC6347l, j, j2, j3, j4, c9401l, (C6956l) obj, iPurchase, iPurchase2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void loadAd(float f, C15578l c15578l, C6956l c6956l, int i) {
        EnumC9931l enumC9931l;
        c6956l.m2133new(-917637668);
        int i2 = (c6956l.crashlytics(f) ? 32 : 16) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            C10707l c10707l = AbstractC4751l.vip;
            EnumC9931l enumC9931l2 = (EnumC9931l) c6956l.isPro(c10707l);
            int iOrdinal = enumC9931l2.ordinal();
            if (iOrdinal == 0) {
                enumC9931l = EnumC9931l.f20222l;
            } else {
                if (iOrdinal != 1) {
                    C18725l.billing();
                    return;
                }
                enumC9931l = EnumC9931l.f20223l;
            }
            AbstractC10478l.yandex(c10707l.yandex(enumC9931l), AbstractC14566l.amazon(-1986402020, new C7109l(f, enumC9931l2, c15578l), c6956l), c6956l, 56);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C11251l(f, c15578l, i);
        }
    }

    public static final void yandex(final C15578l c15578l, InterfaceC17242l interfaceC17242l, final Function2 function2, final Function2 function3, final Function2 function4, final InterfaceC6347l interfaceC6347l, final long j, final long j2, final long j3, final long j4, final long j5, C6956l c6956l, final int i) {
        final InterfaceC17242l interfaceC17242l2;
        c6956l.m2133new(1378716401);
        int i2 = i | 48 | (c6956l.admob(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.admob(function3) ? 2048 : 1024) | (c6956l.admob(function4) ? 16384 : 8192) | (c6956l.billing(interfaceC6347l) ? 131072 : 65536) | (c6956l.purchase(j) ? 1048576 : 524288) | (c6956l.crashlytics(0.0f) ? 8388608 : 4194304) | (c6956l.purchase(j2) ? 67108864 : 33554432) | (c6956l.purchase(j3) ? 536870912 : 268435456);
        if (c6956l.m2127for(i2 & 1, ((i2 & 306783379) == 306783378 && (((c6956l.purchase(j4) ? (char) 4 : (char) 2) | (c6956l.purchase(j5) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            C15578l c15578lAmazon = AbstractC14566l.amazon(-652798794, new C15162l(function2, function3, function4, j3, j4, j5, j2, c15578l), c6956l);
            int i3 = i2 >> 12;
            int i4 = (i3 & 896) | (i3 & 112) | 12582918 | ((i2 >> 9) & 57344);
            C4346l c4346l = C4346l.f8873l;
            AbstractC3274l.yandex(c4346l, interfaceC6347l, j, 0L, 0.0f, 0.0f, null, c15578lAmazon, c6956l, i4, 104);
            interfaceC17242l2 = c4346l;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(interfaceC17242l2, function2, function3, function4, interfaceC6347l, j, j2, j3, j4, j5, i) { // from class: lٖؓۙ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ Function2 f31628l;

                /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                public final /* synthetic */ long f31629l;

                /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
                public final /* synthetic */ long f31630l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f31631l;

                /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
                public final /* synthetic */ long f31633l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ Function2 f31634l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ Function2 f31635l;

                /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
                public final /* synthetic */ long f31636l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC6347l f31637l;

                /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
                public final /* synthetic */ long f31638l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(7);
                    AbstractC0850l.yandex(this.f31632l, this.f31631l, this.f31628l, this.f31635l, this.f31634l, this.f31637l, this.f31629l, this.f31630l, this.f31636l, this.f31633l, this.f31638l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}

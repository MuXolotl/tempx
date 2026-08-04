package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُؖ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10851l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21934l = 3;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C15578l f21921l = new C15578l(-1964758910, false, new C6971l(25));

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C15578l f21916l = new C15578l(-1664083269, false, new C6971l(26));

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C15578l f21927l = new C15578l(2076196140, false, new C5407l(1));

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C15578l f21926l = new C15578l(633912803, false, new C5407l(2));

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C15578l f21930l = new C15578l(-253860424, false, new C6971l(27));

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C15578l f21917l = new C15578l(1376994261, false, new C6971l(28));

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C15578l f21919l = new C15578l(812422305, false, new C6971l(29));

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C15578l f21929l = new C15578l(400711550, false, new C13179l(0));

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C15578l f21924l = new C15578l(1994655040, false, new C13179l(1));

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C15578l f21931l = new C15578l(1582944285, false, new C13179l(2));

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C15578l f21928l = new C15578l(-1118079521, false, new C13179l(3));

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C15578l f21915l = new C15578l(-1529790276, false, new C13179l(4));

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C15578l f21932l = new C15578l(64153214, false, new C13179l(5));

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C15578l f21925l = new C15578l(-347557541, false, new C13179l(6));

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C15578l f21920l = new C15578l(707662752, false, new C5407l(3));

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C15578l f21923l = new C15578l(-1016945570, false, new C5407l(4));

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final C15578l f21933l = new C15578l(616630618, false, new C13179l(7));

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final C15578l f21922l = new C15578l(-245673543, false, new C13179l(8));

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final C15578l f21918l = new C15578l(-1107977704, false, new C13179l(9));

    public static void amazon(C6742l c6742l, AbstractC15342l abstractC15342l, AbstractC9544l abstractC9544l, float f, AbstractC3239l abstractC3239l, int i) {
        float f2 = (i & 4) != 0 ? 1.0f : f;
        AbstractC3239l abstractC3239l2 = (i & 8) != 0 ? C5053l.yandex : abstractC3239l;
        if (abstractC15342l instanceof C13080l) {
            C8896l c8896l = ((C13080l) abstractC15342l).amazon;
            float f3 = c8896l.yandex;
            float f4 = f2;
            c6742l.mo2071l(abstractC9544l, (((long) Float.floatToRawIntBits(c8896l.loadAd)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32), billing(c8896l), f4, abstractC3239l2, null, 3);
            return;
        }
        if (!(abstractC15342l instanceof C18521l)) {
            if (abstractC15342l instanceof C13616l) {
                c6742l.advert(((C13616l) abstractC15342l).amazon, abstractC9544l, f2, abstractC3239l2, null, 3);
                return;
            } else {
                C18725l.billing();
                return;
            }
        }
        C18521l c18521l = (C18521l) abstractC15342l;
        C9902l c9902l = c18521l.purchase;
        if (c9902l != null) {
            c6742l.advert(c9902l, abstractC9544l, f2, abstractC3239l2, null, 3);
            return;
        }
        C3903l c3903l = c18521l.amazon;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c3903l.admob >> 32));
        float f5 = c3903l.yandex;
        c6742l.mo2068l(abstractC9544l, (((long) Float.floatToRawIntBits(c3903l.loadAd)) & 4294967295L) | (((long) Float.floatToRawIntBits(f5)) << 32), (((long) Float.floatToRawIntBits(c3903l.loadAd())) << 32) | (((long) Float.floatToRawIntBits(c3903l.yandex())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), f2, abstractC3239l2, null, 3);
    }

    public static final long billing(C8896l c8896l) {
        float f = c8896l.crashlytics - c8896l.yandex;
        return (((long) Float.floatToRawIntBits(c8896l.amazon - c8896l.loadAd)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void loadAd(boolean z, Function0 function0, C6956l c6956l, int i) {
        int i2;
        int i3;
        c6956l.m2133new(-361453782);
        if ((i & 6) == 0) {
            i2 = (c6956l.mopub(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(function0) ? 32 : 16;
        }
        int i5 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            Object objYandex = (InterfaceC6923l) c6956l.isPro(AbstractC0127l.yandex);
            if (objYandex == null) {
                c6956l.m2123default(535274673);
                objYandex = AbstractC1627l.yandex(c6956l);
            } else {
                c6956l.m2123default(535271790);
            }
            c6956l.startapp(false);
            if (objYandex == null) {
                C8339l.smaato("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zBilling = c6956l.billing(objYandex);
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (zBilling || objM2132native == obj) {
                InterfaceC6923l interfaceC6923l = objYandex instanceof InterfaceC6923l ? (InterfaceC6923l) objYandex : null;
                C1527l navigationEventDispatcher = interfaceC6923l != null ? interfaceC6923l.getNavigationEventDispatcher() : null;
                InterfaceC14926l interfaceC14926l = objYandex instanceof InterfaceC14926l ? (InterfaceC14926l) objYandex : null;
                objM2132native = new C16590l(navigationEventDispatcher, interfaceC14926l != null ? interfaceC14926l.yandex() : null);
                c6956l.m2147try(objM2132native);
            }
            Object obj2 = (C16590l) objM2132native;
            long j = c6956l.f14595continue;
            boolean zBilling2 = c6956l.billing(obj2) | c6956l.purchase(j);
            Object objM2132native2 = c6956l.m2132native();
            Object obj3 = objM2132native2;
            if (zBilling2 || objM2132native2 == obj) {
                C10968l c10968l = new C10968l(new C16581l(j, objYandex));
                c10968l.f22101l = new C11200l(i4);
                c6956l.m2147try(c10968l);
                obj3 = c10968l;
            }
            Object obj4 = (C10968l) obj3;
            c6956l.m2123default(-585307852);
            boolean zAdmob = c6956l.admob(obj4) | ((i2 & 112) == 32);
            Object objM2132native3 = c6956l.m2132native();
            if (zAdmob || objM2132native3 == obj) {
                objM2132native3 = new Ctry(obj4, function0, 15);
                c6956l.m2147try(objM2132native3);
            }
            AbstractC12311l.billing((Function0) objM2132native3, c6956l);
            int i6 = i2;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i7 = i6 & 14;
            boolean zAdmob2 = (i7 == 4) | c6956l.admob(obj4);
            Object objM2132native4 = c6956l.m2132native();
            if (zAdmob2 || objM2132native4 == obj) {
                objM2132native4 = new C9012l(obj4, z, i5);
                c6956l.m2147try(objM2132native4);
            }
            AbstractC17122l.yandex(boolValueOf, obj4, null, (Function1) objM2132native4, c6956l, i7);
            boolean zAdmob3 = c6956l.admob(obj2) | c6956l.admob(obj4);
            Object objM2132native5 = c6956l.m2132native();
            if (zAdmob3 || objM2132native5 == obj) {
                objM2132native5 = new C0464l(obj2, obj4, 13);
                c6956l.m2147try(objM2132native5);
            }
            AbstractC12311l.yandex(obj2, obj4, (Function1) objM2132native5, c6956l);
            i3 = 0;
            c6956l.startapp(false);
        } else {
            i3 = 0;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12784l(z, function0, i, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object mopub(C1759l c1759l, C17949l c17949l, AbstractC0283l abstractC0283l) {
        C16890l c16890l;
        if (abstractC0283l instanceof C16890l) {
            c16890l = (C16890l) abstractC0283l;
            int i = c16890l.f32942l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c16890l.f32942l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c16890l = new C16890l(abstractC0283l);
            }
        } else {
            c16890l = new C16890l(abstractC0283l);
        }
        Object obj = c16890l.f32940l;
        int i2 = c16890l.f32942l;
        InterfaceC14029l interfaceC14029l = null;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                C17949l c17949l2 = c16890l.f32941l;
                AbstractC2829l.crashlytics(obj);
                return obj;
            }
            AbstractC2829l.crashlytics(obj);
            c16890l.f32941l = c17949l;
            c16890l.f32942l = 1;
            Object objAdmob = AbstractC11990l.admob(new C0932l(c17949l, c1759l, interfaceC14029l, 5), c16890l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            return objAdmob == enumC9342l ? enumC9342l : objAdmob;
        } catch (C13277l e) {
            if (e.f26059l == c17949l.hashCode()) {
                return null;
            }
            throw e;
        }
    }

    public static void purchase(InterfaceC13349l interfaceC13349l, AbstractC15342l abstractC15342l, long j) {
        boolean z = abstractC15342l instanceof C13080l;
        C5053l c5053l = C5053l.yandex;
        if (z) {
            C8896l c8896l = ((C13080l) abstractC15342l).amazon;
            float f = c8896l.yandex;
            interfaceC13349l.mo2072l(j, (4294967295L & ((long) Float.floatToRawIntBits(c8896l.loadAd))) | (Float.floatToRawIntBits(f) << 32), billing(c8896l), 1.0f, c5053l, null, 3);
            return;
        }
        if (!(abstractC15342l instanceof C18521l)) {
            if (abstractC15342l instanceof C13616l) {
                interfaceC13349l.firebase(((C13616l) abstractC15342l).amazon, j, 1.0f, c5053l);
                return;
            } else {
                C18725l.billing();
                return;
            }
        }
        C18521l c18521l = (C18521l) abstractC15342l;
        C9902l c9902l = c18521l.purchase;
        if (c9902l != null) {
            interfaceC13349l.firebase(c9902l, j, 1.0f, c5053l);
            return;
        }
        C3903l c3903l = c18521l.amazon;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c3903l.admob >> 32));
        interfaceC13349l.mo2064abstract(j, (((long) Float.floatToRawIntBits(c3903l.yandex)) << 32) | (((long) Float.floatToRawIntBits(c3903l.loadAd)) & 4294967295L), (((long) Float.floatToRawIntBits(c3903l.loadAd())) << 32) | (((long) Float.floatToRawIntBits(c3903l.yandex())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), c5053l);
    }

    public abstract Object crashlytics();

    public String toString() {
        switch (this.f21934l) {
            case 3:
                return crashlytics().toString();
            default:
                return super.toString();
        }
    }
}

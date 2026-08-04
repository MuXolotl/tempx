package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lُٔ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14823l implements InterfaceC5152l, InterfaceC11210l, InterfaceC13540l, InterfaceC13142l, InterfaceC18565l, InterfaceC12702l, InterfaceC0993l, InterfaceC1953l, InterfaceC15244l, InterfaceC14341l, InterfaceC15446l, InterfaceC16011l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29017l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C14823l f29003l = new C14823l(1);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C14823l f28996l = new C14823l(2);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C14823l f29009l = new C14823l(3);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C14823l f29008l = new C14823l(4);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C14823l f29012l = new C14823l(5);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C14823l f28997l = new C14823l(6);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C14823l f29000l = new C14823l(7);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C14823l f29011l = new C14823l(8);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C14823l f29006l = new C14823l(9);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C14823l f29013l = new C14823l(10);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C14823l f29010l = new C14823l(11);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final /* synthetic */ C14823l f28995l = new C14823l(12);

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C14823l f29014l = new C14823l(13);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C14823l f29007l = new C14823l(14);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C14823l f29001l = new C14823l(15);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C14823l f29005l = new C14823l(16);

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final /* synthetic */ C14823l f29015l = new C14823l(17);

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final /* synthetic */ C14823l f29004l = new C14823l(18);

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final C14823l f28999l = new C14823l(19);

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final C14823l f28998l = new C14823l(20);

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final C14823l f28994l = new C14823l(21);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final C14823l f29016l = new C14823l(22);

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public static final C14823l f29002l = new C14823l(23);

    public /* synthetic */ C14823l(int i) {
        this.f29017l = i;
    }

    public void amazon(C6523l c6523l, C15578l c15578l, C6956l c6956l, int i) {
        c6956l.m2133new(-800314720);
        int i2 = 2;
        int i3 = (c6956l.billing(c6523l) ? 4 : 2) | i;
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            C10707l c10707l = AbstractC12821l.yandex;
            Function1 function1 = (Function1) c6956l.isPro(c10707l);
            boolean zBilling = c6956l.billing(function1) | ((i3 & 14) == 4);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = new C15575l(c6523l, function1, i2);
                c6956l.m2147try(objM2132native);
            }
            AbstractC10478l.yandex(c10707l.yandex((Function1) objM2132native), c15578l, c6956l, 56);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3411l(this, c6523l, c15578l, i, 15);
        }
    }

    @Override // defpackage.InterfaceC11210l
    public Object billing(C11039l c11039l) {
        C7268l.f15111l.getClass();
        Object objPurchase = C7268l.purchase(c11039l);
        return objPurchase == EnumC9342l.f19165l ? objPurchase : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC5152l
    /* JADX INFO: renamed from: continue */
    public void mo804continue(C16864l c16864l, AbstractC5563l abstractC5563l) {
        C12222l c12222l = new C12222l("ObservableContent");
        C8403l c8403l = c16864l.f32922l;
        c8403l.subs(C8403l.f17385l, c12222l);
        c8403l.firebase(c12222l, new C2735l((Function3) abstractC5563l, null, 0));
    }

    @Override // defpackage.InterfaceC11210l
    public String crashlytics(Context context) {
        return context.getString(R.string.fake_catalog_tracks_all);
    }

    @Override // defpackage.InterfaceC12702l
    /* JADX INFO: renamed from: default */
    public Object mo1290default(AbstractC9542l abstractC9542l, float f) {
        boolean z = abstractC9542l.mo1287synchronized() == 1;
        if (z) {
            abstractC9542l.yandex();
        }
        float fSignatures = (float) abstractC9542l.signatures();
        float fSignatures2 = (float) abstractC9542l.signatures();
        while (abstractC9542l.ads()) {
            abstractC9542l.mo1275continue();
        }
        if (z) {
            abstractC9542l.mopub();
        }
        return new C5798l((fSignatures / 100.0f) * f, (fSignatures2 / 100.0f) * f);
    }

    @Override // defpackage.InterfaceC11210l
    public /* bridge */ /* synthetic */ C8195l loadAd() {
        return null;
    }

    @Override // defpackage.InterfaceC13142l
    public /* synthetic */ C3790l metrica() {
        return null;
    }

    @Override // defpackage.InterfaceC0993l
    public int purchase(int i, int i2, int i3, int i4) {
        return 0;
    }

    @Override // defpackage.InterfaceC15244l
    public Object remoteconfig(C11644l c11644l) {
        return new C6928l(c11644l.m3178l(AbstractC17463l.class));
    }

    @Override // defpackage.InterfaceC1953l
    public Object smaato(C3823l c3823l) throws IOException {
        if (c3823l.smaato()) {
            return (Bundle) c3823l.isPro();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(c3823l.subs())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", c3823l.subs());
    }

    @Override // defpackage.InterfaceC11210l
    public InterfaceC6942l subs() {
        InterfaceC6942l interfaceC6942lAdcel;
        C5198l c5198lM3161l = C6336l.loadAd.m3161l();
        return (c5198lM3161l == null || (interfaceC6942lAdcel = AbstractC4338l.adcel(c5198lM3161l.m1735l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).loadAd("uid", new String[0]))) == null) ? new C14970l(5, C11507l.f23131l) : new C13900l(interfaceC6942lAdcel, 14);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x013f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.InterfaceC13540l
    /* JADX INFO: renamed from: throws */
    public Object mo805throws(AbstractC10022l abstractC10022l, AbstractC0283l abstractC0283l) {
        C15347l c15347l;
        InterfaceC13012l interfaceC13012lLoadAd;
        C9612l c9612l;
        InterfaceC13012l interfaceC13012lLoadAd2;
        C0210l c0210l;
        InterfaceC13012l interfaceC13012lLoadAd3;
        C11161l c11161l;
        InterfaceC13012l interfaceC13012lLoadAd4;
        C16372l c16372l;
        InterfaceC13012l interfaceC13012lLoadAd5;
        int i = this.f29017l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 4:
                if (abstractC0283l instanceof C15347l) {
                    c15347l = (C15347l) abstractC0283l;
                    int i2 = c15347l.f30006l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c15347l.f30006l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c15347l = new C15347l(this, abstractC0283l);
                    }
                } else {
                    c15347l = new C15347l(this, abstractC0283l);
                }
                Object objYandex = c15347l.f30007l;
                int i3 = c15347l.f30006l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC2829l.crashlytics(objYandex);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex);
                C14249l c14249lLoadAd = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l = C0861l.crashlytics;
                    interfaceC13012lLoadAd = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(Integer.TYPE)));
                } catch (Throwable unused) {
                    interfaceC13012lLoadAd = null;
                }
                C11310l c11310l = new C11310l(interfaceC1388lLoadAd, interfaceC13012lLoadAd);
                c15347l.f30006l = 1;
                objYandex = c14249lLoadAd.yandex(c11310l, c15347l);
                if (objYandex == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex != null) {
                    return (C0951l) objYandex;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            case 13:
                if (abstractC0283l instanceof C9612l) {
                    c9612l = (C9612l) abstractC0283l;
                    int i4 = c9612l.f19583l;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c9612l.f19583l = i4 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c9612l = new C9612l(this, abstractC0283l);
                    }
                } else {
                    c9612l = new C9612l(this, abstractC0283l);
                }
                Object objYandex2 = c9612l.f19584l;
                int i5 = c9612l.f19583l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC2829l.crashlytics(objYandex2);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex2);
                C14249l c14249lLoadAd2 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd2 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l2 = C0861l.crashlytics;
                    interfaceC13012lLoadAd2 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C18117l.class)));
                } catch (Throwable unused2) {
                    interfaceC13012lLoadAd2 = null;
                }
                C11310l c11310l2 = new C11310l(interfaceC1388lLoadAd2, interfaceC13012lLoadAd2);
                c9612l.f19583l = 1;
                objYandex2 = c14249lLoadAd2.yandex(c11310l2, c9612l);
                if (objYandex2 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex2 != null) {
                    return (C0951l) objYandex2;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            case 14:
                if (abstractC0283l instanceof C0210l) {
                    c0210l = (C0210l) abstractC0283l;
                    int i6 = c0210l.f1177l;
                    if ((i6 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c0210l.f1177l = i6 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c0210l = new C0210l(this, abstractC0283l);
                    }
                } else {
                    c0210l = new C0210l(this, abstractC0283l);
                }
                Object objYandex3 = c0210l.f1178l;
                int i7 = c0210l.f1177l;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC2829l.crashlytics(objYandex3);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex3);
                C14249l c14249lLoadAd3 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd3 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l3 = C0861l.crashlytics;
                    interfaceC13012lLoadAd3 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C18292l.class)));
                } catch (Throwable unused3) {
                    interfaceC13012lLoadAd3 = null;
                }
                C11310l c11310l3 = new C11310l(interfaceC1388lLoadAd3, interfaceC13012lLoadAd3);
                c0210l.f1177l = 1;
                objYandex3 = c14249lLoadAd3.yandex(c11310l3, c0210l);
                if (objYandex3 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex3 != null) {
                    return (C0951l) objYandex3;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            case 15:
                if (abstractC0283l instanceof C11161l) {
                    c11161l = (C11161l) abstractC0283l;
                    int i8 = c11161l.f22446l;
                    if ((i8 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c11161l.f22446l = i8 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c11161l = new C11161l(this, abstractC0283l);
                    }
                } else {
                    c11161l = new C11161l(this, abstractC0283l);
                }
                Object objYandex4 = c11161l.f22447l;
                int i9 = c11161l.f22446l;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC2829l.crashlytics(objYandex4);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex4);
                C14249l c14249lLoadAd4 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd4 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l4 = C0861l.crashlytics;
                    interfaceC13012lLoadAd4 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C1359l.class)));
                } catch (Throwable unused4) {
                    interfaceC13012lLoadAd4 = null;
                }
                C11310l c11310l4 = new C11310l(interfaceC1388lLoadAd4, interfaceC13012lLoadAd4);
                c11161l.f22446l = 1;
                objYandex4 = c14249lLoadAd4.yandex(c11310l4, c11161l);
                if (objYandex4 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex4 != null) {
                    return (C0951l) objYandex4;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            default:
                if (abstractC0283l instanceof C16372l) {
                    c16372l = (C16372l) abstractC0283l;
                    int i10 = c16372l.f32017l;
                    if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c16372l.f32017l = i10 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c16372l = new C16372l(this, abstractC0283l);
                    }
                } else {
                    c16372l = new C16372l(this, abstractC0283l);
                }
                Object objYandex5 = c16372l.f32018l;
                int i11 = c16372l.f32017l;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC2829l.crashlytics(objYandex5);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex5);
                C14249l c14249lLoadAd5 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd5 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l5 = C0861l.crashlytics;
                    interfaceC13012lLoadAd5 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C15489l.class)));
                } catch (Throwable unused5) {
                    interfaceC13012lLoadAd5 = null;
                }
                C11310l c11310l5 = new C11310l(interfaceC1388lLoadAd5, interfaceC13012lLoadAd5);
                c16372l.f32017l = 1;
                objYandex5 = c14249lLoadAd5.yandex(c11310l5, c16372l);
                if (objYandex5 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex5 != null) {
                    return (C0951l) objYandex5;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
        }
    }

    public String toString() {
        switch (this.f29017l) {
            case 11:
                return "Start";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC16011l
    public AbstractC18041l yandex() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // defpackage.InterfaceC13142l
    public void firebase(C2566l c2566l) {
    }

    @Override // defpackage.InterfaceC13142l
    public /* synthetic */ void isPro(InterfaceC17593l interfaceC17593l) {
    }

    @Override // defpackage.InterfaceC18565l
    public float mopub(float f) {
        return f;
    }

    @Override // defpackage.InterfaceC18565l
    public float vip(float f) {
        return f;
    }
}

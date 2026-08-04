package defpackage;

import android.util.Base64;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؚۦ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7659l extends AbstractC11801l {

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final List f15788l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final List f15789l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final List f15790l;

    public C7659l() {
        super(0);
        this.f15789l = AbstractC14055l.remoteconfig(new Cimplements(new C12823l(Integer.valueOf(R.string.pref_about_tg), Integer.valueOf(R.string.pref_about_tg_desc), new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset()))), new Cimplements(new C12823l(Integer.valueOf(R.string.pref_about_chat), Integer.valueOf(R.string.pref_about_chat_desc), "chat")), new Cimplements(new C12823l(Integer.valueOf(R.string.pref_about_faq), Integer.valueOf(R.string.pref_about_faq_desc), "https://t.me/vkxfaq")), new Cimplements(new C12823l(Integer.valueOf(R.string.fc_usagepolicy), 0, "https://vkx.app/license")));
        this.f15790l = AbstractC14055l.remoteconfig(new Cimplements(new C12823l(Integer.valueOf(R.string.pref_about_3dcp), 0, "https://4pda.to/forum/index.php?showtopic=945974")), new Cimplements(new C12823l(Integer.valueOf(R.string.fc_smarts), 0, "https://smartsworld.ru/view/vk-x.2573/")));
        this.f15788l = AbstractC14055l.remoteconfig(new Cimplements(new C12823l(Integer.valueOf(R.string.fc_hawk), Integer.valueOf(R.string.fc_hawk_desc), "https://t.me/hawk_vk")), new Cimplements(new C12823l(Integer.valueOf(R.string.fc_ea), 0, "https://t.me/easyapk")), new Cimplements(new C12823l(Integer.valueOf(R.string.fc_vl), 0, "https://t.me/vk_leaks")), new Cimplements(new C12823l(Integer.valueOf(R.string.fc_pa), 0, "https://t.me/powerapk")), new Cimplements(new C12823l(Integer.valueOf(R.string.fc_av), 0, "https://t.me/altervk")));
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m2192abstract(C12823l c12823l, C6956l c6956l, int i) {
        C15578l c15578lAmazon;
        c6956l.m2133new(-754148374);
        int i2 = (c6956l.billing(c12823l) ? 4 : 2) | i | (c6956l.admob(this) ? 32 : 16);
        int i3 = 0;
        int i4 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C18196l c18196l = (C18196l) c6956l.isPro(AbstractC4751l.subscription);
            if (((Number) c12823l.f25199l).intValue() != 0) {
                c6956l.m2123default(1112894253);
                c15578lAmazon = AbstractC14566l.amazon(-2011995543, new Cthis(c12823l, i4), c6956l);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(140054931);
                c6956l.startapp(false);
                c15578lAmazon = null;
            }
            int i5 = (c6956l.admob(this) ? 1 : 0) | ((i2 & 14) != 4 ? 0 : 1) | (c6956l.admob(c18196l) ? 1 : 0);
            Object objM2132native = c6956l.m2132native();
            if (i5 != 0 || objM2132native == C1867l.yandex) {
                objM2132native = new Cfinally(c12823l, this, c18196l, i3);
                c6956l.m2147try(objM2132native);
            }
            AbstractC13319l.yandex(AbstractC14566l.amazon(215225928, new Cthis(c12823l, i3), c6956l), AbstractC0080l.amazon(AbstractC9151l.loadAd(C4346l.f8873l, false, null, (Function0) objM2132native, 15), 1.0f), null, c15578lAmazon, null, null, null, c6956l, 6, 500);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Cpublic(this, c12823l, i);
        }
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m2193import(int i, int i2, C6956l c6956l, boolean z, boolean z2) {
        C6956l c6956l2;
        boolean z3;
        c6956l.m2133new(-1791798323);
        int i3 = i2 | (c6956l.amazon(i) ? 4 : 2);
        if (c6956l.m2127for(i3 & 1, (i3 & 147) != 146)) {
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l, 0);
            long j = c6956l.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, c4346l);
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
            AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            C9946l c9946l = AbstractC16837l.yandex;
            if (z) {
                c6956l.m2123default(1053429047);
                AbstractC9383l.yandex(AbstractC4927l.amazon(AbstractC0080l.amazon(AbstractC0080l.purchase(AbstractC0019l.crashlytics(c4346l, AbstractC7497l.loadAd(3)), 8.0f), 1.0f), ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads, c9946l), c6956l, 0);
            } else {
                c6956l.m2123default(1043846699);
            }
            c6956l.startapp(false);
            String strPurchase = AbstractC11999l.purchase(c6956l, i);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(strPurchase, AbstractC3605l.remoteconfig(c4346l, 16.0f, 12.0f), C9735l.loadAd(0.7f, ((C14370l) c6956l.isPro(c10707l)).yandex.adcel), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 48, 0, 262136);
            c6956l2 = c6956l;
            if (z2) {
                c6956l2.m2123default(1054039933);
                InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(AbstractC0080l.amazon(AbstractC0080l.purchase(AbstractC0019l.crashlytics(c4346l, AbstractC7497l.loadAd(12)), 8.0f), 1.0f), ((C14370l) c6956l2.isPro(c10707l)).yandex.ads, c9946l);
                z3 = false;
                AbstractC9383l.yandex(interfaceC17242lAmazon, c6956l2, 0);
            } else {
                z3 = false;
                c6956l2.m2123default(1043846699);
            }
            c6956l2.startapp(z3);
            c6956l2.startapp(true);
        } else {
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C13493l(this, i, z, z2, i2);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-390585665);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                C11521l c11521l = new C11521l(0, EnumC0442l.f1616l);
                while (true) {
                    if (!c11521l.hasNext()) {
                        objM2132native = EnumC0442l.Default;
                        break;
                    }
                    EnumC0442l enumC0442l = (EnumC0442l) c11521l.next();
                    VKXApplication vKXApplication = VKXApplication.f36631l;
                    if (vKXApplication == null) {
                        vKXApplication = null;
                    }
                    if (AbstractC14147l.yandex(vKXApplication, enumC0442l)) {
                        objM2132native = enumC0442l;
                        break;
                    }
                }
                c6956l.m2147try(objM2132native);
            }
            EnumC0442l enumC0442l2 = (EnumC0442l) objM2132native;
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l);
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == obj) {
                objM2132native2 = new C15308l(0);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(1213520507, new Cpublic(c13072lYandex, this, i3), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(-1783364592, new C11223l((Object) c13072lYandex, (Object) this, objM2132native2, (Object) enumC0442l2, 1), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Cbreak(this, i);
        }
    }
}

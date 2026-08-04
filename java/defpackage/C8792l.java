package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٌؙٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8792l {
    public final C0458l loadAd;
    public final C7644l yandex;

    public C8792l(C7644l c7644l) {
        this.yandex = c7644l;
        C0511l c0511l = (C0511l) c7644l.f15738l;
        this.loadAd = new C0458l((InterfaceC11865l) c0511l.loadAd, (C12014l) c0511l.firebase, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [l٘ٛۢ] */
    /* JADX WARN: Type inference failed for: r21v2 */
    public final List admob(List list, AbstractC2597l abstractC2597l, int i) {
        int i2;
        C18128l c18128l;
        InterfaceC3841l c3613l;
        C8792l c8792l = this;
        C7644l c7644l = c8792l.yandex;
        C14965l c14965l = (C14965l) c7644l.f15740l;
        C15615l c15615l = (C15615l) c7644l.f15736l;
        InterfaceC11661l interfaceC11661l = (InterfaceC11661l) ((InterfaceC8371l) c7644l.f15734l);
        AbstractC3031l abstractC3031lYandex = c8792l.yandex(interfaceC11661l.Signature());
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            C18426l c18426l = (C18426l) obj;
            int i5 = (c18426l.f35984l & 1) == 1 ? c18426l.f35990l : 0;
            if (abstractC3031lYandex == null || !AbstractC1305l.crashlytics.purchase(i5).booleanValue()) {
                i2 = i3;
                c18128l = null;
                c3613l = C2782l.f6058l;
            } else {
                i2 = i3;
                c18128l = null;
                c3613l = new C3613l((C16412l) ((C0511l) c7644l.f15738l).yandex, new C6072l(c8792l, abstractC3031lYandex, abstractC2597l, i, i2, c18426l, 0));
            }
            C3498l c3498lFirebase = AbstractC18719l.firebase((InterfaceC3588l) c7644l.f15737l, c18426l.f35989l);
            AbstractC18041l abstractC18041lPremium = c15615l.premium(AbstractC7310l.smaato(c18426l, c14965l));
            boolean zBooleanValue = AbstractC1305l.f3389native.purchase(i5).booleanValue();
            boolean zBooleanValue2 = AbstractC1305l.f3391private.purchase(i5).booleanValue();
            boolean zBooleanValue3 = AbstractC1305l.f3387extends.purchase(i5).booleanValue();
            int i6 = c18426l.f35984l;
            C18128l c18128lMopub = (i6 & 16) == 16 ? c18426l.f35986l : (i6 & 32) == 32 ? c14965l.mopub(c18426l.f35992l) : c18128l;
            ?? Premium = c18128lMopub != null ? c15615l.premium(c18128lMopub) : c18128l;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new C17538l(interfaceC11661l, null, i2, c3613l, c3498lFirebase, abstractC18041lPremium, zBooleanValue, zBooleanValue2, zBooleanValue3, Premium, InterfaceC5706l.f12087l));
            arrayList = arrayList2;
            i3 = i4;
            c8792l = this;
        }
        return AbstractC16901l.m4213const(arrayList);
    }

    public final InterfaceC3841l amazon(C13146l c13146l, boolean z) {
        return !AbstractC1305l.crashlytics.purchase(c13146l.f25731l).booleanValue() ? C2782l.f6058l : new C3613l((C16412l) ((C0511l) this.yandex.f15738l).yandex, new C9777l(this, z, c13146l));
    }

    public final C4799l billing(C14036l c14036l) {
        int i;
        AbstractC18041l abstractC18041lPremium;
        C7644l c7644l = this.yandex;
        InterfaceC3588l interfaceC3588l = (InterfaceC3588l) c7644l.f15737l;
        C14965l c14965l = (C14965l) c7644l.f15740l;
        int i2 = 1;
        if ((c14036l.f27358l & 1) == 1) {
            i = c14036l.f27371l;
        } else {
            int i3 = c14036l.f27370l;
            i = ((i3 >> 8) << 6) + (i3 & 63);
        }
        int i4 = i;
        InterfaceC3841l interfaceC3841lCrashlytics = crashlytics(c14036l, i4, 1);
        int i5 = c14036l.f27358l;
        InterfaceC3841l c0846l = ((i5 & 32) == 32 || (i5 & 64) == 64) ? new C0846l((C16412l) ((C0511l) c7644l.f15738l).yandex, new C14301l(this, c14036l, i2, i2)) : C2782l.f6058l;
        C4799l c4799l = new C4799l((InterfaceC8371l) c7644l.f15734l, null, interfaceC3841lCrashlytics, AbstractC18719l.firebase(interfaceC3588l, c14036l.f27374l), AbstractC2749l.purchase((EnumC4439l) AbstractC1305l.adcel.purchase(i4)), c14036l, (InterfaceC3588l) c7644l.f15737l, c14965l, AbstractC3759l.mopub((InterfaceC8371l) c7644l.f15734l).yandex(AbstractC18719l.firebase(interfaceC3588l, c14036l.f27374l)).equals(AbstractC16403l.yandex) ? C5557l.loadAd : (C5557l) c7644l.f15739l, (InterfaceC8850l) c7644l.f15735l, null);
        C7644l c7644lLoadAd = c7644l.loadAd(c4799l, c14036l.f27373l, (InterfaceC3588l) c7644l.f15737l, (C14965l) c7644l.f15740l, (C5557l) c7644l.f15739l, (AbstractC12974l) c7644l.f15742l);
        C8792l c8792l = (C8792l) c7644lLoadAd.f15741l;
        C15615l c15615l = (C15615l) c7644lLoadAd.f15736l;
        C18128l c18128lMopub = AbstractC7310l.mopub(c14036l, c14965l);
        C7073l c7073lFirebase = (c18128lMopub == null || (abstractC18041lPremium = c15615l.premium(c18128lMopub)) == null) ? null : AbstractC6689l.firebase(c4799l, abstractC18041lPremium, c0846l);
        InterfaceC8371l interfaceC8371l = (InterfaceC8371l) c7644l.f15734l;
        InterfaceC17477l interfaceC17477l = interfaceC8371l instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC8371l : null;
        c4799l.mo3360l(c7073lFirebase, interfaceC17477l != null ? interfaceC17477l.mo2892l() : null, c8792l.loadAd(AbstractC7310l.loadAd(c14036l, c14965l), c14036l.f27369l, c14036l, 1), c15615l.vip(), c8792l.admob(c14036l.f27363l, c14036l, 1), c15615l.premium(AbstractC7310l.subs(c14036l, c14965l)), C13772l.m3754l((EnumC4183l) AbstractC1305l.purchase.purchase(i4)), AbstractC2749l.amazon((EnumC3338l) AbstractC1305l.amazon.purchase(i4)), C14054l.f27396l);
        c4799l.f20730l = AbstractC1305l.ads.purchase(i4).booleanValue();
        c4799l.f20723l = AbstractC1305l.subscription.purchase(i4).booleanValue();
        c4799l.f20716l = AbstractC1305l.license.purchase(i4).booleanValue();
        c4799l.f20719l = AbstractC1305l.tapsense.purchase(i4).booleanValue();
        c4799l.f20732l = AbstractC1305l.Signature.purchase(i4).booleanValue();
        c4799l.f20710l = AbstractC1305l.pro.purchase(i4).booleanValue();
        c4799l.f20718l = AbstractC1305l.ad.purchase(i4).booleanValue();
        c4799l.f20733l = !AbstractC1305l.advert.purchase(i4).booleanValue();
        ((C8565l) ((C0511l) c7644l.f15738l).smaato).getClass();
        return c4799l;
    }

    public final InterfaceC3841l crashlytics(AbstractC2597l abstractC2597l, int i, int i2) {
        return !AbstractC1305l.crashlytics.purchase(i).booleanValue() ? C2782l.f6058l : new C3613l((C16412l) ((C0511l) this.yandex.f15738l).yandex, new C14301l(this, abstractC2597l, i2, 0));
    }

    public final ArrayList loadAd(List list, List list2, AbstractC2597l abstractC2597l, int i) {
        C8792l c8792l = this;
        C7644l c7644l = c8792l.yandex;
        InterfaceC11661l interfaceC11661l = (InterfaceC11661l) ((InterfaceC8371l) c7644l.f15734l);
        AbstractC3031l abstractC3031lYandex = c8792l.yandex(interfaceC11661l.Signature());
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            C18128l c18128l = (C18128l) obj;
            C18426l c18426l = (C18426l) AbstractC16901l.m4220for(i2, list2);
            C7073l c7073lPurchase = AbstractC6689l.purchase(interfaceC11661l, ((C15615l) c7644l.f15736l).premium(c18128l), null, (abstractC3031lYandex == null || !AbstractC1305l.crashlytics.purchase((c18426l == null || (c18426l.f35984l & 1) != 1) ? 0 : c18426l.f35990l).booleanValue()) ? C2782l.f6058l : new C3613l((C16412l) ((C0511l) c7644l.f15738l).yandex, new C6072l(c8792l, abstractC3031lYandex, abstractC2597l, i, i2, c18426l, 1)), i2);
            if (c7073lPurchase != null) {
                arrayList.add(c7073lPurchase);
            }
            c8792l = this;
            i2 = i3;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x014d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [lٗۡۢ] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [lٌؙٕ] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    public final C1689l mopub(C13146l c13146l, boolean z) {
        int i;
        InterfaceC3841l interfaceC3841lCrashlytics;
        int i2;
        ?? r14;
        InterfaceC3841l c0846l;
        C1689l c1689l;
        C11425l c11425lBilling;
        C9004l c9004l;
        C1710l c1710lMopub;
        boolean z2;
        ?? r0;
        ?? Mo752l;
        InterfaceC17477l interfaceC17477l;
        AbstractC18041l abstractC18041lPremium;
        C3199l c3199l = C2782l.f6058l;
        C7644l c7644l = this.yandex;
        InterfaceC3588l interfaceC3588l = (InterfaceC3588l) c7644l.f15737l;
        C14965l c14965l = (C14965l) c7644l.f15740l;
        if ((c13146l.f25716l & 1) == 1) {
            i = c13146l.f25731l;
        } else {
            int i3 = c13146l.f25730l;
            i = ((i3 >> 8) << 6) + (i3 & 63);
        }
        if (z) {
            List list = c13146l.f25718l;
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(this.loadAd.applovin((C7899l) it.next(), interfaceC3588l));
            }
            interfaceC3841lCrashlytics = arrayList.isEmpty() ? c3199l : new C2172l(0, arrayList);
        } else {
            interfaceC3841lCrashlytics = null;
        }
        InterfaceC8371l interfaceC8371l = (InterfaceC8371l) c7644l.f15734l;
        if (interfaceC3841lCrashlytics == null) {
            interfaceC3841lCrashlytics = crashlytics(c13146l, i, 2);
        }
        C4130l c4130l = AbstractC1305l.purchase;
        int iM3754l = C13772l.m3754l((EnumC4183l) c4130l.purchase(i));
        C4130l c4130l2 = AbstractC1305l.amazon;
        int i4 = i;
        C1689l c1689l2 = new C1689l(interfaceC8371l, null, interfaceC3841lCrashlytics, iM3754l, AbstractC2749l.amazon((EnumC3338l) c4130l2.purchase(i)), AbstractC1305l.signatures.purchase(i).booleanValue(), AbstractC18719l.firebase(interfaceC3588l, c13146l.f25736l), AbstractC2749l.purchase((EnumC4439l) AbstractC1305l.adcel.purchase(i)), AbstractC1305l.inmobi.purchase(i).booleanValue(), AbstractC1305l.appmetrica.purchase(i).booleanValue(), AbstractC1305l.f3390package.purchase(i).booleanValue(), AbstractC1305l.f3394synchronized.purchase(i).booleanValue(), AbstractC1305l.f3392strictfp.purchase(i).booleanValue(), c13146l, (InterfaceC3588l) c7644l.f15737l, c14965l, (C5557l) c7644l.f15739l, (InterfaceC8850l) c7644l.f15735l);
        C7644l c7644lLoadAd = c7644l.loadAd(c1689l2, c13146l.f25735l, (InterfaceC3588l) c7644l.f15737l, (C14965l) c7644l.f15740l, (C5557l) c7644l.f15739l, (AbstractC12974l) c7644l.f15742l);
        C15615l c15615l = (C15615l) c7644lLoadAd.f15736l;
        boolean zBooleanValue = AbstractC1305l.premium.purchase(i4).booleanValue();
        int i5 = 3;
        if (zBooleanValue) {
            int i6 = c13146l.f25716l;
            if ((i6 & 32) == 32 || (i6 & 64) == 64) {
                i2 = 1;
                C8792l c8792l = this;
                c0846l = new C0846l((C16412l) ((C0511l) c7644l.f15738l).yandex, new C14301l(c8792l, c13146l, i5, i2));
                r14 = c8792l;
            } else {
                i2 = 1;
                r14 = this;
                c0846l = c3199l;
            }
        } else {
            i2 = 1;
            r14 = this;
            c0846l = c3199l;
        }
        AbstractC18041l abstractC18041lPremium2 = c15615l.premium(AbstractC7310l.isPro(c13146l, c14965l));
        List listVip = c15615l.vip();
        InterfaceC8371l interfaceC8371l2 = (InterfaceC8371l) c7644l.f15734l;
        InterfaceC17477l interfaceC17477l2 = interfaceC8371l2 instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC8371l2 : null;
        C7073l c7073lMo2892l = interfaceC17477l2 != null ? interfaceC17477l2.mo2892l() : null;
        C18128l c18128lAdmob = AbstractC7310l.admob(c13146l, c14965l);
        ?? r1 = i2;
        c1689l2.m3646l(abstractC18041lPremium2, listVip, c7073lMo2892l, (c18128lAdmob == null || (abstractC18041lPremium = c15615l.premium(c18128lAdmob)) == null) ? null : AbstractC6689l.firebase(c1689l2, abstractC18041lPremium, c0846l), ((C8792l) c7644lLoadAd.f15741l).loadAd(AbstractC7310l.crashlytics(c13146l, c14965l), c13146l.f25729l, c13146l, 3));
        int iLoadAd = AbstractC1305l.loadAd(AbstractC1305l.crashlytics.purchase(i4).booleanValue(), (EnumC3338l) c4130l2.purchase(i4), (EnumC4183l) c4130l.purchase(i4));
        C6162l c6162l = InterfaceC5706l.f12087l;
        if (zBooleanValue) {
            int i7 = (c13146l.f25716l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256 ? c13146l.f25725l : iLoadAd;
            boolean zBooleanValue2 = AbstractC1305l.f3388for.purchase(i7).booleanValue();
            boolean zBooleanValue3 = AbstractC1305l.f3395throw.purchase(i7).booleanValue();
            boolean zBooleanValue4 = AbstractC1305l.f3385catch.purchase(i7).booleanValue();
            InterfaceC3841l interfaceC3841lCrashlytics2 = r14.crashlytics(c13146l, i7, 3);
            if (zBooleanValue2) {
                C11425l c11425l = new C11425l(c1689l2, interfaceC3841lCrashlytics2, C13772l.m3754l((EnumC4183l) c4130l.purchase(i7)), AbstractC2749l.amazon((EnumC3338l) c4130l2.purchase(i7)), !zBooleanValue2, zBooleanValue3, zBooleanValue4, c1689l2.mo367while(), null, c6162l);
                c1689l = c1689l2;
                c11425lBilling = c11425l;
            } else {
                c1689l = c1689l2;
                c11425lBilling = AbstractC6689l.billing(c1689l, interfaceC3841lCrashlytics2);
            }
            c11425lBilling.m3086l(c1689l.smaato());
        } else {
            c1689l = c1689l2;
            c11425lBilling = null;
        }
        if (AbstractC1305l.applovin.purchase(i4).booleanValue()) {
            if ((c13146l.f25716l & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
                iLoadAd = c13146l.f25740l;
            }
            boolean zBooleanValue5 = AbstractC1305l.f3388for.purchase(iLoadAd).booleanValue();
            boolean zBooleanValue6 = AbstractC1305l.f3395throw.purchase(iLoadAd).booleanValue();
            boolean zBooleanValue7 = AbstractC1305l.f3385catch.purchase(iLoadAd).booleanValue();
            InterfaceC3841l interfaceC3841lCrashlytics3 = r14.crashlytics(c13146l, iLoadAd, 4);
            if (zBooleanValue5) {
                c1710lMopub = new C1710l(c1689l, interfaceC3841lCrashlytics3, C13772l.m3754l((EnumC4183l) c4130l.purchase(iLoadAd)), AbstractC2749l.amazon((EnumC3338l) c4130l2.purchase(iLoadAd)), !zBooleanValue5, zBooleanValue6, zBooleanValue7, c1689l.mo367while(), null, c6162l);
                C17538l c17538l = (C17538l) AbstractC16901l.m4208abstract(((C8792l) c7644lLoadAd.loadAd(c1710lMopub, C2580l.f5619l, (InterfaceC3588l) c7644lLoadAd.f15737l, (C14965l) c7644lLoadAd.f15740l, (C5557l) c7644lLoadAd.f15739l, (AbstractC12974l) c7644lLoadAd.f15742l).f15741l).admob(Collections.singletonList(c13146l.f25721l), c13146l, 4));
                if (c17538l == null) {
                    C1710l.m1006l(6);
                    throw null;
                }
                c1710lMopub.f4098l = c17538l;
                c9004l = null;
            } else {
                c9004l = null;
                c1710lMopub = AbstractC6689l.mopub(c1689l, interfaceC3841lCrashlytics3);
            }
        } else {
            c9004l = null;
            c1710lMopub = null;
        }
        if (AbstractC1305l.f3396throws.purchase(i4).booleanValue()) {
            z2 = false;
            c1689l.m3645l(c9004l, new C6022l(r14, c13146l, c1689l, false ? 1 : 0));
        } else {
            z2 = false;
        }
        InterfaceC8371l interfaceC8371l3 = (InterfaceC8371l) c7644l.f15734l;
        if (interfaceC8371l3 instanceof InterfaceC17477l) {
            interfaceC17477l = (InterfaceC17477l) interfaceC8371l3;
        } else {
            r0 = c9004l;
        }
        if (r0 != 0) {
            r0 = interfaceC17477l;
            Mo752l = r0.mo752l();
        } else {
            r0 = interfaceC17477l;
            Mo752l = z2;
        }
        if (Mo752l == 5) {
            c1689l.m3645l(c9004l, new C6022l(r14, c13146l, c1689l, r1 == true ? 1 : 0));
        }
        c1689l.m3647l(c11425lBilling, c1710lMopub, new C15249l(r14.amazon(c13146l, z2)), new C15249l(r14.amazon(c13146l, r1)));
        return c1689l;
    }

    public final C0788l purchase(C13347l c13347l, boolean z) {
        C6561l c6561l;
        C7644l c7644l = this.yandex;
        InterfaceC17477l interfaceC17477l = (InterfaceC17477l) ((InterfaceC8371l) c7644l.f15734l);
        C0788l c0788l = new C0788l(interfaceC17477l, null, crashlytics(c13347l, c13347l.f26207l, 1), z, 1, c13347l, (InterfaceC3588l) c7644l.f15737l, (C14965l) c7644l.f15740l, (C5557l) c7644l.f15739l, (InterfaceC8850l) c7644l.f15735l, null);
        List listAdmob = ((C8792l) c7644l.loadAd(c0788l, C2580l.f5619l, (InterfaceC3588l) c7644l.f15737l, (C14965l) c7644l.f15740l, (C5557l) c7644l.f15739l, (AbstractC12974l) c7644l.f15742l).f15741l).admob(c13347l.f26206l, c13347l, 1);
        EnumC3338l enumC3338l = (EnumC3338l) AbstractC1305l.amazon.purchase(c13347l.f26207l);
        switch (enumC3338l == null ? -1 : AbstractC1603l.loadAd[enumC3338l.ordinal()]) {
            case 1:
                c6561l = AbstractC6004l.amazon;
                break;
            case 2:
                c6561l = AbstractC6004l.yandex;
                break;
            case 3:
                c6561l = AbstractC6004l.loadAd;
                break;
            case 4:
                c6561l = AbstractC6004l.crashlytics;
                break;
            case 5:
                c6561l = AbstractC6004l.purchase;
                break;
            case 6:
                c6561l = AbstractC6004l.billing;
                break;
            default:
                c6561l = AbstractC6004l.yandex;
                break;
        }
        c0788l.m1860l(listAdmob, c6561l);
        c0788l.m2900l(interfaceC17477l.ad());
        c0788l.f20718l = interfaceC17477l.mo750case();
        c0788l.f20733l = !AbstractC1305l.metrica.purchase(c13347l.f26207l).booleanValue();
        return c0788l;
    }

    public final AbstractC3031l yandex(InterfaceC8371l interfaceC8371l) {
        if (interfaceC8371l instanceof InterfaceC9921l) {
            C2312l c2312l = ((AbstractC3740l) ((InterfaceC9921l) interfaceC8371l)).f7826l;
            C7644l c7644l = this.yandex;
            return new C16059l(c2312l, (InterfaceC3588l) c7644l.f15737l, (C14965l) c7644l.f15740l, (InterfaceC8850l) c7644l.f15735l);
        }
        if (interfaceC8371l instanceof C11296l) {
            return ((C11296l) interfaceC8371l).f22754l;
        }
        return null;
    }
}

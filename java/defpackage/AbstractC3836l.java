package defpackage;

import android.content.res.Resources;
import j$.time.LocalDateTime;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkapi2.objects.music.Concert;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lْؖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3836l {
    public static final void loadAd(Concert concert, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(1386213387);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(concert) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            yandex(concert, AbstractC3605l.startapp(AbstractC3605l.vip(C4346l.f8873l, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7), c6956l, (i2 & 14) | 48, 0);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1674l(concert, i, 2);
        }
    }

    public static final void yandex(final Concert concert, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i, int i2) {
        int i3;
        InterfaceC17242l interfaceC17242l2;
        Concert.Data data = concert.yandex;
        c6956l.m2133new(1846617512);
        if ((i & 6) == 0) {
            i3 = i | (c6956l.admob(concert) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= c6956l.billing(interfaceC17242l) ? 32 : 16;
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            InterfaceC17242l interfaceC17242l3 = i4 != 0 ? C4346l.f8873l : interfaceC17242l;
            boolean zBilling = c6956l.billing(data.billing);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zBilling || objM2132native == c13863l) {
                C2106l c2106l = C2106l.f4733l;
                LocalDateTime localDateTime = AbstractC1214l.amazon(C16367l.advert(data.billing), C15876l.loadAd).f4137l;
                objM2132native = new C8195l(Integer.valueOf(localDateTime.getDayOfMonth()), Integer.valueOf(((EnumC5657l) EnumC5657l.f12011l.get(localDateTime.getMonth().getValue() - 1)).ordinal()));
                c6956l.m2147try(objM2132native);
            }
            C8195l c8195l = (C8195l) objM2132native;
            final int iIntValue = ((Number) c8195l.f17098l).intValue();
            final int iIntValue2 = ((Number) c8195l.f17097l).intValue();
            boolean zAdmob = c6956l.admob(concert);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob || objM2132native2 == c13863l) {
                objM2132native2 = new C13802l(17, concert);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC3383l.loadAd((Function0) objM2132native2, interfaceC17242l3, false, null, null, null, null, AbstractC14566l.amazon(627557267, new Function3() { // from class: lؖۘۡ
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    C6956l c6956l2 = (C6956l) obj2;
                    int iIntValue3 = ((Integer) obj3).intValue();
                    if (c6956l2.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                        C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36040l, c6956l2, 48);
                        long j = c6956l2.f14595continue;
                        int i5 = (int) (j ^ (j >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                        C4346l c4346l = C4346l.f8873l;
                        InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, c4346l);
                        InterfaceC8801l.firebase.getClass();
                        C16395l c16395l = C3438l.loadAd;
                        c6956l2.m2140super();
                        if (c6956l2.f14603switch) {
                            c6956l2.firebase(c16395l);
                        } else {
                            c6956l2.m2136protected();
                        }
                        C6415l c6415l = C3438l.mopub;
                        AbstractC8182l.billing(c6956l2, c5062lYandex, c6415l);
                        C6415l c6415l2 = C3438l.billing;
                        AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
                        Integer numValueOf = Integer.valueOf(i5);
                        C6415l c6415l3 = C3438l.isPro;
                        AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
                        C11192l c11192l = C3438l.firebase;
                        AbstractC8182l.purchase(c6956l2, c11192l);
                        C6415l c6415l4 = C3438l.amazon;
                        AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
                        C15089l c15089l = C18450l.f36034l;
                        C10707l c10707l = AbstractC16964l.yandex;
                        InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(AbstractC4927l.amazon(c4346l, ((C14370l) c6956l2.isPro(c10707l)).yandex.signatures, AbstractC16837l.yandex), 16.0f);
                        C11485l c11485l = AbstractC8313l.crashlytics;
                        C1853l c1853lYandex = AbstractC1001l.yandex(c11485l, c15089l, c6956l2, 48);
                        long j2 = c6956l2.f14595continue;
                        int i6 = (int) (j2 ^ (j2 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                        InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lSmaato);
                        c6956l2.m2140super();
                        if (c6956l2.f14603switch) {
                            c6956l2.firebase(c16395l);
                        } else {
                            c6956l2.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
                        AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
                        AbstractC11043l.isPro(i6, c6956l2, c6415l3, c6956l2, c11192l);
                        AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
                        AbstractC13010l.loadAd(String.valueOf(iIntValue), null, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.purchase, c6956l2, 0, 0, 131066);
                        AbstractC13010l.loadAd(((Resources) c6956l2.isPro(AbstractC1242l.crashlytics)).getStringArray(R.array.date_shortmonths)[iIntValue2], null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                        c6956l2.startapp(true);
                        InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(new C9247l(1.0f, true), 16.0f, 0.0f, 0.0f, 0.0f, 14);
                        C1853l c1853lYandex2 = AbstractC1001l.yandex(c11485l, C18450l.f36046l, c6956l2, 0);
                        long j3 = c6956l2.f14595continue;
                        int i7 = (int) (j3 ^ (j3 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato3 = c6956l2.smaato();
                        InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l2, interfaceC17242lStartapp);
                        c6956l2.m2140super();
                        if (c6956l2.f14603switch) {
                            c6956l2.firebase(c16395l);
                        } else {
                            c6956l2.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l2, c1853lYandex2, c6415l);
                        AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato3, c6415l2);
                        AbstractC11043l.isPro(i7, c6956l2, c6415l3, c6956l2, c11192l);
                        AbstractC8182l.billing(c6956l2, interfaceC17242lBilling3, c6415l4);
                        Concert concert2 = concert;
                        Concert.Data data2 = concert2.yandex;
                        AbstractC13010l.loadAd(data2.loadAd, null, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l2, 0, 24960, 241658);
                        AbstractC13010l.loadAd(data2.crashlytics, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l2, 0, 24960, 241662);
                        AbstractC13010l.loadAd(data2.amazon, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l2, 0, 24960, 241662);
                        c6956l2.startapp(true);
                        AbstractC13010l.loadAd(concert2.loadAd.loadAd, AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 48, 0, 262140);
                        c6956l2.startapp(true);
                    } else {
                        c6956l2.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c6956l, (i3 & 112) | 100663296, 252);
            interfaceC17242l2 = interfaceC17242l3;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9976l(concert, interfaceC17242l2, i, i2, 0);
        }
    }
}

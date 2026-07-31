package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.catalogkit.objects.banner.Catalog2Banner;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lِٗٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17208l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f33400l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33401l;

    public /* synthetic */ C17208l(int i, Object obj) {
        this.f33401l = i;
        this.f33400l = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f33401l;
        C4346l c4346l = C4346l.f8873l;
        C13863l c13863l = C1867l.yandex;
        Object obj4 = this.f33400l;
        boolean z = false;
        int i2 = 1;
        switch (i) {
            case 0:
                long j = ((C9735l) obj).yandex;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.purchase(j) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    AbstractC10216l.loadAd(((C5249l) obj4).crashlytics, j, c6956l, (iIntValue << 3) & 112);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    C2882l c2882l = (C2882l) obj4;
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(2.0f, true, new C8339l(12)), C18450l.f36044l, c6956l2, 6);
                    long j2 = c6956l2.f14595continue;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, c4346l);
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
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                    boolean zBilling = c6956l2.billing(c2882l);
                    Object objM2132native = c6956l2.m2132native();
                    Object obj5 = objM2132native;
                    if (zBilling || objM2132native == c13863l) {
                        String strValueOf = String.valueOf((int) c2882l.f6280l);
                        c6956l2.m2147try(strValueOf);
                        obj5 = strValueOf;
                    }
                    AbstractC13010l.loadAd((String) obj5, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.eq3_units_hz), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                Catalog2Banner catalog2Banner = (Catalog2Banner) obj;
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC9694l abstractC9694l = (AbstractC9694l) obj4;
                boolean zAdmob = c6956l3.admob(abstractC9694l);
                Object objM2132native2 = c6956l3.m2132native();
                Object obj6 = objM2132native2;
                if (zAdmob || objM2132native2 == c13863l) {
                    C11998l c11998l = new C11998l(abstractC9694l, i2);
                    c6956l3.m2147try(c11998l);
                    obj6 = c11998l;
                }
                AbstractC2648l.yandex(catalog2Banner, (Function0) obj6, c6956l3, iIntValue3 & 14);
                break;
            case 3:
                InterfaceC15451l interfaceC15451l = (InterfaceC15451l) obj;
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                AudioTrack audioTrack = (AudioTrack) obj4;
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= c6956l4.billing(interfaceC15451l) ? 4 : 2;
                }
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    AbstractC0133l.loadAd(interfaceC15451l, AbstractC14566l.amazon(-1097432980, new C12035l(audioTrack, z ? 1 : 0), c6956l4), AbstractC14566l.amazon(1274664203, new C12035l(audioTrack, i2), c6956l4), c6956l4, (iIntValue4 & 14) | 432);
                } else {
                    c6956l4.m2124else();
                }
                break;
            default:
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(AbstractC0080l.crashlytics(c4346l, 1.0f), 0.0f, 0.0f, 16.0f, 0.0f, 11);
                    C12324l c12324l = (C12324l) obj4;
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36018l, false);
                    long j3 = c6956l5.f14595continue;
                    int i4 = (int) ((j3 >>> 32) ^ j3);
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l5.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l5, interfaceC17242lStartapp);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l5.m2140super();
                    if (c6956l5.f14603switch) {
                        c6956l5.firebase(c16395l2);
                    } else {
                        c6956l5.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l5, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l5, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l5, C3438l.firebase);
                    AbstractC8182l.billing(c6956l5, interfaceC17242lBilling2, C3438l.amazon);
                    AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(R.drawable.ic_delete_outline_android_28, 0, c6956l5);
                    long j4 = ((C18718l) c6956l5.isPro(AbstractC5992l.yandex)).loadAd;
                    boolean zAdmob2 = c6956l5.admob(c12324l);
                    Object objM2132native3 = c6956l5.m2132native();
                    if (zAdmob2 || objM2132native3 == c13863l) {
                        objM2132native3 = new C6238l(29, c12324l);
                        c6956l5.m2147try(objM2132native3);
                    }
                    AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, AbstractC7477l.loadAd(c4346l, (Function1) objM2132native3), j4, c6956l5, 56, 0);
                    c6956l5.startapp(true);
                } else {
                    c6956l5.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

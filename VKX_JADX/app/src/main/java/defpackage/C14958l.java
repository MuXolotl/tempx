package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٔ٘۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14958l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7968l f29430l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29431l;

    public /* synthetic */ C14958l(C7968l c7968l, int i) {
        this.f29431l = i;
        this.f29430l = c7968l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String strMopub;
        int i;
        int i2;
        int i3 = this.f29431l;
        C7968l c7968l = this.f29430l;
        switch (i3) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    EnumC1518l enumC1518l = c7968l.f16616l;
                    C6170l c6170l = c7968l.f16620l;
                    if (enumC1518l != null) {
                        c6956l.m2123default(-1009255768);
                        int iOrdinal = c7968l.f16616l.ordinal();
                        if (iOrdinal == 0) {
                            i = -309646603;
                            i2 = R.string.as2_pick_source_library;
                        } else if (iOrdinal == 1) {
                            i = -309641967;
                            i2 = R.string.as2_pick_source_mix;
                        } else if (iOrdinal == 2) {
                            i = -309637157;
                            i2 = R.string.as2_pick_source_cache_library;
                        } else {
                            if (iOrdinal != 3) {
                                throw AbstractC12900l.billing(-309650158, c6956l, false);
                            }
                            i = -309631782;
                            i2 = R.string.as2_pick_source_cache_manual;
                        }
                        strMopub = AbstractC12900l.mopub(c6956l, i, i2, c6956l, false);
                        c6956l.startapp(false);
                    } else if (c6170l != null) {
                        c6956l.m2123default(-1008455658);
                        c6956l.startapp(false);
                        strMopub = c6170l.f13008l;
                    } else {
                        strMopub = AbstractC12900l.mopub(c6956l, -309620912, R.string.as2_pick_source_no, c6956l, false);
                    }
                    AbstractC13010l.loadAd(strMopub, null, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262138);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (c7968l.f16619l) {
                        c6956l2.m2123default(223986625);
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check, 0, c6956l2), AbstractC11999l.purchase(c6956l2, R.string.selected), null, 0L, c6956l2, 8, 12);
                    } else {
                        c6956l2.m2123default(203709091);
                    }
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 2:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    if (c7968l.f16621l) {
                        c6956l3.m2123default(-251913398);
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check, 0, c6956l3), AbstractC11999l.purchase(c6956l3, R.string.selected), null, 0L, c6956l3, 8, 12);
                    } else {
                        c6956l3.m2123default(-272823828);
                    }
                    c6956l3.startapp(false);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            case 3:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    if (c7968l.f16615l) {
                        c6956l4.m2123default(1168876905);
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check, 0, c6956l4), AbstractC11999l.purchase(c6956l4, R.string.selected), null, 0L, c6956l4, 8, 12);
                    } else {
                        c6956l4.m2123default(1147342507);
                    }
                    c6956l4.startapp(false);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            default:
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    if (c7968l.f16618l) {
                        c6956l5.m2123default(-1705292152);
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check, 0, c6956l5), AbstractC11999l.purchase(c6956l5, R.string.selected), null, 0L, c6956l5, 8, 12);
                    } else {
                        c6956l5.m2123default(-1727466390);
                    }
                    c6956l5.startapp(false);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
        }
    }
}

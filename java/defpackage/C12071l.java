package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lِۘۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12071l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f23998l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23999l;

    public /* synthetic */ C12071l(InterfaceC12244l interfaceC12244l, int i) {
        this.f23999l = i;
        this.f23998l = interfaceC12244l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C6956l c6956l;
        int i;
        int i2 = this.f23999l;
        C4346l c4346l = C4346l.f8873l;
        InterfaceC12244l interfaceC12244l = this.f23998l;
        switch (i2) {
            case 0:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(1 & iIntValue, (iIntValue & 3) != 2)) {
                    if (((Boolean) interfaceC12244l.getValue()).booleanValue()) {
                        c6956l = c6956l2;
                        c6956l.m2123default(-72133572);
                    } else {
                        c6956l2.m2123default(-59483588);
                        c6956l = c6956l2;
                        AbstractC4597l.yandex(AbstractC3234l.billing(), null, AbstractC3605l.vip(c4346l, 12.0f, 0.0f, 2), 0L, c6956l, 432, 8);
                    }
                    c6956l.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    int iOrdinal = ((C18554l) interfaceC12244l.getValue()).f36227l.ordinal();
                    if (iOrdinal == 0) {
                        i = R.string.settings_now_playing_background_theme_blur;
                    } else if (iOrdinal == 1) {
                        i = R.string.settings_now_playing_background_theme_no_bg;
                    } else if (iOrdinal == 2) {
                        i = R.string.settings_now_playing_background_theme_gradient;
                    } else if (iOrdinal == 3) {
                        i = R.string.settings_now_playing_background_theme_beyond;
                    } else {
                        if (iOrdinal != 4) {
                            C18725l.billing();
                            return null;
                        }
                        i = R.string.settings_now_playing_background_theme_layer;
                    }
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, i), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            case 2:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!c6956l4.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c6956l4.m2124else();
                } else if (((Boolean) interfaceC12244l.getValue()).booleanValue()) {
                    c6956l4.m2123default(-1537763562);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l4, R.string.private_mode_desc_on), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                    c6956l4.startapp(false);
                } else {
                    c6956l4.m2123default(-1537635687);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l4, R.string.private_mode_desc), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                    c6956l4.startapp(false);
                }
                return Unit.INSTANCE;
            case 3:
                boolean z = false;
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if ((iIntValue4 & 3) != 2) {
                    z = true;
                }
                if (c6956l5.m2127for(iIntValue4 & 1, z)) {
                    AbstractC2021l.yandex(((Boolean) interfaceC12244l.getValue()).booleanValue(), null, null, false, null, c6956l5, 48, 124);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
            default:
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l6.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    if (((Boolean) interfaceC12244l.getValue()).booleanValue()) {
                        c6956l6.m2123default(-1109179435);
                    } else {
                        c6956l6.m2123default(-1092968171);
                        AbstractC4597l.yandex(AbstractC3234l.billing(), null, AbstractC3605l.vip(c4346l, 12.0f, 0.0f, 2), 0L, c6956l6, 432, 8);
                    }
                    c6956l6.startapp(false);
                } else {
                    c6956l6.m2124else();
                }
                return Unit.INSTANCE;
        }
    }
}

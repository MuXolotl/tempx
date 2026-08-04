package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lّؗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4584l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f9315l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9316l;

    public /* synthetic */ C4584l(int i, int i2, boolean z) {
        this.f9316l = i2;
        this.f9315l = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f9316l;
        C4346l c4346l = C4346l.f8873l;
        boolean z = this.f9315l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(z ? R.drawable.ic_thumbs_down_28 : R.drawable.ic_thumbs_down_outline_28, 0, c6956l), AbstractC11999l.purchase(c6956l, z ? R.string.now_playing_toolbox_dislike_remove_track : R.string.now_playing_toolbox_dislike_track), AbstractC0080l.isPro(c4346l, 28.0f), 0L, c6956l, 392, 8);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(z ? R.drawable.ic_check : R.drawable.ic_add, 0, c6956l2), null, null, 0L, c6956l2, 56, 12);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c6956l3.m2124else();
                } else if (z) {
                    c6956l3.m2123default(1549570943);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, R.string.as2_scenario_bluetooth_text), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                    c6956l3.startapp(false);
                } else {
                    c6956l3.m2123default(1549705390);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, R.string.as2_setup_bt), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                    c6956l3.startapp(false);
                }
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    c6956l4.m2124else();
                } else if (z) {
                    c6956l4.m2123default(-1871921649);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l4, R.string.as2_scenario_bluetooth_pair_text), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                    c6956l4.startapp(false);
                } else {
                    c6956l4.m2123default(-1871790333);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l4, R.string.as2_setup_bt), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                    c6956l4.startapp(false);
                }
                break;
            case 4:
                boolean z2 = false;
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if ((iIntValue5 & 3) != 2) {
                    z2 = true;
                }
                if (c6956l5.m2127for(iIntValue5 & 1, z2)) {
                    AbstractC10310l.yandex(this.f9315l, ((C14370l) c6956l5.isPro(AbstractC16964l.yandex)).yandex.adcel, AbstractC0080l.isPro(c4346l, 61.0f), c6956l5, 384);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC11028l.yandex(AbstractC0545l.purchase(7), (C6956l) obj, z);
                break;
            case 6:
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l6, z ? R.string.auth2_password_hint : R.string.auth2_code), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l6, 0, 0, 262142);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 7:
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.player_shuffle, 0, c6956l7), AbstractC11999l.purchase(c6956l7, z ? R.string.now_playing_shuffle_disable : R.string.now_playing_shuffle_enable), AbstractC0080l.isPro(c4346l, 28.0f), 0L, c6956l7, 392, 8);
                } else {
                    c6956l7.m2124else();
                }
                break;
            case 8:
                C6956l c6956l8 = (C6956l) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    C7069l.yandex.loadAd(z, null, c6956l8, 3072);
                } else {
                    c6956l8.m2124else();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                AbstractC18219l.ads(AbstractC0545l.purchase(1), (C6956l) obj, z);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC18296l.amazon(AbstractC0545l.purchase(1), (C6956l) obj, z);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C4584l(boolean z, int i) {
        this.f9316l = i;
        this.f9315l = z;
    }
}

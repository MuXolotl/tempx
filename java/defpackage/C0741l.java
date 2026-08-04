package defpackage;

import android.content.Intent;
import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.banner.Catalog2Banner;
import ua.itaysonlab.vkxreborn.playback.widget_glance.player_small.SmallPlayerGlanceConfigurationActivity;

/* JADX INFO: renamed from: lٜؑۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0741l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f2235l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f2236l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2237l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f2238l;

    public /* synthetic */ C0741l(int i, String str, Function0 function0, int i2) {
        this.f2237l = 21;
        this.f2236l = i;
        this.f2235l = str;
        this.f2238l = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2237l;
        int i2 = 5;
        C13863l c13863l = C1867l.yandex;
        boolean z = false;
        final int i3 = 1;
        final int i4 = this.f2236l;
        Object obj3 = this.f2238l;
        Object obj4 = this.f2235l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((C1774l) obj4).m1048instanceof(i4, AbstractC0545l.purchase(49), (C6956l) obj, (InterfaceC17242l) obj3);
                break;
            case 1:
                ((Integer) obj2).intValue();
                AbstractC8543l.yandex((C3625l) obj4, (List) obj3, (C6956l) obj, AbstractC0545l.purchase(i4 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                AbstractC12155l.yandex((InterfaceC17242l) obj3, (Function1) obj4, (C6956l) obj, AbstractC0545l.purchase(i4 | 1));
                break;
            case 3:
                C4456l c4456l = (C4456l) obj4;
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj3;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    EnumC16462l enumC16462l = (EnumC16462l) c4456l.f9068l.getValue();
                    C14855l c14855l = C18450l.f36017l;
                    boolean zAmazon = c6956l.amazon(i4);
                    Object objM2132native = c6956l.m2132native();
                    if (zAmazon || objM2132native == c13863l) {
                        objM2132native = new C2221l(i4, 5);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC7741l.loadAd(enumC16462l, null, (Function1) objM2132native, c14855l, "[ComplexMenuDialog]", null, AbstractC14566l.amazon(-163327465, new C11050l(c4456l, interfaceC2262l, i2), c6956l), c6956l, 1600512, 34);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((C15578l) obj4).billing(obj3, (C6956l) obj, AbstractC0545l.purchase(i4) | 1);
                break;
            case 5:
                ((Integer) obj2).intValue();
                AbstractC10478l.yandex((C10092l) obj4, (Function2) obj3, (C6956l) obj, AbstractC0545l.purchase(i4 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC10478l.loadAd((C10092l[]) obj4, (Function2) obj3, (C6956l) obj, AbstractC0545l.purchase(i4 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC0124l.purchase((InterfaceC5475l) obj4, (InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(i4 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((C13994l) obj4).amazon(i4, obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 9:
                InterfaceC3074l interfaceC3074l = (InterfaceC3074l) obj4;
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    interfaceC3074l.amazon(i4, obj3, c6956l2, 0);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((C17602l) obj4).amazon(i4, obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ((C11862l) obj4).amazon(i4, obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ((C17408l) obj4).m4326instanceof((C18554l) obj3, (C6956l) obj, AbstractC0545l.purchase(i4 | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                AbstractC17824l.crashlytics((EnumC12501l) obj4, (Function0) obj3, (C6956l) obj, AbstractC0545l.purchase(i4 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                ((C17284l) obj4).m4295instanceof((String) obj3, i4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ((C7212l) obj4).amazon(i4, obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                AbstractC4111l.yandex((C9894l) obj4, (InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(1), i4);
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((Integer) obj2).getClass();
                AbstractC4111l.purchase((C6417l) obj4, (InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(1), i4);
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((Integer) obj2).getClass();
                ((C6111l) obj4).m1947l((InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(i4 | 1));
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C12418l c12418l = (C12418l) obj4;
                final SmallPlayerGlanceConfigurationActivity smallPlayerGlanceConfigurationActivity = (SmallPlayerGlanceConfigurationActivity) obj3;
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i5 = SmallPlayerGlanceConfigurationActivity.f36845l;
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zAdmob = c6956l3.admob(smallPlayerGlanceConfigurationActivity) | c6956l3.amazon(i4);
                    Object objM2132native2 = c6956l3.m2132native();
                    if (zAdmob || objM2132native2 == c13863l) {
                        final int i6 = z ? 1 : 0;
                        objM2132native2 = new Function0() { // from class: lِْۚ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i7 = i6;
                                int i8 = i4;
                                SmallPlayerGlanceConfigurationActivity smallPlayerGlanceConfigurationActivity2 = smallPlayerGlanceConfigurationActivity;
                                switch (i7) {
                                    case 0:
                                        int i9 = SmallPlayerGlanceConfigurationActivity.f36845l;
                                        smallPlayerGlanceConfigurationActivity2.setResult(-1, new Intent().putExtra("appWidgetId", i8));
                                        smallPlayerGlanceConfigurationActivity2.finish();
                                        break;
                                    default:
                                        int i10 = SmallPlayerGlanceConfigurationActivity.f36845l;
                                        smallPlayerGlanceConfigurationActivity2.setResult(-1, new Intent().putExtra("appWidgetId", i8));
                                        smallPlayerGlanceConfigurationActivity2.finish();
                                        AbstractC10999l.mopub(C1732l.f4136l, null, 0, new C6658l(smallPlayerGlanceConfigurationActivity2, i8, (InterfaceC14029l) null), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l3.m2147try(objM2132native2);
                    }
                    Function0 function0 = (Function0) objM2132native2;
                    boolean zAdmob2 = c6956l3.admob(smallPlayerGlanceConfigurationActivity) | c6956l3.amazon(i4);
                    Object objM2132native3 = c6956l3.m2132native();
                    if (zAdmob2 || objM2132native3 == c13863l) {
                        objM2132native3 = new Function0() { // from class: lِْۚ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i7 = i3;
                                int i8 = i4;
                                SmallPlayerGlanceConfigurationActivity smallPlayerGlanceConfigurationActivity2 = smallPlayerGlanceConfigurationActivity;
                                switch (i7) {
                                    case 0:
                                        int i9 = SmallPlayerGlanceConfigurationActivity.f36845l;
                                        smallPlayerGlanceConfigurationActivity2.setResult(-1, new Intent().putExtra("appWidgetId", i8));
                                        smallPlayerGlanceConfigurationActivity2.finish();
                                        break;
                                    default:
                                        int i10 = SmallPlayerGlanceConfigurationActivity.f36845l;
                                        smallPlayerGlanceConfigurationActivity2.setResult(-1, new Intent().putExtra("appWidgetId", i8));
                                        smallPlayerGlanceConfigurationActivity2.finish();
                                        AbstractC10999l.mopub(C1732l.f4136l, null, 0, new C6658l(smallPlayerGlanceConfigurationActivity2, i8, (InterfaceC14029l) null), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l3.m2147try(objM2132native3);
                    }
                    AbstractC6689l.loadAd(c12418l, function0, (Function0) objM2132native3, c6956l3, 0);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 20:
                ((Integer) obj2).intValue();
                AbstractC15918l.loadAd((Function0) obj4, (C0247l) obj3, (C6956l) obj, AbstractC0545l.purchase(i4 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                AbstractC8853l.yandex(i4, (String) obj4, (Function0) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 22:
                ((Integer) obj2).intValue();
                AbstractC4447l.yandex((Catalog2Button) obj4, (Function0) obj3, (C6956l) obj, AbstractC0545l.purchase(i4 | 1));
                break;
            case 23:
                ((Integer) obj2).intValue();
                ((C18656l) obj4).yandex(obj3, (C6956l) obj, AbstractC0545l.purchase(i4 | 1));
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C2603l c2603l = (C2603l) obj4;
                InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) obj3;
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    EnumC13633l enumC13633l = (EnumC13633l) c2603l.f5664l.getValue();
                    boolean zAmazon2 = c6956l4.amazon(i4);
                    Object objM2132native4 = c6956l4.m2132native();
                    if (zAmazon2 || objM2132native4 == c13863l) {
                        objM2132native4 = new C4119l(i4, i2);
                        c6956l4.m2147try(objM2132native4);
                    }
                    AbstractC7741l.loadAd(enumC13633l, null, (Function1) objM2132native4, null, "", null, AbstractC14566l.amazon(170828686, new C11050l(c2603l, interfaceC2262l2, 8), c6956l4), c6956l4, 1597440, 42);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((Integer) obj2).intValue();
                AbstractC2648l.yandex((Catalog2Banner) obj4, (Function0) obj3, (C6956l) obj, AbstractC0545l.purchase(i4 | 1));
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((Integer) obj2).getClass();
                AbstractC7876l.yandex((C0764l) obj4, (C15578l) obj3, (C6956l) obj, AbstractC0545l.purchase(49), i4);
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((Integer) obj2).getClass();
                AbstractC9843l.crashlytics((C8311l) obj4, (Function0) obj3, (C6956l) obj, AbstractC0545l.purchase(i4 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                AbstractC7370l.loadAd((Function0) obj4, (Function0) obj3, (C6956l) obj, AbstractC0545l.purchase(i4 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C0741l(InterfaceC17242l interfaceC17242l, Function1 function1, int i) {
        this.f2237l = 2;
        this.f2238l = interfaceC17242l;
        this.f2235l = function1;
        this.f2236l = i;
    }

    public /* synthetic */ C0741l(C17284l c17284l, String str, int i, int i2) {
        this.f2237l = 14;
        this.f2235l = c17284l;
        this.f2238l = str;
        this.f2236l = i;
    }

    public /* synthetic */ C0741l(Object obj, int i, Object obj2, int i2) {
        this.f2237l = i2;
        this.f2235l = obj;
        this.f2236l = i;
        this.f2238l = obj2;
    }

    public /* synthetic */ C0741l(Object obj, int i, Object obj2, int i2, int i3) {
        this.f2237l = i3;
        this.f2235l = obj;
        this.f2236l = i;
        this.f2238l = obj2;
    }

    public /* synthetic */ C0741l(Object obj, Object obj2, int i, int i2) {
        this.f2237l = i2;
        this.f2235l = obj;
        this.f2238l = obj2;
        this.f2236l = i;
    }

    public /* synthetic */ C0741l(Object obj, Object obj2, int i, int i2, int i3) {
        this.f2237l = i3;
        this.f2235l = obj;
        this.f2238l = obj2;
        this.f2236l = i2;
    }
}

package defpackage;

import android.os.Build;
import android.view.SoundEffectConstants;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaTag;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lُؒٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0976l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f2690l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2691l;

    public /* synthetic */ C0976l(int i, Object obj) {
        this.f2691l = i;
        this.f2690l = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4 = this.f2691l;
        Object obj3 = this.f2690l;
        switch (i4) {
            case 0:
                int i5 = ((C3475l) obj).yandex;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Integer numCrashlytics = AbstractC17194l.crashlytics(i5);
                if (numCrashlytics != null) {
                    int iIntValue = numCrashlytics.intValue();
                    ((ViewTreeObserverOnGlobalLayoutListenerC13840l) obj3).playSoundEffect(Build.VERSION.SDK_INT >= 31 ? C7153l.yandex.yandex(iIntValue, zBooleanValue) : SoundEffectConstants.getContantForFocusDirection(iIntValue));
                }
                return Unit.INSTANCE;
            case 1:
                C6956l c6956l = (C6956l) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (c6956l.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC13010l.loadAd(((EnumC6358l) obj3).f13326l, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 2:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (c6956l2.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC13010l.loadAd(((MainArtist) obj3).crashlytics, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 3:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (c6956l3.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, ((EnumC0442l) obj3).f1620l), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            case 4:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (c6956l4.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    int iOrdinal = ((EnumC3503l) obj3).ordinal();
                    if (iOrdinal == 0) {
                        i = R.string.widgets_settings_background_blurred;
                    } else if (iOrdinal == 1) {
                        i = R.string.widgets_settings_background_vibrant;
                    } else if (iOrdinal == 2) {
                        i = R.string.widgets_settings_background_solid_white;
                    } else if (iOrdinal == 3) {
                        i = R.string.widgets_settings_background_solid_dark;
                    } else {
                        if (iOrdinal != 4) {
                            C18725l.billing();
                            return null;
                        }
                        i = R.string.widgets_settings_background_solid_black;
                    }
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l4, i), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            case 5:
                String str = (String) obj;
                AbstractC9694l abstractC9694l = (AbstractC9694l) obj3;
                C16076l c16076l = VKXApplication.f36632l;
                if (c16076l == null) {
                    c16076l = null;
                }
                InterfaceC17817l interfaceC17817l = c16076l.f31521l.amazon;
                C3086l c3086l = interfaceC17817l instanceof C3086l ? (C3086l) interfaceC17817l : null;
                Map map = c3086l != null ? c3086l.crashlytics : null;
                if (map == null) {
                    map = C14054l.f27396l;
                }
                new C17517l(str, map).Signature(abstractC9694l.isVip());
                return Unit.INSTANCE;
            case 6:
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (c6956l5.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    EnumC10468l enumC10468l = (EnumC10468l) obj3;
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36040l, c6956l5, 54);
                    long j = c6956l5.f14595continue;
                    int i6 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l5.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l5, C4346l.f8873l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l5.m2140super();
                    if (c6956l5.f14603switch) {
                        c6956l5.firebase(c16395l);
                    } else {
                        c6956l5.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l5, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l5, Integer.valueOf(i6), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l5, C3438l.firebase);
                    AbstractC8182l.billing(c6956l5, interfaceC17242lBilling, C3438l.amazon);
                    int iOrdinal2 = enumC10468l.ordinal();
                    if (iOrdinal2 == 0) {
                        i2 = R.string.settings_now_playing_background_theme_blur;
                    } else if (iOrdinal2 == 1) {
                        i2 = R.string.settings_now_playing_background_theme_no_bg;
                    } else if (iOrdinal2 == 2) {
                        i2 = R.string.settings_now_playing_background_theme_gradient;
                    } else if (iOrdinal2 == 3) {
                        i2 = R.string.settings_now_playing_background_theme_beyond;
                    } else {
                        if (iOrdinal2 != 4) {
                            C18725l.billing();
                            return null;
                        }
                        i2 = R.string.settings_now_playing_background_theme_layer;
                    }
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l5, i2), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l5, 0, 0, 262142);
                    if (enumC10468l == EnumC10468l.BEYOND_BACKGROUND || enumC10468l == EnumC10468l.IOS_LAYER_VIEW) {
                        c6956l5.m2123default(1627020380);
                        C10707l c10707l = AbstractC16964l.yandex;
                        AbstractC11621l.loadAd(null, ((C14370l) c6956l5.isPro(c10707l)).yandex.yandex, ((C14370l) c6956l5.isPro(c10707l)).yandex.loadAd, AbstractC8317l.purchase, c6956l5, 3072);
                    } else {
                        c6956l5.m2123default(1613739887);
                    }
                    c6956l5.startapp(false);
                    c6956l5.startapp(true);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
            case 7:
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (c6956l6.m2127for(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    int iOrdinal3 = ((EnumC0972l) obj3).ordinal();
                    if (iOrdinal3 == 0) {
                        i3 = R.string.settings_now_playing_blur_thickness_0;
                    } else if (iOrdinal3 == 1) {
                        i3 = R.string.settings_now_playing_blur_thickness_1;
                    } else if (iOrdinal3 == 2) {
                        i3 = R.string.settings_now_playing_blur_thickness_2;
                    } else if (iOrdinal3 == 3) {
                        i3 = R.string.settings_now_playing_blur_thickness_3;
                    } else if (iOrdinal3 == 4) {
                        i3 = R.string.settings_now_playing_blur_thickness_4;
                    } else {
                        if (iOrdinal3 != 5) {
                            C18725l.billing();
                            return null;
                        }
                        i3 = R.string.settings_now_playing_blur_thickness_5;
                    }
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l6, i3), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l6, 0, 0, 262142);
                } else {
                    c6956l6.m2124else();
                }
                return Unit.INSTANCE;
            case 8:
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                C1682l c1682l = (C1682l) obj3;
                if (c6956l7.m2127for(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    AbstractC13010l.loadAd(c1682l.f4050l + ':' + c1682l.f4045l, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, c6956l7, 0, 24576, 245758);
                } else {
                    c6956l7.m2124else();
                }
                return Unit.INSTANCE;
            case 9:
                C6956l c6956l8 = (C6956l) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (c6956l8.m2127for(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l8, ((EnumC9736l) obj3).f19867l), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l8, 0, 0, 262142);
                } else {
                    c6956l8.m2124else();
                }
                return Unit.INSTANCE;
            case 10:
                C6956l c6956l9 = (C6956l) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (c6956l9.m2127for(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    AbstractC13010l.loadAd(((UmaTag) obj3).yandex, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l9, 0, 0, 262142);
                } else {
                    c6956l9.m2124else();
                }
                return Unit.INSTANCE;
            default:
                C6956l c6956l10 = (C6956l) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                if (c6956l10.m2127for(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ((C6473l) obj3).m2017import(3072, ((C14370l) c6956l10.isPro(AbstractC16964l.yandex)).yandex.subscription, c6956l10, null);
                } else {
                    c6956l10.m2124else();
                }
                return Unit.INSTANCE;
        }
    }
}

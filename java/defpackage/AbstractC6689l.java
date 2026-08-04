package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؙۗ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6689l {
    public static final C9138l[] amazon;
    public static final C9138l crashlytics;
    public static final C9138l loadAd;
    public static final C16305l yandex = new C16305l();

    static {
        C9138l c9138l = new C9138l(-1, 1L, "CLIENT_TELEMETRY", true);
        loadAd = c9138l;
        C9138l c9138l2 = new C9138l(-1, 1L, "CLIENT_NOTIFICATION_TELEMETRY", true);
        crashlytics = c9138l2;
        amazon = new C9138l[]{c9138l, c9138l2};
    }

    public static C13437l admob(AbstractC10170l abstractC10170l) {
        if (abstractC10170l == null) {
            yandex(26);
            throw null;
        }
        InterfaceC11865l interfaceC11865lCrashlytics = AbstractC11125l.crashlytics(abstractC10170l);
        InterfaceC17477l interfaceC17477lAmazon = AbstractC9033l.amazon(interfaceC11865lCrashlytics, C18098l.ad);
        if (interfaceC17477lAmazon == null) {
            return null;
        }
        C3199l c3199l = C2782l.f6058l;
        C6561l c6561l = AbstractC6004l.purchase;
        C13437l c13437lM3642l = C13437l.m3642l(abstractC10170l, 1, false, AbstractC3974l.loadAd, 4, abstractC10170l.billing());
        C11425l c11425l = new C11425l(c13437lM3642l, c3199l, 1, c6561l, false, false, false, 4, null, abstractC10170l.billing());
        c13437lM3642l.m3647l(c11425l, null, null, null);
        C16017l.f31395l.getClass();
        AbstractC15211l abstractC15211lAds = AbstractC3605l.ads(C16017l.f31394l, interfaceC17477lAmazon.metrica(), Collections.singletonList(new C10636l(1, abstractC10170l.ad())), false);
        List list = Collections.EMPTY_LIST;
        c13437lM3642l.m3646l(abstractC15211lAds, list, null, null, list);
        c11425l.m3086l(c13437lM3642l.smaato());
        return c13437lM3642l;
    }

    public static int amazon(int i, int i2) {
        return AbstractC14093l.subs(i, (Color.alpha(i) * i2) / 255);
    }

    public static C11425l billing(InterfaceC10696l interfaceC10696l, InterfaceC3841l interfaceC3841l) {
        return smaato(interfaceC10696l, interfaceC3841l, true, interfaceC10696l.billing());
    }

    public static final void crashlytics(C4910l c4910l, AbstractC5563l abstractC5563l) {
        if (AbstractC17082l.subs(C2972l.f6458l, c4910l, abstractC5563l) != EnumC9342l.f19165l) {
            AbstractC17082l.billing(abstractC5563l).subs(Unit.INSTANCE);
        }
    }

    public static C7073l firebase(InterfaceC11661l interfaceC11661l, AbstractC18041l abstractC18041l, InterfaceC3841l interfaceC3841l) {
        if (abstractC18041l == null) {
            return null;
        }
        return new C7073l(interfaceC11661l, new C17630l(interfaceC11661l, abstractC18041l), interfaceC3841l);
    }

    public static C17134l isPro(AbstractC10170l abstractC10170l) {
        if (abstractC10170l == null) {
            yandex(22);
            throw null;
        }
        C17134l c17134lM4263l = C17134l.m4263l(abstractC10170l, AbstractC3974l.yandex, 4, abstractC10170l.billing());
        List list = Collections.EMPTY_LIST;
        return c17134lM4263l.mo2896l(null, null, list, list, list, AbstractC3759l.purchase(abstractC10170l).subs(abstractC10170l.ad()), 1, AbstractC6004l.purchase);
    }

    public static final void loadAd(C12418l c12418l, Function0 function0, Function0 function1, C6956l c6956l, int i) {
        c6956l.m2133new(360045889);
        int i2 = (c6956l.admob(c12418l) ? 4 : 2) | i | (c6956l.admob(function0) ? 32 : 16) | (c6956l.admob(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            Unit unit = Unit.INSTANCE;
            boolean zAdmob = c6956l.admob(c12418l);
            Object objM2132native = c6956l.m2132native();
            InterfaceC14029l interfaceC14029l = null;
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C17972l(c12418l, interfaceC14029l, 18);
                c6956l.m2147try(objM2132native);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native);
            AbstractC7876l.yandex(null, AbstractC14566l.amazon(216292813, new C9068l(function0, function1, c12418l), c6956l), c6956l, 48, 1);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9068l(c12418l, function0, function1, i);
        }
    }

    public static int metrica(View view, int i) {
        Context context = view.getContext();
        Context context2 = view.getContext();
        String canonicalName = view.getClass().getCanonicalName();
        TypedValue typedValueMopub = AbstractC17463l.mopub(context2, i);
        if (typedValueMopub != null) {
            int i2 = typedValueMopub.resourceId;
            return i2 != 0 ? context.getColor(i2) : typedValueMopub.data;
        }
        C18073l.adcel("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{canonicalName, context2.getResources().getResourceName(i)});
        return 0;
    }

    public static C1710l mopub(InterfaceC10696l interfaceC10696l, InterfaceC3841l interfaceC3841l) {
        C3199l c3199l = C2782l.f6058l;
        InterfaceC5706l interfaceC5706lBilling = interfaceC10696l.billing();
        if (interfaceC5706lBilling != null) {
            return remoteconfig(interfaceC10696l, interfaceC3841l, c3199l, true, interfaceC10696l.admob(), interfaceC5706lBilling);
        }
        yandex(6);
        throw null;
    }

    public static C7073l purchase(InterfaceC11661l interfaceC11661l, AbstractC18041l abstractC18041l, C3498l c3498l, InterfaceC3841l interfaceC3841l, int i) {
        if (interfaceC11661l == null) {
            yandex(32);
            throw null;
        }
        if (interfaceC3841l == null) {
            yandex(33);
            throw null;
        }
        if (abstractC18041l == null) {
            return null;
        }
        C6653l c6653l = new C6653l(interfaceC11661l, abstractC18041l, c3498l, 1);
        C11155l c11155l = AbstractC3583l.yandex;
        return new C7073l(interfaceC11661l, c6653l, interfaceC3841l, C3498l.purchase(AbstractC3583l.loadAd + '_' + i));
    }

    public static C1710l remoteconfig(InterfaceC10696l interfaceC10696l, InterfaceC3841l interfaceC3841l, InterfaceC3841l interfaceC3841l2, boolean z, C6561l c6561l, InterfaceC5706l interfaceC5706l) {
        if (interfaceC3841l == null) {
            yandex(8);
            throw null;
        }
        if (interfaceC3841l2 == null) {
            yandex(9);
            throw null;
        }
        if (c6561l == null) {
            yandex(10);
            throw null;
        }
        if (interfaceC5706l == null) {
            yandex(11);
            throw null;
        }
        C1710l c1710l = new C1710l(interfaceC10696l, interfaceC3841l, interfaceC10696l.startapp(), c6561l, z, false, false, 1, null, interfaceC5706l);
        c1710l.f4098l = C1710l.m1005l(c1710l, interfaceC10696l.yandex(), interfaceC3841l2);
        return c1710l;
    }

    public static C11425l smaato(InterfaceC10696l interfaceC10696l, InterfaceC3841l interfaceC3841l, boolean z, InterfaceC5706l interfaceC5706l) {
        if (interfaceC3841l == null) {
            yandex(18);
            throw null;
        }
        if (interfaceC5706l != null) {
            return new C11425l(interfaceC10696l, interfaceC3841l, interfaceC10696l.startapp(), interfaceC10696l.admob(), z, false, false, 1, null, interfaceC5706l);
        }
        yandex(19);
        throw null;
    }

    public static int startapp(int i, float f, int i2) {
        return AbstractC14093l.mopub(AbstractC14093l.subs(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static C17134l subs(AbstractC10170l abstractC10170l) {
        if (abstractC10170l == null) {
            yandex(24);
            throw null;
        }
        C3199l c3199l = C2782l.f6058l;
        C17134l c17134lM4263l = C17134l.m4263l(abstractC10170l, AbstractC3974l.crashlytics, 4, abstractC10170l.billing());
        C17538l c17538l = new C17538l(c17134lM4263l, null, 0, c3199l, C3498l.purchase("value"), AbstractC3759l.purchase(abstractC10170l).Signature(), false, false, false, null, abstractC10170l.billing());
        List list = Collections.EMPTY_LIST;
        return c17134lM4263l.mo2896l(null, null, list, list, Collections.singletonList(c17538l), abstractC10170l.ad(), 1, AbstractC6004l.purchase);
    }

    public static int vip(Context context, int i, int i2) {
        Integer numValueOf;
        TypedValue typedValueMopub = AbstractC17463l.mopub(context, i);
        if (typedValueMopub != null) {
            int i3 = typedValueMopub.resourceId;
            numValueOf = Integer.valueOf(i3 != 0 ? context.getColor(i3) : typedValueMopub.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i2;
    }

    public static /* synthetic */ void yandex(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case 31:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                objArr[0] = "enumClass";
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                objArr[2] = "isEnumValuesMethod";
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }
}

package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِٞؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12008l {
    public static final C14487l yandex = C8741l.loadAd(EnumC5123l.f11143l, new String[0]);
    public static final C14487l loadAd = C8741l.loadAd(EnumC5123l.f11145l, new String[0]);
    public static final C16560l crashlytics = new C16560l("NO_EXPECTED_TYPE");
    public static final C16560l amazon = new C16560l("UNIT_EXPECTED_TYPE");

    public static AbstractC18041l admob(AbstractC18041l abstractC18041l, boolean z) {
        if (abstractC18041l != null) {
            return z ? mopub(abstractC18041l, true) : abstractC18041l;
        }
        yandex(8);
        throw null;
    }

    public static List amazon(List list) {
        if (list == null) {
            yandex(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C10636l(((InterfaceC16902l) it.next()).ad()));
        }
        return AbstractC16901l.m4213const(arrayList);
    }

    public static boolean billing(AbstractC18041l abstractC18041l) {
        if (abstractC18041l == null) {
            yandex(60);
            throw null;
        }
        if ((abstractC18041l.mo1339native().pro() instanceof InterfaceC16902l ? (InterfaceC16902l) abstractC18041l.mo1339native().pro() : null) != null) {
            return true;
        }
        abstractC18041l.mo1339native();
        return false;
    }

    public static boolean crashlytics(AbstractC18041l abstractC18041l, Function1 function1, C4853l c4853l) {
        if (abstractC18041l == null) {
            return false;
        }
        AbstractC14318l abstractC14318lMo3847class = abstractC18041l.mo3847class();
        if (smaato(abstractC18041l)) {
            return ((Boolean) function1.invoke(abstractC14318lMo3847class)).booleanValue();
        }
        if (c4853l != null && c4853l.contains(abstractC18041l)) {
            return false;
        }
        if (((Boolean) function1.invoke(abstractC14318lMo3847class)).booleanValue()) {
            return true;
        }
        if (c4853l == null) {
            int i = C4853l.f9907l;
            c4853l = AbstractC11621l.crashlytics();
        }
        c4853l.add(abstractC18041l);
        AbstractC4317l abstractC4317l = abstractC14318lMo3847class instanceof AbstractC4317l ? (AbstractC4317l) abstractC14318lMo3847class : null;
        if (abstractC4317l != null && (crashlytics(abstractC4317l.f8857l, function1, c4853l) || crashlytics(abstractC4317l.f8856l, function1, c4853l))) {
            return true;
        }
        if ((abstractC14318lMo3847class instanceof C15110l) && crashlytics(((C15110l) abstractC14318lMo3847class).f29644l, function1, c4853l)) {
            return true;
        }
        InterfaceC1925l interfaceC1925lMo1339native = abstractC18041l.mo1339native();
        if (interfaceC1925lMo1339native instanceof C11794l) {
            Iterator it = ((C11794l) interfaceC1925lMo1339native).f23607l.iterator();
            while (it.hasNext()) {
                if (crashlytics((AbstractC18041l) it.next(), function1, c4853l)) {
                    return true;
                }
            }
            return false;
        }
        for (AbstractC4946l abstractC4946l : abstractC18041l.inmobi()) {
            if (!abstractC4946l.crashlytics()) {
                if (crashlytics(abstractC4946l.loadAd(), function1, c4853l)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static AbstractC4946l firebase(InterfaceC16902l interfaceC16902l, C9188l c9188l) {
        if (interfaceC16902l != null) {
            return c9188l.yandex == 1 ? new C10636l(1, AbstractC3352l.purchase(interfaceC16902l)) : new C12768l(interfaceC16902l);
        }
        yandex(46);
        throw null;
    }

    public static C12768l isPro(InterfaceC16902l interfaceC16902l) {
        if (interfaceC16902l != null) {
            return new C12768l(interfaceC16902l);
        }
        yandex(45);
        throw null;
    }

    public static boolean loadAd(AbstractC18041l abstractC18041l) {
        if (abstractC18041l == null) {
            yandex(28);
            throw null;
        }
        if (abstractC18041l.mo1342throw()) {
            return true;
        }
        return (abstractC18041l.mo3847class() instanceof AbstractC4317l) && loadAd(((AbstractC4317l) abstractC18041l.mo3847class()).f8856l);
    }

    public static AbstractC14318l mopub(AbstractC18041l abstractC18041l, boolean z) {
        if (abstractC18041l == null) {
            yandex(3);
            throw null;
        }
        AbstractC14318l abstractC14318lMo8static = abstractC18041l.mo3847class().mo8static(z);
        if (abstractC14318lMo8static != null) {
            return abstractC14318lMo8static;
        }
        yandex(4);
        throw null;
    }

    public static boolean purchase(AbstractC18041l abstractC18041l) throws C12948l {
        if (abstractC18041l == null) {
            yandex(27);
            throw null;
        }
        if (!abstractC18041l.mo1342throw() && (!(abstractC18041l.mo3847class() instanceof AbstractC4317l) || !purchase(((AbstractC4317l) abstractC18041l.mo3847class()).f8856l))) {
            if (!(abstractC18041l.mo3847class() instanceof C15110l)) {
                if (billing(abstractC18041l)) {
                    if (!(abstractC18041l.mo1339native().pro() instanceof InterfaceC17477l)) {
                        C2201l c2201lAmazon = C2201l.amazon(abstractC18041l);
                        Collection<AbstractC18041l> collectionYandex = abstractC18041l.mo1339native().yandex();
                        ArrayList arrayList = new ArrayList(collectionYandex.size());
                        for (AbstractC18041l abstractC18041l2 : collectionYandex) {
                            if (abstractC18041l2 == null) {
                                yandex(21);
                                throw null;
                            }
                            AbstractC18041l abstractC18041lAdmob = c2201lAmazon.admob(1, abstractC18041l2);
                            AbstractC18041l abstractC18041lAdmob2 = abstractC18041lAdmob != null ? admob(abstractC18041lAdmob, abstractC18041l.mo1342throw()) : null;
                            if (abstractC18041lAdmob2 != null) {
                                arrayList.add(abstractC18041lAdmob2);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (purchase((AbstractC18041l) it.next())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                InterfaceC1925l interfaceC1925lMo1339native = abstractC18041l.mo1339native();
                if (interfaceC1925lMo1339native instanceof C11794l) {
                    Iterator it2 = ((C11794l) interfaceC1925lMo1339native).f23607l.iterator();
                    while (it2.hasNext()) {
                        if (purchase((AbstractC18041l) it2.next())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean smaato(AbstractC18041l abstractC18041l) {
        if (abstractC18041l != null) {
            return abstractC18041l == crashlytics || abstractC18041l == amazon;
        }
        yandex(0);
        throw null;
    }

    public static AbstractC15211l subs(AbstractC15211l abstractC15211l, boolean z) {
        if (abstractC15211l == null) {
            yandex(5);
            throw null;
        }
        if (!z) {
            return abstractC15211l;
        }
        AbstractC15211l abstractC15211lMo2implements = abstractC15211l.mo8static(true);
        if (abstractC15211lMo2implements != null) {
            return abstractC15211lMo2implements;
        }
        yandex(6);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    public static /* synthetic */ void yandex(int i) {
        String str;
        int i2;
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case 23:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 30:
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            default:
                objArr[0] = "type";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                objArr[0] = "result";
                break;
            case 31:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                objArr[0] = "projections";
                break;
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                objArr[0] = "a";
                break;
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                objArr[0] = "b";
                break;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                objArr[0] = "typeParameters";
                break;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                objArr[0] = "typeParameterConstructors";
                break;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                objArr[0] = "specialType";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                objArr[0] = "isSpecialType";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                objArr[0] = "parameterDescriptor";
                break;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i == 11 || i == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i != 53) {
            if (i != 6 && i != 7) {
                switch (i) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                objArr[2] = "collectAllSupertypes";
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                objArr[2] = "getAllSupertypes";
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                objArr[2] = "isNullableType";
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                objArr[2] = "acceptsNullable";
                break;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case Maneuver.TYPE_STRAIGHT /* 36 */:
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                objArr[2] = "equalTypes";
                break;
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
            case Maneuver.TYPE_DESTINATION /* 39 */:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                objArr[2] = "contains";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                objArr[2] = "makeStarProjection";
                break;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }
}

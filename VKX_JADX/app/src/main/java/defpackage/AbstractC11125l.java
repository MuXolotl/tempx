package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: lُٙٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11125l {
    public static final /* synthetic */ int yandex = 0;

    static {
        new C2312l("kotlin.jvm.JvmName");
    }

    public static boolean adcel(InterfaceC8371l interfaceC8371l) {
        return interfaceC8371l != null && (interfaceC8371l.Signature() instanceof InterfaceC9921l);
    }

    public static InterfaceC8371l admob(InterfaceC8371l interfaceC8371l, Class cls, boolean z) {
        if (interfaceC8371l == null) {
            return null;
        }
        if (z) {
            interfaceC8371l = interfaceC8371l.Signature();
        }
        while (interfaceC8371l != null) {
            if (cls.isInstance(interfaceC8371l)) {
                return interfaceC8371l;
            }
            interfaceC8371l = interfaceC8371l.Signature();
        }
        return null;
    }

    public static InterfaceC0207l ads(InterfaceC0207l interfaceC0207l) {
        if (interfaceC0207l == null) {
            yandex(58);
            throw null;
        }
        while (interfaceC0207l.mo367while() == 2) {
            Collection collectionLicense = interfaceC0207l.license();
            if (collectionLicense.isEmpty()) {
                C11983l.ad(interfaceC0207l, "Fake override should have at least one overridden descriptor: ");
                return null;
            }
            interfaceC0207l = (InterfaceC0207l) collectionLicense.iterator().next();
        }
        return interfaceC0207l;
    }

    public static InterfaceC11865l amazon(InterfaceC8371l interfaceC8371l) {
        if (interfaceC8371l == null) {
            yandex(23);
            throw null;
        }
        while (interfaceC8371l != null) {
            if (interfaceC8371l instanceof InterfaceC11865l) {
                return (InterfaceC11865l) interfaceC8371l;
            }
            if (interfaceC8371l instanceof C10486l) {
                return ((C10486l) interfaceC8371l).f21349l;
            }
            interfaceC8371l = interfaceC8371l.Signature();
        }
        return null;
    }

    public static C16781l billing(InterfaceC8371l interfaceC8371l) {
        if (interfaceC8371l != null) {
            C2312l c2312lMopub = mopub(interfaceC8371l);
            return c2312lMopub != null ? c2312lMopub.yandex : billing(interfaceC8371l.Signature()).yandex(interfaceC8371l.getName());
        }
        yandex(2);
        throw null;
    }

    public static InterfaceC11865l crashlytics(InterfaceC8371l interfaceC8371l) {
        if (interfaceC8371l == null) {
            yandex(21);
            throw null;
        }
        InterfaceC11865l interfaceC11865lAmazon = amazon(interfaceC8371l);
        if (interfaceC11865lAmazon != null) {
            return interfaceC11865lAmazon;
        }
        yandex(22);
        throw null;
    }

    public static boolean firebase(InterfaceC8371l interfaceC8371l) {
        return smaato(interfaceC8371l, 6) && ((InterfaceC17477l) interfaceC8371l).mo757throws();
    }

    public static boolean isPro(InterfaceC8371l interfaceC8371l) {
        return smaato(interfaceC8371l, 1) && interfaceC8371l.getName().equals(AbstractC13589l.yandex);
    }

    public static void loadAd(InterfaceC11661l interfaceC11661l, LinkedHashSet linkedHashSet) {
        if (interfaceC11661l == null) {
            yandex(72);
            throw null;
        }
        if (linkedHashSet.contains(interfaceC11661l)) {
            return;
        }
        Iterator it = interfaceC11661l.mo864l().license().iterator();
        while (it.hasNext()) {
            InterfaceC11661l interfaceC11661lMo864l = ((InterfaceC11661l) it.next()).mo864l();
            loadAd(interfaceC11661lMo864l, linkedHashSet);
            linkedHashSet.add(interfaceC11661lMo864l);
        }
    }

    public static boolean metrica(InterfaceC8371l interfaceC8371l) {
        return (smaato(interfaceC8371l, 1) || smaato(interfaceC8371l, 2)) && ((InterfaceC17477l) interfaceC8371l).startapp() == 2;
    }

    public static C2312l mopub(InterfaceC8371l interfaceC8371l) {
        if (interfaceC8371l == null) {
            yandex(5);
            throw null;
        }
        if ((interfaceC8371l instanceof InterfaceC11865l) || C8741l.purchase(interfaceC8371l)) {
            return C2312l.crashlytics;
        }
        if (interfaceC8371l instanceof C10486l) {
            return ((C10486l) interfaceC8371l).f21348l;
        }
        if (interfaceC8371l instanceof InterfaceC9921l) {
            return ((AbstractC3740l) ((InterfaceC9921l) interfaceC8371l)).f7826l;
        }
        return null;
    }

    public static C18450l purchase(InterfaceC8371l interfaceC8371l) {
        C18450l c18450l = C18450l.f36038l;
        if (interfaceC8371l == null) {
            yandex(81);
            throw null;
        }
        if (interfaceC8371l instanceof C1710l) {
            interfaceC8371l = ((C1710l) interfaceC8371l).m1477l();
        }
        if (interfaceC8371l instanceof InterfaceC10233l) {
            ((InterfaceC10233l) interfaceC8371l).billing().getClass();
        }
        return c18450l;
    }

    public static boolean remoteconfig(InterfaceC8371l interfaceC8371l) {
        if (interfaceC8371l == null) {
            yandex(1);
            throw null;
        }
        while (interfaceC8371l != null) {
            if (isPro(interfaceC8371l) || ((interfaceC8371l instanceof InterfaceC10389l) && ((InterfaceC10389l) interfaceC8371l).admob() == AbstractC6004l.billing)) {
                return true;
            }
            interfaceC8371l = interfaceC8371l.Signature();
        }
        return false;
    }

    public static boolean smaato(InterfaceC8371l interfaceC8371l, int i) {
        if (i != 0) {
            return (interfaceC8371l instanceof InterfaceC17477l) && ((InterfaceC17477l) interfaceC8371l).mo752l() == i;
        }
        yandex(37);
        throw null;
    }

    public static boolean startapp(AbstractC18041l abstractC18041l, InterfaceC8371l interfaceC8371l) {
        if (abstractC18041l == null) {
            yandex(32);
            throw null;
        }
        if (interfaceC8371l == null) {
            yandex(33);
            throw null;
        }
        if (vip(abstractC18041l, interfaceC8371l)) {
            return true;
        }
        Iterator it = abstractC18041l.mo1339native().yandex().iterator();
        while (it.hasNext()) {
            if (startapp((AbstractC18041l) it.next(), interfaceC8371l)) {
                return true;
            }
        }
        return false;
    }

    public static InterfaceC17477l subs(InterfaceC17477l interfaceC17477l) {
        if (interfaceC17477l == null) {
            yandex(44);
            throw null;
        }
        for (AbstractC18041l abstractC18041l : interfaceC17477l.metrica().yandex()) {
            if (abstractC18041l == null) {
                yandex(45);
                throw null;
            }
            InterfaceC1925l interfaceC1925lMo1339native = abstractC18041l.mo1339native();
            if (interfaceC1925lMo1339native == null) {
                yandex(46);
                throw null;
            }
            InterfaceC17477l interfaceC17477l2 = (InterfaceC17477l) interfaceC1925lMo1339native.pro();
            if (interfaceC17477l2 == null) {
                yandex(47);
                throw null;
            }
            if (interfaceC17477l2.mo752l() != 2) {
                return interfaceC17477l2;
            }
        }
        return null;
    }

    public static boolean vip(AbstractC18041l abstractC18041l, InterfaceC8371l interfaceC8371l) {
        if (abstractC18041l == null) {
            yandex(30);
            throw null;
        }
        if (interfaceC8371l == null) {
            yandex(31);
            throw null;
        }
        InterfaceC15234l interfaceC15234lPro = abstractC18041l.mo1339native().pro();
        if (interfaceC15234lPro == null) {
            return false;
        }
        InterfaceC8371l interfaceC8371lMo864l = interfaceC15234lPro.mo864l();
        return (interfaceC8371lMo864l instanceof InterfaceC15234l) && (interfaceC8371l instanceof InterfaceC15234l) && ((InterfaceC15234l) interfaceC8371l).metrica().equals(((InterfaceC15234l) interfaceC8371lMo864l).metrica());
    }

    public static /* synthetic */ void yandex(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
            case Maneuver.TYPE_STRAIGHT /* 36 */:
            case 57:
            case 58:
            case 60:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[0] = "second";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                objArr[0] = "declarationDescriptor";
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                objArr[0] = "subClass";
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
            case 66:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                objArr[0] = "classKind";
                break;
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
            case Maneuver.TYPE_DESTINATION /* 39 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
            case 48:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                objArr[1] = "getSuperClassType";
                break;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[2] = "areInSameModule";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                objArr[2] = "getContainingClass";
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                objArr[2] = "isAncestor";
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                objArr[2] = "isDirectSubclass";
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                objArr[2] = "isSubtypeOfClass";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                objArr[2] = "isAnonymousObject";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                objArr[2] = "isAnonymousFunction";
                break;
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                objArr[2] = "isEnumEntry";
                break;
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                objArr[2] = "isKindOf";
                break;
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                objArr[2] = "hasAbstractMembers";
                break;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                objArr[2] = "getSuperClassType";
                break;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                objArr[2] = "getClassDescriptorForType";
                break;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }
}

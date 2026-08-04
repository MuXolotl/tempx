package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lٗؓٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16860l {
    public static final C3498l purchase = C3498l.mopub("<built-ins module>");
    public final C16412l amazon;
    public final C0098l crashlytics;
    public final C2278l loadAd;
    public C10202l yandex;

    public AbstractC16860l(C16412l c16412l) {
        this.amazon = c16412l;
        c16412l.yandex(new C14721l(this, 0));
        int i = 1;
        this.loadAd = new C2278l(c16412l, new C14721l(this, i));
        this.crashlytics = c16412l.loadAd(new C15116l(this, i));
    }

    public static boolean ad(AbstractC18041l abstractC18041l) {
        if (abstractC18041l != null) {
            return signatures(abstractC18041l, AbstractC3333l.yandex);
        }
        yandex(139);
        throw null;
    }

    public static EnumC15893l ads(InterfaceC15234l interfaceC15234l) {
        if (interfaceC15234l == null) {
            yandex(77);
            throw null;
        }
        if (AbstractC3333l.f7094instanceof.contains(interfaceC15234l.getName())) {
            return (EnumC15893l) AbstractC3333l.f7090finally.get(AbstractC11125l.billing(interfaceC15234l));
        }
        return null;
    }

    public static boolean advert(AbstractC18041l abstractC18041l) {
        if (abstractC18041l != null) {
            return signatures(abstractC18041l, AbstractC3333l.mopub);
        }
        yandex(88);
        throw null;
    }

    public static boolean applovin(InterfaceC4884l interfaceC4884l) {
        if (interfaceC4884l.mo864l().getAnnotations().isPro(AbstractC3333l.remoteconfig)) {
            return true;
        }
        if (!(interfaceC4884l instanceof InterfaceC10696l)) {
            return false;
        }
        InterfaceC10696l interfaceC10696l = (InterfaceC10696l) interfaceC4884l;
        boolean zMo3250const = interfaceC10696l.mo3250const();
        C11425l c11425lCrashlytics = interfaceC10696l.crashlytics();
        C1710l c1710lAmazon = interfaceC10696l.amazon();
        if (c11425lCrashlytics == null || !applovin(c11425lCrashlytics)) {
            return false;
        }
        if (zMo3250const) {
            return c1710lAmazon != null && applovin(c1710lAmazon);
        }
        return true;
    }

    public static boolean appmetrica(AbstractC18041l abstractC18041l, C16781l c16781l) {
        if (abstractC18041l == null) {
            yandex(105);
            throw null;
        }
        if (c16781l != null) {
            return !abstractC18041l.mo1342throw() && signatures(abstractC18041l, c16781l);
        }
        yandex(106);
        throw null;
    }

    public static boolean inmobi(AbstractC18041l abstractC18041l) {
        if (abstractC18041l != null) {
            return signatures(abstractC18041l, AbstractC3333l.loadAd) && !AbstractC12008l.purchase(abstractC18041l);
        }
        yandex(136);
        throw null;
    }

    public static boolean isVip(InterfaceC8371l interfaceC8371l) {
        if (interfaceC8371l != null) {
            return AbstractC11125l.admob(interfaceC8371l, C8913l.class, false) != null;
        }
        yandex(9);
        throw null;
    }

    public static boolean loadAd(InterfaceC17477l interfaceC17477l, C16781l c16781l) {
        if (interfaceC17477l == null) {
            yandex(103);
            throw null;
        }
        if (c16781l != null) {
            return interfaceC17477l.getName().equals(c16781l.mopub()) && c16781l.equals(AbstractC11125l.billing(interfaceC17477l));
        }
        yandex(104);
        throw null;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static boolean m4204package(AbstractC18041l abstractC18041l) {
        return appmetrica(abstractC18041l, AbstractC3333l.billing);
    }

    public static boolean premium(AbstractC18041l abstractC18041l, C16781l c16781l) {
        if (c16781l != null) {
            return signatures(abstractC18041l, c16781l) && !abstractC18041l.mo1342throw();
        }
        yandex(135);
        throw null;
    }

    public static boolean signatures(AbstractC18041l abstractC18041l, C16781l c16781l) {
        if (abstractC18041l == null) {
            yandex(97);
            throw null;
        }
        if (c16781l != null) {
            return m4206synchronized(abstractC18041l.mo1339native(), c16781l);
        }
        yandex(98);
        throw null;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static boolean m4205strictfp(InterfaceC15234l interfaceC15234l) {
        if (interfaceC15234l == null) {
            yandex(10);
            throw null;
        }
        for (InterfaceC8371l interfaceC8371lSignature = interfaceC15234l; interfaceC8371lSignature != null; interfaceC8371lSignature = interfaceC8371lSignature.Signature()) {
            if (interfaceC8371lSignature instanceof InterfaceC9921l) {
                C2312l c2312l = ((AbstractC3740l) ((InterfaceC9921l) interfaceC8371lSignature)).f7826l;
                return c2312l.yandex.admob(AbstractC3974l.isPro);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static boolean m4206synchronized(InterfaceC1925l interfaceC1925l, C16781l c16781l) {
        if (interfaceC1925l == null) {
            yandex(EnergyProfile.EVCONNECTOR_TYPE_OTHER);
            throw null;
        }
        if (c16781l != null) {
            InterfaceC15234l interfaceC15234lPro = interfaceC1925l.pro();
            return (interfaceC15234lPro instanceof InterfaceC17477l) && loadAd((InterfaceC17477l) interfaceC15234lPro, c16781l);
        }
        yandex(102);
        throw null;
    }

    public static EnumC15893l tapsense(InterfaceC17477l interfaceC17477l) {
        if (interfaceC17477l == null) {
            yandex(76);
            throw null;
        }
        if (AbstractC3333l.f7081abstract.contains(interfaceC17477l.getName())) {
            return (EnumC15893l) AbstractC3333l.f7100public.get(AbstractC11125l.billing(interfaceC17477l));
        }
        return null;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static boolean m4207throws(AbstractC18041l abstractC18041l) {
        if (abstractC18041l == null) {
            yandex(94);
            throw null;
        }
        if (abstractC18041l.mo1342throw()) {
            return false;
        }
        InterfaceC15234l interfaceC15234lPro = abstractC18041l.mo1339native().pro();
        return (interfaceC15234lPro instanceof InterfaceC17477l) && tapsense((InterfaceC17477l) interfaceC15234lPro) != null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    public static /* synthetic */ void yandex(int i) {
        String str;
        int i2;
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                                        case 65:
                                        case 66:
                                        case 67:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 48:
                                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                case 51:
                                case 52:
                                case 53:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        case Maneuver.TYPE_FORK_LEFT /* 25 */:
                        case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                        case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                        case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        case 30:
                        case 31:
                        case 32:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                        case Maneuver.TYPE_STRAIGHT /* 36 */:
                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                        case Maneuver.TYPE_DESTINATION /* 39 */:
                        case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                        case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        case Maneuver.TYPE_FORK_LEFT /* 25 */:
                        case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                        case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                        case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        case 30:
                        case 31:
                        case 32:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                        case Maneuver.TYPE_STRAIGHT /* 36 */:
                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                        case Maneuver.TYPE_DESTINATION /* 39 */:
                        case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                        case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 48:
                                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                case 51:
                                case 52:
                                case 53:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                                        case 65:
                                        case 66:
                                        case 67:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 30:
            case 31:
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
            case Maneuver.TYPE_STRAIGHT /* 36 */:
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
            case Maneuver.TYPE_DESTINATION /* 39 */:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
            case 48:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case 54:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 161:
                objArr[0] = "type";
                break;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                objArr[0] = "classSimpleName";
                break;
            case 68:
            case 70:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                objArr[0] = "annotations";
                break;
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 160:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 11) {
            objArr[1] = "getBuiltInsPackageScope";
        } else if (i == 13) {
            objArr[1] = "getBuiltInClassByFqName";
        } else if (i == 15) {
            objArr[1] = "getBuiltInClassByName";
        } else if (i == 69) {
            objArr[1] = "getArrayElementType";
        } else if (i == 74) {
            objArr[1] = "getPrimitiveArrayKotlinType";
        } else if (i == 81 || i == 84) {
            objArr[1] = "getArrayType";
        } else if (i == 86) {
            objArr[1] = "getEnumType";
        } else if (i != 87) {
            switch (i) {
                case 3:
                    objArr[1] = "getAdditionalClassPartsProvider";
                    break;
                case 4:
                    objArr[1] = "getPlatformDependentDeclarationFilter";
                    break;
                case 5:
                    objArr[1] = "getClassDescriptorFactories";
                    break;
                case 6:
                    objArr[1] = "getStorageManager";
                    break;
                case 7:
                    objArr[1] = "getBuiltInsModule";
                    break;
                case 8:
                    objArr[1] = "getBuiltInPackagesImportedByDefault";
                    break;
                default:
                    switch (i) {
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            objArr[1] = "getSuspendFunction";
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            objArr[1] = "getKFunction";
                            break;
                        case 20:
                            objArr[1] = "getKSuspendFunction";
                            break;
                        case 21:
                            objArr[1] = "getKClass";
                            break;
                        case 22:
                            objArr[1] = "getKType";
                            break;
                        case 23:
                            objArr[1] = "getKCallable";
                            break;
                        case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                            objArr[1] = "getKProperty";
                            break;
                        case Maneuver.TYPE_FORK_LEFT /* 25 */:
                            objArr[1] = "getKProperty0";
                            break;
                        case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                            objArr[1] = "getKProperty1";
                            break;
                        case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                            objArr[1] = "getKProperty2";
                            break;
                        case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                            objArr[1] = "getKMutableProperty0";
                            break;
                        case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                            objArr[1] = "getKMutableProperty1";
                            break;
                        case 30:
                            objArr[1] = "getKMutableProperty2";
                            break;
                        case 31:
                            objArr[1] = "getIterator";
                            break;
                        case 32:
                            objArr[1] = "getIterable";
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                            objArr[1] = "getMutableIterable";
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                            objArr[1] = "getMutableIterator";
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                            objArr[1] = "getCollection";
                            break;
                        case Maneuver.TYPE_STRAIGHT /* 36 */:
                            objArr[1] = "getMutableCollection";
                            break;
                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                            objArr[1] = "getList";
                            break;
                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                            objArr[1] = "getMutableList";
                            break;
                        case Maneuver.TYPE_DESTINATION /* 39 */:
                            objArr[1] = "getSet";
                            break;
                        case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                            objArr[1] = "getMutableSet";
                            break;
                        case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                            objArr[1] = "getMap";
                            break;
                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                            objArr[1] = "getMutableMap";
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                            objArr[1] = "getMapEntry";
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                            objArr[1] = "getMutableMapEntry";
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                            objArr[1] = "getListIterator";
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                            objArr[1] = "getMutableListIterator";
                            break;
                        default:
                            switch (i) {
                                case 48:
                                    objArr[1] = "getBuiltInTypeByClassName";
                                    break;
                                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                    objArr[1] = "getNothingType";
                                    break;
                                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                    objArr[1] = "getNullableNothingType";
                                    break;
                                case 51:
                                    objArr[1] = "getAnyType";
                                    break;
                                case 52:
                                    objArr[1] = "getNullableAnyType";
                                    break;
                                case 53:
                                    objArr[1] = "getDefaultBound";
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                            objArr[1] = "getPrimitiveKotlinType";
                                            break;
                                        case 56:
                                            objArr[1] = "getNumberType";
                                            break;
                                        case 57:
                                            objArr[1] = "getByteType";
                                            break;
                                        case 58:
                                            objArr[1] = "getShortType";
                                            break;
                                        case 59:
                                            objArr[1] = "getIntType";
                                            break;
                                        case 60:
                                            objArr[1] = "getLongType";
                                            break;
                                        case 61:
                                            objArr[1] = "getFloatType";
                                            break;
                                        case 62:
                                            objArr[1] = "getDoubleType";
                                            break;
                                        case 63:
                                            objArr[1] = "getCharType";
                                            break;
                                        case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                                            objArr[1] = "getBooleanType";
                                            break;
                                        case 65:
                                            objArr[1] = "getUnitType";
                                            break;
                                        case 66:
                                            objArr[1] = "getStringType";
                                            break;
                                        case 67:
                                            objArr[1] = "getIterableType";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "getAnnotationType";
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 30:
            case 31:
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
            case Maneuver.TYPE_STRAIGHT /* 36 */:
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
            case Maneuver.TYPE_DESTINATION /* 39 */:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
            case 48:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 70:
                objArr[2] = "getArrayElementTypeOrNull";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isDeprecated";
                break;
            case 161:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (i) {
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        case Maneuver.TYPE_FORK_LEFT /* 25 */:
                        case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                        case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                        case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        case 30:
                        case 31:
                        case 32:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                        case Maneuver.TYPE_STRAIGHT /* 36 */:
                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                        case Maneuver.TYPE_DESTINATION /* 39 */:
                        case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                        case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                            break;
                        default:
                            switch (i) {
                                case 48:
                                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                case 51:
                                case 52:
                                case 53:
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                                        case 65:
                                        case 66:
                                        case 67:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public final AbstractC15211l Signature() {
        AbstractC15211l abstractC15211lAd = firebase("String").ad();
        if (abstractC15211lAd != null) {
            return abstractC15211lAd;
        }
        yandex(66);
        throw null;
    }

    public final AbstractC15211l adcel(EnumC15893l enumC15893l) {
        if (enumC15893l == null) {
            yandex(73);
            throw null;
        }
        AbstractC15211l abstractC15211l = (AbstractC15211l) ((C5611l) this.loadAd.invoke()).yandex.get(enumC15893l);
        if (abstractC15211l != null) {
            return abstractC15211l;
        }
        yandex(74);
        throw null;
    }

    public final AbstractC15211l admob(int i, AbstractC18041l abstractC18041l, InterfaceC3841l interfaceC3841l) {
        if (i == 0) {
            yandex(78);
            throw null;
        }
        if (abstractC18041l != null) {
            return AbstractC3605l.adcel(AbstractC3058l.tapsense(interfaceC3841l), firebase("Array"), Collections.singletonList(new C10636l(i, abstractC18041l)));
        }
        yandex(79);
        throw null;
    }

    public InterfaceC9630l amazon() {
        return C13772l.f26873l;
    }

    public final AbstractC18041l billing(AbstractC18041l abstractC18041l) {
        if (abstractC18041l == null) {
            yandex(68);
            throw null;
        }
        AbstractC18041l abstractC18041lMopub = mopub(abstractC18041l);
        if (abstractC18041lMopub != null) {
            return abstractC18041lMopub;
        }
        C11983l.ad(abstractC18041l, "not array: ");
        return null;
    }

    public final void crashlytics() throws IOException {
        InputStream inputStream;
        C3498l c3498l = purchase;
        C16412l c16412l = this.amazon;
        C10202l c10202l = new C10202l(c3498l, c16412l, this, 48);
        this.yandex = c10202l;
        InterfaceC2504l.yandex.getClass();
        InterfaceC2504l interfaceC2504l = (InterfaceC2504l) C11457l.loadAd.getValue();
        C10202l c10202l2 = this.yandex;
        Iterable iterableRemoteconfig = remoteconfig();
        InterfaceC10240l interfaceC10240lStartapp = startapp();
        InterfaceC9630l interfaceC9630lAmazon = amazon();
        ((C9074l) interfaceC2504l).getClass();
        Set<C2312l> set = AbstractC3974l.adcel;
        ArrayList arrayList = new ArrayList();
        for (C2312l c2312l : set) {
            C7780l.remoteconfig.getClass();
            String strYandex = C7780l.yandex(c2312l);
            ClassLoader classLoader = C13863l.class.getClassLoader();
            if (classLoader == null) {
                inputStream = ClassLoader.getSystemResourceAsStream(strYandex);
            } else {
                URL resource = classLoader.getResource(strYandex);
                if (resource == null) {
                    inputStream = null;
                } else {
                    URLConnection uRLConnectionOpenConnection = resource.openConnection();
                    uRLConnectionOpenConnection.setUseCaches(false);
                    inputStream = uRLConnectionOpenConnection.getInputStream();
                }
            }
            C8913l c8913lLoadAd = inputStream != null ? AbstractC8441l.loadAd(c2312l, c16412l, c10202l2, inputStream) : null;
            if (c8913lLoadAd != null) {
                arrayList.add(c8913lLoadAd);
            }
        }
        C4517l c4517l = new C4517l(arrayList);
        C12014l c12014l = new C12014l(c16412l, c10202l2);
        C1770l c1770l = new C1770l(11, c4517l);
        C7780l c7780l = C7780l.remoteconfig;
        C10023l c10023l = new C10023l(c10202l2, c12014l, c7780l);
        C3429l c3429l = c7780l.yandex;
        String str = C16412l.amazon;
        new ConcurrentHashMap(3, 1.0f, 2);
        C0511l c0511l = new C0511l(c16412l, c10202l2, c1770l, c10023l, c4517l, iterableRemoteconfig, c12014l, interfaceC9630lAmazon, interfaceC10240lStartapp, c3429l, null, 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C8913l) it.next()).m2431l(c0511l);
        }
        c10202l.f20795l = c4517l;
        C10202l c10202l3 = this.yandex;
        c10202l3.getClass();
        c10202l3.f20790l = new C5501l(18, AbstractC8669l.m2415super(new C10202l[]{c10202l3}));
    }

    public final InterfaceC17477l firebase(String str) {
        if (str != null) {
            return (InterfaceC17477l) this.crashlytics.invoke(C3498l.purchase(str));
        }
        yandex(14);
        throw null;
    }

    public final InterfaceC17477l isPro(C2312l c2312l) {
        if (c2312l == null) {
            yandex(12);
            throw null;
        }
        InterfaceC17477l interfaceC17477lSubs = AbstractC13106l.subs(smaato(), c2312l);
        if (interfaceC17477lSubs != null) {
            return interfaceC17477lSubs;
        }
        yandex(13);
        throw null;
    }

    public final InterfaceC17477l license(int i) {
        return isPro(AbstractC3974l.billing.yandex(C3498l.purchase(C9392l.amazon.loadAd + i)));
    }

    public final AbstractC15211l metrica() {
        AbstractC15211l abstractC15211lMo2implements = purchase().mo8static(true);
        if (abstractC15211lMo2implements != null) {
            return abstractC15211lMo2implements;
        }
        yandex(52);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    public final AbstractC18041l mopub(AbstractC18041l abstractC18041l) {
        C3624l c3624lBilling;
        C3624l c3624l;
        InterfaceC17477l interfaceC17477lAmazon;
        AbstractC15211l abstractC15211lAd;
        if (abstractC18041l == null) {
            yandex(70);
            throw null;
        }
        if (!advert(abstractC18041l)) {
            AbstractC14318l abstractC14318lMopub = AbstractC12008l.mopub(abstractC18041l, false);
            AbstractC18041l abstractC18041l2 = (AbstractC18041l) ((C5611l) this.loadAd.invoke()).loadAd.get(abstractC14318lMopub);
            if (abstractC18041l2 != null) {
                return abstractC18041l2;
            }
            int i = AbstractC11125l.yandex;
            InterfaceC15234l interfaceC15234lPro = abstractC14318lMopub.mo1339native().pro();
            InterfaceC11865l interfaceC11865lAmazon = interfaceC15234lPro == null ? null : AbstractC11125l.amazon(interfaceC15234lPro);
            if (interfaceC11865lAmazon != null) {
                InterfaceC15234l interfaceC15234lPro2 = abstractC14318lMopub.mo1339native().pro();
                if (interfaceC15234lPro2 == null) {
                    abstractC15211lAd = null;
                } else {
                    Set set = AbstractC4056l.yandex;
                    if (!AbstractC4056l.amazon.contains(interfaceC15234lPro2.getName()) || (c3624lBilling = AbstractC3759l.billing(interfaceC15234lPro2)) == null || (c3624l = (C3624l) AbstractC4056l.loadAd.get(c3624lBilling)) == null || (interfaceC17477lAmazon = AbstractC9033l.amazon(interfaceC11865lAmazon, c3624l)) == null) {
                        abstractC15211lAd = null;
                    } else {
                        abstractC15211lAd = interfaceC17477lAmazon.ad();
                    }
                }
                if (abstractC15211lAd != null) {
                    return abstractC15211lAd;
                }
            }
        } else if (abstractC18041l.inmobi().size() == 1) {
            return ((AbstractC4946l) abstractC18041l.inmobi().get(0)).loadAd();
        }
        return null;
    }

    public final AbstractC15211l pro() {
        AbstractC15211l abstractC15211lAd = firebase("Unit").ad();
        if (abstractC15211lAd != null) {
            return abstractC15211lAd;
        }
        yandex(65);
        throw null;
    }

    public final AbstractC15211l purchase() {
        AbstractC15211l abstractC15211lAd = firebase("Any").ad();
        if (abstractC15211lAd != null) {
            return abstractC15211lAd;
        }
        yandex(51);
        throw null;
    }

    public Iterable remoteconfig() {
        List listSingletonList = Collections.singletonList(new C10589l(this.amazon, smaato()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        yandex(5);
        throw null;
    }

    public final C10202l smaato() {
        this.yandex.getClass();
        C10202l c10202l = this.yandex;
        if (c10202l != null) {
            return c10202l;
        }
        yandex(7);
        throw null;
    }

    public InterfaceC10240l startapp() {
        return C11485l.f23088l;
    }

    public final AbstractC15211l subs(AbstractC18041l abstractC18041l) {
        if (abstractC18041l != null) {
            return admob(1, abstractC18041l, C2782l.f6058l);
        }
        yandex(83);
        throw null;
    }

    public final AbstractC15211l subscription(EnumC15893l enumC15893l) {
        if (enumC15893l == null) {
            yandex(54);
            throw null;
        }
        AbstractC15211l abstractC15211lAd = firebase(enumC15893l.f31171l.loadAd()).ad();
        if (abstractC15211lAd != null) {
            return abstractC15211lAd;
        }
        yandex(55);
        throw null;
    }

    public final AbstractC15211l vip() {
        AbstractC15211l abstractC15211lAd = firebase("Nothing").ad();
        if (abstractC15211lAd != null) {
            return abstractC15211lAd;
        }
        yandex(49);
        throw null;
    }
}

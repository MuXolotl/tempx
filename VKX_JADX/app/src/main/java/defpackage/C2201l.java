package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lۣؓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2201l {
    public static final C2201l loadAd = new C2201l(AbstractC10794l.yandex);
    public final AbstractC10794l yandex;

    public C2201l(AbstractC10794l abstractC10794l) {
        this.yandex = abstractC10794l;
    }

    public static C2201l amazon(AbstractC18041l abstractC18041l) {
        if (abstractC18041l == null) {
            yandex(6);
            throw null;
        }
        return new C2201l(AbstractC1124l.loadAd.vip(abstractC18041l.mo1339native(), abstractC18041l.inmobi()));
    }

    public static int crashlytics(int i, int i2) {
        if (i == 2 && i2 == 3) {
            return 3;
        }
        return (i == 3 && i2 == 2) ? 2 : 1;
    }

    public static int loadAd(int i, int i2) {
        if (i == 0) {
            yandex(38);
            throw null;
        }
        if (i2 == 0) {
            yandex(39);
            throw null;
        }
        if (i == 1) {
            if (i2 == 0) {
                yandex(40);
                throw null;
            }
        } else {
            if (i2 == 1) {
                if (i != 0) {
                    return i;
                }
                yandex(41);
                throw null;
            }
            if (i != i2) {
                throw new AssertionError("Variance conflict: type parameter variance '" + AbstractC12589l.m3423private(i) + "' and projection kind '" + AbstractC12589l.m3423private(i2) + "' cannot be combined");
            }
            if (i2 == 0) {
                yandex(42);
                throw null;
            }
        }
        return i2;
    }

    public static String mopub(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (AbstractC7985l.amazon(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    public static C2201l purchase(AbstractC10794l abstractC10794l, AbstractC10794l abstractC10794l2) {
        if (abstractC10794l == null) {
            yandex(3);
            throw null;
        }
        if (abstractC10794l2 == null) {
            yandex(4);
            throw null;
        }
        if (abstractC10794l.purchase()) {
            abstractC10794l = abstractC10794l2;
        } else if (!abstractC10794l2.purchase()) {
            abstractC10794l = new C7926l(abstractC10794l, abstractC10794l2);
        }
        return new C2201l(abstractC10794l);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    public static /* synthetic */ void yandex(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                        case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        case Maneuver.TYPE_FORK_LEFT /* 25 */:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        case Maneuver.TYPE_FORK_LEFT /* 25 */:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                case 30:
                                case 31:
                                case 32:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                        case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
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
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 30:
            case 31:
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                objArr[0] = "typeProjection";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                objArr[0] = "originalProjection";
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                objArr[0] = "originalType";
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                objArr[0] = "substituted";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                objArr[0] = "annotations";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                objArr[0] = "typeParameterVariance";
                break;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                objArr[0] = "projectionKind";
                break;
        }
        if (i == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i == 8) {
            objArr[1] = "getSubstitution";
        } else if (i == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i) {
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        case Maneuver.TYPE_FORK_LEFT /* 25 */:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i) {
                                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                case 30:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i) {
                                        case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                        case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 30:
            case 31:
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[2] = "unsafeSubstitute";
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
            case Maneuver.TYPE_STRAIGHT /* 36 */:
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
            case Maneuver.TYPE_DESTINATION /* 39 */:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i) {
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        case Maneuver.TYPE_FORK_LEFT /* 25 */:
                            break;
                        default:
                            switch (i) {
                                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                        case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
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

    public final AbstractC18041l admob(int i, AbstractC18041l abstractC18041l) throws C12948l {
        if (abstractC18041l == null) {
            yandex(14);
            throw null;
        }
        if (i == 0) {
            yandex(15);
            throw null;
        }
        AbstractC10794l abstractC10794l = this.yandex;
        AbstractC4946l c10636l = new C10636l(i, abstractC10794l.billing(i, abstractC18041l));
        if (!abstractC10794l.purchase()) {
            try {
                c10636l = subs(c10636l, null, 0);
            } catch (C12948l unused) {
                c10636l = null;
            }
        }
        if (abstractC10794l.yandex() || abstractC10794l.loadAd()) {
            boolean zLoadAd = abstractC10794l.loadAd();
            if (c10636l == null) {
                c10636l = null;
            } else if (!c10636l.crashlytics()) {
                AbstractC18041l abstractC18041lLoadAd = c10636l.loadAd();
                if (AbstractC12008l.crashlytics(abstractC18041lLoadAd, C5818l.f12256l, null)) {
                    int iYandex = c10636l.yandex();
                    if (iYandex == 3) {
                        c10636l = new C10636l(iYandex, (AbstractC18041l) AbstractC2749l.yandex(abstractC18041lLoadAd).loadAd);
                    } else if (zLoadAd) {
                        c10636l = new C10636l(iYandex, (AbstractC18041l) AbstractC2749l.yandex(abstractC18041lLoadAd).yandex);
                    } else {
                        C17554l c17554l = new C17554l();
                        C2201l c2201l = new C2201l(c17554l);
                        if (!c17554l.purchase()) {
                            try {
                                c10636l = c2201l.subs(c10636l, null, 0);
                            } catch (C12948l unused2) {
                                c10636l = null;
                            }
                        }
                    }
                }
            }
        }
        if (c10636l == null) {
            return null;
        }
        return c10636l.loadAd();
    }

    public final AbstractC18041l billing(int i, AbstractC18041l abstractC18041l) {
        if (abstractC18041l == null) {
            yandex(9);
            throw null;
        }
        if (i == 0) {
            yandex(10);
            throw null;
        }
        if (this.yandex.purchase()) {
            return abstractC18041l;
        }
        try {
            AbstractC18041l abstractC18041lLoadAd = subs(new C10636l(i, abstractC18041l), null, 0).loadAd();
            if (abstractC18041lLoadAd != null) {
                return abstractC18041lLoadAd;
            }
            yandex(12);
            throw null;
        } catch (C12948l e) {
            return C8741l.loadAd(EnumC5123l.f11147l, e.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:105:0x0211  */
    /* JADX WARN: Code duplicated, block: B:107:0x0219  */
    /* JADX WARN: Code duplicated, block: B:108:0x021c  */
    /* JADX WARN: Code duplicated, block: B:110:0x021f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0222  */
    /* JADX WARN: Code duplicated, block: B:113:0x0225  */
    /* JADX WARN: Code duplicated, block: B:115:0x0229  */
    /* JADX WARN: Code duplicated, block: B:118:0x0231  */
    /* JADX WARN: Code duplicated, block: B:119:0x0240  */
    /* JADX WARN: Code duplicated, block: B:124:0x0261  */
    /* JADX WARN: Code duplicated, block: B:126:0x0285  */
    /* JADX WARN: Code duplicated, block: B:128:0x0288  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0293  */
    /* JADX WARN: Code duplicated, block: B:140:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:144:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x012f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0140  */
    /* JADX WARN: Code duplicated, block: B:64:0x0150  */
    /* JADX WARN: Code duplicated, block: B:66:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0159  */
    /* JADX WARN: Code duplicated, block: B:70:0x0161  */
    /* JADX WARN: Code duplicated, block: B:74:0x017b  */
    /* JADX WARN: Code duplicated, block: B:75:0x017e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0188  */
    /* JADX WARN: Code duplicated, block: B:83:0x018f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x0190 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0192  */
    /* JADX WARN: Code duplicated, block: B:86:0x019b  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ed  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final AbstractC4946l subs(AbstractC4946l abstractC4946l, InterfaceC16902l interfaceC16902l, int i) throws C12948l {
        AbstractC18041l abstractC18041lLoadAd;
        int iYandex;
        AbstractC14318l abstractC14318lMo3847class;
        Cabstract cabstract;
        AbstractC15211l abstractC15211l;
        List parameters;
        List listInmobi;
        ArrayList arrayList;
        boolean z;
        AbstractC18041l abstractC18041lFirebase;
        InterfaceC16902l interfaceC16902l2;
        AbstractC4946l abstractC4946l2;
        AbstractC4946l abstractC4946lSubs;
        int iInmobi;
        char c;
        int iMo2182l;
        boolean z2;
        C2201l c2201l;
        C0232l c0232l;
        int iCrashlytics;
        InterfaceC13789l interfaceC13789lMo3847class;
        InterfaceC12563l interfaceC12563l;
        AbstractC18041l abstractC18041lAdmob;
        InterfaceC3841l interfaceC3841lCrashlytics;
        int iInmobi2;
        AbstractC18041l abstractC18041lAdmob2 = null;
        if (abstractC4946l == null) {
            yandex(18);
            throw null;
        }
        AbstractC10794l abstractC10794l = this.yandex;
        if (i > 100) {
            C11983l.metrica("Recursion too deep. Most likely infinite loop while substituting ", mopub(abstractC4946l), "; substitution: ", mopub(abstractC10794l));
            return null;
        }
        if (!abstractC4946l.crashlytics()) {
            AbstractC18041l abstractC18041lLoadAd2 = abstractC4946l.loadAd();
            if (abstractC18041lLoadAd2 instanceof InterfaceC2708l) {
                InterfaceC2708l interfaceC2708l = (InterfaceC2708l) abstractC18041lLoadAd2;
                AbstractC14318l abstractC14318lAppmetrica = interfaceC2708l.appmetrica();
                AbstractC18041l abstractC18041lMopub = interfaceC2708l.mopub();
                AbstractC4946l abstractC4946lSubs2 = subs(new C10636l(abstractC4946l.yandex(), abstractC14318lAppmetrica), interfaceC16902l, i + 1);
                return abstractC4946lSubs2.crashlytics() ? abstractC4946lSubs2 : new C10636l(abstractC4946lSubs2.yandex(), AbstractC5170l.purchase(abstractC4946lSubs2.loadAd().mo3847class(), admob(abstractC4946l.yandex(), abstractC18041lMopub)));
            }
            abstractC18041lLoadAd2.mo3847class();
            if (!(abstractC18041lLoadAd2.mo3847class() instanceof C6530l)) {
                AbstractC4946l abstractC4946lAmazon = abstractC10794l.amazon(abstractC18041lLoadAd2);
                if (abstractC4946lAmazon == null) {
                    abstractC4946lAmazon = null;
                } else if (abstractC18041lLoadAd2.getAnnotations().isPro(AbstractC3333l.advert)) {
                    InterfaceC1925l interfaceC1925lMo1339native = abstractC4946lAmazon.loadAd().mo1339native();
                    if (interfaceC1925lMo1339native instanceof C2314l) {
                        AbstractC4946l abstractC4946l3 = ((C2314l) interfaceC1925lMo1339native).f5025l;
                        int iYandex2 = abstractC4946l3.yandex();
                        if (crashlytics(abstractC4946l.yandex(), iYandex2) == 3) {
                            abstractC4946lAmazon = new C10636l(abstractC4946l3.loadAd());
                        } else if (interfaceC16902l != null && crashlytics(interfaceC16902l.mo2182l(), iYandex2) == 3) {
                            abstractC4946lAmazon = new C10636l(abstractC4946l3.loadAd());
                        }
                    }
                }
                int iYandex3 = abstractC4946l.yandex();
                if (abstractC4946lAmazon == null && (abstractC18041lLoadAd2.mo3847class() instanceof AbstractC4317l)) {
                    InterfaceC13789l interfaceC13789lMo3847class2 = abstractC18041lLoadAd2.mo3847class();
                    InterfaceC12563l interfaceC12563l2 = interfaceC13789lMo3847class2 instanceof InterfaceC12563l ? (InterfaceC12563l) interfaceC13789lMo3847class2 : null;
                    if (!(interfaceC12563l2 != null ? interfaceC12563l2.advert() : false)) {
                        AbstractC4317l abstractC4317l = (AbstractC4317l) abstractC18041lLoadAd2.mo3847class();
                        AbstractC15211l abstractC15211l2 = abstractC4317l.f8857l;
                        AbstractC15211l abstractC15211l3 = abstractC4317l.f8856l;
                        int i2 = i + 1;
                        AbstractC4946l abstractC4946lSubs3 = subs(new C10636l(iYandex3, abstractC15211l2), interfaceC16902l, i2);
                        AbstractC4946l abstractC4946lSubs4 = subs(new C10636l(iYandex3, abstractC15211l3), interfaceC16902l, i2);
                        int iYandex4 = abstractC4946lSubs3.yandex();
                        if (abstractC4946lSubs3.loadAd() != abstractC4317l.f8857l || abstractC4946lSubs4.loadAd() != abstractC15211l3) {
                            return new C10636l(iYandex4, AbstractC3605l.subs(AbstractC6419l.subs(abstractC4946lSubs3.loadAd()), AbstractC6419l.subs(abstractC4946lSubs4.loadAd())));
                        }
                    } else if (!AbstractC16860l.inmobi(abstractC18041lLoadAd2)) {
                        if (abstractC4946lAmazon != null) {
                            iCrashlytics = crashlytics(iYandex3, abstractC4946lAmazon.yandex());
                            if (!(abstractC18041lLoadAd2.mo1339native() instanceof InterfaceC5291l)) {
                                iInmobi2 = AbstractC5020l.inmobi(iCrashlytics);
                                if (iInmobi2 != 1) {
                                    return new C10636l(3, abstractC18041lLoadAd2.mo1339native().subs().metrica());
                                }
                                if (iInmobi2 == 2) {
                                    throw new C12948l("Out-projection in in-position");
                                }
                            }
                            interfaceC13789lMo3847class = abstractC18041lLoadAd2.mo3847class();
                            if (interfaceC13789lMo3847class instanceof InterfaceC12563l) {
                                interfaceC12563l = (InterfaceC12563l) interfaceC13789lMo3847class;
                            } else {
                                interfaceC12563l = null;
                            }
                            if (interfaceC12563l != null) {
                                interfaceC12563l = null;
                            } else {
                                interfaceC12563l = null;
                            }
                            if (abstractC4946lAmazon.crashlytics()) {
                                return abstractC4946lAmazon;
                            }
                            if (interfaceC12563l != null) {
                                abstractC18041lAdmob = interfaceC12563l.pro(abstractC4946lAmazon.loadAd());
                            } else {
                                abstractC18041lAdmob = AbstractC12008l.admob(abstractC4946lAmazon.loadAd(), abstractC18041lLoadAd2.mo1342throw());
                            }
                            if (!abstractC18041lLoadAd2.getAnnotations().isEmpty()) {
                                interfaceC3841lCrashlytics = abstractC10794l.crashlytics(abstractC18041lLoadAd2.getAnnotations());
                                if (interfaceC3841lCrashlytics != null) {
                                    yandex(33);
                                    throw null;
                                }
                                if (interfaceC3841lCrashlytics.isPro(AbstractC3333l.advert)) {
                                    interfaceC3841lCrashlytics = new C18341l(interfaceC3841lCrashlytics, new C2911l(16));
                                }
                                abstractC18041lAdmob = AbstractC12300l.isPro(abstractC18041lAdmob, new C2172l(new InterfaceC3841l[]{abstractC18041lAdmob.getAnnotations(), interfaceC3841lCrashlytics}));
                            }
                            if (iCrashlytics == 1) {
                                iYandex3 = loadAd(iYandex3, abstractC4946lAmazon.yandex());
                            }
                            return new C10636l(iYandex3, abstractC18041lAdmob);
                        }
                        abstractC18041lLoadAd = abstractC4946l.loadAd();
                        iYandex = abstractC4946l.yandex();
                        if (!(abstractC18041lLoadAd.mo1339native().pro() instanceof InterfaceC16902l)) {
                            abstractC14318lMo3847class = abstractC18041lLoadAd.mo3847class();
                            if (abstractC14318lMo3847class instanceof Cabstract) {
                                cabstract = (Cabstract) abstractC14318lMo3847class;
                            } else {
                                cabstract = null;
                            }
                            if (cabstract != null) {
                                abstractC15211l = cabstract.f0l;
                            } else {
                                abstractC15211l = null;
                            }
                            if (abstractC15211l != null) {
                                if (abstractC10794l instanceof C0232l) {
                                    c0232l = (C0232l) abstractC10794l;
                                    if (c0232l.amazon) {
                                        c2201l = new C2201l(new C0232l(c0232l.loadAd, c0232l.crashlytics, false));
                                    } else {
                                        c2201l = this;
                                    }
                                } else {
                                    c2201l = this;
                                }
                                abstractC18041lAdmob2 = c2201l.admob(1, abstractC15211l);
                            }
                            parameters = abstractC18041lLoadAd.mo1339native().getParameters();
                            listInmobi = abstractC18041lLoadAd.inmobi();
                            arrayList = new ArrayList(parameters.size());
                            z = false;
                            for (int i3 = 0; i3 < parameters.size(); i3++) {
                                interfaceC16902l2 = (InterfaceC16902l) parameters.get(i3);
                                abstractC4946l2 = (AbstractC4946l) listInmobi.get(i3);
                                abstractC4946lSubs = subs(abstractC4946l2, interfaceC16902l2, i + 1);
                                iInmobi = AbstractC5020l.inmobi(crashlytics(interfaceC16902l2.mo2182l(), abstractC4946lSubs.yandex()));
                                if (iInmobi != 0) {
                                    if (iInmobi != 1) {
                                        c = 2;
                                        if (iInmobi == 2) {
                                        }
                                        z2 = true;
                                    } else {
                                        c = 2;
                                    }
                                    abstractC4946lSubs = AbstractC12008l.isPro(interfaceC16902l2);
                                    z2 = true;
                                } else {
                                    c = 2;
                                    iMo2182l = interfaceC16902l2.mo2182l();
                                    z2 = true;
                                    if (iMo2182l != 1) {
                                        abstractC4946lSubs = new C10636l(1, abstractC4946lSubs.loadAd());
                                    }
                                }
                                if (abstractC4946lSubs != abstractC4946l2) {
                                    z = z2;
                                }
                                arrayList.add(abstractC4946lSubs);
                            }
                            if (z) {
                                listInmobi = arrayList;
                            }
                            abstractC18041lFirebase = AbstractC6419l.firebase(abstractC18041lLoadAd, listInmobi, abstractC10794l.crashlytics(abstractC18041lLoadAd.getAnnotations()), 4);
                            if (abstractC18041lFirebase instanceof AbstractC15211l) {
                                abstractC18041lFirebase = AbstractC14506l.isPro((AbstractC15211l) abstractC18041lFirebase, (AbstractC15211l) abstractC18041lAdmob2);
                            }
                            return new C10636l(iYandex, abstractC18041lFirebase);
                        }
                    }
                } else if (!AbstractC16860l.inmobi(abstractC18041lLoadAd2) && !AbstractC11748l.subs(abstractC18041lLoadAd2)) {
                    if (abstractC4946lAmazon != null) {
                        iCrashlytics = crashlytics(iYandex3, abstractC4946lAmazon.yandex());
                        if (!(abstractC18041lLoadAd2.mo1339native() instanceof InterfaceC5291l)) {
                            iInmobi2 = AbstractC5020l.inmobi(iCrashlytics);
                            if (iInmobi2 != 1) {
                                return new C10636l(3, abstractC18041lLoadAd2.mo1339native().subs().metrica());
                            }
                            if (iInmobi2 == 2) {
                                throw new C12948l("Out-projection in in-position");
                            }
                        }
                        interfaceC13789lMo3847class = abstractC18041lLoadAd2.mo3847class();
                        if (interfaceC13789lMo3847class instanceof InterfaceC12563l) {
                            interfaceC12563l = (InterfaceC12563l) interfaceC13789lMo3847class;
                        } else {
                            interfaceC12563l = null;
                        }
                        if (interfaceC12563l != null || !interfaceC12563l.advert()) {
                            interfaceC12563l = null;
                        }
                        if (abstractC4946lAmazon.crashlytics()) {
                            return abstractC4946lAmazon;
                        }
                        if (interfaceC12563l != null) {
                            abstractC18041lAdmob = interfaceC12563l.pro(abstractC4946lAmazon.loadAd());
                        } else {
                            abstractC18041lAdmob = AbstractC12008l.admob(abstractC4946lAmazon.loadAd(), abstractC18041lLoadAd2.mo1342throw());
                        }
                        if (!abstractC18041lLoadAd2.getAnnotations().isEmpty()) {
                            interfaceC3841lCrashlytics = abstractC10794l.crashlytics(abstractC18041lLoadAd2.getAnnotations());
                            if (interfaceC3841lCrashlytics != null) {
                                yandex(33);
                                throw null;
                            }
                            if (interfaceC3841lCrashlytics.isPro(AbstractC3333l.advert)) {
                                interfaceC3841lCrashlytics = new C18341l(interfaceC3841lCrashlytics, new C2911l(16));
                            }
                            abstractC18041lAdmob = AbstractC12300l.isPro(abstractC18041lAdmob, new C2172l(new InterfaceC3841l[]{abstractC18041lAdmob.getAnnotations(), interfaceC3841lCrashlytics}));
                        }
                        if (iCrashlytics == 1) {
                            iYandex3 = loadAd(iYandex3, abstractC4946lAmazon.yandex());
                        }
                        return new C10636l(iYandex3, abstractC18041lAdmob);
                    }
                    abstractC18041lLoadAd = abstractC4946l.loadAd();
                    iYandex = abstractC4946l.yandex();
                    if (!(abstractC18041lLoadAd.mo1339native().pro() instanceof InterfaceC16902l)) {
                        abstractC14318lMo3847class = abstractC18041lLoadAd.mo3847class();
                        if (abstractC14318lMo3847class instanceof Cabstract) {
                            cabstract = (Cabstract) abstractC14318lMo3847class;
                        } else {
                            cabstract = null;
                        }
                        if (cabstract != null) {
                            abstractC15211l = cabstract.f0l;
                        } else {
                            abstractC15211l = null;
                        }
                        if (abstractC15211l != null) {
                            if (abstractC10794l instanceof C0232l) {
                                c0232l = (C0232l) abstractC10794l;
                                if (c0232l.amazon) {
                                    c2201l = this;
                                } else {
                                    c2201l = new C2201l(new C0232l(c0232l.loadAd, c0232l.crashlytics, false));
                                }
                            } else {
                                c2201l = this;
                            }
                            abstractC18041lAdmob2 = c2201l.admob(1, abstractC15211l);
                        }
                        parameters = abstractC18041lLoadAd.mo1339native().getParameters();
                        listInmobi = abstractC18041lLoadAd.inmobi();
                        arrayList = new ArrayList(parameters.size());
                        z = false;
                        while (i3 < parameters.size()) {
                            interfaceC16902l2 = (InterfaceC16902l) parameters.get(i3);
                            abstractC4946l2 = (AbstractC4946l) listInmobi.get(i3);
                            abstractC4946lSubs = subs(abstractC4946l2, interfaceC16902l2, i + 1);
                            iInmobi = AbstractC5020l.inmobi(crashlytics(interfaceC16902l2.mo2182l(), abstractC4946lSubs.yandex()));
                            if (iInmobi != 0) {
                                if (iInmobi != 1) {
                                    c = 2;
                                    if (iInmobi == 2) {
                                    }
                                    z2 = true;
                                } else {
                                    c = 2;
                                }
                                abstractC4946lSubs = AbstractC12008l.isPro(interfaceC16902l2);
                                z2 = true;
                            } else {
                                c = 2;
                                iMo2182l = interfaceC16902l2.mo2182l();
                                z2 = true;
                                if (iMo2182l != 1 && !abstractC4946lSubs.crashlytics()) {
                                    abstractC4946lSubs = new C10636l(1, abstractC4946lSubs.loadAd());
                                }
                            }
                            if (abstractC4946lSubs != abstractC4946l2) {
                                z = z2;
                            }
                            arrayList.add(abstractC4946lSubs);
                        }
                        if (z) {
                            listInmobi = arrayList;
                        }
                        abstractC18041lFirebase = AbstractC6419l.firebase(abstractC18041lLoadAd, listInmobi, abstractC10794l.crashlytics(abstractC18041lLoadAd.getAnnotations()), 4);
                        if ((abstractC18041lFirebase instanceof AbstractC15211l) && (abstractC18041lAdmob2 instanceof AbstractC15211l)) {
                            abstractC18041lFirebase = AbstractC14506l.isPro((AbstractC15211l) abstractC18041lFirebase, (AbstractC15211l) abstractC18041lAdmob2);
                        }
                        return new C10636l(iYandex, abstractC18041lFirebase);
                    }
                }
            }
        }
        return abstractC4946l;
    }
}

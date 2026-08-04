package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lٗٔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C17134l extends AbstractC10175l implements InterfaceC4884l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17134l(InterfaceC8371l interfaceC8371l, C17134l c17134l, InterfaceC3841l interfaceC3841l, C3498l c3498l, int i, InterfaceC5706l interfaceC5706l) {
        super(i, interfaceC3841l, interfaceC8371l, c17134l, c3498l, interfaceC5706l);
        if (interfaceC8371l == null) {
            m4264l(0);
            throw null;
        }
        if (interfaceC3841l == null) {
            m4264l(1);
            throw null;
        }
        if (c3498l == null) {
            m4264l(2);
            throw null;
        }
        if (i == 0) {
            m4264l(3);
            throw null;
        }
        if (interfaceC5706l != null) {
        } else {
            m4264l(4);
            throw null;
        }
    }

    /* JADX INFO: renamed from: lُٕۙ, reason: contains not printable characters */
    public static C17134l m4263l(AbstractC10170l abstractC10170l, C3498l c3498l, int i, InterfaceC5706l interfaceC5706l) {
        C3199l c3199l = C2782l.f6058l;
        if (abstractC10170l == null) {
            m4264l(5);
            throw null;
        }
        if (c3498l == null) {
            m4264l(7);
            throw null;
        }
        if (i == 0) {
            m4264l(8);
            throw null;
        }
        if (interfaceC5706l != null) {
            return new C17134l(abstractC10170l, null, c3199l, c3498l, i, interfaceC5706l);
        }
        m4264l(9);
        throw null;
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static /* synthetic */ void m4264l(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case 23:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[0] = "contextReceiverParameters";
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case 23:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 30:
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.AbstractC10175l
    /* JADX INFO: renamed from: lؖٔؓ */
    public AbstractC10175l mo680l(int i, InterfaceC3841l interfaceC3841l, InterfaceC8371l interfaceC8371l, InterfaceC4884l interfaceC4884l, C3498l c3498l, InterfaceC5706l interfaceC5706l) {
        if (interfaceC8371l == null) {
            m4264l(25);
            throw null;
        }
        if (i == 0) {
            m4264l(26);
            throw null;
        }
        if (interfaceC3841l == null) {
            m4264l(27);
            throw null;
        }
        C17134l c17134l = (C17134l) interfaceC4884l;
        if (c3498l == null) {
            c3498l = getName();
        }
        return new C17134l(interfaceC8371l, c17134l, interfaceC3841l, c3498l, i, interfaceC5706l);
    }

    @Override // defpackage.AbstractC1281l
    /* JADX INFO: renamed from: lٍؖۜ, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C17134l mo864l() {
        C17134l c17134l = (C17134l) super.mo864l();
        if (c17134l != null) {
            return c17134l;
        }
        m4264l(24);
        throw null;
    }

    @Override // defpackage.AbstractC10175l, defpackage.InterfaceC4884l
    /* JADX INFO: renamed from: lٍؚۖ */
    public InterfaceC17729l mo1457l() {
        return m2898l(C2201l.loadAd);
    }

    /* JADX INFO: renamed from: lًٖۘ */
    public C17134l mo3360l(C7073l c7073l, C7073l c7073l2, List list, List list2, List list3, AbstractC18041l abstractC18041l, int i, C6561l c6561l, Map map) {
        if (list == null) {
            m4264l(19);
            throw null;
        }
        if (list2 == null) {
            m4264l(20);
            throw null;
        }
        if (list3 == null) {
            m4264l(21);
            throw null;
        }
        if (c6561l == null) {
            m4264l(22);
            throw null;
        }
        super.mo2896l(c7073l, c7073l2, list, list2, list3, abstractC18041l, i, c6561l);
        if (map != null && !map.isEmpty()) {
            this.f20731l = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // defpackage.AbstractC10175l
    /* JADX INFO: renamed from: l٘ٛؒ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C17134l mo2896l(C7073l c7073l, C7073l c7073l2, List list, List list2, List list3, AbstractC18041l abstractC18041l, int i, C6561l c6561l) {
        if (list == null) {
            m4264l(14);
            throw null;
        }
        if (list2 == null) {
            m4264l(15);
            throw null;
        }
        if (list3 == null) {
            m4264l(16);
            throw null;
        }
        if (c6561l != null) {
            return mo3360l(c7073l, c7073l2, list, list2, list3, abstractC18041l, i, c6561l, null);
        }
        m4264l(17);
        throw null;
    }
}

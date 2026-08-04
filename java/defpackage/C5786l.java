package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lؘٚٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C5786l extends AbstractC10175l implements InterfaceC5684l {

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public final boolean f12195l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5786l(InterfaceC17477l interfaceC17477l, InterfaceC5684l interfaceC5684l, InterfaceC3841l interfaceC3841l, boolean z, int i, InterfaceC5706l interfaceC5706l) {
        super(i, interfaceC3841l, interfaceC17477l, interfaceC5684l, AbstractC13589l.purchase, interfaceC5706l);
        if (interfaceC17477l == null) {
            m1855l(0);
            throw null;
        }
        if (interfaceC3841l == null) {
            m1855l(1);
            throw null;
        }
        if (i == 0) {
            m1855l(2);
            throw null;
        }
        if (interfaceC5706l == null) {
            m1855l(3);
            throw null;
        }
        this.f12195l = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static /* synthetic */ void m1855l(int i) {
        String str;
        int i2;
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
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
            case 1:
            case 5:
            case 8:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 21:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 27) {
            switch (i) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    objArr[1] = "getConstructedClass";
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 21:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.AbstractC10175l, defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: import */
    public final Object mo1008import(InterfaceC15600l interfaceC15600l, Object obj) {
        return interfaceC15600l.advert(this, obj);
    }

    @Override // defpackage.AbstractC10175l, defpackage.InterfaceC0207l, defpackage.InterfaceC11661l
    public final Collection license() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        m1855l(21);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX INFO: renamed from: lؒۡۦ, reason: contains not printable characters */
    public final void m1856l(List list, C6561l c6561l, List list2) {
        C7073l c7073lMo2892l;
        List listMo2891l;
        if (list == null) {
            m1855l(10);
            throw null;
        }
        if (list2 == null) {
            m1855l(12);
            throw null;
        }
        InterfaceC17477l interfaceC17477lSignature = Signature();
        if (interfaceC17477lSignature.subscription()) {
            InterfaceC8371l interfaceC8371lSignature = interfaceC17477lSignature.Signature();
            if (interfaceC8371lSignature instanceof InterfaceC17477l) {
                c7073lMo2892l = ((InterfaceC17477l) interfaceC8371lSignature).mo2892l();
            } else {
                c7073lMo2892l = null;
            }
        } else {
            c7073lMo2892l = null;
        }
        InterfaceC17477l interfaceC17477lSignature2 = Signature();
        if (interfaceC17477lSignature2.mo2891l().isEmpty()) {
            listMo2891l = Collections.EMPTY_LIST;
            if (listMo2891l == null) {
                m1855l(16);
                throw null;
            }
        } else {
            listMo2891l = interfaceC17477lSignature2.mo2891l();
            if (listMo2891l == null) {
                m1855l(15);
                throw null;
            }
        }
        mo2896l(null, c7073lMo2892l, listMo2891l, list2, list, null, 1, c6561l);
    }

    /* JADX INFO: renamed from: lٍؖۜ, reason: contains not printable characters */
    public final InterfaceC17477l m1857l() {
        InterfaceC17477l interfaceC17477lSignature = Signature();
        if (interfaceC17477lSignature != null) {
            return interfaceC17477lSignature;
        }
        m1855l(18);
        throw null;
    }

    @Override // defpackage.AbstractC10175l, defpackage.InterfaceC10900l
    /* JADX INFO: renamed from: lؙؚؚ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C5786l isPro(C2201l c2201l) {
        if (c2201l != null) {
            return (C5786l) super.isPro(c2201l);
        }
        m1855l(20);
        throw null;
    }

    @Override // defpackage.AbstractC1281l
    /* JADX INFO: renamed from: lًٖۘ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C5786l mo864l() {
        C5786l c5786l = (C5786l) super.mo864l();
        if (c5786l != null) {
            return c5786l;
        }
        m1855l(19);
        throw null;
    }

    @Override // defpackage.AbstractC10175l
    /* JADX INFO: renamed from: lُٕۙ, reason: merged with bridge method [inline-methods] */
    public C5786l mo680l(int i, InterfaceC3841l interfaceC3841l, InterfaceC8371l interfaceC8371l, InterfaceC4884l interfaceC4884l, C3498l c3498l, InterfaceC5706l interfaceC5706l) {
        if (interfaceC8371l == null) {
            m1855l(23);
            throw null;
        }
        if (i == 0) {
            m1855l(24);
            throw null;
        }
        if (interfaceC3841l == null) {
            m1855l(25);
            throw null;
        }
        if (i == 1 || i == 4) {
            return new C5786l((InterfaceC17477l) interfaceC8371l, this, interfaceC3841l, this.f12195l, 1, interfaceC5706l);
        }
        StringBuilder sb = new StringBuilder("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
        sb.append(this);
        sb.append("\nnewOwner: ");
        sb.append(interfaceC8371l);
        String strPremium = AbstractC14814l.premium(i);
        sb.append("\nkind: ");
        sb.append(strPremium);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.AbstractC10175l, defpackage.InterfaceC0207l
    /* JADX INFO: renamed from: lؚْٟ */
    public final void mo365l(Collection collection) {
        if (collection != null) {
            return;
        }
        m1855l(22);
        throw null;
    }

    /* JADX INFO: renamed from: lٖٓۧ, reason: contains not printable characters */
    public final void m1860l(List list, C6561l c6561l) {
        if (list != null) {
            m1856l(list, c6561l, Signature().isVip());
        } else {
            m1855l(13);
            throw null;
        }
    }

    @Override // defpackage.AbstractC1281l, defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: l٘ٛؒ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final InterfaceC17477l Signature() {
        InterfaceC17477l interfaceC17477l = (InterfaceC17477l) super.Signature();
        if (interfaceC17477l != null) {
            return interfaceC17477l;
        }
        m1855l(17);
        throw null;
    }

    @Override // defpackage.AbstractC10175l, defpackage.InterfaceC0207l
    /* JADX INFO: renamed from: strictfp */
    public final InterfaceC0207l mo366strictfp(InterfaceC17477l interfaceC17477l, int i, C6561l c6561l) {
        return (C5786l) m2899l(interfaceC17477l, i, c6561l);
    }
}

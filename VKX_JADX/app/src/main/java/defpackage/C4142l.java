package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٕٜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4142l extends C5786l implements InterfaceC8731l {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public Boolean f8512l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public Boolean f8513l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4142l(InterfaceC17477l interfaceC17477l, C4142l c4142l, InterfaceC3841l interfaceC3841l, boolean z, int i, InterfaceC5706l interfaceC5706l) {
        super(interfaceC17477l, c4142l, interfaceC3841l, z, i, interfaceC5706l);
        if (interfaceC17477l == null) {
            m1501l(0);
            throw null;
        }
        if (interfaceC3841l == null) {
            m1501l(1);
            throw null;
        }
        if (i == 0) {
            m1501l(2);
            throw null;
        }
        if (interfaceC5706l == null) {
            m1501l(3);
            throw null;
        }
        this.f8513l = null;
        this.f8512l = null;
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static /* synthetic */ void m1501l(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: l٘ؓۘ, reason: contains not printable characters */
    public static C4142l m1502l(InterfaceC17477l interfaceC17477l, InterfaceC3841l interfaceC3841l, boolean z, C11197l c11197l) {
        if (interfaceC17477l != null) {
            return new C4142l(interfaceC17477l, null, interfaceC3841l, z, 1, c11197l);
        }
        m1501l(4);
        throw null;
    }

    @Override // defpackage.AbstractC10175l, defpackage.InterfaceC11661l
    /* JADX INFO: renamed from: for */
    public final boolean mo1473for() {
        return this.f8512l.booleanValue();
    }

    @Override // defpackage.C5786l, defpackage.AbstractC10175l
    /* JADX INFO: renamed from: lؖٔؓ */
    public final /* bridge */ /* synthetic */ AbstractC10175l mo680l(int i, InterfaceC3841l interfaceC3841l, InterfaceC8371l interfaceC8371l, InterfaceC4884l interfaceC4884l, C3498l c3498l, InterfaceC5706l interfaceC5706l) {
        return m1505l(interfaceC8371l, interfaceC4884l, i, interfaceC3841l, interfaceC5706l);
    }

    @Override // defpackage.InterfaceC8731l
    /* JADX INFO: renamed from: lٖؖ۠ */
    public final InterfaceC8731l mo1490l(AbstractC18041l abstractC18041l, ArrayList arrayList, AbstractC18041l abstractC18041l2, C8195l c8195l) {
        if (abstractC18041l2 == null) {
            m1501l(17);
            throw null;
        }
        C4142l c4142lM1505l = m1505l(Signature(), null, mo367while(), getAnnotations(), billing());
        c4142lM1505l.mo2896l(abstractC18041l != null ? AbstractC6689l.firebase(c4142lM1505l, abstractC18041l, C2782l.f6058l) : null, this.f20729l, C2580l.f5619l, getTypeParameters(), AbstractC16947l.loadAd(arrayList, mo1007finally(), c4142lM1505l), abstractC18041l2, startapp(), admob());
        if (c8195l != null) {
            c4142lM1505l.m2897l((C0941l) c8195l.f17098l, c8195l.f17097l);
        }
        return c4142lM1505l;
    }

    @Override // defpackage.AbstractC10175l
    /* JADX INFO: renamed from: lؚۥۚ, reason: contains not printable characters */
    public final void mo1503l(boolean z) {
        this.f8512l = Boolean.valueOf(z);
    }

    @Override // defpackage.AbstractC10175l
    /* JADX INFO: renamed from: lًٍّ, reason: contains not printable characters */
    public final void mo1504l(boolean z) {
        this.f8513l = Boolean.valueOf(z);
    }

    @Override // defpackage.C5786l
    /* JADX INFO: renamed from: lُٕۙ */
    public final /* bridge */ /* synthetic */ C5786l mo680l(int i, InterfaceC3841l interfaceC3841l, InterfaceC8371l interfaceC8371l, InterfaceC4884l interfaceC4884l, C3498l c3498l, InterfaceC5706l interfaceC5706l) {
        return m1505l(interfaceC8371l, interfaceC4884l, i, interfaceC3841l, interfaceC5706l);
    }

    /* JADX INFO: renamed from: lٖؐۜ, reason: contains not printable characters */
    public final C4142l m1505l(InterfaceC8371l interfaceC8371l, InterfaceC4884l interfaceC4884l, int i, InterfaceC3841l interfaceC3841l, InterfaceC5706l interfaceC5706l) {
        if (interfaceC8371l == null) {
            m1501l(7);
            throw null;
        }
        if (i == 0) {
            m1501l(8);
            throw null;
        }
        if (interfaceC3841l == null) {
            m1501l(9);
            throw null;
        }
        if (interfaceC5706l == null) {
            m1501l(10);
            throw null;
        }
        if (i != 1 && i != 4) {
            StringBuilder sb = new StringBuilder("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
            sb.append(this);
            sb.append("\nnewOwner: ");
            sb.append(interfaceC8371l);
            String strPremium = AbstractC14814l.premium(i);
            sb.append("\nkind: ");
            sb.append(strPremium);
            throw new IllegalStateException(sb.toString());
        }
        InterfaceC17477l interfaceC17477l = (InterfaceC17477l) interfaceC8371l;
        C4142l c4142l = (C4142l) interfaceC4884l;
        if (i == 0) {
            m1501l(13);
            throw null;
        }
        C4142l c4142l2 = new C4142l(interfaceC17477l, c4142l, interfaceC3841l, this.f12195l, i, interfaceC5706l);
        Boolean bool = this.f8513l;
        bool.getClass();
        c4142l2.f8513l = bool;
        Boolean bool2 = this.f8512l;
        bool2.getClass();
        c4142l2.f8512l = bool2;
        return c4142l2;
    }
}

package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lِْ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12167l extends AbstractC4901l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C2868l f24174l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C10633l f24175l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final InterfaceC3841l f24176l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final InterfaceC4815l f24177l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12167l(C16412l c16412l, InterfaceC17477l interfaceC17477l, AbstractC15211l abstractC15211l, C3498l c3498l, InterfaceC4815l interfaceC4815l, InterfaceC3841l interfaceC3841l, InterfaceC5706l interfaceC5706l) {
        super(c16412l, interfaceC17477l, c3498l, interfaceC5706l);
        if (c16412l == null) {
            advert(6);
            throw null;
        }
        if (interfaceC17477l == null) {
            advert(7);
            throw null;
        }
        if (abstractC15211l == null) {
            advert(8);
            throw null;
        }
        if (c3498l == null) {
            advert(9);
            throw null;
        }
        if (interfaceC4815l == null) {
            advert(10);
            throw null;
        }
        this.f24176l = interfaceC3841l;
        this.f24174l = new C2868l(this, Collections.EMPTY_LIST, Collections.singleton(abstractC15211l), c16412l);
        this.f24175l = new C10633l(this, c16412l);
        this.f24177l = interfaceC4815l;
    }

    public static /* synthetic */ void advert(int i) {
        String str;
        int i2;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[1] = "getTypeConstructor";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[1] = "getKind";
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static C12167l inmobi(C16412l c16412l, InterfaceC17477l interfaceC17477l, C3498l c3498l, C2278l c2278l, InterfaceC3841l interfaceC3841l, InterfaceC5706l interfaceC5706l) {
        if (c16412l == null) {
            advert(0);
            throw null;
        }
        if (interfaceC17477l == null) {
            advert(1);
            throw null;
        }
        if (c3498l == null) {
            advert(2);
            throw null;
        }
        if (c2278l != null) {
            return new C12167l(c16412l, interfaceC17477l, interfaceC17477l.ad(), c3498l, c2278l, interfaceC3841l, interfaceC5706l);
        }
        advert(3);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l
    public final Collection adcel() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        advert(16);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC5436l, defpackage.InterfaceC10389l
    public final C6561l admob() {
        return AbstractC6004l.purchase;
    }

    @Override // defpackage.InterfaceC17477l
    public final boolean ads() {
        return false;
    }

    @Override // defpackage.InterfaceC5436l
    /* JADX INFO: renamed from: case */
    public final boolean mo750case() {
        return false;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: final */
    public final C5786l mo751final() {
        return null;
    }

    @Override // defpackage.InterfaceC2853l
    public final InterfaceC3841l getAnnotations() {
        InterfaceC3841l interfaceC3841l = this.f24176l;
        if (interfaceC3841l != null) {
            return interfaceC3841l;
        }
        advert(21);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC10607l
    public final List isVip() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        advert(22);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final int mo752l() {
        return 4;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lؘِٞ */
    public final AbstractC5645l mo753l() {
        return null;
    }

    @Override // defpackage.InterfaceC5436l
    /* JADX INFO: renamed from: lٕٕۤ */
    public final boolean mo754l() {
        return false;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lْٗٔ */
    public final boolean mo755l() {
        return false;
    }

    @Override // defpackage.InterfaceC15234l
    public final InterfaceC1925l metrica() {
        C2868l c2868l = this.f24174l;
        if (c2868l != null) {
            return c2868l;
        }
        advert(17);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: new */
    public final InterfaceC7637l mo756new() {
        return C3198l.loadAd;
    }

    @Override // defpackage.AbstractC11832l
    public final InterfaceC7637l pro(C14945l c14945l) {
        C10633l c10633l = this.f24175l;
        if (c10633l != null) {
            return c10633l;
        }
        advert(14);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l
    public final boolean purchase() {
        return false;
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC5436l
    public final int startapp() {
        return 1;
    }

    @Override // defpackage.InterfaceC10607l
    public final boolean subscription() {
        return false;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: throws */
    public final boolean mo757throws() {
        return false;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: volatile */
    public final boolean mo758volatile() {
        return false;
    }
}

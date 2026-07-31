package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lؗ۟ۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C5188l extends AbstractC4901l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f11253l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int f11254l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public InterfaceC7637l f11255l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public C5786l f11256l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C2868l f11257l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public Set f11258l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5188l(InterfaceC8371l interfaceC8371l, C3498l c3498l, int i, int i2, List list, C16412l c16412l) {
        super(c16412l, interfaceC8371l, c3498l, InterfaceC5706l.f12087l);
        if (interfaceC8371l == null) {
            advert(0);
            throw null;
        }
        if (c3498l == null) {
            advert(1);
            throw null;
        }
        if (i == 0) {
            advert(2);
            throw null;
        }
        if (i2 == 0) {
            advert(3);
            throw null;
        }
        if (c16412l == null) {
            advert(6);
            throw null;
        }
        this.f11253l = i;
        this.f11254l = i2;
        this.f11257l = new C2868l(this, Collections.EMPTY_LIST, list, c16412l);
    }

    public static /* synthetic */ void advert(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[1] = "getVisibility";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.InterfaceC17477l
    public final Collection adcel() {
        Set set = this.f11258l;
        if (set != null) {
            return set;
        }
        advert(11);
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
        return this.f11256l;
    }

    @Override // defpackage.InterfaceC2853l
    public final InterfaceC3841l getAnnotations() {
        return C2782l.f6058l;
    }

    public final void inmobi(InterfaceC7637l interfaceC7637l, Set set, C5786l c5786l) {
        this.f11255l = interfaceC7637l;
        this.f11258l = set;
        this.f11256l = c5786l;
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC10607l
    public final List isVip() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        advert(18);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final int mo752l() {
        int i = this.f11254l;
        if (i != 0) {
            return i;
        }
        advert(15);
        throw null;
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
        C2868l c2868l = this.f11257l;
        if (c2868l != null) {
            return c2868l;
        }
        advert(10);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: new */
    public final InterfaceC7637l mo756new() {
        return C3198l.loadAd;
    }

    @Override // defpackage.AbstractC11832l
    public final InterfaceC7637l pro(C14945l c14945l) {
        InterfaceC7637l interfaceC7637l = this.f11255l;
        if (interfaceC7637l != null) {
            return interfaceC7637l;
        }
        advert(13);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l
    public final boolean purchase() {
        return false;
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC5436l
    public final int startapp() {
        int i = this.f11253l;
        if (i != 0) {
            return i;
        }
        advert(16);
        throw null;
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

    public String toString() {
        return "class " + getName();
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: volatile */
    public final boolean mo758volatile() {
        return false;
    }
}

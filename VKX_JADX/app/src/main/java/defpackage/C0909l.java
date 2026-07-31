package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lًٕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0909l extends AbstractC4901l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C16412l f2576l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f2577l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f2578l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C2868l f2579l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final ArrayList f2580l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C6561l f2581l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public ArrayList f2582l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0909l(C12406l c12406l, C3498l c3498l, C16412l c16412l) {
        super(c16412l, c12406l, c3498l, InterfaceC5706l.f12087l);
        if (c3498l == null) {
            advert(2);
            throw null;
        }
        if (c16412l == null) {
            advert(4);
            throw null;
        }
        this.f2580l = new ArrayList();
        this.f2576l = c16412l;
        this.f2577l = 2;
    }

    public static /* synthetic */ void advert(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                i2 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[1] = "getStaticScope";
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.InterfaceC17477l
    public final Collection adcel() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        advert(13);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC5436l, defpackage.InterfaceC10389l
    public final C6561l admob() {
        C6561l c6561l = this.f2581l;
        if (c6561l != null) {
            return c6561l;
        }
        advert(10);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l
    public final boolean ads() {
        return false;
    }

    @Override // defpackage.InterfaceC5436l
    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final boolean mo750case() {
        return false;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final C5786l mo751final() {
        return null;
    }

    @Override // defpackage.InterfaceC2853l
    public final InterfaceC3841l getAnnotations() {
        return C2782l.f6058l;
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC10607l
    public final List isVip() {
        ArrayList arrayList = this.f2582l;
        if (arrayList != null) {
            return arrayList;
        }
        advert(15);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lٜؓ۠, reason: contains not printable characters */
    public final int mo752l() {
        int i = this.f2577l;
        if (i != 0) {
            return i;
        }
        advert(8);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lؘِٞ, reason: contains not printable characters */
    public final AbstractC5645l mo753l() {
        return null;
    }

    @Override // defpackage.InterfaceC5436l
    /* JADX INFO: renamed from: lٕٕۤ, reason: contains not printable characters */
    public final boolean mo754l() {
        return false;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lْٗٔ, reason: contains not printable characters */
    public final boolean mo755l() {
        return false;
    }

    @Override // defpackage.InterfaceC15234l
    public final InterfaceC1925l metrica() {
        C2868l c2868l = this.f2579l;
        if (c2868l != null) {
            return c2868l;
        }
        advert(11);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: new, reason: not valid java name */
    public final InterfaceC7637l mo756new() {
        return C3198l.loadAd;
    }

    @Override // defpackage.AbstractC11832l
    public final InterfaceC7637l pro(C14945l c14945l) {
        return C3198l.loadAd;
    }

    @Override // defpackage.InterfaceC17477l
    public final boolean purchase() {
        return false;
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC5436l
    public final int startapp() {
        int i = this.f2578l;
        if (i != 0) {
            return i;
        }
        advert(7);
        throw null;
    }

    @Override // defpackage.InterfaceC10607l
    public final boolean subscription() {
        return false;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final boolean mo757throws() {
        return false;
    }

    public final String toString() {
        return AbstractC2775l.m1246l(this);
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final boolean mo758volatile() {
        return false;
    }
}

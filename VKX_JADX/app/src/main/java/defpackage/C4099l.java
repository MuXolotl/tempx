package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٌؖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C4099l extends C13437l implements InterfaceC8731l {

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final boolean f8436l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public final C8195l f8437l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4099l(InterfaceC8371l interfaceC8371l, InterfaceC3841l interfaceC3841l, int i, C6561l c6561l, boolean z, C3498l c3498l, InterfaceC5706l interfaceC5706l, InterfaceC10696l interfaceC10696l, int i2, boolean z2, C8195l c8195l) {
        super(interfaceC8371l, interfaceC10696l, interfaceC3841l, i, c6561l, z, c3498l, i2, interfaceC5706l, false, false, false, false, false);
        if (interfaceC8371l == null) {
            m1489l(0);
            throw null;
        }
        if (interfaceC3841l == null) {
            m1489l(1);
            throw null;
        }
        if (i == 0) {
            m1489l(2);
            throw null;
        }
        if (c6561l == null) {
            m1489l(3);
            throw null;
        }
        if (c3498l == null) {
            m1489l(4);
            throw null;
        }
        if (interfaceC5706l == null) {
            m1489l(5);
            throw null;
        }
        if (i2 == 0) {
            m1489l(6);
            throw null;
        }
        this.f8436l = z2;
        this.f8437l = c8195l;
    }

    /* JADX INFO: renamed from: lًٍّ, reason: contains not printable characters */
    public static C4099l m1488l(InterfaceC8371l interfaceC8371l, C12544l c12544l, C6561l c6561l, boolean z, C3498l c3498l, C11197l c11197l, boolean z2) {
        if (interfaceC8371l == null) {
            m1489l(7);
            throw null;
        }
        if (c3498l != null) {
            return new C4099l(interfaceC8371l, c12544l, 1, c6561l, z, c3498l, c11197l, null, 1, z2, null);
        }
        m1489l(11);
        throw null;
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static /* synthetic */ void m1489l(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[0] = "newName";
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // defpackage.C13437l, defpackage.InterfaceC11661l
    public final Object applovin(C0941l c0941l) {
        C8195l c8195l = this.f8437l;
        if (c8195l == null || !((C0941l) c8195l.f17098l).equals(c0941l)) {
            return null;
        }
        return c8195l.f17097l;
    }

    @Override // defpackage.AbstractC9792l, defpackage.InterfaceC11661l
    /* JADX INFO: renamed from: for */
    public final boolean mo1473for() {
        return false;
    }

    @Override // defpackage.C13437l
    /* JADX INFO: renamed from: lؖٔؓ */
    public final C13437l mo1004l(InterfaceC8371l interfaceC8371l, int i, C6561l c6561l, InterfaceC10696l interfaceC10696l, int i2, C3498l c3498l) {
        if (interfaceC8371l == null) {
            m1489l(13);
            throw null;
        }
        if (i == 0) {
            m1489l(14);
            throw null;
        }
        if (c6561l == null) {
            m1489l(15);
            throw null;
        }
        if (i2 == 0) {
            m1489l(16);
            throw null;
        }
        if (c3498l == null) {
            m1489l(17);
            throw null;
        }
        return new C4099l(interfaceC8371l, getAnnotations(), i, c6561l, this.f26357l, c3498l, InterfaceC5706l.f12087l, interfaceC10696l, i2, this.f8436l, this.f8437l);
    }

    @Override // defpackage.InterfaceC8731l
    /* JADX INFO: renamed from: lٖؖ۠, reason: contains not printable characters */
    public final InterfaceC8731l mo1490l(AbstractC18041l abstractC18041l, ArrayList arrayList, AbstractC18041l abstractC18041l2, C8195l c8195l) {
        C11425l c11425l;
        C1710l c1710l;
        if (abstractC18041l2 == null) {
            m1489l(20);
            throw null;
        }
        InterfaceC10696l interfaceC10696lMo864l = mo864l() == this ? null : mo864l();
        C4099l c4099l = new C4099l(Signature(), getAnnotations(), startapp(), admob(), this.f26357l, getName(), billing(), interfaceC10696lMo864l, mo367while(), this.f8436l, c8195l);
        C11425l c11425l2 = this.f26362l;
        if (c11425l2 != null) {
            C11425l c11425l3 = new C11425l(c4099l, c11425l2.getAnnotations(), c11425l2.startapp(), c11425l2.admob(), c11425l2.f8330l, c11425l2.f8325l, c11425l2.f8327l, mo367while(), interfaceC10696lMo864l == null ? null : interfaceC10696lMo864l.crashlytics(), c11425l2.billing());
            c11425l3.f8324l = c11425l2.f8324l;
            c11425l3.f22991l = abstractC18041l2;
            c11425l = c11425l3;
        } else {
            c11425l = null;
        }
        C1710l c1710l2 = this.f26365l;
        if (c1710l2 != null) {
            C1710l c1710l3 = c1710l2;
            c1710l = new C1710l(c4099l, c1710l2.getAnnotations(), c1710l3.startapp(), c1710l3.admob(), c1710l3.f8330l, c1710l3.f8325l, c1710l3.f8327l, mo367while(), interfaceC10696lMo864l == null ? null : interfaceC10696lMo864l.amazon(), c1710l2.billing());
            c1710l.f8324l = c1710l.f8324l;
            C17538l c17538l = (C17538l) c1710l2.mo1007finally().get(0);
            if (c17538l == null) {
                C1710l.m1006l(6);
                throw null;
            }
            c1710l.f4098l = c17538l;
        } else {
            c1710l = null;
        }
        c4099l.m3647l(c11425l, c1710l, this.f26368l, this.f26354l);
        Function0 function0 = this.f26370l;
        if (function0 != null) {
            c4099l.m3645l(this.f26360l, function0);
        }
        c4099l.mo365l(license());
        c4099l.m3646l(abstractC18041l2, getTypeParameters(), this.f26358l, abstractC18041l != null ? AbstractC6689l.firebase(this, abstractC18041l, C2782l.f6058l) : null, C2580l.f5619l);
        return c4099l;
    }

    @Override // defpackage.C13437l, defpackage.InterfaceC11764l
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final boolean mo1492synchronized() {
        AbstractC18041l abstractC18041lYandex = yandex();
        if (!this.f8436l) {
            return false;
        }
        if (((!AbstractC16860l.m4207throws(abstractC18041lYandex) && !AbstractC4056l.yandex(abstractC18041lYandex)) || AbstractC12008l.purchase(abstractC18041lYandex)) && !AbstractC16860l.m4204package(abstractC18041lYandex)) {
            return false;
        }
        C2172l c2172l = AbstractC6110l.yandex;
        return !C13772l.f26883l.m3761l(abstractC18041lYandex, AbstractC6830l.ads) || AbstractC16860l.m4204package(abstractC18041lYandex);
    }

    @Override // defpackage.C13437l
    /* JADX INFO: renamed from: lًَۙ, reason: contains not printable characters */
    public final void mo1491l(AbstractC18041l abstractC18041l) {
    }
}

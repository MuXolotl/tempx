package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lِۚۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12113l extends C17134l implements InterfaceC8731l {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public static final C0941l f24088l = new C0941l();

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public static final C0941l f24089l = new C0941l();

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public int f24090l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public final boolean f24091l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12113l(InterfaceC8371l interfaceC8371l, C17134l c17134l, InterfaceC3841l interfaceC3841l, C3498l c3498l, int i, InterfaceC5706l interfaceC5706l, boolean z) {
        super(interfaceC8371l, c17134l, interfaceC3841l, c3498l, i, interfaceC5706l);
        if (interfaceC8371l == null) {
            m3358l(0);
            throw null;
        }
        if (interfaceC3841l == null) {
            m3358l(1);
            throw null;
        }
        if (c3498l == null) {
            m3358l(2);
            throw null;
        }
        if (i == 0) {
            m3358l(3);
            throw null;
        }
        this.f24090l = 0;
        this.f24091l = z;
    }

    /* JADX INFO: renamed from: lٖٓۧ, reason: contains not printable characters */
    public static C12113l m3357l(InterfaceC8371l interfaceC8371l, C12544l c12544l, C3498l c3498l, C11197l c11197l, boolean z) {
        if (interfaceC8371l == null) {
            m3358l(5);
            throw null;
        }
        if (c3498l != null) {
            return new C12113l(interfaceC8371l, null, c12544l, c3498l, 1, c11197l, z);
        }
        m3358l(7);
        throw null;
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static /* synthetic */ void m3358l(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.AbstractC10175l, defpackage.InterfaceC11661l
    /* JADX INFO: renamed from: for */
    public final boolean mo1473for() {
        return AbstractC2812l.subs(this.f24090l);
    }

    /* JADX INFO: renamed from: lؒۡۦ, reason: contains not printable characters */
    public final void m3359l(boolean z, boolean z2) {
        int i;
        if (z) {
            i = z2 ? 4 : 2;
        } else {
            i = z2 ? 3 : 1;
        }
        this.f24090l = i;
    }

    @Override // defpackage.C17134l, defpackage.AbstractC10175l
    /* JADX INFO: renamed from: lؖٔؓ */
    public final AbstractC10175l mo680l(int i, InterfaceC3841l interfaceC3841l, InterfaceC8371l interfaceC8371l, InterfaceC4884l interfaceC4884l, C3498l c3498l, InterfaceC5706l interfaceC5706l) {
        if (interfaceC8371l == null) {
            m3358l(14);
            throw null;
        }
        if (i == 0) {
            m3358l(15);
            throw null;
        }
        if (interfaceC3841l == null) {
            m3358l(16);
            throw null;
        }
        C17134l c17134l = (C17134l) interfaceC4884l;
        if (c3498l == null) {
            c3498l = getName();
        }
        C12113l c12113l = new C12113l(interfaceC8371l, c17134l, interfaceC3841l, c3498l, i, interfaceC5706l, this.f24091l);
        int i2 = this.f24090l;
        boolean z = false;
        if (i2 != 1) {
            if (i2 == 2) {
                z = true;
            } else if (i2 != 3) {
                if (i2 != 4) {
                    throw null;
                }
                z = true;
            }
        }
        c12113l.m3359l(z, AbstractC2812l.subs(i2));
        return c12113l;
    }

    @Override // defpackage.InterfaceC8731l
    /* JADX INFO: renamed from: lٖؖ۠ */
    public final InterfaceC8731l mo1490l(AbstractC18041l abstractC18041l, ArrayList arrayList, AbstractC18041l abstractC18041l2, C8195l c8195l) {
        if (abstractC18041l2 == null) {
            m3358l(20);
            throw null;
        }
        ArrayList arrayListLoadAd = AbstractC16947l.loadAd(arrayList, mo1007finally(), this);
        C7073l c7073lFirebase = abstractC18041l == null ? null : AbstractC6689l.firebase(this, abstractC18041l, C2782l.f6058l);
        C18220l c18220lM2898l = m2898l(C2201l.loadAd);
        c18220lM2898l.f35670l = arrayListLoadAd;
        c18220lM2898l.f35687l = abstractC18041l2;
        c18220lM2898l.f35685l = c7073lFirebase;
        c18220lM2898l.f35674l = true;
        c18220lM2898l.f35681l = true;
        C12113l c12113l = (C12113l) c18220lM2898l.f35675l.mo768l(c18220lM2898l);
        if (c8195l != null) {
            c12113l.m2897l((C0941l) c8195l.f17098l, c8195l.f17097l);
        }
        if (c12113l != null) {
            return c12113l;
        }
        m3358l(21);
        throw null;
    }

    @Override // defpackage.C17134l
    /* JADX INFO: renamed from: lًٖۘ, reason: contains not printable characters */
    public final C17134l mo3360l(C7073l c7073l, C7073l c7073l2, List list, List list2, List list3, AbstractC18041l abstractC18041l, int i, C6561l c6561l, Map map) {
        C11954l c11954l;
        if (list == null) {
            m3358l(9);
            throw null;
        }
        if (list2 == null) {
            m3358l(10);
            throw null;
        }
        if (list3 == null) {
            m3358l(11);
            throw null;
        }
        if (c6561l == null) {
            m3358l(12);
            throw null;
        }
        super.mo3360l(c7073l, c7073l2, list, list2, list3, abstractC18041l, i, c6561l, map);
        for (C9420l c9420l : AbstractC10357l.yandex) {
            C11155l c11155l = c9420l.loadAd;
            C3498l c3498l = c9420l.yandex;
            if (c3498l == null || AbstractC8576l.yandex(getName(), c3498l)) {
                if (c11155l == null || c11155l.amazon(getName().loadAd())) {
                    Collection collection = c9420l.crashlytics;
                    if (collection == null || collection.contains(getName())) {
                        for (InterfaceC4121l interfaceC4121l : c9420l.purchase) {
                            if (interfaceC4121l.crashlytics(this) != null) {
                                c11954l = new C11954l(false);
                                this.f20730l = c11954l.yandex;
                                return this;
                            }
                        }
                        c11954l = ((String) c9420l.amazon.invoke(this)) != null ? new C11954l(false) : C11954l.crashlytics;
                        this.f20730l = c11954l.yandex;
                        return this;
                    }
                }
            }
        }
        c11954l = C11954l.loadAd;
        this.f20730l = c11954l.yandex;
        return this;
    }
}

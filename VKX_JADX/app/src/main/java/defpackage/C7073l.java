package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lؚؗۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7073l extends AbstractC2775l implements InterfaceC12657l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC8371l f14819l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f14820l = 1;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final InterfaceC16011l f14821l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7073l(InterfaceC8371l interfaceC8371l, Cgoto cgoto, InterfaceC3841l interfaceC3841l, C3498l c3498l) {
        super(interfaceC3841l, c3498l);
        if (interfaceC8371l == null) {
            m2165l(3);
            throw null;
        }
        if (interfaceC3841l == null) {
            m2165l(5);
            throw null;
        }
        if (c3498l == null) {
            m2165l(6);
            throw null;
        }
        this.f14819l = interfaceC8371l;
        this.f14821l = cgoto;
    }

    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public static /* synthetic */ void m2165l(int i) {
        String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: lًٔۘ, reason: contains not printable characters */
    public static /* synthetic */ void m2166l(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static /* synthetic */ void m2167l(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.InterfaceC8371l
    public final InterfaceC8371l Signature() {
        int i = this.f14820l;
        InterfaceC8371l interfaceC8371l = this.f14819l;
        switch (i) {
            case 0:
                InterfaceC17477l interfaceC17477l = (InterfaceC17477l) interfaceC8371l;
                if (interfaceC17477l != null) {
                    return interfaceC17477l;
                }
                m2167l(2);
                throw null;
            default:
                if (interfaceC8371l != null) {
                    return interfaceC8371l;
                }
                m2165l(8);
                throw null;
        }
    }

    @Override // defpackage.InterfaceC10389l
    public final C6561l admob() {
        return AbstractC6004l.billing;
    }

    @Override // defpackage.InterfaceC10233l
    public final InterfaceC5706l billing() {
        return InterfaceC5706l.f12087l;
    }

    @Override // defpackage.InterfaceC11661l
    /* JADX INFO: renamed from: finally */
    public final List mo1007finally() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m2166l(7);
        throw null;
    }

    @Override // defpackage.InterfaceC11661l
    /* JADX INFO: renamed from: for */
    public final boolean mo1473for() {
        return false;
    }

    @Override // defpackage.InterfaceC11661l
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m2166l(5);
        throw null;
    }

    @Override // defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: import */
    public final Object mo1008import(InterfaceC15600l interfaceC15600l, Object obj) {
        return interfaceC15600l.billing(this, obj);
    }

    @Override // defpackage.InterfaceC11661l
    public final Collection license() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        m2166l(8);
        throw null;
    }

    @Override // defpackage.InterfaceC10900l
    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C7073l isPro(C2201l c2201l) {
        if (c2201l == null) {
            m2166l(3);
            throw null;
        }
        if (!c2201l.yandex.purchase()) {
            AbstractC18041l abstractC18041lAdmob = Signature() instanceof InterfaceC17477l ? c2201l.admob(3, yandex()) : c2201l.admob(1, yandex());
            if (abstractC18041lAdmob == null) {
                return null;
            }
            if (abstractC18041lAdmob != yandex()) {
                return new C7073l(Signature(), new C11637l(abstractC18041lAdmob), getAnnotations());
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public final InterfaceC16011l m2169l() {
        int i = this.f14820l;
        InterfaceC16011l interfaceC16011l = this.f14821l;
        switch (i) {
            case 0:
                C11572l c11572l = (C11572l) interfaceC16011l;
                if (c11572l != null) {
                    return c11572l;
                }
                m2167l(1);
                throw null;
            default:
                Cgoto cgoto = (Cgoto) interfaceC16011l;
                if (cgoto != null) {
                    return cgoto;
                }
                m2165l(7);
                throw null;
        }
    }

    @Override // defpackage.InterfaceC11661l
    /* JADX INFO: renamed from: return */
    public final C7073l mo1479return() {
        return null;
    }

    @Override // defpackage.InterfaceC11661l
    public final AbstractC18041l smaato() {
        return yandex();
    }

    @Override // defpackage.AbstractC2775l, defpackage.Cgoto
    public String toString() {
        switch (this.f14820l) {
            case 0:
                return "class " + ((InterfaceC17477l) this.f14819l).getName() + "::this";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.Cgoto, defpackage.InterfaceC16011l
    public final AbstractC18041l yandex() {
        AbstractC18041l abstractC18041lYandex = m2169l().yandex();
        if (abstractC18041lYandex != null) {
            return abstractC18041lYandex;
        }
        m2166l(6);
        throw null;
    }

    @Override // defpackage.AbstractC2775l, defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: loadAd */
    public final InterfaceC8371l mo864l() {
        return this;
    }

    @Override // defpackage.AbstractC2775l, defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: loadAd */
    public final InterfaceC11661l mo864l() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7073l(InterfaceC8371l interfaceC8371l, Cgoto cgoto, InterfaceC3841l interfaceC3841l) {
        this(interfaceC8371l, cgoto, interfaceC3841l, AbstractC13589l.amazon);
        if (interfaceC8371l == null) {
            m2165l(0);
            throw null;
        }
        if (interfaceC3841l != null) {
        } else {
            m2165l(2);
            throw null;
        }
    }

    public C7073l(InterfaceC17477l interfaceC17477l) {
        super(C2782l.f6058l, AbstractC13589l.amazon);
        this.f14819l = interfaceC17477l;
        this.f14821l = new C11572l(interfaceC17477l);
    }
}

package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٍۚؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9792l extends AbstractC1281l implements InterfaceC11764l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public AbstractC18041l f19969l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9792l(InterfaceC8371l interfaceC8371l, InterfaceC3841l interfaceC3841l, C3498l c3498l, AbstractC18041l abstractC18041l, InterfaceC5706l interfaceC5706l) {
        super(interfaceC8371l, interfaceC3841l, c3498l, interfaceC5706l);
        if (interfaceC8371l == null) {
            m2747l(0);
            throw null;
        }
        if (interfaceC3841l == null) {
            m2747l(1);
            throw null;
        }
        if (c3498l == null) {
            m2747l(2);
            throw null;
        }
        if (interfaceC5706l == null) {
            m2747l(3);
            throw null;
        }
        this.f19969l = abstractC18041l;
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static /* synthetic */ void m2747l(int i) {
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
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
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
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.InterfaceC11661l
    /* JADX INFO: renamed from: finally */
    public final List mo1007finally() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m2747l(6);
        throw null;
    }

    /* JADX INFO: renamed from: for */
    public boolean mo1473for() {
        return false;
    }

    @Override // defpackage.InterfaceC11661l
    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m2747l(8);
        throw null;
    }

    @Override // defpackage.InterfaceC11661l
    /* JADX INFO: renamed from: lَٖؔ */
    public List mo1478l() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m2747l(9);
        throw null;
    }

    @Override // defpackage.InterfaceC11661l
    /* JADX INFO: renamed from: return */
    public C7073l mo1479return() {
        return null;
    }

    @Override // defpackage.InterfaceC11661l
    public AbstractC18041l smaato() {
        AbstractC18041l abstractC18041lYandex = yandex();
        if (abstractC18041lYandex != null) {
            return abstractC18041lYandex;
        }
        m2747l(10);
        throw null;
    }

    @Override // defpackage.Cgoto, defpackage.InterfaceC16011l
    public final AbstractC18041l yandex() {
        AbstractC18041l abstractC18041l = this.f19969l;
        if (abstractC18041l != null) {
            return abstractC18041l;
        }
        m2747l(4);
        throw null;
    }
}

package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٍۥ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9940l extends AbstractC12465l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C1461l f20236l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC15719l f20237l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9940l(AbstractC15719l abstractC15719l, C16412l c16412l, C1461l c1461l) {
        super(c16412l);
        if (c16412l == null) {
            admob(0);
            throw null;
        }
        this.f20237l = abstractC15719l;
        this.f20236l = c1461l;
    }

    public static /* synthetic */ void admob(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = "type";
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i == 2) {
            objArr[1] = "getParameters";
        } else if (i == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.AbstractC12465l
    public final C1461l amazon() {
        C1461l c1461l = this.f20236l;
        if (c1461l != null) {
            return c1461l;
        }
        admob(5);
        throw null;
    }

    @Override // defpackage.AbstractC12465l
    public final boolean billing(InterfaceC15234l interfaceC15234l) {
        if (!(interfaceC15234l instanceof InterfaceC16902l)) {
            return false;
        }
        return C7472l.f15462l.admob(this.f20237l, (InterfaceC16902l) interfaceC15234l, true, C15460l.f30247l);
    }

    @Override // defpackage.AbstractC12465l
    public final AbstractC18041l crashlytics() {
        return C8741l.loadAd(EnumC5123l.f11126l, new String[0]);
    }

    @Override // defpackage.InterfaceC1925l
    public final List getParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        admob(2);
        throw null;
    }

    @Override // defpackage.AbstractC12465l
    public final Collection loadAd() {
        List listMo3513l = this.f20237l.mo3513l();
        if (listMo3513l != null) {
            return listMo3513l;
        }
        admob(1);
        throw null;
    }

    @Override // defpackage.AbstractC12465l
    public final List mopub(List list) {
        List listMo4107l = this.f20237l.mo4107l(list);
        if (listMo4107l != null) {
            return listMo4107l;
        }
        admob(8);
        throw null;
    }

    @Override // defpackage.InterfaceC1925l
    public final boolean premium() {
        return true;
    }

    @Override // defpackage.InterfaceC1925l
    public final InterfaceC15234l pro() {
        return this.f20237l;
    }

    @Override // defpackage.InterfaceC1925l
    public final AbstractC16860l subs() {
        AbstractC16860l abstractC16860lPurchase = AbstractC3759l.purchase(this.f20237l);
        if (abstractC16860lPurchase != null) {
            return abstractC16860lPurchase;
        }
        admob(4);
        throw null;
    }

    public final String toString() {
        return this.f20237l.getName().f7384l;
    }
}

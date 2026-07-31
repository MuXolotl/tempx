package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: lؔۙؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2868l extends AbstractC6799l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final AbstractC11832l f6232l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Collection f6233l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final List f6234l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2868l(AbstractC11832l abstractC11832l, List list, Collection collection, C16412l c16412l) {
        super(c16412l);
        if (list == null) {
            admob(1);
            throw null;
        }
        if (collection == null) {
            admob(2);
            throw null;
        }
        if (c16412l == null) {
            admob(3);
            throw null;
        }
        this.f6232l = abstractC11832l;
        this.f6234l = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.f6233l = DesugarCollections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void admob(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.AbstractC12465l
    public final C1461l amazon() {
        return C1461l.f3652l;
    }

    @Override // defpackage.InterfaceC1925l
    public final List getParameters() {
        List list = this.f6234l;
        if (list != null) {
            return list;
        }
        admob(4);
        throw null;
    }

    @Override // defpackage.AbstractC6799l
    /* JADX INFO: renamed from: isPro */
    public final InterfaceC17477l pro() {
        AbstractC11832l abstractC11832l = this.f6232l;
        if (abstractC11832l != null) {
            return abstractC11832l;
        }
        admob(5);
        throw null;
    }

    @Override // defpackage.AbstractC12465l
    public final Collection loadAd() {
        Collection collection = this.f6233l;
        if (collection != null) {
            return collection;
        }
        admob(6);
        throw null;
    }

    @Override // defpackage.InterfaceC1925l
    public final boolean premium() {
        return true;
    }

    public final String toString() {
        return AbstractC11125l.billing(this.f6232l).yandex;
    }
}

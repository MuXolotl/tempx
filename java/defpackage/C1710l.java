package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lًؓ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1710l extends AbstractC4042l implements InterfaceC10138l {

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C1710l f4097l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public C17538l f4098l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1710l(InterfaceC10696l interfaceC10696l, InterfaceC3841l interfaceC3841l, int i, C6561l c6561l, boolean z, boolean z2, boolean z3, int i2, C1710l c1710l, InterfaceC5706l interfaceC5706l) {
        super(i, c6561l, interfaceC10696l, interfaceC3841l, C3498l.mopub("<set-" + interfaceC10696l.getName() + ">"), z, z2, z3, i2, interfaceC5706l);
        if (interfaceC3841l == null) {
            m1006l(1);
            throw null;
        }
        if (i == 0) {
            m1006l(2);
            throw null;
        }
        if (c6561l == null) {
            m1006l(3);
            throw null;
        }
        if (i2 == 0) {
            m1006l(4);
            throw null;
        }
        if (interfaceC5706l == null) {
            m1006l(5);
            throw null;
        }
        this.f4097l = c1710l != null ? c1710l : this;
    }

    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public static C17538l m1005l(C1710l c1710l, AbstractC18041l abstractC18041l, InterfaceC3841l interfaceC3841l) {
        if (abstractC18041l == null) {
            m1006l(8);
            throw null;
        }
        if (interfaceC3841l != null) {
            return new C17538l(c1710l, null, 0, interfaceC3841l, AbstractC13589l.mopub, abstractC18041l, false, false, false, null, InterfaceC5706l.f12087l);
        }
        m1006l(9);
        throw null;
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static /* synthetic */ void m1006l(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.InterfaceC11661l
    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final List mo1007finally() {
        C17538l c17538l = this.f4098l;
        if (c17538l == null) {
            C18073l.admob();
            return null;
        }
        List listSingletonList = Collections.singletonList(c17538l);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        m1006l(11);
        throw null;
    }

    @Override // defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final Object mo1008import(InterfaceC15600l interfaceC15600l, Object obj) {
        return interfaceC15600l.isPro(this, obj);
    }

    @Override // defpackage.InterfaceC0207l, defpackage.InterfaceC11661l
    public final Collection license() {
        return m1476l(false);
    }

    @Override // defpackage.AbstractC1281l
    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C1710l mo864l() {
        C1710l c1710l = this.f4097l;
        if (c1710l != null) {
            return c1710l;
        }
        m1006l(13);
        throw null;
    }

    @Override // defpackage.InterfaceC11661l
    public final AbstractC18041l smaato() {
        return AbstractC3759l.purchase(this).pro();
    }
}

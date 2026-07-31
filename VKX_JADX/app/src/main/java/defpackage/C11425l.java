package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lُۢۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11425l extends AbstractC4042l implements InterfaceC10138l {

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C11425l f22990l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public AbstractC18041l f22991l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11425l(InterfaceC10696l interfaceC10696l, InterfaceC3841l interfaceC3841l, int i, C6561l c6561l, boolean z, boolean z2, boolean z3, int i2, C11425l c11425l, InterfaceC5706l interfaceC5706l) {
        super(i, c6561l, interfaceC10696l, interfaceC3841l, C3498l.mopub("<get-" + interfaceC10696l.getName() + ">"), z, z2, z3, i2, interfaceC5706l);
        if (interfaceC3841l == null) {
            m3084l(1);
            throw null;
        }
        if (i == 0) {
            m3084l(2);
            throw null;
        }
        if (c6561l == null) {
            m3084l(3);
            throw null;
        }
        if (i2 == 0) {
            m3084l(4);
            throw null;
        }
        if (interfaceC5706l == null) {
            m3084l(5);
            throw null;
        }
        this.f22990l = c11425l != null ? c11425l : this;
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static /* synthetic */ void m3084l(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
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
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.InterfaceC11661l
    /* JADX INFO: renamed from: finally */
    public final List mo1007finally() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m3084l(7);
        throw null;
    }

    @Override // defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: import */
    public final Object mo1008import(InterfaceC15600l interfaceC15600l, Object obj) {
        return interfaceC15600l.yandex(this, obj);
    }

    @Override // defpackage.InterfaceC0207l, defpackage.InterfaceC11661l
    public final Collection license() {
        return m1476l(true);
    }

    @Override // defpackage.AbstractC1281l
    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C11425l mo864l() {
        C11425l c11425l = this.f22990l;
        if (c11425l != null) {
            return c11425l;
        }
        m3084l(8);
        throw null;
    }

    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    public final void m3086l(AbstractC18041l abstractC18041l) {
        if (abstractC18041l == null) {
            abstractC18041l = m1477l().yandex();
        }
        this.f22991l = abstractC18041l;
    }

    @Override // defpackage.InterfaceC11661l
    public final AbstractC18041l smaato() {
        return this.f22991l;
    }
}

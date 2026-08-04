package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٕٖٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15719l extends AbstractC1281l implements InterfaceC16902l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f30884l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int f30885l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C2278l f30886l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C2278l f30887l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f30888l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C16412l f30889l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC15719l(C16412l c16412l, InterfaceC8371l interfaceC8371l, InterfaceC3841l interfaceC3841l, C3498l c3498l, int i, boolean z, int i2, C1461l c1461l) {
        super(interfaceC8371l, interfaceC3841l, c3498l, InterfaceC5706l.f12087l);
        int i3 = 0;
        if (c16412l == null) {
            m4106l(0);
            throw null;
        }
        if (interfaceC8371l == null) {
            m4106l(1);
            throw null;
        }
        if (interfaceC3841l == null) {
            m4106l(2);
            throw null;
        }
        if (c3498l == null) {
            m4106l(3);
            throw null;
        }
        if (i == 0) {
            m4106l(4);
            throw null;
        }
        if (c1461l == null) {
            m4106l(6);
            throw null;
        }
        this.f30888l = i;
        this.f30884l = z;
        this.f30885l = i2;
        this.f30887l = new C2278l(c16412l, new C17749l(this, c16412l, c1461l));
        this.f30886l = new C2278l(c16412l, new C0340l(this, c3498l, i3));
        this.f30889l = c16412l;
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static /* synthetic */ void m4106l(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
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
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.InterfaceC15234l
    public final AbstractC15211l ad() {
        AbstractC15211l abstractC15211l = (AbstractC15211l) this.f30886l.invoke();
        if (abstractC15211l != null) {
            return abstractC15211l;
        }
        m4106l(10);
        throw null;
    }

    @Override // defpackage.InterfaceC16902l
    /* JADX INFO: renamed from: extends */
    public final boolean mo2180extends() {
        return this.f30884l;
    }

    @Override // defpackage.InterfaceC16902l
    public final int getIndex() {
        return this.f30885l;
    }

    @Override // defpackage.InterfaceC16902l
    public final List getUpperBounds() {
        List listPurchase = ((C9940l) metrica()).yandex();
        if (listPurchase != null) {
            return listPurchase;
        }
        m4106l(8);
        throw null;
    }

    @Override // defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: import */
    public final Object mo1008import(InterfaceC15600l interfaceC15600l, Object obj) {
        return interfaceC15600l.amazon(this, obj);
    }

    /* JADX INFO: renamed from: lؖٙؖ */
    public abstract List mo3513l();

    @Override // defpackage.InterfaceC16902l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final boolean mo2181l() {
        return false;
    }

    @Override // defpackage.InterfaceC16902l
    /* JADX INFO: renamed from: lْ٘ۚ */
    public final int mo2182l() {
        int i = this.f30888l;
        if (i != 0) {
            return i;
        }
        m4106l(7);
        throw null;
    }

    @Override // defpackage.InterfaceC16902l, defpackage.InterfaceC15234l
    public final InterfaceC1925l metrica() {
        InterfaceC1925l interfaceC1925l = (InterfaceC1925l) this.f30887l.invoke();
        if (interfaceC1925l != null) {
            return interfaceC1925l;
        }
        m4106l(9);
        throw null;
    }

    @Override // defpackage.InterfaceC16902l
    /* JADX INFO: renamed from: protected */
    public final C16412l mo2183protected() {
        C16412l c16412l = this.f30889l;
        if (c16412l != null) {
            return c16412l;
        }
        m4106l(14);
        throw null;
    }

    @Override // defpackage.AbstractC1281l, defpackage.AbstractC2775l, defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: loadAd */
    public final InterfaceC8371l mo864l() {
        return this;
    }

    @Override // defpackage.AbstractC1281l, defpackage.AbstractC2775l, defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: loadAd */
    public final InterfaceC16902l mo864l() {
        return this;
    }

    @Override // defpackage.AbstractC1281l, defpackage.AbstractC2775l, defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: loadAd */
    public final InterfaceC15234l mo864l() {
        return this;
    }

    @Override // defpackage.AbstractC1281l
    /* JADX INFO: renamed from: lًٔۘ */
    public final InterfaceC10233l mo864l() {
        return this;
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public List mo4107l(List list) {
        return list;
    }
}

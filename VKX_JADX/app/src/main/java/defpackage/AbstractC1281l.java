package defpackage;

/* JADX INFO: renamed from: lؒۘؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1281l extends AbstractC2775l implements InterfaceC10233l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC5706l f3329l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC8371l f3330l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1281l(InterfaceC8371l interfaceC8371l, InterfaceC3841l interfaceC3841l, C3498l c3498l, InterfaceC5706l interfaceC5706l) {
        super(interfaceC3841l, c3498l);
        if (interfaceC8371l == null) {
            m863l(0);
            throw null;
        }
        if (interfaceC3841l == null) {
            m863l(1);
            throw null;
        }
        if (c3498l == null) {
            m863l(2);
            throw null;
        }
        if (interfaceC5706l == null) {
            m863l(3);
            throw null;
        }
        this.f3330l = interfaceC8371l;
        this.f3329l = interfaceC5706l;
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static /* synthetic */ void m863l(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.InterfaceC8371l
    public InterfaceC8371l Signature() {
        InterfaceC8371l interfaceC8371l = this.f3330l;
        if (interfaceC8371l != null) {
            return interfaceC8371l;
        }
        m863l(5);
        throw null;
    }

    @Override // defpackage.InterfaceC10233l
    public InterfaceC5706l billing() {
        InterfaceC5706l interfaceC5706l = this.f3329l;
        if (interfaceC5706l != null) {
            return interfaceC5706l;
        }
        m863l(6);
        throw null;
    }

    @Override // defpackage.AbstractC2775l, defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: lًٔۘ, reason: contains not printable characters */
    public InterfaceC10233l mo864l() {
        return this;
    }
}

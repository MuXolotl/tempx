package defpackage;

/* JADX INFO: renamed from: lًٍؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5534l extends AbstractC15719l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5534l(C16412l c16412l, InterfaceC8371l interfaceC8371l, InterfaceC3841l interfaceC3841l, C3498l c3498l, int i, boolean z, int i2, C1461l c1461l) {
        super(c16412l, interfaceC8371l, interfaceC3841l, c3498l, i, z, i2, c1461l);
        if (c16412l == null) {
            m1827l(0);
            throw null;
        }
        if (interfaceC8371l == null) {
            m1827l(1);
            throw null;
        }
        if (i == 0) {
            m1827l(4);
            throw null;
        }
        if (c1461l != null) {
        } else {
            m1827l(6);
            throw null;
        }
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static /* synthetic */ void m1827l(int i) {
        Object[] objArr = new Object[3];
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
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.AbstractC2775l, defpackage.Cgoto
    public final String toString() {
        return (this.f30884l ? "reified " : "") + (mo2182l() != 1 ? AbstractC12589l.m3423private(mo2182l()).concat(" ") : "") + getName();
    }
}

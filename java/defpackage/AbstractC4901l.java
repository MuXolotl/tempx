package defpackage;

/* JADX INFO: renamed from: lٕؗٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4901l extends AbstractC10170l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC8371l f9997l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final InterfaceC5706l f9998l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4901l(C16412l c16412l, InterfaceC8371l interfaceC8371l, C3498l c3498l, InterfaceC5706l interfaceC5706l) {
        super(c16412l, c3498l);
        if (c16412l == null) {
            advert(0);
            throw null;
        }
        if (interfaceC8371l == null) {
            advert(1);
            throw null;
        }
        if (c3498l == null) {
            advert(2);
            throw null;
        }
        this.f9997l = interfaceC8371l;
        this.f9998l = interfaceC5706l;
    }

    public static /* synthetic */ void advert(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.InterfaceC8371l
    public final InterfaceC8371l Signature() {
        InterfaceC8371l interfaceC8371l = this.f9997l;
        if (interfaceC8371l != null) {
            return interfaceC8371l;
        }
        advert(4);
        throw null;
    }

    @Override // defpackage.InterfaceC10233l
    public final InterfaceC5706l billing() {
        InterfaceC5706l interfaceC5706l = this.f9998l;
        if (interfaceC5706l != null) {
            return interfaceC5706l;
        }
        advert(5);
        throw null;
    }

    @Override // defpackage.InterfaceC5436l
    public boolean vip() {
        return false;
    }
}

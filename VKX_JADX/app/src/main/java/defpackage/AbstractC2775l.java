package defpackage;

/* JADX INFO: renamed from: lؔٝۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2775l extends Cgoto implements InterfaceC8371l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C3498l f6032l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2775l(InterfaceC3841l interfaceC3841l, C3498l c3498l) {
        super(interfaceC3841l);
        if (interfaceC3841l == null) {
            m1247l(0);
            throw null;
        }
        if (c3498l == null) {
            m1247l(1);
            throw null;
        }
        this.f6032l = c3498l;
    }

    /* JADX INFO: renamed from: lٕؖؔ, reason: contains not printable characters */
    public static String m1246l(InterfaceC8371l interfaceC8371l) {
        try {
            return C10822l.purchase.license(interfaceC8371l) + "[" + interfaceC8371l.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC8371l)) + "]";
        } catch (Throwable unused) {
            return interfaceC8371l.getClass().getSimpleName() + " " + interfaceC8371l.getName();
        }
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static /* synthetic */ void m1247l(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.InterfaceC8371l
    public final C3498l getName() {
        C3498l c3498l = this.f6032l;
        if (c3498l != null) {
            return c3498l;
        }
        m1247l(2);
        throw null;
    }

    @Override // defpackage.Cgoto
    public String toString() {
        return m1246l(this);
    }

    /* JADX INFO: renamed from: loadAd */
    public InterfaceC8371l mo864l() {
        return this;
    }
}

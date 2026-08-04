package defpackage;

/* JADX INFO: renamed from: lَؙ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6799l extends AbstractC12465l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6799l(C16412l c16412l) {
        super(c16412l);
        if (c16412l != null) {
        } else {
            admob(0);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public static /* synthetic */ void admob(int i) {
        String str = (i == 1 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i == 2) {
            objArr[0] = "classifier";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i == 3 || i == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i != 1) {
            if (i == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.AbstractC12465l
    public final boolean billing(InterfaceC15234l interfaceC15234l) {
        boolean z;
        if (interfaceC15234l instanceof InterfaceC17477l) {
            InterfaceC17477l interfaceC17477lPro = pro();
            if (!AbstractC8576l.yandex(interfaceC17477lPro.getName(), interfaceC15234l.getName())) {
                z = false;
                break;
            }
            InterfaceC8371l interfaceC8371lSignature = interfaceC17477lPro.Signature();
            InterfaceC8371l interfaceC8371lSignature2 = interfaceC15234l.Signature();
            while (true) {
                if (interfaceC8371lSignature != null && interfaceC8371lSignature2 != null) {
                    if (!(interfaceC8371lSignature instanceof InterfaceC11865l)) {
                        if (!(interfaceC8371lSignature2 instanceof InterfaceC11865l)) {
                            if (interfaceC8371lSignature instanceof InterfaceC9921l) {
                                if (!(interfaceC8371lSignature2 instanceof InterfaceC9921l) || !AbstractC8576l.yandex(((AbstractC3740l) ((InterfaceC9921l) interfaceC8371lSignature)).f7826l, ((AbstractC3740l) ((InterfaceC9921l) interfaceC8371lSignature2)).f7826l)) {
                                    break;
                                }
                            } else if (!(interfaceC8371lSignature2 instanceof InterfaceC9921l) && AbstractC8576l.yandex(interfaceC8371lSignature.getName(), interfaceC8371lSignature2.getName())) {
                                interfaceC8371lSignature = interfaceC8371lSignature.Signature();
                                interfaceC8371lSignature2 = interfaceC8371lSignature2.Signature();
                            }
                        }
                        z = false;
                        break;
                    }
                    z = interfaceC8371lSignature2 instanceof InterfaceC11865l;
                    break;
                }
                z = true;
                break;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC12465l
    public final AbstractC18041l crashlytics() {
        InterfaceC17477l interfaceC17477lPro = pro();
        if (interfaceC17477lPro == null) {
            AbstractC16860l.yandex(107);
            throw null;
        }
        C3498l c3498l = AbstractC16860l.purchase;
        if (AbstractC16860l.loadAd(interfaceC17477lPro, AbstractC3333l.yandex) || AbstractC16860l.loadAd(interfaceC17477lPro, AbstractC3333l.loadAd)) {
            return null;
        }
        return subs().purchase();
    }

    @Override // defpackage.InterfaceC1925l
    /* JADX INFO: renamed from: isPro, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC17477l pro();

    @Override // defpackage.InterfaceC1925l
    public final AbstractC16860l subs() {
        AbstractC16860l abstractC16860lPurchase = AbstractC3759l.purchase(pro());
        if (abstractC16860lPurchase != null) {
            return abstractC16860lPurchase;
        }
        admob(1);
        throw null;
    }
}

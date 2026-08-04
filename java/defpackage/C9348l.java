package defpackage;

/* JADX INFO: renamed from: lٍٖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9348l extends AbstractC14119l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14209l f19180l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f19181l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9348l(InterfaceC14209l interfaceC14209l, int i) {
        super(1);
        this.f19181l = i;
        this.f19180l = interfaceC14209l;
    }

    @Override // defpackage.AbstractC14119l
    public final void amazon(String[] strArr) {
        int i = this.f19181l;
        InterfaceC14209l interfaceC14209l = this.f19180l;
        switch (i) {
            case 0:
                if (strArr == null) {
                    C8339l.metrica("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                } else {
                    ((C14537l) ((C5501l) interfaceC14209l).f11764l).f28474l = strArr;
                }
                break;
            case 1:
                if (strArr == null) {
                    C8339l.metrica("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                } else {
                    ((C14537l) ((C5501l) interfaceC14209l).f11764l).f28473l = strArr;
                }
                break;
            default:
                if (strArr == null) {
                    C8339l.metrica("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                } else {
                    ((C14537l) ((C5008l) interfaceC14209l).f10245l).f28470l = strArr;
                }
                break;
        }
    }
}

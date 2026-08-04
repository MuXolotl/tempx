package defpackage;

/* JADX INFO: renamed from: lٌّۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12480l extends AbstractC14119l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C15053l f24616l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f24617l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12480l(C15053l c15053l, int i) {
        super(1);
        this.f24617l = i;
        this.f24616l = c15053l;
    }

    @Override // defpackage.AbstractC14119l
    public final void amazon(String[] strArr) {
        int i = this.f24617l;
        C15053l c15053l = this.f24616l;
        switch (i) {
            case 0:
                if (strArr == null) {
                    C8339l.metrica("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                } else {
                    ((C14537l) c15053l.f29576l).f28474l = strArr;
                }
                break;
            default:
                if (strArr == null) {
                    C8339l.metrica("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                } else {
                    ((C14537l) c15053l.f29576l).f28473l = strArr;
                }
                break;
        }
    }
}

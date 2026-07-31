package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: lٕؓۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1865l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC1865l f4283l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC1865l f4284l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1865l[] f4285l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final EnumC1275l f4286l;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1865l EF0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1865l EF1;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1865l EF2;

    static {
        EnumC1865l enumC1865l = new EnumC1865l("DOUBLE", 0, EnumC1275l.f3313l);
        EnumC1865l enumC1865l2 = new EnumC1865l("FLOAT", 1, EnumC1275l.f3306l);
        EnumC1275l enumC1275l = EnumC1275l.f3309l;
        EnumC1865l enumC1865l3 = new EnumC1865l("INT64", 2, enumC1275l);
        EnumC1865l enumC1865l4 = new EnumC1865l("UINT64", 3, enumC1275l);
        EnumC1275l enumC1275l2 = EnumC1275l.f3310l;
        EnumC1865l enumC1865l5 = new EnumC1865l("INT32", 4, enumC1275l2);
        EnumC1865l enumC1865l6 = new EnumC1865l("FIXED64", 5, enumC1275l);
        EnumC1865l enumC1865l7 = new EnumC1865l("FIXED32", 6, enumC1275l2);
        EnumC1865l enumC1865l8 = new EnumC1865l("BOOL", 7, EnumC1275l.f3312l);
        EnumC1865l enumC1865l9 = new EnumC1865l("STRING", 8, EnumC1275l.f3315l);
        EnumC1275l enumC1275l3 = EnumC1275l.f3314l;
        EnumC1865l enumC1865l10 = new EnumC1865l("GROUP", 9, enumC1275l3);
        f4284l = enumC1865l10;
        EnumC1865l enumC1865l11 = new EnumC1865l("MESSAGE", 10, enumC1275l3);
        EnumC1865l enumC1865l12 = new EnumC1865l("BYTES", 11, EnumC1275l.f3307l);
        EnumC1865l enumC1865l13 = new EnumC1865l("UINT32", 12, enumC1275l2);
        EnumC1865l enumC1865l14 = new EnumC1865l("ENUM", 13, EnumC1275l.f3308l);
        f4283l = enumC1865l14;
        f4285l = new EnumC1865l[]{enumC1865l, enumC1865l2, enumC1865l3, enumC1865l4, enumC1865l5, enumC1865l6, enumC1865l7, enumC1865l8, enumC1865l9, enumC1865l10, enumC1865l11, enumC1865l12, enumC1865l13, enumC1865l14, new EnumC1865l("SFIXED32", 14, enumC1275l2), new EnumC1865l("SFIXED64", 15, enumC1275l), new EnumC1865l("SINT32", 16, enumC1275l2), new EnumC1865l("SINT64", 17, enumC1275l)};
    }

    public EnumC1865l(String str, int i, EnumC1275l enumC1275l) {
        super(str, i);
        this.f4286l = enumC1275l;
    }

    public static EnumC1865l[] values() {
        return (EnumC1865l[]) f4285l.clone();
    }
}

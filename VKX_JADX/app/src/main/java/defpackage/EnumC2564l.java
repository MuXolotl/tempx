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
/* JADX INFO: renamed from: lِؔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC2564l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC2564l f5569l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final EnumC2564l f5570l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final EnumC2564l f5571l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2564l[] f5572l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f5573l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final EnumC13744l f5574l;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2564l EF0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2564l EF1;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2564l EF2;

    static {
        EnumC2564l enumC2564l = new EnumC2564l("DOUBLE", 0, EnumC13744l.f26831l, 1);
        EnumC2564l enumC2564l2 = new EnumC2564l("FLOAT", 1, EnumC13744l.f26824l, 5);
        EnumC13744l enumC13744l = EnumC13744l.f26827l;
        EnumC2564l enumC2564l3 = new EnumC2564l("INT64", 2, enumC13744l, 0);
        EnumC2564l enumC2564l4 = new EnumC2564l("UINT64", 3, enumC13744l, 0);
        EnumC13744l enumC13744l2 = EnumC13744l.f26828l;
        EnumC2564l enumC2564l5 = new EnumC2564l("INT32", 4, enumC13744l2, 0);
        EnumC2564l enumC2564l6 = new EnumC2564l("FIXED64", 5, enumC13744l, 1);
        EnumC2564l enumC2564l7 = new EnumC2564l("FIXED32", 6, enumC13744l2, 5);
        EnumC2564l enumC2564l8 = new EnumC2564l("BOOL", 7, EnumC13744l.f26830l, 0);
        EnumC2564l enumC2564l9 = new EnumC2564l("STRING", 8, EnumC13744l.f26833l, 2);
        f5569l = enumC2564l9;
        EnumC13744l enumC13744l3 = EnumC13744l.f26832l;
        EnumC2564l enumC2564l10 = new EnumC2564l("GROUP", 9, enumC13744l3, 3);
        f5571l = enumC2564l10;
        EnumC2564l enumC2564l11 = new EnumC2564l("MESSAGE", 10, enumC13744l3, 2);
        f5570l = enumC2564l11;
        f5572l = new EnumC2564l[]{enumC2564l, enumC2564l2, enumC2564l3, enumC2564l4, enumC2564l5, enumC2564l6, enumC2564l7, enumC2564l8, enumC2564l9, enumC2564l10, enumC2564l11, new EnumC2564l("BYTES", 11, EnumC13744l.f26825l, 2), new EnumC2564l("UINT32", 12, enumC13744l2, 0), new EnumC2564l("ENUM", 13, EnumC13744l.f26826l, 0), new EnumC2564l("SFIXED32", 14, enumC13744l2, 5), new EnumC2564l("SFIXED64", 15, enumC13744l, 1), new EnumC2564l("SINT32", 16, enumC13744l2, 0), new EnumC2564l("SINT64", 17, enumC13744l, 0)};
    }

    public EnumC2564l(String str, int i, EnumC13744l enumC13744l, int i2) {
        super(str, i);
        this.f5574l = enumC13744l;
        this.f5573l = i2;
    }

    public static EnumC2564l[] values() {
        return (EnumC2564l[]) f5572l.clone();
    }
}

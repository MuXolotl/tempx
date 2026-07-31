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
/* JADX INFO: renamed from: lؖؗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class EnumC3932l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C7256l f8104l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C2808l f8105l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C1621l f8106l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3932l[] f8107l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f8108l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final EnumC14480l f8109l;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3932l EF0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3932l EF1;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3932l EF2;

    static {
        EnumC3932l enumC3932l = new EnumC3932l("DOUBLE", 0, EnumC14480l.DOUBLE, 1);
        EnumC3932l enumC3932l2 = new EnumC3932l("FLOAT", 1, EnumC14480l.FLOAT, 5);
        EnumC14480l enumC14480l = EnumC14480l.LONG;
        EnumC3932l enumC3932l3 = new EnumC3932l("INT64", 2, enumC14480l, 0);
        EnumC3932l enumC3932l4 = new EnumC3932l("UINT64", 3, enumC14480l, 0);
        EnumC14480l enumC14480l2 = EnumC14480l.INT;
        EnumC3932l enumC3932l5 = new EnumC3932l("INT32", 4, enumC14480l2, 0);
        EnumC3932l enumC3932l6 = new EnumC3932l("FIXED64", 5, enumC14480l, 1);
        EnumC3932l enumC3932l7 = new EnumC3932l("FIXED32", 6, enumC14480l2, 5);
        EnumC3932l enumC3932l8 = new EnumC3932l("BOOL", 7, EnumC14480l.BOOLEAN, 0);
        C7256l c7256l = new C7256l("STRING", 8, EnumC14480l.STRING, 2);
        f8104l = c7256l;
        EnumC14480l enumC14480l3 = EnumC14480l.MESSAGE;
        C1621l c1621l = new C1621l("GROUP", 9, enumC14480l3, 3);
        f8106l = c1621l;
        C2808l c2808l = new C2808l("MESSAGE", 10, enumC14480l3, 2);
        f8105l = c2808l;
        f8107l = new EnumC3932l[]{enumC3932l, enumC3932l2, enumC3932l3, enumC3932l4, enumC3932l5, enumC3932l6, enumC3932l7, enumC3932l8, c7256l, c1621l, c2808l, new C12188l("BYTES", 11, EnumC14480l.BYTE_STRING, 2), new EnumC3932l("UINT32", 12, enumC14480l2, 0), new EnumC3932l("ENUM", 13, EnumC14480l.ENUM, 0), new EnumC3932l("SFIXED32", 14, enumC14480l2, 5), new EnumC3932l("SFIXED64", 15, enumC14480l, 1), new EnumC3932l("SINT32", 16, enumC14480l2, 0), new EnumC3932l("SINT64", 17, enumC14480l, 0)};
    }

    public EnumC3932l(String str, int i, EnumC14480l enumC14480l, int i2) {
        super(str, i);
        this.f8109l = enumC14480l;
        this.f8108l = i2;
    }

    public static EnumC3932l valueOf(String str) {
        return (EnumC3932l) Enum.valueOf(EnumC3932l.class, str);
    }

    public static EnumC3932l[] values() {
        return (EnumC3932l[]) f8107l.clone();
    }
}

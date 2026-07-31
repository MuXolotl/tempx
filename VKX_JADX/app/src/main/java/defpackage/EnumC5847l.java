package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: lؘؙٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5847l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC5847l f12335l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC5847l f12336l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC5847l[] f12337l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final EnumC5847l[] f12338l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f12339l;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC5847l EF0;

    static {
        EnumC11430l enumC11430l = EnumC11430l.DOUBLE;
        EnumC5847l enumC5847l = new EnumC5847l("DOUBLE", 0, 0, 1, enumC11430l);
        EnumC11430l enumC11430l2 = EnumC11430l.FLOAT;
        EnumC5847l enumC5847l2 = new EnumC5847l("FLOAT", 1, 1, 1, enumC11430l2);
        EnumC11430l enumC11430l3 = EnumC11430l.LONG;
        EnumC5847l enumC5847l3 = new EnumC5847l("INT64", 2, 2, 1, enumC11430l3);
        EnumC5847l enumC5847l4 = new EnumC5847l("UINT64", 3, 3, 1, enumC11430l3);
        EnumC11430l enumC11430l4 = EnumC11430l.INT;
        EnumC5847l enumC5847l5 = new EnumC5847l("INT32", 4, 4, 1, enumC11430l4);
        EnumC5847l enumC5847l6 = new EnumC5847l("FIXED64", 5, 5, 1, enumC11430l3);
        EnumC5847l enumC5847l7 = new EnumC5847l("FIXED32", 6, 6, 1, enumC11430l4);
        EnumC11430l enumC11430l5 = EnumC11430l.BOOLEAN;
        EnumC5847l enumC5847l8 = new EnumC5847l("BOOL", 7, 7, 1, enumC11430l5);
        EnumC11430l enumC11430l6 = EnumC11430l.STRING;
        EnumC5847l enumC5847l9 = new EnumC5847l("STRING", 8, 8, 1, enumC11430l6);
        EnumC11430l enumC11430l7 = EnumC11430l.MESSAGE;
        EnumC5847l enumC5847l10 = new EnumC5847l("MESSAGE", 9, 9, 1, enumC11430l7);
        EnumC11430l enumC11430l8 = EnumC11430l.BYTE_STRING;
        EnumC5847l enumC5847l11 = new EnumC5847l("BYTES", 10, 10, 1, enumC11430l8);
        EnumC5847l enumC5847l12 = new EnumC5847l("UINT32", 11, 11, 1, enumC11430l4);
        EnumC11430l enumC11430l9 = EnumC11430l.ENUM;
        EnumC5847l enumC5847l13 = new EnumC5847l("ENUM", 12, 12, 1, enumC11430l9);
        EnumC5847l enumC5847l14 = new EnumC5847l("SFIXED32", 13, 13, 1, enumC11430l4);
        EnumC5847l enumC5847l15 = new EnumC5847l("SFIXED64", 14, 14, 1, enumC11430l3);
        EnumC5847l enumC5847l16 = new EnumC5847l("SINT32", 15, 15, 1, enumC11430l4);
        EnumC5847l enumC5847l17 = new EnumC5847l("SINT64", 16, 16, 1, enumC11430l3);
        EnumC5847l enumC5847l18 = new EnumC5847l("GROUP", 17, 17, 1, enumC11430l7);
        EnumC5847l enumC5847l19 = new EnumC5847l("DOUBLE_LIST", 18, 18, 2, enumC11430l);
        EnumC5847l enumC5847l20 = new EnumC5847l("FLOAT_LIST", 19, 19, 2, enumC11430l2);
        EnumC5847l enumC5847l21 = new EnumC5847l("INT64_LIST", 20, 20, 2, enumC11430l3);
        EnumC5847l enumC5847l22 = new EnumC5847l("UINT64_LIST", 21, 21, 2, enumC11430l3);
        EnumC5847l enumC5847l23 = new EnumC5847l("INT32_LIST", 22, 22, 2, enumC11430l4);
        EnumC5847l enumC5847l24 = new EnumC5847l("FIXED64_LIST", 23, 23, 2, enumC11430l3);
        EnumC5847l enumC5847l25 = new EnumC5847l("FIXED32_LIST", 24, 24, 2, enumC11430l4);
        EnumC5847l enumC5847l26 = new EnumC5847l("BOOL_LIST", 25, 25, 2, enumC11430l5);
        EnumC5847l enumC5847l27 = new EnumC5847l("STRING_LIST", 26, 26, 2, enumC11430l6);
        EnumC5847l enumC5847l28 = new EnumC5847l("MESSAGE_LIST", 27, 27, 2, enumC11430l7);
        EnumC5847l enumC5847l29 = new EnumC5847l("BYTES_LIST", 28, 28, 2, enumC11430l8);
        EnumC5847l enumC5847l30 = new EnumC5847l("UINT32_LIST", 29, 29, 2, enumC11430l4);
        EnumC5847l enumC5847l31 = new EnumC5847l("ENUM_LIST", 30, 30, 2, enumC11430l9);
        EnumC5847l enumC5847l32 = new EnumC5847l("SFIXED32_LIST", 31, 31, 2, enumC11430l4);
        EnumC5847l enumC5847l33 = new EnumC5847l("SFIXED64_LIST", 32, 32, 2, enumC11430l3);
        EnumC5847l enumC5847l34 = new EnumC5847l("SINT32_LIST", 33, 33, 2, enumC11430l4);
        EnumC5847l enumC5847l35 = new EnumC5847l("SINT64_LIST", 34, 34, 2, enumC11430l3);
        EnumC5847l enumC5847l36 = new EnumC5847l("DOUBLE_LIST_PACKED", 35, 35, 3, enumC11430l);
        f12336l = enumC5847l36;
        EnumC5847l enumC5847l37 = new EnumC5847l("FLOAT_LIST_PACKED", 36, 36, 3, enumC11430l2);
        EnumC5847l enumC5847l38 = new EnumC5847l("INT64_LIST_PACKED", 37, 37, 3, enumC11430l3);
        EnumC5847l enumC5847l39 = new EnumC5847l("UINT64_LIST_PACKED", 38, 38, 3, enumC11430l3);
        EnumC5847l enumC5847l40 = new EnumC5847l("INT32_LIST_PACKED", 39, 39, 3, enumC11430l4);
        EnumC5847l enumC5847l41 = new EnumC5847l("FIXED64_LIST_PACKED", 40, 40, 3, enumC11430l3);
        EnumC5847l enumC5847l42 = new EnumC5847l("FIXED32_LIST_PACKED", 41, 41, 3, enumC11430l4);
        EnumC5847l enumC5847l43 = new EnumC5847l("BOOL_LIST_PACKED", 42, 42, 3, enumC11430l5);
        EnumC5847l enumC5847l44 = new EnumC5847l("UINT32_LIST_PACKED", 43, 43, 3, enumC11430l4);
        EnumC5847l enumC5847l45 = new EnumC5847l("ENUM_LIST_PACKED", 44, 44, 3, enumC11430l9);
        EnumC5847l enumC5847l46 = new EnumC5847l("SFIXED32_LIST_PACKED", 45, 45, 3, enumC11430l4);
        EnumC5847l enumC5847l47 = new EnumC5847l("SFIXED64_LIST_PACKED", 46, 46, 3, enumC11430l3);
        EnumC5847l enumC5847l48 = new EnumC5847l("SINT32_LIST_PACKED", 47, 47, 3, enumC11430l4);
        EnumC5847l enumC5847l49 = new EnumC5847l("SINT64_LIST_PACKED", 48, 48, 3, enumC11430l3);
        f12335l = enumC5847l49;
        f12337l = new EnumC5847l[]{enumC5847l, enumC5847l2, enumC5847l3, enumC5847l4, enumC5847l5, enumC5847l6, enumC5847l7, enumC5847l8, enumC5847l9, enumC5847l10, enumC5847l11, enumC5847l12, enumC5847l13, enumC5847l14, enumC5847l15, enumC5847l16, enumC5847l17, enumC5847l18, enumC5847l19, enumC5847l20, enumC5847l21, enumC5847l22, enumC5847l23, enumC5847l24, enumC5847l25, enumC5847l26, enumC5847l27, enumC5847l28, enumC5847l29, enumC5847l30, enumC5847l31, enumC5847l32, enumC5847l33, enumC5847l34, enumC5847l35, enumC5847l36, enumC5847l37, enumC5847l38, enumC5847l39, enumC5847l40, enumC5847l41, enumC5847l42, enumC5847l43, enumC5847l44, enumC5847l45, enumC5847l46, enumC5847l47, enumC5847l48, enumC5847l49, new EnumC5847l("GROUP_LIST", 49, 49, 2, enumC11430l7), new EnumC5847l("MAP", 50, 50, 4, EnumC11430l.VOID)};
        EnumC5847l[] enumC5847lArrValues = values();
        f12338l = new EnumC5847l[enumC5847lArrValues.length];
        for (EnumC5847l enumC5847l50 : enumC5847lArrValues) {
            f12338l[enumC5847l50.f12339l] = enumC5847l50;
        }
    }

    public EnumC5847l(String str, int i, int i2, int i3, EnumC11430l enumC11430l) {
        super(str, i);
        this.f12339l = i2;
        int iInmobi = AbstractC5020l.inmobi(i3);
        if (iInmobi == 1 || iInmobi == 3) {
            enumC11430l.getClass();
        }
        if (i3 == 1) {
            enumC11430l.ordinal();
        }
    }

    public static EnumC5847l valueOf(String str) {
        return (EnumC5847l) Enum.valueOf(EnumC5847l.class, str);
    }

    public static EnumC5847l[] values() {
        return (EnumC5847l[]) f12337l.clone();
    }
}

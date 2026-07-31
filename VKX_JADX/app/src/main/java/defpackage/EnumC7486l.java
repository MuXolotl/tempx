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
/* JADX INFO: renamed from: lؚۙؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7486l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC7486l f15481l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC7486l f15482l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC7486l[] f15483l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final EnumC7486l[] f15484l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f15485l;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC7486l EF0;

    static {
        EnumC2926l enumC2926l = EnumC2926l.DOUBLE;
        EnumC7486l enumC7486l = new EnumC7486l("DOUBLE", 0, 0, 1, enumC2926l);
        EnumC2926l enumC2926l2 = EnumC2926l.FLOAT;
        EnumC7486l enumC7486l2 = new EnumC7486l("FLOAT", 1, 1, 1, enumC2926l2);
        EnumC2926l enumC2926l3 = EnumC2926l.LONG;
        EnumC7486l enumC7486l3 = new EnumC7486l("INT64", 2, 2, 1, enumC2926l3);
        EnumC7486l enumC7486l4 = new EnumC7486l("UINT64", 3, 3, 1, enumC2926l3);
        EnumC2926l enumC2926l4 = EnumC2926l.INT;
        EnumC7486l enumC7486l5 = new EnumC7486l("INT32", 4, 4, 1, enumC2926l4);
        EnumC7486l enumC7486l6 = new EnumC7486l("FIXED64", 5, 5, 1, enumC2926l3);
        EnumC7486l enumC7486l7 = new EnumC7486l("FIXED32", 6, 6, 1, enumC2926l4);
        EnumC2926l enumC2926l5 = EnumC2926l.BOOLEAN;
        EnumC7486l enumC7486l8 = new EnumC7486l("BOOL", 7, 7, 1, enumC2926l5);
        EnumC2926l enumC2926l6 = EnumC2926l.STRING;
        EnumC7486l enumC7486l9 = new EnumC7486l("STRING", 8, 8, 1, enumC2926l6);
        EnumC2926l enumC2926l7 = EnumC2926l.MESSAGE;
        EnumC7486l enumC7486l10 = new EnumC7486l("MESSAGE", 9, 9, 1, enumC2926l7);
        EnumC2926l enumC2926l8 = EnumC2926l.BYTE_STRING;
        EnumC7486l enumC7486l11 = new EnumC7486l("BYTES", 10, 10, 1, enumC2926l8);
        EnumC7486l enumC7486l12 = new EnumC7486l("UINT32", 11, 11, 1, enumC2926l4);
        EnumC2926l enumC2926l9 = EnumC2926l.ENUM;
        EnumC7486l enumC7486l13 = new EnumC7486l("ENUM", 12, 12, 1, enumC2926l9);
        EnumC7486l enumC7486l14 = new EnumC7486l("SFIXED32", 13, 13, 1, enumC2926l4);
        EnumC7486l enumC7486l15 = new EnumC7486l("SFIXED64", 14, 14, 1, enumC2926l3);
        EnumC7486l enumC7486l16 = new EnumC7486l("SINT32", 15, 15, 1, enumC2926l4);
        EnumC7486l enumC7486l17 = new EnumC7486l("SINT64", 16, 16, 1, enumC2926l3);
        EnumC7486l enumC7486l18 = new EnumC7486l("GROUP", 17, 17, 1, enumC2926l7);
        EnumC7486l enumC7486l19 = new EnumC7486l("DOUBLE_LIST", 18, 18, 2, enumC2926l);
        EnumC7486l enumC7486l20 = new EnumC7486l("FLOAT_LIST", 19, 19, 2, enumC2926l2);
        EnumC7486l enumC7486l21 = new EnumC7486l("INT64_LIST", 20, 20, 2, enumC2926l3);
        EnumC7486l enumC7486l22 = new EnumC7486l("UINT64_LIST", 21, 21, 2, enumC2926l3);
        EnumC7486l enumC7486l23 = new EnumC7486l("INT32_LIST", 22, 22, 2, enumC2926l4);
        EnumC7486l enumC7486l24 = new EnumC7486l("FIXED64_LIST", 23, 23, 2, enumC2926l3);
        EnumC7486l enumC7486l25 = new EnumC7486l("FIXED32_LIST", 24, 24, 2, enumC2926l4);
        EnumC7486l enumC7486l26 = new EnumC7486l("BOOL_LIST", 25, 25, 2, enumC2926l5);
        EnumC7486l enumC7486l27 = new EnumC7486l("STRING_LIST", 26, 26, 2, enumC2926l6);
        EnumC7486l enumC7486l28 = new EnumC7486l("MESSAGE_LIST", 27, 27, 2, enumC2926l7);
        EnumC7486l enumC7486l29 = new EnumC7486l("BYTES_LIST", 28, 28, 2, enumC2926l8);
        EnumC7486l enumC7486l30 = new EnumC7486l("UINT32_LIST", 29, 29, 2, enumC2926l4);
        EnumC7486l enumC7486l31 = new EnumC7486l("ENUM_LIST", 30, 30, 2, enumC2926l9);
        EnumC7486l enumC7486l32 = new EnumC7486l("SFIXED32_LIST", 31, 31, 2, enumC2926l4);
        EnumC7486l enumC7486l33 = new EnumC7486l("SFIXED64_LIST", 32, 32, 2, enumC2926l3);
        EnumC7486l enumC7486l34 = new EnumC7486l("SINT32_LIST", 33, 33, 2, enumC2926l4);
        EnumC7486l enumC7486l35 = new EnumC7486l("SINT64_LIST", 34, 34, 2, enumC2926l3);
        EnumC7486l enumC7486l36 = new EnumC7486l("DOUBLE_LIST_PACKED", 35, 35, 3, enumC2926l);
        f15482l = enumC7486l36;
        EnumC7486l enumC7486l37 = new EnumC7486l("FLOAT_LIST_PACKED", 36, 36, 3, enumC2926l2);
        EnumC7486l enumC7486l38 = new EnumC7486l("INT64_LIST_PACKED", 37, 37, 3, enumC2926l3);
        EnumC7486l enumC7486l39 = new EnumC7486l("UINT64_LIST_PACKED", 38, 38, 3, enumC2926l3);
        EnumC7486l enumC7486l40 = new EnumC7486l("INT32_LIST_PACKED", 39, 39, 3, enumC2926l4);
        EnumC7486l enumC7486l41 = new EnumC7486l("FIXED64_LIST_PACKED", 40, 40, 3, enumC2926l3);
        EnumC7486l enumC7486l42 = new EnumC7486l("FIXED32_LIST_PACKED", 41, 41, 3, enumC2926l4);
        EnumC7486l enumC7486l43 = new EnumC7486l("BOOL_LIST_PACKED", 42, 42, 3, enumC2926l5);
        EnumC7486l enumC7486l44 = new EnumC7486l("UINT32_LIST_PACKED", 43, 43, 3, enumC2926l4);
        EnumC7486l enumC7486l45 = new EnumC7486l("ENUM_LIST_PACKED", 44, 44, 3, enumC2926l9);
        EnumC7486l enumC7486l46 = new EnumC7486l("SFIXED32_LIST_PACKED", 45, 45, 3, enumC2926l4);
        EnumC7486l enumC7486l47 = new EnumC7486l("SFIXED64_LIST_PACKED", 46, 46, 3, enumC2926l3);
        EnumC7486l enumC7486l48 = new EnumC7486l("SINT32_LIST_PACKED", 47, 47, 3, enumC2926l4);
        EnumC7486l enumC7486l49 = new EnumC7486l("SINT64_LIST_PACKED", 48, 48, 3, enumC2926l3);
        f15481l = enumC7486l49;
        f15483l = new EnumC7486l[]{enumC7486l, enumC7486l2, enumC7486l3, enumC7486l4, enumC7486l5, enumC7486l6, enumC7486l7, enumC7486l8, enumC7486l9, enumC7486l10, enumC7486l11, enumC7486l12, enumC7486l13, enumC7486l14, enumC7486l15, enumC7486l16, enumC7486l17, enumC7486l18, enumC7486l19, enumC7486l20, enumC7486l21, enumC7486l22, enumC7486l23, enumC7486l24, enumC7486l25, enumC7486l26, enumC7486l27, enumC7486l28, enumC7486l29, enumC7486l30, enumC7486l31, enumC7486l32, enumC7486l33, enumC7486l34, enumC7486l35, enumC7486l36, enumC7486l37, enumC7486l38, enumC7486l39, enumC7486l40, enumC7486l41, enumC7486l42, enumC7486l43, enumC7486l44, enumC7486l45, enumC7486l46, enumC7486l47, enumC7486l48, enumC7486l49, new EnumC7486l("GROUP_LIST", 49, 49, 2, enumC2926l7), new EnumC7486l("MAP", 50, 50, 4, EnumC2926l.VOID)};
        EnumC7486l[] enumC7486lArrValues = values();
        f15484l = new EnumC7486l[enumC7486lArrValues.length];
        for (EnumC7486l enumC7486l50 : enumC7486lArrValues) {
            f15484l[enumC7486l50.f15485l] = enumC7486l50;
        }
    }

    public EnumC7486l(String str, int i, int i2, int i3, EnumC2926l enumC2926l) {
        super(str, i);
        this.f15485l = i2;
        int iInmobi = AbstractC5020l.inmobi(i3);
        if (iInmobi == 1 || iInmobi == 3) {
            enumC2926l.getClass();
        }
        if (i3 == 1) {
            enumC2926l.ordinal();
        }
    }

    public static EnumC7486l valueOf(String str) {
        return (EnumC7486l) Enum.valueOf(EnumC7486l.class, str);
    }

    public static EnumC7486l[] values() {
        return (EnumC7486l[]) f15483l.clone();
    }
}

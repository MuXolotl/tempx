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
/* JADX INFO: renamed from: lَؑٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0222l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC0222l f1190l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC0222l f1191l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0222l[] f1192l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final EnumC0222l[] f1193l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f1194l;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0222l EF0;

    static {
        EnumC10168l enumC10168l = EnumC10168l.DOUBLE;
        EnumC0222l enumC0222l = new EnumC0222l("DOUBLE", 0, 0, 1, enumC10168l);
        EnumC10168l enumC10168l2 = EnumC10168l.FLOAT;
        EnumC0222l enumC0222l2 = new EnumC0222l("FLOAT", 1, 1, 1, enumC10168l2);
        EnumC10168l enumC10168l3 = EnumC10168l.LONG;
        EnumC0222l enumC0222l3 = new EnumC0222l("INT64", 2, 2, 1, enumC10168l3);
        EnumC0222l enumC0222l4 = new EnumC0222l("UINT64", 3, 3, 1, enumC10168l3);
        EnumC10168l enumC10168l4 = EnumC10168l.INT;
        EnumC0222l enumC0222l5 = new EnumC0222l("INT32", 4, 4, 1, enumC10168l4);
        EnumC0222l enumC0222l6 = new EnumC0222l("FIXED64", 5, 5, 1, enumC10168l3);
        EnumC0222l enumC0222l7 = new EnumC0222l("FIXED32", 6, 6, 1, enumC10168l4);
        EnumC10168l enumC10168l5 = EnumC10168l.BOOLEAN;
        EnumC0222l enumC0222l8 = new EnumC0222l("BOOL", 7, 7, 1, enumC10168l5);
        EnumC10168l enumC10168l6 = EnumC10168l.STRING;
        EnumC0222l enumC0222l9 = new EnumC0222l("STRING", 8, 8, 1, enumC10168l6);
        EnumC10168l enumC10168l7 = EnumC10168l.MESSAGE;
        EnumC0222l enumC0222l10 = new EnumC0222l("MESSAGE", 9, 9, 1, enumC10168l7);
        EnumC10168l enumC10168l8 = EnumC10168l.BYTE_STRING;
        EnumC0222l enumC0222l11 = new EnumC0222l("BYTES", 10, 10, 1, enumC10168l8);
        EnumC0222l enumC0222l12 = new EnumC0222l("UINT32", 11, 11, 1, enumC10168l4);
        EnumC10168l enumC10168l9 = EnumC10168l.ENUM;
        EnumC0222l enumC0222l13 = new EnumC0222l("ENUM", 12, 12, 1, enumC10168l9);
        EnumC0222l enumC0222l14 = new EnumC0222l("SFIXED32", 13, 13, 1, enumC10168l4);
        EnumC0222l enumC0222l15 = new EnumC0222l("SFIXED64", 14, 14, 1, enumC10168l3);
        EnumC0222l enumC0222l16 = new EnumC0222l("SINT32", 15, 15, 1, enumC10168l4);
        EnumC0222l enumC0222l17 = new EnumC0222l("SINT64", 16, 16, 1, enumC10168l3);
        EnumC0222l enumC0222l18 = new EnumC0222l("GROUP", 17, 17, 1, enumC10168l7);
        EnumC0222l enumC0222l19 = new EnumC0222l("DOUBLE_LIST", 18, 18, 2, enumC10168l);
        EnumC0222l enumC0222l20 = new EnumC0222l("FLOAT_LIST", 19, 19, 2, enumC10168l2);
        EnumC0222l enumC0222l21 = new EnumC0222l("INT64_LIST", 20, 20, 2, enumC10168l3);
        EnumC0222l enumC0222l22 = new EnumC0222l("UINT64_LIST", 21, 21, 2, enumC10168l3);
        EnumC0222l enumC0222l23 = new EnumC0222l("INT32_LIST", 22, 22, 2, enumC10168l4);
        EnumC0222l enumC0222l24 = new EnumC0222l("FIXED64_LIST", 23, 23, 2, enumC10168l3);
        EnumC0222l enumC0222l25 = new EnumC0222l("FIXED32_LIST", 24, 24, 2, enumC10168l4);
        EnumC0222l enumC0222l26 = new EnumC0222l("BOOL_LIST", 25, 25, 2, enumC10168l5);
        EnumC0222l enumC0222l27 = new EnumC0222l("STRING_LIST", 26, 26, 2, enumC10168l6);
        EnumC0222l enumC0222l28 = new EnumC0222l("MESSAGE_LIST", 27, 27, 2, enumC10168l7);
        EnumC0222l enumC0222l29 = new EnumC0222l("BYTES_LIST", 28, 28, 2, enumC10168l8);
        EnumC0222l enumC0222l30 = new EnumC0222l("UINT32_LIST", 29, 29, 2, enumC10168l4);
        EnumC0222l enumC0222l31 = new EnumC0222l("ENUM_LIST", 30, 30, 2, enumC10168l9);
        EnumC0222l enumC0222l32 = new EnumC0222l("SFIXED32_LIST", 31, 31, 2, enumC10168l4);
        EnumC0222l enumC0222l33 = new EnumC0222l("SFIXED64_LIST", 32, 32, 2, enumC10168l3);
        EnumC0222l enumC0222l34 = new EnumC0222l("SINT32_LIST", 33, 33, 2, enumC10168l4);
        EnumC0222l enumC0222l35 = new EnumC0222l("SINT64_LIST", 34, 34, 2, enumC10168l3);
        EnumC0222l enumC0222l36 = new EnumC0222l("DOUBLE_LIST_PACKED", 35, 35, 3, enumC10168l);
        f1191l = enumC0222l36;
        EnumC0222l enumC0222l37 = new EnumC0222l("FLOAT_LIST_PACKED", 36, 36, 3, enumC10168l2);
        EnumC0222l enumC0222l38 = new EnumC0222l("INT64_LIST_PACKED", 37, 37, 3, enumC10168l3);
        EnumC0222l enumC0222l39 = new EnumC0222l("UINT64_LIST_PACKED", 38, 38, 3, enumC10168l3);
        EnumC0222l enumC0222l40 = new EnumC0222l("INT32_LIST_PACKED", 39, 39, 3, enumC10168l4);
        EnumC0222l enumC0222l41 = new EnumC0222l("FIXED64_LIST_PACKED", 40, 40, 3, enumC10168l3);
        EnumC0222l enumC0222l42 = new EnumC0222l("FIXED32_LIST_PACKED", 41, 41, 3, enumC10168l4);
        EnumC0222l enumC0222l43 = new EnumC0222l("BOOL_LIST_PACKED", 42, 42, 3, enumC10168l5);
        EnumC0222l enumC0222l44 = new EnumC0222l("UINT32_LIST_PACKED", 43, 43, 3, enumC10168l4);
        EnumC0222l enumC0222l45 = new EnumC0222l("ENUM_LIST_PACKED", 44, 44, 3, enumC10168l9);
        EnumC0222l enumC0222l46 = new EnumC0222l("SFIXED32_LIST_PACKED", 45, 45, 3, enumC10168l4);
        EnumC0222l enumC0222l47 = new EnumC0222l("SFIXED64_LIST_PACKED", 46, 46, 3, enumC10168l3);
        EnumC0222l enumC0222l48 = new EnumC0222l("SINT32_LIST_PACKED", 47, 47, 3, enumC10168l4);
        EnumC0222l enumC0222l49 = new EnumC0222l("SINT64_LIST_PACKED", 48, 48, 3, enumC10168l3);
        f1190l = enumC0222l49;
        f1192l = new EnumC0222l[]{enumC0222l, enumC0222l2, enumC0222l3, enumC0222l4, enumC0222l5, enumC0222l6, enumC0222l7, enumC0222l8, enumC0222l9, enumC0222l10, enumC0222l11, enumC0222l12, enumC0222l13, enumC0222l14, enumC0222l15, enumC0222l16, enumC0222l17, enumC0222l18, enumC0222l19, enumC0222l20, enumC0222l21, enumC0222l22, enumC0222l23, enumC0222l24, enumC0222l25, enumC0222l26, enumC0222l27, enumC0222l28, enumC0222l29, enumC0222l30, enumC0222l31, enumC0222l32, enumC0222l33, enumC0222l34, enumC0222l35, enumC0222l36, enumC0222l37, enumC0222l38, enumC0222l39, enumC0222l40, enumC0222l41, enumC0222l42, enumC0222l43, enumC0222l44, enumC0222l45, enumC0222l46, enumC0222l47, enumC0222l48, enumC0222l49, new EnumC0222l("GROUP_LIST", 49, 49, 2, enumC10168l7), new EnumC0222l("MAP", 50, 50, 4, EnumC10168l.VOID)};
        EnumC0222l[] enumC0222lArrValues = values();
        f1193l = new EnumC0222l[enumC0222lArrValues.length];
        for (EnumC0222l enumC0222l50 : enumC0222lArrValues) {
            f1193l[enumC0222l50.f1194l] = enumC0222l50;
        }
    }

    public EnumC0222l(String str, int i, int i2, int i3, EnumC10168l enumC10168l) {
        super(str, i);
        this.f1194l = i2;
        int iInmobi = AbstractC5020l.inmobi(i3);
        if (iInmobi == 1 || iInmobi == 3) {
            enumC10168l.getClass();
        }
        if (i3 == 1) {
            enumC10168l.ordinal();
        }
    }

    public static EnumC0222l valueOf(String str) {
        return (EnumC0222l) Enum.valueOf(EnumC0222l.class, str);
    }

    public static EnumC0222l[] values() {
        return (EnumC0222l[]) f1192l.clone();
    }
}

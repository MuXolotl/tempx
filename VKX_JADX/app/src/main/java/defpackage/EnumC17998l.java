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
/* JADX INFO: renamed from: lُ٘ٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class EnumC17998l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC17998l f35187l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final EnumC17998l f35188l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC17998l[] f35189l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C0918l f35190l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final EnumC17998l f35191l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C3265l f35192l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f35193l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final EnumC17173l f35194l;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC17998l EF0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC17998l EF1;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC17998l EF2;

    static {
        EnumC17998l enumC17998l = new EnumC17998l("DOUBLE", 0, EnumC17173l.f33351l, 1);
        EnumC17998l enumC17998l2 = new EnumC17998l("FLOAT", 1, EnumC17173l.f33352l, 5);
        EnumC17173l enumC17173l = EnumC17173l.f33346l;
        EnumC17998l enumC17998l3 = new EnumC17998l("INT64", 2, enumC17173l, 0);
        EnumC17998l enumC17998l4 = new EnumC17998l("UINT64", 3, enumC17173l, 0);
        EnumC17173l enumC17173l2 = EnumC17173l.f33349l;
        EnumC17998l enumC17998l5 = new EnumC17998l("INT32", 4, enumC17173l2, 0);
        f35187l = enumC17998l5;
        EnumC17998l enumC17998l6 = new EnumC17998l("FIXED64", 5, enumC17173l, 1);
        EnumC17998l enumC17998l7 = new EnumC17998l("FIXED32", 6, enumC17173l2, 5);
        EnumC17998l enumC17998l8 = new EnumC17998l("BOOL", 7, EnumC17173l.f33354l, 0);
        f35191l = enumC17998l8;
        C15491l c15491l = new C15491l("STRING", 8, EnumC17173l.f33347l, 2);
        EnumC17173l enumC17173l3 = EnumC17173l.f33350l;
        C0918l c0918l = new C0918l("GROUP", 9, enumC17173l3, 3);
        f35190l = c0918l;
        C3265l c3265l = new C3265l("MESSAGE", 10, enumC17173l3, 2);
        f35192l = c3265l;
        C2562l c2562l = new C2562l("BYTES", 11, EnumC17173l.f33348l, 2);
        EnumC17998l enumC17998l9 = new EnumC17998l("UINT32", 12, enumC17173l2, 0);
        EnumC17998l enumC17998l10 = new EnumC17998l("ENUM", 13, EnumC17173l.f33353l, 0);
        f35188l = enumC17998l10;
        f35189l = new EnumC17998l[]{enumC17998l, enumC17998l2, enumC17998l3, enumC17998l4, enumC17998l5, enumC17998l6, enumC17998l7, enumC17998l8, c15491l, c0918l, c3265l, c2562l, enumC17998l9, enumC17998l10, new EnumC17998l("SFIXED32", 14, enumC17173l2, 5), new EnumC17998l("SFIXED64", 15, enumC17173l, 1), new EnumC17998l("SINT32", 16, enumC17173l2, 0), new EnumC17998l("SINT64", 17, enumC17173l, 0)};
    }

    public EnumC17998l(String str, int i, EnumC17173l enumC17173l, int i2) {
        super(str, i);
        this.f35194l = enumC17173l;
        this.f35193l = i2;
    }

    public static EnumC17998l valueOf(String str) {
        return (EnumC17998l) Enum.valueOf(EnumC17998l.class, str);
    }

    public static EnumC17998l[] values() {
        return (EnumC17998l[]) f35189l.clone();
    }

    public boolean yandex() {
        return !(this instanceof C15491l);
    }
}

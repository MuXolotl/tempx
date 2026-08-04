package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'lؗۤؑ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: lٜؖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4244l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final EnumC4244l f8699l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final EnumC4244l f8700l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final EnumC4244l f8701l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final EnumC4244l f8702l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC4244l f8703l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final EnumC4244l f8704l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final EnumC4244l f8705l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final EnumC4244l f8706l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final EnumC4244l f8707l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final EnumC4244l f8708l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final EnumC4244l f8709l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final EnumC4244l f8710l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC4244l[] f8711l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC1388l f8712l;

    static {
        C2336l c2336l = AbstractC18202l.yandex;
        EnumC4244l enumC4244l = new EnumC4244l("BOOL", 0, c2336l.loadAd(Boolean.TYPE));
        f8703l = enumC4244l;
        EnumC4244l enumC4244l2 = new EnumC4244l("INT", 1, c2336l.loadAd(Long.TYPE));
        f8700l = enumC4244l2;
        EnumC4244l enumC4244l3 = new EnumC4244l("STRING", 2, c2336l.loadAd(String.class));
        f8706l = enumC4244l3;
        EnumC4244l enumC4244l4 = new EnumC4244l("BINARY", 3, c2336l.loadAd(byte[].class));
        f8705l = enumC4244l4;
        EnumC4244l enumC4244l5 = new EnumC4244l("OBJECT", 4, c2336l.loadAd(InterfaceC9671l.class));
        f8709l = enumC4244l5;
        EnumC4244l enumC4244l6 = new EnumC4244l("FLOAT", 5, c2336l.loadAd(Float.TYPE));
        f8701l = enumC4244l6;
        EnumC4244l enumC4244l7 = new EnumC4244l("DOUBLE", 6, c2336l.loadAd(Double.TYPE));
        f8702l = enumC4244l7;
        EnumC4244l enumC4244l8 = new EnumC4244l("DECIMAL128", 7, c2336l.loadAd(C15062l.class));
        f8708l = enumC4244l8;
        EnumC4244l enumC4244l9 = new EnumC4244l("TIMESTAMP", 8, c2336l.loadAd(InterfaceC11616l.class));
        f8704l = enumC4244l9;
        EnumC4244l enumC4244l10 = new EnumC4244l("OBJECT_ID", 9, c2336l.loadAd(C17918l.class));
        f8710l = enumC4244l10;
        EnumC4244l enumC4244l11 = new EnumC4244l("UUID", 10, c2336l.loadAd(InterfaceC15393l.class));
        f8707l = enumC4244l11;
        EnumC4244l enumC4244l12 = new EnumC4244l("ANY", 11, c2336l.loadAd(InterfaceC3327l.class));
        f8699l = enumC4244l12;
        f8711l = new EnumC4244l[]{enumC4244l, enumC4244l2, enumC4244l3, enumC4244l4, enumC4244l5, enumC4244l6, enumC4244l7, enumC4244l8, enumC4244l9, enumC4244l10, enumC4244l11, enumC4244l12};
    }

    public EnumC4244l(String str, int i, InterfaceC1388l interfaceC1388l) {
        super(str, i);
        this.f8712l = interfaceC1388l;
    }

    public static EnumC4244l valueOf(String str) {
        return (EnumC4244l) Enum.valueOf(EnumC4244l.class, str);
    }

    public static EnumC4244l[] values() {
        return (EnumC4244l[]) f8711l.clone();
    }
}

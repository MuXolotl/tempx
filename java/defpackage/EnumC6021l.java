package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v33 lؘۡؖ[], still in use, count: 1, list:
  (r2v33 lؘۡؖ[]) from 0x0295: CONSTRUCTOR (r0v48 lِٟٓ) = (r2v33 lؘۡؖ[]) A[MD:(java.lang.Enum[]):void (m)] (LINE:662) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: lؘۡؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6021l {
    CLASS(0),
    ANNOTATION_CLASS(1),
    TYPE_PARAMETER(2),
    PROPERTY(3),
    FIELD(4),
    LOCAL_VARIABLE(5),
    VALUE_PARAMETER(6),
    CONSTRUCTOR(7),
    FUNCTION(8),
    PROPERTY_GETTER(9),
    PROPERTY_SETTER(10),
    TYPE(11),
    /* JADX INFO: Fake field, exist only in values array */
    EXPRESSION(12),
    FILE(13),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(14),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_PROJECTION(15),
    /* JADX INFO: Fake field, exist only in values array */
    STAR_PROJECTION(16),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(17),
    CLASS_ONLY(18),
    OBJECT(19),
    STANDALONE_OBJECT(20),
    COMPANION_OBJECT(21),
    INTERFACE(22),
    ENUM_CLASS(23),
    ENUM_ENTRY(24),
    LOCAL_CLASS(25),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL_FUNCTION(26),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_FUNCTION(27),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_FUNCTION(28),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY(29),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_BACKING_FIELD(30),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_DELEGATE(31),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(32),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY(33),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD(34),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_DELEGATE(35),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(36),
    /* JADX INFO: Fake field, exist only in values array */
    BACKING_FIELD(37),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZER(38),
    /* JADX INFO: Fake field, exist only in values array */
    DESTRUCTURING_DECLARATION(39),
    /* JADX INFO: Fake field, exist only in values array */
    LAMBDA_EXPRESSION(40),
    /* JADX INFO: Fake field, exist only in values array */
    ANONYMOUS_FUNCTION(41),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT_LITERAL(42);


    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final HashMap f12784l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f12787l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f12799l;

    static {
        C14092l c14092l = new C14092l(enumC6021lArr);
        f12787l = c14092l;
        f12784l = new HashMap();
        C11521l c11521l = new C11521l(0, c14092l);
        while (c11521l.hasNext()) {
            EnumC6021l enumC6021l = (EnumC6021l) c11521l.next();
            f12784l.put(enumC6021l.name(), enumC6021l);
        }
        C14092l c14092l2 = f12787l;
        ArrayList arrayList = new ArrayList();
        C11521l c11521l2 = new C11521l(0, c14092l2);
        while (c11521l2.hasNext()) {
            Object next = c11521l2.next();
            if (((EnumC6021l) next).f12799l) {
                arrayList.add(next);
            }
        }
        AbstractC16901l.m4229l(arrayList);
        AbstractC16901l.m4229l(f12787l);
        EnumC6021l enumC6021l2 = CLASS;
        AbstractC14055l.remoteconfig(ANNOTATION_CLASS, enumC6021l2);
        AbstractC14055l.remoteconfig(LOCAL_CLASS, enumC6021l2);
        AbstractC14055l.remoteconfig(CLASS_ONLY, enumC6021l2);
        EnumC6021l enumC6021l3 = OBJECT;
        AbstractC14055l.remoteconfig(COMPANION_OBJECT, enumC6021l3, enumC6021l2);
        AbstractC14055l.remoteconfig(STANDALONE_OBJECT, enumC6021l3, enumC6021l2);
        AbstractC14055l.remoteconfig(INTERFACE, enumC6021l2);
        AbstractC14055l.remoteconfig(ENUM_CLASS, enumC6021l2);
        EnumC6021l enumC6021l4 = PROPERTY;
        EnumC6021l enumC6021l5 = FIELD;
        AbstractC14055l.remoteconfig(ENUM_ENTRY, enumC6021l4, enumC6021l5);
        EnumC6021l enumC6021l6 = PROPERTY_SETTER;
        Collections.singletonList(enumC6021l6);
        EnumC6021l enumC6021l7 = PROPERTY_GETTER;
        Collections.singletonList(enumC6021l7);
        Collections.singletonList(FUNCTION);
        EnumC6021l enumC6021l8 = FILE;
        Collections.singletonList(enumC6021l8);
        EnumC7936l enumC7936l = EnumC7936l.CONSTRUCTOR_PARAMETER;
        EnumC6021l enumC6021l9 = VALUE_PARAMETER;
        AbstractC8676l.remoteconfig(new C8195l(enumC7936l, enumC6021l9), new C8195l(EnumC7936l.FIELD, enumC6021l5), new C8195l(EnumC7936l.PROPERTY, enumC6021l4), new C8195l(EnumC7936l.FILE, enumC6021l8), new C8195l(EnumC7936l.PROPERTY_GETTER, enumC6021l7), new C8195l(EnumC7936l.PROPERTY_SETTER, enumC6021l6), new C8195l(EnumC7936l.RECEIVER, enumC6021l9), new C8195l(EnumC7936l.SETTER_PARAMETER, enumC6021l9), new C8195l(EnumC7936l.PROPERTY_DELEGATE_FIELD, enumC6021l5));
    }

    public EnumC6021l(int i) {
        super(str, i);
        this.f12799l = z;
    }

    public static EnumC6021l valueOf(String str) {
        return (EnumC6021l) Enum.valueOf(EnumC6021l.class, str);
    }

    public static EnumC6021l[] values() {
        return (EnumC6021l[]) f12783l.clone();
    }
}

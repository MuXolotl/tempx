package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v2 lُٞۘ[], still in use, count: 1, list:
  (r11v2 lُٞۘ[]) from 0x0049: CONSTRUCTOR (r11v2 lُٞۘ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:74) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: lُٞۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC11212l {
    INTERNAL(0),
    PRIVATE(1),
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED(2),
    PUBLIC(3),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE_TO_THIS(4),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL(5);


    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f22574l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C5950l f22575l;

    static {
        f22574l = new C14092l(enumC11212lArr);
    }

    public EnumC11212l(int i) {
        super(str, i);
        this.f22575l = new C5950l(AbstractC1305l.amazon, i);
    }

    public static EnumC11212l valueOf(String str) {
        return (EnumC11212l) Enum.valueOf(EnumC11212l.class, str);
    }

    public static EnumC11212l[] values() {
        return (EnumC11212l[]) f22572l.clone();
    }
}

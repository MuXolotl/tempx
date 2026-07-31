package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v4 lؚِ۠[], still in use, count: 1, list:
  (r11v4 lؚِ۠[]) from 0x00b0: CONSTRUCTOR (r11v4 lؚِ۠[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:177) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: lؚِ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC7557l {
    /* JADX INFO: Fake field, exist only in values array */
    JANUARY("Jan"),
    /* JADX INFO: Fake field, exist only in values array */
    FEBRUARY("Feb"),
    /* JADX INFO: Fake field, exist only in values array */
    MARCH("Mar"),
    /* JADX INFO: Fake field, exist only in values array */
    APRIL("Apr"),
    /* JADX INFO: Fake field, exist only in values array */
    MAY("May"),
    /* JADX INFO: Fake field, exist only in values array */
    JUNE("Jun"),
    /* JADX INFO: Fake field, exist only in values array */
    JULY("Jul"),
    /* JADX INFO: Fake field, exist only in values array */
    AUGUST("Aug"),
    /* JADX INFO: Fake field, exist only in values array */
    SEPTEMBER("Sep"),
    /* JADX INFO: Fake field, exist only in values array */
    OCTOBER("Oct"),
    /* JADX INFO: Fake field, exist only in values array */
    NOVEMBER("Nov"),
    /* JADX INFO: Fake field, exist only in values array */
    DECEMBER("Dec");


    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f15554l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f15556l;

    static {
        f15554l = new C14092l(enumC7557lArr);
    }

    public EnumC7557l(String str) {
        super(str, i);
        this.f15556l = str;
    }

    public static EnumC7557l valueOf(String str) {
        return (EnumC7557l) Enum.valueOf(EnumC7557l.class, str);
    }

    public static EnumC7557l[] values() {
        return (EnumC7557l[]) f15555l.clone();
    }
}

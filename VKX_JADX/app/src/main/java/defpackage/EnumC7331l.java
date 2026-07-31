package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v3 lؚٙٓ[], still in use, count: 1, list:
  (r10v3 lؚٙٓ[]) from 0x005b: CONSTRUCTOR (r10v3 lؚٙٓ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:92) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: lؚٙٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC7331l {
    EVERYBODY("all"),
    FRIENDS_AND_FOF("friends_of_friends"),
    FRIENDS("friends"),
    ONLY_ME("only_me"),
    SOME("some"),
    UNKNOWN("");


    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f15198l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f15200l;

    static {
        f15198l = new C14092l(enumC7331lArr);
    }

    public EnumC7331l(String str) {
        super(str, i);
        this.f15200l = str;
    }

    public static EnumC7331l valueOf(String str) {
        return (EnumC7331l) Enum.valueOf(EnumC7331l.class, str);
    }

    public static EnumC7331l[] values() {
        return (EnumC7331l[]) f15194l.clone();
    }
}

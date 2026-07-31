package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 lؚؗۗ[], still in use, count: 1, list:
  (r4v3 lؚؗۗ[]) from 0x003f: CONSTRUCTOR (r4v3 lؚؗۗ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:64) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: lؚؗۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4737l {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');


    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f9758l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final char f9762l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final char f9763l;

    static {
        f9758l = new C14092l(enumC4737lArr);
    }

    public EnumC4737l(char c, char c2) {
        super(str, i);
        this.f9763l = c;
        this.f9762l = c2;
    }

    public static EnumC4737l valueOf(String str) {
        return (EnumC4737l) Enum.valueOf(EnumC4737l.class, str);
    }

    public static EnumC4737l[] values() {
        return (EnumC4737l[]) f9757l.clone();
    }
}

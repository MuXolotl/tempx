package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 lؓٞۡ[], still in use, count: 1, list:
  (r2v3 lؓٞۡ[]) from 0x0023: CONSTRUCTOR (r2v3 lؓٞۡ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:36) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: lؓٞۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC2008l {
    Default("default"),
    TripleRotatedRight("triple_rotated_right");


    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f4530l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f4532l;

    static {
        f4530l = new C14092l(enumC2008lArr);
    }

    public EnumC2008l(String str) {
        super(str, i);
        this.f4532l = str;
    }

    public static EnumC2008l valueOf(String str) {
        return (EnumC2008l) Enum.valueOf(EnumC2008l.class, str);
    }

    public static EnumC2008l[] values() {
        return (EnumC2008l[]) f4531l.clone();
    }
}

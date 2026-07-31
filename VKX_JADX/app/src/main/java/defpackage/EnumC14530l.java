package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v3 lٓۤۛ[], still in use, count: 1, list:
  (r9v3 lٓۤۛ[]) from 0x004d: CONSTRUCTOR (r9v3 lٓۤۛ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:78) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: lٓۤۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC14530l {
    f28443l("(meta) Display debugging features", false),
    f28447l("Token autorefresh", true),
    f28446l("Legacy NextDock", false),
    f28449l("Ignore unknown data", true),
    f28444l("System Resume Playback", false);


    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f28448l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f28450l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f28451l;

    static {
        f28448l = new C14092l(enumC14530lArr);
    }

    public EnumC14530l(String str, boolean z) {
        super(str, i);
        this.f28451l = str;
        this.f28450l = z;
    }

    public static EnumC14530l valueOf(String str) {
        return (EnumC14530l) Enum.valueOf(EnumC14530l.class, str);
    }

    public static EnumC14530l[] values() {
        return (EnumC14530l[]) f28445l.clone();
    }
}

package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v2 lٙۗ[], still in use, count: 1, list:
  (r13v2 lٙۗ[]) from 0x005b: CONSTRUCTOR (r13v2 lٙۗ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:92) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: lٙۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC18401l {
    CLASS(0),
    INTERFACE(1),
    ENUM_CLASS(2),
    ENUM_ENTRY(3),
    ANNOTATION_CLASS(4),
    OBJECT(5),
    COMPANION_OBJECT(6);


    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f35943l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C5950l f35948l;

    static {
        f35943l = new C14092l(enumC18401lArr);
    }

    public EnumC18401l(int i) {
        super(str, i);
        this.f35948l = new C5950l(AbstractC1305l.billing, i);
    }

    public static EnumC18401l valueOf(String str) {
        return (EnumC18401l) Enum.valueOf(EnumC18401l.class, str);
    }

    public static EnumC18401l[] values() {
        return (EnumC18401l[]) f35946l.clone();
    }
}

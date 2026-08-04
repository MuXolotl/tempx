package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v4 lٍؙٞ[], still in use, count: 1, list:
  (r4v4 lٍؙٞ[]) from 0x0031: CONSTRUCTOR (r4v4 lٍؙٞ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:50) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: lٍؙٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6358l {
    /* JADX INFO: Fake field, exist only in values array */
    EF9("Популярные", "main"),
    /* JADX INFO: Fake field, exist only in values array */
    EF21("Топ-песни", "top"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33("Совместные", "featured");


    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f13324l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f13325l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f13326l;

    static {
        f13324l = new C14092l(enumC6358lArr);
    }

    public EnumC6358l(String str, String str2) {
        super(str, i);
        this.f13326l = str;
        this.f13325l = str2;
    }

    public static EnumC6358l valueOf(String str) {
        return (EnumC6358l) Enum.valueOf(EnumC6358l.class, str);
    }

    public static EnumC6358l[] values() {
        return (EnumC6358l[]) f13323l.clone();
    }
}

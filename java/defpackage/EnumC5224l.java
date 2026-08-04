package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v2 lؗۢؒ[], still in use, count: 1, list:
  (r1v2 lؗۢؒ[]) from 0x0015: CONSTRUCTOR (r1v2 lؗۢؒ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:22) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: lؗۢؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5224l {
    /* JADX INFO: Fake field, exist only in values array */
    EF8;


    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f11304l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C7703l f11306l;

    static {
        f11304l = new C14092l(enumC5224lArr);
    }

    public EnumC5224l() {
        super("Vpn", 0);
        this.f11306l = c7703l;
    }

    public static EnumC5224l valueOf(String str) {
        return (EnumC5224l) Enum.valueOf(EnumC5224l.class, str);
    }

    public static EnumC5224l[] values() {
        return (EnumC5224l[]) f11305l.clone();
    }
}

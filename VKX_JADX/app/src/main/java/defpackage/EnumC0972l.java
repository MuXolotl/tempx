package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v2 lُؒؗ[], still in use, count: 1, list:
  (r11v2 lُؒؗ[]) from 0x004f: CONSTRUCTOR (r11v2 lُؒؗ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:80) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: lُؒؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0972l implements InterfaceC16520l {
    CHROMA_TAB(0),
    THICK(1),
    REGULAR(2),
    THIN(3),
    ULTRA_THIN(4),
    CHROMA_NAV(5);


    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C0897l f2682l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f2683l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f2688l;

    static {
        EnumC0972l enumC0972l = CHROMA_TAB;
        f2683l = new C14092l(enumC0972lArr);
        f2682l = new C0897l(1, AbstractC18202l.yandex.loadAd(EnumC0972l.class), 2, enumC0972l);
    }

    public EnumC0972l(int i) {
        super(str, i);
        this.f2688l = i;
    }

    public static EnumC0972l valueOf(String str) {
        return (EnumC0972l) Enum.valueOf(EnumC0972l.class, str);
    }

    public static EnumC0972l[] values() {
        return (EnumC0972l[]) f2686l.clone();
    }

    @Override // defpackage.InterfaceC16520l
    public final int getValue() {
        return this.f2688l;
    }
}

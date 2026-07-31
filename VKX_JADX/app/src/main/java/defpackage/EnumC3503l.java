package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v2 lْؕٛ[], still in use, count: 1, list:
  (r9v2 lْؕٛ[]) from 0x0043: CONSTRUCTOR (r9v2 lْؕٛ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:68) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: lْؕٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3503l implements InterfaceC16520l {
    BLUR_ARTWORK(0),
    VIBRANT_COLOR(1),
    STATIC_WHITE(2),
    STATIC_DARK(3),
    STATIC_BLACK(4);


    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C13083l f7397l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f7400l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f7402l;

    static {
        EnumC3503l enumC3503l = BLUR_ARTWORK;
        f7400l = new C14092l(enumC3503lArr);
        f7397l = new C13083l(1, AbstractC18202l.yandex.loadAd(EnumC3503l.class), 2, enumC3503l);
    }

    public EnumC3503l(int i) {
        super(str, i);
        this.f7402l = i;
    }

    public static EnumC3503l valueOf(String str) {
        return (EnumC3503l) Enum.valueOf(EnumC3503l.class, str);
    }

    public static EnumC3503l[] values() {
        return (EnumC3503l[]) f7396l.clone();
    }

    @Override // defpackage.InterfaceC16520l
    public final int getValue() {
        return this.f7402l;
    }
}

package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v2 lٓۜٓ[], still in use, count: 1, list:
  (r7v2 lٓۜٓ[]) from 0x0037: CONSTRUCTOR (r7v2 lٓۜٓ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:56) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: lٓۜٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC14435l implements InterfaceC16520l {
    VK(0),
    GENIUS(1),
    MUSIXMATCH(2),
    LRCLIB(3);


    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f28276l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C14397l f28277l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f28281l;

    static {
        EnumC14435l enumC14435l = VK;
        f28276l = new C14092l(enumC14435lArr);
        f28277l = new C14397l(1, AbstractC18202l.yandex.loadAd(EnumC14435l.class), 2, enumC14435l);
    }

    public EnumC14435l(int i) {
        super(str, i);
        this.f28281l = i;
    }

    public static EnumC14435l valueOf(String str) {
        return (EnumC14435l) Enum.valueOf(EnumC14435l.class, str);
    }

    public static EnumC14435l[] values() {
        return (EnumC14435l[]) f28275l.clone();
    }

    @Override // defpackage.InterfaceC16520l
    public final int getValue() {
        return this.f28281l;
    }
}

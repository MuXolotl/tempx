package defpackage;

import ua.itaysonlab.vkx.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v3 lٗٙۙ[], still in use, count: 1, list:
  (r10v3 lٗٙۙ[]) from 0x0057: CONSTRUCTOR (r10v3 lٗٙۙ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:88) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: lٗٙۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC17214l {
    Default(R.string.library_sort_order_default),
    /* JADX INFO: Fake field, exist only in values array */
    Invert(R.string.library_sort_order_inverse),
    /* JADX INFO: Fake field, exist only in values array */
    Title(R.string.library_sort_order_title),
    /* JADX INFO: Fake field, exist only in values array */
    TitleInvert(R.string.library_sort_order_title_inverse),
    /* JADX INFO: Fake field, exist only in values array */
    Subtitle(R.string.library_sort_order_author),
    /* JADX INFO: Fake field, exist only in values array */
    SubtitleInvert(R.string.library_sort_order_author_inverse);


    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f33416l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f33417l;

    static {
        f33416l = new C14092l(enumC17214lArr);
    }

    public EnumC17214l(int i) {
        super(str, i);
        this.f33417l = i;
    }

    public static EnumC17214l valueOf(String str) {
        return (EnumC17214l) Enum.valueOf(EnumC17214l.class, str);
    }

    public static EnumC17214l[] values() {
        return (EnumC17214l[]) f33414l.clone();
    }
}

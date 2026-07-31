package defpackage;

import ua.itaysonlab.vkx.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 lّؓؔ[], still in use, count: 1, list:
  (r2v3 lّؓؔ[]) from 0x002b: CONSTRUCTOR (r2v3 lّؓؔ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:44) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: lّؓؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC12334l {
    f24418l(R.string.uma_header_mix_type_vk_desc, "Vk"),
    f24420l(R.string.uma_header_mix_type_uma_desc, "Uma");


    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f24421l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f24422l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f24423l;

    static {
        f24421l = new C14092l(enumC12334lArr);
    }

    public EnumC12334l(int i, String str) {
        super(str, i);
        this.f24423l = i;
        this.f24422l = i;
    }

    public static EnumC12334l valueOf(String str) {
        return (EnumC12334l) Enum.valueOf(EnumC12334l.class, str);
    }

    public static EnumC12334l[] values() {
        return (EnumC12334l[]) f24419l.clone();
    }
}

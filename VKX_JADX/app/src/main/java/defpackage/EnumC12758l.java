package defpackage;

import android.graphics.Color;
import ua.itaysonlab.vkx.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v6 lّٟٝ[], still in use, count: 1, list:
  (r2v6 lّٟٝ[]) from 0x0080: CONSTRUCTOR (r2v6 lّٟٝ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:129) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: lّٟٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12758l {
    /* JADX INFO: Fake field, exist only in values array */
    NEW_RELEASE(0, R.drawable.ic_new_16, 0),
    /* JADX INFO: Fake field, exist only in values array */
    NO_CHANGE(1, R.drawable.ic_minus_16, Color.parseColor("#A3ADB8")),
    /* JADX INFO: Fake field, exist only in values array */
    MOVED_UP(2, R.drawable.ic_arrow_triangle_up_16, Color.parseColor("#4BB34B")),
    /* JADX INFO: Fake field, exist only in values array */
    MOVED_DOWN(3, R.drawable.ic_arrow_triangle_down_16, Color.parseColor("#FF3347")),
    /* JADX INFO: Fake field, exist only in values array */
    CROWN(4, R.drawable.ic_crown_16, Color.parseColor("#FFA000")),
    UNKNOWN(-1, R.drawable.ic_minus_16, Color.parseColor("#A3ADB8"));


    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f25137l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f25138l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f25139l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f25140l;

    static {
        f25137l = new C14092l(enumC12758lArr);
    }

    public EnumC12758l(int i, int i2, int i3) {
        super(str, i);
        this.f25140l = i;
        this.f25139l = i2;
        this.f25138l = i3;
    }

    public static EnumC12758l valueOf(String str) {
        return (EnumC12758l) Enum.valueOf(EnumC12758l.class, str);
    }

    public static EnumC12758l[] values() {
        return (EnumC12758l[]) f25135l.clone();
    }
}

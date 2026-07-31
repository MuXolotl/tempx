package defpackage;

import ua.itaysonlab.vkx.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v3 lٍٜۜ[], still in use, count: 1, list:
  (r8v3 lٍٜۜ[]) from 0x004a: CONSTRUCTOR (r8v3 lٍٜۜ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:75) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: lٍٜۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC9700l {
    TITLE(R.string.local_sort_title),
    /* JADX INFO: Fake field, exist only in values array */
    ARTIST(R.string.local_sort_artist),
    /* JADX INFO: Fake field, exist only in values array */
    ALBUM(R.string.local_sort_album),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_ADDED(R.string.local_sort_date_add),
    /* JADX INFO: Fake field, exist only in values array */
    YEAR(R.string.local_sort_year);


    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f19782l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f19783l;

    static {
        f19782l = new C14092l(enumC9700lArr);
    }

    public EnumC9700l(int i) {
        super(str, i);
        this.f19783l = i;
    }

    public static EnumC9700l valueOf(String str) {
        return (EnumC9700l) Enum.valueOf(EnumC9700l.class, str);
    }

    public static EnumC9700l[] values() {
        return (EnumC9700l[]) f19780l.clone();
    }
}

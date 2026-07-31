package defpackage;

import ua.itaysonlab.vkx.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v3 lؙۤ۟[], still in use, count: 1, list:
  (r6v3 lؙۤ۟[]) from 0x003d: CONSTRUCTOR (r6v3 lؙۤ۟[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:62) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: lؙۤ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6863l {
    TITLE(R.string.local_sort_title),
    /* JADX INFO: Fake field, exist only in values array */
    ARTIST(R.string.local_sort_artist),
    /* JADX INFO: Fake field, exist only in values array */
    SONG_NUMBER(R.string.local_sort_songnum),
    /* JADX INFO: Fake field, exist only in values array */
    YEAR(R.string.local_sort_year);


    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f14355l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f14356l;

    static {
        f14355l = new C14092l(enumC6863lArr);
    }

    public EnumC6863l(int i) {
        super(str, i);
        this.f14356l = i;
    }

    public static EnumC6863l valueOf(String str) {
        return (EnumC6863l) Enum.valueOf(EnumC6863l.class, str);
    }

    public static EnumC6863l[] values() {
        return (EnumC6863l[]) f14353l.clone();
    }
}

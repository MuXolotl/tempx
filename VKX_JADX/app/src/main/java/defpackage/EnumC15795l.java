package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v3 lٕٛۧ[], still in use, count: 1, list:
  (r10v3 lٕٛۧ[]) from 0x004f: CONSTRUCTOR (r10v3 lٕٛۧ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:80) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: lٕٛۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC15795l {
    /* JADX INFO: Fake field, exist only in values array */
    ALBUM("album"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYLIST("playlist"),
    /* JADX INFO: Fake field, exist only in values array */
    TRACK_MIX("track_mix"),
    /* JADX INFO: Fake field, exist only in values array */
    ARTIST_MIX("artist_mix"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYLIST_MIX("_playlist_mix"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN("");


    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f31011l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f31013l;

    static {
        f31011l = new C14092l(enumC15795lArr);
    }

    public EnumC15795l(String str) {
        super(str, i);
        this.f31013l = str;
    }

    public static EnumC15795l valueOf(String str) {
        return (EnumC15795l) Enum.valueOf(EnumC15795l.class, str);
    }

    public static EnumC15795l[] values() {
        return (EnumC15795l[]) f31012l.clone();
    }
}

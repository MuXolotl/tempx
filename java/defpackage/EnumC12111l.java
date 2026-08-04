package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v3 lِۣۚ[], still in use, count: 1, list:
  (r7v3 lِۣۚ[]) from 0x00ba: CONSTRUCTOR (r7v3 lِۣۚ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:187) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: lِۣۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC12111l {
    f24075l("VKX_HOME", "Главная"),
    f24080l("VKX_SEARCH", "Поиск"),
    f24079l("UMA_RADIO", "Радио"),
    f24083l("VKX_LIBRARY", "Библиотека"),
    f24076l("VKX_MENU", "Меню"),
    f24077l("OP_TRACKS", "Треки"),
    f24082l("OP_ALBUMS", "Альбомы"),
    f24078l("OP_ARTISTS", "Исполнители"),
    f24084l("AUTH", "Вход"),
    f24081l("AUTH_V2", "Вход");


    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f24085l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f24086l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f24087l;

    static {
        f24085l = new C14092l(enumC12111lArr);
    }

    public EnumC12111l(String str, String str2) {
        super(str, i);
        this.f24087l = str2;
        this.f24086l = i;
    }

    public static EnumC12111l valueOf(String str) {
        return (EnumC12111l) Enum.valueOf(EnumC12111l.class, str);
    }

    public static EnumC12111l[] values() {
        return (EnumC12111l[]) f24074l.clone();
    }
}

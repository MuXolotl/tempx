package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v7 lٗٝۛ[], still in use, count: 1, list:
  (r6v7 lٗٝۛ[]) from 0x0073: CONSTRUCTOR (r6v7 lٗٝۛ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:116) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: lٗٝۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC17281l {
    /* JADX INFO: Fake field, exist only in values array */
    VTLite("VTLite", "https://github.com/vtosters/lite/releases", "0.4.16", true),
    /* JADX INFO: Fake field, exist only in values array */
    Sova("SOVA V RE", "https://t.me/sovav", "0.9b", true),
    /* JADX INFO: Fake field, exist only in values array */
    MP3Mod("VK mp3 mod", "https://t.me/vkmp3mod", "113/744", true),
    /* JADX INFO: Fake field, exist only in values array */
    VkTea("VK Tea", "https://t.me/vk_tea", "5.0", true),
    /* JADX INFO: Fake field, exist only in values array */
    VKDirect("VK Direct", "https://t.me/vkdirect", "?", false),
    /* JADX INFO: Fake field, exist only in values array */
    MP3ModAlpha("MP3Mod indev alpha", "", "", false);


    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f33524l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f33525l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f33526l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f33527l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f33528l;

    static {
        f33524l = new C14092l(enumC17281lArr);
    }

    public EnumC17281l(String str, String str2, String str3, boolean z) {
        super(str, i);
        this.f33527l = str;
        this.f33526l = str2;
        this.f33525l = str3;
        this.f33528l = z;
    }

    public static EnumC17281l valueOf(String str) {
        return (EnumC17281l) Enum.valueOf(EnumC17281l.class, str);
    }

    public static EnumC17281l[] values() {
        return (EnumC17281l[]) f33523l.clone();
    }
}

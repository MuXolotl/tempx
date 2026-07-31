package defpackage;

import java.util.HashMap;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٓؓۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC13899l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C2222l f27174l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C14751l f27175l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C10332l f27176l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C0575l f27177l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C7056l f27178l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C6876l f27179l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final /* synthetic */ EnumC13899l[] f27180l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C0335l f27181l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C9535l f27182l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C5045l f27183l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C6266l f27184l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C5377l f27185l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C3356l f27186l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C2682l f27187l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C0801l f27188l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C15377l f27189l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C5099l f27190l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final HashMap f27191l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f27192l;

    static {
        C6876l c6876l = new C6876l("OGG", 0, "ogg");
        f27179l = c6876l;
        C14751l c14751l = new C14751l("MP3", 1, "mp3");
        f27175l = c14751l;
        C5377l c5377l = new C5377l("FLAC", 2, "flac");
        f27185l = c5377l;
        C6266l c6266l = new C6266l("MP4", 3, "mp4");
        f27184l = c6266l;
        C0801l c0801l = new C0801l("M4A", 4, "m4a");
        f27188l = c0801l;
        C10332l c10332l = new C10332l("M4P", 5, "m4p");
        f27176l = c10332l;
        C0575l c0575l = new C0575l("WMA", 6, "wma");
        f27177l = c0575l;
        C2682l c2682l = new C2682l("WAV", 7, "wav");
        f27187l = c2682l;
        C9535l c9535l = new C9535l("RA", 8, "ra");
        f27182l = c9535l;
        C15377l c15377l = new C15377l("RM", 9, "rm");
        f27189l = c15377l;
        C3356l c3356l = new C3356l("M4B", 10, "m4b");
        f27186l = c3356l;
        C2222l c2222l = new C2222l("AIF", 11, "aif");
        f27174l = c2222l;
        C5099l c5099l = new C5099l("AIFF", 12, "aiff");
        f27190l = c5099l;
        C5045l c5045l = new C5045l("AIFC", 13, "aifc");
        f27183l = c5045l;
        C7056l c7056l = new C7056l("DSF", 14, "dsf");
        f27178l = c7056l;
        C0335l c0335l = new C0335l("UNKNOWN", 15, "");
        f27181l = c0335l;
        f27180l = new EnumC13899l[]{c6876l, c14751l, c5377l, c6266l, c0801l, c10332l, c0575l, c2682l, c9535l, c15377l, c3356l, c2222l, c5099l, c5045l, c7056l, c0335l};
        EnumC13899l[] enumC13899lArrValues = values();
        f27191l = new HashMap(enumC13899lArrValues.length);
        for (EnumC13899l enumC13899l : enumC13899lArrValues) {
            f27191l.put(enumC13899l.f27192l, enumC13899l);
        }
    }

    public EnumC13899l(String str, int i, String str2) {
        super(str, i);
        this.f27192l = str2.toLowerCase(Locale.ROOT);
    }

    public static EnumC13899l valueOf(String str) {
        return (EnumC13899l) Enum.valueOf(EnumC13899l.class, str);
    }

    public static EnumC13899l[] values() {
        return (EnumC13899l[]) f27180l.clone();
    }

    public abstract InterfaceC15476l yandex();
}

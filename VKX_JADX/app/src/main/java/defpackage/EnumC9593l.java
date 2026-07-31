package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٍٖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC9593l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C7573l f19541l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C7833l f19542l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C14575l f19543l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC9593l[] f19544l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C7081l f19545l;

    static {
        C14575l c14575l = new C14575l();
        f19543l = c14575l;
        C7833l c7833l = new C7833l();
        f19542l = c7833l;
        C7573l c7573l = new C7573l();
        f19541l = c7573l;
        C7081l c7081l = new C7081l();
        f19545l = c7081l;
        f19544l = new EnumC9593l[]{c14575l, c7833l, c7573l, c7081l};
    }

    public static EnumC9593l loadAd(AbstractC14318l abstractC14318l) {
        if (abstractC14318l.mo1342throw()) {
            return f19542l;
        }
        return AbstractC17860l.purchase(C13772l.f26883l.m3759l(), AbstractC16570l.billing(abstractC14318l), C5987l.subs) ? f19545l : f19541l;
    }

    public static EnumC9593l valueOf(String str) {
        return (EnumC9593l) Enum.valueOf(EnumC9593l.class, str);
    }

    public static EnumC9593l[] values() {
        return (EnumC9593l[]) f19544l.clone();
    }

    public abstract EnumC9593l yandex(AbstractC14318l abstractC14318l);
}

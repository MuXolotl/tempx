package defpackage;

import ua.itaysonlab.vkx.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v8 lؑٛۧ[], still in use, count: 1, list:
  (r11v8 lؑٛۧ[]) from 0x00fb: CONSTRUCTOR (r11v8 lؑٛۧ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:252) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: lؑٛۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0442l {
    Default("", R.string.icon_default, R.mipmap.ic_launcher, true, true),
    /* JADX INFO: Fake field, exist only in values array */
    Filled("Filled", R.string.icon_default_filled, R.mipmap.vkx_icon_filled, true, true),
    Monet("Monet", R.string.a12_monet, R.drawable.vkx_icon_monet, true, true),
    /* JADX INFO: Fake field, exist only in values array */
    McModern("McModern", R.string.icon_mc_modern, R.mipmap.vkx_icon_mc, true, true),
    /* JADX INFO: Fake field, exist only in values array */
    Blue("Blue", R.string.icon_blue, R.mipmap.vkx_icon_blue, false, true),
    /* JADX INFO: Fake field, exist only in values array */
    BlueFilled("BlueFilled", R.string.icon_blue_filled, R.mipmap.vkx_icon_filled_blue, false, true),
    /* JADX INFO: Fake field, exist only in values array */
    Emerald("Emerald", R.string.icon_emerald, R.mipmap.vkx_icon_emerald, false, true),
    /* JADX INFO: Fake field, exist only in values array */
    EmeraldFilled("EmeraldFilled", R.string.icon_emerald_filled, R.mipmap.vkx_icon_filled_emerald, false, true),
    /* JADX INFO: Fake field, exist only in values array */
    Morning("Morning", R.string.icon_morning, R.mipmap.vkx_icon_morning, false, true),
    /* JADX INFO: Fake field, exist only in values array */
    MorningFilled("MorningFilled", R.string.icon_morning_filled, R.mipmap.vkx_icon_filled_morning, false, true),
    Rc("Rc", R.string.icon_default, R.mipmap.vkx_icon_rc, false, false);


    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f1616l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f1619l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f1620l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f1621l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f1622l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f1623l;

    static {
        f1616l = new C14092l(enumC0442lArr);
    }

    public EnumC0442l(String str, int i, int i2, boolean z, boolean z2) {
        super(str, i);
        this.f1621l = str;
        this.f1620l = i;
        this.f1619l = i2;
        this.f1623l = z;
        this.f1622l = z2;
    }

    public static EnumC0442l valueOf(String str) {
        return (EnumC0442l) Enum.valueOf(EnumC0442l.class, str);
    }

    public static EnumC0442l[] values() {
        return (EnumC0442l[]) f1617l.clone();
    }
}

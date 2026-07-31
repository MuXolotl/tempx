package ua.itaysonlab.vkapi2.objects.music.catalog;

import defpackage.C14092l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 ua.itaysonlab.vkapi2.objects.music.catalog.loadAd[], still in use, count: 1, list:
  (r2v3 ua.itaysonlab.vkapi2.objects.music.catalog.loadAd[]) from 0x0021: CONSTRUCTOR (r2v3 ua.itaysonlab.vkapi2.objects.music.catalog.loadAd[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:34) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class loadAd {
    Default("default"),
    /* JADX INFO: Fake field, exist only in values array */
    Gradient("gradient");


    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f36613l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f36614l;

    static {
        f36613l = new C14092l(loadadArr);
    }

    public loadAd(String str) {
        super(str, i);
        this.f36614l = str;
    }

    public static loadAd valueOf(String str) {
        return (loadAd) Enum.valueOf(loadAd.class, str);
    }

    public static loadAd[] values() {
        return (loadAd[]) f36611l.clone();
    }
}

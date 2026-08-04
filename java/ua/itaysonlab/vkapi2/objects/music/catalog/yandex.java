package ua.itaysonlab.vkapi2.objects.music.catalog;

import defpackage.C14092l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 ua.itaysonlab.vkapi2.objects.music.catalog.yandex[], still in use, count: 1, list:
  (r2v3 ua.itaysonlab.vkapi2.objects.music.catalog.yandex[]) from 0x0021: CONSTRUCTOR (r2v3 ua.itaysonlab.vkapi2.objects.music.catalog.yandex[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:34) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class yandex {
    /* JADX INFO: Fake field, exist only in values array */
    Linear("linear"),
    Solid("solid");


    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C14092l f36617l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f36618l;

    static {
        f36617l = new C14092l(yandexVarArr);
    }

    public yandex(String str) {
        super(str, i);
        this.f36618l = str;
    }

    public static yandex valueOf(String str) {
        return (yandex) Enum.valueOf(yandex.class, str);
    }

    public static yandex[] values() {
        return (yandex[]) f36615l.clone();
    }
}

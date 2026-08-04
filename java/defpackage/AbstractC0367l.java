package defpackage;

/* JADX INFO: renamed from: lؑٗۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0367l {
    public static final boolean crashlytics;
    public static final boolean loadAd;
    public static final boolean yandex;

    static {
        Object c18435l;
        Object c18435l2;
        Object c18435l3;
        try {
            c18435l = System.getProperty("kotlin.reflect.jvm.useK1Implementation");
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        if (c18435l instanceof C18435l) {
            c18435l = null;
        }
        String str = (String) c18435l;
        boolean z = false;
        yandex = str != null && Boolean.parseBoolean(str);
        try {
            c18435l2 = System.getProperty("kotlin.reflect.jvm.newFakeOverridesImplementation");
        } catch (Throwable th2) {
            c18435l2 = new C18435l(th2);
        }
        if (c18435l2 instanceof C18435l) {
            c18435l2 = null;
        }
        String str2 = (String) c18435l2;
        loadAd = str2 != null && Boolean.parseBoolean(str2);
        try {
            c18435l3 = System.getProperty("kotlin.reflect.jvm.loadMetadataDirectly");
        } catch (Throwable th3) {
            c18435l3 = new C18435l(th3);
        }
        String str3 = (String) (c18435l3 instanceof C18435l ? null : c18435l3);
        if (str3 != null && Boolean.parseBoolean(str3)) {
            z = true;
        }
        crashlytics = z;
    }
}

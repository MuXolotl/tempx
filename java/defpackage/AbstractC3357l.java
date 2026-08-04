package defpackage;

/* JADX INFO: renamed from: lّؕ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3357l {
    public static final InterfaceC8680l yandex;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [lؔۢؒ] */
    /* JADX WARN: Type inference failed for: r0v7, types: [lؘُّ] */
    /* JADX WARN: Type inference failed for: r0v8, types: [lٌٍۣ] */
    /* JADX WARN: Type inference failed for: r0v9, types: [lؘُّ] */
    static {
        String property;
        ?? r0;
        int i = AbstractC8177l.yandex;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C16552l c16552l = AbstractC11463l.yandex;
            r0 = AbstractC17278l.yandex;
            C2975l c2975l = r0.f6462l;
            if (!(r0 != 0)) {
                r0 = RunnableC12527l.f24681l;
            }
        } else {
            r0 = RunnableC12527l.f24681l;
        }
        yandex = r0;
    }
}

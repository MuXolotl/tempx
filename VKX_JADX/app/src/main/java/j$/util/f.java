package j$.util;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends RuntimeException {
    public static void a(Object obj, String str) {
        throw new f("Unsupported " + str + " :" + obj);
    }
}

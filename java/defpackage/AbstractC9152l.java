package defpackage;

/* JADX INFO: renamed from: lٌۣۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9152l {
    public static final int yandex;

    static {
        Object c18435l;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            c18435l = property != null ? AbstractC16648l.signatures(property) : null;
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        Integer num = (Integer) (c18435l instanceof C18435l ? null : c18435l);
        yandex = num != null ? num.intValue() : 2097152;
    }
}

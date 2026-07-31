package defpackage;

/* JADX INFO: renamed from: lًۜؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8274l {
    public static final InterfaceC7987l yandex;

    static {
        String property = System.getProperty("ktor.internal.cio.disable.chararray.pooling");
        yandex = property != null ? Boolean.parseBoolean(property) : false ? new C9131l() : new C17520l(4096, 1);
    }
}

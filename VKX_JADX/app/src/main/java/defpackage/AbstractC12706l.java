package defpackage;

/* JADX INFO: renamed from: lّٛۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12706l {
    public static final ThreadLocal yandex = new ThreadLocal();

    public static AbstractC14868l yandex() {
        ThreadLocal threadLocal = yandex;
        AbstractC14868l abstractC14868l = (AbstractC14868l) threadLocal.get();
        if (abstractC14868l != null) {
            return abstractC14868l;
        }
        C14101l c14101l = new C14101l(Thread.currentThread());
        threadLocal.set(c14101l);
        return c14101l;
    }
}

package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: lؔٗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2668l extends AbstractC16670l {
    public static final long admob;
    public static final Unsafe amazon;
    public static final long billing;
    public static final long mopub;
    public static final long purchase;
    public static final long subs;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                C18073l.Signature("Could not initialize intrinsics", e.getCause());
                return;
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new C11357l());
        }
        try {
            billing = unsafe.objectFieldOffset(AbstractC2722l.class.getDeclaredField("lؓٝؕ"));
            purchase = unsafe.objectFieldOffset(AbstractC2722l.class.getDeclaredField("lؗۤؑ"));
            mopub = unsafe.objectFieldOffset(AbstractC2722l.class.getDeclaredField("lٌؘؒ"));
            admob = unsafe.objectFieldOffset(C12054l.class.getDeclaredField("yandex"));
            subs = unsafe.objectFieldOffset(C12054l.class.getDeclaredField("loadAd"));
            amazon = unsafe;
        } catch (NoSuchFieldException e2) {
            C11467l.metrica(e2);
        }
    }

    @Override // defpackage.AbstractC16670l
    public final C12054l admob(AbstractC2722l abstractC2722l) {
        C12054l c12054l;
        C12054l c12054l2 = C12054l.crashlytics;
        do {
            c12054l = abstractC2722l.f5917l;
            if (c12054l2 == c12054l) {
                break;
            }
        } while (!amazon(abstractC2722l, c12054l, c12054l2));
        return c12054l;
    }

    @Override // defpackage.AbstractC16670l
    public final boolean amazon(AbstractC2722l abstractC2722l, C12054l c12054l, C12054l c12054l2) {
        return AbstractC4818l.yandex(amazon, abstractC2722l, billing, c12054l, c12054l2);
    }

    @Override // defpackage.AbstractC16670l
    public final boolean crashlytics(AbstractC2722l abstractC2722l, Object obj, Object obj2) {
        return AbstractC18445l.yandex(amazon, abstractC2722l, mopub, obj, obj2);
    }

    @Override // defpackage.AbstractC16670l
    public final boolean loadAd(AbstractC2722l abstractC2722l, C0181l c0181l, C0181l c0181l2) {
        return AbstractC8387l.yandex(amazon, abstractC2722l, purchase, c0181l, c0181l2);
    }

    @Override // defpackage.AbstractC16670l
    public final C0181l mopub(AbstractC2722l abstractC2722l) {
        C0181l c0181l;
        C0181l c0181l2 = C0181l.amazon;
        do {
            c0181l = abstractC2722l.f5918l;
            if (c0181l2 == c0181l) {
                break;
            }
        } while (!loadAd(abstractC2722l, c0181l, c0181l2));
        return c0181l;
    }

    @Override // defpackage.AbstractC16670l
    public final void remoteconfig(C12054l c12054l, C12054l c12054l2) {
        amazon.putObject(c12054l, subs, c12054l2);
    }

    @Override // defpackage.AbstractC16670l
    public final void vip(C12054l c12054l, Thread thread) {
        amazon.putObject(c12054l, admob, thread);
    }
}

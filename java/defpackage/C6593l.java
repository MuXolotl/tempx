package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: lَؙٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6593l extends AbstractC17549l {
    public static final long admob;
    public static final long firebase;
    public static final long isPro;
    public static final Unsafe mopub;
    public static final long smaato;
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
            unsafe = (Unsafe) AccessController.doPrivileged(C13917l.yandex);
        }
        try {
            subs = unsafe.objectFieldOffset(AbstractC13813l.class.getDeclaredField("lؓٝؕ"));
            admob = unsafe.objectFieldOffset(AbstractC13813l.class.getDeclaredField("lؗۤؑ"));
            isPro = unsafe.objectFieldOffset(AbstractC13813l.class.getDeclaredField("lٌؘؒ"));
            firebase = unsafe.objectFieldOffset(C14714l.class.getDeclaredField("yandex"));
            smaato = unsafe.objectFieldOffset(C14714l.class.getDeclaredField("loadAd"));
            mopub = unsafe;
        } catch (NoSuchFieldException e2) {
            C11467l.metrica(e2);
        }
    }

    @Override // defpackage.AbstractC17549l
    public final boolean firebase(AbstractC13813l abstractC13813l, C14714l c14714l, C14714l c14714l2) {
        return AbstractC13747l.yandex(mopub, abstractC13813l, subs, c14714l, c14714l2);
    }

    @Override // defpackage.AbstractC17549l
    public final void isPro(C14714l c14714l, C14714l c14714l2) {
        mopub.putObject(c14714l, smaato, c14714l2);
    }

    @Override // defpackage.AbstractC17549l
    public final boolean metrica(AbstractC13813l abstractC13813l, Object obj, Object obj2) {
        return AbstractC8686l.yandex(mopub, abstractC13813l, isPro, obj, obj2);
    }

    @Override // defpackage.AbstractC17549l
    public final C14714l remoteconfig(AbstractC1207l abstractC1207l) {
        C14714l c14714l;
        C14714l c14714l2 = C14714l.crashlytics;
        do {
            c14714l = abstractC1207l.f26942l;
            if (c14714l2 == c14714l) {
                break;
            }
        } while (!firebase(abstractC1207l, c14714l, c14714l2));
        return c14714l;
    }

    @Override // defpackage.AbstractC17549l
    public final boolean smaato(AbstractC13813l abstractC13813l, C14266l c14266l, C14266l c14266l2) {
        return AbstractC7408l.yandex(mopub, abstractC13813l, admob, c14266l, c14266l2);
    }

    @Override // defpackage.AbstractC17549l
    public final void subs(C14714l c14714l, Thread thread) {
        mopub.putObject(c14714l, firebase, thread);
    }

    @Override // defpackage.AbstractC17549l
    public final C14266l vip(AbstractC1207l abstractC1207l) {
        C14266l c14266l;
        C14266l c14266l2 = C14266l.amazon;
        do {
            c14266l = abstractC1207l.f26943l;
            if (c14266l2 == c14266l) {
                break;
            }
        } while (!smaato(abstractC1207l, c14266l, c14266l2));
        return c14266l;
    }
}

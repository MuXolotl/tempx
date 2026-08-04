package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lّٜۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12790l extends AbstractC8760l {
    private static final C12790l DEFAULT_INSTANCE;
    private static volatile InterfaceC1265l PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0400l strings_ = C10268l.f20901l;

    static {
        C12790l c12790l = new C12790l();
        DEFAULT_INSTANCE = c12790l;
        AbstractC8760l.isPro(C12790l.class, c12790l);
    }

    public static void remoteconfig(C12790l c12790l, Iterable iterable) {
        InterfaceC0400l interfaceC0400l = c12790l.strings_;
        if (!((C10268l) interfaceC0400l).f20905l) {
            C10268l c10268l = (C10268l) interfaceC0400l;
            c12790l.strings_ = c10268l.mopub(c10268l.f20903l * 2);
        }
        RandomAccess randomAccess = c12790l.strings_;
        Charset charset = AbstractC4579l.yandex;
        if (iterable instanceof InterfaceC16633l) {
            List listCrashlytics = ((InterfaceC16633l) iterable).crashlytics();
            if (randomAccess != null) {
                C18725l.loadAd();
                return;
            }
            ((C10268l) randomAccess).getClass();
            Iterator it = listCrashlytics.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof C4966l) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                C4966l.mopub(0, bArr.length, bArr);
                throw null;
            }
            return;
        }
        if (iterable instanceof InterfaceC14547l) {
            ((C10268l) randomAccess).addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (randomAccess instanceof ArrayList) {
                ((ArrayList) randomAccess).ensureCapacity(((C10268l) randomAccess).f20903l + size);
            } else if (randomAccess instanceof C10268l) {
                C10268l c10268l2 = (C10268l) randomAccess;
                int i = c10268l2.f20903l + size;
                Object[] objArr = c10268l2.f20904l;
                if (i > objArr.length) {
                    if (objArr.length == 0) {
                        c10268l2.f20904l = new Object[Math.max(i, 10)];
                    } else {
                        int length = objArr.length;
                        while (length < i) {
                            length = AbstractC15560l.vip(length, 3, 2, 1, 10);
                        }
                        c10268l2.f20904l = Arrays.copyOf(c10268l2.f20904l, length);
                    }
                }
            }
        }
        C10268l c10268l3 = (C10268l) randomAccess;
        int i2 = c10268l3.f20903l;
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    AbstractC17315l.amazon(i2, c10268l3);
                    throw null;
                }
                c10268l3.add(obj);
            }
            return;
        }
        List list = (List) iterable;
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Object obj2 = list.get(i3);
            if (obj2 == null) {
                AbstractC17315l.amazon(i2, c10268l3);
                throw null;
            }
            c10268l3.add(obj2);
        }
    }

    public static C8067l startapp() {
        return (C8067l) ((AbstractC17315l) DEFAULT_INSTANCE.loadAd(5));
    }

    public static C12790l vip() {
        return DEFAULT_INSTANCE;
    }

    @Override // defpackage.AbstractC8760l
    public final Object loadAd(int i) {
        InterfaceC1265l c10511l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C13673l(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
        }
        if (iInmobi == 3) {
            return new C12790l();
        }
        if (iInmobi == 4) {
            return new C8067l(DEFAULT_INSTANCE);
        }
        if (iInmobi == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iInmobi != 6) {
            throw null;
        }
        InterfaceC1265l interfaceC1265l = PARSER;
        if (interfaceC1265l != null) {
            return interfaceC1265l;
        }
        synchronized (C12790l.class) {
            try {
                c10511l = PARSER;
                if (c10511l == null) {
                    c10511l = new C10511l();
                    PARSER = c10511l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c10511l;
    }

    public final InterfaceC0400l metrica() {
        return this.strings_;
    }
}

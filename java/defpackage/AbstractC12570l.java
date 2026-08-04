package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lؙّْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12570l {
    protected transient int zza;

    public static void amazon(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof InterfaceC10454l) {
            List listZza = ((InterfaceC10454l) iterable).zza();
            if (list != null) {
                C18725l.loadAd();
                return;
            }
            list.size();
            Iterator it = listZza.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof AbstractC15619l) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                AbstractC15619l.vip(0, bArr.length, bArr);
                throw null;
            }
            return;
        }
        if (iterable instanceof InterfaceC9073l) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof C8624l) {
                C8624l c8624l = (C8624l) list;
                int i = c8624l.f17773l + size;
                int length = c8624l.f17774l.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = AbstractC15560l.vip(length, 3, 2, 1, 10);
                        }
                        c8624l.f17774l = Arrays.copyOf(c8624l.f17774l, length);
                    } else {
                        c8624l.f17774l = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    AbstractC10050l.yandex(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj2 = list2.get(i2);
            if (obj2 == null) {
                AbstractC10050l.yandex(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public abstract int crashlytics(InterfaceC12940l interfaceC12940l);

    public final void loadAd(OutputStream outputStream) {
        AbstractC0288l abstractC0288l = (AbstractC0288l) this;
        int iRemoteconfig = abstractC0288l.remoteconfig();
        boolean z = AbstractC10908l.loadAd;
        if (iRemoteconfig > 4096) {
            iRemoteconfig = 4096;
        }
        C16596l c16596l = new C16596l(outputStream, iRemoteconfig);
        abstractC0288l.billing(c16596l);
        if (c16596l.purchase > 0) {
            c16596l.premium();
        }
    }

    public final byte[] yandex() {
        try {
            AbstractC0288l abstractC0288l = (AbstractC0288l) this;
            int iRemoteconfig = abstractC0288l.remoteconfig();
            byte[] bArr = new byte[iRemoteconfig];
            boolean z = AbstractC10908l.loadAd;
            C8716l c8716l = new C8716l(bArr, iRemoteconfig);
            abstractC0288l.billing(c8716l);
            if (c8716l.ad() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (c8716l.ad() >= 0) {
                return bArr;
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            C18073l.Signature(AbstractC9361l.ad(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }
}

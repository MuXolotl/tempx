package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lؙۧ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6909l {
    protected int zza;

    public static void loadAd(ArrayList arrayList, List list) {
        Charset charset = AbstractC11966l.yandex;
        int size = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size);
        } else if (list instanceof C4650l) {
            C4650l c4650l = (C4650l) list;
            int i = c4650l.f9470l + size;
            int length = c4650l.f9471l.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = AbstractC15560l.vip(length, 3, 2, 1, 10);
                    }
                    c4650l.f9471l = Arrays.copyOf(c4650l.f9471l, length);
                } else {
                    c4650l.f9471l = new Object[Math.max(i, 10)];
                }
            }
        }
        int size2 = list.size();
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                int size4 = list.size() - size2;
                StringBuilder sb = new StringBuilder(String.valueOf(size4).length() + 26);
                sb.append("Element at index ");
                sb.append(size4);
                sb.append(" is null.");
                String string = sb.toString();
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size2) {
                        C6541l.subs(string);
                        return;
                    }
                    list.remove(size5);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public abstract int yandex(InterfaceC0101l interfaceC0101l);
}

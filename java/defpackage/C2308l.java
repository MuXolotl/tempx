package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: lٜؔؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2308l {
    public static final C0346l loadAd = C0346l.yandex(new byte[0]);
    public final HashMap yandex;

    public C2308l(HashMap map) {
        this.yandex = map;
    }

    public final Iterable yandex(byte[] bArr) {
        List list;
        C0346l c0346l = loadAd;
        HashMap map = this.yandex;
        List list2 = (List) map.get(c0346l);
        if (bArr.length >= 5) {
            list = (List) map.get(new C0346l(bArr, 5 > bArr.length ? bArr.length : 5));
        } else {
            list = null;
        }
        if (list2 == null && list == null) {
            return new ArrayList();
        }
        if (list2 == null) {
            return list;
        }
        return list == null ? list2 : new C16359l(list, list2);
    }
}

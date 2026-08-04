package defpackage;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: lٌُٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10919l implements InterfaceC3588l {
    public final C0012l loadAd;
    public final C8107l yandex;

    public C10919l(C8107l c8107l, C0012l c0012l) {
        this.yandex = c8107l;
        this.loadAd = c0012l;
    }

    public final C12823l crashlytics(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            C8400l c8400l = (C8400l) this.loadAd.f865l.get(i);
            String str = (String) this.yandex.f16895l.get(c8400l.f17368l);
            int iOrdinal = c8400l.f17367l.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(str);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(str);
            } else {
                if (iOrdinal != 2) {
                    C18725l.billing();
                    return null;
                }
                linkedList2.addFirst(str);
                z = true;
            }
            i = c8400l.f17363l;
        }
        return new C12823l(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // defpackage.InterfaceC3588l
    public final String getString(int i) {
        return (String) this.yandex.f16895l.get(i);
    }

    @Override // defpackage.InterfaceC3588l
    public final boolean loadAd(int i) {
        return ((Boolean) crashlytics(i).f25198l).booleanValue();
    }

    @Override // defpackage.InterfaceC3588l
    public final String yandex(int i) throws IOException {
        C12823l c12823lCrashlytics = crashlytics(i);
        List list = (List) c12823lCrashlytics.f25200l;
        String strM4210case = AbstractC16901l.m4210case((List) c12823lCrashlytics.f25199l, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strM4210case;
        }
        return AbstractC16901l.m4210case(list, "/", null, null, null, 62) + '/' + strM4210case;
    }
}

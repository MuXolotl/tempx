package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lؚٜؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2466l extends C11421l {
    public final /* synthetic */ int billing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2466l(String str, Class cls, boolean z, boolean z2, int i) {
        super(str, cls, z, z2);
        this.billing = i;
    }

    @Override // defpackage.C11421l
    public void loadAd(Object obj, C16979l c16979l) {
        switch (this.billing) {
            case 1:
                C13059l c13059l = (C13059l) obj;
                if (c13059l != null) {
                    C4187l c4187l = c13059l.yandex.f34587l;
                    c4187l.getClass();
                    int i = 0;
                    while (true) {
                        if (!(i < c4187l.billing() - c4187l.amazon())) {
                            break;
                        } else if (i >= c4187l.billing() - c4187l.amazon()) {
                            C4875l.firebase();
                            break;
                        } else {
                            C17762l c17762l = c4187l.f8602l;
                            int iAmazon = c4187l.amazon() + i;
                            i++;
                            Map.Entry entry = (Map.Entry) c17762l.f34589l[iAmazon];
                            if (((Set) entry.getValue()).isEmpty()) {
                                c16979l.yandex(null, (String) entry.getKey());
                            } else {
                                Iterator it = ((Set) entry.getValue()).iterator();
                                while (it.hasNext()) {
                                    c16979l.yandex(it.next(), (String) entry.getKey());
                                }
                            }
                        }
                    }
                }
                break;
            default:
                super.loadAd(obj, c16979l);
                break;
        }
    }

    @Override // defpackage.C11421l
    public void yandex(Iterator it, C16979l c16979l) {
        switch (this.billing) {
            case 0:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean zHasNext = it.hasNext();
                    String str = this.yandex;
                    if (!zHasNext) {
                        c16979l.yandex(next, str);
                    } else {
                        StringBuilder sb = new StringBuilder("[");
                        sb.append(next);
                        do {
                            sb.append(',');
                            sb.append(it.next());
                        } while (it.hasNext());
                        sb.append(']');
                        c16979l.yandex(sb.toString(), str);
                    }
                }
                break;
            default:
                super.yandex(it, c16979l);
                break;
        }
    }
}

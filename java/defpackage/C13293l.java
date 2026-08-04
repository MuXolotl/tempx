package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lُْۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13293l extends AbstractC0576l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ int f26090l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13293l(C12376l c12376l, Iterator it, int i) {
        super(c12376l, it);
        this.f26090l = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f26090l) {
            case 0:
                yandex();
                if (((Map.Entry) this.f1974l) != null) {
                    return new C3162l(this);
                }
                C18073l.admob();
                return null;
            case 1:
                Map.Entry entry = (Map.Entry) this.f1976l;
                if (entry != null) {
                    yandex();
                    return entry.getKey();
                }
                C18073l.admob();
                return null;
            default:
                Map.Entry entry2 = (Map.Entry) this.f1976l;
                if (entry2 != null) {
                    yandex();
                    return entry2.getValue();
                }
                C18073l.admob();
                return null;
        }
    }
}

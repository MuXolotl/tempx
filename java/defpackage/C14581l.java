package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lٓۨٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14581l implements InterfaceC7658l {
    public List yandex;

    public final String toString() {
        return "not(" + this.yandex + ")";
    }

    @Override // defpackage.InterfaceC7658l
    public final boolean yandex(AbstractC12707l abstractC12707l) {
        Iterator it = this.yandex.iterator();
        while (it.hasNext()) {
            if (appmetrica.m153for((C2291l) it.next(), abstractC12707l)) {
                return false;
            }
        }
        return true;
    }
}

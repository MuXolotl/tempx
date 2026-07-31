package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lُؓۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2291l {
    public ArrayList yandex = null;
    public int loadAd = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.yandex.iterator();
        while (it.hasNext()) {
            sb.append((C12799l) it.next());
            sb.append(' ');
        }
        sb.append('[');
        return AbstractC0653l.adcel(sb, this.loadAd, ']');
    }

    public final void yandex() {
        this.loadAd += 1000;
    }
}

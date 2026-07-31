package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lؖؗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3927l {
    public ArrayList loadAd;
    public final /* synthetic */ int yandex;

    public C3927l(int i) {
        this.yandex = i;
        switch (i) {
            case 1:
                this.loadAd = new ArrayList(1);
                break;
            default:
                this.loadAd = null;
                break;
        }
    }

    public void loadAd(C3927l c3927l) {
        if (c3927l.loadAd == null) {
            return;
        }
        if (this.loadAd == null) {
            this.loadAd = new ArrayList(c3927l.loadAd.size());
        }
        Iterator it = c3927l.loadAd.iterator();
        while (it.hasNext()) {
            yandex((C0398l) it.next());
        }
    }

    public String toString() {
        switch (this.yandex) {
            case 0:
                if (this.loadAd == null) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = this.loadAd.iterator();
                while (it.hasNext()) {
                    sb.append(((C0398l) it.next()).toString());
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void yandex(C0398l c0398l) {
        if (this.loadAd == null) {
            this.loadAd = new ArrayList();
        }
        int i = 0;
        while (true) {
            int size = this.loadAd.size();
            ArrayList arrayList = this.loadAd;
            if (i >= size) {
                arrayList.add(c0398l);
                return;
            } else {
                if (((C0398l) arrayList.get(i)).yandex.loadAd > c0398l.yandex.loadAd) {
                    this.loadAd.add(i, c0398l);
                    return;
                }
                i++;
            }
        }
    }
}

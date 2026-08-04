package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lُؚٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7375l {
    public final ArrayList loadAd;
    public int yandex;

    public C7375l(int i, ArrayList arrayList) {
        switch (i) {
            case 3:
                this.loadAd = arrayList;
                break;
            default:
                int size = arrayList.size();
                this.yandex = size;
                int i2 = size * size;
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    arrayList2.add(EnumC10718l.f21714l);
                }
                this.loadAd = arrayList2;
                this.loadAd = new ArrayList(AbstractC14055l.isPro(arrayList));
                break;
        }
    }

    public synchronized List crashlytics() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.loadAd));
    }

    public EnumC10718l loadAd(int i, int i2) {
        Integer numValueOf;
        int i3 = this.yandex;
        if (i < 0 || i >= i3) {
            numValueOf = Integer.valueOf(i);
        } else {
            numValueOf = (i2 < 0 || i2 >= i3) ? Integer.valueOf(i2) : null;
        }
        if (numValueOf == null) {
            return (EnumC10718l) this.loadAd.get((i2 * i3) + i);
        }
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(numValueOf);
        sb.append(" is out of 0..");
        sb.append(i3 - 1);
        sb.append(" matrix bound");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public void yandex(Type type, C10226l c10226l) {
        ArrayList arrayList = C12952l.purchase;
        if (type == null) {
            C8339l.metrica("type == null");
            return;
        }
        C14861l c14861l = new C14861l(type, c10226l);
        int i = this.yandex;
        this.yandex = i + 1;
        this.loadAd.add(i, c14861l);
    }

    public C7375l(int i) {
        switch (i) {
            case 2:
                this.loadAd = new ArrayList();
                this.yandex = 128;
                break;
            default:
                this.loadAd = new ArrayList();
                this.yandex = 0;
                break;
        }
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lٟؒۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C1407l implements InterfaceC2373l {
    public static final C11472l Companion = new C11472l();
    public final String crashlytics;
    public final String loadAd;
    public final C2391l yandex;

    public C1407l(int i, C2391l c2391l, String str, String str2) {
        if (1 != (i & 1)) {
            AbstractC11036l.isPro(i, 1, C13287l.yandex.purchase());
            throw null;
        }
        this.yandex = c2391l;
        this.loadAd = (i & 2) == 0 ? String.valueOf(c2391l.firebase) : str;
        if ((i & 4) != 0) {
            this.crashlytics = str2;
        } else {
            String str3 = c2391l.tapsense;
            this.crashlytics = str3 == null ? "" : str3;
        }
    }

    @Override // defpackage.InterfaceC17817l
    public final boolean billing() {
        return false;
    }

    @Override // defpackage.InterfaceC17817l
    public final String crashlytics() {
        return this.crashlytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1407l) && AbstractC8576l.yandex(this.yandex, ((C1407l) obj).yandex);
    }

    @Override // defpackage.InterfaceC17817l
    public final String getId() {
        return this.loadAd;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    @Override // defpackage.InterfaceC17817l
    public final String mopub() {
        return null;
    }

    public final String toString() {
        return "AudioBook(audioBook=" + this.yandex + ')';
    }

    @Override // defpackage.InterfaceC2373l
    public final Object yandex(InterfaceC14029l interfaceC14029l) {
        C2391l c2391l = this.yandex;
        List list = c2391l.amazon;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C3414l(c2391l, (C6393l) it.next()));
        }
        return arrayList;
    }

    public C1407l(C2391l c2391l) {
        this.yandex = c2391l;
        this.loadAd = String.valueOf(c2391l.firebase);
        String str = c2391l.tapsense;
        this.crashlytics = str == null ? "" : str;
    }
}

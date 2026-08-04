package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lِٜٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C11979l<T> {
    public static final C14522l Companion = new C14522l();
    public final List loadAd;
    public final Integer yandex;

    static {
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.RootItemsResponseDto", null, 2);
        c13637l.smaato("count", true);
        c13637l.smaato("items", true);
    }

    public /* synthetic */ C11979l(int i, Integer num, List list) {
        this.yandex = (i & 1) == 0 ? null : num;
        if ((i & 2) == 0) {
            this.loadAd = C2580l.f5619l;
        } else {
            this.loadAd = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11979l)) {
            return false;
        }
        C11979l c11979l = (C11979l) obj;
        return AbstractC8576l.yandex(this.yandex, c11979l.yandex) && AbstractC8576l.yandex(this.loadAd, c11979l.loadAd);
    }

    public final int hashCode() {
        Integer num = this.yandex;
        return this.loadAd.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RootItemsResponseDto(count=");
        sb.append(this.yandex);
        sb.append(", items=");
        return AbstractC0653l.subscription(sb, this.loadAd, ')');
    }

    public C11979l() {
        this.yandex = null;
        this.loadAd = C2580l.f5619l;
    }
}

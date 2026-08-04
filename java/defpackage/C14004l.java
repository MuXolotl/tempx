package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lؚٜٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C14004l implements InterfaceC8393l, InterfaceC2373l, InterfaceC3136l {
    public static final C12270l Companion = new C12270l();
    public static final InterfaceC1220l[] amazon = {AbstractC9968l.crashlytics(2, new C8810l(24)), null, null};
    public final String crashlytics;
    public final String loadAd;
    public final List yandex;

    public /* synthetic */ C14004l(int i, String str, String str2, List list) {
        if (1 != (i & 1)) {
            AbstractC11036l.isPro(i, 1, C18592l.yandex.purchase());
            throw null;
        }
        this.yandex = list;
        this.loadAd = (i & 2) == 0 ? "" : str;
        if ((i & 4) != 0) {
            this.crashlytics = str2;
            return;
        }
        this.crashlytics = "vk_" + list.hashCode();
    }

    @Override // defpackage.InterfaceC17817l
    public final boolean billing() {
        return false;
    }

    @Override // defpackage.InterfaceC17817l
    public final String crashlytics() {
        return this.loadAd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14004l)) {
            return false;
        }
        C14004l c14004l = (C14004l) obj;
        return AbstractC8576l.yandex(this.yandex, c14004l.yandex) && AbstractC8576l.yandex(this.loadAd, c14004l.loadAd);
    }

    @Override // defpackage.InterfaceC17817l
    public final String getId() {
        return this.crashlytics;
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC17817l
    public final String mopub() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackIds(ids=");
        sb.append(this.yandex);
        sb.append(", displayName=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }

    @Override // defpackage.InterfaceC2373l
    public final Object yandex(InterfaceC14029l interfaceC14029l) {
        String[] strArr = (String[]) this.yandex.toArray(new String[0]);
        return AbstractC8189l.admob(new C16534l((String[]) Arrays.copyOf(strArr, strArr.length)), interfaceC14029l);
    }

    public C14004l(List list, String str) {
        this.yandex = list;
        this.loadAd = str;
        this.crashlytics = "vk_" + list.hashCode();
    }

    public /* synthetic */ C14004l(ArrayList arrayList) {
        this(arrayList, "");
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lٓۖٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14337l {
    public final List amazon;
    public final List crashlytics;
    public final boolean loadAd;
    public final String yandex;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public C14337l(String str, boolean z, List list, List list2) {
        this.yandex = str;
        this.loadAd = z;
        this.crashlytics = list;
        this.amazon = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.amazon = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14337l) {
            C14337l c14337l = (C14337l) obj;
            String str = c14337l.yandex;
            if (this.loadAd == c14337l.loadAd && this.crashlytics.equals(c14337l.crashlytics) && AbstractC8576l.yandex(this.amazon, c14337l.amazon)) {
                String str2 = this.yandex;
                return AbstractC16648l.isVip(str2, "index_", false) ? AbstractC16648l.isVip(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.yandex;
        return this.amazon.hashCode() + AbstractC14814l.admob((((AbstractC16648l.isVip(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.loadAd ? 1 : 0)) * 31, 31, this.crashlytics);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.yandex);
        sb.append("',\n            |   unique = '");
        sb.append(this.loadAd);
        sb.append("',\n            |   columns = {");
        AbstractC1833l.subs(AbstractC16901l.m4210case(this.crashlytics, ",", null, null, null, 62), "    ");
        AbstractC1833l.subs("},", "    ");
        Unit unit = Unit.INSTANCE;
        sb.append(unit);
        sb.append("\n            |   orders = {");
        AbstractC1833l.subs(AbstractC16901l.m4210case(this.amazon, ",", null, null, null, 62), "    ");
        AbstractC1833l.subs(" }", "    ");
        sb.append(unit);
        sb.append("\n            |}\n        ");
        return AbstractC1833l.subs(AbstractC1833l.smaato(sb.toString()), "    ");
    }
}

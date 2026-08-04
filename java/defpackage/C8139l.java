package defpackage;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lًٝؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8139l {
    public final Set amazon;
    public final Set crashlytics;
    public final Map loadAd;
    public final String yandex;

    public C8139l(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        this.yandex = str;
        this.loadAd = map;
        this.crashlytics = abstractSet;
        this.amazon = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8139l)) {
            return false;
        }
        C8139l c8139l = (C8139l) obj;
        if (!this.yandex.equals(c8139l.yandex) || !AbstractC8576l.yandex(this.loadAd, c8139l.loadAd) || !AbstractC8576l.yandex(this.crashlytics, c8139l.crashlytics)) {
            return false;
        }
        Set set2 = this.amazon;
        if (set2 == null || (set = c8139l.amazon) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.yandex);
        sb.append("',\n            |    columns = {");
        sb.append(AbstractC0124l.subs(AbstractC16901l.m4243this(this.loadAd.values(), new C15696l(22))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(AbstractC0124l.subs(this.crashlytics));
        sb.append("\n            |    indices = {");
        Set set = this.amazon;
        sb.append(AbstractC0124l.subs(set != null ? AbstractC16901l.m4243this(set, new C15696l(23)) : C2580l.f5619l));
        sb.append("\n            |}\n        ");
        return AbstractC1833l.smaato(sb.toString());
    }
}

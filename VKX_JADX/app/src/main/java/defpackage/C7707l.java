package defpackage;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lًؑؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7707l {
    public final List amazon;
    public final String crashlytics;
    public final String loadAd;
    public final List purchase;
    public final String yandex;

    public C7707l(String str, String str2, String str3, List list, List list2) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = list;
        this.purchase = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7707l)) {
            return false;
        }
        C7707l c7707l = (C7707l) obj;
        if (AbstractC8576l.yandex(this.yandex, c7707l.yandex) && AbstractC8576l.yandex(this.loadAd, c7707l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c7707l.crashlytics) && this.amazon.equals(c7707l.amazon)) {
            return this.purchase.equals(c7707l.purchase);
        }
        return false;
    }

    public final int hashCode() {
        return this.purchase.hashCode() + AbstractC14814l.admob(AbstractC12589l.advert(AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd), 31, this.crashlytics), 31, this.amazon);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.yandex);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.loadAd);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.crashlytics);
        sb.append("',\n            |   columnNames = {");
        AbstractC1833l.subs(AbstractC16901l.m4210case(AbstractC16901l.m4219finally(this.amazon), ",", null, null, null, 62), "    ");
        AbstractC1833l.subs("},", "    ");
        Unit unit = Unit.INSTANCE;
        sb.append(unit);
        sb.append("\n            |   referenceColumnNames = {");
        AbstractC1833l.subs(AbstractC16901l.m4210case(AbstractC16901l.m4219finally(this.purchase), ",", null, null, null, 62), "    ");
        AbstractC1833l.subs(" }", "    ");
        sb.append(unit);
        sb.append("\n            |}\n        ");
        return AbstractC1833l.subs(AbstractC1833l.smaato(sb.toString()), "    ");
    }
}
